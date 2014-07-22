/**
 */
package org.nasdanika.amur.it.js;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.Parameter#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.Parameter#isToken <em>Token</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.Parameter#getCloning <em>Cloning</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.it.js.JsPackage#getParameter()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Parameter extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.amur.it.js.JsPackage#getParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.amur.it.js.JsPackage#getParameter_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.Parameter#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.amur.it.js.JsPackage#getParameter_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(boolean)
	 * @see org.nasdanika.amur.it.js.JsPackage#getParameter_Token()
	 * @model
	 * @generated
	 */
	boolean isToken();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.Parameter#isToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #isToken()
	 * @generated
	 */
	void setToken(boolean value);

	/**
	 * Returns the value of the '<em><b>Cloning</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.amur.it.js.Cloning}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloning</em>' attribute.
	 * @see org.nasdanika.amur.it.js.Cloning
	 * @see #setCloning(Cloning)
	 * @see org.nasdanika.amur.it.js.JsPackage#getParameter_Cloning()
	 * @model
	 * @generated
	 */
	Cloning getCloning();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.Parameter#getCloning <em>Cloning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloning</em>' attribute.
	 * @see org.nasdanika.amur.it.js.Cloning
	 * @see #getCloning()
	 * @generated
	 */
	void setCloning(Cloning value);

} // Parameter
