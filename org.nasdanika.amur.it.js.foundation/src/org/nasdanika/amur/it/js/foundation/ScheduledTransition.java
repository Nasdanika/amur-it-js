/**
 */
package org.nasdanika.amur.it.js.foundation;

import org.nasdanika.amur.lang.Source;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduled Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.ScheduledTransition#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.ScheduledTransition#getPeriod <em>Period</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getScheduledTransition()
 * @model
 * @generated
 */
public interface ScheduledTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Source)
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getScheduledTransition_Period()
	 * @model containment="true"
	 * @generated
	 */
	Source getPeriod();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.foundation.ScheduledTransition#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Source value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.amur.it.js.foundation.ScheduledTransitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.amur.it.js.foundation.ScheduledTransitionType
	 * @see #setType(ScheduledTransitionType)
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getScheduledTransition_Type()
	 * @model
	 * @generated
	 */
	ScheduledTransitionType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.foundation.ScheduledTransition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.amur.it.js.foundation.ScheduledTransitionType
	 * @see #getType()
	 * @generated
	 */
	void setType(ScheduledTransitionType value);

} // ScheduledTransition
