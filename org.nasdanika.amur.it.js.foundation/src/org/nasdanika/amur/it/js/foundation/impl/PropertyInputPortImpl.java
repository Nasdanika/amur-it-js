/**
 */
package org.nasdanika.amur.it.js.foundation.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.swing.Icon;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.Component;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.exec.DependencyInfo;
import org.nasdanika.amur.it.js.exec.DependencyRole;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.PropertyInputPort;
import org.nasdanika.amur.it.js.foundation.Reference;
import org.nasdanika.amur.it.js.impl.AbstractNodeImpl;
import org.nasdanika.amur.it.js.impl.resources.IconResource;
import org.nasdanika.common.autocomplete.Completion;
import org.nasdanika.common.autocomplete.VariableCompletion;

import org.nasdanika.amur.AbstractConnectionSource;
import org.nasdanika.amur.Connection;
import org.nasdanika.amur.lang.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Level Flow Property Input Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.PropertyInputPortImpl#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.PropertyInputPortImpl#getMutator <em>Mutator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyInputPortImpl extends AbstractNodeImpl implements PropertyInputPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PropertyInputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoundationPackage.Literals.PROPERTY_INPUT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getAccessor() {
		return (Source)eGet(FoundationPackage.Literals.PROPERTY_INPUT_PORT__ACCESSOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessor(Source newAccessor) {
		eSet(FoundationPackage.Literals.PROPERTY_INPUT_PORT__ACCESSOR, newAccessor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getMutator() {
		return (Source)eGet(FoundationPackage.Literals.PROPERTY_INPUT_PORT__MUTATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMutator(Source newMutator) {
		eSet(FoundationPackage.Literals.PROPERTY_INPUT_PORT__MUTATOR, newMutator);
	}
		
	private Reference findFirstOutboundReference() {
		AbstractConnectionSource acs = (AbstractConnectionSource) getOwner();
		for (Connection c: acs.getOutboundConnections()) {
			if (c.getImplementationType() instanceof Reference) {
				Reference ref = (Reference) c.getImplementationType();
				if (!isBlank(trimLeadingDot(ref.genSourceName()))) {
					return ref;
				}
			}
		}
		return null;
	}
	
	
	@Override
	public String[] genAccessorAndMutator(
			Component source,
			String propertyName, 
			Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {
		
		String[] ret = {toJavaScript(getAccessor(), context, monitor, status, "accessor"), toJavaScript(getMutator(), context, monitor, status, "mutator")};
		if (isBlank(ret[0]) && isBlank(ret[1])) {
			Reference ref = findFirstOutboundReference();
			if (ref!=null) {
				// Pass-through.
				ret[0] = "return this"+dereference(trimLeadingDot(ref.genSourceName()))+";\r\n";
				ret[1] = "this"+dereference(trimLeadingDot(ref.genSourceName()))+" = newValue;\r\n";
			}
		}
		return ret;
	}
	
	@Override
	protected DependencyRole adjustInputDependencyRole(DependencyRole initialRole) {
		return DependencyRole.PROPERTY;
	}
	
	@Override
	public List<Parameter> genInputParameters(
			Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		return Collections.emptyList(); // No parameters for properties, "newValue" for setters is hardwired.
	}
	
	@Override
	public DependencyInfo createInputDependencyInfo(
			Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		DependencyInfo ret = super.createInputDependencyInfo(input, context, monitor, status);
		ret.setRole(DependencyRole.PROPERTY);
		ret.setName(getOwner().getName());
		return ret;
	}

	@Override
	public String genHandler(
			Component source, 
			Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {
		throw new UnsupportedOperationException();
	}

	@Override
	protected void addCodeCompletions(String feature, List<Completion> completions) {
		super.addCodeCompletions(feature, completions);
		
		if ("mutator".equals(feature)) {
			completions.add(new VariableCompletion() {
				
				@Override
				public String getSummary() {
					StringBuilder ret = new StringBuilder("<html>Parameter <B>newValue</B>");
					ret.append("</html>");
					return ret.toString();
				}
				
				@Override
				public String getShortDescription() {
					return null;
				}
				
				@Override
				public Icon getIcon() {
					return IconResource.Parameter.getIcon();
				}
				
				@Override
				public String getName() {
					return "newValue";
				}
				
				@Override
				public int getRelevance() {
					return 10;
				}
		
				@Override
				public String getId() {
					return "newValue";
				}
		
				@Override
				public String getType() {
					return null; // TODO
				}
			});
		}
	}
	
} //PropertyInputPortImpl
