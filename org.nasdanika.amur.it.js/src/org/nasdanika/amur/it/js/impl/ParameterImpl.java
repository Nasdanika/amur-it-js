/**
 */
package org.nasdanika.amur.it.js.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.nasdanika.amur.it.js.Cloning;
import org.nasdanika.amur.it.js.JsPackage;
import org.nasdanika.amur.it.js.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.impl.ParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.impl.ParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.impl.ParameterImpl#isToken <em>Token</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.impl.ParameterImpl#getCloning <em>Cloning</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends CDOObjectImpl implements Parameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsPackage.Literals.PARAMETER;
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
	public String getName() {
		return (String)eGet(JsPackage.Literals.PARAMETER__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(JsPackage.Literals.PARAMETER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(JsPackage.Literals.PARAMETER__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(JsPackage.Literals.PARAMETER__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eGet(JsPackage.Literals.PARAMETER__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eSet(JsPackage.Literals.PARAMETER__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isToken() {
		return (Boolean)eGet(JsPackage.Literals.PARAMETER__TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(boolean newToken) {
		eSet(JsPackage.Literals.PARAMETER__TOKEN, newToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloning getCloning() {
		return (Cloning)eGet(JsPackage.Literals.PARAMETER__CLONING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloning(Cloning newCloning) {
		eSet(JsPackage.Literals.PARAMETER__CLONING, newCloning);
	}

} //ParameterImpl
