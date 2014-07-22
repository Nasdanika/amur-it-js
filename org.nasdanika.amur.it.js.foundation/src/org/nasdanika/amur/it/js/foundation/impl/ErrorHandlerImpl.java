/**
 */
package org.nasdanika.amur.it.js.foundation.impl;

import java.util.List;
import java.util.Map;

import javax.swing.Icon;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.foundation.ErrorHandler;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.impl.AbstractErrorHandlerImpl;
import org.nasdanika.amur.it.js.impl.resources.IconResource;
import org.nasdanika.common.autocomplete.Completion;
import org.nasdanika.common.autocomplete.VariableCompletion;

import org.nasdanika.amur.lang.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.ErrorHandlerImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.ErrorHandlerImpl#getHandler <em>Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorHandlerImpl extends AbstractErrorHandlerImpl implements ErrorHandler {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ErrorHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoundationPackage.Literals.ERROR_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getCondition() {
		return (Source)eGet(FoundationPackage.Literals.ERROR_HANDLER__CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Source newCondition) {
		eSet(FoundationPackage.Literals.ERROR_HANDLER__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getHandler() {
		return (Source)eGet(FoundationPackage.Literals.ERROR_HANDLER__HANDLER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandler(Source newHandler) {
		eSet(FoundationPackage.Literals.ERROR_HANDLER__HANDLER, newHandler);
	}

	@Override
	public String genCondition(
			Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {
		return toJavaScript(getCondition(), context, monitor, status, "condition");
	}

	@Override
	public String genHandler(
			org.nasdanika.amur.it.js.Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		return toJavaScript(getHandler(), context, monitor, status, "handler");
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
	
} //ErrorHandlerImpl
