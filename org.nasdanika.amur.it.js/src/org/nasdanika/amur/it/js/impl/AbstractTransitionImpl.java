/**
 */
package org.nasdanika.amur.it.js.impl;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.amur.it.js.AbstractTransition;
import org.nasdanika.amur.it.js.Component;
import org.nasdanika.amur.it.js.Join;
import org.nasdanika.amur.it.js.JsPackage;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.exec.DependencyInfo;
import org.nasdanika.amur.it.js.exec.DependencyRole;
import org.nasdanika.amur.it.js.exec.OutputType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AbstractTransitionImpl extends ConnectionImpl implements AbstractTransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsPackage.Literals.ABSTRACT_TRANSITION;
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
		ret.setRole(isDispatch() ? DependencyRole.DISPATCH : DependencyRole.FUNCTION);
		ret.setOutputType(genType(context, monitor, status));
		String period = genPeriod(context, monitor, status);
		if (!isBlank(period)) {
			ret.getCode().put(DependencyInfo.PERIOD_KEY, period);
		}
		String condition = genCondition(context, monitor, status);
		if (!isBlank(condition)) {
			ret.getCode().put(DependencyInfo.CONDITION_KEY, condition);
		}
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
		String condition = genCondition(context, monitor, status);
		if (!isBlank(condition)) {
			ret.getCode().put(DependencyInfo.CONDITION_KEY, condition);
		}
		ret.setOutputType(OutputType.SYNCHRONOUS);
		return ret;
	}
	
	@Override
	protected void configureOutputDependencyInfo(Component output,
			DependencyInfo di,
			org.nasdanika.amur.it.js.exec.Component sourceComponent,
			URI resourceURI, 
			Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {
		super.configureOutputDependencyInfo(output, di, sourceComponent, resourceURI, context, monitor, status);
		if (!Join.NONE.equals(getJoinType())) {
			di.getParameters().clear();
			for (Parameter p: genOutputParameters(context, monitor, status)) {
				di.getParameters().add(EcoreUtil.copy(p));
			}
		} 
	}
	
	protected void configureInputDependencyInfo(
			Component input, 
			DependencyInfo di, 
			org.nasdanika.amur.it.js.exec.Component component, 
			org.eclipse.emf.common.util.URI resourceURI, 
			java.util.Map<Object,Object> context, 
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {
		
		for (Parameter tp: genInputParameters(input, context, monitor, status)) {
			di.getParameters().add(EcoreUtil.copy(tp));
		}
		String handlerCode = genHandler(input, context, monitor, status);
		if (!isBlank(handlerCode)) {
			di.getCode().put(DependencyInfo.HANDLER_KEY, handlerCode);
		}	
		String period = genPeriod(context, monitor, status);
		if (!isBlank(period)) {
			di.getCode().put(DependencyInfo.PERIOD_KEY, period);
		}
		di.setRole(DependencyRole.FUNCTION);
		di.setOutputType(genType(context, monitor, status));
		di.setWeightCoeff(DependencyInfo.CALL_WEIGHT_COEFF);
	}
		
	@Override
	public String genSourceName() {
		return isDispatch() ? getSourceName() : super.genSourceName();
	}
	
	
} //AbstractTransitionImpl
