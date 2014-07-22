/**
 */
package org.nasdanika.amur.it.js.exec.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.exec.Array;
import org.nasdanika.amur.it.js.exec.ExecPackage;
import org.nasdanika.amur.it.js.exec.Initializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.ArrayImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayImpl extends InitializerImpl implements Array {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecPackage.Literals.ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getJavaScript() {
		StringBuilder eList = new StringBuilder();
		for (Initializer e: getElements()) {
			if (eList.length()>0) {
				eList.append(", ");
			}
			if (e.getComment()!=null) {
				eList.append("/* "+System.lineSeparator()+e.getComment()+System.lineSeparator()+"*/"+System.lineSeparator());
			}
			eList.append(e.getJavaScript());
		}
		return "["+eList+"]";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Initializer> getElements() {
		return (EList<Initializer>)eGet(ExecPackage.Literals.ARRAY__ELEMENTS, true);
	}

} //ArrayImpl
