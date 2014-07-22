/**
 */
package org.nasdanika.amur.it.js;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.amur.AmurPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.amur.it.js.JsFactory
 * @model kind="package"
 * @generated
 */
public interface JsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "js";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.amur.it.js";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.amur.it.js";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JsPackage eINSTANCE = org.nasdanika.amur.it.js.impl.JsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.impl.ParameterImpl
	 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TOKEN = 3;

	/**
	 * The feature id for the '<em><b>Cloning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CLONING = 4;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.impl.PortDescriptorImpl <em>Port Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.impl.PortDescriptorImpl
	 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getPortDescriptor()
	 * @generated
	 */
	int PORT_DESCRIPTOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DESCRIPTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DESCRIPTOR__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DESCRIPTOR__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Port Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DESCRIPTOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.impl.FunctionPortDescriptorImpl <em>Function Port Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.impl.FunctionPortDescriptorImpl
	 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getFunctionPortDescriptor()
	 * @generated
	 */
	int FUNCTION_PORT_DESCRIPTOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT_DESCRIPTOR__NAME = PORT_DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT_DESCRIPTOR__DESCRIPTION = PORT_DESCRIPTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT_DESCRIPTOR__TYPE = PORT_DESCRIPTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Thrown Errors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT_DESCRIPTOR__THROWN_ERRORS = PORT_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT_DESCRIPTOR__PARAMETERS = PORT_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Port Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PORT_DESCRIPTOR_FEATURE_COUNT = PORT_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.impl.PropertyPortDescriptorImpl <em>Property Port Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.impl.PropertyPortDescriptorImpl
	 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getPropertyPortDescriptor()
	 * @generated
	 */
	int PROPERTY_PORT_DESCRIPTOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PORT_DESCRIPTOR__NAME = PORT_DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PORT_DESCRIPTOR__DESCRIPTION = PORT_DESCRIPTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PORT_DESCRIPTOR__TYPE = PORT_DESCRIPTOR__TYPE;

	/**
	 * The number of structural features of the '<em>Property Port Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PORT_DESCRIPTOR_FEATURE_COUNT = PORT_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.impl.ComponentImpl
	 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = AmurPackage.IMPLEMENTATION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = AmurPackage.IMPLEMENTATION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNER = AmurPackage.IMPLEMENTATION_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESCRIPTION = AmurPackage.IMPLEMENTATION_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DECLARATIONS = AmurPackage.IMPLEMENTATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__START = AmurPackage.IMPLEMENTATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__STOP = AmurPackage.IMPLEMENTATION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = AmurPackage.IMPLEMENTATION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.impl.ConnectionImpl
	 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__OWNER = COMPONENT__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DECLARATIONS = COMPONENT__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__START = COMPONENT__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__STOP = COMPONENT__STOP;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE_PORT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE_NAME = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET_PORT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET_NAME = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.impl.AbstractNodeImpl
	 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getAbstractNode()
	 * @generated
	 */
	int ABSTRACT_NODE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__OWNER = COMPONENT__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__DECLARATIONS = COMPONENT__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__START = COMPONENT__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__STOP = COMPONENT__STOP;

	/**
	 * The feature id for the '<em><b>Inbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__INBOUND_TRANSITIONS_ORDER = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__OUTBOUND_TRANSITIONS_ORDER = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__ERROR_TRANSITIONS_ORDER = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Error Handlers Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__ERROR_HANDLERS_ORDER = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__JOIN_CONDITIONS = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Join Fork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__JOIN_FORK = COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.impl.JoinEntryImpl <em>Join Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.impl.JoinEntryImpl
	 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getJoinEntry()
	 * @generated
	 */
	int JOIN_ENTRY = 7;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ENTRY__PORT = 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ENTRY__CONDITIONS = 1;

	/**
	 * The number of structural features of the '<em>Join Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.impl.AbstractCallImpl <em>Abstract Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.impl.AbstractCallImpl
	 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getAbstractCall()
	 * @generated
	 */
	int ABSTRACT_CALL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CALL__NAME = CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CALL__ID = CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CALL__OWNER = CONNECTION__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CALL__DESCRIPTION = CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CALL__DECLARATIONS = CONNECTION__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CALL__START = CONNECTION__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CALL__STOP = CONNECTION__STOP;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CALL__SOURCE_PORT = CONNECTION__SOURCE_PORT;

	/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CALL__SOURCE_NAME = CONNECTION__SOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CALL__TARGET_PORT = CONNECTION__TARGET_PORT;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CALL__TARGET_NAME = CONNECTION__TARGET_NAME;

	/**
	 * The number of structural features of the '<em>Abstract Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CALL_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.impl.AbstractTransitionImpl <em>Abstract Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.impl.AbstractTransitionImpl
	 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getAbstractTransition()
	 * @generated
	 */
	int ABSTRACT_TRANSITION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION__NAME = CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION__ID = CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION__OWNER = CONNECTION__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION__DESCRIPTION = CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION__DECLARATIONS = CONNECTION__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION__START = CONNECTION__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION__STOP = CONNECTION__STOP;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION__SOURCE_PORT = CONNECTION__SOURCE_PORT;

	/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION__SOURCE_NAME = CONNECTION__SOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION__TARGET_PORT = CONNECTION__TARGET_PORT;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION__TARGET_NAME = CONNECTION__TARGET_NAME;

	/**
	 * The number of structural features of the '<em>Abstract Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSITION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.impl.AbstractErrorTransitionImpl <em>Abstract Error Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.impl.AbstractErrorTransitionImpl
	 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getAbstractErrorTransition()
	 * @generated
	 */
	int ABSTRACT_ERROR_TRANSITION = 11;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.impl.AbstractErrorHandlerImpl <em>Abstract Error Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.impl.AbstractErrorHandlerImpl
	 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getAbstractErrorHandler()
	 * @generated
	 */
	int ABSTRACT_ERROR_HANDLER = 12;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.impl.AbstractReferenceImpl <em>Abstract Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.impl.AbstractReferenceImpl
	 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getAbstractReference()
	 * @generated
	 */
	int ABSTRACT_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE__NAME = CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE__ID = CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE__OWNER = CONNECTION__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE__DESCRIPTION = CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE__DECLARATIONS = CONNECTION__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE__START = CONNECTION__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE__STOP = CONNECTION__STOP;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE__SOURCE_PORT = CONNECTION__SOURCE_PORT;

	/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE__SOURCE_NAME = CONNECTION__SOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE__TARGET_PORT = CONNECTION__TARGET_PORT;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE__TARGET_NAME = CONNECTION__TARGET_NAME;

	/**
	 * The number of structural features of the '<em>Abstract Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REFERENCE_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_TRANSITION__NAME = CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_TRANSITION__ID = CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_TRANSITION__OWNER = CONNECTION__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_TRANSITION__DESCRIPTION = CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_TRANSITION__DECLARATIONS = CONNECTION__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_TRANSITION__START = CONNECTION__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_TRANSITION__STOP = CONNECTION__STOP;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_TRANSITION__SOURCE_PORT = CONNECTION__SOURCE_PORT;

	/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_TRANSITION__SOURCE_NAME = CONNECTION__SOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_TRANSITION__TARGET_PORT = CONNECTION__TARGET_PORT;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_TRANSITION__TARGET_NAME = CONNECTION__TARGET_NAME;

	/**
	 * The number of structural features of the '<em>Abstract Error Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_TRANSITION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_HANDLER__NAME = ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_HANDLER__ID = ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_HANDLER__OWNER = ABSTRACT_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_HANDLER__DESCRIPTION = ABSTRACT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_HANDLER__DECLARATIONS = ABSTRACT_NODE__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_HANDLER__START = ABSTRACT_NODE__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_HANDLER__STOP = ABSTRACT_NODE__STOP;

	/**
	 * The feature id for the '<em><b>Inbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_HANDLER__INBOUND_TRANSITIONS_ORDER = ABSTRACT_NODE__INBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Outbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_HANDLER__OUTBOUND_TRANSITIONS_ORDER = ABSTRACT_NODE__OUTBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_HANDLER__ERROR_TRANSITIONS_ORDER = ABSTRACT_NODE__ERROR_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Handlers Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_HANDLER__ERROR_HANDLERS_ORDER = ABSTRACT_NODE__ERROR_HANDLERS_ORDER;

	/**
	 * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_HANDLER__JOIN_CONDITIONS = ABSTRACT_NODE__JOIN_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Join Fork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_HANDLER__JOIN_FORK = ABSTRACT_NODE__JOIN_FORK;

	/**
	 * The number of structural features of the '<em>Abstract Error Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ERROR_HANDLER_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.impl.AbstractEventListenerImpl <em>Abstract Event Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.impl.AbstractEventListenerImpl
	 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getAbstractEventListener()
	 * @generated
	 */
	int ABSTRACT_EVENT_LISTENER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_LISTENER__NAME = ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_LISTENER__ID = ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_LISTENER__OWNER = ABSTRACT_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_LISTENER__DESCRIPTION = ABSTRACT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_LISTENER__DECLARATIONS = ABSTRACT_NODE__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_LISTENER__START = ABSTRACT_NODE__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_LISTENER__STOP = ABSTRACT_NODE__STOP;

	/**
	 * The feature id for the '<em><b>Inbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_LISTENER__INBOUND_TRANSITIONS_ORDER = ABSTRACT_NODE__INBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Outbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_LISTENER__OUTBOUND_TRANSITIONS_ORDER = ABSTRACT_NODE__OUTBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_LISTENER__ERROR_TRANSITIONS_ORDER = ABSTRACT_NODE__ERROR_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Handlers Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_LISTENER__ERROR_HANDLERS_ORDER = ABSTRACT_NODE__ERROR_HANDLERS_ORDER;

	/**
	 * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_LISTENER__JOIN_CONDITIONS = ABSTRACT_NODE__JOIN_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Join Fork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_LISTENER__JOIN_FORK = ABSTRACT_NODE__JOIN_FORK;

	/**
	 * The number of structural features of the '<em>Abstract Event Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EVENT_LISTENER_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.Cloning <em>Cloning</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.Cloning
	 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getCloning()
	 * @generated
	 */
	int CLONING = 14;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.Join <em>Join</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.Join
	 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 15;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.JoinScope <em>Join Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.JoinScope
	 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getJoinScope()
	 * @generated
	 */
	int JOIN_SCOPE = 16;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.ReferenceScope <em>Reference Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.ReferenceScope
	 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getReferenceScope()
	 * @generated
	 */
	int REFERENCE_SCOPE = 17;

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.nasdanika.amur.it.js.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.amur.it.js.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.Parameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.amur.it.js.Parameter#getDescription()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.amur.it.js.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.Parameter#isToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.nasdanika.amur.it.js.Parameter#isToken()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Token();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.Parameter#getCloning <em>Cloning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloning</em>'.
	 * @see org.nasdanika.amur.it.js.Parameter#getCloning()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Cloning();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.PortDescriptor <em>Port Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Descriptor</em>'.
	 * @see org.nasdanika.amur.it.js.PortDescriptor
	 * @generated
	 */
	EClass getPortDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.PortDescriptor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.amur.it.js.PortDescriptor#getName()
	 * @see #getPortDescriptor()
	 * @generated
	 */
	EAttribute getPortDescriptor_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.PortDescriptor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.amur.it.js.PortDescriptor#getDescription()
	 * @see #getPortDescriptor()
	 * @generated
	 */
	EAttribute getPortDescriptor_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.PortDescriptor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.nasdanika.amur.it.js.PortDescriptor#getType()
	 * @see #getPortDescriptor()
	 * @generated
	 */
	EReference getPortDescriptor_Type();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.FunctionPortDescriptor <em>Function Port Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Port Descriptor</em>'.
	 * @see org.nasdanika.amur.it.js.FunctionPortDescriptor
	 * @generated
	 */
	EClass getFunctionPortDescriptor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.amur.it.js.FunctionPortDescriptor#getThrownErrors <em>Thrown Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thrown Errors</em>'.
	 * @see org.nasdanika.amur.it.js.FunctionPortDescriptor#getThrownErrors()
	 * @see #getFunctionPortDescriptor()
	 * @generated
	 */
	EReference getFunctionPortDescriptor_ThrownErrors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.amur.it.js.FunctionPortDescriptor#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.nasdanika.amur.it.js.FunctionPortDescriptor#getParameters()
	 * @see #getFunctionPortDescriptor()
	 * @generated
	 */
	EReference getFunctionPortDescriptor_Parameters();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.PropertyPortDescriptor <em>Property Port Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Port Descriptor</em>'.
	 * @see org.nasdanika.amur.it.js.PropertyPortDescriptor
	 * @generated
	 */
	EClass getPropertyPortDescriptor();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.nasdanika.amur.it.js.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.Component#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declarations</em>'.
	 * @see org.nasdanika.amur.it.js.Component#getDeclarations()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Declarations();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.Component#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see org.nasdanika.amur.it.js.Component#getStart()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Start();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.Component#getStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop</em>'.
	 * @see org.nasdanika.amur.it.js.Component#getStop()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Stop();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.nasdanika.amur.it.js.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.Connection#getSourcePort <em>Source Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Port</em>'.
	 * @see org.nasdanika.amur.it.js.Connection#getSourcePort()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_SourcePort();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.Connection#getSourceName <em>Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Name</em>'.
	 * @see org.nasdanika.amur.it.js.Connection#getSourceName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_SourceName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.Connection#getTargetPort <em>Target Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Port</em>'.
	 * @see org.nasdanika.amur.it.js.Connection#getTargetPort()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_TargetPort();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.Connection#getTargetName <em>Target Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Name</em>'.
	 * @see org.nasdanika.amur.it.js.Connection#getTargetName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_TargetName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node</em>'.
	 * @see org.nasdanika.amur.it.js.AbstractNode
	 * @generated
	 */
	EClass getAbstractNode();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.amur.it.js.AbstractNode#getInboundTransitionsOrder <em>Inbound Transitions Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inbound Transitions Order</em>'.
	 * @see org.nasdanika.amur.it.js.AbstractNode#getInboundTransitionsOrder()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_InboundTransitionsOrder();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.amur.it.js.AbstractNode#getOutboundTransitionsOrder <em>Outbound Transitions Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outbound Transitions Order</em>'.
	 * @see org.nasdanika.amur.it.js.AbstractNode#getOutboundTransitionsOrder()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_OutboundTransitionsOrder();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.amur.it.js.AbstractNode#getErrorTransitionsOrder <em>Error Transitions Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Error Transitions Order</em>'.
	 * @see org.nasdanika.amur.it.js.AbstractNode#getErrorTransitionsOrder()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_ErrorTransitionsOrder();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.amur.it.js.AbstractNode#getErrorHandlersOrder <em>Error Handlers Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Error Handlers Order</em>'.
	 * @see org.nasdanika.amur.it.js.AbstractNode#getErrorHandlersOrder()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_ErrorHandlersOrder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.amur.it.js.AbstractNode#getJoinConditions <em>Join Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join Conditions</em>'.
	 * @see org.nasdanika.amur.it.js.AbstractNode#getJoinConditions()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_JoinConditions();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.amur.it.js.AbstractNode#getJoinFork <em>Join Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Join Fork</em>'.
	 * @see org.nasdanika.amur.it.js.AbstractNode#getJoinFork()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_JoinFork();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.JoinEntry <em>Join Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Entry</em>'.
	 * @see org.nasdanika.amur.it.js.JoinEntry
	 * @generated
	 */
	EClass getJoinEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.JoinEntry#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.nasdanika.amur.it.js.JoinEntry#getPort()
	 * @see #getJoinEntry()
	 * @generated
	 */
	EAttribute getJoinEntry_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.amur.it.js.JoinEntry#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see org.nasdanika.amur.it.js.JoinEntry#getConditions()
	 * @see #getJoinEntry()
	 * @generated
	 */
	EReference getJoinEntry_Conditions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.AbstractCall <em>Abstract Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Call</em>'.
	 * @see org.nasdanika.amur.it.js.AbstractCall
	 * @generated
	 */
	EClass getAbstractCall();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.AbstractTransition <em>Abstract Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Transition</em>'.
	 * @see org.nasdanika.amur.it.js.AbstractTransition
	 * @generated
	 */
	EClass getAbstractTransition();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.AbstractErrorTransition <em>Abstract Error Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Error Transition</em>'.
	 * @see org.nasdanika.amur.it.js.AbstractErrorTransition
	 * @generated
	 */
	EClass getAbstractErrorTransition();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.AbstractErrorHandler <em>Abstract Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Error Handler</em>'.
	 * @see org.nasdanika.amur.it.js.AbstractErrorHandler
	 * @generated
	 */
	EClass getAbstractErrorHandler();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.AbstractReference <em>Abstract Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Reference</em>'.
	 * @see org.nasdanika.amur.it.js.AbstractReference
	 * @generated
	 */
	EClass getAbstractReference();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.AbstractEventListener <em>Abstract Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Event Listener</em>'.
	 * @see org.nasdanika.amur.it.js.AbstractEventListener
	 * @generated
	 */
	EClass getAbstractEventListener();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.amur.it.js.Cloning <em>Cloning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cloning</em>'.
	 * @see org.nasdanika.amur.it.js.Cloning
	 * @generated
	 */
	EEnum getCloning();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.amur.it.js.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Join</em>'.
	 * @see org.nasdanika.amur.it.js.Join
	 * @generated
	 */
	EEnum getJoin();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.amur.it.js.JoinScope <em>Join Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Join Scope</em>'.
	 * @see org.nasdanika.amur.it.js.JoinScope
	 * @generated
	 */
	EEnum getJoinScope();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.amur.it.js.ReferenceScope <em>Reference Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reference Scope</em>'.
	 * @see org.nasdanika.amur.it.js.ReferenceScope
	 * @generated
	 */
	EEnum getReferenceScope();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JsFactory getJsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.impl.ParameterImpl
		 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DESCRIPTION = eINSTANCE.getParameter_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TOKEN = eINSTANCE.getParameter_Token();

		/**
		 * The meta object literal for the '<em><b>Cloning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__CLONING = eINSTANCE.getParameter_Cloning();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.impl.PortDescriptorImpl <em>Port Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.impl.PortDescriptorImpl
		 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getPortDescriptor()
		 * @generated
		 */
		EClass PORT_DESCRIPTOR = eINSTANCE.getPortDescriptor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_DESCRIPTOR__NAME = eINSTANCE.getPortDescriptor_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_DESCRIPTOR__DESCRIPTION = eINSTANCE.getPortDescriptor_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_DESCRIPTOR__TYPE = eINSTANCE.getPortDescriptor_Type();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.impl.FunctionPortDescriptorImpl <em>Function Port Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.impl.FunctionPortDescriptorImpl
		 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getFunctionPortDescriptor()
		 * @generated
		 */
		EClass FUNCTION_PORT_DESCRIPTOR = eINSTANCE.getFunctionPortDescriptor();

		/**
		 * The meta object literal for the '<em><b>Thrown Errors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_PORT_DESCRIPTOR__THROWN_ERRORS = eINSTANCE.getFunctionPortDescriptor_ThrownErrors();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_PORT_DESCRIPTOR__PARAMETERS = eINSTANCE.getFunctionPortDescriptor_Parameters();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.impl.PropertyPortDescriptorImpl <em>Property Port Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.impl.PropertyPortDescriptorImpl
		 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getPropertyPortDescriptor()
		 * @generated
		 */
		EClass PROPERTY_PORT_DESCRIPTOR = eINSTANCE.getPropertyPortDescriptor();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.impl.ComponentImpl
		 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__DECLARATIONS = eINSTANCE.getComponent_Declarations();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__START = eINSTANCE.getComponent_Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__STOP = eINSTANCE.getComponent_Stop();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.impl.ConnectionImpl
		 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Source Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__SOURCE_PORT = eINSTANCE.getConnection_SourcePort();

		/**
		 * The meta object literal for the '<em><b>Source Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__SOURCE_NAME = eINSTANCE.getConnection_SourceName();

		/**
		 * The meta object literal for the '<em><b>Target Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__TARGET_PORT = eINSTANCE.getConnection_TargetPort();

		/**
		 * The meta object literal for the '<em><b>Target Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__TARGET_NAME = eINSTANCE.getConnection_TargetName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.impl.AbstractNodeImpl
		 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getAbstractNode()
		 * @generated
		 */
		EClass ABSTRACT_NODE = eINSTANCE.getAbstractNode();

		/**
		 * The meta object literal for the '<em><b>Inbound Transitions Order</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__INBOUND_TRANSITIONS_ORDER = eINSTANCE.getAbstractNode_InboundTransitionsOrder();

		/**
		 * The meta object literal for the '<em><b>Outbound Transitions Order</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__OUTBOUND_TRANSITIONS_ORDER = eINSTANCE.getAbstractNode_OutboundTransitionsOrder();

		/**
		 * The meta object literal for the '<em><b>Error Transitions Order</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__ERROR_TRANSITIONS_ORDER = eINSTANCE.getAbstractNode_ErrorTransitionsOrder();

		/**
		 * The meta object literal for the '<em><b>Error Handlers Order</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__ERROR_HANDLERS_ORDER = eINSTANCE.getAbstractNode_ErrorHandlersOrder();

		/**
		 * The meta object literal for the '<em><b>Join Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__JOIN_CONDITIONS = eINSTANCE.getAbstractNode_JoinConditions();

		/**
		 * The meta object literal for the '<em><b>Join Fork</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__JOIN_FORK = eINSTANCE.getAbstractNode_JoinFork();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.impl.JoinEntryImpl <em>Join Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.impl.JoinEntryImpl
		 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getJoinEntry()
		 * @generated
		 */
		EClass JOIN_ENTRY = eINSTANCE.getJoinEntry();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_ENTRY__PORT = eINSTANCE.getJoinEntry_Port();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_ENTRY__CONDITIONS = eINSTANCE.getJoinEntry_Conditions();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.impl.AbstractCallImpl <em>Abstract Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.impl.AbstractCallImpl
		 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getAbstractCall()
		 * @generated
		 */
		EClass ABSTRACT_CALL = eINSTANCE.getAbstractCall();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.impl.AbstractTransitionImpl <em>Abstract Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.impl.AbstractTransitionImpl
		 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getAbstractTransition()
		 * @generated
		 */
		EClass ABSTRACT_TRANSITION = eINSTANCE.getAbstractTransition();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.impl.AbstractErrorTransitionImpl <em>Abstract Error Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.impl.AbstractErrorTransitionImpl
		 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getAbstractErrorTransition()
		 * @generated
		 */
		EClass ABSTRACT_ERROR_TRANSITION = eINSTANCE.getAbstractErrorTransition();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.impl.AbstractErrorHandlerImpl <em>Abstract Error Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.impl.AbstractErrorHandlerImpl
		 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getAbstractErrorHandler()
		 * @generated
		 */
		EClass ABSTRACT_ERROR_HANDLER = eINSTANCE.getAbstractErrorHandler();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.impl.AbstractReferenceImpl <em>Abstract Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.impl.AbstractReferenceImpl
		 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getAbstractReference()
		 * @generated
		 */
		EClass ABSTRACT_REFERENCE = eINSTANCE.getAbstractReference();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.impl.AbstractEventListenerImpl <em>Abstract Event Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.impl.AbstractEventListenerImpl
		 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getAbstractEventListener()
		 * @generated
		 */
		EClass ABSTRACT_EVENT_LISTENER = eINSTANCE.getAbstractEventListener();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.Cloning <em>Cloning</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.Cloning
		 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getCloning()
		 * @generated
		 */
		EEnum CLONING = eINSTANCE.getCloning();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.Join <em>Join</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.Join
		 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getJoin()
		 * @generated
		 */
		EEnum JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.JoinScope <em>Join Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.JoinScope
		 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getJoinScope()
		 * @generated
		 */
		EEnum JOIN_SCOPE = eINSTANCE.getJoinScope();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.ReferenceScope <em>Reference Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.ReferenceScope
		 * @see org.nasdanika.amur.it.js.impl.JsPackageImpl#getReferenceScope()
		 * @generated
		 */
		EEnum REFERENCE_SCOPE = eINSTANCE.getReferenceScope();

	}

} //JsPackage
