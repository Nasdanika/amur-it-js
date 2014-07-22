/**
 */
package org.nasdanika.amur.it.js;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.amur.it.js.JsPackage
 * @generated
 */
public interface JsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JsFactory eINSTANCE = org.nasdanika.amur.it.js.impl.JsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();
	
	/**
	 * Returns a new object of class '<em>Function Port Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Port Descriptor</em>'.
	 * @generated
	 */
	FunctionPortDescriptor createFunctionPortDescriptor();

	/**
	 * Returns a new object of class '<em>Property Port Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Port Descriptor</em>'.
	 * @generated
	 */
	PropertyPortDescriptor createPropertyPortDescriptor();

	/**
	 * Returns a new object of class '<em>Join Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Entry</em>'.
	 * @generated
	 */
	JoinEntry createJoinEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JsPackage getJsPackage();

} //JsFactory
