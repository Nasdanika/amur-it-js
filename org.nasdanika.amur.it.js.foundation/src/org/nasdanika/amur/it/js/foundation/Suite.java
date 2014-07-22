/**
 */
package org.nasdanika.amur.it.js.foundation;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.amur.it.js.AbstractNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.Suite#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getSuite()
 * @model
 * @generated
 */
public interface Suite extends AbstractNode {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' attribute list.
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getSuite_Components()
	 * @model
	 * @generated
	 */
	EList<String> getComponents();

} // Suite
