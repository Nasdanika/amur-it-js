/**
 */
package org.nasdanika.amur.it.js.foundation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.amur.it.js.JsPackage;
import org.nasdanika.amur.it.js.foundation.Activity;
import org.nasdanika.amur.it.js.foundation.Call;
import org.nasdanika.amur.it.js.foundation.ErrorHandler;
import org.nasdanika.amur.it.js.foundation.ErrorTransition;
import org.nasdanika.amur.it.js.foundation.EventListener;
import org.nasdanika.amur.it.js.foundation.FoundationFactory;
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
import org.nasdanika.amur.it.js.foundation.ScheduledTransitionType;
import org.nasdanika.amur.it.js.foundation.SubFlow;
import org.nasdanika.amur.it.js.foundation.Suite;
import org.nasdanika.amur.it.js.foundation.TopLevelFlow;
import org.nasdanika.amur.it.js.foundation.Transition;
import org.nasdanika.amur.it.js.foundation.UserTask;

import org.nasdanika.amur.lang.LangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FoundationPackageImpl extends EPackageImpl implements FoundationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduledTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topLevelFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyInputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionInputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyOutputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionOutputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scheduledTransitionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FoundationPackageImpl() {
		super(eNS_URI, FoundationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FoundationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FoundationPackage init() {
		if (isInited) return (FoundationPackage)EPackage.Registry.INSTANCE.getEPackage(FoundationPackage.eNS_URI);

		// Obtain or create and register package
		FoundationPackageImpl theFoundationPackage = (FoundationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FoundationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FoundationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		JsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFoundationPackage.createPackageContents();

		// Initialize created meta-data
		theFoundationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFoundationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FoundationPackage.eNS_URI, theFoundationPackage);
		return theFoundationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCall() {
		return callEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCall_Parameters() {
		return (EReference)callEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCall_Handler() {
		return (EReference)callEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Condition() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Parameters() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Handler() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Dispatch() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_JoinType() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_OutputParameters() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduledTransition() {
		return scheduledTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduledTransition_Type() {
		return (EAttribute)scheduledTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduledTransition_Period() {
		return (EReference)scheduledTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReference_Scope() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Accessor() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Mutator() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorTransition() {
		return errorTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorTransition_Condition() {
		return (EReference)errorTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorTransition_Handler() {
		return (EReference)errorTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorHandler() {
		return errorHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorHandler_Condition() {
		return (EReference)errorHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorHandler_Handler() {
		return (EReference)errorHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventListener() {
		return eventListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventListener_Condition() {
		return (EReference)eventListenerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventListener_Handler() {
		return (EReference)eventListenerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopLevelFlow() {
		return topLevelFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopLevelFlow_ScriptFolder() {
		return (EAttribute)topLevelFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopLevelFlow_ResourceFolder() {
		return (EAttribute)topLevelFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopLevelFlow_Skeleton() {
		return (EAttribute)topLevelFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyInputPort() {
		return propertyInputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyInputPort_Accessor() {
		return (EReference)propertyInputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyInputPort_Mutator() {
		return (EReference)propertyInputPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionInputPort() {
		return functionInputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionInputPort_InputParameters() {
		return (EReference)functionInputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionInputPort_Handler() {
		return (EReference)functionInputPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyOutputPort() {
		return propertyOutputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionOutputPort() {
		return functionOutputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionOutputPort_Parameters() {
		return (EReference)functionOutputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_InputParameters() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Handler() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuite() {
		return suiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuite_Components() {
		return (EAttribute)suiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericNode() {
		return genericNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericNode_Icon() {
		return (EAttribute)genericNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericNode_Image() {
		return (EAttribute)genericNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectNode() {
		return objectNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectNode_Scope() {
		return (EAttribute)objectNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectNode_Selector() {
		return (EReference)objectNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserTask() {
		return userTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTask_Parameters() {
		return (EReference)userTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTask_Presentation() {
		return (EReference)userTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTask_Validation() {
		return (EReference)userTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTask_Action() {
		return (EReference)userTaskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubFlow() {
		return subFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipant() {
		return participantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipant_Scope() {
		return (EAttribute)participantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_Selector() {
		return (EReference)participantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_InputPorts() {
		return (EReference)participantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_OutputPorts() {
		return (EReference)participantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericContainer() {
		return genericContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericContainer_Icon() {
		return (EAttribute)genericContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScheduledTransitionType() {
		return scheduledTransitionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoundationFactory getFoundationFactory() {
		return (FoundationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		callEClass = createEClass(CALL);
		createEReference(callEClass, CALL__PARAMETERS);
		createEReference(callEClass, CALL__HANDLER);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__CONDITION);
		createEReference(transitionEClass, TRANSITION__PARAMETERS);
		createEReference(transitionEClass, TRANSITION__HANDLER);
		createEAttribute(transitionEClass, TRANSITION__DISPATCH);
		createEAttribute(transitionEClass, TRANSITION__JOIN_TYPE);
		createEReference(transitionEClass, TRANSITION__OUTPUT_PARAMETERS);

		scheduledTransitionEClass = createEClass(SCHEDULED_TRANSITION);
		createEAttribute(scheduledTransitionEClass, SCHEDULED_TRANSITION__TYPE);
		createEReference(scheduledTransitionEClass, SCHEDULED_TRANSITION__PERIOD);

		referenceEClass = createEClass(REFERENCE);
		createEAttribute(referenceEClass, REFERENCE__SCOPE);
		createEReference(referenceEClass, REFERENCE__ACCESSOR);
		createEReference(referenceEClass, REFERENCE__MUTATOR);

		errorTransitionEClass = createEClass(ERROR_TRANSITION);
		createEReference(errorTransitionEClass, ERROR_TRANSITION__CONDITION);
		createEReference(errorTransitionEClass, ERROR_TRANSITION__HANDLER);

		errorHandlerEClass = createEClass(ERROR_HANDLER);
		createEReference(errorHandlerEClass, ERROR_HANDLER__CONDITION);
		createEReference(errorHandlerEClass, ERROR_HANDLER__HANDLER);

		eventListenerEClass = createEClass(EVENT_LISTENER);
		createEReference(eventListenerEClass, EVENT_LISTENER__CONDITION);
		createEReference(eventListenerEClass, EVENT_LISTENER__HANDLER);

		topLevelFlowEClass = createEClass(TOP_LEVEL_FLOW);
		createEAttribute(topLevelFlowEClass, TOP_LEVEL_FLOW__SCRIPT_FOLDER);
		createEAttribute(topLevelFlowEClass, TOP_LEVEL_FLOW__RESOURCE_FOLDER);
		createEAttribute(topLevelFlowEClass, TOP_LEVEL_FLOW__SKELETON);

		propertyInputPortEClass = createEClass(PROPERTY_INPUT_PORT);
		createEReference(propertyInputPortEClass, PROPERTY_INPUT_PORT__ACCESSOR);
		createEReference(propertyInputPortEClass, PROPERTY_INPUT_PORT__MUTATOR);

		functionInputPortEClass = createEClass(FUNCTION_INPUT_PORT);
		createEReference(functionInputPortEClass, FUNCTION_INPUT_PORT__INPUT_PARAMETERS);
		createEReference(functionInputPortEClass, FUNCTION_INPUT_PORT__HANDLER);

		propertyOutputPortEClass = createEClass(PROPERTY_OUTPUT_PORT);

		functionOutputPortEClass = createEClass(FUNCTION_OUTPUT_PORT);
		createEReference(functionOutputPortEClass, FUNCTION_OUTPUT_PORT__PARAMETERS);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__INPUT_PARAMETERS);
		createEReference(activityEClass, ACTIVITY__HANDLER);

		suiteEClass = createEClass(SUITE);
		createEAttribute(suiteEClass, SUITE__COMPONENTS);

		genericNodeEClass = createEClass(GENERIC_NODE);
		createEAttribute(genericNodeEClass, GENERIC_NODE__ICON);
		createEAttribute(genericNodeEClass, GENERIC_NODE__IMAGE);

		objectNodeEClass = createEClass(OBJECT_NODE);
		createEAttribute(objectNodeEClass, OBJECT_NODE__SCOPE);
		createEReference(objectNodeEClass, OBJECT_NODE__SELECTOR);

		userTaskEClass = createEClass(USER_TASK);
		createEReference(userTaskEClass, USER_TASK__PARAMETERS);
		createEReference(userTaskEClass, USER_TASK__PRESENTATION);
		createEReference(userTaskEClass, USER_TASK__VALIDATION);
		createEReference(userTaskEClass, USER_TASK__ACTION);

		subFlowEClass = createEClass(SUB_FLOW);

		participantEClass = createEClass(PARTICIPANT);
		createEAttribute(participantEClass, PARTICIPANT__SCOPE);
		createEReference(participantEClass, PARTICIPANT__SELECTOR);
		createEReference(participantEClass, PARTICIPANT__INPUT_PORTS);
		createEReference(participantEClass, PARTICIPANT__OUTPUT_PORTS);

		genericContainerEClass = createEClass(GENERIC_CONTAINER);
		createEAttribute(genericContainerEClass, GENERIC_CONTAINER__ICON);

		// Create enums
		scheduledTransitionTypeEEnum = createEEnum(SCHEDULED_TRANSITION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		JsPackage theJsPackage = (JsPackage)EPackage.Registry.INSTANCE.getEPackage(JsPackage.eNS_URI);
		LangPackage theLangPackage = (LangPackage)EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		callEClass.getESuperTypes().add(theJsPackage.getAbstractCall());
		transitionEClass.getESuperTypes().add(theJsPackage.getAbstractTransition());
		scheduledTransitionEClass.getESuperTypes().add(this.getTransition());
		referenceEClass.getESuperTypes().add(theJsPackage.getAbstractReference());
		errorTransitionEClass.getESuperTypes().add(theJsPackage.getAbstractErrorTransition());
		errorHandlerEClass.getESuperTypes().add(theJsPackage.getAbstractErrorHandler());
		eventListenerEClass.getESuperTypes().add(theJsPackage.getAbstractEventListener());
		topLevelFlowEClass.getESuperTypes().add(theJsPackage.getAbstractNode());
		propertyInputPortEClass.getESuperTypes().add(theJsPackage.getAbstractNode());
		functionInputPortEClass.getESuperTypes().add(theJsPackage.getAbstractNode());
		propertyOutputPortEClass.getESuperTypes().add(theJsPackage.getAbstractNode());
		functionOutputPortEClass.getESuperTypes().add(theJsPackage.getAbstractNode());
		activityEClass.getESuperTypes().add(theJsPackage.getAbstractNode());
		suiteEClass.getESuperTypes().add(theJsPackage.getAbstractNode());
		genericNodeEClass.getESuperTypes().add(theJsPackage.getAbstractNode());
		objectNodeEClass.getESuperTypes().add(theJsPackage.getAbstractNode());
		userTaskEClass.getESuperTypes().add(theJsPackage.getAbstractNode());
		subFlowEClass.getESuperTypes().add(theJsPackage.getAbstractNode());
		participantEClass.getESuperTypes().add(theJsPackage.getAbstractNode());
		genericContainerEClass.getESuperTypes().add(theJsPackage.getAbstractNode());

		// Initialize classes and features; add operations and parameters
		initEClass(callEClass, Call.class, "Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCall_Parameters(), theJsPackage.getParameter(), null, "parameters", null, 0, -1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCall_Handler(), theLangPackage.getSource(), null, "handler", null, 0, 1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Condition(), theLangPackage.getSource(), null, "condition", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Parameters(), theJsPackage.getParameter(), null, "parameters", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Handler(), theLangPackage.getSource(), null, "handler", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Dispatch(), theEcorePackage.getEBoolean(), "dispatch", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_JoinType(), theJsPackage.getJoin(), "joinType", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_OutputParameters(), theJsPackage.getParameter(), null, "outputParameters", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scheduledTransitionEClass, ScheduledTransition.class, "ScheduledTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScheduledTransition_Type(), this.getScheduledTransitionType(), "type", null, 0, 1, ScheduledTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScheduledTransition_Period(), theLangPackage.getSource(), null, "period", null, 0, 1, ScheduledTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReference_Scope(), theJsPackage.getReferenceScope(), "scope", "Invocation", 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_Accessor(), theLangPackage.getSource(), null, "accessor", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_Mutator(), theLangPackage.getSource(), null, "mutator", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorTransitionEClass, ErrorTransition.class, "ErrorTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorTransition_Condition(), theLangPackage.getSource(), null, "condition", null, 0, 1, ErrorTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorTransition_Handler(), theLangPackage.getSource(), null, "handler", null, 0, 1, ErrorTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorHandlerEClass, ErrorHandler.class, "ErrorHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorHandler_Condition(), theLangPackage.getSource(), null, "condition", null, 0, 1, ErrorHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorHandler_Handler(), theLangPackage.getSource(), null, "handler", null, 0, 1, ErrorHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventListenerEClass, EventListener.class, "EventListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventListener_Condition(), theLangPackage.getSource(), null, "condition", null, 0, 1, EventListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventListener_Handler(), theLangPackage.getSource(), null, "handler", null, 0, 1, EventListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topLevelFlowEClass, TopLevelFlow.class, "TopLevelFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTopLevelFlow_ScriptFolder(), theEcorePackage.getEString(), "scriptFolder", null, 0, 1, TopLevelFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopLevelFlow_ResourceFolder(), theEcorePackage.getEString(), "resourceFolder", null, 0, 1, TopLevelFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopLevelFlow_Skeleton(), theEcorePackage.getEString(), "skeleton", null, 0, 1, TopLevelFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyInputPortEClass, PropertyInputPort.class, "PropertyInputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyInputPort_Accessor(), theLangPackage.getSource(), null, "accessor", null, 0, 1, PropertyInputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyInputPort_Mutator(), theLangPackage.getSource(), null, "mutator", null, 0, 1, PropertyInputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionInputPortEClass, FunctionInputPort.class, "FunctionInputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionInputPort_InputParameters(), theJsPackage.getParameter(), null, "inputParameters", null, 0, -1, FunctionInputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionInputPort_Handler(), theLangPackage.getSource(), null, "handler", null, 0, 1, FunctionInputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyOutputPortEClass, PropertyOutputPort.class, "PropertyOutputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionOutputPortEClass, FunctionOutputPort.class, "FunctionOutputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionOutputPort_Parameters(), theJsPackage.getParameter(), null, "parameters", null, 0, -1, FunctionOutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_InputParameters(), theJsPackage.getParameter(), null, "inputParameters", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Handler(), theLangPackage.getSource(), null, "handler", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(suiteEClass, Suite.class, "Suite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuite_Components(), theEcorePackage.getEString(), "components", null, 0, -1, Suite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericNodeEClass, GenericNode.class, "GenericNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericNode_Icon(), theEcorePackage.getEString(), "icon", null, 0, 1, GenericNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericNode_Image(), theEcorePackage.getEString(), "image", null, 0, 1, GenericNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectNodeEClass, ObjectNode.class, "ObjectNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectNode_Scope(), theJsPackage.getReferenceScope(), "scope", "Invocation", 0, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectNode_Selector(), theLangPackage.getSource(), null, "selector", null, 0, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userTaskEClass, UserTask.class, "UserTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserTask_Parameters(), theJsPackage.getParameter(), null, "parameters", null, 0, -1, UserTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserTask_Presentation(), theLangPackage.getSource(), null, "presentation", null, 0, 1, UserTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserTask_Validation(), theLangPackage.getSource(), null, "validation", null, 0, 1, UserTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserTask_Action(), theLangPackage.getSource(), null, "action", null, 0, 1, UserTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subFlowEClass, SubFlow.class, "SubFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(participantEClass, Participant.class, "Participant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParticipant_Scope(), theJsPackage.getReferenceScope(), "scope", "Invocation", 0, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParticipant_Selector(), theLangPackage.getSource(), null, "selector", null, 0, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParticipant_InputPorts(), theJsPackage.getPortDescriptor(), null, "inputPorts", null, 0, -1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParticipant_OutputPorts(), theJsPackage.getPortDescriptor(), null, "outputPorts", null, 0, -1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericContainerEClass, GenericContainer.class, "GenericContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericContainer_Icon(), theEcorePackage.getEString(), "icon", null, 0, 1, GenericContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(scheduledTransitionTypeEEnum, ScheduledTransitionType.class, "ScheduledTransitionType");
		addEEnumLiteral(scheduledTransitionTypeEEnum, ScheduledTransitionType.TIMEOUT);
		addEEnumLiteral(scheduledTransitionTypeEEnum, ScheduledTransitionType.DELAY);
		addEEnumLiteral(scheduledTransitionTypeEEnum, ScheduledTransitionType.INTERVAL);

		// Create resource
		createResource(eNS_URI);
	}

} //FoundationPackageImpl
