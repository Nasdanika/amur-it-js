/**
 */
package org.nasdanika.amur.it.js.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.AbstractErrorTransition;
import org.nasdanika.amur.it.js.Component;
import org.nasdanika.amur.it.js.JsPackage;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.exec.DependencyInfo;
import org.nasdanika.amur.it.js.exec.DependencyRole;
import org.nasdanika.amur.it.js.exec.OutputType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Error Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AbstractErrorTransitionImpl extends ConnectionImpl implements AbstractErrorTransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractErrorTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsPackage.Literals.ABSTRACT_ERROR_TRANSITION;
	}
		
	protected void configureInputDependencyInfo(
			Component source,
			DependencyInfo di, 
			org.nasdanika.amur.it.js.exec.Component component, 
			org.eclipse.emf.common.util.URI resourceURI, 
			java.util.Map<Object,Object> context, 
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {
		
		super.configureInputDependencyInfo(source, di, component, resourceURI, context, monitor, status);
		di.getParameters().add(createParameter("error"));
		String handlerCode = genHandler(source, context, monitor, status);
		if (!isBlank(handlerCode)) {
			di.getCode().put(DependencyInfo.HANDLER_KEY, handlerCode);
		}	
		di.setRole(DependencyRole.ERROR_HANDLER);
		di.setOutputType(OutputType.SYNCHRONOUS);
	}
		
	@Override
	public DependencyInfo createInputDependencyInfo(
			Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		
		DependencyInfo ret = super.createInputDependencyInfo(input, context, monitor, status);
//		ret.getParameters().add(createParameter("error"));
		String condition = genCondition(context, monitor, status);
		if (!isBlank(condition)) {
			ret.getCode().put(DependencyInfo.CONDITION_KEY, condition);
		}
		ret.setRole(DependencyRole.ERROR_HANDLER);
		ret.setOutputType(OutputType.SYNCHRONOUS);
		return ret;
	}

	@Override
	public DependencyInfo createOutputDependencyInfo(
			Component output,			
			Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {
		
		DependencyInfo ret = super.createOutputDependencyInfo(output, context, monitor, status);
		ret.setOutputType(OutputType.SYNCHRONOUS);
		return ret;
	}
		
	@Override
	public List<Parameter> genInputParameters(
			org.nasdanika.amur.it.js.Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		return Collections.singletonList(createParameter("error"));
	}

} //AbstractErrorTransitionImpl
