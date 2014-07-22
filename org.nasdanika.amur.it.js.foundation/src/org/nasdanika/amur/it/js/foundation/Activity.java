/**
 */
package org.nasdanika.amur.it.js.foundation;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.amur.it.js.AbstractNode;
import org.nasdanika.amur.it.js.Parameter;

import org.nasdanika.amur.lang.Source;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.Activity#getInputParameters <em>Input Parameters</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.Activity#getHandler <em>Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends AbstractNode {

	/**
	 * Returns the value of the '<em><b>Input Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.amur.it.js.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameters</em>' containment reference list.
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getActivity_InputParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getInputParameters();

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
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getActivity_Handler()
	 * @model containment="true"
	 * @generated
	 */
	Source getHandler();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.foundation.Activity#getHandler <em>Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler</em>' containment reference.
	 * @see #getHandler()
	 * @generated
	 */
	void setHandler(Source value);
} // Activity
