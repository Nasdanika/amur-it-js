/**
 */
package org.nasdanika.amur.it.js.foundation.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.Component;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.Connection.PortInfo;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.FunctionInputPort;
import org.nasdanika.amur.it.js.foundation.FunctionOutputPort;
import org.nasdanika.amur.it.js.foundation.SubFlow;
import org.nasdanika.amur.it.js.impl.AbstractNodeImpl;

import org.nasdanika.amur.Composite;
import org.nasdanika.amur.Connection;
import org.nasdanika.amur.InputPort;
import org.nasdanika.amur.Node;
import org.nasdanika.amur.OutputPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SubFlowImpl extends AbstractNodeImpl implements SubFlow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SubFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoundationPackage.Literals.SUB_FLOW;
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
	
	@Override
	public boolean isComposite() {
		return true;
	}
	
	@Override
	public PortInfo[] getInputPorts(Connection connection) {
		List<PortInfo> ret = new ArrayList<>();
		for (org.nasdanika.amur.Component c: ((Composite) getOwner()).getChildren()) {
			if (c instanceof InputPort) {
				final String id = c.getId();
				final StringBuilder nameBuilder = new StringBuilder(c.getName());
				if (c.getImplementationType() instanceof FunctionInputPort) {
					nameBuilder.append("(");
					boolean first = true;
					for (Parameter p: ((FunctionInputPort) c.getImplementationType()).getInputParameters()) {
						if (!first) {
							nameBuilder.append(", ");							
						}
						nameBuilder.append(p.getName());
						first = false;
					}
					nameBuilder.append(")");
				}
				ret.add(new PortInfo() {

					@Override
					public String getId() {
						return id;
					}

					@Override
					public String getName() {
						return nameBuilder.toString();
					}
					
				});
			}
		}
		return ret.toArray(new PortInfo[ret.size()]);
	}
		
	@Override
	public PortInfo[] getOutputPorts(Connection connection) {
		List<PortInfo> ret = new ArrayList<>();
		for (org.nasdanika.amur.Component c: ((Composite) getOwner()).getChildren()) {
			if (c instanceof OutputPort) {
				final String id = c.getId();
				final StringBuilder nameBuilder = new StringBuilder(c.getName());
				if (c.getImplementationType() instanceof FunctionOutputPort) {
					nameBuilder.append("(");
					boolean first = true;
					for (Parameter p: ((FunctionOutputPort) c.getImplementationType()).getParameters()) {
						if (!first) {
							nameBuilder.append(", ");							
						}
						nameBuilder.append(p.getName());
						first = false;
					}
					nameBuilder.append(")");
				}
				ret.add(new PortInfo() {

					@Override
					public String getId() {
						return id;
					}

					@Override
					public String getName() {
						return nameBuilder.toString();
					}
					
				});
			}
		}
		return ret.toArray(new PortInfo[ret.size()]);
	}
	
	@Override
	public boolean acceptOwner(org.nasdanika.amur.Component owner) {
		return owner.getParent() instanceof Node;
	}
	
} //SubFlowImpl
