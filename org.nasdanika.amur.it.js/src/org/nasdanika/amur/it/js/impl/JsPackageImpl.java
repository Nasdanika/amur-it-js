/**
 */
package org.nasdanika.amur.it.js.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.amur.it.js.AbstractCall;
import org.nasdanika.amur.it.js.AbstractErrorHandler;
import org.nasdanika.amur.it.js.AbstractErrorTransition;
import org.nasdanika.amur.it.js.AbstractEventListener;
import org.nasdanika.amur.it.js.AbstractNode;
import org.nasdanika.amur.it.js.AbstractReference;
import org.nasdanika.amur.it.js.AbstractTransition;
import org.nasdanika.amur.it.js.Cloning;
import org.nasdanika.amur.it.js.Component;
import org.nasdanika.amur.it.js.Connection;
import org.nasdanika.amur.it.js.FunctionPortDescriptor;
import org.nasdanika.amur.it.js.Join;
import org.nasdanika.amur.it.js.JoinEntry;
import org.nasdanika.amur.it.js.JoinScope;
import org.nasdanika.amur.it.js.JsFactory;
import org.nasdanika.amur.it.js.JsPackage;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.PortDescriptor;
import org.nasdanika.amur.it.js.PropertyPortDescriptor;
import org.nasdanika.amur.it.js.ReferenceScope;
import org.nasdanika.amur.it.js.exec.ExecPackage;
import org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl;

import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.lang.LangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsPackageImpl extends EPackageImpl implements JsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionPortDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyPortDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractErrorTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractErrorHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEventListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cloningEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum joinEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum joinScopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referenceScopeEEnum = null;

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
	 * @see org.nasdanika.amur.it.js.JsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JsPackageImpl() {
		super(eNS_URI, JsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JsPackage init() {
		if (isInited) return (JsPackage)EPackage.Registry.INSTANCE.getEPackage(JsPackage.eNS_URI);

		// Obtain or create and register package
		JsPackageImpl theJsPackage = (JsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AmurPackage.eINSTANCE.eClass();
		LangPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ExecPackageImpl theExecPackage = (ExecPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExecPackage.eNS_URI) instanceof ExecPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExecPackage.eNS_URI) : ExecPackage.eINSTANCE);

		// Create package meta-data objects
		theJsPackage.createPackageContents();
		theExecPackage.createPackageContents();

		// Initialize created meta-data
		theJsPackage.initializePackageContents();
		theExecPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JsPackage.eNS_URI, theJsPackage);
		return theJsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Description() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Token() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Cloning() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortDescriptor() {
		return portDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortDescriptor_Name() {
		return (EAttribute)portDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortDescriptor_Description() {
		return (EAttribute)portDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortDescriptor_Type() {
		return (EReference)portDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionPortDescriptor() {
		return functionPortDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPortDescriptor_ThrownErrors() {
		return (EReference)functionPortDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPortDescriptor_Parameters() {
		return (EReference)functionPortDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyPortDescriptor() {
		return propertyPortDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Declarations() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Start() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Stop() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_SourcePort() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_SourceName() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_TargetPort() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_TargetName() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNode() {
		return abstractNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNode_InboundTransitionsOrder() {
		return (EReference)abstractNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNode_OutboundTransitionsOrder() {
		return (EReference)abstractNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNode_ErrorTransitionsOrder() {
		return (EReference)abstractNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNode_ErrorHandlersOrder() {
		return (EReference)abstractNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNode_JoinConditions() {
		return (EReference)abstractNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNode_JoinFork() {
		return (EReference)abstractNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinEntry() {
		return joinEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinEntry_Port() {
		return (EAttribute)joinEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinEntry_Conditions() {
		return (EReference)joinEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCall() {
		return abstractCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTransition() {
		return abstractTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractErrorTransition() {
		return abstractErrorTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractErrorHandler() {
		return abstractErrorHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractReference() {
		return abstractReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEventListener() {
		return abstractEventListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCloning() {
		return cloningEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJoin() {
		return joinEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJoinScope() {
		return joinScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferenceScope() {
		return referenceScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsFactory getJsFactory() {
		return (JsFactory)getEFactoryInstance();
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
		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__DESCRIPTION);
		createEAttribute(parameterEClass, PARAMETER__TYPE);
		createEAttribute(parameterEClass, PARAMETER__TOKEN);
		createEAttribute(parameterEClass, PARAMETER__CLONING);

		portDescriptorEClass = createEClass(PORT_DESCRIPTOR);
		createEAttribute(portDescriptorEClass, PORT_DESCRIPTOR__NAME);
		createEAttribute(portDescriptorEClass, PORT_DESCRIPTOR__DESCRIPTION);
		createEReference(portDescriptorEClass, PORT_DESCRIPTOR__TYPE);

		functionPortDescriptorEClass = createEClass(FUNCTION_PORT_DESCRIPTOR);
		createEReference(functionPortDescriptorEClass, FUNCTION_PORT_DESCRIPTOR__THROWN_ERRORS);
		createEReference(functionPortDescriptorEClass, FUNCTION_PORT_DESCRIPTOR__PARAMETERS);

		propertyPortDescriptorEClass = createEClass(PROPERTY_PORT_DESCRIPTOR);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__DECLARATIONS);
		createEReference(componentEClass, COMPONENT__START);
		createEReference(componentEClass, COMPONENT__STOP);

		connectionEClass = createEClass(CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__SOURCE_PORT);
		createEAttribute(connectionEClass, CONNECTION__SOURCE_NAME);
		createEAttribute(connectionEClass, CONNECTION__TARGET_PORT);
		createEAttribute(connectionEClass, CONNECTION__TARGET_NAME);

		abstractNodeEClass = createEClass(ABSTRACT_NODE);
		createEReference(abstractNodeEClass, ABSTRACT_NODE__INBOUND_TRANSITIONS_ORDER);
		createEReference(abstractNodeEClass, ABSTRACT_NODE__OUTBOUND_TRANSITIONS_ORDER);
		createEReference(abstractNodeEClass, ABSTRACT_NODE__ERROR_TRANSITIONS_ORDER);
		createEReference(abstractNodeEClass, ABSTRACT_NODE__ERROR_HANDLERS_ORDER);
		createEReference(abstractNodeEClass, ABSTRACT_NODE__JOIN_CONDITIONS);
		createEReference(abstractNodeEClass, ABSTRACT_NODE__JOIN_FORK);

		joinEntryEClass = createEClass(JOIN_ENTRY);
		createEAttribute(joinEntryEClass, JOIN_ENTRY__PORT);
		createEReference(joinEntryEClass, JOIN_ENTRY__CONDITIONS);

		abstractCallEClass = createEClass(ABSTRACT_CALL);

		abstractTransitionEClass = createEClass(ABSTRACT_TRANSITION);

		abstractReferenceEClass = createEClass(ABSTRACT_REFERENCE);

		abstractErrorTransitionEClass = createEClass(ABSTRACT_ERROR_TRANSITION);

		abstractErrorHandlerEClass = createEClass(ABSTRACT_ERROR_HANDLER);

		abstractEventListenerEClass = createEClass(ABSTRACT_EVENT_LISTENER);

		// Create enums
		cloningEEnum = createEEnum(CLONING);
		joinEEnum = createEEnum(JOIN);
		joinScopeEEnum = createEEnum(JOIN_SCOPE);
		referenceScopeEEnum = createEEnum(REFERENCE_SCOPE);
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
		ExecPackage theExecPackage = (ExecPackage)EPackage.Registry.INSTANCE.getEPackage(ExecPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		AmurPackage theAmurPackage = (AmurPackage)EPackage.Registry.INSTANCE.getEPackage(AmurPackage.eNS_URI);
		LangPackage theLangPackage = (LangPackage)EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theExecPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		functionPortDescriptorEClass.getESuperTypes().add(this.getPortDescriptor());
		propertyPortDescriptorEClass.getESuperTypes().add(this.getPortDescriptor());
		componentEClass.getESuperTypes().add(theAmurPackage.getImplementationType());
		connectionEClass.getESuperTypes().add(this.getComponent());
		abstractNodeEClass.getESuperTypes().add(this.getComponent());
		abstractCallEClass.getESuperTypes().add(this.getConnection());
		abstractTransitionEClass.getESuperTypes().add(this.getConnection());
		abstractReferenceEClass.getESuperTypes().add(this.getConnection());
		abstractErrorTransitionEClass.getESuperTypes().add(this.getConnection());
		abstractErrorHandlerEClass.getESuperTypes().add(this.getAbstractNode());
		abstractEventListenerEClass.getESuperTypes().add(this.getAbstractNode());

		// Initialize classes and features; add operations and parameters
		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Description(), ecorePackage.getEString(), "description", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), ecorePackage.getEString(), "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Token(), theEcorePackage.getEBoolean(), "token", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Cloning(), this.getCloning(), "cloning", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portDescriptorEClass, PortDescriptor.class, "PortDescriptor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortDescriptor_Name(), ecorePackage.getEString(), "name", null, 0, 1, PortDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortDescriptor_Description(), ecorePackage.getEString(), "description", null, 0, 1, PortDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortDescriptor_Type(), this.getParameter(), null, "type", null, 0, 1, PortDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionPortDescriptorEClass, FunctionPortDescriptor.class, "FunctionPortDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionPortDescriptor_ThrownErrors(), this.getParameter(), null, "thrownErrors", null, 0, -1, FunctionPortDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionPortDescriptor_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, FunctionPortDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyPortDescriptorEClass, PropertyPortDescriptor.class, "PropertyPortDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Declarations(), theLangPackage.getSource(), null, "declarations", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Start(), theLangPackage.getSource(), null, "start", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Stop(), theLangPackage.getSource(), null, "stop", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_SourcePort(), theEcorePackage.getEString(), "sourcePort", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_SourceName(), theEcorePackage.getEString(), "sourceName", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_TargetPort(), theEcorePackage.getEString(), "targetPort", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_TargetName(), theEcorePackage.getEString(), "targetName", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractNodeEClass, AbstractNode.class, "AbstractNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractNode_InboundTransitionsOrder(), theAmurPackage.getConnection(), null, "inboundTransitionsOrder", null, 0, -1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractNode_OutboundTransitionsOrder(), theAmurPackage.getTransition(), null, "outboundTransitionsOrder", null, 0, -1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractNode_ErrorTransitionsOrder(), theAmurPackage.getErrorTransition(), null, "errorTransitionsOrder", null, 0, -1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractNode_ErrorHandlersOrder(), theAmurPackage.getErrorHandler(), null, "errorHandlersOrder", null, 0, -1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractNode_JoinConditions(), this.getJoinEntry(), null, "joinConditions", null, 0, -1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractNode_JoinFork(), theAmurPackage.getComponent(), null, "joinFork", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinEntryEClass, JoinEntry.class, "JoinEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJoinEntry_Port(), ecorePackage.getEString(), "port", null, 0, 1, JoinEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoinEntry_Conditions(), theLangPackage.getSource(), null, "conditions", null, 0, -1, JoinEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractCallEClass, AbstractCall.class, "AbstractCall", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractTransitionEClass, AbstractTransition.class, "AbstractTransition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractReferenceEClass, AbstractReference.class, "AbstractReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractErrorTransitionEClass, AbstractErrorTransition.class, "AbstractErrorTransition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractErrorHandlerEClass, AbstractErrorHandler.class, "AbstractErrorHandler", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractEventListenerEClass, AbstractEventListener.class, "AbstractEventListener", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(cloningEEnum, Cloning.class, "Cloning");
		addEEnumLiteral(cloningEEnum, Cloning.NONE);
		addEEnumLiteral(cloningEEnum, Cloning.SHALLOW);
		addEEnumLiteral(cloningEEnum, Cloning.DEEP);

		initEEnum(joinEEnum, Join.class, "Join");
		addEEnumLiteral(joinEEnum, Join.NONE);
		addEEnumLiteral(joinEEnum, Join.INNER);
		addEEnumLiteral(joinEEnum, Join.OUTER);

		initEEnum(joinScopeEEnum, JoinScope.class, "JoinScope");
		addEEnumLiteral(joinScopeEEnum, JoinScope.FLOW);
		addEEnumLiteral(joinScopeEEnum, JoinScope.INVOCATION);

		initEEnum(referenceScopeEEnum, ReferenceScope.class, "ReferenceScope");
		addEEnumLiteral(referenceScopeEEnum, ReferenceScope.COMPONENT);
		addEEnumLiteral(referenceScopeEEnum, ReferenceScope.INVOCATION);

		// Create resource
		createResource(eNS_URI);
	}

} //JsPackageImpl
