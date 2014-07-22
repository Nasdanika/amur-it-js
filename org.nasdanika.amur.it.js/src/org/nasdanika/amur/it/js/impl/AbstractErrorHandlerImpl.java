/**
 */
package org.nasdanika.amur.it.js.impl;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.amur.it.js.AbstractErrorHandler;
import org.nasdanika.amur.it.js.AbstractNode;
import org.nasdanika.amur.it.js.JsPackage;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.exec.Component;
import org.nasdanika.amur.it.js.exec.DependencyInfo;
import org.nasdanika.amur.it.js.exec.DependencyRole;

import org.nasdanika.amur.Composite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Error Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AbstractErrorHandlerImpl extends AbstractNodeImpl implements AbstractErrorHandler {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractErrorHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsPackage.Literals.ABSTRACT_ERROR_HANDLER;
	}
	
	@Override
	public List<Parameter> genInputParameters(
			org.nasdanika.amur.it.js.Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		return Collections.singletonList(createParameter("error"));
	}
	
	@Override
	public DependencyInfo createInputDependencyInfo(
			org.nasdanika.amur.it.js.Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		DependencyInfo ret = super.createInputDependencyInfo(input, context, monitor, status);
		String condition = genCondition(context, monitor, status);
		if (!isBlank(condition)) {
			ret.getCode().put(DependencyInfo.CONDITION_KEY, condition);
		}
		ret.setRole(DependencyRole.ERROR_HANDLER);
		return ret;
	}
	
	@Override
	protected DependencyRole adjustInputDependencyRole(DependencyRole initialRole) {
		return DependencyRole.ERROR_HANDLER;
	}
	
	@Override
	public Component createExecutionComponent(
			URI resourceURI,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		Component ret = super.createExecutionComponent(resourceURI, context, monitor, status);
		Resource res = eResource();
		if (res==null) {
			org.nasdanika.amur.Component root = getOwner();
			while (root.getParent()!=null) {
				root = root.getParent();
			}
			collectSources(root.eAllContents(), ret, resourceURI, context, monitor, status);
			collectSources(Collections.<EObject>singleton(root).iterator(), ret, resourceURI, context, monitor, status);
		} else {
			ResourceSet rss = res.getResourceSet();
			if (rss==null) {
				collectSources(res.getAllContents(), ret, resourceURI, context, monitor, status);
			} else {
				collectSources(rss.getAllContents(), ret, resourceURI, context, monitor, status);
			}			
		}
		return ret;
	}

	private void collectSources(
			Iterator<?> cit, 
			Component ret, 
			URI resourceURI,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		while (cit.hasNext()) {
			Object next = cit.next();
			if (next instanceof org.nasdanika.amur.it.js.Component) {
				org.nasdanika.amur.it.js.Component candidate = (org.nasdanika.amur.it.js.Component) next;
				Composite parent = candidate.getOwner().getParent();
				if (parent!=null 
						&& parent.getImplementationType() instanceof AbstractNode 
						&& ((AbstractNode) parent.getImplementationType()).collectErrorHandlers(candidate, context, monitor, status).contains(this) 
					) {
					DependencyInfo di = candidate.createOutputDependencyInfo(this, context, monitor, status);
					configureInputDependencyInfo(candidate, di, ret, resourceURI, context, monitor, status);
					ret.getInputs().put(candidate.createExecutionComponentProxy(resourceURI, null), di);
				}
			}
		}
	}
			
} //AbstractErrorHandlerImpl
