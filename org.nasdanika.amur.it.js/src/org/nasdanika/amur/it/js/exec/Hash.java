/**
 */
package org.nasdanika.amur.it.js.exec;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hash</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.exec.Hash#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.Hash#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getHash()
 * @model
 * @generated
 */
public interface Hash extends Initializer {
	
	String INLINE_KEY = "__INLINE";
	
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.nasdanika.amur.it.js.exec.Initializer},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' map.
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getHash_Entries()
	 * @model mapType="org.nasdanika.amur.it.js.exec.HashEntry<org.eclipse.emf.ecore.EString, org.nasdanika.amur.it.js.exec.Initializer>"
	 * @generated
	 */
	EMap<String, Initializer> getEntries();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getHash_Path()
	 * @model default="" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getPath();
	
	boolean isEmpty();

} // Hash
