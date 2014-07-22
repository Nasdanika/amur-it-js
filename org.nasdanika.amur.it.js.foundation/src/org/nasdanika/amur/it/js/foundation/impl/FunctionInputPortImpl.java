/**
 */
package org.nasdanika.amur.it.js.foundation.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.Component;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.exec.DependencyInfo;
import org.nasdanika.amur.it.js.foundation.Call;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.FunctionInputPort;
import org.nasdanika.amur.it.js.foundation.Transition;
import org.nasdanika.amur.it.js.impl.AbstractNodeImpl;
import org.nasdanika.common.autocomplete.Completion;

import org.nasdanika.amur.AbstractConnectionSource;
import org.nasdanika.amur.Connection;
import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.util.AmurValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Level Flow Function Input Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.FunctionInputPortImpl#getInputParameters <em>Input Parameters</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.FunctionInputPortImpl#getHandler <em>Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionInputPortImpl extends AbstractNodeImpl implements FunctionInputPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FunctionInputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoundationPackage.Literals.FUNCTION_INPUT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> getInputParameters() {
		return (EList<Parameter>)eGet(FoundationPackage.Literals.FUNCTION_INPUT_PORT__INPUT_PARAMETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getHandler() {
		return (Source)eGet(FoundationPackage.Literals.FUNCTION_INPUT_PORT__HANDLER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandler(Source newHandler) {
		eSet(FoundationPackage.Literals.FUNCTION_INPUT_PORT__HANDLER, newHandler);
	}
	
	@Override
	public List<Parameter> genInputParameters(
			Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		if (getHandler()==null || getHandler().isBlank()) {
			Call c = findFirstOutboundCall();
			if (c!=null) {
				return stripTokenizeAndClone(c.genInputParameters(this, context, monitor, status));						
			}
			Transition t = findFirstOutboundTransition();
			if (t!=null) {
				return stripTokenizeAndClone(t.genInputParameters(input, context, monitor, status));
			}
			
			return Collections.emptyList();
		}
		return getInputParameters();
	}
	
	private Call findFirstOutboundCall() {
		AbstractConnectionSource acs = (AbstractConnectionSource) getOwner();
		for (Connection c: acs.getOutboundConnections()) {
			if (c.getImplementationType() instanceof Call) {
				Call call = (Call) c.getImplementationType();
				if (!isBlank(trimLeadingDot(call.genSourceName()))) {
					return call;
				}
			}
		}
		return null;
	}
	
	private Transition findFirstOutboundTransition() {
		AbstractConnectionSource acs = (AbstractConnectionSource) getOwner();
		for (Connection c: acs.getOutboundConnections()) {
			if (c.getImplementationType() instanceof Transition) {
				Transition transition = (Transition) c.getImplementationType();
				if (!isBlank(trimLeadingDot(transition.genSourceName()))) {
					return transition;
				}
			}
		}
		return null;
	}
	
	@Override
	public String genHandler(
			Component source, 
			Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {
		
		String ret = toJavaScript(getHandler(), context, monitor, status, "handler");
		if (isBlank(ret)) {
			StringBuilder sb = new StringBuilder();
			for (Parameter p: genInputParameters(source, context, monitor, status)) {
				if (sb.length()>0) {
					sb.append(", ");
				}
				sb.append(p.getName());
			}
			String target = null;
			Call call = findFirstOutboundCall();
			if (call==null) {
				Transition transition = findFirstOutboundTransition();
				if (transition!=null) {
					target = trimLeadingDot(transition.genSourceName());
				}
			} else {
				target = trimLeadingDot(call.genSourceName());
			}
			
			return target==null ? null : "return this"+dereference(target)+"("+sb+");\r\n";
		}
		return ret;		
	}
	
	@Override
	public DependencyInfo createInputDependencyInfo(
			Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		DependencyInfo ret = super.createInputDependencyInfo(input, context, monitor, status);
		ret.setName(getOwner().getName());
		return ret;
	}
	
	@Override
	protected void addCodeCompletions(String feature, List<Completion> completions) {
		super.addCodeCompletions(feature, completions);
		parametersToCompletions(getInputParameters(), completions);		
	}
	
	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		if (diagnostics != null) {
			if (isBlank(getOwner().getName())) {
				diagnostics.add
					(new BasicDiagnostic(
							Diagnostic.ERROR,
							AmurValidator.DIAGNOSTIC_SOURCE,
							AmurValidator.IMPLEMENTATION_TYPE__VALIDATE,
							"Function input port name cannot be blank",
							new Object [] { getOwner() }));
				
				result = false;
			}
			
//			if (getHandler()!=null) {
//				getHandler().validate(new DiagnosticChainFilter(diagnostics) {
//					
//					@Override
//					protected Diagnostic filter(Diagnostic diagnostic) {
//						return new BasicDiagnostic(
//								diagnostic.getSeverity(), 
//								diagnostic.getSource(), 
//								diagnostic.getCode(),
//								diagnostic.getMessage(), 
//								new Object[] { getOwner() });
//					}
//					
//				}, context);
//			}
		}
		return result;
	}
	
} //FunctionInputPortImpl
