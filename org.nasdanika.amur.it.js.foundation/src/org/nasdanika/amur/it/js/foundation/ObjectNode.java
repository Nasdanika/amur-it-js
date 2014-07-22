/**
 */
package org.nasdanika.amur.it.js.foundation;

import org.nasdanika.amur.it.js.AbstractNode;
import org.nasdanika.amur.it.js.ReferenceScope;

import org.nasdanika.amur.lang.Source;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.ObjectNode#getScope <em>Scope</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.ObjectNode#getSelector <em>Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getObjectNode()
 * @model
 * @generated
 */
public interface ObjectNode extends AbstractNode {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The default value is <code>"Invocation"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.amur.it.js.ReferenceScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see org.nasdanika.amur.it.js.ReferenceScope
	 * @see #setScope(ReferenceScope)
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getObjectNode_Scope()
	 * @model default="Invocation"
	 * @generated
	 */
	ReferenceScope getScope();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.foundation.ObjectNode#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see org.nasdanika.amur.it.js.ReferenceScope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(ReferenceScope value);

	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference.
	 * @see #setSelector(Source)
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getObjectNode_Selector()
	 * @model containment="true"
	 * @generated
	 */
	Source getSelector();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.foundation.ObjectNode#getSelector <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' containment reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(Source value);

} // ObjectNode
