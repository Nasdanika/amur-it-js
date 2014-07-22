/**
 */
package org.nasdanika.amur.it.js.exec.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.exec.ExecPackage;
import org.nasdanika.amur.it.js.exec.Function;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.FunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.FunctionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.FunctionImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionImpl extends InitializerImpl implements Function {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getJavaScript() {
		StringBuilder pList = new StringBuilder();
		for (Parameter p: getParameters()) {
			if (pList.length()>0) {
				pList.append(", ");
			}
			pList.append(p.getName());
		}
		return "function "+(getName()==null ? "" : getName()+" ")+"("+pList+") {"+System.lineSeparator()+getBody()+System.lineSeparator()+"}";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ExecPackage.Literals.FUNCTION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ExecPackage.Literals.FUNCTION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> getParameters() {
		return (EList<Parameter>)eGet(ExecPackage.Literals.FUNCTION__PARAMETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return (String)eGet(ExecPackage.Literals.FUNCTION__BODY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		eSet(ExecPackage.Literals.FUNCTION__BODY, newBody);
	}

} //FunctionImpl
