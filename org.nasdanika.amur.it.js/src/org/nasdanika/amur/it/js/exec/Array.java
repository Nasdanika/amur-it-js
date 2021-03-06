/**
 */
package org.nasdanika.amur.it.js.exec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.exec.Array#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getArray()
 * @model
 * @generated
 */
public interface Array extends Initializer {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.amur.it.js.exec.Initializer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getArray_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Initializer> getElements();

} // Array
