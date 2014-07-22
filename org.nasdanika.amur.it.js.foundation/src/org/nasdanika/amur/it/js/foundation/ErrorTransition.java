/**
 */
package org.nasdanika.amur.it.js.foundation;

import org.nasdanika.amur.it.js.AbstractErrorTransition;

import org.nasdanika.amur.lang.Source;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.ErrorTransition#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.ErrorTransition#getHandler <em>Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getErrorTransition()
 * @model
 * @generated
 */
public interface ErrorTransition extends AbstractErrorTransition {

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Source)
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getErrorTransition_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Source getCondition();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.foundation.ErrorTransition#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Source value);

	/**
	 * Returns the value of the '<em><b>Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler</em>' containment reference.
	 * @see #setHandler(Source)
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getErrorTransition_Handler()
	 * @model containment="true"
	 * @generated
	 */
	Source getHandler();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.foundation.ErrorTransition#getHandler <em>Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler</em>' containment reference.
	 * @see #getHandler()
	 * @generated
	 */
	void setHandler(Source value);
} // ErrorTransition
