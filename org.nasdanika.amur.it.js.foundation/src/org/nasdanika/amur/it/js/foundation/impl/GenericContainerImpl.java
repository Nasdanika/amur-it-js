/**
 */
package org.nasdanika.amur.it.js.foundation.impl;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.Component;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.GenericContainer;
import org.nasdanika.amur.it.js.impl.AbstractNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.GenericContainerImpl#getIcon <em>Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericContainerImpl extends AbstractNodeImpl implements GenericContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GenericContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoundationPackage.Literals.GENERIC_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcon() {
		return (String)eGet(FoundationPackage.Literals.GENERIC_CONTAINER__ICON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(String newIcon) {
		eSet(FoundationPackage.Literals.GENERIC_CONTAINER__ICON, newIcon);
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

} //GenericContainerImpl
