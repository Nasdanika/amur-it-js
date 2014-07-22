/**
 */
package org.nasdanika.amur.it.js.foundation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.nasdanika.amur.it.js.foundation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FoundationFactoryImpl extends EFactoryImpl implements FoundationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FoundationFactory init() {
		try {
			FoundationFactory theFoundationFactory = (FoundationFactory)EPackage.Registry.INSTANCE.getEFactory(FoundationPackage.eNS_URI);
			if (theFoundationFactory != null) {
				return theFoundationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FoundationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoundationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FoundationPackage.CALL: return (EObject)createCall();
			case FoundationPackage.TRANSITION: return (EObject)createTransition();
			case FoundationPackage.SCHEDULED_TRANSITION: return (EObject)createScheduledTransition();
			case FoundationPackage.REFERENCE: return (EObject)createReference();
			case FoundationPackage.ERROR_TRANSITION: return (EObject)createErrorTransition();
			case FoundationPackage.ERROR_HANDLER: return (EObject)createErrorHandler();
			case FoundationPackage.EVENT_LISTENER: return (EObject)createEventListener();
			case FoundationPackage.TOP_LEVEL_FLOW: return (EObject)createTopLevelFlow();
			case FoundationPackage.PROPERTY_INPUT_PORT: return (EObject)createPropertyInputPort();
			case FoundationPackage.FUNCTION_INPUT_PORT: return (EObject)createFunctionInputPort();
			case FoundationPackage.PROPERTY_OUTPUT_PORT: return (EObject)createPropertyOutputPort();
			case FoundationPackage.FUNCTION_OUTPUT_PORT: return (EObject)createFunctionOutputPort();
			case FoundationPackage.ACTIVITY: return (EObject)createActivity();
			case FoundationPackage.SUITE: return (EObject)createSuite();
			case FoundationPackage.GENERIC_NODE: return (EObject)createGenericNode();
			case FoundationPackage.OBJECT_NODE: return (EObject)createObjectNode();
			case FoundationPackage.USER_TASK: return (EObject)createUserTask();
			case FoundationPackage.SUB_FLOW: return (EObject)createSubFlow();
			case FoundationPackage.PARTICIPANT: return (EObject)createParticipant();
			case FoundationPackage.GENERIC_CONTAINER: return (EObject)createGenericContainer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FoundationPackage.SCHEDULED_TRANSITION_TYPE:
				return createScheduledTransitionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FoundationPackage.SCHEDULED_TRANSITION_TYPE:
				return convertScheduledTransitionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call createCall() {
		CallImpl call = new CallImpl();
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduledTransition createScheduledTransition() {
		ScheduledTransitionImpl scheduledTransition = new ScheduledTransitionImpl();
		return scheduledTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorTransition createErrorTransition() {
		ErrorTransitionImpl errorTransition = new ErrorTransitionImpl();
		return errorTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorHandler createErrorHandler() {
		ErrorHandlerImpl errorHandler = new ErrorHandlerImpl();
		return errorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventListener createEventListener() {
		EventListenerImpl eventListener = new EventListenerImpl();
		return eventListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevelFlow createTopLevelFlow() {
		TopLevelFlowImpl topLevelFlow = new TopLevelFlowImpl();
		return topLevelFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyInputPort createPropertyInputPort() {
		PropertyInputPortImpl propertyInputPort = new PropertyInputPortImpl();
		return propertyInputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInputPort createFunctionInputPort() {
		FunctionInputPortImpl functionInputPort = new FunctionInputPortImpl();
		return functionInputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyOutputPort createPropertyOutputPort() {
		PropertyOutputPortImpl propertyOutputPort = new PropertyOutputPortImpl();
		return propertyOutputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionOutputPort createFunctionOutputPort() {
		FunctionOutputPortImpl functionOutputPort = new FunctionOutputPortImpl();
		return functionOutputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Suite createSuite() {
		SuiteImpl suite = new SuiteImpl();
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericNode createGenericNode() {
		GenericNodeImpl genericNode = new GenericNodeImpl();
		return genericNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNode createObjectNode() {
		ObjectNodeImpl objectNode = new ObjectNodeImpl();
		return objectNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTask createUserTask() {
		UserTaskImpl userTask = new UserTaskImpl();
		return userTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubFlow createSubFlow() {
		SubFlowImpl subFlow = new SubFlowImpl();
		return subFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericContainer createGenericContainer() {
		GenericContainerImpl genericContainer = new GenericContainerImpl();
		return genericContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduledTransitionType createScheduledTransitionTypeFromString(EDataType eDataType, String initialValue) {
		ScheduledTransitionType result = ScheduledTransitionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScheduledTransitionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoundationPackage getFoundationPackage() {
		return (FoundationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FoundationPackage getPackage() {
		return FoundationPackage.eINSTANCE;
	}

} //FoundationFactoryImpl
