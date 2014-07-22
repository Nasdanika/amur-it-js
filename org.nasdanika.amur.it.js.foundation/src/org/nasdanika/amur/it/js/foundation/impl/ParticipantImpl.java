/**
 */
package org.nasdanika.amur.it.js.foundation.impl;

import java.util.List;
import java.util.Map;

import org.nasdanika.amur.lang.Source;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.Component;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.PortDescriptor;
import org.nasdanika.amur.it.js.ReferenceScope;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.Participant;
import org.nasdanika.amur.it.js.impl.AbstractNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.ParticipantImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.ParticipantImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.ParticipantImpl#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.ParticipantImpl#getOutputPorts <em>Output Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantImpl extends AbstractNodeImpl implements Participant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoundationPackage.Literals.PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceScope getScope() {
		return (ReferenceScope)eGet(FoundationPackage.Literals.PARTICIPANT__SCOPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(ReferenceScope newScope) {
		eSet(FoundationPackage.Literals.PARTICIPANT__SCOPE, newScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getSelector() {
		return (Source)eGet(FoundationPackage.Literals.PARTICIPANT__SELECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(Source newSelector) {
		eSet(FoundationPackage.Literals.PARTICIPANT__SELECTOR, newSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PortDescriptor> getInputPorts() {
		return (EList<PortDescriptor>)eGet(FoundationPackage.Literals.PARTICIPANT__INPUT_PORTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PortDescriptor> getOutputPorts() {
		return (EList<PortDescriptor>)eGet(FoundationPackage.Literals.PARTICIPANT__OUTPUT_PORTS, true);
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

} //ParticipantImpl
