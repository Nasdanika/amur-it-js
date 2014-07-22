/**
 */
package org.nasdanika.amur.it.js.foundation.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.Component;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.foundation.Activity;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.impl.AbstractNodeImpl;
import org.nasdanika.common.autocomplete.Completion;

import org.nasdanika.amur.Node;
import org.nasdanika.amur.Reference;
import org.nasdanika.amur.lang.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.ActivityImpl#getInputParameters <em>Input Parameters</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.ActivityImpl#getHandler <em>Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends AbstractNodeImpl implements Activity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ActivityImpl() {
		super();		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoundationPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getHandler() {
		return (Source)eGet(FoundationPackage.Literals.ACTIVITY__HANDLER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandler(Source newHandler) {
		eSet(FoundationPackage.Literals.ACTIVITY__HANDLER, newHandler);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> getInputParameters() {
		return (EList<Parameter>)eGet(FoundationPackage.Literals.ACTIVITY__INPUT_PARAMETERS, true);
	}

	@Override
	public List<Parameter> genInputParameters(
			Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		return input instanceof Reference ? Collections.<Parameter>emptyList() : getInputParameters();
	}

	@Override
	public String genHandler(
			Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		return toJavaScript(getHandler(), context, monitor, status, "handler");
	}
	
	@Override
	public IFigure getTooltip() {
		Source handler = getHandler();
		return handler==null ? null : handler.getTooltip();
	}
	
	@Override
	protected void addCodeCompletions(String feature, List<Completion> completions) {
		super.addCodeCompletions(feature, completions);
		parametersToCompletions(getInputParameters(), completions);		
	}
	
	@Override
	public boolean acceptOwner(org.nasdanika.amur.Component owner) {
		return owner.getParent() instanceof Node;
	}
	
} //ActivityImpl
