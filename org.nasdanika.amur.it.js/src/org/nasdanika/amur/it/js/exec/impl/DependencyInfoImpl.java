/**
 */
package org.nasdanika.amur.it.js.exec.impl;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.nasdanika.amur.it.js.Join;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.ReferenceScope;
import org.nasdanika.amur.it.js.exec.Component;
import org.nasdanika.amur.it.js.exec.DependencyInfo;
import org.nasdanika.amur.it.js.exec.DependencyRole;
import org.nasdanika.amur.it.js.exec.ExecPackage;
import org.nasdanika.amur.it.js.exec.OutputType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.DependencyInfoImpl#getWeightCoeff <em>Weight Coeff</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.DependencyInfoImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.DependencyInfoImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.DependencyInfoImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.DependencyInfoImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.DependencyInfoImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.DependencyInfoImpl#getOutputType <em>Output Type</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.DependencyInfoImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.DependencyInfoImpl#getReferenceScope <em>Reference Scope</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.DependencyInfoImpl#getJoinType <em>Join Type</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.DependencyInfoImpl#getJoinConditions <em>Join Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyInfoImpl extends CDOObjectImpl implements DependencyInfo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecPackage.Literals.DEPENDENCY_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWeightCoeff() {
		return (Integer)eGet(ExecPackage.Literals.DEPENDENCY_INFO__WEIGHT_COEFF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeightCoeff(int newWeightCoeff) {
		eSet(ExecPackage.Literals.DEPENDENCY_INFO__WEIGHT_COEFF, newWeightCoeff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getGuard() {
		return (Boolean)eGet(ExecPackage.Literals.DEPENDENCY_INFO__GUARD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setGuard(Boolean newGuard) {
//		if (getGuard()!=null) {
//			throw new IllegalStateException("Guard value already set");
//		}
		eSet(ExecPackage.Literals.DEPENDENCY_INFO__GUARD, newGuard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> getParameters() {
		return (EList<Parameter>)eGet(ExecPackage.Literals.DEPENDENCY_INFO__PARAMETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, String> getCode() {
		return (EMap<String, String>)eGet(ExecPackage.Literals.DEPENDENCY_INFO__CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceScope getReferenceScope() {
		return (ReferenceScope)eGet(ExecPackage.Literals.DEPENDENCY_INFO__REFERENCE_SCOPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceScope(ReferenceScope newReferenceScope) {
		eSet(ExecPackage.Literals.DEPENDENCY_INFO__REFERENCE_SCOPE, newReferenceScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join getJoinType() {
		return (Join)eGet(ExecPackage.Literals.DEPENDENCY_INFO__JOIN_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinType(Join newJoinType) {
		eSet(ExecPackage.Literals.DEPENDENCY_INFO__JOIN_TYPE, newJoinType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getJoinConditions() {
		return (EList<String>)eGet(ExecPackage.Literals.DEPENDENCY_INFO__JOIN_CONDITIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ExecPackage.Literals.DEPENDENCY_INFO__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ExecPackage.Literals.DEPENDENCY_INFO__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return (Integer)eGet(ExecPackage.Literals.DEPENDENCY_INFO__ORDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		eSet(ExecPackage.Literals.DEPENDENCY_INFO__ORDER, newOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyRole getRole() {
		return (DependencyRole)eGet(ExecPackage.Literals.DEPENDENCY_INFO__ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(DependencyRole newRole) {
		eSet(ExecPackage.Literals.DEPENDENCY_INFO__ROLE, newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputType getOutputType() {
		return (OutputType)eGet(ExecPackage.Literals.DEPENDENCY_INFO__OUTPUT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputType(OutputType newOutputType) {
		eSet(ExecPackage.Literals.DEPENDENCY_INFO__OUTPUT_TYPE, newOutputType);
	}

	@SuppressWarnings("unchecked")
	@Override
	public DependencyInfo getOpposite() {
		if (eContainer()==null) {
			return null;
		}
		
		Map.Entry<Component,DependencyInfo> entry = (Map.Entry<Component,DependencyInfo>) eContainer();
		Component opposite = entry.getKey();
		
		Component thisComponent = (Component) ((EObject) entry).eContainer();
		if (ExecPackage.eINSTANCE.getComponent_Inputs().equals(((EObject) entry).eContainingFeature())) {
			return opposite.getOutputs().get(thisComponent);
		} 
		
		if (ExecPackage.eINSTANCE.getComponent_Outputs().equals(((EObject) entry).eContainingFeature())) {
			return opposite.getInputs().get(thisComponent);
		} 
		
		return null;
	}

	@Override
	public String getId() {
		if (eContainer()==null) {
			return null;
		}
		
		if (ExecPackage.eINSTANCE.getComponent_Inputs().equals(eContainer().eContainingFeature())) {
			return "$"+Integer.toString(((Component) eContainer().eContainer()).getInputs().indexOf(eContainer()), Character.MAX_RADIX);
		} 
		
		if (ExecPackage.eINSTANCE.getComponent_Outputs().equals(eContainer().eContainingFeature())) {
			return "$"+Integer.toString(((Component) eContainer().eContainer()).getOutputs().indexOf(eContainer()), Character.MAX_RADIX);
		} 
		
		return null;
	}

} //DependencyInfoImpl
