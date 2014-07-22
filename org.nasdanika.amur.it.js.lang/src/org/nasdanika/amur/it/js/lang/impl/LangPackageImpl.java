/**
 */
package org.nasdanika.amur.it.js.lang.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.amur.it.js.lang.JavaScript;
import org.nasdanika.amur.it.js.lang.LangFactory;
import org.nasdanika.amur.it.js.lang.LangPackage;
import org.nasdanika.amur.it.js.lang.Text;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LangPackageImpl extends EPackageImpl implements LangPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaScriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

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
	 * @see org.nasdanika.amur.it.js.lang.LangPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LangPackageImpl() {
		super(eNS_URI, LangFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LangPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LangPackage init() {
		if (isInited) return (LangPackage)EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI);

		// Obtain or create and register package
		LangPackageImpl theLangPackage = (LangPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LangPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LangPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		org.nasdanika.amur.lang.LangPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLangPackage.createPackageContents();

		// Initialize created meta-data
		theLangPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLangPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LangPackage.eNS_URI, theLangPackage);
		return theLangPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaScript() {
		return javaScriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTML() {
		return htmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangFactory getLangFactory() {
		return (LangFactory)getEFactoryInstance();
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
		javaScriptEClass = createEClass(JAVA_SCRIPT);

		htmlEClass = createEClass(HTML);

		textEClass = createEClass(TEXT);
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
		org.nasdanika.amur.lang.LangPackage theLangPackage_1 = (org.nasdanika.amur.lang.LangPackage)EPackage.Registry.INSTANCE.getEPackage(org.nasdanika.amur.lang.LangPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		javaScriptEClass.getESuperTypes().add(theLangPackage_1.getTextualFilerLanguage());
		htmlEClass.getESuperTypes().add(theLangPackage_1.getTextualFilerLanguage());
		textEClass.getESuperTypes().add(theLangPackage_1.getTextualFilerLanguage());

		// Initialize classes and features; add operations and parameters
		initEClass(javaScriptEClass, JavaScript.class, "JavaScript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(htmlEClass, org.nasdanika.amur.it.js.lang.HTML.class, "HTML", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //LangPackageImpl
