/**
 */
package org.nasdanika.amur.it.js.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import javax.swing.Icon;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.amur.it.js.AbstractErrorHandler;
import org.nasdanika.amur.it.js.AbstractErrorTransition;
import org.nasdanika.amur.it.js.AbstractEventListener;
import org.nasdanika.amur.it.js.AbstractNode;
import org.nasdanika.amur.it.js.AbstractTransition;
import org.nasdanika.amur.it.js.Join;
import org.nasdanika.amur.it.js.JoinEntry;
import org.nasdanika.amur.it.js.JsPackage;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.Connection.PortInfo;
import org.nasdanika.amur.it.js.exec.Array;
import org.nasdanika.amur.it.js.exec.Component;
import org.nasdanika.amur.it.js.exec.DependencyInfo;
import org.nasdanika.amur.it.js.exec.DependencyRole;
import org.nasdanika.amur.it.js.exec.ExecFactory;
import org.nasdanika.amur.it.js.exec.Function;
import org.nasdanika.amur.it.js.exec.Hash;
import org.nasdanika.amur.it.js.exec.Initializer;
import org.nasdanika.amur.it.js.impl.resources.IconResource;
import org.nasdanika.common.autocomplete.FunctionCompletion;
import org.nasdanika.common.autocomplete.VariableCompletion;

import org.nasdanika.amur.AbstractConnectionSource;
import org.nasdanika.amur.AbstractConnectionTarget;
import org.nasdanika.amur.Call;
import org.nasdanika.amur.Composite;
import org.nasdanika.amur.Connection;
import org.nasdanika.amur.ErrorHandler;
import org.nasdanika.amur.ErrorTransition;
import org.nasdanika.amur.ImplementationType;
import org.nasdanika.amur.InputPort;
import org.nasdanika.amur.OutputPort;
import org.nasdanika.amur.Reference;
import org.nasdanika.amur.Transition;
import org.nasdanika.amur.lang.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.impl.AbstractNodeImpl#getInboundTransitionsOrder <em>Inbound Transitions Order</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.impl.AbstractNodeImpl#getOutboundTransitionsOrder <em>Outbound Transitions Order</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.impl.AbstractNodeImpl#getErrorTransitionsOrder <em>Error Transitions Order</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.impl.AbstractNodeImpl#getErrorHandlersOrder <em>Error Handlers Order</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.impl.AbstractNodeImpl#getJoinConditions <em>Join Conditions</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.impl.AbstractNodeImpl#getJoinFork <em>Join Fork</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractNodeImpl extends ComponentImpl implements AbstractNode {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsPackage.Literals.ABSTRACT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Connection> getInboundTransitionsOrder() {
		return (EList<Connection>)eGet(JsPackage.Literals.ABSTRACT_NODE__INBOUND_TRANSITIONS_ORDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Transition> getOutboundTransitionsOrder() {
		return (EList<Transition>)eGet(JsPackage.Literals.ABSTRACT_NODE__OUTBOUND_TRANSITIONS_ORDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ErrorTransition> getErrorTransitionsOrder() {
		return (EList<ErrorTransition>)eGet(JsPackage.Literals.ABSTRACT_NODE__ERROR_TRANSITIONS_ORDER, true);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ErrorHandler> getErrorHandlersOrder() {
		return (EList<ErrorHandler>)eGet(JsPackage.Literals.ABSTRACT_NODE__ERROR_HANDLERS_ORDER, true);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<JoinEntry> getJoinConditions() {
		return (EList<JoinEntry>)eGet(JsPackage.Literals.ABSTRACT_NODE__JOIN_CONDITIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.amur.Component getJoinFork() {
		return (org.nasdanika.amur.Component)eGet(JsPackage.Literals.ABSTRACT_NODE__JOIN_FORK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinFork(org.nasdanika.amur.Component newJoinFork) {
		eSet(JsPackage.Literals.ABSTRACT_NODE__JOIN_FORK, newJoinFork);
	}

	@Override
	public Component createExecutionComponent(
			URI resourceURI,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		
		Component ret = super.createExecutionComponent(resourceURI, context, monitor, status);
		
		Hash childrenHash = (Hash) ret.getEntries().get(Component.CHILDREN_KEY); 

		if (getOwner() instanceof Composite) {
			for (org.nasdanika.amur.Component c: ((Composite) getOwner()).getChildren()) {
				if (!(c instanceof Connection)) {
					org.nasdanika.amur.it.js.Component implementationType = (org.nasdanika.amur.it.js.Component) c.getImplementationType();
					org.nasdanika.amur.it.js.exec.Component childExecutionComponent = implementationType.createExecutionComponent(resourceURI, context, monitor, status);
					childrenHash.getEntries().put("$"+Integer.toString(childrenHash.getEntries().size(), Character.MAX_RADIX), childExecutionComponent);
										
					if (c instanceof InputPort) { // Output for input port
						DependencyInfo di = implementationType.createInputDependencyInfo(this, context, monitor, status);
						di.setGuard(false);
						configureOutputDependencyInfo(implementationType, di, ret, resourceURI, context, monitor, status);				
						ret.getOutputs().put(childExecutionComponent, di);			
					} else if (c instanceof OutputPort) { // Input for output port
						DependencyInfo di = implementationType.createOutputDependencyInfo(this, context, monitor, status);
						configureInputDependencyInfo(implementationType, di, ret, resourceURI, context, monitor, status);				
						ret.getInputs().put(childExecutionComponent, di);									
					}
				}
			}			
		}
		
		if (getOwner() instanceof AbstractConnectionSource) {
			EList<Connection> outboundConnections = ((AbstractConnectionSource) getOwner()).getOutboundConnections();
			for (Connection output: outboundConnections) {
				if (output.getImplementationType() instanceof org.nasdanika.amur.it.js.Connection) {				
					org.nasdanika.amur.it.js.Connection oit = (org.nasdanika.amur.it.js.Connection) output.getImplementationType();
					
					Component connCmd = oit.createExecutionComponent(resourceURI, context, monitor, status);
					if (connCmd!=null) {
						childrenHash.getEntries().put("$"+Integer.toString(childrenHash.getEntries().size(), Character.MAX_RADIX), connCmd);
					}
									
					DependencyInfo di = oit.createInputDependencyInfo(this, context, monitor, status);
					configureOutputDependencyInfo(oit, di, ret, resourceURI, context, monitor, status);
					
					// ErrorTransition order.
					if (oit instanceof AbstractErrorTransition) {
						EList<ErrorTransition> errorTransitionsOrder = getErrorTransitionsOrder();
						if (errorTransitionsOrder.isEmpty()) {
							di.setOrder(0);
						} else {
							int idx = errorTransitionsOrder.indexOf(output);
							if (idx==-1) {
								idx = outboundConnections.size()+1;
							}
							di.setOrder(idx);
						}
					}
					
					// Transition order.
					if (oit instanceof AbstractTransition) {
						int idx = getOutboundTransitionsOrder().indexOf(output);
						if (idx==-1) {
							idx = outboundConnections.size()+1;
						}
						di.setOrder(idx);
					}
					
					ret.getOutputs().put(connCmd, di);
				}			
			}							
		}
		
		if (getOwner() instanceof AbstractConnectionTarget) {
			List<Connection> joinInputs = new ArrayList<>();
			for (Connection input: ((AbstractConnectionTarget) getOwner()).getInboundConnections()) {
				if (input.getImplementationType() instanceof org.nasdanika.amur.it.js.Connection) {
					org.nasdanika.amur.it.js.Connection cit = (org.nasdanika.amur.it.js.Connection) input.getImplementationType();				
					DependencyInfo di = cit.createOutputDependencyInfo(this, context, monitor, status);				
					configureInputDependencyInfo(cit, di, ret, resourceURI, context, monitor, status);				
					org.nasdanika.amur.it.js.exec.Component iProxy = cit.createExecutionComponentProxy(resourceURI, null);				
					ret.getInputs().put(iProxy, di);
					
					if (cit instanceof AbstractTransition 
							&& !Join.NONE.equals(((AbstractTransition) cit).getJoinType())) {
						joinInputs.add(input);
					}
				}
			}
			
			if (!joinInputs.isEmpty()) {
				Collections.sort(joinInputs, new Comparator<Connection>() {
	
					@Override
					public int compare(Connection o1, Connection o2) {
						int idx1 = getInboundTransitionsOrder().indexOf(o1);
						int idx2 = getInboundTransitionsOrder().indexOf(o2);
						return idx1!=idx2 ? idx1-idx2 : o1.getId().compareTo(o2.getId());
					}
					
				});
				
				Hash joinHash = ExecFactory.eINSTANCE.createHash();
				ret.getEntries().put("$join", joinHash);
				// Join Handler - null input indicates join.
				String joinHandler = genHandler(null, context, monitor, status);
				if (!isBlank(joinHandler)) {
					Function jhf = ExecFactory.eINSTANCE.createFunction();
					jhf.setBody(joinHandler);
					for (Connection c: joinInputs) {
						jhf.getParameters().add(createParameter(toValidJavaIdentifier(trimLeadingDot(((AbstractTransition) c.getImplementationType()).genTargetName()))));
					}
					joinHash.getEntries().put("$handler", jhf);
				}				
				
				// Join Conditions
				Array jca = ExecFactory.eINSTANCE.createArray();
				for (JoinEntry je: getJoinConditions()) {
					if (isBlank(je.getPort())) { // For default port for now.
						for (Source jc: je.getConditions()) {
							String cc = toJavaScript(jc, context, monitor, status, "Join condition");
							if (!isBlank(cc)) {
								Function jcf = ExecFactory.eINSTANCE.createFunction();
								jcf.setBody(cc);
								for (Connection c: joinInputs) {
									jcf.getParameters().add(createParameter(toValidJavaIdentifier(trimLeadingDot(((AbstractTransition) c.getImplementationType()).genTargetName()))));
								}
								jca.getElements().add(jcf);
							}
						}
					}
				}
				if (!jca.getElements().isEmpty()) {
					joinHash.getEntries().put("$conditions", jca);					
				}
			}						
		}	
		
		// Connecting input ports - container -> input port.
		if (getOwner() instanceof InputPort && getOwner().getParent()!=null && getOwner().getParent().getImplementationType() instanceof org.nasdanika.amur.it.js.Component) {
			org.nasdanika.amur.it.js.Component oit = (org.nasdanika.amur.it.js.Component) getOwner().getParent().getImplementationType();				
			DependencyInfo di = oit.createOutputDependencyInfo(this, context, monitor, status);
			di.setGuard(false); 
			configureInputDependencyInfo(oit, di, ret, resourceURI, context, monitor, status);				
			org.nasdanika.amur.it.js.exec.Component iProxy = oit.createExecutionComponentProxy(resourceURI, "input:"+getOwner().getName());				
			ret.getInputs().put(iProxy, di);			
		}
				
		// Connecting output ports - output port -> container.
		if (getOwner() instanceof OutputPort && getOwner().getParent()!=null && getOwner().getParent().getImplementationType() instanceof org.nasdanika.amur.it.js.Component) {
			org.nasdanika.amur.it.js.Component oit = (org.nasdanika.amur.it.js.Component) getOwner().getParent().getImplementationType();				
			DependencyInfo di = oit.createInputDependencyInfo(this, context, monitor, status);
			configureOutputDependencyInfo(oit, di, ret, resourceURI, context, monitor, status);				
			org.nasdanika.amur.it.js.exec.Component iProxy = oit.createExecutionComponentProxy(resourceURI, "output:"+getOwner().getName());				
			ret.getOutputs().put(iProxy, di);			
		}
		
		if (isTopLevel()) {
			// Top level component needs starter.
			Component starter = ExecFactory.eINSTANCE.createComponent();
			starter.setId("$starter");
			childrenHash.getEntries().put("$starter", starter);
		}
				
		return ret;
	}
	
	@Override
	protected int errorHandlersOffset() {
		if (getOwner() instanceof AbstractConnectionSource) {
			return ((AbstractConnectionSource) getOwner()).getOutboundConnections().size()+100;
		}
		return super.errorHandlersOffset();
	}
	
	protected boolean isTopLevel() {
		return false;
	}
	
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

//		System.out.println(eResource().getURI()+"#"+eResource().getURIFragment(this));
		String expr = "Object.getPrototypeOf(this)";
		if (!isBlank(propertyName)) {
			expr+="."+propertyName;
		}
		return new String[] {
				"return "+expr+";\r\n",					
				expr+" = newValue;\r\n"
		};
	}
	
	@Override
	public PortInfo[] getInputPorts(Connection connection) {
		return null;
	}
	
	@Override
	public PortInfo[] getOutputPorts(Connection connection) {
		return null;
	}
	
	@Override
	public List<AbstractErrorHandler> collectErrorHandlers(org.nasdanika.amur.it.js.Component source, Map<Object, Object> context, IProgressMonitor monitor, MultiStatus status) throws Exception {
		// No cross-handler dependencies and no error handling for connections.
		if (source instanceof AbstractErrorHandler || source instanceof org.nasdanika.amur.it.js.Connection) {
			return Collections.emptyList();
		}
		
		List<AbstractErrorHandler> accumulator = new ArrayList<>();
		
		if (getOwner() instanceof Composite) {
			for (org.nasdanika.amur.Component c: ((Composite) getOwner()).getChildren()) {
				if (c.getImplementationType() instanceof AbstractErrorHandler) {
					accumulator.add((AbstractErrorHandler) c.getImplementationType());
				}
			}
		}
		
		final EList<ErrorHandler> eho = getErrorHandlersOrder();
		
		Collections.sort(accumulator, new Comparator<AbstractErrorHandler>() {

			@Override
			public int compare(
					AbstractErrorHandler o1,
					AbstractErrorHandler o2) {
				int idx1 = eho.indexOf(o1.getOwner());
				int idx2 = eho.indexOf(o2.getOwner());
//				System.out.println(idx1+":"+idx2+", "+o1.getOwner().getName()+":"+o2.getOwner().getName());

				if (idx1==-1) {
					if (idx2==-1) {
						return o1.getId().compareTo(o2.getId());
					}
					return 1;
				} 
				
				if (idx2==-1) {
					return -1;
				}
				return idx1-idx2;	
			}
			
		});
		
		List<AbstractErrorHandler> ret = new ArrayList<>();
		for (AbstractErrorHandler eh: accumulator) {
			if (!eh.tracesTo(source.getOwner())) {
				ret.add(eh);
				if (isBlank(eh.genCondition(context, monitor, status))) {
					return ret; // Reached unconditional handler, no need to collect further.
				}
			}
		}
		
		if (getOwner().getParent()!=null && getOwner().getParent().getImplementationType() instanceof AbstractNode) {
			ret.addAll(((AbstractNode) getOwner().getParent().getImplementationType()).collectErrorHandlers(source, context, monitor, status));
		}
		return ret;
	}
	
//	@Override
//	public EList<ErrorHandler> getErrorHandlersOrder() {
//		return ECollections.emptyEList();
//	}
	
	@Override
	public List<AbstractEventListener> collectEventListeners(org.nasdanika.amur.it.js.Component source, Map<Object, Object> context, IProgressMonitor monitor, MultiStatus status) throws Exception {
		List<AbstractEventListener> ret = new ArrayList<>();
		
		if (getOwner() instanceof Composite) {
			for (org.nasdanika.amur.Component c: ((Composite) getOwner()).getChildren()) {
				if (c.getImplementationType() instanceof AbstractEventListener && !((AbstractEventListener) c.getImplementationType()).tracesTo(source.getOwner())) {
					ret.add((AbstractEventListener) c.getImplementationType());
				}
			}
		}
		
		if (getOwner().getParent()!=null && getOwner().getParent().getImplementationType() instanceof AbstractNode) {
			ret.addAll(((AbstractNode) getOwner().getParent().getImplementationType()).collectEventListeners(source, context, monitor, status));
		}
		return ret;
	}
	
	@Override
	protected void configureInputDependencyInfo(
			org.nasdanika.amur.it.js.Component input, 
			DependencyInfo di,
			org.nasdanika.amur.it.js.exec.Component targetComponent,
			URI resourceURI,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		
		super.configureInputDependencyInfo(input, di, targetComponent, resourceURI, context, monitor, status);
		
		if (DependencyRole.PROPERTY.equals(di.getRole())) {
			String[] am = genAccessorAndMutator(input, di.getName(), context, monitor, status);
			if (am!=null) {
				if (!isBlank(am[0])) {
					di.getCode().put(DependencyInfo.ACCESSOR_KEY, am[0]);					
				}
				if (!isBlank(am[1])) {
					di.getCode().put(DependencyInfo.MUTATOR_KEY, am[1]);					
				}
			}
		} else {
			if (input instanceof AbstractTransition && !Join.NONE.equals(((AbstractTransition) input).getJoinType())) {
				di.setJoinType(((AbstractTransition) input).getJoinType());
				List<Connection> joinInputs = new ArrayList<>();
				for (Connection c: ((AbstractConnectionTarget) getOwner()).getInboundConnections()) {
					if (c.getImplementationType() instanceof AbstractTransition 
							&& !Join.NONE.equals(((AbstractTransition) c.getImplementationType()).getJoinType())) {
						joinInputs.add(c);
					}					
				}
				Collections.sort(joinInputs, new Comparator<Connection>() {

					@Override
					public int compare(Connection o1, Connection o2) {
						int idx1 = getInboundTransitionsOrder().indexOf(o1);
						int idx2 = getInboundTransitionsOrder().indexOf(o2);
						return idx1!=idx2 ? idx1-idx2 : o1.getId().compareTo(o2.getId());
					}
					
				});
				
				for (Connection c: joinInputs) {
					di.getParameters().add(createParameter(toValidJavaIdentifier(trimLeadingDot(((AbstractTransition) c.getImplementationType()).genTargetName()))));
				}
				
				for (JoinEntry je: getJoinConditions()) {
					if (isBlank(je.getPort())) { // For default port for now.
						for (Source jc: je.getConditions()) {
							String cc = toJavaScript(jc, context, monitor, status, "Join condition");
							if (!isBlank(cc)) {
								di.getJoinConditions().add(cc);
							}
						}
					}
				}
				String handler = genHandler(input, context, monitor, status);
				if (!isBlank(handler)) {
					di.getCode().put(DependencyInfo.HANDLER_KEY, handler);
				}
			} else {
				for (Parameter p: genInputParameters(input, context, monitor, status)) {
					di.getParameters().add(EcoreUtil.copy(p));
				}
				String handler = genHandler(input, context, monitor, status);
				if (!isBlank(handler)) {
					di.getCode().put(DependencyInfo.HANDLER_KEY, handler);
				}
			}
		}
	}
	
	@Override
	public void populateExecutionComponent(
			Component cmp,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		super.populateExecutionComponent(cmp, context, monitor, status);
		Initializer children = cmp.getEntries().get("$children");
		if (children instanceof Hash) {
			Initializer starter = ((Hash) children).getEntries().get("$starter");
			if (starter instanceof Component) {
				Component starterComponent = (Component) starter;
				createOutputs(starterComponent);			
				createInputs(starterComponent, false);		
		 		createDoStart(starterComponent, context, monitor, status);		
		 		createCreateStopPromise(starterComponent, context, monitor, status);		
				createInit(starterComponent);				
			}
		}
	}
	
	// Completions
	
	/**
	 * Context completions - outputs, events, publish, dispatch - for a given port.
	 * @param completions
	 */
	@Override
	protected void addContextCompletions(String feature, String port, List<VariableCompletion> completions) {
		super.addContextCompletions(feature, port, completions);		
		
		if (getOwner() instanceof AbstractConnectionSource) {
			EList<Connection> outboundConnections = ((AbstractConnectionSource) getOwner()).getOutboundConnections();
			for (Connection output: outboundConnections) {
				if (output.getImplementationType() instanceof org.nasdanika.amur.it.js.Connection) {				
					final org.nasdanika.amur.it.js.Connection oit = (org.nasdanika.amur.it.js.Connection) output.getImplementationType();
					if (matchSourcePort(port, oit)) {
						if (output instanceof Reference) {
							completions.add(referenceCompletion(oit));
						} else if (output instanceof Call) {
							completions.add(callCompletion(oit));
						} else if (output instanceof Transition) {
							// TODO - mark dispatch/publish.
//							Completion transitionCompletion = transitionCompletion(oit);
//							if (transitionCompletion!=null) { // Named
//								completions.add(transitionCompletion);
//							}
						}
					}
				}
			}							
		}
	}
	
	private VariableCompletion referenceCompletion(final org.nasdanika.amur.it.js.Connection oit) {
		org.nasdanika.amur.Connection output = (Connection) oit.getOwner();
		StringBuilder summaryBuilder = new StringBuilder("<html>Reference ");
		StringBuilder descriptionBuilder = new StringBuilder();
		if (!isBlank(output.getName())) {
			summaryBuilder.append("<B>"+output.getName()+"</B> ");
			descriptionBuilder.append(output.getName()+" -> ");
		}
		summaryBuilder.append("to ");
		if (!isBlank(trimLeadingDot(oit.getTargetName()))) {
			summaryBuilder.append("property <B>"+trimLeadingDot(oit.getTargetName())+"</B> of ");
		}
		if (!isBlank(oit.getTargetPort())) {
			summaryBuilder.append("port "+oit.getTargetPort()+" of ");
		}
		org.nasdanika.amur.Component target = (org.nasdanika.amur.Component) output.getTarget();
		ImplementationType tit = target.getImplementationType();
		String titName = tit.getName();
		if (!isBlank(titName)) {
			summaryBuilder.append(titName);
			summaryBuilder.append(" ");
		}
		if (!isBlank(target.getName())) {
			summaryBuilder.append("<B>"+target.getName()+"</B>");
		}
		summaryBuilder.append("</html>");
		final String summary = summaryBuilder.toString();

		if (!isBlank(target.getName())) {
			descriptionBuilder.append(target.getName()+".");
		}
		if (!isBlank(oit.getTargetPort())) {
			descriptionBuilder.append(oit.getTargetPort()+".");
		}
		if (!isBlank(trimLeadingDot(oit.getTargetName()))) {
			descriptionBuilder.append(trimLeadingDot(oit.getTargetName()));
		}
		
		final String description = descriptionBuilder.toString();
		
		// Variable/basic completion.
		return new VariableCompletion() {
			
			@Override
			public String getSummary() {
				return summary;
			}
			
			@Override
			public String getShortDescription() {
				return description;
			}
			
			@Override
			public Icon getIcon() {
				return IconResource.Reference.getIcon();
			}
			
			@Override
			public int getRelevance() {
				return 10;
			}

			@Override
			public String getId() {
				return oit.getOwner().getId();
			}

			@Override
			public String getType() {
				// TODO 
				return null;
			}

			@Override
			public String getName() {
				return trimLeadingDot(oit.genSourceName());
			}
		};
	}

	private FunctionCompletion callCompletion(final org.nasdanika.amur.it.js.Connection oit) {
		org.nasdanika.amur.Connection output = (Connection) oit.getOwner();
		StringBuilder summaryBuilder = new StringBuilder("<html>Call ");
		StringBuilder descriptionBuilder = new StringBuilder();
		if (!isBlank(output.getName())) {
			summaryBuilder.append("<B>"+output.getName()+"</B> ");
			descriptionBuilder.append(output.getName()+" -> ");
		}
		summaryBuilder.append("to ");
		if (!isBlank(trimLeadingDot(oit.getTargetName()))) {
			summaryBuilder.append("function <B>"+trimLeadingDot(oit.getTargetName())+"</B> of ");
		}
		if (!isBlank(oit.getTargetPort())) {
			summaryBuilder.append("port "+oit.getTargetPort()+" of ");
		}
		org.nasdanika.amur.Component target = (org.nasdanika.amur.Component) output.getTarget();
		ImplementationType tit = target.getImplementationType();
		String titName = tit.getName();
		if (!isBlank(titName)) {
			summaryBuilder.append(titName);
			summaryBuilder.append(" ");
		}
		if (!isBlank(target.getName())) {
			summaryBuilder.append("<B>"+target.getName()+"</B>");
		}
		summaryBuilder.append("</html>");
		final String summary = summaryBuilder.toString();

		if (!isBlank(target.getName())) {
			descriptionBuilder.append(target.getName()+".");
		}
		if (!isBlank(oit.getTargetPort())) {
			descriptionBuilder.append(oit.getTargetPort()+".");
		}
		if (!isBlank(trimLeadingDot(oit.getTargetName()))) {
			descriptionBuilder.append(trimLeadingDot(oit.getTargetName())+"()");
		}
		
		final String description = descriptionBuilder.toString();
		
		final List<org.nasdanika.common.autocomplete.Parameter> parameters = new ArrayList<>();		
		
		try {
			Map<Object, Object> context = Collections.emptyMap();
			NullProgressMonitor progressMonitor = new NullProgressMonitor();
			MultiStatus status = new MultiStatus("org.nasdanika.amur.it.js", 0, "Completions", null);
			DependencyInfo di = oit.createInputDependencyInfo(this, context, progressMonitor, status);
			for (Parameter p: di.getParameters()) {
				parameters.add(asCompletionParameter(p));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new FunctionCompletion() {
			
			@Override
			public String getSummary() {
				return summary;
			}
			
			@Override
			public String getShortDescription() {
				return description;
			}
			
			@Override
			public Icon getIcon() {
				return IconResource.Call.getIcon();
			}
			
			@Override
			public String getType() {
				return null;
			}
			
			@Override
			public String getName() {
				return trimLeadingDot(oit.genSourceName());
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
				return oit.getOwner().getId();
			}
		};
	}
	
} //AbstractNodeImpl
