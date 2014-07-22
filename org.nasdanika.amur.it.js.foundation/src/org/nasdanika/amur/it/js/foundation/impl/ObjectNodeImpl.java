/**
 */
package org.nasdanika.amur.it.js.foundation.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.Component;
import org.nasdanika.amur.it.js.Connection;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.ReferenceScope;
import org.nasdanika.amur.it.js.Connection.PortInfo;
import org.nasdanika.amur.it.js.exec.ExecFactory;
import org.nasdanika.amur.it.js.exec.Function;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.ObjectNode;
import org.nasdanika.amur.it.js.impl.AbstractNodeImpl;

import org.nasdanika.amur.AbstractConnectionSource;
import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.util.AmurValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.ObjectNodeImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.ObjectNodeImpl#getSelector <em>Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectNodeImpl extends AbstractNodeImpl implements ObjectNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ObjectNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoundationPackage.Literals.OBJECT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceScope getScope() {
		return (ReferenceScope)eGet(FoundationPackage.Literals.OBJECT_NODE__SCOPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(ReferenceScope newScope) {
		eSet(FoundationPackage.Literals.OBJECT_NODE__SCOPE, newScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getSelector() {
		return (Source)eGet(FoundationPackage.Literals.OBJECT_NODE__SELECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(Source newSelector) {
		eSet(FoundationPackage.Literals.OBJECT_NODE__SELECTOR, newSelector);
	}

	@Override
	public List<Parameter> genInputParameters(
			Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {		
		String targetName = ((Connection) input).genTargetName();
		if (isBlank(targetName)) {
			return Collections.emptyList();
		}
		int lpIdx = targetName.indexOf('(');
		if (lpIdx==-1) {
			return Collections.emptyList();
		}
		int rpIdx = targetName.lastIndexOf(')');
		if (rpIdx==-1 || rpIdx<lpIdx) {
			return Collections.emptyList();
		}
		String[] pNames = targetName.substring(lpIdx+1, rpIdx).split(",");
		List<Parameter> ret = new ArrayList<>();
		for (String pName: pNames) {
			ret.add(createParameter(pName.trim()));
		}
		return ret;
	}

	@Override
	public String genHandler(
			Component source, 
			Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {
		
		StringBuilder handlerBuilder = new StringBuilder();
		handlerBuilder.append("var $target = ");
		if (ReferenceScope.COMPONENT.equals(getScope())) {
			handlerBuilder.append("Object.getPrototypeOf(this).$ref");
		} else {
			handlerBuilder.append(toJavaScript(getSelector(), context, monitor, status, "Selector"));
			injectOutputs(handlerBuilder);
		}
		handlerBuilder.append(";");
		handlerBuilder.append(System.lineSeparator());
		
		handlerBuilder.append("$target");
		
		String targetName = trimLeadingDot(((Connection) source).genTargetName());
		if (!isBlank(targetName)) {
			int lpIdx = targetName.indexOf('(');
			if (lpIdx!=-1) {
				targetName = targetName.substring(0, lpIdx);
			}
			handlerBuilder.append("['");
			handlerBuilder.append(StringEscapeUtils.escapeEcmaScript(targetName));
			handlerBuilder.append("']");
		}
		
		handlerBuilder.append(".apply($target, arguments);");
		handlerBuilder.append(System.lineSeparator());
		return handlerBuilder.toString();
	}

	private void injectOutputs(StringBuilder builder) {
		if (getOwner() instanceof AbstractConnectionSource) {
			for (org.nasdanika.amur.Connection c: ((AbstractConnectionSource) getOwner()).getOutboundConnections()) {
				// Only named outputs
				if (c.getImplementationType() instanceof Connection) {
					String sourceName = trimLeadingDot(((Connection) c.getImplementationType()).genSourceName());
					if (!isBlank(sourceName)) {
						// TODO - defineProperty for references.
						builder.append("$target['"+StringEscapeUtils.escapeEcmaScript(sourceName)+"'] = this['"+StringEscapeUtils.escapeEcmaScript(sourceName)+"'];");
						builder.append(System.lineSeparator());
					}					
				}
			}
		}
	}
	
	@Override
	public String[] genAccessorAndMutator(
			Component source,
			String propertyName, 
			Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {

		StringBuilder targetBuilder = new StringBuilder();
		targetBuilder.append("var $target = ");
		if (ReferenceScope.COMPONENT.equals(getScope())) {
			targetBuilder.append("Object.getPrototypeOf(this).$ref");
		} else {
			targetBuilder.append(toJavaScript(getSelector(), context, monitor, status, "Selector"));
			injectOutputs(targetBuilder);
		}
		targetBuilder.append(";");
		targetBuilder.append(System.lineSeparator());
		
		// TODO Auto-generated method stub
		String expr = "$target";
		if (!isBlank(propertyName)) {
			expr+="."+propertyName;
		}
		return new String[] {
			targetBuilder+"return "+expr+";"+System.lineSeparator(),					
			targetBuilder+expr+" = newValue;"+System.lineSeparator()
		};
	}
	
	@Override
	public org.nasdanika.amur.it.js.exec.Component createExecutionComponent(
			URI resourceURI, Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {
		org.nasdanika.amur.it.js.exec.Component ret = super.createExecutionComponent(resourceURI, context, monitor, status);
		if (ReferenceScope.COMPONENT.equals(getScope())) {
			StringBuilder afterStartBuilder = new StringBuilder();
			afterStartBuilder.append("var $target = ");
			afterStartBuilder.append(toJavaScript(getSelector(), context, monitor, status, "Selector"));
			afterStartBuilder.append(";");
			afterStartBuilder.append(System.lineSeparator());
			injectOutputs(afterStartBuilder);
			afterStartBuilder.append(System.lineSeparator());
			afterStartBuilder.append("Object.getPrototypeOf(this).$ref=$target;");
			afterStartBuilder.append(System.lineSeparator());
			Function asf = ExecFactory.eINSTANCE.createFunction();
			asf.setBody(afterStartBuilder.toString());
			ret.getEntries().put("$afterStart", asf);			
		}
		return ret;
	}	
	
	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {		
		boolean ret = super.validate(diagnostics, context);
		if (diagnostics!=null) {
			if (getSelector()==null || getSelector().isBlank()) {
				diagnostics.add
				(new BasicDiagnostic
					(Diagnostic.ERROR,
					 AmurValidator.DIAGNOSTIC_SOURCE,
					 AmurValidator.IMPLEMENTATION_TYPE__VALIDATE,
					 "Selector is mandatory",
					 new Object [] { getOwner() }));
				ret = false;									
			}
		}
		return ret;
	}
} //ObjectNodeImpl
