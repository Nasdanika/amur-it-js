/**
 */
package org.nasdanika.amur.it.js.foundation.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.swing.Icon;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.Component;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.exec.DependencyInfo;
import org.nasdanika.amur.it.js.foundation.ErrorTransition;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.impl.AbstractErrorTransitionImpl;
import org.nasdanika.amur.it.js.impl.resources.IconResource;
import org.nasdanika.common.autocomplete.Completion;
import org.nasdanika.common.autocomplete.FunctionCompletion;
import org.nasdanika.common.autocomplete.VariableCompletion;

import org.nasdanika.amur.Connection;
import org.nasdanika.amur.lang.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.ErrorTransitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.ErrorTransitionImpl#getHandler <em>Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorTransitionImpl extends AbstractErrorTransitionImpl implements ErrorTransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ErrorTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoundationPackage.Literals.ERROR_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getCondition() {
		return (Source)eGet(FoundationPackage.Literals.ERROR_TRANSITION__CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Source newCondition) {
		eSet(FoundationPackage.Literals.ERROR_TRANSITION__CONDITION, newCondition);
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getHandler() {
		return (Source)eGet(FoundationPackage.Literals.ERROR_TRANSITION__HANDLER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandler(Source newHandler) {
		eSet(FoundationPackage.Literals.ERROR_TRANSITION__HANDLER, newHandler);
	}

	@Override
	public String genHandler(
			Component input, 
			Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {
		String ret = toJavaScript(getHandler(), context, monitor, status, "handler");
		if (isBlank(ret)) {
			StringBuilder sb = new StringBuilder();
			for (Parameter p: genInputParameters(input, context, monitor, status)) {
				if (sb.length()>0) {
					sb.append(", ");
				}
				sb.append(p.getName());
			}
			return "return this.target("+sb+");\r\n";
		}
		return ret;
	}

	@Override
	public String genCondition(
			Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {
		return toJavaScript(getCondition(), context, monitor, status, "condition");
	}

	@Override
	public String[] genAccessorAndMutator(
			Component input, 
			String propertyName,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		
		throw new UnsupportedOperationException("Calls don't support accessors/mutators");
	}
		
	@Override
	protected void addCodeCompletions(String feature, List<Completion> completions) {
		super.addCodeCompletions(feature, completions);
		
		completions.add(new VariableCompletion() {
			
			@Override
			public String getSummary() {
				StringBuilder ret = new StringBuilder("<html>Parameter <B>error</B>");
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
				return "error";
			}
			
			@Override
			public int getRelevance() {
				return 10;
			}

			@Override
			public String getId() {
				return "error";
			}

			@Override
			public String getType() {
				return null; // TODO
			}
		});
	}
	
	@Override
	protected void addContextCompletions(String feature, String port, List<VariableCompletion> completions) {
		super.addContextCompletions(feature, port, completions);
		
		if (getOwner() instanceof Connection 
				&& ((Connection) getOwner()).getTarget() instanceof org.nasdanika.amur.Component
				&& ((org.nasdanika.amur.Component) ((Connection) getOwner()).getTarget()).getImplementationType() instanceof Component) {
			
			final String description = "Transition target";
			
			final List<org.nasdanika.common.autocomplete.Parameter> parameters = new ArrayList<>();		
			
			final Component tit = (Component) ((org.nasdanika.amur.Component) ((Connection) getOwner()).getTarget()).getImplementationType();
			
			try {
				Map<Object, Object> context = Collections.emptyMap();
				NullProgressMonitor progressMonitor = new NullProgressMonitor();
				MultiStatus status = new MultiStatus("org.nasdanika.amur.it.js", 0, "Completions", null);
				DependencyInfo di = tit.createInputDependencyInfo(this, context, progressMonitor, status);
				for (Parameter p: di.getParameters()) {
					parameters.add(asCompletionParameter(p));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			completions.add(new FunctionCompletion() {
				
				@Override
				public String getSummary() {
					return "Transition target";
				}
				
				@Override
				public String getShortDescription() {
					return description;
				}
				
				@Override
				public Icon getIcon() {
					return IconResource.Target.getIcon();
				}
				
				@Override
				public String getType() {
					return null;
				}
				
				@Override
				public String getName() {
					return "target";
				}
				
				@Override
				public String getReturnValueDescription() {
					return null;
				}
				
				@Override
				public List<org.nasdanika.common.autocomplete.Parameter> getParameters() {
					return parameters;
				}
				
				@Override
				public int getRelevance() {
					return 10;
				}

				@Override
				public String getId() {
					return tit.getOwner().getId();
				}
			});						
		}
	}
	
} //ErrorTransitionImpl
