/**
 */
package org.nasdanika.amur.it.js.foundation;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.amur.it.js.AbstractNode;
import org.nasdanika.amur.it.js.Parameter;

import org.nasdanika.amur.lang.Source;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.UserTask#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.UserTask#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.UserTask#getValidation <em>Validation</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.UserTask#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getUserTask()
 * @model
 * @generated
 */
public interface UserTask extends AbstractNode {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.amur.it.js.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getUserTask_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation</em>' containment reference.
	 * @see #setPresentation(Source)
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getUserTask_Presentation()
	 * @model containment="true"
	 * @generated
	 */
	Source getPresentation();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.foundation.UserTask#getPresentation <em>Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' containment reference.
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(Source value);

	/**
	 * Returns the value of the '<em><b>Validation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation</em>' containment reference.
	 * @see #setValidation(Source)
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getUserTask_Validation()
	 * @model containment="true"
	 * @generated
	 */
	Source getValidation();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.foundation.UserTask#getValidation <em>Validation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation</em>' containment reference.
	 * @see #getValidation()
	 * @generated
	 */
	void setValidation(Source value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Source)
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getUserTask_Action()
	 * @model containment="true"
	 * @generated
	 */
	Source getAction();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.foundation.UserTask#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Source value);

} // UserTask
