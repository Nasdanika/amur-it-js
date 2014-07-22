/**
 */
package org.nasdanika.amur.it.js.foundation.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.nasdanika.amur.ImplementationType;
import org.nasdanika.amur.it.js.AbstractCall;
import org.nasdanika.amur.it.js.AbstractErrorHandler;
import org.nasdanika.amur.it.js.AbstractErrorTransition;
import org.nasdanika.amur.it.js.AbstractEventListener;
import org.nasdanika.amur.it.js.AbstractNode;
import org.nasdanika.amur.it.js.AbstractReference;
import org.nasdanika.amur.it.js.AbstractTransition;
import org.nasdanika.amur.it.js.Component;
import org.nasdanika.amur.it.js.Connection;
import org.nasdanika.amur.it.js.foundation.Activity;
import org.nasdanika.amur.it.js.foundation.Call;
import org.nasdanika.amur.it.js.foundation.ErrorHandler;
import org.nasdanika.amur.it.js.foundation.ErrorTransition;
import org.nasdanika.amur.it.js.foundation.EventListener;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.FunctionInputPort;
import org.nasdanika.amur.it.js.foundation.FunctionOutputPort;
import org.nasdanika.amur.it.js.foundation.GenericContainer;
import org.nasdanika.amur.it.js.foundation.GenericNode;
import org.nasdanika.amur.it.js.foundation.ObjectNode;
import org.nasdanika.amur.it.js.foundation.Participant;
import org.nasdanika.amur.it.js.foundation.PropertyInputPort;
import org.nasdanika.amur.it.js.foundation.PropertyOutputPort;
import org.nasdanika.amur.it.js.foundation.Reference;
import org.nasdanika.amur.it.js.foundation.ScheduledTransition;
import org.nasdanika.amur.it.js.foundation.SubFlow;
import org.nasdanika.amur.it.js.foundation.Suite;
import org.nasdanika.amur.it.js.foundation.TopLevelFlow;
import org.nasdanika.amur.it.js.foundation.Transition;
import org.nasdanika.amur.it.js.foundation.UserTask;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage
 * @generated
 */
public class FoundationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FoundationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoundationSwitch() {
		if (modelPackage == null) {
			modelPackage = FoundationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FoundationPackage.CALL: {
				Call call = (Call)theEObject;
				T result = caseCall(call);
				if (result == null) result = caseAbstractCall(call);
				if (result == null) result = caseConnection(call);
				if (result == null) result = caseComponent(call);
				if (result == null) result = caseImplementationType(call);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoundationPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseAbstractTransition(transition);
				if (result == null) result = caseConnection(transition);
				if (result == null) result = caseComponent(transition);
				if (result == null) result = caseImplementationType(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoundationPackage.SCHEDULED_TRANSITION: {
				ScheduledTransition scheduledTransition = (ScheduledTransition)theEObject;
				T result = caseScheduledTransition(scheduledTransition);
				if (result == null) result = caseTransition(scheduledTransition);
				if (result == null) result = caseAbstractTransition(scheduledTransition);
				if (result == null) result = caseConnection(scheduledTransition);
				if (result == null) result = caseComponent(scheduledTransition);
				if (result == null) result = caseImplementationType(scheduledTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoundationPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseAbstractReference(reference);
				if (result == null) result = caseConnection(reference);
				if (result == null) result = caseComponent(reference);
				if (result == null) result = caseImplementationType(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoundationPackage.ERROR_TRANSITION: {
				ErrorTransition errorTransition = (ErrorTransition)theEObject;
				T result = caseErrorTransition(errorTransition);
				if (result == null) result = caseAbstractErrorTransition(errorTransition);
				if (result == null) result = caseConnection(errorTransition);
				if (result == null) result = caseComponent(errorTransition);
				if (result == null) result = caseImplementationType(errorTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoundationPackage.ERROR_HANDLER: {
				ErrorHandler errorHandler = (ErrorHandler)theEObject;
				T result = caseErrorHandler(errorHandler);
				if (result == null) result = caseAbstractErrorHandler(errorHandler);
				if (result == null) result = caseAbstractNode(errorHandler);
				if (result == null) result = caseComponent(errorHandler);
				if (result == null) result = caseImplementationType(errorHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoundationPackage.EVENT_LISTENER: {
				EventListener eventListener = (EventListener)theEObject;
				T result = caseEventListener(eventListener);
				if (result == null) result = caseAbstractEventListener(eventListener);
				if (result == null) result = caseAbstractNode(eventListener);
				if (result == null) result = caseComponent(eventListener);
				if (result == null) result = caseImplementationType(eventListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoundationPackage.TOP_LEVEL_FLOW: {
				TopLevelFlow topLevelFlow = (TopLevelFlow)theEObject;
				T result = caseTopLevelFlow(topLevelFlow);
				if (result == null) result = caseAbstractNode(topLevelFlow);
				if (result == null) result = caseComponent(topLevelFlow);
				if (result == null) result = caseImplementationType(topLevelFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoundationPackage.PROPERTY_INPUT_PORT: {
				PropertyInputPort propertyInputPort = (PropertyInputPort)theEObject;
				T result = casePropertyInputPort(propertyInputPort);
				if (result == null) result = caseAbstractNode(propertyInputPort);
				if (result == null) result = caseComponent(propertyInputPort);
				if (result == null) result = caseImplementationType(propertyInputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoundationPackage.FUNCTION_INPUT_PORT: {
				FunctionInputPort functionInputPort = (FunctionInputPort)theEObject;
				T result = caseFunctionInputPort(functionInputPort);
				if (result == null) result = caseAbstractNode(functionInputPort);
				if (result == null) result = caseComponent(functionInputPort);
				if (result == null) result = caseImplementationType(functionInputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoundationPackage.PROPERTY_OUTPUT_PORT: {
				PropertyOutputPort propertyOutputPort = (PropertyOutputPort)theEObject;
				T result = casePropertyOutputPort(propertyOutputPort);
				if (result == null) result = caseAbstractNode(propertyOutputPort);
				if (result == null) result = caseComponent(propertyOutputPort);
				if (result == null) result = caseImplementationType(propertyOutputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoundationPackage.FUNCTION_OUTPUT_PORT: {
				FunctionOutputPort functionOutputPort = (FunctionOutputPort)theEObject;
				T result = caseFunctionOutputPort(functionOutputPort);
				if (result == null) result = caseAbstractNode(functionOutputPort);
				if (result == null) result = caseComponent(functionOutputPort);
				if (result == null) result = caseImplementationType(functionOutputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoundationPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseAbstractNode(activity);
				if (result == null) result = caseComponent(activity);
				if (result == null) result = caseImplementationType(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoundationPackage.SUITE: {
				Suite suite = (Suite)theEObject;
				T result = caseSuite(suite);
				if (result == null) result = caseAbstractNode(suite);
				if (result == null) result = caseComponent(suite);
				if (result == null) result = caseImplementationType(suite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoundationPackage.GENERIC_NODE: {
				GenericNode genericNode = (GenericNode)theEObject;
				T result = caseGenericNode(genericNode);
				if (result == null) result = caseAbstractNode(genericNode);
				if (result == null) result = caseComponent(genericNode);
				if (result == null) result = caseImplementationType(genericNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoundationPackage.OBJECT_NODE: {
				ObjectNode objectNode = (ObjectNode)theEObject;
				T result = caseObjectNode(objectNode);
				if (result == null) result = caseAbstractNode(objectNode);
				if (result == null) result = caseComponent(objectNode);
				if (result == null) result = caseImplementationType(objectNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoundationPackage.USER_TASK: {
				UserTask userTask = (UserTask)theEObject;
				T result = caseUserTask(userTask);
				if (result == null) result = caseAbstractNode(userTask);
				if (result == null) result = caseComponent(userTask);
				if (result == null) result = caseImplementationType(userTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoundationPackage.SUB_FLOW: {
				SubFlow subFlow = (SubFlow)theEObject;
				T result = caseSubFlow(subFlow);
				if (result == null) result = caseAbstractNode(subFlow);
				if (result == null) result = caseComponent(subFlow);
				if (result == null) result = caseImplementationType(subFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoundationPackage.PARTICIPANT: {
				Participant participant = (Participant)theEObject;
				T result = caseParticipant(participant);
				if (result == null) result = caseAbstractNode(participant);
				if (result == null) result = caseComponent(participant);
				if (result == null) result = caseImplementationType(participant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FoundationPackage.GENERIC_CONTAINER: {
				GenericContainer genericContainer = (GenericContainer)theEObject;
				T result = caseGenericContainer(genericContainer);
				if (result == null) result = caseAbstractNode(genericContainer);
				if (result == null) result = caseComponent(genericContainer);
				if (result == null) result = caseImplementationType(genericContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCall(Call object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduled Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduled Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduledTransition(ScheduledTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorTransition(ErrorTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorHandler(ErrorHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventListener(EventListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Level Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Level Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopLevelFlow(TopLevelFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Input Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyInputPort(PropertyInputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Input Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionInputPort(FunctionInputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Output Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyOutputPort(PropertyOutputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Output Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionOutputPort(FunctionOutputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuite(Suite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericNode(GenericNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectNode(ObjectNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserTask(UserTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubFlow(SubFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant(Participant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericContainer(GenericContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationType(ImplementationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCall(AbstractCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTransition(AbstractTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractReference(AbstractReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Error Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Error Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractErrorTransition(AbstractErrorTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNode(AbstractNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Error Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Error Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractErrorHandler(AbstractErrorHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Event Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Event Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEventListener(AbstractEventListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FoundationSwitch
