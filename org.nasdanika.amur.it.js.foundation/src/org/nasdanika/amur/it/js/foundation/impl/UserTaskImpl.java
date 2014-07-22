/**
 */
package org.nasdanika.amur.it.js.foundation.impl;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.Component;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.UserTask;
import org.nasdanika.amur.it.js.impl.AbstractNodeImpl;

import org.nasdanika.amur.lang.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.UserTaskImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.UserTaskImpl#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.UserTaskImpl#getValidation <em>Validation</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.UserTaskImpl#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserTaskImpl extends AbstractNodeImpl implements UserTask {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public UserTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoundationPackage.Literals.USER_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> getParameters() {
		return (EList<Parameter>)eGet(FoundationPackage.Literals.USER_TASK__PARAMETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getPresentation() {
		return (Source)eGet(FoundationPackage.Literals.USER_TASK__PRESENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentation(Source newPresentation) {
		eSet(FoundationPackage.Literals.USER_TASK__PRESENTATION, newPresentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getValidation() {
		return (Source)eGet(FoundationPackage.Literals.USER_TASK__VALIDATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidation(Source newValidation) {
		eSet(FoundationPackage.Literals.USER_TASK__VALIDATION, newValidation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getAction() {
		return (Source)eGet(FoundationPackage.Literals.USER_TASK__ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Source newAction) {
		eSet(FoundationPackage.Literals.USER_TASK__ACTION, newAction);
	}

	@Override
	public List<Parameter> genInputParameters(Component input,
			Map<Object, Object> context, IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String genHandler(Component source, Map<Object, Object> context,
			IProgressMonitor monitor, MultiStatus status) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

} //UserTaskImpl
