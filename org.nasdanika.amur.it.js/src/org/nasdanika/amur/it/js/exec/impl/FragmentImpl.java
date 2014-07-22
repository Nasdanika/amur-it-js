/**
 */
package org.nasdanika.amur.it.js.exec.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.exec.ExecPackage;
import org.nasdanika.amur.it.js.exec.Fragment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.FragmentImpl#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FragmentImpl extends InitializerImpl implements Fragment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecPackage.Literals.FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getJavaScript() {
		//return getComment()==null ? getCode() : "/* "+System.lineSeparator()+getComment()+System.lineSeparator()+"*/"+System.lineSeparator()+getCode();
		return getCode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return (String)eGet(ExecPackage.Literals.FRAGMENT__CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		eSet(ExecPackage.Literals.FRAGMENT__CODE, newCode);
	}

} //FragmentImpl
