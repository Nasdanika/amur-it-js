/**
 */
package org.nasdanika.amur.it.js.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.FunctionPortDescriptor;
import org.nasdanika.amur.it.js.JsPackage;
import org.nasdanika.amur.it.js.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Port Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.impl.FunctionPortDescriptorImpl#getThrownErrors <em>Thrown Errors</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.impl.FunctionPortDescriptorImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionPortDescriptorImpl extends PortDescriptorImpl implements FunctionPortDescriptor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionPortDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsPackage.Literals.FUNCTION_PORT_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> getThrownErrors() {
		return (EList<Parameter>)eGet(JsPackage.Literals.FUNCTION_PORT_DESCRIPTOR__THROWN_ERRORS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> getParameters() {
		return (EList<Parameter>)eGet(JsPackage.Literals.FUNCTION_PORT_DESCRIPTOR__PARAMETERS, true);
	}

} //FunctionPortDescriptorImpl
