/**
 */
package org.nasdanika.amur.it.js;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

import org.nasdanika.amur.lang.Source;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.JoinEntry#getPort <em>Port</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.JoinEntry#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.it.js.JsPackage#getJoinEntry()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface JoinEntry extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(String)
	 * @see org.nasdanika.amur.it.js.JsPackage#getJoinEntry_Port()
	 * @model
	 * @generated
	 */
	String getPort();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.JoinEntry#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(String value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.amur.lang.Source}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see org.nasdanika.amur.it.js.JsPackage#getJoinEntry_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Source> getConditions();

} // JoinEntry
