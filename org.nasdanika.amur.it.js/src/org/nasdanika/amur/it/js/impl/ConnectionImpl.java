/**
 */
package org.nasdanika.amur.it.js.impl;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.AbstractNode;
import org.nasdanika.amur.it.js.Component;
import org.nasdanika.amur.it.js.Connection;
import org.nasdanika.amur.it.js.JsPackage;
import org.nasdanika.amur.it.js.exec.DependencyInfo;
import org.nasdanika.amur.it.js.exec.DependencyRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.impl.ConnectionImpl#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.impl.ConnectionImpl#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.impl.ConnectionImpl#getTargetPort <em>Target Port</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.impl.ConnectionImpl#getTargetName <em>Target Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConnectionImpl extends ComponentImpl implements Connection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourcePort() {
		return (String)eGet(JsPackage.Literals.CONNECTION__SOURCE_PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePort(String newSourcePort) {
		eSet(JsPackage.Literals.CONNECTION__SOURCE_PORT, newSourcePort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceName() {
		return (String)eGet(JsPackage.Literals.CONNECTION__SOURCE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceName(String newSourceName) {
		eSet(JsPackage.Literals.CONNECTION__SOURCE_NAME, newSourceName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetPort() {
		return (String)eGet(JsPackage.Literals.CONNECTION__TARGET_PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPort(String newTargetPort) {
		eSet(JsPackage.Literals.CONNECTION__TARGET_PORT, newTargetPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetName() {
		return (String)eGet(JsPackage.Literals.CONNECTION__TARGET_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetName(String newTargetName) {
		eSet(JsPackage.Literals.CONNECTION__TARGET_NAME, newTargetName);
	}

	public static String toJavaScriptIdentifier(String nameCandidate) {
		if (nameCandidate==null) {
			throw new NullPointerException();
		}
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<nameCandidate.length(); ++i) {
			char candidate = nameCandidate.charAt(i);
			if (i==0) {
				if (Character.isJavaIdentifierStart(candidate)) {
					sb.append(candidate);
					continue;
				} else {
					sb.append("$");
				}
			}
			sb.append(Character.isJavaIdentifierPart(candidate) ? candidate : "_");
		}
		return sb.toString();
	}
	
	@Override
	public org.nasdanika.amur.it.js.exec.Component createExecutionComponent(
			URI resourceURI, 
			Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {
		
		org.nasdanika.amur.it.js.exec.Component ret = super.createExecutionComponent(resourceURI, context, monitor, status);
		ret.setForceable(false);
		
		AbstractNode source = (AbstractNode) ((org.nasdanika.amur.Component) ((org.nasdanika.amur.Connection) getOwner()).getSource()).getImplementationType();
		DependencyInfo idi = source.createOutputDependencyInfo(this, context, monitor, status);
		configureInputDependencyInfo(source, idi, ret, resourceURI, context, monitor, status);
		ret.getInputs().put(source.createExecutionComponentProxy(resourceURI, getSourcePort()==null ? null : "output:"+getSourcePort()), idi);
		
		AbstractNode target = (AbstractNode) (org.nasdanika.amur.it.js.Component) ((org.nasdanika.amur.Component) ((org.nasdanika.amur.Connection) getOwner()).getTarget()).getImplementationType();
		DependencyInfo odi = target.createInputDependencyInfo(this, context, monitor, status);
		odi.setName(DependencyInfo.TARGET_KEY);		
		odi.setRole(DependencyRole.FUNCTION); // By default, change in reference.
		configureOutputDependencyInfo(target, odi, ret, resourceURI, context, monitor, status);
		ret.getOutputs().put(target.createExecutionComponentProxy(resourceURI, getTargetPort()==null ? null : "input:"+getTargetPort()), odi);
		
		return ret;
	}
	
	@Override
	public DependencyInfo createInputDependencyInfo(
			Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		DependencyInfo ret = super.createInputDependencyInfo(input, context, monitor, status);
		ret.setName(trimLeadingDot(genSourceName()));
		return ret;
	}
	
	@Override
	protected void configureInputDependencyInfo(
			Component input,
			DependencyInfo di,
			org.nasdanika.amur.it.js.exec.Component targetComponent,
			URI resourceURI, 
			Map<Object, Object> context,
			IProgressMonitor monitor, MultiStatus status) throws Exception {
		super.configureInputDependencyInfo(input, di, targetComponent, resourceURI,	context, monitor, status);
		di.setName(trimLeadingDot(genSourceName()));
	}
	
	@Override
	public DependencyInfo createOutputDependencyInfo(
			Component output,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		DependencyInfo ret = super.createOutputDependencyInfo(output, context, monitor, status);
		ret.setName(trimLeadingDot(genTargetName()));
		return ret;
	}
	
	@Override
	protected void configureOutputDependencyInfo(
			org.nasdanika.amur.it.js.Component output, 
			DependencyInfo di,
			org.nasdanika.amur.it.js.exec.Component sourceComponent,
			URI resourceURI, 
			Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {
		super.configureOutputDependencyInfo(output, di,	sourceComponent, resourceURI, context, monitor, status);
		di.setName(DependencyInfo.TARGET_KEY); // Always "target" for connections for simplicity.
	}
	
	@Override
	public String genSourceName() {
		if (!isBlank(getSourceName())) {
			return getSourceName();
		}
		if (!isBlank(getOwner().getName())) {
			return getOwner().getName();
		}
		return ((org.nasdanika.amur.Component) ((org.nasdanika.amur.Connection) getOwner()).getTarget()).getName();		
	}
	
	@Override
	public String genTargetName() {
		if (!isBlank(getTargetName())) {
			return getTargetName();
		}
		if (!isBlank(getOwner().getName())) {
			return getOwner().getName();
		}
		return ((org.nasdanika.amur.Component) ((org.nasdanika.amur.Connection) getOwner()).getSource()).getName();		
	}
	
} //ConnectionImpl
