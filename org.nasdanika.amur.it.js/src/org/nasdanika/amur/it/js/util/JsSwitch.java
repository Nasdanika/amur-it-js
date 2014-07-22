/**
 */
package org.nasdanika.amur.it.js.util;

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
import org.nasdanika.amur.it.js.FunctionPortDescriptor;
import org.nasdanika.amur.it.js.JoinEntry;
import org.nasdanika.amur.it.js.JsPackage;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.PortDescriptor;
import org.nasdanika.amur.it.js.PropertyPortDescriptor;

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
 * @see org.nasdanika.amur.it.js.JsPackage
 * @generated
 */
public class JsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsSwitch() {
		if (modelPackage == null) {
			modelPackage = JsPackage.eINSTANCE;
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
			case JsPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JsPackage.PORT_DESCRIPTOR: {
				PortDescriptor portDescriptor = (PortDescriptor)theEObject;
				T result = casePortDescriptor(portDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JsPackage.FUNCTION_PORT_DESCRIPTOR: {
				FunctionPortDescriptor functionPortDescriptor = (FunctionPortDescriptor)theEObject;
				T result = caseFunctionPortDescriptor(functionPortDescriptor);
				if (result == null) result = casePortDescriptor(functionPortDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JsPackage.PROPERTY_PORT_DESCRIPTOR: {
				PropertyPortDescriptor propertyPortDescriptor = (PropertyPortDescriptor)theEObject;
				T result = casePropertyPortDescriptor(propertyPortDescriptor);
				if (result == null) result = casePortDescriptor(propertyPortDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JsPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseImplementationType(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JsPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = caseComponent(connection);
				if (result == null) result = caseImplementationType(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JsPackage.ABSTRACT_NODE: {
				AbstractNode abstractNode = (AbstractNode)theEObject;
				T result = caseAbstractNode(abstractNode);
				if (result == null) result = caseComponent(abstractNode);
				if (result == null) result = caseImplementationType(abstractNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JsPackage.JOIN_ENTRY: {
				JoinEntry joinEntry = (JoinEntry)theEObject;
				T result = caseJoinEntry(joinEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JsPackage.ABSTRACT_CALL: {
				AbstractCall abstractCall = (AbstractCall)theEObject;
				T result = caseAbstractCall(abstractCall);
				if (result == null) result = caseConnection(abstractCall);
				if (result == null) result = caseComponent(abstractCall);
				if (result == null) result = caseImplementationType(abstractCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JsPackage.ABSTRACT_TRANSITION: {
				AbstractTransition abstractTransition = (AbstractTransition)theEObject;
				T result = caseAbstractTransition(abstractTransition);
				if (result == null) result = caseConnection(abstractTransition);
				if (result == null) result = caseComponent(abstractTransition);
				if (result == null) result = caseImplementationType(abstractTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JsPackage.ABSTRACT_REFERENCE: {
				AbstractReference abstractReference = (AbstractReference)theEObject;
				T result = caseAbstractReference(abstractReference);
				if (result == null) result = caseConnection(abstractReference);
				if (result == null) result = caseComponent(abstractReference);
				if (result == null) result = caseImplementationType(abstractReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JsPackage.ABSTRACT_ERROR_TRANSITION: {
				AbstractErrorTransition abstractErrorTransition = (AbstractErrorTransition)theEObject;
				T result = caseAbstractErrorTransition(abstractErrorTransition);
				if (result == null) result = caseConnection(abstractErrorTransition);
				if (result == null) result = caseComponent(abstractErrorTransition);
				if (result == null) result = caseImplementationType(abstractErrorTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JsPackage.ABSTRACT_ERROR_HANDLER: {
				AbstractErrorHandler abstractErrorHandler = (AbstractErrorHandler)theEObject;
				T result = caseAbstractErrorHandler(abstractErrorHandler);
				if (result == null) result = caseAbstractNode(abstractErrorHandler);
				if (result == null) result = caseComponent(abstractErrorHandler);
				if (result == null) result = caseImplementationType(abstractErrorHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JsPackage.ABSTRACT_EVENT_LISTENER: {
				AbstractEventListener abstractEventListener = (AbstractEventListener)theEObject;
				T result = caseAbstractEventListener(abstractEventListener);
				if (result == null) result = caseAbstractNode(abstractEventListener);
				if (result == null) result = caseComponent(abstractEventListener);
				if (result == null) result = caseImplementationType(abstractEventListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortDescriptor(PortDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Port Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Port Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionPortDescriptor(FunctionPortDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Port Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Port Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyPortDescriptor(PropertyPortDescriptor object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Join Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinEntry(JoinEntry object) {
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

} //JsSwitch
