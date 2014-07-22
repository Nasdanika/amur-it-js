/**
 */
package org.nasdanika.amur.it.js.foundation;

import org.nasdanika.amur.lang.Source;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.amur.it.js.AbstractNode;
import org.nasdanika.amur.it.js.PortDescriptor;
import org.nasdanika.amur.it.js.ReferenceScope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.Participant#getScope <em>Scope</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.Participant#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.Participant#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.Participant#getOutputPorts <em>Output Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends AbstractNode {
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
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getParticipant_Scope()
	 * @model default="Invocation"
	 * @generated
	 */
	ReferenceScope getScope();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.foundation.Participant#getScope <em>Scope</em>}' attribute.
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
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getParticipant_Selector()
	 * @model containment="true"
	 * @generated
	 */
	Source getSelector();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.foundation.Participant#getSelector <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' containment reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(Source value);

	/**
	 * Returns the value of the '<em><b>Input Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.amur.it.js.PortDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Ports</em>' containment reference list.
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getParticipant_InputPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortDescriptor> getInputPorts();

	/**
	 * Returns the value of the '<em><b>Output Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.amur.it.js.PortDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Ports</em>' containment reference list.
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getParticipant_OutputPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortDescriptor> getOutputPorts();

} // Participant
