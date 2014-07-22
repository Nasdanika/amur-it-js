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
import org.nasdanika.amur.it.js.exec.DependencyInfo;
import org.nasdanika.amur.it.js.exec.DependencyRole;
import org.nasdanika.amur.it.js.exec.ExecFactory;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.PropertyOutputPort;
import org.nasdanika.amur.it.js.impl.AbstractNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Level Flow Object Output Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PropertyOutputPortImpl extends AbstractNodeImpl implements PropertyOutputPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PropertyOutputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoundationPackage.Literals.PROPERTY_OUTPUT_PORT;
	}
	
//	@Override
//	public List<Parameter> genInputParameters(
//			Component input,
//			Map<Object, Object> context, 
//			IProgressMonitor monitor,
//			MultiStatus status) throws Exception {
//		return Collections.emptyList(); // No parameters for properties, "newValue" for setters is hardwired.
//	}

	/**
	 * Default implementation provides access to component's properties.
	 */
	@Override
	public String[] genAccessorAndMutator(
			org.nasdanika.amur.it.js.Component source,
			String propertyName,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		
		String expr = "$facade";
		if (!isBlank(getOwner().getName())) {
			expr+="."+getOwner().getName();
		}
		if (!isBlank(propertyName)) {
			expr+="."+propertyName;
		}
		return new String[] {
				"return "+expr+";\r\n",					
				expr+" = newValue;\r\n"
		};
	}
	
	@Override
	public DependencyInfo createInputDependencyInfo(
			Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		
		DependencyInfo ret = ExecFactory.eINSTANCE.createDependencyInfo();
		ret.setRole(DependencyRole.PROPERTY);		
		return ret;
	}
	
	@Override
	public DependencyInfo createOutputDependencyInfo(
			Component output,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		DependencyInfo ret = super.createOutputDependencyInfo(output, context, monitor, status);
		ret.setRole(DependencyRole.PROPERTY);
		return ret;
	}

	@Override
	public List<Parameter> genInputParameters(
			Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		throw new UnsupportedOperationException();
	}

	@Override
	public String genHandler(
			Component source, 
			Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {
		throw new UnsupportedOperationException();
	}

} //PropertyOutputPortImpl
