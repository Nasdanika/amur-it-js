/**
 */
package org.nasdanika.amur.it.js.foundation.impl;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.amur.it.js.Component;
import org.nasdanika.amur.it.js.Connection;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.exec.DependencyInfo;
import org.nasdanika.amur.it.js.exec.DependencyRole;
import org.nasdanika.amur.it.js.exec.ExecFactory;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.FunctionOutputPort;
import org.nasdanika.amur.it.js.impl.AbstractNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Level Flow Function Output Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.FunctionOutputPortImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionOutputPortImpl extends AbstractNodeImpl implements FunctionOutputPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FunctionOutputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoundationPackage.Literals.FUNCTION_OUTPUT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> getParameters() {
		return (EList<Parameter>)eGet(FoundationPackage.Literals.FUNCTION_OUTPUT_PORT__PARAMETERS, true);
	}

	@Override
	public List<Parameter> genInputParameters(
			org.nasdanika.amur.it.js.Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		return getParameters();
	}
	
	@Override
	public String genHandler(
			Component source, 
			Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {

		StringBuilder pBuilder = new StringBuilder();
		for (Parameter p: getParameters()) {
			if (pBuilder.length()>0) {
				pBuilder.append(", ");
			}
			pBuilder.append(p.getName());
		}
		
		StringBuilder handlerBuilder = new StringBuilder("return ($outputs || $facade)."+getOwner().getName());
		
		if (getParameters().isEmpty()) {
			handlerBuilder.append(".apply(($outputs || $facade), arguments)");
		} else {
			handlerBuilder.append("("+pBuilder+")");
		}
		
		String targetProperty = null;
		if (source instanceof Connection) {
			targetProperty = trimLeadingDot(((Connection) source).getTargetName());
		}
		if (!isBlank(targetProperty)) {
			handlerBuilder.append(dereference(targetProperty));
		}
		handlerBuilder.append(";\r\n");
		return handlerBuilder.toString();
	}
	
	@Override
	public String[] genAccessorAndMutator(
			Component source,
			String propertyName, 
			Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {
		
		StringBuilder exprBuilder = new StringBuilder("($outputs || $facade)."+getOwner().getName());
		String targetProperty = null;
		if (source instanceof Connection) {
			targetProperty = trimLeadingDot(((Connection) source).getTargetName());
		}
		if (!isBlank(targetProperty)) {
			exprBuilder.append("()"+dereference(targetProperty));
		}
		return new String[] { "return "+exprBuilder+";\r\n", exprBuilder+" = newValue;\r\n"};					
	}
	
	@Override
	public DependencyInfo createInputDependencyInfo(
			Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		
		DependencyInfo ret = ExecFactory.eINSTANCE.createDependencyInfo();
		ret.setRole(DependencyRole.FUNCTION);
		for (Parameter p: genInputParameters(input, context, monitor, status)) {
			ret.getParameters().add(EcoreUtil.copy(p));
		}
		
		return ret;
	}
	
} //FunctionOutputPortImpl
