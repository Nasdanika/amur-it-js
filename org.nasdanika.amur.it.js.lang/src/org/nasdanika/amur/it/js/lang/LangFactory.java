/**
 */
package org.nasdanika.amur.it.js.lang;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.amur.it.js.lang.LangPackage
 * @generated
 */
public interface LangFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LangFactory eINSTANCE = org.nasdanika.amur.it.js.lang.impl.LangFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Java Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Script</em>'.
	 * @generated
	 */
	JavaScript createJavaScript();

	/**
	 * Returns a new object of class '<em>HTML</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTML</em>'.
	 * @generated
	 */
	HTML createHTML();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LangPackage getLangPackage();

} //LangFactory
