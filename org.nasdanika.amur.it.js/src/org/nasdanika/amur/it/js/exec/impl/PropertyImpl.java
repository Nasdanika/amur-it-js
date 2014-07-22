/**
 */
package org.nasdanika.amur.it.js.exec.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.exec.ExecPackage;
import org.nasdanika.amur.it.js.exec.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.PropertyImpl#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.PropertyImpl#getMutator <em>Mutator</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.PropertyImpl#getMutatorParameterName <em>Mutator Parameter Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends InitializerImpl implements Property {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessor() {
		return (String)eGet(ExecPackage.Literals.PROPERTY__ACCESSOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessor(String newAccessor) {
		eSet(ExecPackage.Literals.PROPERTY__ACCESSOR, newAccessor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMutator() {
		return (String)eGet(ExecPackage.Literals.PROPERTY__MUTATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMutator(String newMutator) {
		eSet(ExecPackage.Literals.PROPERTY__MUTATOR, newMutator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMutatorParameterName() {
		return (String)eGet(ExecPackage.Literals.PROPERTY__MUTATOR_PARAMETER_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMutatorParameterName(String newMutatorParameterName) {
		eSet(ExecPackage.Literals.PROPERTY__MUTATOR_PARAMETER_NAME, newMutatorParameterName);
	}
	
	@Override
	public String getJavaScript() {
		// TODO - Object.defineProperty(...)
		return super.getJavaScript();
	}

} //PropertyImpl
