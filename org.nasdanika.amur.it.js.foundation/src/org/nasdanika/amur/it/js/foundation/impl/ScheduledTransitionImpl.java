/**
 */
package org.nasdanika.amur.it.js.foundation.impl;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.exec.OutputType;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.ScheduledTransition;
import org.nasdanika.amur.it.js.foundation.ScheduledTransitionType;

import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.util.AmurValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduled Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.ScheduledTransitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.ScheduledTransitionImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScheduledTransitionImpl extends TransitionImpl implements ScheduledTransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ScheduledTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoundationPackage.Literals.SCHEDULED_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getPeriod() {
		return (Source)eGet(FoundationPackage.Literals.SCHEDULED_TRANSITION__PERIOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Source newPeriod) {
		eSet(FoundationPackage.Literals.SCHEDULED_TRANSITION__PERIOD, newPeriod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduledTransitionType getType() {
		return (ScheduledTransitionType)eGet(FoundationPackage.Literals.SCHEDULED_TRANSITION__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ScheduledTransitionType newType) {
		eSet(FoundationPackage.Literals.SCHEDULED_TRANSITION__TYPE, newType);
	}

	@Override
	public OutputType genType(
			Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {
		switch (getType()) {
		case INTERVAL:
			return OutputType.INTERVAL;
		case TIMEOUT:
			return OutputType.TIMEOUT;
		case DELAY:
			return OutputType.DELAY;
		default:
			return super.genType(context, monitor, status);		
		}
	}
	
	@Override
	public String genPeriod(
			Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {
		return toJavaScript(getPeriod(), context, monitor, status, "period");
	}
		
	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean ret = true;
		if (diagnostics!=null) {
			if (getPeriod()==null || getPeriod().isBlank()) {
				diagnostics.add
				(new BasicDiagnostic
					(Diagnostic.WARNING,
					 "org.nasdanika.amur.it.js.foundation",
					 AmurValidator.IMPLEMENTATION_TYPE__VALIDATE,
					 "'period' is mandatory in Scheduled Transition",
					 new Object [] { this.getOwner() }));
			}
		}
		return super.validate(diagnostics, context) && ret;
	}

} //ScheduledTransitionImpl
