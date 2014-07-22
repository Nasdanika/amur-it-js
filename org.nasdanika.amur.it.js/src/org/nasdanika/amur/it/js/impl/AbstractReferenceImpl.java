/**
 */
package org.nasdanika.amur.it.js.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.AbstractReference;
import org.nasdanika.amur.it.js.Component;
import org.nasdanika.amur.it.js.JsPackage;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.exec.DependencyInfo;
import org.nasdanika.amur.it.js.exec.DependencyRole;
import org.nasdanika.amur.it.js.exec.OutputType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AbstractReferenceImpl extends ConnectionImpl implements AbstractReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsPackage.Literals.ABSTRACT_REFERENCE;
	}


	@Override
	public DependencyInfo createInputDependencyInfo(
			Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		
		DependencyInfo ret = super.createInputDependencyInfo(input, context, monitor, status);
		ret.setRole(DependencyRole.PROPERTY);
		ret.setWeightCoeff(DependencyInfo.REFERENCE_WEIGHT_COEFF);
		ret.setReferenceScope(getScope());
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
		ret.setRole(DependencyRole.PROPERTY);
		ret.setWeightCoeff(DependencyInfo.REFERENCE_WEIGHT_COEFF);
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
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {

		String[] am = genAccessorAndMutator(input, di.getName(), context, monitor, status);
		if (am!=null && !isBlank(am[0])) {
			di.getCode().put(DependencyInfo.ACCESSOR_KEY, am[0]);
		}
		
		if (am!=null && !isBlank(am[1])) {
			di.getCode().put(DependencyInfo.MUTATOR_KEY, am[1]);
		}
		di.setRole(DependencyRole.PROPERTY);
		di.setOutputType(OutputType.SYNCHRONOUS);
		di.setWeightCoeff(DependencyInfo.REFERENCE_WEIGHT_COEFF);
	}
	
	@Override
	protected void configureOutputDependencyInfo(
			Component output, 
			DependencyInfo di, 
			org.nasdanika.amur.it.js.exec.Component component, 
			org.eclipse.emf.common.util.URI resourceURI, 
			java.util.Map<Object,Object> context, 
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {
		super.configureOutputDependencyInfo(output, di, component, resourceURI, context, monitor, status);
		di.setWeightCoeff(DependencyInfo.REFERENCE_WEIGHT_COEFF);
		di.setRole(DependencyRole.PROPERTY);
	}

	@Override
	public List<Parameter> genInputParameters(
			org.nasdanika.amur.it.js.Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		
		return Collections.emptyList(); // No parameters, "newValue" parameter for the setter is hardwired.
	}
	
	@Override
	public String genTargetName() {
		return getTargetName();
	}
	
} //AbstractReferenceImpl
