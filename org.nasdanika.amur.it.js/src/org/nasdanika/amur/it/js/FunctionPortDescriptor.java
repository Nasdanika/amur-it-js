/**
 */
package org.nasdanika.amur.it.js;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Port Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.FunctionPortDescriptor#getThrownErrors <em>Thrown Errors</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.FunctionPortDescriptor#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.it.js.JsPackage#getFunctionPortDescriptor()
 * @model
 * @generated
 */
public interface FunctionPortDescriptor extends PortDescriptor {
	/**
	 * Returns the value of the '<em><b>Thrown Errors</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.amur.it.js.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thrown Errors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thrown Errors</em>' containment reference list.
	 * @see org.nasdanika.amur.it.js.JsPackage#getFunctionPortDescriptor_ThrownErrors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getThrownErrors();

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
	 * @see org.nasdanika.amur.it.js.JsPackage#getFunctionPortDescriptor_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // FunctionPortDescriptor
