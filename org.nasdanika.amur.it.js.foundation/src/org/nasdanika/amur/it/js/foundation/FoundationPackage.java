/**
 */
package org.nasdanika.amur.it.js.foundation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.amur.it.js.JsPackage;

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
 * @see org.nasdanika.amur.it.js.foundation.FoundationFactory
 * @model kind="package"
 * @generated
 */
public interface FoundationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "foundation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.amur.it.js.foundation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.amur.it.js.foundation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FoundationPackage eINSTANCE = org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.foundation.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.foundation.impl.CallImpl
	 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getCall()
	 * @generated
	 */
	int CALL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__NAME = JsPackage.ABSTRACT_CALL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__ID = JsPackage.ABSTRACT_CALL__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__OWNER = JsPackage.ABSTRACT_CALL__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__DESCRIPTION = JsPackage.ABSTRACT_CALL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__DECLARATIONS = JsPackage.ABSTRACT_CALL__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__START = JsPackage.ABSTRACT_CALL__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__STOP = JsPackage.ABSTRACT_CALL__STOP;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__SOURCE_PORT = JsPackage.ABSTRACT_CALL__SOURCE_PORT;

	/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__SOURCE_NAME = JsPackage.ABSTRACT_CALL__SOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__TARGET_PORT = JsPackage.ABSTRACT_CALL__TARGET_PORT;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__TARGET_NAME = JsPackage.ABSTRACT_CALL__TARGET_NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__PARAMETERS = JsPackage.ABSTRACT_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__HANDLER = JsPackage.ABSTRACT_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = JsPackage.ABSTRACT_CALL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.foundation.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.foundation.impl.TransitionImpl
	 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = JsPackage.ABSTRACT_TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = JsPackage.ABSTRACT_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OWNER = JsPackage.ABSTRACT_TRANSITION__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DESCRIPTION = JsPackage.ABSTRACT_TRANSITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DECLARATIONS = JsPackage.ABSTRACT_TRANSITION__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__START = JsPackage.ABSTRACT_TRANSITION__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__STOP = JsPackage.ABSTRACT_TRANSITION__STOP;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE_PORT = JsPackage.ABSTRACT_TRANSITION__SOURCE_PORT;

	/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE_NAME = JsPackage.ABSTRACT_TRANSITION__SOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET_PORT = JsPackage.ABSTRACT_TRANSITION__TARGET_PORT;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET_NAME = JsPackage.ABSTRACT_TRANSITION__TARGET_NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITION = JsPackage.ABSTRACT_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PARAMETERS = JsPackage.ABSTRACT_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__HANDLER = JsPackage.ABSTRACT_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dispatch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DISPATCH = JsPackage.ABSTRACT_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Join Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__JOIN_TYPE = JsPackage.ABSTRACT_TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUTPUT_PARAMETERS = JsPackage.ABSTRACT_TRANSITION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = JsPackage.ABSTRACT_TRANSITION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.foundation.impl.ScheduledTransitionImpl <em>Scheduled Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.foundation.impl.ScheduledTransitionImpl
	 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getScheduledTransition()
	 * @generated
	 */
	int SCHEDULED_TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRANSITION__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRANSITION__ID = TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRANSITION__OWNER = TRANSITION__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRANSITION__DESCRIPTION = TRANSITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRANSITION__DECLARATIONS = TRANSITION__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRANSITION__START = TRANSITION__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRANSITION__STOP = TRANSITION__STOP;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRANSITION__SOURCE_PORT = TRANSITION__SOURCE_PORT;

	/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRANSITION__SOURCE_NAME = TRANSITION__SOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRANSITION__TARGET_PORT = TRANSITION__TARGET_PORT;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRANSITION__TARGET_NAME = TRANSITION__TARGET_NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRANSITION__CONDITION = TRANSITION__CONDITION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRANSITION__PARAMETERS = TRANSITION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRANSITION__HANDLER = TRANSITION__HANDLER;

	/**
	 * The feature id for the '<em><b>Dispatch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRANSITION__DISPATCH = TRANSITION__DISPATCH;

	/**
	 * The feature id for the '<em><b>Join Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRANSITION__JOIN_TYPE = TRANSITION__JOIN_TYPE;

	/**
	 * The feature id for the '<em><b>Output Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRANSITION__OUTPUT_PARAMETERS = TRANSITION__OUTPUT_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRANSITION__TYPE = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRANSITION__PERIOD = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scheduled Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.foundation.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.foundation.impl.ReferenceImpl
	 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = JsPackage.ABSTRACT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ID = JsPackage.ABSTRACT_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__OWNER = JsPackage.ABSTRACT_REFERENCE__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__DESCRIPTION = JsPackage.ABSTRACT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__DECLARATIONS = JsPackage.ABSTRACT_REFERENCE__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__START = JsPackage.ABSTRACT_REFERENCE__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__STOP = JsPackage.ABSTRACT_REFERENCE__STOP;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SOURCE_PORT = JsPackage.ABSTRACT_REFERENCE__SOURCE_PORT;

	/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SOURCE_NAME = JsPackage.ABSTRACT_REFERENCE__SOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TARGET_PORT = JsPackage.ABSTRACT_REFERENCE__TARGET_PORT;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TARGET_NAME = JsPackage.ABSTRACT_REFERENCE__TARGET_NAME;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SCOPE = JsPackage.ABSTRACT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accessor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ACCESSOR = JsPackage.ABSTRACT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mutator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__MUTATOR = JsPackage.ABSTRACT_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = JsPackage.ABSTRACT_REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.foundation.impl.ErrorTransitionImpl <em>Error Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.foundation.impl.ErrorTransitionImpl
	 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getErrorTransition()
	 * @generated
	 */
	int ERROR_TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__NAME = JsPackage.ABSTRACT_ERROR_TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__ID = JsPackage.ABSTRACT_ERROR_TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__OWNER = JsPackage.ABSTRACT_ERROR_TRANSITION__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__DESCRIPTION = JsPackage.ABSTRACT_ERROR_TRANSITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__DECLARATIONS = JsPackage.ABSTRACT_ERROR_TRANSITION__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__START = JsPackage.ABSTRACT_ERROR_TRANSITION__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__STOP = JsPackage.ABSTRACT_ERROR_TRANSITION__STOP;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__SOURCE_PORT = JsPackage.ABSTRACT_ERROR_TRANSITION__SOURCE_PORT;

	/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__SOURCE_NAME = JsPackage.ABSTRACT_ERROR_TRANSITION__SOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__TARGET_PORT = JsPackage.ABSTRACT_ERROR_TRANSITION__TARGET_PORT;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__TARGET_NAME = JsPackage.ABSTRACT_ERROR_TRANSITION__TARGET_NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__CONDITION = JsPackage.ABSTRACT_ERROR_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__HANDLER = JsPackage.ABSTRACT_ERROR_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION_FEATURE_COUNT = JsPackage.ABSTRACT_ERROR_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.foundation.impl.ErrorHandlerImpl <em>Error Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.foundation.impl.ErrorHandlerImpl
	 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getErrorHandler()
	 * @generated
	 */
	int ERROR_HANDLER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__NAME = JsPackage.ABSTRACT_ERROR_HANDLER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__ID = JsPackage.ABSTRACT_ERROR_HANDLER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__OWNER = JsPackage.ABSTRACT_ERROR_HANDLER__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__DESCRIPTION = JsPackage.ABSTRACT_ERROR_HANDLER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__DECLARATIONS = JsPackage.ABSTRACT_ERROR_HANDLER__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__START = JsPackage.ABSTRACT_ERROR_HANDLER__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__STOP = JsPackage.ABSTRACT_ERROR_HANDLER__STOP;

	/**
	 * The feature id for the '<em><b>Inbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__INBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_ERROR_HANDLER__INBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Outbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__OUTBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_ERROR_HANDLER__OUTBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__ERROR_TRANSITIONS_ORDER = JsPackage.ABSTRACT_ERROR_HANDLER__ERROR_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Handlers Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__ERROR_HANDLERS_ORDER = JsPackage.ABSTRACT_ERROR_HANDLER__ERROR_HANDLERS_ORDER;

	/**
	 * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__JOIN_CONDITIONS = JsPackage.ABSTRACT_ERROR_HANDLER__JOIN_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Join Fork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__JOIN_FORK = JsPackage.ABSTRACT_ERROR_HANDLER__JOIN_FORK;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__CONDITION = JsPackage.ABSTRACT_ERROR_HANDLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__HANDLER = JsPackage.ABSTRACT_ERROR_HANDLER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER_FEATURE_COUNT = JsPackage.ABSTRACT_ERROR_HANDLER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.foundation.impl.EventListenerImpl <em>Event Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.foundation.impl.EventListenerImpl
	 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getEventListener()
	 * @generated
	 */
	int EVENT_LISTENER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__NAME = JsPackage.ABSTRACT_EVENT_LISTENER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__ID = JsPackage.ABSTRACT_EVENT_LISTENER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__OWNER = JsPackage.ABSTRACT_EVENT_LISTENER__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__DESCRIPTION = JsPackage.ABSTRACT_EVENT_LISTENER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__DECLARATIONS = JsPackage.ABSTRACT_EVENT_LISTENER__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__START = JsPackage.ABSTRACT_EVENT_LISTENER__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__STOP = JsPackage.ABSTRACT_EVENT_LISTENER__STOP;

	/**
	 * The feature id for the '<em><b>Inbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__INBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_EVENT_LISTENER__INBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Outbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__OUTBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_EVENT_LISTENER__OUTBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__ERROR_TRANSITIONS_ORDER = JsPackage.ABSTRACT_EVENT_LISTENER__ERROR_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Handlers Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__ERROR_HANDLERS_ORDER = JsPackage.ABSTRACT_EVENT_LISTENER__ERROR_HANDLERS_ORDER;

	/**
	 * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__JOIN_CONDITIONS = JsPackage.ABSTRACT_EVENT_LISTENER__JOIN_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Join Fork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__JOIN_FORK = JsPackage.ABSTRACT_EVENT_LISTENER__JOIN_FORK;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__CONDITION = JsPackage.ABSTRACT_EVENT_LISTENER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__HANDLER = JsPackage.ABSTRACT_EVENT_LISTENER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_FEATURE_COUNT = JsPackage.ABSTRACT_EVENT_LISTENER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.foundation.impl.TopLevelFlowImpl <em>Top Level Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.foundation.impl.TopLevelFlowImpl
	 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getTopLevelFlow()
	 * @generated
	 */
	int TOP_LEVEL_FLOW = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_FLOW__NAME = JsPackage.ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_FLOW__ID = JsPackage.ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_FLOW__OWNER = JsPackage.ABSTRACT_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_FLOW__DESCRIPTION = JsPackage.ABSTRACT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_FLOW__DECLARATIONS = JsPackage.ABSTRACT_NODE__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_FLOW__START = JsPackage.ABSTRACT_NODE__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_FLOW__STOP = JsPackage.ABSTRACT_NODE__STOP;

	/**
	 * The feature id for the '<em><b>Inbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_FLOW__INBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__INBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Outbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_FLOW__OUTBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__OUTBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_FLOW__ERROR_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Handlers Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_FLOW__ERROR_HANDLERS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_HANDLERS_ORDER;

	/**
	 * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_FLOW__JOIN_CONDITIONS = JsPackage.ABSTRACT_NODE__JOIN_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Join Fork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_FLOW__JOIN_FORK = JsPackage.ABSTRACT_NODE__JOIN_FORK;

	/**
	 * The feature id for the '<em><b>Script Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_FLOW__SCRIPT_FOLDER = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_FLOW__RESOURCE_FOLDER = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Skeleton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_FLOW__SKELETON = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Top Level Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_FLOW_FEATURE_COUNT = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.foundation.impl.PropertyInputPortImpl <em>Property Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.foundation.impl.PropertyInputPortImpl
	 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getPropertyInputPort()
	 * @generated
	 */
	int PROPERTY_INPUT_PORT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INPUT_PORT__NAME = JsPackage.ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INPUT_PORT__ID = JsPackage.ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INPUT_PORT__OWNER = JsPackage.ABSTRACT_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INPUT_PORT__DESCRIPTION = JsPackage.ABSTRACT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INPUT_PORT__DECLARATIONS = JsPackage.ABSTRACT_NODE__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INPUT_PORT__START = JsPackage.ABSTRACT_NODE__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INPUT_PORT__STOP = JsPackage.ABSTRACT_NODE__STOP;

	/**
	 * The feature id for the '<em><b>Inbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INPUT_PORT__INBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__INBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Outbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INPUT_PORT__OUTBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__OUTBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INPUT_PORT__ERROR_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Handlers Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INPUT_PORT__ERROR_HANDLERS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_HANDLERS_ORDER;

	/**
	 * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INPUT_PORT__JOIN_CONDITIONS = JsPackage.ABSTRACT_NODE__JOIN_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Join Fork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INPUT_PORT__JOIN_FORK = JsPackage.ABSTRACT_NODE__JOIN_FORK;

	/**
	 * The feature id for the '<em><b>Accessor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INPUT_PORT__ACCESSOR = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mutator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INPUT_PORT__MUTATOR = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INPUT_PORT_FEATURE_COUNT = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.foundation.impl.FunctionInputPortImpl <em>Function Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.foundation.impl.FunctionInputPortImpl
	 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getFunctionInputPort()
	 * @generated
	 */
	int FUNCTION_INPUT_PORT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__NAME = JsPackage.ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__ID = JsPackage.ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__OWNER = JsPackage.ABSTRACT_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__DESCRIPTION = JsPackage.ABSTRACT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__DECLARATIONS = JsPackage.ABSTRACT_NODE__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__START = JsPackage.ABSTRACT_NODE__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__STOP = JsPackage.ABSTRACT_NODE__STOP;

	/**
	 * The feature id for the '<em><b>Inbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__INBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__INBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Outbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__OUTBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__OUTBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__ERROR_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Handlers Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__ERROR_HANDLERS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_HANDLERS_ORDER;

	/**
	 * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__JOIN_CONDITIONS = JsPackage.ABSTRACT_NODE__JOIN_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Join Fork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__JOIN_FORK = JsPackage.ABSTRACT_NODE__JOIN_FORK;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__INPUT_PARAMETERS = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT__HANDLER = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_INPUT_PORT_FEATURE_COUNT = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.foundation.impl.PropertyOutputPortImpl <em>Property Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.foundation.impl.PropertyOutputPortImpl
	 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getPropertyOutputPort()
	 * @generated
	 */
	int PROPERTY_OUTPUT_PORT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OUTPUT_PORT__NAME = JsPackage.ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OUTPUT_PORT__ID = JsPackage.ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OUTPUT_PORT__OWNER = JsPackage.ABSTRACT_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OUTPUT_PORT__DESCRIPTION = JsPackage.ABSTRACT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OUTPUT_PORT__DECLARATIONS = JsPackage.ABSTRACT_NODE__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OUTPUT_PORT__START = JsPackage.ABSTRACT_NODE__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OUTPUT_PORT__STOP = JsPackage.ABSTRACT_NODE__STOP;

	/**
	 * The feature id for the '<em><b>Inbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OUTPUT_PORT__INBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__INBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Outbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OUTPUT_PORT__OUTBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__OUTBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OUTPUT_PORT__ERROR_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Handlers Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OUTPUT_PORT__ERROR_HANDLERS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_HANDLERS_ORDER;

	/**
	 * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OUTPUT_PORT__JOIN_CONDITIONS = JsPackage.ABSTRACT_NODE__JOIN_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Join Fork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OUTPUT_PORT__JOIN_FORK = JsPackage.ABSTRACT_NODE__JOIN_FORK;

	/**
	 * The number of structural features of the '<em>Property Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OUTPUT_PORT_FEATURE_COUNT = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.foundation.impl.FunctionOutputPortImpl <em>Function Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.foundation.impl.FunctionOutputPortImpl
	 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getFunctionOutputPort()
	 * @generated
	 */
	int FUNCTION_OUTPUT_PORT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__NAME = JsPackage.ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__ID = JsPackage.ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__OWNER = JsPackage.ABSTRACT_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__DESCRIPTION = JsPackage.ABSTRACT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__DECLARATIONS = JsPackage.ABSTRACT_NODE__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__START = JsPackage.ABSTRACT_NODE__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__STOP = JsPackage.ABSTRACT_NODE__STOP;

	/**
	 * The feature id for the '<em><b>Inbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__INBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__INBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Outbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__OUTBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__OUTBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__ERROR_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Handlers Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__ERROR_HANDLERS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_HANDLERS_ORDER;

	/**
	 * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__JOIN_CONDITIONS = JsPackage.ABSTRACT_NODE__JOIN_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Join Fork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__JOIN_FORK = JsPackage.ABSTRACT_NODE__JOIN_FORK;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT__PARAMETERS = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OUTPUT_PORT_FEATURE_COUNT = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.foundation.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.foundation.impl.ActivityImpl
	 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = JsPackage.ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ID = JsPackage.ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNER = JsPackage.ABSTRACT_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DESCRIPTION = JsPackage.ABSTRACT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DECLARATIONS = JsPackage.ABSTRACT_NODE__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__START = JsPackage.ABSTRACT_NODE__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__STOP = JsPackage.ABSTRACT_NODE__STOP;

	/**
	 * The feature id for the '<em><b>Inbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__INBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Outbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__OUTBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ERROR_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Handlers Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ERROR_HANDLERS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_HANDLERS_ORDER;

	/**
	 * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__JOIN_CONDITIONS = JsPackage.ABSTRACT_NODE__JOIN_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Join Fork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__JOIN_FORK = JsPackage.ABSTRACT_NODE__JOIN_FORK;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INPUT_PARAMETERS = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__HANDLER = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.foundation.impl.SuiteImpl <em>Suite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.foundation.impl.SuiteImpl
	 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getSuite()
	 * @generated
	 */
	int SUITE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__NAME = JsPackage.ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__ID = JsPackage.ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__OWNER = JsPackage.ABSTRACT_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__DESCRIPTION = JsPackage.ABSTRACT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__DECLARATIONS = JsPackage.ABSTRACT_NODE__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__START = JsPackage.ABSTRACT_NODE__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__STOP = JsPackage.ABSTRACT_NODE__STOP;

	/**
	 * The feature id for the '<em><b>Inbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__INBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__INBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Outbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__OUTBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__OUTBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__ERROR_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Handlers Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__ERROR_HANDLERS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_HANDLERS_ORDER;

	/**
	 * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__JOIN_CONDITIONS = JsPackage.ABSTRACT_NODE__JOIN_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Join Fork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__JOIN_FORK = JsPackage.ABSTRACT_NODE__JOIN_FORK;

	/**
	 * The feature id for the '<em><b>Components</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__COMPONENTS = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE_FEATURE_COUNT = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.foundation.impl.GenericNodeImpl <em>Generic Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.foundation.impl.GenericNodeImpl
	 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getGenericNode()
	 * @generated
	 */
	int GENERIC_NODE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NODE__NAME = JsPackage.ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NODE__ID = JsPackage.ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NODE__OWNER = JsPackage.ABSTRACT_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NODE__DESCRIPTION = JsPackage.ABSTRACT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NODE__DECLARATIONS = JsPackage.ABSTRACT_NODE__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NODE__START = JsPackage.ABSTRACT_NODE__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NODE__STOP = JsPackage.ABSTRACT_NODE__STOP;

	/**
	 * The feature id for the '<em><b>Inbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NODE__INBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__INBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Outbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NODE__OUTBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__OUTBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NODE__ERROR_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Handlers Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NODE__ERROR_HANDLERS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_HANDLERS_ORDER;

	/**
	 * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NODE__JOIN_CONDITIONS = JsPackage.ABSTRACT_NODE__JOIN_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Join Fork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NODE__JOIN_FORK = JsPackage.ABSTRACT_NODE__JOIN_FORK;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NODE__ICON = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NODE__IMAGE = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generic Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NODE_FEATURE_COUNT = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.foundation.impl.ObjectNodeImpl <em>Object Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.foundation.impl.ObjectNodeImpl
	 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getObjectNode()
	 * @generated
	 */
	int OBJECT_NODE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__NAME = JsPackage.ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__ID = JsPackage.ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__OWNER = JsPackage.ABSTRACT_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__DESCRIPTION = JsPackage.ABSTRACT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__DECLARATIONS = JsPackage.ABSTRACT_NODE__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__START = JsPackage.ABSTRACT_NODE__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__STOP = JsPackage.ABSTRACT_NODE__STOP;

	/**
	 * The feature id for the '<em><b>Inbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__INBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__INBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Outbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__OUTBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__OUTBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__ERROR_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Handlers Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__ERROR_HANDLERS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_HANDLERS_ORDER;

	/**
	 * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__JOIN_CONDITIONS = JsPackage.ABSTRACT_NODE__JOIN_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Join Fork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__JOIN_FORK = JsPackage.ABSTRACT_NODE__JOIN_FORK;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__SCOPE = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__SELECTOR = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_FEATURE_COUNT = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.foundation.impl.UserTaskImpl <em>User Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.foundation.impl.UserTaskImpl
	 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getUserTask()
	 * @generated
	 */
	int USER_TASK = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__NAME = JsPackage.ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__ID = JsPackage.ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__OWNER = JsPackage.ABSTRACT_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__DESCRIPTION = JsPackage.ABSTRACT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__DECLARATIONS = JsPackage.ABSTRACT_NODE__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__START = JsPackage.ABSTRACT_NODE__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__STOP = JsPackage.ABSTRACT_NODE__STOP;

	/**
	 * The feature id for the '<em><b>Inbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__INBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__INBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Outbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__OUTBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__OUTBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__ERROR_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Handlers Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__ERROR_HANDLERS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_HANDLERS_ORDER;

	/**
	 * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__JOIN_CONDITIONS = JsPackage.ABSTRACT_NODE__JOIN_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Join Fork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__JOIN_FORK = JsPackage.ABSTRACT_NODE__JOIN_FORK;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__PARAMETERS = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__PRESENTATION = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__VALIDATION = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__ACTION = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>User Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_FEATURE_COUNT = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.foundation.impl.SubFlowImpl <em>Sub Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.foundation.impl.SubFlowImpl
	 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getSubFlow()
	 * @generated
	 */
	int SUB_FLOW = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW__NAME = JsPackage.ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW__ID = JsPackage.ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW__OWNER = JsPackage.ABSTRACT_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW__DESCRIPTION = JsPackage.ABSTRACT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW__DECLARATIONS = JsPackage.ABSTRACT_NODE__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW__START = JsPackage.ABSTRACT_NODE__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW__STOP = JsPackage.ABSTRACT_NODE__STOP;

	/**
	 * The feature id for the '<em><b>Inbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW__INBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__INBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Outbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW__OUTBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__OUTBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW__ERROR_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Handlers Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW__ERROR_HANDLERS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_HANDLERS_ORDER;

	/**
	 * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW__JOIN_CONDITIONS = JsPackage.ABSTRACT_NODE__JOIN_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Join Fork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW__JOIN_FORK = JsPackage.ABSTRACT_NODE__JOIN_FORK;

	/**
	 * The number of structural features of the '<em>Sub Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW_FEATURE_COUNT = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.foundation.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.foundation.impl.ParticipantImpl
	 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__NAME = JsPackage.ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__ID = JsPackage.ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__OWNER = JsPackage.ABSTRACT_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__DESCRIPTION = JsPackage.ABSTRACT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__DECLARATIONS = JsPackage.ABSTRACT_NODE__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__START = JsPackage.ABSTRACT_NODE__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__STOP = JsPackage.ABSTRACT_NODE__STOP;

	/**
	 * The feature id for the '<em><b>Inbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__INBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__INBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Outbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__OUTBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__OUTBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__ERROR_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Handlers Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__ERROR_HANDLERS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_HANDLERS_ORDER;

	/**
	 * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__JOIN_CONDITIONS = JsPackage.ABSTRACT_NODE__JOIN_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Join Fork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__JOIN_FORK = JsPackage.ABSTRACT_NODE__JOIN_FORK;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__SCOPE = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__SELECTOR = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__INPUT_PORTS = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__OUTPUT_PORTS = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.foundation.impl.GenericContainerImpl <em>Generic Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.foundation.impl.GenericContainerImpl
	 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getGenericContainer()
	 * @generated
	 */
	int GENERIC_CONTAINER = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTAINER__NAME = JsPackage.ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTAINER__ID = JsPackage.ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTAINER__OWNER = JsPackage.ABSTRACT_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTAINER__DESCRIPTION = JsPackage.ABSTRACT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTAINER__DECLARATIONS = JsPackage.ABSTRACT_NODE__DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTAINER__START = JsPackage.ABSTRACT_NODE__START;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTAINER__STOP = JsPackage.ABSTRACT_NODE__STOP;

	/**
	 * The feature id for the '<em><b>Inbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTAINER__INBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__INBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Outbound Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTAINER__OUTBOUND_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__OUTBOUND_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Transitions Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTAINER__ERROR_TRANSITIONS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_TRANSITIONS_ORDER;

	/**
	 * The feature id for the '<em><b>Error Handlers Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTAINER__ERROR_HANDLERS_ORDER = JsPackage.ABSTRACT_NODE__ERROR_HANDLERS_ORDER;

	/**
	 * The feature id for the '<em><b>Join Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTAINER__JOIN_CONDITIONS = JsPackage.ABSTRACT_NODE__JOIN_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Join Fork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTAINER__JOIN_FORK = JsPackage.ABSTRACT_NODE__JOIN_FORK;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTAINER__ICON = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CONTAINER_FEATURE_COUNT = JsPackage.ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.foundation.ScheduledTransitionType <em>Scheduled Transition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.foundation.ScheduledTransitionType
	 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getScheduledTransitionType()
	 * @generated
	 */
	int SCHEDULED_TRANSITION_TYPE = 20;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.foundation.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Call
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.amur.it.js.foundation.Call#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Call#getParameters()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.foundation.Call#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Call#getHandler()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_Handler();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.foundation.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.foundation.Transition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Transition#getCondition()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.amur.it.js.foundation.Transition#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Transition#getParameters()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.foundation.Transition#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Transition#getHandler()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Handler();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.foundation.Transition#isDispatch <em>Dispatch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dispatch</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Transition#isDispatch()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Dispatch();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.foundation.Transition#getJoinType <em>Join Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Type</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Transition#getJoinType()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_JoinType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.amur.it.js.foundation.Transition#getOutputParameters <em>Output Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Parameters</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Transition#getOutputParameters()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_OutputParameters();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.foundation.ScheduledTransition <em>Scheduled Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduled Transition</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.ScheduledTransition
	 * @generated
	 */
	EClass getScheduledTransition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.foundation.ScheduledTransition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.ScheduledTransition#getType()
	 * @see #getScheduledTransition()
	 * @generated
	 */
	EAttribute getScheduledTransition_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.foundation.ScheduledTransition#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.ScheduledTransition#getPeriod()
	 * @see #getScheduledTransition()
	 * @generated
	 */
	EReference getScheduledTransition_Period();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.foundation.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.foundation.Reference#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Reference#getScope()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.foundation.Reference#getAccessor <em>Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accessor</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Reference#getAccessor()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Accessor();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.foundation.Reference#getMutator <em>Mutator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mutator</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Reference#getMutator()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Mutator();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.foundation.ErrorTransition <em>Error Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Transition</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.ErrorTransition
	 * @generated
	 */
	EClass getErrorTransition();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.foundation.ErrorTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.ErrorTransition#getCondition()
	 * @see #getErrorTransition()
	 * @generated
	 */
	EReference getErrorTransition_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.foundation.ErrorTransition#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.ErrorTransition#getHandler()
	 * @see #getErrorTransition()
	 * @generated
	 */
	EReference getErrorTransition_Handler();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.foundation.ErrorHandler <em>Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Handler</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.ErrorHandler
	 * @generated
	 */
	EClass getErrorHandler();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.foundation.ErrorHandler#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.ErrorHandler#getCondition()
	 * @see #getErrorHandler()
	 * @generated
	 */
	EReference getErrorHandler_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.foundation.ErrorHandler#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.ErrorHandler#getHandler()
	 * @see #getErrorHandler()
	 * @generated
	 */
	EReference getErrorHandler_Handler();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.foundation.EventListener <em>Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Listener</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.EventListener
	 * @generated
	 */
	EClass getEventListener();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.foundation.EventListener#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.EventListener#getCondition()
	 * @see #getEventListener()
	 * @generated
	 */
	EReference getEventListener_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.foundation.EventListener#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.EventListener#getHandler()
	 * @see #getEventListener()
	 * @generated
	 */
	EReference getEventListener_Handler();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.foundation.TopLevelFlow <em>Top Level Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Level Flow</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.TopLevelFlow
	 * @generated
	 */
	EClass getTopLevelFlow();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.foundation.TopLevelFlow#getScriptFolder <em>Script Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Folder</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.TopLevelFlow#getScriptFolder()
	 * @see #getTopLevelFlow()
	 * @generated
	 */
	EAttribute getTopLevelFlow_ScriptFolder();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.foundation.TopLevelFlow#getResourceFolder <em>Resource Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Folder</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.TopLevelFlow#getResourceFolder()
	 * @see #getTopLevelFlow()
	 * @generated
	 */
	EAttribute getTopLevelFlow_ResourceFolder();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.foundation.TopLevelFlow#getSkeleton <em>Skeleton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skeleton</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.TopLevelFlow#getSkeleton()
	 * @see #getTopLevelFlow()
	 * @generated
	 */
	EAttribute getTopLevelFlow_Skeleton();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.foundation.PropertyInputPort <em>Property Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Input Port</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.PropertyInputPort
	 * @generated
	 */
	EClass getPropertyInputPort();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.foundation.PropertyInputPort#getAccessor <em>Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accessor</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.PropertyInputPort#getAccessor()
	 * @see #getPropertyInputPort()
	 * @generated
	 */
	EReference getPropertyInputPort_Accessor();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.foundation.PropertyInputPort#getMutator <em>Mutator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mutator</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.PropertyInputPort#getMutator()
	 * @see #getPropertyInputPort()
	 * @generated
	 */
	EReference getPropertyInputPort_Mutator();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.foundation.FunctionInputPort <em>Function Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Input Port</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.FunctionInputPort
	 * @generated
	 */
	EClass getFunctionInputPort();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.amur.it.js.foundation.FunctionInputPort#getInputParameters <em>Input Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Parameters</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.FunctionInputPort#getInputParameters()
	 * @see #getFunctionInputPort()
	 * @generated
	 */
	EReference getFunctionInputPort_InputParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.foundation.FunctionInputPort#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.FunctionInputPort#getHandler()
	 * @see #getFunctionInputPort()
	 * @generated
	 */
	EReference getFunctionInputPort_Handler();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.foundation.PropertyOutputPort <em>Property Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Output Port</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.PropertyOutputPort
	 * @generated
	 */
	EClass getPropertyOutputPort();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.foundation.FunctionOutputPort <em>Function Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Output Port</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.FunctionOutputPort
	 * @generated
	 */
	EClass getFunctionOutputPort();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.amur.it.js.foundation.FunctionOutputPort#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.FunctionOutputPort#getParameters()
	 * @see #getFunctionOutputPort()
	 * @generated
	 */
	EReference getFunctionOutputPort_Parameters();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.foundation.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.amur.it.js.foundation.Activity#getInputParameters <em>Input Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Parameters</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Activity#getInputParameters()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_InputParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.foundation.Activity#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Activity#getHandler()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Handler();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.foundation.Suite <em>Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suite</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Suite
	 * @generated
	 */
	EClass getSuite();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.amur.it.js.foundation.Suite#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Components</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Suite#getComponents()
	 * @see #getSuite()
	 * @generated
	 */
	EAttribute getSuite_Components();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.foundation.GenericNode <em>Generic Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Node</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.GenericNode
	 * @generated
	 */
	EClass getGenericNode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.foundation.GenericNode#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.GenericNode#getIcon()
	 * @see #getGenericNode()
	 * @generated
	 */
	EAttribute getGenericNode_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.foundation.GenericNode#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.GenericNode#getImage()
	 * @see #getGenericNode()
	 * @generated
	 */
	EAttribute getGenericNode_Image();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.foundation.ObjectNode <em>Object Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Node</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.ObjectNode
	 * @generated
	 */
	EClass getObjectNode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.foundation.ObjectNode#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.ObjectNode#getScope()
	 * @see #getObjectNode()
	 * @generated
	 */
	EAttribute getObjectNode_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.foundation.ObjectNode#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.ObjectNode#getSelector()
	 * @see #getObjectNode()
	 * @generated
	 */
	EReference getObjectNode_Selector();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.foundation.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Task</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.UserTask
	 * @generated
	 */
	EClass getUserTask();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.amur.it.js.foundation.UserTask#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.UserTask#getParameters()
	 * @see #getUserTask()
	 * @generated
	 */
	EReference getUserTask_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.foundation.UserTask#getPresentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Presentation</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.UserTask#getPresentation()
	 * @see #getUserTask()
	 * @generated
	 */
	EReference getUserTask_Presentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.foundation.UserTask#getValidation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validation</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.UserTask#getValidation()
	 * @see #getUserTask()
	 * @generated
	 */
	EReference getUserTask_Validation();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.foundation.UserTask#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.UserTask#getAction()
	 * @see #getUserTask()
	 * @generated
	 */
	EReference getUserTask_Action();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.foundation.SubFlow <em>Sub Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Flow</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.SubFlow
	 * @generated
	 */
	EClass getSubFlow();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.foundation.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.foundation.Participant#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Participant#getScope()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.it.js.foundation.Participant#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Participant#getSelector()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Selector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.amur.it.js.foundation.Participant#getInputPorts <em>Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Ports</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Participant#getInputPorts()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_InputPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.amur.it.js.foundation.Participant#getOutputPorts <em>Output Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Ports</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.Participant#getOutputPorts()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_OutputPorts();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.foundation.GenericContainer <em>Generic Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Container</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.GenericContainer
	 * @generated
	 */
	EClass getGenericContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.foundation.GenericContainer#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.GenericContainer#getIcon()
	 * @see #getGenericContainer()
	 * @generated
	 */
	EAttribute getGenericContainer_Icon();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.amur.it.js.foundation.ScheduledTransitionType <em>Scheduled Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheduled Transition Type</em>'.
	 * @see org.nasdanika.amur.it.js.foundation.ScheduledTransitionType
	 * @generated
	 */
	EEnum getScheduledTransitionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FoundationFactory getFoundationFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.foundation.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.foundation.impl.CallImpl
		 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getCall()
		 * @generated
		 */
		EClass CALL = eINSTANCE.getCall();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__PARAMETERS = eINSTANCE.getCall_Parameters();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__HANDLER = eINSTANCE.getCall_Handler();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.foundation.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.foundation.impl.TransitionImpl
		 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__CONDITION = eINSTANCE.getTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__PARAMETERS = eINSTANCE.getTransition_Parameters();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__HANDLER = eINSTANCE.getTransition_Handler();

		/**
		 * The meta object literal for the '<em><b>Dispatch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__DISPATCH = eINSTANCE.getTransition_Dispatch();

		/**
		 * The meta object literal for the '<em><b>Join Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__JOIN_TYPE = eINSTANCE.getTransition_JoinType();

		/**
		 * The meta object literal for the '<em><b>Output Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OUTPUT_PARAMETERS = eINSTANCE.getTransition_OutputParameters();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.foundation.impl.ScheduledTransitionImpl <em>Scheduled Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.foundation.impl.ScheduledTransitionImpl
		 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getScheduledTransition()
		 * @generated
		 */
		EClass SCHEDULED_TRANSITION = eINSTANCE.getScheduledTransition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_TRANSITION__TYPE = eINSTANCE.getScheduledTransition_Type();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULED_TRANSITION__PERIOD = eINSTANCE.getScheduledTransition_Period();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.foundation.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.foundation.impl.ReferenceImpl
		 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__SCOPE = eINSTANCE.getReference_Scope();

		/**
		 * The meta object literal for the '<em><b>Accessor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__ACCESSOR = eINSTANCE.getReference_Accessor();

		/**
		 * The meta object literal for the '<em><b>Mutator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__MUTATOR = eINSTANCE.getReference_Mutator();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.foundation.impl.ErrorTransitionImpl <em>Error Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.foundation.impl.ErrorTransitionImpl
		 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getErrorTransition()
		 * @generated
		 */
		EClass ERROR_TRANSITION = eINSTANCE.getErrorTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_TRANSITION__CONDITION = eINSTANCE.getErrorTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_TRANSITION__HANDLER = eINSTANCE.getErrorTransition_Handler();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.foundation.impl.ErrorHandlerImpl <em>Error Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.foundation.impl.ErrorHandlerImpl
		 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getErrorHandler()
		 * @generated
		 */
		EClass ERROR_HANDLER = eINSTANCE.getErrorHandler();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_HANDLER__CONDITION = eINSTANCE.getErrorHandler_Condition();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_HANDLER__HANDLER = eINSTANCE.getErrorHandler_Handler();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.foundation.impl.EventListenerImpl <em>Event Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.foundation.impl.EventListenerImpl
		 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getEventListener()
		 * @generated
		 */
		EClass EVENT_LISTENER = eINSTANCE.getEventListener();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LISTENER__CONDITION = eINSTANCE.getEventListener_Condition();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LISTENER__HANDLER = eINSTANCE.getEventListener_Handler();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.foundation.impl.TopLevelFlowImpl <em>Top Level Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.foundation.impl.TopLevelFlowImpl
		 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getTopLevelFlow()
		 * @generated
		 */
		EClass TOP_LEVEL_FLOW = eINSTANCE.getTopLevelFlow();

		/**
		 * The meta object literal for the '<em><b>Script Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_LEVEL_FLOW__SCRIPT_FOLDER = eINSTANCE.getTopLevelFlow_ScriptFolder();

		/**
		 * The meta object literal for the '<em><b>Resource Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_LEVEL_FLOW__RESOURCE_FOLDER = eINSTANCE.getTopLevelFlow_ResourceFolder();

		/**
		 * The meta object literal for the '<em><b>Skeleton</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_LEVEL_FLOW__SKELETON = eINSTANCE.getTopLevelFlow_Skeleton();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.foundation.impl.PropertyInputPortImpl <em>Property Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.foundation.impl.PropertyInputPortImpl
		 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getPropertyInputPort()
		 * @generated
		 */
		EClass PROPERTY_INPUT_PORT = eINSTANCE.getPropertyInputPort();

		/**
		 * The meta object literal for the '<em><b>Accessor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_INPUT_PORT__ACCESSOR = eINSTANCE.getPropertyInputPort_Accessor();

		/**
		 * The meta object literal for the '<em><b>Mutator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_INPUT_PORT__MUTATOR = eINSTANCE.getPropertyInputPort_Mutator();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.foundation.impl.FunctionInputPortImpl <em>Function Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.foundation.impl.FunctionInputPortImpl
		 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getFunctionInputPort()
		 * @generated
		 */
		EClass FUNCTION_INPUT_PORT = eINSTANCE.getFunctionInputPort();

		/**
		 * The meta object literal for the '<em><b>Input Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_INPUT_PORT__INPUT_PARAMETERS = eINSTANCE.getFunctionInputPort_InputParameters();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_INPUT_PORT__HANDLER = eINSTANCE.getFunctionInputPort_Handler();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.foundation.impl.PropertyOutputPortImpl <em>Property Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.foundation.impl.PropertyOutputPortImpl
		 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getPropertyOutputPort()
		 * @generated
		 */
		EClass PROPERTY_OUTPUT_PORT = eINSTANCE.getPropertyOutputPort();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.foundation.impl.FunctionOutputPortImpl <em>Function Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.foundation.impl.FunctionOutputPortImpl
		 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getFunctionOutputPort()
		 * @generated
		 */
		EClass FUNCTION_OUTPUT_PORT = eINSTANCE.getFunctionOutputPort();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_OUTPUT_PORT__PARAMETERS = eINSTANCE.getFunctionOutputPort_Parameters();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.foundation.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.foundation.impl.ActivityImpl
		 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Input Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__INPUT_PARAMETERS = eINSTANCE.getActivity_InputParameters();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__HANDLER = eINSTANCE.getActivity_Handler();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.foundation.impl.SuiteImpl <em>Suite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.foundation.impl.SuiteImpl
		 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getSuite()
		 * @generated
		 */
		EClass SUITE = eINSTANCE.getSuite();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUITE__COMPONENTS = eINSTANCE.getSuite_Components();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.foundation.impl.GenericNodeImpl <em>Generic Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.foundation.impl.GenericNodeImpl
		 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getGenericNode()
		 * @generated
		 */
		EClass GENERIC_NODE = eINSTANCE.getGenericNode();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_NODE__ICON = eINSTANCE.getGenericNode_Icon();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_NODE__IMAGE = eINSTANCE.getGenericNode_Image();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.foundation.impl.ObjectNodeImpl <em>Object Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.foundation.impl.ObjectNodeImpl
		 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getObjectNode()
		 * @generated
		 */
		EClass OBJECT_NODE = eINSTANCE.getObjectNode();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_NODE__SCOPE = eINSTANCE.getObjectNode_Scope();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_NODE__SELECTOR = eINSTANCE.getObjectNode_Selector();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.foundation.impl.UserTaskImpl <em>User Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.foundation.impl.UserTaskImpl
		 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getUserTask()
		 * @generated
		 */
		EClass USER_TASK = eINSTANCE.getUserTask();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TASK__PARAMETERS = eINSTANCE.getUserTask_Parameters();

		/**
		 * The meta object literal for the '<em><b>Presentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TASK__PRESENTATION = eINSTANCE.getUserTask_Presentation();

		/**
		 * The meta object literal for the '<em><b>Validation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TASK__VALIDATION = eINSTANCE.getUserTask_Validation();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TASK__ACTION = eINSTANCE.getUserTask_Action();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.foundation.impl.SubFlowImpl <em>Sub Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.foundation.impl.SubFlowImpl
		 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getSubFlow()
		 * @generated
		 */
		EClass SUB_FLOW = eINSTANCE.getSubFlow();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.foundation.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.foundation.impl.ParticipantImpl
		 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__SCOPE = eINSTANCE.getParticipant_Scope();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__SELECTOR = eINSTANCE.getParticipant_Selector();

		/**
		 * The meta object literal for the '<em><b>Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__INPUT_PORTS = eINSTANCE.getParticipant_InputPorts();

		/**
		 * The meta object literal for the '<em><b>Output Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__OUTPUT_PORTS = eINSTANCE.getParticipant_OutputPorts();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.foundation.impl.GenericContainerImpl <em>Generic Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.foundation.impl.GenericContainerImpl
		 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getGenericContainer()
		 * @generated
		 */
		EClass GENERIC_CONTAINER = eINSTANCE.getGenericContainer();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_CONTAINER__ICON = eINSTANCE.getGenericContainer_Icon();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.foundation.ScheduledTransitionType <em>Scheduled Transition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.foundation.ScheduledTransitionType
		 * @see org.nasdanika.amur.it.js.foundation.impl.FoundationPackageImpl#getScheduledTransitionType()
		 * @generated
		 */
		EEnum SCHEDULED_TRANSITION_TYPE = eINSTANCE.getScheduledTransitionType();

	}

} //FoundationPackage
