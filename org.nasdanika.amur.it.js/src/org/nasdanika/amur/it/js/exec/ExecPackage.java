/**
 */
package org.nasdanika.amur.it.js.exec;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.nasdanika.amur.it.js.exec.ExecFactory
 * @model kind="package"
 * @generated
 */
public interface ExecPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "exec";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.amur.it.js.exec";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.amur.it.js.exec";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExecPackage eINSTANCE = org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.exec.impl.InitializerImpl <em>Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.exec.impl.InitializerImpl
	 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getInitializer()
	 * @generated
	 */
	int INITIALIZER = 0;

	/**
	 * The feature id for the '<em><b>Java Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__JAVA_SCRIPT = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__COMMENT = 1;

	/**
	 * The number of structural features of the '<em>Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.exec.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.exec.impl.FunctionImpl
	 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.exec.impl.FragmentImpl <em>Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.exec.impl.FragmentImpl
	 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getFragment()
	 * @generated
	 */
	int FRAGMENT = 3;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.exec.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.exec.impl.ArrayImpl
	 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 4;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.exec.impl.HashImpl <em>Hash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.exec.impl.HashImpl
	 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getHash()
	 * @generated
	 */
	int HASH = 5;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.exec.impl.HashEntryImpl <em>Hash Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.exec.impl.HashEntryImpl
	 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getHashEntry()
	 * @generated
	 */
	int HASH_ENTRY = 6;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.exec.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.exec.impl.ComponentImpl
	 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 7;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.exec.impl.DependencyEntryImpl <em>Dependency Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.exec.impl.DependencyEntryImpl
	 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getDependencyEntry()
	 * @generated
	 */
	int DEPENDENCY_ENTRY = 8;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.exec.impl.DependencyInfoImpl <em>Dependency Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.exec.impl.DependencyInfoImpl
	 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getDependencyInfo()
	 * @generated
	 */
	int DEPENDENCY_INFO = 9;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.exec.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.exec.impl.PropertyImpl
	 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Java Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__JAVA_SCRIPT = INITIALIZER__JAVA_SCRIPT;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__COMMENT = INITIALIZER__COMMENT;

	/**
	 * The feature id for the '<em><b>Accessor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ACCESSOR = INITIALIZER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mutator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__MUTATOR = INITIALIZER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mutator Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__MUTATOR_PARAMETER_NAME = INITIALIZER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = INITIALIZER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Java Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__JAVA_SCRIPT = INITIALIZER__JAVA_SCRIPT;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__COMMENT = INITIALIZER__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = INITIALIZER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = INITIALIZER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__BODY = INITIALIZER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = INITIALIZER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Java Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__JAVA_SCRIPT = INITIALIZER__JAVA_SCRIPT;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__COMMENT = INITIALIZER__COMMENT;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__CODE = INITIALIZER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_FEATURE_COUNT = INITIALIZER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Java Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__JAVA_SCRIPT = INITIALIZER__JAVA_SCRIPT;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__COMMENT = INITIALIZER__COMMENT;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__ELEMENTS = INITIALIZER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = INITIALIZER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Java Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH__JAVA_SCRIPT = INITIALIZER__JAVA_SCRIPT;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH__COMMENT = INITIALIZER__COMMENT;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH__ENTRIES = INITIALIZER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH__PATH = INITIALIZER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_FEATURE_COUNT = INITIALIZER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Hash Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Java Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__JAVA_SCRIPT = HASH__JAVA_SCRIPT;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMMENT = HASH__COMMENT;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ENTRIES = HASH__ENTRIES;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PATH = HASH__PATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = HASH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INPUTS = HASH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OUTPUTS = HASH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__WEIGHT = HASH_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__START_LEVEL = HASH_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Forceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FORCEABLE = HASH_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CREATOR = HASH_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Start Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__START_ROOT = HASH_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Start Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__START_TERMINAL = HASH_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = HASH_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Dependency Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Weight Coeff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_INFO__WEIGHT_COEFF = 0;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_INFO__GUARD = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_INFO__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_INFO__NAME = 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_INFO__ORDER = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_INFO__ROLE = 5;

	/**
	 * The feature id for the '<em><b>Output Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_INFO__OUTPUT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_INFO__CODE = 7;

	/**
	 * The feature id for the '<em><b>Reference Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_INFO__REFERENCE_SCOPE = 8;

	/**
	 * The feature id for the '<em><b>Join Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_INFO__JOIN_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Join Conditions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_INFO__JOIN_CONDITIONS = 10;

	/**
	 * The number of structural features of the '<em>Dependency Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_INFO_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.exec.impl.CodeEntryImpl <em>Code Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.exec.impl.CodeEntryImpl
	 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getCodeEntry()
	 * @generated
	 */
	int CODE_ENTRY = 10;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Code Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.exec.DependencyRole <em>Dependency Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.exec.DependencyRole
	 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getDependencyRole()
	 * @generated
	 */
	int DEPENDENCY_ROLE = 11;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.it.js.exec.OutputType <em>Output Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.it.js.exec.OutputType
	 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getOutputType()
	 * @generated
	 */
	int OUTPUT_TYPE = 12;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.exec.Initializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initializer</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Initializer
	 * @generated
	 */
	EClass getInitializer();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.Initializer#getJavaScript <em>Java Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Script</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Initializer#getJavaScript()
	 * @see #getInitializer()
	 * @generated
	 */
	EAttribute getInitializer_JavaScript();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.Initializer#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Initializer#getComment()
	 * @see #getInitializer()
	 * @generated
	 */
	EAttribute getInitializer_Comment();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.exec.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.amur.it.js.exec.Function#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Function#getParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.Function#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Function#getBody()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Body();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.exec.Fragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Fragment
	 * @generated
	 */
	EClass getFragment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.Fragment#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Fragment#getCode()
	 * @see #getFragment()
	 * @generated
	 */
	EAttribute getFragment_Code();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.exec.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.amur.it.js.exec.Array#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Array#getElements()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_Elements();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.exec.Hash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Hash
	 * @generated
	 */
	EClass getHash();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.amur.it.js.exec.Hash#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Entries</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Hash#getEntries()
	 * @see #getHash()
	 * @generated
	 */
	EReference getHash_Entries();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.Hash#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Hash#getPath()
	 * @see #getHash()
	 * @generated
	 */
	EAttribute getHash_Path();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Hash Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.nasdanika.amur.it.js.exec.Initializer" valueContainment="true"
	 * @generated
	 */
	EClass getHashEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getHashEntry()
	 * @generated
	 */
	EAttribute getHashEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getHashEntry()
	 * @generated
	 */
	EReference getHashEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.exec.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.Component#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Component#getId()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Id();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.amur.it.js.exec.Component#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Inputs</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Component#getInputs()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Inputs();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.amur.it.js.exec.Component#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Outputs</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Component#getOutputs()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Outputs();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.Component#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Component#getWeight()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Weight();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.Component#getStartLevel <em>Start Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Level</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Component#getStartLevel()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_StartLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.Component#isForceable <em>Forceable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forceable</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Component#isForceable()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Forceable();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.amur.it.js.exec.Component#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Creator</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Component#getCreator()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Creator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.Component#getStartRoot <em>Start Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Root</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Component#getStartRoot()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_StartRoot();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.Component#getStartTerminal <em>Start Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Terminal</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Component#getStartTerminal()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_StartTerminal();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Dependency Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.nasdanika.amur.it.js.exec.Component"
	 *        valueType="org.nasdanika.amur.it.js.exec.DependencyInfo" valueContainment="true"
	 * @generated
	 */
	EClass getDependencyEntry();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getDependencyEntry()
	 * @generated
	 */
	EReference getDependencyEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getDependencyEntry()
	 * @generated
	 */
	EReference getDependencyEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.exec.DependencyInfo <em>Dependency Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Info</em>'.
	 * @see org.nasdanika.amur.it.js.exec.DependencyInfo
	 * @generated
	 */
	EClass getDependencyInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getWeightCoeff <em>Weight Coeff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight Coeff</em>'.
	 * @see org.nasdanika.amur.it.js.exec.DependencyInfo#getWeightCoeff()
	 * @see #getDependencyInfo()
	 * @generated
	 */
	EAttribute getDependencyInfo_WeightCoeff();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard</em>'.
	 * @see org.nasdanika.amur.it.js.exec.DependencyInfo#getGuard()
	 * @see #getDependencyInfo()
	 * @generated
	 */
	EAttribute getDependencyInfo_Guard();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.nasdanika.amur.it.js.exec.DependencyInfo#getParameters()
	 * @see #getDependencyInfo()
	 * @generated
	 */
	EReference getDependencyInfo_Parameters();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Code</em>'.
	 * @see org.nasdanika.amur.it.js.exec.DependencyInfo#getCode()
	 * @see #getDependencyInfo()
	 * @generated
	 */
	EReference getDependencyInfo_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getReferenceScope <em>Reference Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Scope</em>'.
	 * @see org.nasdanika.amur.it.js.exec.DependencyInfo#getReferenceScope()
	 * @see #getDependencyInfo()
	 * @generated
	 */
	EAttribute getDependencyInfo_ReferenceScope();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getJoinType <em>Join Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join Type</em>'.
	 * @see org.nasdanika.amur.it.js.exec.DependencyInfo#getJoinType()
	 * @see #getDependencyInfo()
	 * @generated
	 */
	EAttribute getDependencyInfo_JoinType();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getJoinConditions <em>Join Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Join Conditions</em>'.
	 * @see org.nasdanika.amur.it.js.exec.DependencyInfo#getJoinConditions()
	 * @see #getDependencyInfo()
	 * @generated
	 */
	EAttribute getDependencyInfo_JoinConditions();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Code Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getCodeEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getCodeEntry()
	 * @generated
	 */
	EAttribute getCodeEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getCodeEntry()
	 * @generated
	 */
	EAttribute getCodeEntry_Value();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.amur.it.js.exec.DependencyRole <em>Dependency Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dependency Role</em>'.
	 * @see org.nasdanika.amur.it.js.exec.DependencyRole
	 * @generated
	 */
	EEnum getDependencyRole();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.amur.it.js.exec.DependencyInfo#getName()
	 * @see #getDependencyInfo()
	 * @generated
	 */
	EAttribute getDependencyInfo_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.nasdanika.amur.it.js.exec.DependencyInfo#getOrder()
	 * @see #getDependencyInfo()
	 * @generated
	 */
	EAttribute getDependencyInfo_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.nasdanika.amur.it.js.exec.DependencyInfo#getRole()
	 * @see #getDependencyInfo()
	 * @generated
	 */
	EAttribute getDependencyInfo_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getOutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Type</em>'.
	 * @see org.nasdanika.amur.it.js.exec.DependencyInfo#getOutputType()
	 * @see #getDependencyInfo()
	 * @generated
	 */
	EAttribute getDependencyInfo_OutputType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.it.js.exec.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.Property#getAccessor <em>Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accessor</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Property#getAccessor()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Accessor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.Property#getMutator <em>Mutator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutator</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Property#getMutator()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Mutator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.it.js.exec.Property#getMutatorParameterName <em>Mutator Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutator Parameter Name</em>'.
	 * @see org.nasdanika.amur.it.js.exec.Property#getMutatorParameterName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_MutatorParameterName();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.amur.it.js.exec.OutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Output Type</em>'.
	 * @see org.nasdanika.amur.it.js.exec.OutputType
	 * @generated
	 */
	EEnum getOutputType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExecFactory getExecFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.exec.impl.InitializerImpl <em>Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.exec.impl.InitializerImpl
		 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getInitializer()
		 * @generated
		 */
		EClass INITIALIZER = eINSTANCE.getInitializer();

		/**
		 * The meta object literal for the '<em><b>Java Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIALIZER__JAVA_SCRIPT = eINSTANCE.getInitializer_JavaScript();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIALIZER__COMMENT = eINSTANCE.getInitializer_Comment();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.exec.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.exec.impl.FunctionImpl
		 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__BODY = eINSTANCE.getFunction_Body();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.exec.impl.FragmentImpl <em>Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.exec.impl.FragmentImpl
		 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getFragment()
		 * @generated
		 */
		EClass FRAGMENT = eINSTANCE.getFragment();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAGMENT__CODE = eINSTANCE.getFragment_Code();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.exec.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.exec.impl.ArrayImpl
		 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__ELEMENTS = eINSTANCE.getArray_Elements();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.exec.impl.HashImpl <em>Hash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.exec.impl.HashImpl
		 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getHash()
		 * @generated
		 */
		EClass HASH = eINSTANCE.getHash();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HASH__ENTRIES = eINSTANCE.getHash_Entries();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH__PATH = eINSTANCE.getHash_Path();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.exec.impl.HashEntryImpl <em>Hash Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.exec.impl.HashEntryImpl
		 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getHashEntry()
		 * @generated
		 */
		EClass HASH_ENTRY = eINSTANCE.getHashEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH_ENTRY__KEY = eINSTANCE.getHashEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HASH_ENTRY__VALUE = eINSTANCE.getHashEntry_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.exec.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.exec.impl.ComponentImpl
		 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__ID = eINSTANCE.getComponent_Id();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INPUTS = eINSTANCE.getComponent_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OUTPUTS = eINSTANCE.getComponent_Outputs();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__WEIGHT = eINSTANCE.getComponent_Weight();

		/**
		 * The meta object literal for the '<em><b>Start Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__START_LEVEL = eINSTANCE.getComponent_StartLevel();

		/**
		 * The meta object literal for the '<em><b>Forceable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__FORCEABLE = eINSTANCE.getComponent_Forceable();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CREATOR = eINSTANCE.getComponent_Creator();

		/**
		 * The meta object literal for the '<em><b>Start Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__START_ROOT = eINSTANCE.getComponent_StartRoot();

		/**
		 * The meta object literal for the '<em><b>Start Terminal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__START_TERMINAL = eINSTANCE.getComponent_StartTerminal();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.exec.impl.DependencyEntryImpl <em>Dependency Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.exec.impl.DependencyEntryImpl
		 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getDependencyEntry()
		 * @generated
		 */
		EClass DEPENDENCY_ENTRY = eINSTANCE.getDependencyEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_ENTRY__KEY = eINSTANCE.getDependencyEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_ENTRY__VALUE = eINSTANCE.getDependencyEntry_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.exec.impl.DependencyInfoImpl <em>Dependency Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.exec.impl.DependencyInfoImpl
		 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getDependencyInfo()
		 * @generated
		 */
		EClass DEPENDENCY_INFO = eINSTANCE.getDependencyInfo();

		/**
		 * The meta object literal for the '<em><b>Weight Coeff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_INFO__WEIGHT_COEFF = eINSTANCE.getDependencyInfo_WeightCoeff();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_INFO__GUARD = eINSTANCE.getDependencyInfo_Guard();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_INFO__PARAMETERS = eINSTANCE.getDependencyInfo_Parameters();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_INFO__CODE = eINSTANCE.getDependencyInfo_Code();

		/**
		 * The meta object literal for the '<em><b>Reference Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_INFO__REFERENCE_SCOPE = eINSTANCE.getDependencyInfo_ReferenceScope();

		/**
		 * The meta object literal for the '<em><b>Join Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_INFO__JOIN_TYPE = eINSTANCE.getDependencyInfo_JoinType();

		/**
		 * The meta object literal for the '<em><b>Join Conditions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_INFO__JOIN_CONDITIONS = eINSTANCE.getDependencyInfo_JoinConditions();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.exec.impl.CodeEntryImpl <em>Code Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.exec.impl.CodeEntryImpl
		 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getCodeEntry()
		 * @generated
		 */
		EClass CODE_ENTRY = eINSTANCE.getCodeEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_ENTRY__KEY = eINSTANCE.getCodeEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_ENTRY__VALUE = eINSTANCE.getCodeEntry_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.exec.DependencyRole <em>Dependency Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.exec.DependencyRole
		 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getDependencyRole()
		 * @generated
		 */
		EEnum DEPENDENCY_ROLE = eINSTANCE.getDependencyRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_INFO__NAME = eINSTANCE.getDependencyInfo_Name();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_INFO__ORDER = eINSTANCE.getDependencyInfo_Order();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_INFO__ROLE = eINSTANCE.getDependencyInfo_Role();

		/**
		 * The meta object literal for the '<em><b>Output Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_INFO__OUTPUT_TYPE = eINSTANCE.getDependencyInfo_OutputType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.exec.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.exec.impl.PropertyImpl
		 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Accessor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__ACCESSOR = eINSTANCE.getProperty_Accessor();

		/**
		 * The meta object literal for the '<em><b>Mutator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__MUTATOR = eINSTANCE.getProperty_Mutator();

		/**
		 * The meta object literal for the '<em><b>Mutator Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__MUTATOR_PARAMETER_NAME = eINSTANCE.getProperty_MutatorParameterName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.it.js.exec.OutputType <em>Output Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.it.js.exec.OutputType
		 * @see org.nasdanika.amur.it.js.exec.impl.ExecPackageImpl#getOutputType()
		 * @generated
		 */
		EEnum OUTPUT_TYPE = eINSTANCE.getOutputType();

	}

} //ExecPackage
