/**
 */
package org.nasdanika.amur.it.js.exec.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.nasdanika.amur.it.js.exec.ExecPackage;
import org.nasdanika.amur.it.js.exec.Initializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.InitializerImpl#getJavaScript <em>Java Script</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.InitializerImpl#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InitializerImpl extends CDOObjectImpl implements Initializer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitializerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecPackage.Literals.INITIALIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getJavaScript() {
		throw new UnsupportedOperationException();
		//return (String)eGet(ExecPackage.Literals.INITIALIZER__JAVA_SCRIPT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return (String)eGet(ExecPackage.Literals.INITIALIZER__COMMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		eSet(ExecPackage.Literals.INITIALIZER__COMMENT, newComment);
	}
	
	public static boolean isBlank(String str) {
		return str==null || str.trim().length()==0;
	}

} //InitializerImpl
