/**
 */
package org.nasdanika.amur.it.js.exec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.exec.Property#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.Property#getMutator <em>Mutator</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.Property#getMutatorParameterName <em>Mutator Parameter Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends Initializer {
	/**
	 * Returns the value of the '<em><b>Accessor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessor</em>' attribute.
	 * @see #setAccessor(String)
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getProperty_Accessor()
	 * @model
	 * @generated
	 */
	String getAccessor();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.exec.Property#getAccessor <em>Accessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessor</em>' attribute.
	 * @see #getAccessor()
	 * @generated
	 */
	void setAccessor(String value);

	/**
	 * Returns the value of the '<em><b>Mutator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutator</em>' attribute.
	 * @see #setMutator(String)
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getProperty_Mutator()
	 * @model
	 * @generated
	 */
	String getMutator();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.exec.Property#getMutator <em>Mutator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutator</em>' attribute.
	 * @see #getMutator()
	 * @generated
	 */
	void setMutator(String value);

	/**
	 * Returns the value of the '<em><b>Mutator Parameter Name</b></em>' attribute.
	 * The default value is <code>"newValue"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutator Parameter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutator Parameter Name</em>' attribute.
	 * @see #setMutatorParameterName(String)
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getProperty_MutatorParameterName()
	 * @model default="newValue"
	 * @generated
	 */
	String getMutatorParameterName();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.exec.Property#getMutatorParameterName <em>Mutator Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutator Parameter Name</em>' attribute.
	 * @see #getMutatorParameterName()
	 * @generated
	 */
	void setMutatorParameterName(String value);

} // Property
