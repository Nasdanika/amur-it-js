/**
 */
package org.nasdanika.amur.it.js.foundation.impl;

import java.util.List;
import java.util.Map;

import javax.swing.Icon;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.ReferenceScope;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.Reference;
import org.nasdanika.amur.it.js.impl.AbstractReferenceImpl;
import org.nasdanika.amur.it.js.impl.resources.IconResource;
import org.nasdanika.common.autocomplete.Completion;
import org.nasdanika.common.autocomplete.VariableCompletion;

import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.util.AmurValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.ReferenceImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.ReferenceImpl#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.foundation.impl.ReferenceImpl#getMutator <em>Mutator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceImpl extends AbstractReferenceImpl implements Reference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FoundationPackage.Literals.REFERENCE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceScope getScope() {
		return (ReferenceScope)eGet(FoundationPackage.Literals.REFERENCE__SCOPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(ReferenceScope newScope) {
		eSet(FoundationPackage.Literals.REFERENCE__SCOPE, newScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getAccessor() {
		return (Source)eGet(FoundationPackage.Literals.REFERENCE__ACCESSOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessor(Source newAccessor) {
		eSet(FoundationPackage.Literals.REFERENCE__ACCESSOR, newAccessor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getMutator() {
		return (Source)eGet(FoundationPackage.Literals.REFERENCE__MUTATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMutator(Source newMutator) {
		eSet(FoundationPackage.Literals.REFERENCE__MUTATOR, newMutator);
	}
	
	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean ret = true;
		if (diagnostics!=null) {
			if (isBlank(trimLeadingDot(genSourceName()))) {
				diagnostics.add
				(new BasicDiagnostic
					(Diagnostic.ERROR,
					 "org.nasdanika.amur.it.js.foundation",
					 AmurValidator.IMPLEMENTATION_TYPE__VALIDATE,
					 "Reference source name is mandatory",
					 new Object [] { this.getOwner() }));
			}
		}
		return super.validate(diagnostics, context) && ret;
	}
	
	@Override
	public String[] genAccessorAndMutator(
			org.nasdanika.amur.it.js.Component input, 
			String propertyName,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		String[] ret = new String[] {
						toJavaScript(getAccessor(), context, monitor, status, "accessor"), 
						toJavaScript(getMutator(), context, monitor, status, "mutator")
				};
		
		if (isBlank(ret[0]) && isBlank(ret[1])) {
			// Pass-through.
			ret[0] = "return this.target;\r\n";
			ret[1] = "this.target = newValue;\r\n";
		}

		return ret;
	}

	@Override
	public String genHandler(
			org.nasdanika.amur.it.js.Component source,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		throw new UnsupportedOperationException("References don't support handlers");
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
	
	@Override
	protected void addContextCompletions(String feature, String port, List<VariableCompletion> completions) {
		super.addContextCompletions(feature, port, completions);
		
		completions.add(new VariableCompletion() {
			
			@Override
			public String getSummary() {
				return "Reference target";
			}
			
			@Override
			public String getShortDescription() {
				return null;
			}
			
			@Override
			public Icon getIcon() {
				return IconResource.Target.getIcon();
			}
			
			@Override
			public String getName() {
				return "target";
			}
			
			@Override
			public int getRelevance() {
				return 10;
			}
	
			@Override
			public String getId() {
				return "target";
			}
	
			@Override
			public String getType() {
				return null; // TODO
			}
		});
	}
	
} //ReferenceImpl
