/**
 */
package org.nasdanika.amur.it.js.foundation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage
 * @generated
 */
public interface FoundationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FoundationFactory eINSTANCE = org.nasdanika.amur.it.js.foundation.impl.FoundationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call</em>'.
	 * @generated
	 */
	Call createCall();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Scheduled Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduled Transition</em>'.
	 * @generated
	 */
	ScheduledTransition createScheduledTransition();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns a new object of class '<em>Error Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Transition</em>'.
	 * @generated
	 */
	ErrorTransition createErrorTransition();

	/**
	 * Returns a new object of class '<em>Error Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Handler</em>'.
	 * @generated
	 */
	ErrorHandler createErrorHandler();

	/**
	 * Returns a new object of class '<em>Event Listener</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Listener</em>'.
	 * @generated
	 */
	EventListener createEventListener();

	/**
	 * Returns a new object of class '<em>Top Level Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Top Level Flow</em>'.
	 * @generated
	 */
	TopLevelFlow createTopLevelFlow();

	/**
	 * Returns a new object of class '<em>Property Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Input Port</em>'.
	 * @generated
	 */
	PropertyInputPort createPropertyInputPort();

	/**
	 * Returns a new object of class '<em>Function Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Input Port</em>'.
	 * @generated
	 */
	FunctionInputPort createFunctionInputPort();

	/**
	 * Returns a new object of class '<em>Property Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Output Port</em>'.
	 * @generated
	 */
	PropertyOutputPort createPropertyOutputPort();

	/**
	 * Returns a new object of class '<em>Function Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Output Port</em>'.
	 * @generated
	 */
	FunctionOutputPort createFunctionOutputPort();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Suite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suite</em>'.
	 * @generated
	 */
	Suite createSuite();

	/**
	 * Returns a new object of class '<em>Generic Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Node</em>'.
	 * @generated
	 */
	GenericNode createGenericNode();

	/**
	 * Returns a new object of class '<em>Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Node</em>'.
	 * @generated
	 */
	ObjectNode createObjectNode();

	/**
	 * Returns a new object of class '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Task</em>'.
	 * @generated
	 */
	UserTask createUserTask();

	/**
	 * Returns a new object of class '<em>Sub Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Flow</em>'.
	 * @generated
	 */
	SubFlow createSubFlow();

	/**
	 * Returns a new object of class '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participant</em>'.
	 * @generated
	 */
	Participant createParticipant();

	/**
	 * Returns a new object of class '<em>Generic Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Container</em>'.
	 * @generated
	 */
	GenericContainer createGenericContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FoundationPackage getFoundationPackage();

} //FoundationFactory
