/**
 */
package org.nasdanika.amur.it.js.foundation.impl;

import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.Component;
import org.nasdanika.amur.ErrorHandler;
import org.nasdanika.amur.InputPort;
import org.nasdanika.amur.Node;
import org.nasdanika.amur.OutputPort;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.exec.DependencyInfo;
import org.nasdanika.amur.it.js.exec.DependencyRole;
import org.nasdanika.amur.it.js.exec.ExecFactory;
import org.nasdanika.amur.it.js.exec.Function;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.FunctionOutputPort;
import org.nasdanika.amur.it.js.foundation.PropertyOutputPort;
import org.nasdanika.amur.it.js.foundation.TopLevelFlow;
import org.nasdanika.amur.it.js.impl.AbstractNodeImpl;
import org.nasdanika.amur.util.AmurValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Level Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.TopLevelFlowImpl#getScriptFolder <em>Script Folder</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.TopLevelFlowImpl#getResourceFolder <em>Resource Folder</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.TopLevelFlowImpl#getSkeleton <em>Skeleton</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TopLevelFlowImpl extends AbstractNodeImpl implements TopLevelFlow {

//	public static final String TERMINAL_KEY = "$terminal";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TopLevelFlowImpl() {
		super();
	}
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoundationPackage.Literals.TOP_LEVEL_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScriptFolder() {
		return (String)eGet(FoundationPackage.Literals.TOP_LEVEL_FLOW__SCRIPT_FOLDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptFolder(String newScriptFolder) {
		eSet(FoundationPackage.Literals.TOP_LEVEL_FLOW__SCRIPT_FOLDER, newScriptFolder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceFolder() {
		return (String)eGet(FoundationPackage.Literals.TOP_LEVEL_FLOW__RESOURCE_FOLDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceFolder(String newResourceFolder) {
		eSet(FoundationPackage.Literals.TOP_LEVEL_FLOW__RESOURCE_FOLDER, newResourceFolder);
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSkeleton() {
		return (String)eGet(FoundationPackage.Literals.TOP_LEVEL_FLOW__SKELETON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkeleton(String newSkeleton) {
		eSet(FoundationPackage.Literals.TOP_LEVEL_FLOW__SKELETON, newSkeleton);
	}

	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		if (diagnostics != null) {
			if (getOwner().getParent()==null) {
				if (isBlank(getOwner().getName())) {
					diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 AmurValidator.DIAGNOSTIC_SOURCE,
						 AmurValidator.IMPLEMENTATION_TYPE__VALIDATE,
						 "Top level component name cannot be blank",
						 new Object [] { getOwner() }));
					result = false;					
				}
				
				if (getScriptFolder()==null || getScriptFolder().trim().length()==0) {
					diagnostics.add
						(new BasicDiagnostic
							(Diagnostic.ERROR,
							 AmurValidator.DIAGNOSTIC_SOURCE,
							 AmurValidator.IMPLEMENTATION_TYPE__VALIDATE,
							 "Script output folder is not set",
							 new Object [] { getOwner() }));
					result = false;
				} else {
					IResource candidate = resolveRelativePath(getScriptFolder());
					if (!(candidate instanceof IContainer)) {
						diagnostics.add
						(new BasicDiagnostic
							(Diagnostic.ERROR,
							 AmurValidator.DIAGNOSTIC_SOURCE,
							 AmurValidator.IMPLEMENTATION_TYPE__VALIDATE,
							 "Script output folder does not exist",
							 new Object [] { getOwner() }));
						result = false;
					}				
				}
				
				if (getResourceFolder()!=null && getResourceFolder().trim().length()>0) {
					IResource candidate = resolveRelativePath(getResourceFolder());
					if (!(candidate instanceof IContainer)) {
						diagnostics.add
						(new BasicDiagnostic
							(Diagnostic.ERROR,
							 AmurValidator.DIAGNOSTIC_SOURCE,
							 AmurValidator.IMPLEMENTATION_TYPE__VALIDATE,
							 "Resource output folder does not exist",
							 new Object [] { getOwner() }));
						result = false;
					}					
				}
			}
		}
		return super.validate(diagnostics, context) && result;
	}
	
	@Override
	protected void setDefaultImplementationType(Component component) {
		if (component instanceof org.nasdanika.amur.ErrorTransition) {
			component.setImplementationType(org.nasdanika.amur.it.js.foundation.FoundationFactory.eINSTANCE.createErrorTransition());	
		} else if (component instanceof org.nasdanika.amur.Transition) {
			component.setImplementationType(org.nasdanika.amur.it.js.foundation.FoundationFactory.eINSTANCE.createTransition());
		} else if (component instanceof org.nasdanika.amur.Call) {
			component.setImplementationType(org.nasdanika.amur.it.js.foundation.FoundationFactory.eINSTANCE.createCall());
		} else if (component instanceof org.nasdanika.amur.Reference) {
			component.setImplementationType(org.nasdanika.amur.it.js.foundation.FoundationFactory.eINSTANCE.createReference());
		} else if (component instanceof InputPort) {
			component.setImplementationType(org.nasdanika.amur.it.js.foundation.FoundationFactory.eINSTANCE.createFunctionInputPort());
		} else if (component instanceof OutputPort) {
			component.setImplementationType(org.nasdanika.amur.it.js.foundation.FoundationFactory.eINSTANCE.createFunctionOutputPort());
		} else if (component instanceof Node) {
			component.setImplementationType(org.nasdanika.amur.it.js.foundation.FoundationFactory.eINSTANCE.createActivity());				
		} else if (component instanceof ErrorHandler) {
			component.setImplementationType(org.nasdanika.amur.it.js.foundation.FoundationFactory.eINSTANCE.createErrorHandler());								
//		} else if (component instanceof Gateway) {
//			component.setImplementationType(org.nasdanika.amur.it.js.foundation.JsFactory.eINSTANCE.createGateway());								
		} else if (component instanceof Container) {
			component.setImplementationType(org.nasdanika.amur.it.js.foundation.FoundationFactory.eINSTANCE.createGenericContainer());								
//		} else if (component instanceof ConnectionTarget) {
//			component.setImplementationType(org.nasdanika.amur.it.js.foundation.JsFactory.eINSTANCE.createService());								
		}
	}
	
	@Override
		public org.nasdanika.amur.it.js.exec.Component createExecutionComponent(
				URI resourceURI, 
				Map<Object, Object> context,
				IProgressMonitor monitor, 
				MultiStatus status) throws Exception {

			org.nasdanika.amur.it.js.exec.Component ret = super.createExecutionComponent(resourceURI, context, monitor, status);
			if (!ret.getOutputs().isEmpty()) {
				StringBuilder afterStartBuilder = new StringBuilder();
				StringBuilder beforeStopBuilder = new StringBuilder();
				for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> o: ret.getOutputs().entrySet()) {
					if (DependencyRole.PROPERTY.equals(o.getValue().getRole())) {
						afterStartBuilder.append("Object.defineProperty($facade,\""+StringEscapeUtils.escapeEcmaScript(o.getValue().getName())+"\", this.$outputs."+o.getValue().getId()+".$createActivator());\r\n");										
					} else if (DependencyRole.FUNCTION.equals(o.getValue().getRole())) {
						afterStartBuilder.append("$facade"+dereference(o.getValue().getName())+" = this.$outputs."+o.getValue().getId()+".$createActivator();\r\n");
					}
					
					beforeStopBuilder.append("delete $facade"+dereference(o.getValue().getName())+";\r\n");					
				}
				
				Function asf = ExecFactory.eINSTANCE.createFunction();
				asf.setBody(afterStartBuilder.toString());
				ret.getEntries().put("$afterStart", asf);
				
				Function bsf = ExecFactory.eINSTANCE.createFunction();
				bsf.setBody(beforeStopBuilder.toString());
				ret.getEntries().put("$beforeStop", bsf);
			}
			return ret;
		}
		
	@Override
	public String genHandler(
			org.nasdanika.amur.it.js.Component source,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		
		if (source instanceof FunctionOutputPort) {
			StringBuilder pBuilder = new StringBuilder();
			for (Parameter p: ((FunctionOutputPort) source).getParameters()) {
				if (pBuilder.length()>0) {
					pBuilder.append(", ");
				}
				pBuilder.append(p.getName());
			}
			
			StringBuilder handlerBuilder = new StringBuilder("return $facade."+getOwner().getName());
			
			if (pBuilder.length()==0) {
				handlerBuilder.append(".apply($facade, arguments)");
			} else {
				handlerBuilder.append("("+pBuilder+")");
			}
			handlerBuilder.append(";\r\n");
			return handlerBuilder.toString();			
		} 
		
		throw new IllegalArgumentException("Unsupported source: "+source.eClass().getName());
	}
	
	@Override
	public String[] genAccessorAndMutator(
			org.nasdanika.amur.it.js.Component source, 
			String propertyName,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		
		if (source instanceof PropertyOutputPort) {
			return new String[] {
				"return $facade."+getOwner().getName(),
				"$facade."+getOwner().getName()+" = newValue;\r\n"				
			};
		} 
		
		throw new IllegalArgumentException("Unsupported source: "+source.eClass().getName());
	}
	
	@Override
	public List<Parameter> genInputParameters(
			org.nasdanika.amur.it.js.Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		
		if (input instanceof FunctionOutputPort) {
			// Function output port dictates parameters.
			return stripTokenizeAndClone(((FunctionOutputPort) input).getParameters());
		}
		return Collections.emptyList();
	}
			
	@Override
	public IContainer getResourceContainer() {
		if (isBlank(getResourceFolder())) {
			return getScriptContainer();
		}
		return (IContainer) resolveRelativePath(getResourceFolder());
	}
	
	@Override
	public IContainer getScriptContainer() {
		return (IContainer) resolveRelativePath(getScriptFolder()); 
	}
	
	@Override
	public String getSkeletonString(MultiStatus status) throws Exception {
		String skeletonLocation = getSkeleton();
		if (!isBlank(skeletonLocation)) {		
			IResource skeleton = resolveRelativePath(skeletonLocation);
			if (skeleton!=null && skeleton.exists() && skeleton instanceof IFile) {
				Reader r = new InputStreamReader(((IFile) skeleton).getContents());
				StringWriter w = new StringWriter();
				char[] cbuf = new char[4096];
				int l;
				while ((l=r.read(cbuf))!=-1) {
					w.write(cbuf, 0, l);
				}
				r.close();
				w.close();
				return w.toString();
			} else {
				status.add(new Status(Status.ERROR, "org.nasdanika.amur.it.js.gen", "Skeleton file was not found: "+skeletonLocation+", generated bare factory function."));																				
			}
		}
		return null;
	}
	
	@Override
	public boolean acceptOwner(Component owner) {
		return !(owner.getParent() instanceof Node);
	}
	
	@Override
	protected boolean isTopLevel() {
		return true;
	}
	
} //TopLevelFlowImpl
