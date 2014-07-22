package org.nasdanika.amur.it.js.gen;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.SimpleBindings;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nasdanika.amur.it.js.exec.DependencyInfo;
import org.nasdanika.amur.it.js.exec.DependencyRole;
import org.nasdanika.amur.it.js.exec.ExecFactory;
import org.nasdanika.amur.it.js.exec.Hash;
import org.nasdanika.amur.it.js.renderers.FactoryRenderer;

import com.google.javascript.jscomp.CompilationLevel;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.Result;
import com.google.javascript.jscomp.SourceFile;
import org.nasdanika.amur.Component;
import org.nasdanika.amur.Composite;
import org.nasdanika.amur.ImplementationType;
import org.nasdanika.amur.ImplementationTypeActionWithProgress;

public class GenerateAction implements ImplementationTypeActionWithProgress<Boolean> {
	
	@Override
	public Boolean configure(ImplementationType target) {
		return Boolean.TRUE;
	}
	
	private boolean validate(Component component, DiagnosticChain chain, Map<Object, Object> context) {
		boolean result = component.validate(chain, context);
		if (component.getImplementationType()!=null) {
			result = component.getImplementationType().validate(chain, context) && result;
		}
		if (component instanceof Composite) {
			for (Component child: ((Composite) component).getChildren()) {
				validate(child, chain, context);
			}
		}
		return result;
	}
	
	private boolean hasErrors(Diagnostic diagnostic) {
		if (diagnostic.getSeverity()==Diagnostic.ERROR) {
			return true;
		}
		for (Diagnostic child: diagnostic.getChildren()) {
			if (hasErrors(child)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public IStatus run(final ImplementationType implementationType, Boolean config, String actionId, IProgressMonitor monitor, final Map<Object, Object> context) {		
		monitor.beginTask("Generating "+implementationType.getOwner().getName()+" JavaScript", 7); // validation, ex model, wave start/stop, populating, generation, formatting, saving
		MultiStatus status = new MultiStatus("org.nasdanika.amur.it.js.gen", Status.OK, "JavaScript generation - "+implementationType.getOwner().getName(), null);		
		monitor.subTask("Validation");
		BasicDiagnostic diagnostics = new BasicDiagnostic(null, Diagnostic.OK, "See details...", new Object[] { implementationType.getOwner() });		
		if (!validate(implementationType.getOwner(), diagnostics, context) && hasErrors(diagnostics)) {			
			status.add(BasicDiagnostic.toIStatus(diagnostics));
			monitor.worked(1);
		} else {						
			monitor.worked(1);
		    try {
				final IContainer scriptContainer = ((org.nasdanika.amur.it.js.Component) implementationType).getScriptContainer();
				final IContainer resourceContainer = ((org.nasdanika.amur.it.js.Component) implementationType).getResourceContainer();
				
				String jstr = generateScript((org.nasdanika.amur.it.js.Component) implementationType, scriptContainer, resourceContainer, monitor, status, context);
				monitor.subTask("Saving");
				String componentName = implementationType.getOwner().getName();
				if (!isBlank(componentName)) {
					IFile file = scriptContainer.getFile(new Path(componentName+".js"));
					if (file.exists()) {
						file.setContents(new ByteArrayInputStream(jstr.getBytes()), false, true, monitor);
					} else {
						file.create(new ByteArrayInputStream(jstr.getBytes()), false, monitor);								
					}
					file.setDerived(true, monitor);
										
			        SourceFile externs = SourceFile.fromCode("externs.js", ""); // TODO - from resource file.
			        com.google.javascript.jscomp.Compiler compiler = new com.google.javascript.jscomp.Compiler();
			        CompilerOptions compilerOptions = new CompilerOptions();
		    	    CompilationLevel.SIMPLE_OPTIMIZATIONS.setOptionsForCompilationLevel(compilerOptions);
		    	    compilerOptions.setLanguageIn(LanguageMode.ECMASCRIPT5);

					Result cr = compiler.compile(externs, SourceFile.fromCode(componentName+".js", jstr), compilerOptions);
					boolean ms = true;
					for (JSError e: cr.errors) {
			            status.add(new Status(Status.ERROR, "org.nasdanika.amur.it.js", "Minification failed for "+componentName+", line "+e.getLineNumber()+": "+e.description));
			            ms = false;
					}
					for (JSError w: cr.warnings) {
			            status.add(new Status(Status.WARNING, "org.nasdanika.amur.it.js", "Minification warning for "+componentName+", line "+w.getLineNumber()+": "+w.description));				
					}	
					
					IFile mfile = scriptContainer.getFile(new Path(componentName+".min.js"));
					if (ms) {
						if (mfile.exists()) {
							mfile.setContents(new ByteArrayInputStream(compiler.toSource().getBytes()), false, true, monitor);
						} else {
							mfile.create(new ByteArrayInputStream(compiler.toSource().getBytes()), false, monitor);								
						}
						mfile.setDerived(true, monitor);
					} else if (mfile.exists()) {
						mfile.delete(false, monitor);
					}
				} else {
					status.add(new Status(Status.ERROR, "org.nasdanika.amur.it.js", "Flow name is not set"));								
				}
				monitor.worked(1);
			} catch (Exception e) {
				status.add(new Status(Status.ERROR, "org.nasdanika.amur.it.js", "Generation failed: "+e, e));
				e.printStackTrace();
			}
			monitor.done();
		}
		return status;
	}
		
	public static boolean isBlank(String str) {
		return str==null || str.trim().length()==0;
	}

	private static final String COMPONENT_FACTORY_TOKEN = "$COMPONENT_FACTORY$";
	private static final String COMPONENT_NAME_TOKEN = "$COMPONENT_NAME$";

	protected String generateScript(
			org.nasdanika.amur.it.js.Component rootComponent,
			IContainer scriptContainer, 
			IContainer resourceContainer,
			IProgressMonitor monitor, 
			MultiStatus status,
			Map<Object, Object> context) throws Exception {		
		
		monitor.subTask("Generating execution model");
		URI resourceURI = URI.createURI("mem://"+Long.toString(System.currentTimeMillis(), Character.MAX_RADIX));
		ResourceSet rs = new ResourceSetImpl();
		
		Resource res = rs.createResource(resourceURI);
		rs.getResources().add(res);
		
		org.nasdanika.amur.it.js.exec.Component rootExecComponent = rootComponent.createExecutionComponent(resourceURI, context, monitor, status);
		res.getContents().add(rootExecComponent);
		
		EcoreUtil.resolveAll(res);
		
		monitor.worked(1);
		
		monitor.subTask("Stop/start waves");
				
		// Weighing components.
		// Pass 1 - simple
		List<org.nasdanika.amur.it.js.exec.Component> cList = new ArrayList<>();
		
		// Root component is the first to start and last to stop, it is an output for output ports. 
		// It is also an input for input ports, but this is ignored to avoid complications with circular references.
		// In this regard root is the "lightest" component as it has no outputs.
		rootExecComponent.setWeight((int) Short.MIN_VALUE);
		
		cList.add(rootExecComponent);
		TreeIterator<EObject> tit = rootExecComponent.eAllContents();
		while (tit.hasNext()) {
			EObject me = tit.next();
			if (me instanceof org.nasdanika.amur.it.js.exec.Component) {
				org.nasdanika.amur.it.js.exec.Component cmp = (org.nasdanika.amur.it.js.exec.Component) me;
				int weight = 0;
				for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> de: cmp.getInputs()) {
					weight-=de.getValue().getWeightCoeff();
				}
				if (cmp.getInputs().isEmpty()) {
					// No inputs - very heavy (dependency grows up)
					weight+=10000;
				}
				for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> de: cmp.getOutputs()) {
					weight+=de.getValue().getWeightCoeff();
				}
				if (cmp.getOutputs().isEmpty()) {
					// No outputs - very light
					weight-=10000;
				}
				cmp.setWeight(weight);
				cList.add(cmp);
			}
		}
		
		Comparator<org.nasdanika.amur.it.js.exec.Component> componentComparator = new Comparator<org.nasdanika.amur.it.js.exec.Component>() {

			@Override
			public int compare(org.nasdanika.amur.it.js.exec.Component o1, org.nasdanika.amur.it.js.exec.Component o2) {
				return o1.getWeight()-o2.getWeight();
			}
			
		};
		
		Collections.sort(cList, componentComparator);
		
		// Ranking start
		for (org.nasdanika.amur.it.js.exec.Component cmp: cList) {
			cmp.setWeight(-1);
		}
		
		for (org.nasdanika.amur.it.js.exec.Component cmp: cList) {
			rankStart(cmp, new HashSet<org.nasdanika.amur.it.js.exec.Component>(), 0);
		}		
		
		Collections.sort(cList, componentComparator);
		
		// $starter is an implicit input to components without input start propagators.
		org.nasdanika.amur.it.js.exec.Component starter = (org.nasdanika.amur.it.js.exec.Component) ((Hash) rootExecComponent.getEntries().get("$children")).getEntries().get("$starter");
		starter.setStartRoot(false);
		starter.setStartTerminal(false);
		 
		JSONArray startLinks = new JSONArray();
		
		AtomicInteger startWaveCounter = new AtomicInteger();
		for (int fl = DependencyRole.values().length; fl>=0; --fl) {
			for (DependencyRole sl: DependencyRole.values()) {
				for (org.nasdanika.amur.it.js.exec.Component cmp: cList) {
					if (cmp.isForceable() && cmp.getStartLevel()<sl.ordinal()) {
						startWaveCounter.incrementAndGet();
						start(cmp, null, starter, sl.ordinal(), fl, startLinks, startWaveCounter);
					}
				}
			}
		}
		
		for (org.nasdanika.amur.it.js.exec.Component cmp: cList) {
			if (cmp.getStartRoot()==null) {
				throw new IllegalStateException("Untraversed component - start root is not set: "+label(cmp));
			}
			
			if (cmp.getStartTerminal()==null) {
				throw new IllegalStateException("Untraversed component - start terminal is not set: "+label(cmp));
			}
			
			if (cmp.getStartRoot()) {
				JSONObject link = new JSONObject();
				link.put("source", "Root");
				link.put("sourceLabel", "Root");
				link.put("sourceType", "root");
				
				link.put("target", cmp.getId());
				link.put("targetLabel", label(cmp));						
				link.put("targetType", type(cmp, null, null));
				
				link.put("type", linkType(DependencyRole.NONE, Boolean.TRUE));
				
				startLinks.put(link);
				
				if (cmp!=rootExecComponent) {
					DependencyInfo outValue = cmp.getOutputs().get(rootExecComponent);
					if (outValue == null) {
						outValue = ExecFactory.eINSTANCE.createDependencyInfo();
						outValue.setRole(DependencyRole.NONE);
						cmp.getOutputs().put(rootExecComponent, outValue);
					}
					
					if (outValue.getGuard()==null) {
						outValue.setGuard(true);
					}
					
					DependencyInfo inValue = rootExecComponent.getInputs().get(cmp);
					if (inValue == null) {
						inValue = ExecFactory.eINSTANCE.createDependencyInfo();
						rootExecComponent.getInputs().put(cmp, inValue);
					}	
					
					if (inValue.getGuard()==null) {
						inValue.setGuard(true);
					}	
					
					rootExecComponent.setStartTerminal(false);
				}
			}
			
			
			if (cmp.getStartTerminal()) {
				JSONObject link = new JSONObject();
				link.put("taret", "Terminal");
				link.put("targetLabel", "Terminal");
				link.put("targetType", "starter");
				
				link.put("source", cmp.getId());
				link.put("sourceLabel", label(cmp));						
				link.put("sourceType", type(cmp, null, null));
				
				link.put("type", linkType(DependencyRole.NONE, Boolean.TRUE));
				
				startLinks.put(link);
				
				if (cmp!=starter) {
					DependencyInfo inValue = cmp.getInputs().get(starter);
					if (inValue == null) {
						inValue = ExecFactory.eINSTANCE.createDependencyInfo();
						cmp.getInputs().put(starter, inValue);
					}
					
					if (inValue.getGuard()==null) {
						inValue.setGuard(true);
					}
					
					DependencyInfo outValue = starter.getOutputs().get(cmp);
					if (outValue == null) {
						outValue = ExecFactory.eINSTANCE.createDependencyInfo();
						outValue.setRole(DependencyRole.NONE);
						starter.getOutputs().put(cmp, outValue);
					}
					
					if (outValue.getGuard()==null) {
						outValue.setGuard(true);
					}
				}
			}
		}
		
		monitor.worked(1);
				
		monitor.subTask("Populating components");
		// Populating resolved components.
		for (org.nasdanika.amur.it.js.exec.Component cmp: cList) {
			cmp.populate(context, monitor, status);
		}
		monitor.worked(1);
				
		// --- Dumping Execution model ---		
//		ByteArrayOutputStream eDump = new ByteArrayOutputStream();
//		res.save(eDump, null);
//		IFile execDump = getScriptContainer().getFile(new Path(getComponent().getName()+"-exec.xml"));
//		if (execDump.exists()) {
//			execDump.setContents(new ByteArrayInputStream(eDump.toByteArray()), false, true, getMonitor());
//		} else {
//			execDump.create(new ByteArrayInputStream(eDump.toByteArray()), false, getMonitor());								
//		}
		
		// --- For visualization ---
//		JSONArray outputLinks = new JSONArray();
//		JSONArray inputLinks = new JSONArray();
//		TreeIterator<EObject> cit = res.getAllContents();
//		while (cit.hasNext()) {
//			EObject nxt = cit.next();
//			if (nxt instanceof org.nasdanika.amur.it.js.exec.Component) {
//				links((org.nasdanika.amur.it.js.exec.Component) nxt, inputLinks, false, starter, rootExecComponent);
//				links((org.nasdanika.amur.it.js.exec.Component) nxt, outputLinks, true, starter, rootExecComponent);
//			}
//		}
//		
//		IFile startLinksFile = scriptContainer.getFile(new Path(rootComponent.getOwner().getName()+"-start-links.json"));
//		if (startLinksFile.exists()) {
//			startLinksFile.setContents(new ByteArrayInputStream(startLinks.toString(4).getBytes("UTF-8")), false, true, monitor);
//		} else {
//			startLinksFile.create(new ByteArrayInputStream(startLinks.toString(4).getBytes("UTF-8")), false, monitor);								
//		}
//		
//		IFile inputLinksFile = scriptContainer.getFile(new Path(rootComponent.getOwner().getName()+"-input-links.json"));
//		if (inputLinksFile.exists()) {
//			inputLinksFile.setContents(new ByteArrayInputStream(inputLinks.toString(4).getBytes("UTF-8")), false, true, monitor);
//		} else {
//			inputLinksFile.create(new ByteArrayInputStream(inputLinks.toString(4).getBytes("UTF-8")), false, monitor);								
//		}
//		
//		IFile outputLinksFile = scriptContainer.getFile(new Path(rootComponent.getOwner().getName()+"-output-links.json"));
//		if (outputLinksFile.exists()) {
//			outputLinksFile.setContents(new ByteArrayInputStream(outputLinks.toString(4).getBytes("UTF-8")), false, true, monitor);
//		} else {
//			outputLinksFile.create(new ByteArrayInputStream(outputLinks.toString(4).getBytes("UTF-8")), false, monitor);								
//		}
		
		// --- End for visualization

		monitor.subTask("Code generation");
		context.put("component.name", rootComponent.getOwner().getName());
		if (rootExecComponent.getEntries().containsKey("$start")) {
			context.put("component.start", true);
		}
		context.put("component.definition", rootExecComponent.getJavaScript());
		String jstr = new FactoryRenderer().generate(rootExecComponent, context);
		String skeletonStr = rootComponent.getSkeletonString(status);
		if (skeletonStr!=null && skeletonStr.trim().length()>0) {
			String flowName = rootComponent.getOwner().getName();
			if (flowName!=null) {
				int idx=-flowName.length(); 
				while ((idx = skeletonStr.indexOf(COMPONENT_NAME_TOKEN, idx+flowName.length()))!=-1) {
					skeletonStr = skeletonStr.substring(0, idx)+flowName+skeletonStr.substring(idx+COMPONENT_NAME_TOKEN.length());					
				}
			}
			
			int idx = skeletonStr.indexOf(COMPONENT_FACTORY_TOKEN);
			if (idx==-1) {
				status.add(new Status(Status.WARNING, "org.nasdanika.amur.it.js", "Skeleton does not contain flow factory token"+ COMPONENT_FACTORY_TOKEN));													
			} else {
				jstr = skeletonStr.substring(0, idx)+jstr+skeletonStr.substring(idx+COMPONENT_FACTORY_TOKEN.length());
			}
		}
		monitor.worked(1);
				
		monitor.subTask("Formatting code");
		try {
			ScriptEngineManager sem = new ScriptEngineManager();
			ScriptEngine se = sem.getEngineByName("javascript");
			SimpleBindings bindings = new SimpleBindings();
			bindings.put("source", jstr.toString());
			return (String) se.eval(new InputStreamReader(getClass().getResourceAsStream("beautify.js")), bindings);
		} catch (Exception e) {
			status.add(new Status(Status.WARNING, "org.nasdanika.amur.it.js.gen", "JavaScript formatting failed: "+e, e));								
			e.printStackTrace();
		} finally {
			monitor.worked(1);
		}
		
		return jstr;
	}
	
	private String type(org.nasdanika.amur.it.js.exec.Component cmp, Object starter, Object root) {
		if (cmp == starter) {
			return "starter";
		}
		if (cmp == root) {
			return "root";
		}
		if (cmp.getCreator()!=null) {
			return cmp.getCreator().getOwner().eClass().getName();
		}
		return "unknown";
	}
	
//	private void links(org.nasdanika.amur.it.js.exec.Component cmp, JSONArray links, boolean outputs, Object starter, Object root) {
//		Set<org.nasdanika.amur.it.js.exec.Component> verifier = new HashSet<>();
//		for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> o: (outputs ? cmp.getOutputs() : cmp.getInputs()).entrySet()) {
//			if (!verifier.add(o.getKey())) {
//				throw new IllegalStateException("Duplicate output key: "+o.getKey().getId());
//			}
//			JSONObject link = new JSONObject();
//			if (outputs) {
//				link.put("source", cmp.getId());
//				link.put("sourceLabel", label(cmp));
//				link.put("sourceType", type(cmp, starter, root));
//				
//				link.put("target", o.getKey().getId());
//				link.put("targetLabel", label(o.getKey()));						
//				link.put("targetType", type(o.getKey(), starter, root));
//			} else {
//				link.put("target", cmp.getId());
//				link.put("targetLabel", label(cmp));
//				link.put("targetType", type(cmp, starter, root));
//				
//				link.put("source", o.getKey().getId());
//				link.put("sourceLabel", label(o.getKey()));						
//				link.put("sourceType", type(o.getKey(), starter, root));
//			}
//			
//			link.put("order", o.getValue().getOrder());
//			
//			link.put("type", linkType(o.getValue().getRole(), o.getValue().getGuard()));
//			
//			links.put(link);
//		}		
//	}
	
	private static String linkType(DependencyRole role, Boolean isGuard) {
		String type = "none";
		switch (role) {
		case DISPATCH:
			type = "transition";
			break;
		case ERROR_HANDLER:
			type = "error";
			break;
		case EVENT_SINK:
			type = "event";
			break;
		case FUNCTION:
			type = "call";
			break;
		case NONE:
			type = "none";
			break;
		case PROPERTY:
			type = "property";
			break;
		}
		if (!Boolean.TRUE.equals(isGuard)) {
			type+="-ng";
		}
		return type;
	}
	
	private List<Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo>> sortDependencies(Collection<Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo>> dependencies) {
		List<Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo>> ret = new ArrayList<>(dependencies);
		Collections.sort(ret, new Comparator<Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo>>() {

			@Override
			public int compare(
					Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> o1,
					Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> o2) {
				DependencyRole r1 = o1.getValue().getRole();
				if (r1==null) {
					r1 = DependencyRole.NONE;
				}
				DependencyRole r2 = o2.getValue().getRole();
				if (r2==null) {
					r2 = DependencyRole.NONE;
				}				
				return r1.ordinal()-r2.ordinal();
			}
		});
		return ret;
	}

	private String label(org.nasdanika.amur.it.js.exec.Component cmp) {
		StringBuilder nameBuilder = new StringBuilder();
		if (cmp.getCreator()==null) {
			nameBuilder.append(cmp.getId());
		} else {
			if (cmp.getCreator().getOwner().getName()!=null) {
				nameBuilder.append(cmp.getCreator().getOwner().getName());
			} else {
				nameBuilder.append(cmp.getCreator().eClass().getName());
			}				
		}
		return nameBuilder.toString();
	}

	private void rankStart(
			org.nasdanika.amur.it.js.exec.Component cmp,
			Set<org.nasdanika.amur.it.js.exec.Component> ranked,
			int weight) {
		if (ranked.add(cmp)) {
			if (cmp.getWeight()<weight) {
				cmp.setWeight(weight);				
				for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> i: sortDependencies(cmp.getInputs())) {
					rankStart(i.getKey(), ranked, weight+1);
				}
			}
		}
	}
	
	private String levelName(int level) {
		if (level==-1) {
			return "*FORCE";
		}
		
		if (level==-2) {
			return "*INITIAL";
		}
		
		if (level>=DependencyRole.values().length) {
			return "*NO FORCE";
		}
		
		return DependencyRole.values()[level].name();
	}
	
	private void start(
			org.nasdanika.amur.it.js.exec.Component cmp, 
			org.nasdanika.amur.it.js.exec.Component initiator, 
			org.nasdanika.amur.it.js.exec.Component starter, 
			int level, 
			int forceLevel, 
			JSONArray startLinks,
			AtomicInteger waveCounter) throws Exception {
		
		if (cmp == starter) {
			return;
		}
		
		int initialLevel = cmp.getStartLevel();
		
		if (cmp.getStartLevel()<level) { // To prevent loops			
			if (level<forceLevel) { // If not forced, start only if all outputs are started
				for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> out: cmp.getOutputs()) {
					Boolean oGuard = out.getValue().getGuard();
					int oStartLevel = out.getKey().getStartLevel();
					if (oGuard==null && (initiator==null || oStartLevel<level)) {
						return; // Only output-less components can be forcelessly started.
					}
				}
			}
			
			Boolean isStartRoot = initiator==null;
			if (cmp.getStartRoot()==null) {
				cmp.setStartRoot(isStartRoot);
			} else if (!isStartRoot.equals(cmp.getStartRoot())) {
				throw new IllegalStateException("Start root is already set to "+cmp.getStartRoot());
			}
			
			if (cmp.getStartTerminal()==null) {
				cmp.setStartTerminal(true);
			}
			
			cmp.setStartLevel(level);
									
			for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> out: cmp.getOutputs()) {
				boolean isStartGuard = out.getKey().getStartLevel()>=level;
//				System.out.println(level+"/"+out.getValue().getGuard()+"/"+isStartGuard+": "+ label(out.getKey())+"@"+out.getKey().getStartLevel()+" -> "+label(cmp)+"@"+initialLevel);
				if (out.getValue().getGuard()==null) {
					out.getValue().setGuard(isStartGuard);
				}
				if (out.getValue().getGuard()) {
					out.getKey().setStartTerminal(false);
					if (initialLevel==-2) {				
						JSONObject link = new JSONObject();
						link.put("source", out.getKey().getId());
						link.put("sourceLabel", label(out.getKey()));
						link.put("sourceType", type(out.getKey(), null, null));
						
						link.put("target", cmp.getId());
						link.put("targetLabel", label(cmp)+" "+waveCounter.incrementAndGet()+" "+levelName(level)+"/"+levelName(forceLevel));						
						link.put("targetType", type(cmp, null, null));
						
						link.put("type", linkType(DependencyRole.values()[level], Boolean.TRUE));
						
						startLinks.put(link);
//						System.out.println(label(out.getKey())+" -> "+label(cmp));
					}
				}			
			}				
			for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> in: sortDependencies(cmp.getInputs())) {				
				Boolean inGuard = in.getValue().getGuard();
				if (inGuard==null || inGuard) { // Do not navigate explicit non-guards.
					DependencyRole inRole = in.getValue().getRole();
					int iLevel = inRole==null ? DependencyRole.NONE.ordinal() : inRole.ordinal(); 
					for (int i=iLevel; i<=level; ++i) {
						start(in.getKey(), cmp, starter, i, forceLevel, startLinks, waveCounter);
					}
				}
			}
		}		
	}
	
	@Override
	public org.nasdanika.amur.AmurActionBase.Mode getMode(ImplementationType target) {
		return Mode.ENABLED;
	}
}
