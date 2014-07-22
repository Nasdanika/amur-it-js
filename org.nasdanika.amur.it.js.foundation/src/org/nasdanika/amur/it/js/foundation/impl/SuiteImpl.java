/**
 */
package org.nasdanika.amur.it.js.foundation.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.SimpleBindings;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.Suite;
import org.nasdanika.amur.it.js.impl.AbstractNodeImpl;
import org.osgi.framework.Bundle;

import org.nasdanika.amur.Component;
import org.nasdanika.amur.ImplementationType;
import org.nasdanika.amur.ImplementationTypeAction;
import org.nasdanika.amur.ImplementationTypeActionWithProgress;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Suite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.SuiteImpl#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SuiteImpl extends AbstractNodeImpl implements Suite {
	
	private static final String IMPLEMENTATION_TYPE_ACTION_ID = "org.nasdanika.amur.implementation_type_action";
	private static final int SUB_JOB_TICKS = 6;
	
	public static class GenerationAction implements ImplementationTypeActionWithProgress<Boolean> {
		
		@Override
		public org.nasdanika.amur.AmurActionBase.Mode getMode(ImplementationType target) {
			return Mode.ENABLED;
		}
		
	    protected ScriptEngineManager manager = new ScriptEngineManager();
	    
	    @Override
	    public Boolean configure(ImplementationType target) {
	    	return Boolean.TRUE;
	    }
	    
		@Override
		public IStatus run(ImplementationType implementationType, Boolean config, String actionId, IProgressMonitor monitor, Map<Object, Object> context) {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();		
			ResourceSet modelResourceSet = implementationType.eResource().getResourceSet();
			final List<IResource> accumulator = new ArrayList<>();
			try {
				for (String cp: ((Suite) implementationType).getComponents()) {
					collect(root.findMember(new Path(cp)), accumulator);
				}
				
				monitor.beginTask("Scheduling batch", accumulator.size());
				MultiStatus status = new MultiStatus("org.nasdanika.amur.it.js.foundation", Status.OK, "JavaScript generation", null);
				IProgressMonitor progressGroup = Job.getJobManager().createProgressGroup();
				progressGroup.beginTask("Generation", accumulator.size()*SUB_JOB_TICKS);
				List<Job> toJoin = new ArrayList<>();
				for (IResource ir: accumulator) {
					monitor.subTask("Processing "+ir.getFullPath());
					status.add(generate(modelResourceSet, actionId, ir, progressGroup, toJoin));
					monitor.worked(1);
				}
				monitor.done();
				for (Job job: toJoin) {
					job.join();
					status.add(job.getResult());
				}
				progressGroup.done();
				return status;
			} catch (Exception e) {
				e.printStackTrace();
				return new Status(Status.ERROR, "org.nasdanika.amur.it.js.foundation", "Generation error", e);
			}
		}
		
		private void collect(IResource res, List<IResource> accumulator) throws CoreException {
			if (res!=null && res.exists()) {
				if (res instanceof IContainer) {
					for (IResource m: ((IContainer) res).members()) {
						collect(m, accumulator);
					}
				} else if ("amur".equals(res.getFileExtension())) {
					accumulator.add(res);
				}
			}
		}

		private IStatus generate(
				ResourceSet modelResourceSet, 
				final String actionId, 
				IResource res, 
				IProgressMonitor progressGroup,
				List<Job> toJoin) {
			
			URI uri = URI.createURI(res.getLocationURI().toString());			
			try {						
				ResourceSet resourceSet = new ResourceSetImpl();				
				
				resourceSet.setResourceFactoryRegistry(modelResourceSet.getResourceFactoryRegistry());
				resourceSet.setPackageRegistry(modelResourceSet.getPackageRegistry());						
				
				Resource resource = resourceSet.getResource(uri, true);
				MultiStatus ret = new MultiStatus("org.nasdanika.amur.it.js.gen", Status.OK, "JavaScript generation", null);
				for (EObject c: resource.getContents()) {
					if (c instanceof Component) {
						final ImplementationType it = ((Component) c).getImplementationType();
						
						IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(IMPLEMENTATION_TYPE_ACTION_ID);
						boolean actionFound = false;
						for (IConfigurationElement ce: config) {
							try {
								if (!actionId.equals(ce.getAttribute("id"))) {
									continue;
								}
								
								String implementationTypeClassName = ce.getAttribute("implementationType");
								if (!isBlank(implementationTypeClassName)) {
									IContributor contributor = ce.getContributor();		
									Bundle bundle = Platform.getBundle(contributor.getName());
									@SuppressWarnings("unchecked")
									Class<ImplementationType> itc = (Class<ImplementationType>) bundle.loadClass(implementationTypeClassName.trim());
									if (!itc.isInstance(it)) {
										continue;
									}
								}
								
								String componentClassName = ce.getAttribute("component");
								if (!isBlank(componentClassName)) {
									IContributor contributor = ce.getContributor();		
									Bundle bundle = Platform.getBundle(contributor.getName());
									@SuppressWarnings("unchecked")
									Class<ImplementationType> cc = (Class<ImplementationType>) bundle.loadClass(componentClassName.trim());
									if (!cc.isInstance(it.getOwner())) {
										continue;
									}
								}
								
								String selector = ce.getAttribute("selector");
								if (!isBlank(selector)) {
							        ScriptEngine engine = manager.getEngineByName("JavaScript");
									Bindings bindings = new SimpleBindings();
									bindings.put("implementationType", it);
									bindings.put("context", Collections.emptyMap());
									Object result = engine.eval(selector, bindings);
									if (Boolean.FALSE.equals(result)) {
										continue;
									}
								}
								
								actionFound = true;

								switch (ce.getName()) {
								case "implementation_type_action": {
									ImplementationTypeAction ita = (ImplementationTypeAction) ce.createExecutableExtension("class");
									ita.run(it, actionId, new HashMap<>());
									break;
								}
								case "implementation_type_action_with_progress": {
									@SuppressWarnings("unchecked")
									final ImplementationTypeActionWithProgress<Object> ita = (ImplementationTypeActionWithProgress<Object>) ce.createExecutableExtension("class");
									final Object jConfig = ita.configure(it);
									if (jConfig!=null) {
										Job job = new Job(it.getOwner().getName()+": "+ce.getAttribute("name")+" ["+it.eClass().getName()+"]") {
	
											@Override
											protected IStatus run(IProgressMonitor monitor) {
												return ita.run(it, jConfig, actionId, monitor, new HashMap<>());
											}
											
										};
										job.setProgressGroup(progressGroup, SUB_JOB_TICKS);
										job.schedule();
										toJoin.add(job);
									}
									break;
								}
								default:
									ret.add(new Status(Status.ERROR, "org.nasdanika.amur.it.js.foundation", "Unsupported action type: "+ce.getName()));
								}									
							} catch (Exception e) {							
								e.printStackTrace();
								return new Status(Status.ERROR, "org.nasdanika.amur.it.js.foundation", "Generation error: "+e, e);										
							}							
						}	
						if (!actionFound) {
							ret.add(new Status(Status.WARNING, "org.nasdanika.amur.it.js.foundation", "Action "+actionId+" not found for "+it.eClass().getName()));
						}
					} else {
						ret.add(new Status(Status.ERROR, "org.nasdanika.amur.it.js.foundation", "Unsupported root element type: "+c.eClass().getName()));						
					}
				}
				return ret;												
			} catch (Exception e) {
				e.printStackTrace();
				return new Status(Status.ERROR, "org.nasdanika.amur.it.js.foundation", "Problem loading "+uri+": "+e, e);										
			}
		}
		
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SuiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoundationPackage.Literals.SUITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getComponents() {
		return (EList<String>)eGet(FoundationPackage.Literals.SUITE__COMPONENTS, true);
	}

	@Override
	public List<Parameter> genInputParameters(
			org.nasdanika.amur.it.js.Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		throw new UnsupportedOperationException();
	}

	@Override
	public String genHandler(
			org.nasdanika.amur.it.js.Component source,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		throw new UnsupportedOperationException();
	}

} //SuiteImpl
