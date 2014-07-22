/**
 */
package org.nasdanika.amur.it.js.foundation;

import org.nasdanika.amur.it.js.AbstractReference;
import org.nasdanika.amur.it.js.ReferenceScope;

import org.nasdanika.amur.lang.Source;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.Reference#getScope <em>Scope</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.Reference#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.Reference#getMutator <em>Mutator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends AbstractReference {

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
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getReference_Scope()
	 * @model default="Invocation"
	 * @generated
	 */
	ReferenceScope getScope();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.foundation.Reference#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see org.nasdanika.amur.it.js.ReferenceScope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(ReferenceScope value);

	/**
	 * Returns the value of the '<em><b>Accessor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessor</em>' containment reference.
	 * @see #setAccessor(Source)
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getReference_Accessor()
	 * @model containment="true"
	 * @generated
	 */
	Source getAccessor();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.foundation.Reference#getAccessor <em>Accessor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessor</em>' containment reference.
	 * @see #getAccessor()
	 * @generated
	 */
	void setAccessor(Source value);

	/**
	 * Returns the value of the '<em><b>Mutator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutator</em>' containment reference.
	 * @see #setMutator(Source)
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getReference_Mutator()
	 * @model containment="true"
	 * @generated
	 */
	Source getMutator();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.foundation.Reference#getMutator <em>Mutator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutator</em>' containment reference.
	 * @see #getMutator()
	 * @generated
	 */
	void setMutator(Source value);
} // Reference
