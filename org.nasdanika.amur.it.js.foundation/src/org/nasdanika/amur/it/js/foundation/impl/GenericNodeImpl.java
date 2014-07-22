/**
 */
package org.nasdanika.amur.it.js.foundation.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.Component;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.GenericNode;
import org.nasdanika.amur.it.js.impl.AbstractNodeImpl;

import org.nasdanika.amur.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.GenericNodeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.GenericNodeImpl#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericNodeImpl extends AbstractNodeImpl implements GenericNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GenericNodeImpl() {
		super();
	}
	
	@Override
	public void eNotify(Notification notification) {
		super.eNotify(notification);
		if (getOwner() != null 
				&& (FoundationPackage.eINSTANCE.getGenericNode_Icon().equals(notification.getFeature()) || FoundationPackage.eINSTANCE.getGenericNode_Image().equals(notification.getFeature()))) {
			// A trick to send notifications from the owner in order to modify appearance.
			String oldName = getOwner().getName();
			getOwner().setName("");
			getOwner().setName(oldName);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoundationPackage.Literals.GENERIC_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcon() {
		return (String)eGet(FoundationPackage.Literals.GENERIC_NODE__ICON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(String newIcon) {
		eSet(FoundationPackage.Literals.GENERIC_NODE__ICON, newIcon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage() {
		return (String)eGet(FoundationPackage.Literals.GENERIC_NODE__IMAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(String newImage) {
		eSet(FoundationPackage.Literals.GENERIC_NODE__IMAGE, newImage);
	}

	@Override
	public List<Parameter> genInputParameters(
			Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		
		return Collections.emptyList();
	}

	@Override
	public String genHandler(Component source, Map<Object, Object> context,	IProgressMonitor monitor, MultiStatus status) throws Exception {		
		return "throw 'Unsupported operation - Generic node';"+System.lineSeparator();
	}
	
	@Override
	public boolean isComposite() {
		return true;
	}

} //GenericNodeImpl
