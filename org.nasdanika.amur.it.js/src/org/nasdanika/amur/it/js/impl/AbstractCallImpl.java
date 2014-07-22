/**
 */
package org.nasdanika.amur.it.js.impl;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.amur.it.js.AbstractCall;
import org.nasdanika.amur.it.js.Component;
import org.nasdanika.amur.it.js.JsPackage;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.exec.DependencyInfo;
import org.nasdanika.amur.it.js.exec.DependencyRole;
import org.nasdanika.amur.it.js.exec.OutputType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AbstractCallImpl extends ConnectionImpl implements AbstractCall {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsPackage.Literals.ABSTRACT_CALL;
	}		
	
	@Override
	public DependencyInfo createInputDependencyInfo(
			Component input, 
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		
		DependencyInfo ret = super.createInputDependencyInfo(input, context, monitor, status);
//		for (Parameter p: genInputParameters(input, context, monitor, status)) {
//			ret.getParameters().add(EcoreUtil.copy(p));
//		}
		ret.setRole(DependencyRole.FUNCTION);
		ret.setWeightCoeff(DependencyInfo.CALL_WEIGHT_COEFF);
		ret.setName(trimLeadingDot(genSourceName()));
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
		ret.setRole(DependencyRole.FUNCTION);
		ret.setWeightCoeff(DependencyInfo.CALL_WEIGHT_COEFF);
		ret.setOutputType(OutputType.SYNCHRONOUS);
		return ret;
	}
	
	@Override
	protected void configureInputDependencyInfo(
			Component input, 
			DependencyInfo di, 
			org.nasdanika.amur.it.js.exec.Component component, 
			org.eclipse.emf.common.util.URI resourceURI, 
			java.util.Map<Object,Object> context, 
			IProgressMonitor monitor, MultiStatus status) throws Exception {
		super.configureInputDependencyInfo(input, di, component, resourceURI, context, monitor, status);
		for (Parameter tp: genInputParameters(input, context, monitor, status)) {
			di.getParameters().add(EcoreUtil.copy(tp));
		}
		String handlerCode = genHandler(input, context, monitor, status);
		if (!isBlank(handlerCode)) {
			di.getCode().put(DependencyInfo.HANDLER_KEY, handlerCode);
		}	
		di.setRole(DependencyRole.FUNCTION);
		di.setOutputType(OutputType.SYNCHRONOUS);
		di.setWeightCoeff(DependencyInfo.CALL_WEIGHT_COEFF);
	}
	
	protected void configureOutputDependencyInfo(
			Component output,
			DependencyInfo di, 
			org.nasdanika.amur.it.js.exec.Component component, 
			org.eclipse.emf.common.util.URI resourceURI, 
			java.util.Map<Object,Object> context, 
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {
		super.configureOutputDependencyInfo(output, di, component, resourceURI, context, monitor, status);
		di.setWeightCoeff(DependencyInfo.CALL_WEIGHT_COEFF);
	};

} //AbstractCallImpl
