/**
 */
package org.nasdanika.amur.it.js.foundation;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.amur.it.js.AbstractTransition;
import org.nasdanika.amur.it.js.Join;
import org.nasdanika.amur.it.js.Parameter;

import org.nasdanika.amur.lang.Source;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.Transition#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.Transition#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.Transition#getHandler <em>Handler</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.Transition#isDispatch <em>Dispatch</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.Transition#getJoinType <em>Join Type</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.Transition#getOutputParameters <em>Output Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends AbstractTransition {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Source)
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getTransition_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Source getCondition();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.foundation.Transition#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Source value);

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
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getTransition_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

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
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getTransition_Handler()
	 * @model containment="true"
	 * @generated
	 */
	Source getHandler();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.foundation.Transition#getHandler <em>Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler</em>' containment reference.
	 * @see #getHandler()
	 * @generated
	 */
	void setHandler(Source value);

	/**
	 * Returns the value of the '<em><b>Dispatch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispatch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispatch</em>' attribute.
	 * @see #setDispatch(boolean)
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getTransition_Dispatch()
	 * @model
	 * @generated
	 */
	boolean isDispatch();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.foundation.Transition#isDispatch <em>Dispatch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispatch</em>' attribute.
	 * @see #isDispatch()
	 * @generated
	 */
	void setDispatch(boolean value);

	/**
	 * Returns the value of the '<em><b>Join Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.amur.it.js.Join}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Type</em>' attribute.
	 * @see org.nasdanika.amur.it.js.Join
	 * @see #setJoinType(Join)
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getTransition_JoinType()
	 * @model
	 * @generated
	 */
	Join getJoinType();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.foundation.Transition#getJoinType <em>Join Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Type</em>' attribute.
	 * @see org.nasdanika.amur.it.js.Join
	 * @see #getJoinType()
	 * @generated
	 */
	void setJoinType(Join value);

	/**
	 * Returns the value of the '<em><b>Output Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.amur.it.js.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Parameters</em>' containment reference list.
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#getTransition_OutputParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getOutputParameters();
	
} // Transition
