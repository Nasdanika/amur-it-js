/**
 */
package org.nasdanika.amur.it.js.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.Icon;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.jface.action.IMenuManager;
import org.nasdanika.amur.AbstractConnectionSource;
import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.Composite;
import org.nasdanika.amur.Connection;
import org.nasdanika.amur.ImplementationType;
import org.nasdanika.amur.Reference;
import org.nasdanika.amur.it.js.AbstractErrorHandler;
import org.nasdanika.amur.it.js.AbstractEventListener;
import org.nasdanika.amur.it.js.AbstractNode;
import org.nasdanika.amur.it.js.Cloning;
import org.nasdanika.amur.it.js.Component;
import org.nasdanika.amur.it.js.Join;
import org.nasdanika.amur.it.js.JsFactory;
import org.nasdanika.amur.it.js.JsPackage;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.ReferenceScope;
import org.nasdanika.amur.it.js.exec.Array;
import org.nasdanika.amur.it.js.exec.DependencyInfo;
import org.nasdanika.amur.it.js.exec.DependencyRole;
import org.nasdanika.amur.it.js.exec.ExecFactory;
import org.nasdanika.amur.it.js.exec.Fragment;
import org.nasdanika.amur.it.js.exec.Function;
import org.nasdanika.amur.it.js.exec.Hash;
import org.nasdanika.amur.it.js.exec.Initializer;
import org.nasdanika.amur.it.js.exec.OutputType;
import org.nasdanika.amur.it.js.impl.resources.IconResource;
import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.lang.TextSource;
import org.nasdanika.amur.lang.util.LangUtil;
import org.nasdanika.amur.util.AmurUtil;
import org.nasdanika.amur.util.AmurValidator;
import org.nasdanika.common.autocomplete.Completion;
import org.nasdanika.common.autocomplete.CompletionProvider;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;
import org.nasdanika.common.autocomplete.FunctionCompletion;
import org.nasdanika.common.autocomplete.Scope;
import org.nasdanika.common.autocomplete.VariableCompletion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.impl.ComponentImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.impl.ComponentImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.impl.ComponentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.impl.ComponentImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.impl.ComponentImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.impl.ComponentImpl#getStop <em>Stop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComponentImpl extends CDOObjectImpl implements Component {
	
	
	private EContentAdapter ownerContentAdapter = new EContentAdapter() {
		
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			
			if (AmurPackage.eINSTANCE.getComposite_Children().equals(notification.getFeature()) 
					&& notification.getEventType()==Notification.ADD
					&& notification.getNewValue() instanceof org.nasdanika.amur.Component					
					&& (((org.nasdanika.amur.Component) notification.getNewValue()).getImplementationType()==null 
						|| ImplementationType.NO_IMPLEMENTATION_TYPE==((org.nasdanika.amur.Component) notification.getNewValue()).getImplementationType())) {
				
				setDefaultImplementationType((org.nasdanika.amur.Component) notification.getNewValue());
			}
		};
		
	};

	protected void setDefaultImplementationType(org.nasdanika.amur.Component child) {
	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ComponentImpl() {
		super();
		for (Class<?> i: getClass().getInterfaces()) {
			String iName = i.getName();
			if (iName.startsWith("org.nasdanika.amur.it.java.")) {
				setId(i.getName());
			}
		}
		eAdapters().add(new AdapterImpl() {
			
			@Override
			public void notifyChanged(Notification msg) {
				if (AmurPackage.eINSTANCE.getImplementationType_Owner().equals(msg.getFeature())) {
					if (msg.getOldValue()!=null) {
						((EObject) msg.getOldValue()).eAdapters().remove(ownerContentAdapter);
					}					
					if (msg.getNewValue() instanceof Composite) {
						((EObject) msg.getNewValue()).eAdapters().add(ownerContentAdapter);
						for (org.nasdanika.amur.Component child: ((Composite) msg.getNewValue()).getChildren()) {
							setDefaultImplementationType(child);							
						}
					}					
				}
			}
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(AmurPackage.Literals.IMPLEMENTATION_TYPE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(AmurPackage.Literals.IMPLEMENTATION_TYPE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eGet(AmurPackage.Literals.IMPLEMENTATION_TYPE__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(AmurPackage.Literals.IMPLEMENTATION_TYPE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.amur.Component getOwner() {
		return (org.nasdanika.amur.Component)eGet(AmurPackage.Literals.IMPLEMENTATION_TYPE__OWNER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(org.nasdanika.amur.Component newOwner) {
		eSet(AmurPackage.Literals.IMPLEMENTATION_TYPE__OWNER, newOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(AmurPackage.Literals.IMPLEMENTATION_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(AmurPackage.Literals.IMPLEMENTATION_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getDeclarations() {
		return (Source)eGet(JsPackage.Literals.COMPONENT__DECLARATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclarations(Source newDeclarations) {
		eSet(JsPackage.Literals.COMPONENT__DECLARATIONS, newDeclarations);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getStart() {
		return (Source)eGet(JsPackage.Literals.COMPONENT__START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Source newStart) {
		eSet(JsPackage.Literals.COMPONENT__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getStop() {
		return (Source)eGet(JsPackage.Literals.COMPONENT__STOP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStop(Source newStop) {
		eSet(JsPackage.Literals.COMPONENT__STOP, newStop);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void init(ImplementationType prevImplementationType) {
		if (prevImplementationType!=null) {
			AmurUtil.pumpFeatures(prevImplementationType, this, false, false, new AmurUtil.SuperClassFeatureFilter(AmurPackage.eINSTANCE.getImplementationType()));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 AmurValidator.DIAGNOSTIC_SOURCE,
						 AmurValidator.IMPLEMENTATION_TYPE__VALIDATE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validate", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isComposite() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void destroy() {
		// NOP
	}

	@Override
	public void contributeToPopupMenu(IMenuManager menu, Object... context) {
		// TODO Auto-generated method stub
		
	}
	
	protected String componentComment(org.nasdanika.amur.Component component) {
		StringBuilder ret = new StringBuilder(component.eClass().getName());
		if (component.getImplementationType()!=null) {
			ret.append(" ");
			ret.append(component.getImplementationType().eClass().getName());
		}
		if (component.getName()!=null) {
			ret.append(" \"");
			ret.append(component.getName());
			ret.append("\"");
		}
		
		if (component instanceof org.nasdanika.amur.Connection) {
			ret.append(" from ");
			ret.append(componentComment((org.nasdanika.amur.Component) ((org.nasdanika.amur.Connection) component).getSource()));
			ret.append(" to ");
			ret.append(componentComment((org.nasdanika.amur.Component) ((org.nasdanika.amur.Connection) component).getTarget()));
		}
		return ret.toString();
	}
	
	protected String runtimeId(org.nasdanika.amur.Component component) {
		return "$"+component.getId();
	}

	@Override
	public org.nasdanika.amur.it.js.exec.Component createExecutionComponent(URI resourceURI, Map<Object, Object> context, IProgressMonitor monitor, MultiStatus status) throws Exception {
		org.nasdanika.amur.it.js.exec.Component ec = ExecFactory.eINSTANCE.createComponent();
		ec.setCreator(this);
		ec.setId(runtimeId(getOwner()));
		ec.getEntries().put("$name", createFragment("\""+componentComment(getOwner()).replace('\"', '\'')+" "+getOwner().getId()+"\""));
//		ec.getEntries().put("$id", createFragment("\""+getOwner().getId()+"\""));
		ec.setComment(componentComment(getOwner()));				
		Hash childrenHash = ExecFactory.eINSTANCE.createHash();
		childrenHash.setComment("Children of "+ec.getId());
		ec.getEntries().put(org.nasdanika.amur.it.js.exec.Component.CHILDREN_KEY, childrenHash);
		
		Composite parent = getOwner().getParent();
		if (parent!=null && parent.getImplementationType() instanceof AbstractNode) {
			int ehp = errorHandlersOffset();
			for (AbstractErrorHandler eh: ((AbstractNode) parent.getImplementationType()).collectErrorHandlers(this, context, monitor, status)) {
				DependencyInfo di = eh.createInputDependencyInfo(null, context, monitor, status);
				org.nasdanika.amur.it.js.exec.Component iProxy = eh.createExecutionComponentProxy(resourceURI, null);
				di.setOrder(ehp++);
				ec.getOutputs().put(iProxy, di);				
			}				
			for (AbstractEventListener el: ((AbstractNode) parent.getImplementationType()).collectEventListeners(this, context, monitor, status)) {
				DependencyInfo di = el.createInputDependencyInfo(null, context, monitor, status);
				org.nasdanika.amur.it.js.exec.Component iProxy = el.createExecutionComponentProxy(resourceURI, null);				
				ec.getOutputs().put(iProxy, di);				
			}				
		}
				
		createDeclarations(context, monitor, status, ec);		
		createStart(context, monitor, status, ec);		
		createStop(context, monitor, status, ec);			
		
		return ec;
	}
	
	protected int errorHandlersOffset() {
		return 0;
	}

	protected void createDeclarations(
			Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status,
			org.nasdanika.amur.it.js.exec.Component ec) throws Exception {
		
		String declarationsScript = toJavaScript(getDeclarations(), context, monitor, status, "declarations");
		if (declarationsScript!=null) {
			Fragment declarationsFragment = ExecFactory.eINSTANCE.createFragment();
			declarationsFragment.setCode(declarationsScript);
			ec.getEntries().put(Hash.INLINE_KEY, declarationsFragment);
		}
	}

	protected void createStart(
			Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status,
			org.nasdanika.amur.it.js.exec.Component ec) throws Exception {
		
		String startScript = toJavaScript(getStart(), context, monitor, status, "start");
		if (startScript!=null) {
			Function startFunction = ExecFactory.eINSTANCE.createFunction();
			startFunction.setBody(startScript);
			startFunction.setComment("Start function shall return true if it explicitly invokes $onStart(). "
					+ "$onStart parameter is a callback function to be passed along to the terminal and invoked after all components are started.");
			ec.getEntries().put("$start", startFunction);
		}
	}
	
//	private static String label(org.nasdanika.amur.it.js.exec.Component cmp) {
//		if (cmp.getCreator()==null) {
//			return absolutePath(cmp.getPath());
//		}
//		
//		org.nasdanika.amur.Component owner = cmp.getCreator().getOwner();
//		return owner.getName() + "("+owner.eClass().getName()+")";
//	}

	/**
	 * Creates, if required, and returns start promise which fulfills when component
	 * is started, i.e. its outputs started and its $start method, if it is present.
	 * @param ec
	 * @throws Exception 
	 */
	protected static void createDoStart(org.nasdanika.amur.it.js.exec.Component ec, Map<Object, Object> context, IProgressMonitor monitor, MultiStatus status) throws Exception {
		Function doStart = ExecFactory.eINSTANCE.createFunction();
		doStart.setComment("Starts component and returns a promise which is fulfilled once all guard inputs and component itself successfully start");		
		doStart.getParameters().add(createParameter("$startInvocation"));
		StringBuilder bodyBuilder = new StringBuilder();
		
		// --- Debugging ---
		// bodyBuilder.append("console.log(\"Starting "+label(ec)+"\");\r\n");
		// ---
		
		bodyBuilder.append("if (!this.$startPromise) {\r\n");
		
		// --- Debugging ---
//		bodyBuilder.append("console.log(\"Creating start promise for "+label(ec)+"\");\r\n");
		// ---
		
		bodyBuilder.append("var $startDeferred = $promiseProvider.defer();\r\n");
		bodyBuilder.append("this.$startPromise = $startDeferred.promise;\r\n");		
		
		StringBuilder nonGuardStartPromisesBuilder = new StringBuilder();
		
		Array guardOutputsPromisesArray = ExecFactory.eINSTANCE.createArray();
		for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> o: ec.getOutputs()) {			
			String outputStartPromise = "this.$outputs."+o.getValue().getId()+".$start($startInvocation)";
			
			if (o.getValue().getGuard()) {
				guardOutputsPromisesArray.getElements().add(createFragment(outputStartPromise));
			} else {
				nonGuardStartPromisesBuilder.append(outputStartPromise+";\r\n");
			}
		}
		
		StringBuilder promiseBuilder = new StringBuilder();
		if (guardOutputsPromisesArray.getElements().size()==1) {
			promiseBuilder.append(guardOutputsPromisesArray.getElements().get(0).getJavaScript());
		} else if (!guardOutputsPromisesArray.getElements().isEmpty()) {
			promiseBuilder.append("$promiseProvider.all("+guardOutputsPromisesArray.getJavaScript()+").then(function($startInvocations) { return $startInvocations[0]; })");
		}	
		
		if (promiseBuilder.length()==0) {
			promiseBuilder.append("$promiseProvider(this.$createStopPromise($startInvocation))");
		} else {
			promiseBuilder.append(".then(this.$createStopPromise.bind(this))");
		}		
		
		if (ec.getEntries().containsKey("$start")) {
			promiseBuilder.append(".then($invokeInContext(this.$start, 'start', this))");
		}
		
		if (ec.getEntries().containsKey("$afterStart")) {
			promiseBuilder.append(".then($invokeInContext(this.$afterStart, 'start', this))");
		}
		
		// --- Debugging ---
//		promiseBuilder.append(".then(function() {\r\n");
//		if (ec.getCreator()==null) {
//			promiseBuilder.append("console.log(\"Started "+absolutePath(ec.getPath())+"\");\r\n");
//		} else {
//			promiseBuilder.append("console.log(\"Started "+ec.getCreator().getOwner().getName()+"\");\r\n");
//		}				
//		promiseBuilder.append("})");
		// ---
		
		bodyBuilder.append(promiseBuilder+".then($startDeferred.resolve, $startDeferred.reject);");
		bodyBuilder.append(nonGuardStartPromisesBuilder);
		bodyBuilder.append("}\r\n");
		bodyBuilder.append("return this.$startPromise.then(function() { return $startInvocation; });\r\n");
		doStart.setBody(bodyBuilder.toString()); 
		ec.getEntries().put("$doStart", doStart);
	}

	protected void createStop(
			Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status,
			org.nasdanika.amur.it.js.exec.Component ec) throws Exception {
		
		String stopScript = toJavaScript(getStop(), context, monitor, status, "stop");
		if (stopScript!=null) {
			Function stopFunction = ExecFactory.eINSTANCE.createFunction();
			stopFunction.setBody(stopScript);
			ec.getEntries().put("$stop", stopFunction);
		}
	}

	protected static void createInit(org.nasdanika.amur.it.js.exec.Component ec) {
		Function init = ExecFactory.eINSTANCE.createFunction();
		init.setComment("Injects parent reference to children and component reference to ouputs and inputs");
		init.getParameters().add(createParameter("$parent"));
		// TODO - optimizations - init children, inputs, outputs are only if they are present.
		StringBuilder bodyBuilder = new StringBuilder("this.$parent = $parent;\r\n");
		Hash childrenHash = (Hash) ec.getEntries().get(org.nasdanika.amur.it.js.exec.Component.CHILDREN_KEY); 
		if (childrenHash!=null && !childrenHash.isEmpty()) {  
			bodyBuilder.append(
				"for (var m in this.$children) {\r\n" + 
				"    this.$children[m].$init(this);\r\n" + 
				"}\r\n");
		}
		Hash inputsHash = (Hash) ec.getEntries().get("$inputs"); 
		if (inputsHash!=null && !inputsHash.getEntries().isEmpty()) {  
			bodyBuilder.append(
				"for (var m in this.$inputs) {\r\n" + 
				"    this.$inputs[m].$component = this;\r\n" + 
				"}\r\n");
		}
		Hash outputsHash = (Hash) ec.getEntries().get("$outputs"); 
		if (outputsHash!=null && !outputsHash.getEntries().isEmpty()) {  
			bodyBuilder.append(		
				"for (var m in this.$outputs) {\r\n" + 
				"    this.$outputs[m].$component = this;\r\n" + 
				"}");
		}
		
		init.setBody(bodyBuilder.toString());
		ec.getEntries().put("$init", init);
	}
	
	/**
	 * Puts quotes around hash key if necessary
	 * @param identifier
	 * @return
	 */
	public static String quoteKey(String key) {
		if (key == null) {
			return key;
		}
		
		if (key.trim().length()==0) {
			return key;
		}
		
		if (isValidJavaIdentifier(key)) {
			return key;
		}
		
		return "\""+StringEscapeUtils.escapeEcmaScript(key)+"\"";
	}
	
	/**
	 * Returns true if errors shall be handled.
	 * @param ec
	 * @return
	 */
	protected static boolean createCreateContext(org.nasdanika.amur.it.js.exec.Component ec) {
		Function createContext = ExecFactory.eINSTANCE.createFunction();
		createContext.getParameters().add(createParameter("$inputName"));
		createContext.getParameters().add(createParameter("$parentInvocations"));
		createContext.setComment("Creates context object for a given invocation, the object contains named outputs methods and properties, $dispatch, $publish, and $handleError functions");
		StringBuilder bodyBuilder = new StringBuilder();
		Hash contextHash  = ExecFactory.eINSTANCE.createHash();
		contextHash.setComment("Context hash for "+ec.getId());
		
		contextHash.getEntries().put("$inputName", createFragment("{ value : $inputName }"));
		
		// Named outputs - functions (calls, transitions)
		for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> o: ec.getOutputs().entrySet()) {
			if (!isBlank(o.getValue().getName())					
					&& !DependencyRole.ERROR_HANDLER.equals(o.getValue().getRole())
					&& !DependencyRole.EVENT_SINK.equals(o.getValue().getRole())
					&& !DependencyRole.NONE.equals(o.getValue().getRole())) {
				
				if (DependencyRole.PROPERTY.equals(o.getValue().getRole())) {
					contextHash.getEntries().put(quoteKey(o.getValue().getName()), createFragment("this.$outputs."+o.getValue().getId()+".$createActivator($parentInvocations)"));					
				} else {
					contextHash.getEntries().put(quoteKey(o.getValue().getName()), createPropertyValueHash("this.$outputs."+o.getValue().getId()+".$createActivator($parentInvocations)"));
				}
			}
		}
				
		// Dispatch and publish
		Array dpActivators = ExecFactory.eINSTANCE.createArray();
		createDispatchAndPublish(ec, contextHash, dpActivators);		
		
		// Error handling
		Array errorHandlers = ExecFactory.eINSTANCE.createArray();
		Function ehv = createHandleError(ec, errorHandlers);
		if (ehv!=null) {
			contextHash.getEntries().put("$handleError", createPropertyValueHash(ehv));
		}
		
		// Event publishing
		Array eventSinks = ExecFactory.eINSTANCE.createArray();		
		createEmitEvent(ec, contextHash, eventSinks);
		
		bodyBuilder.append("var $dpActivators = "+dpActivators.getJavaScript()+";\r\n");
		if (!errorHandlers.getElements().isEmpty()) {
			bodyBuilder.append("var $errorHandlers = "+errorHandlers.getJavaScript()+";\r\n");
		}
		bodyBuilder.append("var $eventSinks = "+eventSinks.getJavaScript()+";\r\n");
		
//		// Named outputs - properties - TODO - change to property entries in the hash.
//		for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> o: ec.getOutputs().entrySet()) {
//			if (o.getValue().getName()!=null
//					&& o.getValue().getName().trim().length()>0
//					&& DependencyRole.PROPERTY.equals(o.getValue().getRole())) {
//				
//				bodyBuilder.append("var $activator_"+o.getValue().getId()+" = this.$outputs."+o.getValue().getId()+".$createActivator($parentInvocations);\r\n");
//				contextHash.getEntries().put(quoteKey(o.getValue().getName()), createPropertyGetSetHash("$activator_"+o.getValue().getId()+".get", "$activator_"+o.getValue().getId()+".set"));
//			}
//		}
		
		bodyBuilder.append("return Object.create(this, "+contextHash.getJavaScript()+");\r\n");
		createContext.setBody(bodyBuilder.toString()); 
		ec.getEntries().put("$createContext", createContext);
		return ehv!=null;
	}
	
	/**
	 * Creates a hash for property definition like { value : code }
	 * @param code
	 * @return
	 */
	protected static Hash createPropertyValueHash(String code) {
		return createPropertyValueHash(createFragment(code));
	}

	/**
	 * Creates a hash for property definition like { value : code }
	 * @param code
	 * @return
	 */
	protected static Hash createPropertyValueHash(Initializer code) {
		Hash ret = ExecFactory.eINSTANCE.createHash();
		ret.getEntries().put("value", code);
		return ret;
	}

	protected static Hash createPropertyGetSetHash(String getter, String setter) {
		return createPropertyGetSetHash(isBlank(getter) ? null : createFragment(getter), isBlank(setter) ? null : createFragment(setter));
	}
	
	/**
	 * Creates a hash for property definition like { value : code }
	 * @param code
	 * @return
	 */
	protected static Hash createPropertyGetSetHash(Initializer getter, Initializer setter) {
		Hash ret = ExecFactory.eINSTANCE.createHash();
		if (getter!=null) {
			ret.getEntries().put("get", getter);
		}
		if (setter!=null) {
			ret.getEntries().put("set", setter);
		}
		return ret;
	}
	
	protected static void createDispatchAndPublish(
			org.nasdanika.amur.it.js.exec.Component ec, 
			Hash contextHash,
			Array dpActivators) {
		
		List<Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo>> dispatchOutputs = new ArrayList<>();
		for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> o: ec.getOutputs().entrySet()) {
			if (DependencyRole.DISPATCH.equals(o.getValue().getRole())) {
				dispatchOutputs.add(o);
			}
		}
		if (!dispatchOutputs.isEmpty()) {
			Collections.sort(dispatchOutputs, new Comparator<Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo>>() {

				@Override
				public int compare(
						Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> o1,
						Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> o2) {
					
					return o1.getValue().getOrder()-o2.getValue().getOrder();
				}
			});
			
			Function dispatchFunction = ExecFactory.eINSTANCE.createFunction();
			contextHash.getEntries().put("$dispatch", createPropertyValueHash(dispatchFunction));
			
			Function publishFunction = ExecFactory.eINSTANCE.createFunction();
			contextHash.getEntries().put("$publish", createPropertyValueHash(publishFunction));
			
			StringBuilder pBuilder = new StringBuilder();
			for (Parameter p: dispatchOutputs.get(0).getValue().getParameters()) {
				dispatchFunction.getParameters().add(EcoreUtil.copy(p));
				publishFunction.getParameters().add(EcoreUtil.copy(p));
				if (pBuilder.length()>0) {
					pBuilder.append(", ");
				}
				pBuilder.append(p.getName());
			}
			
			boolean doDispatch = true;
			int idx = 0;
			StringBuilder dispatchBuilder = new StringBuilder("return ");
			StringBuilder publishBuilder = new StringBuilder("var published = [];\r\n");
			for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> o: dispatchOutputs) {
				dpActivators.getElements().add(createFragment("this.$outputs."+o.getValue().getId()+".$createActivator($parentInvocations)"));
				String condition = o.getValue().getCode().get(DependencyInfo.CONDITION_KEY);
				if (doDispatch) {
					if (idx>0) {
						dispatchBuilder.append(" || ");
					}
					dispatchBuilder.append("$dpActivators["+idx+"] && $dpActivators["+idx+"]("+pBuilder+")");					
					doDispatch = condition!=null && condition.trim().length()>0;
				}
					
				publishBuilder.append("published["+idx+"] = $dpActivators["+idx+"] && $dpActivators["+idx+"]("+pBuilder+");\r\n");
				
				++idx;	
			}
			
			publishBuilder.append("return published;\r\n");
			
			dispatchFunction.setBody(dispatchBuilder.toString());
			publishFunction.setBody(publishBuilder.toString());			
		}
	}		

	protected static Function createHandleError(org.nasdanika.amur.it.js.exec.Component ec, Array errorHandlers) {
		
		List<Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo>> errorHandlingOutputs = new ArrayList<>();
		for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> o: ec.getOutputs().entrySet()) {
			if (DependencyRole.ERROR_HANDLER.equals(o.getValue().getRole())) {
				errorHandlingOutputs.add(o);
			}
		}
		
		Collections.sort(errorHandlingOutputs, new Comparator<Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo>>() {

			@Override
			public int compare(
					Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> o1,
					Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> o2) {
				
				return o1.getValue().getOrder()-o2.getValue().getOrder();
			}
		});
		
		Function handleErrorFunction = ExecFactory.eINSTANCE.createFunction();
		handleErrorFunction.getParameters().add(createParameter("error"));
				
//		System.out.println("--- "+ec.getComment());
		int idx = 0;
		StringBuilder ehBuilder = new StringBuilder("if ($config && $config.logErrors) {\r\nconsole.error(error);\r\n}\r\n");
		ehBuilder.append("var $result = ");
		for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> o: errorHandlingOutputs) {
			errorHandlers.getElements().add(createFragment("this.$outputs."+o.getValue().getId()+".$createActivator($parentInvocations)"));
			if (idx>0) {
				ehBuilder.append(" || ");
			}
			
			ehBuilder.append("$errorHandlers["+idx+"] && $errorHandlers["+idx+"](error)");
			String condition = o.getValue().getCode().get(DependencyInfo.CONDITION_KEY);
//			System.out.println("\t\t"+o.getValue().getOrder()+"/"+o.getValue().getId()+": "+condition);
			
			++idx;
			
			if (condition==null || condition.trim().length()==0) {
				break;
			}
		}
		ehBuilder.append(";\r\n if ($result) { return $result; }\r\n throw error;\r\n");
		handleErrorFunction.setBody(ehBuilder.toString());
		return idx==0 ? null : handleErrorFunction;
	}
	
	protected static void createEmitEvent(
			org.nasdanika.amur.it.js.exec.Component ec, 
			Hash contextHash,
			Array eventSinks) {
		
		Function emitEventFunction = ExecFactory.eINSTANCE.createFunction();
		contextHash.getEntries().put("$emitEvent", createPropertyValueHash(emitEventFunction));
				
		int idx = 0;
		StringBuilder esBuilder = new StringBuilder("var ret=[];\r\n");
		esBuilder.append("for (var i=0; i<arguments.length; ++i) {\r\n");
		esBuilder.append("ret[i] = [];\r\n");
		for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> o: ec.getOutputs().entrySet()) {
			if (DependencyRole.EVENT_SINK.equals(o.getValue().getRole())) { // For testing.
				eventSinks.getElements().add(createFragment("this.$outputs."+o.getValue().getId()+".$createActivator($parentInvocations)"));
				esBuilder.append("ret[i].push($eventSinks["+idx+"] && $eventSinks["+idx+"](arguments[i]));\r\n");
				++idx;
			}
		}
		esBuilder.append("}\r\n");
		esBuilder.append("return ret;\r\n");
		emitEventFunction.setBody(idx==0 ? "" : esBuilder.toString());
	}
	
	@Override
	public org.nasdanika.amur.it.js.exec.Component createExecutionComponentProxy(URI resourceURI, String port) {
		return new org.nasdanika.amur.it.js.exec.impl.ComponentImpl(resourceURI, runtimeId(getOwner()));
	}
	
	public String varName() {
		StringBuilder sb = new StringBuilder(getOwner().eClass().getName());
		sb.append("_");
		sb.append(eClass().getName());		
		String name = getOwner().getName();
		if (name!=null) {
			sb.append("_");
			for (int i=0; i<name.length(); ++i) {
				char charAt = name.charAt(i);
				if (Character.isJavaIdentifierPart(charAt)) {
					sb.append(charAt);
				} else if (Character.isWhitespace(charAt)) {
					sb.append("_");
				}
			}
		}
		sb.append("_");
		sb.append(getOwner().getId());
		
		return sb.toString();
	}

	/**
	 * Translates sources which belongs to this implementation type to JavaScript.
	 * @param src
	 * @param context
	 * @param monitor
	 * @param status
	 * @param location
	 * @return
	 * @throws Exception
	 */
	public String toJavaScript(Source src, Map<Object, Object> context, IProgressMonitor monitor, MultiStatus status, String location) throws Exception {
		if (src==null || src.isBlank()) {
			return null;
		}
		Source js = LangUtil.translate(src, "javascript", context, monitor, 0);
		if (js instanceof TextSource) {
			return ((TextSource) js).getText();
		} 

		StringBuilder loc = new StringBuilder();		
		if (!isBlank(location)) {
			loc.append(location);
		}
		if (loc.length()>0) {
			loc.append("@");
		}
		loc.append(varName());

		status.add(new Status(Status.ERROR, "org.nasdanika.amur.it.js.gen", "Cannot translate from "+src.getLanguage().getName()+" to JavaScript: "+loc));
		monitor.setCanceled(true);	
		return null;
	}

	public static boolean isBlank(String str) {
		return str==null || str.trim().length()==0;
	}

	@Override
	public void populateExecutionComponent(
			org.nasdanika.amur.it.js.exec.Component cmp,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		
		createOutputs(cmp);			
		boolean handleErrors = createCreateContext(cmp);
		createInputs(cmp, handleErrors);		
		createDoStart(cmp, context, monitor, status);		
 		createCreateStopPromise(cmp, context, monitor, status);		
		createInit(cmp);
		traceJoinFork(cmp);
	}

	private void traceJoinFork(org.nasdanika.amur.it.js.exec.Component cmp) {
		if (cmp.getCreator() instanceof AbstractNode) {
			org.nasdanika.amur.Component joinFork = ((AbstractNode) cmp.getCreator()).getJoinFork();
			if (joinFork!=null && joinFork!=cmp.getCreator()) {
				for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> i: cmp.getInputs()) {
					if (!Join.NONE.equals(i.getValue().getJoinType())) {
						Map<org.nasdanika.amur.it.js.exec.Component, List<List<String>>> pathMap = new HashMap<>();
						trace(i.getKey(), Collections.<String>emptyList(), pathMap, cmp, joinFork);
						for (Entry<org.nasdanika.amur.it.js.exec.Component, List<List<String>>> pe: pathMap.entrySet()) {
							if (pe.getKey().getCreator()!=null && pe.getKey().getCreator().getOwner() == joinFork) {
								Hash inputsHash = (Hash) cmp.getEntries().get("$inputs");
								Hash ji = (Hash) inputsHash.getEntries().get(i.getValue().getId());
								Array jpa = ExecFactory.eINSTANCE.createArray();
								ji.getEntries().put("$joinPaths", jpa);
								for (List<String> p: pe.getValue()) {
									Array jp = ExecFactory.eINSTANCE.createArray();
									jpa.getElements().add(jp);
									for (String jpe: p) {
										jp.getElements().add(createFragment("\""+jpe+"\""));
									}
								}
							}
						}
					}
				}								
			}
		}		
	}
		
	private static void trace(
			org.nasdanika.amur.it.js.exec.Component source, 
			List<String> path, 
			Map<org.nasdanika.amur.it.js.exec.Component, List<List<String>>> pathMap,
			org.nasdanika.amur.it.js.exec.Component initialSource,
			org.nasdanika.amur.Component joinFork) {
		
		if (source==initialSource) {
			return; // Loop.
		}
		List<List<String>> pathCollector = pathMap.get(source);
		if (pathCollector==null) {
			pathCollector = new LinkedList<>();
			pathMap.put(source, pathCollector);
		}
		List<String> sPath = new ArrayList<>(path);		
		sPath.add(absolutePath(source.getPath())); // Or simply path?
		pathCollector.add(sPath);
		
		if (source.getCreator()==null || joinFork!=source.getCreator().getOwner()) {
			for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> i: source.getInputs()) {
				trace(i.getKey(), sPath, pathMap, initialSource, joinFork);
			}
		}
	}	

	protected static void createCreateStopPromise(org.nasdanika.amur.it.js.exec.Component cmp, Map<Object, Object> context, IProgressMonitor monitor, MultiStatus status) throws Exception {
		Function createStopPromise = ExecFactory.eINSTANCE.createFunction();
		createStopPromise.getParameters().add(createParameter("$startInvocation"));
		createStopPromise.setComment("Creates a stop promise from guard inputs, $stop, and output stop promises.");

		Array guardInputsPromisesArray = ExecFactory.eINSTANCE.createArray();
		for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> i: cmp.getInputs()) {
			if (i.getValue().getOpposite().getGuard()) {
				guardInputsPromisesArray.getElements().add(createFragment("this.$inputs."+i.getValue().getId()+".$stopDeferred.promise")); //.then(function() { console.log(\"Stopped guard input "+i.getValue().getName()+"/"+label(i.getKey())+" in "+label(cmp)+"\"); } )"));
			}			
		}
		
		StringBuilder promiseBuilder = new StringBuilder();
		
		if (guardInputsPromisesArray.getElements().isEmpty()) {
			// Deferred for explicit stop
			cmp.getEntries().put("$stopDeferred", createFragment("$promiseProvider.defer()"));
			promiseBuilder.append("this.$stopDeferred.promise");
		} else if (guardInputsPromisesArray.getElements().size()==1) {
			promiseBuilder.append(guardInputsPromisesArray.getElements().get(0).getJavaScript());
		} else {
			promiseBuilder.append("$promiseProvider.all("+guardInputsPromisesArray.getJavaScript()+").then(function($stopInvocations) { return $stopInvocations[0]; })");			
		}
		
//		promiseBuilder.append(".then(function() { console.log(\"Stopping component "+label(cmp)+"\"); })");

		if (!cmp.getInputs().isEmpty()) {
			Function stopInputs = ExecFactory.eINSTANCE.createFunction();
			stopInputs.getParameters().add(createParameter("$stopInvocation"));
			stopInputs.setBody("for (var i in this.$inputs) {\r\n" + 
					"    if (typeof this.$inputs[i].$onStop == \"function\") {\r\n" + 
					"        this.$inputs[i].$onStop($stopInvocation);\r\n" + 
					"    }\r\n" + 
					"}");
			
			promiseBuilder.append(".then("+stopInputs.getJavaScript()+".bind(this))");
		}
		
		if (cmp.getEntries().containsKey("$beforeStop")) {
			promiseBuilder.append(".then($invokeInContext(this.$beforeStop, 'stop', this))");
		}		

		if (cmp.getEntries().containsKey("$stop")) {
			promiseBuilder.append(".then($invokeInContext(this.$stop, 'stop', this))");
		}	
		
//		promiseBuilder.append(".then(function() { console.log(\"Stopped component "+label(cmp)+"\"); })");
		
		if (!cmp.getOutputs().isEmpty()) {
			Array guardOutputPromises = ExecFactory.eINSTANCE.createArray();
			StringBuilder nonGuardStops = new StringBuilder();
			for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> o: cmp.getOutputs()) {
				if (o.getValue().getGuard()) {
					guardOutputPromises.getElements().add(createFragment("this.$outputs."+o.getValue().getId()+".$stop($stopInvocation)")); //.then(function() { console.log(\"Stopped guard output "+o.getValue().getName()+"/"+label(o.getKey())+" in "+label(cmp)+"\"); })"));
				} else {
					nonGuardStops.append("this.$outputs."+o.getValue().getId()+".$stop($stopInvocation);\r\n"); //.then(function() { console.log(\"Stopped non-guard output "+o.getValue().getName()+"/"+label(o.getKey())+" in "+label(cmp)+"\"); });\r\n");
				}
			}
			
			Function stopOutputs = ExecFactory.eINSTANCE.createFunction();
			stopOutputs.getParameters().add(createParameter("$stopInvocation"));
			stopOutputs.setBody("return $promiseProvider.all("+guardOutputPromises.getJavaScript()+")"+(nonGuardStops.length()==0 ? "" : ".then(function() { "+nonGuardStops+" }.bind(this))")+";");
			promiseBuilder.append(".then("+stopOutputs.getJavaScript()+".bind(this))");			
//			promiseBuilder.append(".then(function() { console.log(\"Stopped outputs for component "+label(cmp)+"\"); })");
		}
		
		//promiseBuilder.append(".then(function() { return $stopInvocation; })"); //???
		createStopPromise.setBody("this.$stopPromise = "+promiseBuilder+";"+System.lineSeparator()+"return $startInvocation;"+System.lineSeparator()); 
		cmp.getEntries().put("$createStopPromise", createStopPromise);
	}

	protected static void createOutputs(org.nasdanika.amur.it.js.exec.Component cmp) {
		Hash outputsHash = ExecFactory.eINSTANCE.createHash();
		outputsHash.setComment("Outputs "+cmp.getId());
		for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> o: cmp.getOutputs()) {
			Initializer outputEntry = createOutputEntry(cmp, o.getKey(), o.getValue());
			if (outputEntry!=null) {
				outputsHash.getEntries().put(o.getValue().getId(), outputEntry);
			}
		}
		if (!outputsHash.getEntries().isEmpty()) {
			cmp.getEntries().put("$outputs", outputsHash);
		}
	}

	protected static void createInputs(org.nasdanika.amur.it.js.exec.Component cmp, boolean handleErrors) {
		Hash inputsHash = ExecFactory.eINSTANCE.createHash();
		for (Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> i: cmp.getInputs()) {
			Initializer inputEntry = createInputEntry(cmp, i.getKey(), i.getValue(), handleErrors);
			if (inputEntry!=null) {
				inputsHash.getEntries().put(i.getValue().getId(), inputEntry);
			}
		}
		if (!inputsHash.getEntries().isEmpty()) {
			cmp.getEntries().put("$inputs", inputsHash);
		}
	}
	
	/**
	 * Convenience method.
	 * @param entry
	 * @return
	 */
	protected static org.nasdanika.amur.it.js.exec.Component getDependencyEntryComponent(Map.Entry<org.nasdanika.amur.it.js.exec.Component, DependencyInfo> entry) {
		return (org.nasdanika.amur.it.js.exec.Component) ((EObject) entry).eContainer();
	}
	
	protected static Initializer createOutputEntry(org.nasdanika.amur.it.js.exec.Component cmp, org.nasdanika.amur.it.js.exec.Component key, DependencyInfo value) {
		Hash outputHash = ExecFactory.eINSTANCE.createHash();
		outputHash.setComment(key.getComment());
		
		Function start = ExecFactory.eINSTANCE.createFunction();
		start.getParameters().add(createParameter("$startInvocation"));
		outputHash.getEntries().put("$start", start);
		start.setComment("Invokes corresponding input start, passes this output as argument so the input can set $handler and $stop.");
		start.setBody("return "+absolutePath(key.getPath())+".$inputs."+key.getInputs().get(cmp).getId()+".$start(this, $startInvocation);");
		
		if (DependencyRole.PROPERTY.equals(value.getRole())) {
			Function createActivator = ExecFactory.eINSTANCE.createFunction();
			createActivator.setComment("Creates activator hash for the context of given parent invocations, with get and set functions.");
			createActivator.getParameters().add(createParameter("$parentInvocations"));			
			StringBuilder activatorBuilder = new StringBuilder("var ret = {};\r\n");
			activatorBuilder.append("if (typeof this.$get == 'function') { ret.get = "+createActivator(value, "$get", Collections.<Parameter>emptyList(), null, absolutePath(cmp.getPath()), ReferenceScope.COMPONENT.equals(value.getReferenceScope()) ? ActivatorCaching.GETTER : ActivatorCaching.NONE, value.getId())+";\r\n}\r\n"); // TODO - only if scope is flow
			activatorBuilder.append("if (typeof this.$set == 'function') { ret.set = "+createActivator(value, "$set", Collections.singletonList(createParameter("newValue")), null, absolutePath(cmp.getPath()), ReferenceScope.COMPONENT.equals(value.getReferenceScope()) ? ActivatorCaching.SETTER : ActivatorCaching.NONE, value.getId())+";\r\n}\r\n");			
			activatorBuilder.append("return ret;\r\n");
			createActivator.setBody(activatorBuilder.toString());
			outputHash.getEntries().put("$createActivator", createActivator);			
		} else {
			Function createActivator = ExecFactory.eINSTANCE.createFunction();
			createActivator.setComment("Creates activator function for the context of given parent invocations, if output is started and handler is available.");
			createActivator.getParameters().add(createParameter("$parentInvocations"));			
			createActivator.setBody("if (typeof this.$handler == 'function') { return "+createActivator(value, "$handler", value.getParameters(), value.getCode().get(DependencyInfo.CONDITION_KEY), absolutePath(cmp.getPath()), ActivatorCaching.NONE, value.getId())+";\r\n}");
			outputHash.getEntries().put("$createActivator", createActivator);			
		}

		return outputHash;
	}
	
	private enum ActivatorCaching {
		NONE, GETTER, SETTER
	}
	
	protected static String createActivator(
			DependencyInfo dependencyInfo, 
			String target, 
			List<Parameter> parameters, 
			String condition, 
			String path, 
			ActivatorCaching aCaching,
			String outputId) {
		
		StringBuilder pBuilder = new StringBuilder();
		StringBuilder ipBuilder = new StringBuilder();
		StringBuilder dataBuilder = new StringBuilder();
		for (Parameter p: parameters) {
			if (pBuilder.length()>0) {
				pBuilder.append(", ");
				dataBuilder.append(",\r\n");
			}
			pBuilder.append(p.getName());
			dataBuilder.append(p.getName()+" : "+p.getName());
			ipBuilder.append(", $invocation.data."+p.getName());
		}
		StringBuilder activatorBuilder = new StringBuilder(
				"function("+pBuilder+") {\r\n"+		
				"	var $invocation = $createInvocation($parentInvocations);\r\n" + 
				"	$invocation.path = \""+path+"\";\r\n");
		if (parameters.isEmpty()) {
			activatorBuilder.append(
				"if (arguments.length>0) {\r\n" + 
				"	$invocation.args = arguments;\r\n" + 
				"}\r\n");
		} else {
			activatorBuilder.append("$invocation.data = {\r\n");
			activatorBuilder.append(dataBuilder);
			activatorBuilder.append("};\r\n");
		}
		
		StringBuilder valueBuilder = new StringBuilder();
		String cachedValueHolder = "this"; //.$component.$outputs."+outputId;
		switch (aCaching) {
		case GETTER:
			valueBuilder.append("if (!"+cachedValueHolder+".hasOwnProperty('$cachedValue')) { "+cachedValueHolder+".$cachedValue = this."+target+"($invocation); }\r\n");			
			valueBuilder.append("return this.$cachedValue;\r\n");
			break;
		case NONE:
			String targetExpr = "this."+target;
						
			if (OutputType.NEXT_TICK.equals(dependencyInfo.getOutputType())) {
				targetExpr = "$nextTick("+targetExpr+", this)";
			} else if (OutputType.DELAY.equals(dependencyInfo.getOutputType())) {
				targetExpr = "$delay("+targetExpr+", this, this.$period.bind($invocation"+ipBuilder+"))";
			} else if (OutputType.TIMEOUT.equals(dependencyInfo.getOutputType())) {
				targetExpr = "$timeout("+targetExpr+", this, this.$period.bind($invocation"+ipBuilder+"))";
			} else if (OutputType.INTERVAL.equals(dependencyInfo.getOutputType())) {
				targetExpr = "$schedule("+targetExpr+", this, this.$period.bind($invocation"+ipBuilder+"))";
			} 
			
			valueBuilder.append("return "+targetExpr+"($invocation);\r\n");
			break;
		case SETTER:
			valueBuilder.append("delete "+cachedValueHolder+".$cachedValue;\r\n");			
			valueBuilder.append("return this."+target+"($invocation);\r\n");
			break;		
		}
		
		if (isBlank(condition)) {
			activatorBuilder.append(valueBuilder);
		} else {
			activatorBuilder.append("if ("+condition+") {\r\n");			
			activatorBuilder.append(valueBuilder);
			activatorBuilder.append("}\r\n");			
		}
		
		activatorBuilder.append("}.bind(this)");
		String ret = activatorBuilder.toString();
		
		for (int idx = parameters.size()-1; idx>=0; --idx) {
			if (parameters.get(idx).isToken()) {
				ret = "$tokenize("+ret+", "+idx+")";
			}
		}		
		
		return ret;
	}
	
	protected static Parameter createParameter(String parameterName) {
		Parameter parameter = JsFactory.eINSTANCE.createParameter();
		parameter.setName(parameterName);
		return parameter;
	}
	
	protected static Fragment createFragment(String code) {
		Fragment fragment = ExecFactory.eINSTANCE.createFragment();
		fragment.setCode(code);
		return fragment;
	}
	
	protected static String absolutePath(String path) {
		return path==null ? "$ajsComponent" : "$ajsComponent."+path;
	}

	protected static Initializer createInputEntry(
			org.nasdanika.amur.it.js.exec.Component cmp, 
			org.nasdanika.amur.it.js.exec.Component key, 
			DependencyInfo value,
			boolean handleErrors) {
		if (DependencyRole.PROPERTY.equals(value.getRole())) {
			return createPropertyInputEntry(cmp, key, value, handleErrors);
		}
		return createFunctionInputEntry(cmp, key, value, handleErrors);
	}
	
	protected static Initializer createFunctionInputEntry(
			org.nasdanika.amur.it.js.exec.Component cmp, 
			org.nasdanika.amur.it.js.exec.Component key, 
			DependencyInfo value, 
			boolean handleErrors) {
		
		Hash inputHash = ExecFactory.eINSTANCE.createHash();
		inputHash.setComment(key.getComment());
		
		inputHash.getEntries().put("$stopDeferred", createFragment("$promiseProvider.defer()"));
		
		Function onStop = ExecFactory.eINSTANCE.createFunction();
		onStop.getParameters().add(createParameter("$stopInvocation"));
		onStop.setBody("if (this.$source && this.$source.$handler) { delete this.$source.$handler; }\r\n return $stopInvocation;\r\n");
		
		inputHash.getEntries().put("$onStop", onStop);
		
		Function start = ExecFactory.eINSTANCE.createFunction();
		start.getParameters().add(createParameter("$source"));
		start.getParameters().add(createParameter("$startInvocation"));
		inputHash.getEntries().put("$start", start);
		StringBuilder startBuilder = new StringBuilder();
		startBuilder.append("this.$source = $source;\r\n");
		
		startBuilder.append("if (typeof this.$handler == 'function') {\r\n"+
				"	$source.$handler = this.$handler.bind(this.$component);\r\n" +
				"}\r\n"+
				"if (typeof this.$period == 'function') {\r\n"+
				"	$source.$period = this.$period;\r\n" +
				"}\r\n"+
				"$source.$stop = function($stopInvocation) { \r\n" +
//				"    console.log(\"Stopping input "+value.getName()+"/"+label(key)+" in "+label(cmp)+" \");\r\n" +
				"    this.$stopDeferred.resolve($stopInvocation); \r\n" + 
				"    return this."+(value.getOpposite().getGuard() ? "$component.$stopPromise" : "$stopDeferred.promise")+";\r\n" + 
				"}.bind(this);\r\n" +
				"return this.$component.$doStart($startInvocation);\r\n");
		
		start.setBody(startBuilder.toString());
				
		// --- Input Handler ---
		if (value.getCode().containsKey(DependencyInfo.HANDLER_KEY)) {		
			StringBuilder pBuilder = new StringBuilder();
			StringBuilder ipBuilder = new StringBuilder();
			StringBuilder cnBuilder = new StringBuilder();
			for (Parameter p: value.getParameters()) {
				if (pBuilder.length()>0) {
					pBuilder.append(", ");
					ipBuilder.append(", ");
					cnBuilder.append(", ");
				}
				pBuilder.append(p.getName());
				cnBuilder.append("\""+p.getName()+"\"");
				// Cloning
				switch (p.getCloning()) {
				case DEEP:
					ipBuilder.append("$clone($invocation.data."+p.getName()+", true)");
					break;
				case NONE:
					ipBuilder.append("$invocation.data."+p.getName());
					break;
				case SHALLOW:
					ipBuilder.append("$clone($invocation.data."+p.getName()+", false)");
					break;
				default:
					throw new IllegalStateException("Unexpected cloning type: "+p.getCloning());
				}
			}
							
			StringBuilder handlerBuilder = new StringBuilder();
			handlerBuilder.append(
				"$invocation.started = new Date();\r\n" + 
				"try {\r\n"); 

			if (Join.NONE.equals(value.getJoinType())) {						
				handlerBuilder.append("	return function("+pBuilder+") {\r\n");
			
				if (handleErrors) {
					handlerBuilder.append("try {\r\n");
				}
				
				handlerBuilder.append(value.getCode().get("handler"));
	
				handlerBuilder.append(System.lineSeparator()); 
				
				if (handleErrors) {
					handlerBuilder.append(
						"		} catch (e) {\r\n" + 
						"			return this.$handleError(e);\r\n" + 
						"		}\r\n");
				}
				
				handlerBuilder.append("}.");
				
				if (value.getParameters().isEmpty()) {
					handlerBuilder.append("apply(this.$createContext("+inputName(value.getName())+", [$invocation]), $invocation.args);\r\n");
				} else {
					handlerBuilder.append("call(this.$createContext("+inputName(value.getName())+", [$invocation]), "+ipBuilder+");\r\n");
				}
			} else {	
				org.nasdanika.amur.Component joinFork = cmp.getCreator() instanceof AbstractNode ? ((AbstractNode) cmp.getCreator()).getJoinFork() : null;
				String joinCollectorsContainer;
				String joinCollectorsKey;
				if (joinFork==null || cmp.getCreator()!=null && joinFork == cmp.getCreator().getOwner()) { 
					// Flow scope join 
					joinCollectorsContainer = "this.$join";
					joinCollectorsKey = "\"$collectors\"";
				} else {
					// Invocation scope join
					joinCollectorsContainer="$resolveInvocationJoinCollectors($invocation, this.$inputs."+value.getId()+".$joinPaths)";
					joinCollectorsKey = "\""+absolutePath(cmp.getPath())+"\"";
				}
				
				handlerBuilder.append("return [$join(\""+StringEscapeUtils.escapeEcmaScript(value.getName())+"\", $invocation, $getJoinCollectors("+joinCollectorsContainer+", "+joinCollectorsKey+", ["+cnBuilder+"]), function(collected) { var ia = []; for (var i in collected) { ia.push(collected[i] && collected[i].data); } return this.$createContext("+inputName(value.getName())+", ia); }.bind(this), this.$join.$conditions, this.$join.$handler, "+Join.OUTER.equals(value.getJoinType())+", $joinArgsMapper)];");				
			}
			
			handlerBuilder.append(			
				"} catch (e) {\r\n" + 
				"	console.error(e);\r\n" + 
				"	throw e;\r\n" + 
				"} finally {\r\n" + 
				"	$invocation.finished = new Date();\r\n" + 
				"}\r\n");
			
			Function handlerFunction = ExecFactory.eINSTANCE.createFunction();
			handlerFunction.getParameters().add(createParameter("$invocation"));
			handlerFunction.setBody(handlerBuilder.toString());
			inputHash.getEntries().put("$handler", handlerFunction);
		}
								
		// --- Period ---
		// Pre-invocation args for now, maybe switch to invocation.
		if (value.getCode().containsKey(DependencyInfo.PERIOD_KEY)) {		
			Function periodFunction = ExecFactory.eINSTANCE.createFunction();
			for (Parameter p: value.getParameters()) {
				periodFunction.getParameters().add(createParameter(p.getName()));
			}
			
			periodFunction.setBody(value.getCode().get(DependencyInfo.PERIOD_KEY));
			inputHash.getEntries().put("$period", periodFunction);
		}
		
		return inputHash;
	}
	
	private static String inputName(String name) {
		if (isBlank(name)) {
			return "undefined";
		}
		return "\""+StringEscapeUtils.escapeEcmaScript(name)+"\"";
	}
	
	protected static Initializer createPropertyInputEntry(
			org.nasdanika.amur.it.js.exec.Component cmp,
			org.nasdanika.amur.it.js.exec.Component key, 
			DependencyInfo value,
			boolean handleErrors) {
		Hash inputHash = ExecFactory.eINSTANCE.createHash();
		inputHash.setComment(key.getComment());
		
		inputHash.getEntries().put("$stopDeferred", createFragment("$promiseProvider.defer()"));
		
		Function onStop = ExecFactory.eINSTANCE.createFunction();
		onStop.getParameters().add(createParameter("$stopInvocation"));
		onStop.setBody("if (this.$source) { if ( this.$source.$get) { delete this.$source.$get; }\r\nif (this.$source.$set) { delete this.$source.$set; } }\r\nreturn $stopInvocation;\r\n");			
		
		inputHash.getEntries().put("$onStop", onStop);
		
		Function start = ExecFactory.eINSTANCE.createFunction();
		start.getParameters().add(createParameter("$source"));
		start.getParameters().add(createParameter("$startInvocation"));
		inputHash.getEntries().put("$start", start);
		StringBuilder startBuilder = new StringBuilder();
		startBuilder.append("this.$source = $source;\r\n");
		startBuilder.append("if (typeof this.$get == 'function') {\r\n"+
				"	$source.$get = this.$get.bind(this.$component);\r\n" +
				"}\r\n"+
				"if (typeof this.$set == 'function') {\r\n"+
				"	$source.$set = this.$set.bind(this.$component);\r\n" +
				"}\r\n"+
				"$source.$stop = function($stopInvocation) { \r\n" + 
				"    this.$stopDeferred.resolve($stopInvocation); \r\n" + 
				"    return this."+(value.getOpposite().getGuard() ? "$component.$stopPromise" : "$stopDeferred.promise")+";\r\n" + 
				"}.bind(this);\r\n" +
				"return this.$component.$doStart($startInvocation);\r\n");
		
		start.setBody(startBuilder.toString());
				
		// --- Getter ---
		if (value.getCode().containsKey("get")) {					
			StringBuilder getBuilder = new StringBuilder();
			getBuilder.append(
				"$invocation.started = new Date();\r\n" + 
				"try {\r\n" + 
				"	return function() {\r\n"); 
				
			if (handleErrors) {
				getBuilder.append("try {\r\n");
			}
			
			getBuilder.append(value.getCode().get("get"));
			getBuilder.append(System.lineSeparator());
			if (handleErrors) {
				getBuilder.append(
				"		} catch (e) {\r\n" + 
				"			return this.$handleError(e);\r\n" + 
				"		}\r\n");
			}
			
			getBuilder.append("}.");
			
			getBuilder.append("apply(this.$createContext("+inputName(value.getName())+", [$invocation]), $invocation.args);\r\n");
			
			getBuilder.append(			
				"} finally {\r\n" + 
				"	$invocation.finished = new Date();\r\n" + 
				"}\r\n");
			
			Function getFunction = ExecFactory.eINSTANCE.createFunction();
			getFunction.getParameters().add(createParameter("$invocation"));
			getFunction.setBody(getBuilder.toString());
			inputHash.getEntries().put("$get", getFunction);
		}
								
		// --- Setter ---
		if (value.getCode().containsKey("set")) {		
			StringBuilder setBuilder = new StringBuilder();
			setBuilder.append(
				"$invocation.started = new Date();\r\n" + 
				"try {\r\n" + 
				"	return function(newValue) {\r\n");
			
			if (handleErrors) { 
				setBuilder.append("try {\r\n");
			}
			
			setBuilder.append(value.getCode().get("set"));
			setBuilder.append(System.lineSeparator());
			if (handleErrors) {
				setBuilder.append(
					"		} catch (e) {\r\n" + 
					"			return this.$handleError(e);\r\n" + 
					"		}\r\n");
			}
			setBuilder.append("}.");
			
			setBuilder.append("call(this.$createContext("+inputName(value.getName())+", [$invocation]), $invocation.data.newValue);\r\n");
			
			setBuilder.append(			
				"} finally {\r\n" + 
				"	$invocation.finished = new Date();\r\n" + 
				"}\r\n");
			
			Function setFunction = ExecFactory.eINSTANCE.createFunction();
			setFunction.getParameters().add(createParameter("$invocation"));
			setFunction.setBody(setBuilder.toString());
			inputHash.getEntries().put("$set", setFunction);
		}
		
		return inputHash;
	}
	
	@Override
	public boolean tracesTo(org.nasdanika.amur.Component target) {
		return tracesTo(this.getOwner(), target, new HashSet<org.nasdanika.amur.Component>());
	}

	protected static boolean tracesTo(org.nasdanika.amur.Component source, org.nasdanika.amur.Component target, Set<org.nasdanika.amur.Component> traversed) {
		if (traversed.add(source)) {
			if (source.equals(target)) {
				return true;
			}
			if (source instanceof AbstractConnectionSource) {
				for (Connection conn: ((AbstractConnectionSource) source).getOutboundConnections()) {
					if (tracesTo(conn, target, traversed)) {
						return true;
					}
				}
			} else if (source instanceof Connection) {
				if (tracesTo((org.nasdanika.amur.Component) ((Connection) source).getTarget(), target, traversed)) {
					return true;
				}				
			}			
		}
		return false;
	}
	
	@Override
	public DependencyInfo createOutputDependencyInfo(
			Component output, 
			Map<Object, Object> context,
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception {
		return ExecFactory.eINSTANCE.createDependencyInfo();
	}

	@Override
	public DependencyInfo createInputDependencyInfo(
			Component input,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		
		DependencyInfo ret = ExecFactory.eINSTANCE.createDependencyInfo();
		if (input instanceof Reference) {
			ret.setRole(DependencyRole.PROPERTY);			
		} else {
			ret.setRole(DependencyRole.FUNCTION);
			for (Parameter p: genInputParameters(input, context, monitor, status)) {
				ret.getParameters().add(EcoreUtil.copy(p));
			}
		}
		return ret;
	}
	
	protected DependencyRole adjustInputDependencyRole(DependencyRole initialRole) {
		return initialRole;
	}
	
	/**
	 * Configures input dependency info by setting code, parameters, etc.
	 * This base implementation wires inbound references with target properties to component properties.
	 * @param input
	 * @param di
	 * @param component
	 * @param resourceURI
	 * @param context
	 * @param monitor
	 * @param status
	 */
	protected void configureInputDependencyInfo(
			Component input, 
			DependencyInfo di,
			org.nasdanika.amur.it.js.exec.Component targetComponent,
			URI resourceURI,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		
		di.setRole(adjustInputDependencyRole(di.getRole()));
	}
	
	protected DependencyRole adjustOutputDependencyRole(DependencyRole initialRole) {
		return initialRole;
	}
	
	/**
	 * Configures output dependency info.
	 * @param output
	 * @param di
	 * @param component
	 * @param resourceURI
	 * @param context
	 * @param monitor
	 * @param status
	 */
	protected void configureOutputDependencyInfo(
			Component output, 
			DependencyInfo di,
			org.nasdanika.amur.it.js.exec.Component sourceComponent, 
			URI resourceURI,
			Map<Object, Object> context, 
			IProgressMonitor monitor,
			MultiStatus status) throws Exception {
		
		di.setRole(adjustOutputDependencyRole(di.getRole()));
	}
	
	@Override
	public String getSkeletonString(MultiStatus status) throws Exception {
		return null;
	}
	
	@Override
	public IContainer getResourceContainer() throws Exception {
		return getScriptContainer();
	}
	
	@Override
	public IContainer getScriptContainer() throws Exception {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public IFigure getTooltip() {
		return null;
	}
	
	// --- Completions helper methods ---
	
	/**
	 * Adds component completions from declarations and start.
	 * @param parameters
	 * @param completions
	 */
	protected void addComponentCompletions(List<Completion> collector) {
		// TODO - parse declarations and start, analyze entries and their types - function or value.
	}
	
	protected static org.nasdanika.common.autocomplete.ShorthandCompletion prototypeAccess = new org.nasdanika.common.autocomplete.ShorthandCompletion() {
		
		@Override
		public String getSummary() {
			return "Access component";
		}
		
		@Override
		public String getShortDescription() {
			return "Object.getPrototypeOf(this) - Access to component";
		}
		
		@Override
		public Icon getIcon() {
			return IconResource.Up.getIcon();
		}
		
		@Override
		public String getReplacementText() {
			return "Object.getPrototypeOf(this)";
		}
		
		@Override
		public String getInputText() {
			return "proto";
		}
		
		@Override
		public int getRelevance() {
			return 0;
		}

		@Override
		public String getId() {			
			return null;
		}

		@Override
		public String getType() {
			// TODO 
			return null;
		}
	};
	
	protected static VariableCompletion inputName = new VariableCompletion() {
		
		@Override
		public String getSummary() {
			return "Activating input name";
		}
		
		@Override
		public String getShortDescription() {
			return "Input name";
		}
		
		@Override
		public Icon getIcon() {
			return IconResource.Right.getIcon();
		}
		
		@Override
		public String getName() {
			return "$inputName";
		}
		
		@Override
		public int getRelevance() {
			return 10;
		}

		@Override
		public String getId() {
			return "$inputName";
		}

		@Override
		public String getType() {
			return "String";
		}
	};
	
	protected static org.nasdanika.common.autocomplete.Parameter emitEventParameter = new org.nasdanika.common.autocomplete.Parameter() {

		@Override
		public String getName() {
			return "event";
		}

		@Override
		public String getType() {
			return null;
		}

		@Override
		public String getDescription() {
			return "Event to emit.";
		}
		
	};
	
	protected static FunctionCompletion emitEvent = new FunctionCompletion() {
		
		@Override
		public String getSummary() {
			return "Emits argument(s) as events";
		}
		
		@Override
		public String getShortDescription() {
			return "Emits events";
		}
		
		@Override
		public Icon getIcon() {
			return IconResource.Event.getIcon();
		}
		
		@Override
		public String getType() {
			return null;
		}
		
		@Override
		public String getName() {
			return "$emitEvent";
		}
		
		@Override
		public String getReturnValueDescription() {
			return null;
		}
		
		@Override
		public List<org.nasdanika.common.autocomplete.Parameter> getParameters() {
			return Collections.singletonList(emitEventParameter);
		}
		
		@Override
		public int getRelevance() {
			return 10;
		}

		@Override
		public String getId() {
			return "$emitEvent";
		}
	};
	
	protected void addStandardCompletions(List<Completion> collector) {
		collector.add(prototypeAccess);
//		collector.add(inputName);
//		collector.add(emitEvent);
	}

	/**
	 * Wraps parameters into completions.
	 * @param parameters
	 * @param completions
	 */
	protected static void parametersToCompletions(List<Parameter> parameters, List<Completion> completions) {
		for (Parameter p: parameters) {
			completions.add(asCompletion(p));
		}
	}

	protected static Completion asCompletion(final Parameter p) {
		return new VariableCompletion() {
			
			@Override
			public String getSummary() {
				StringBuilder ret = new StringBuilder("<html>Parameter <B>"+p.getName()+"</B>");
				if (!isBlank(p.getDescription())) {
					ret.append("<HR>");
					ret.append(p.getDescription());
				}
				ret.append("</html>");
				return ret.toString();
			}
			
			@Override
			public String getShortDescription() {
				return isBlank(p.getDescription()) ? null : p.getDescription();
			}
			
			@Override
			public Icon getIcon() {
				return IconResource.Parameter.getIcon();
			}
			
			@Override
			public String getName() {
				return p.getName();
			}
			
			@Override
			public int getRelevance() {
				return 10;
			}

			@Override
			public String getId() {
				return p.getName();
			}

			@Override
			public String getType() {
				return null; // TODO
			}
		};
	}

	protected static org.nasdanika.common.autocomplete.Parameter asCompletionParameter(final Parameter p) {
		return new org.nasdanika.common.autocomplete.Parameter() {
			
			@Override
			public String getType() {
				return null; // TODO 
			}
			
			@Override
			public String getName() {
				return p.getName();
			}
			
			@Override
			public String getDescription() {
				return p.getDescription();
			}
		};
	}
	
	/**
	 * Creates a copy of source parameter list preserving parameter names and types
	 * and clearing token and clone flags. Use it for pass-through components to avoid double cloning/tokenization.
	 * @param params
	 * @return
	 */
	protected static List<Parameter> stripTokenizeAndClone(List<Parameter> params) {
		List<Parameter> ret = new ArrayList<>();
		for (Parameter p: params) {
			Parameter cp = EcoreUtil.copy(p);
			cp.setToken(false);
			cp.setCloning(Cloning.NONE);
			ret.add(cp);
		}
		return ret;
	}

	// --- Completions ---
	
	protected static boolean matchSourcePort(String port, org.nasdanika.amur.it.js.Connection conn) {
		if (isBlank(port)) {
			return isBlank(conn.getSourcePort());
		}
		
		return port.equals(conn.getSourcePort());
	}
	
	/**
	 * Context completions - outputs, events, publish, dispatch - for a given port.
	 * @param completions
	 */
	protected void addContextCompletions(String feature, String port, List<VariableCompletion> completions) {
		completions.add(inputName);
		completions.add(emitEvent);		
	}
	
	protected void addCodeCompletions(String feature, List<Completion> completions) {
		addComponentCompletions(completions);
		addStandardCompletions(completions);		
	}

	@Override
	public CompletionProviderFactory getCompletionProviderFactory(String feature) {
		
		final List<Completion> codeCompletions = new ArrayList<>();
		final List<VariableCompletion> contextCompletions = new ArrayList<>();
		
		addContextCompletions(feature, null, contextCompletions);
		addCodeCompletions(feature, codeCompletions);
		
		final String contextScopeId = getOwner().getId()+".context";
		
		final Scope contextScope = new Scope() {
			
			@Override
			public String getName() {
				return getOwner().getName();
			}
			
			@Override
			public String getId() {
				return contextScopeId;
			}
			
			@Override
			public Collection<VariableCompletion> getCompletions() {
				return contextCompletions;
			}
			
			@Override
			public List<Scope> getBaseScopes() {
				return Collections.emptyList();
			}
		};
		
		return new CompletionProviderFactory() {
					
			@Override
			public CompletionProvider getCompletionProvider(Object context) {
				if ("text/javascript".equals(context)) {
					return new CompletionProvider() {
						
						@Override
						public Scope resolveScope(String scopeId) {
							return contextScopeId.equals(scopeId) ? contextScope : null;
						}
						
						@Override
						public Scope getScope() {
							return contextScope;
						}
						
						@Override
						public Collection<Completion> getCompletions() {
							return codeCompletions;
						}
					};
				}
				return null;
			}
		};
	}
	
	/**
	 * Used to normalize connection source and target names.
	 * @param str
	 * @return
	 */
	public static String trimLeadingDot(String str) {
		return str!=null && str.startsWith(".") ? str.substring(1) : str;
	}
		
	public static boolean isValidJavaIdentifier(String str) {
		if (isBlank(str)) {
			return false;
		}
		if (!Character.isJavaIdentifierStart(str.charAt(0))) {
			return false;
		}
		for (int i=1; i<str.length(); ++i) {
			if (!Character.isJavaIdentifierPart(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static String toValidJavaIdentifier(String str) {
		if (isBlank(str)) {
			return "_";
		}
		StringBuilder ret = new StringBuilder(str);
		if (!Character.isJavaIdentifierStart(ret.charAt(0))) {
			ret.insert(0, "_");
		}
		for (int i=1; i<ret.length(); ++i) {
			if (!Character.isJavaIdentifierPart(str.charAt(i))) {
				ret.replace(i, i+1, "_");
			}
		}
		return ret.toString();
	}
	
	public static String dereference(String propertyName) {		
		if (isValidJavaIdentifier(propertyName)) {
			return "."+propertyName;
		}
		return "[\""+StringEscapeUtils.escapeEcmaScript(propertyName)+"\"]";
	}
	
	@Override
	public boolean acceptOwner(org.nasdanika.amur.Component owner) {
		return true;
	}
	
	/**
	 * Resolves path relative to this object resource.
	 * @param path
	 * @return
	 */
	protected IResource resolveRelativePath(String path) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		Resource eResource = eResource();
		if (eResource!=null) {
			URI resourceUri = eResource.getURI();
			if (resourceUri!=null) {
				resourceUri = URI.createURI(".").resolve(resourceUri); // To avoid ../ in front of resources.
				if (resourceUri.isFile()) {
					String fileString = resourceUri.toFileString();
					if (fileString!=null) {
						return root.findMember(new Path(fileString).append(path));
					}
				} else if (resourceUri.isPlatform()) {
					String platformString = resourceUri.toPlatformString(true);
					if (platformString!=null) {
						return root.findMember(new Path(platformString).append(path));
					}
				}
			}
		}
		return root.findMember(new Path(path));
	}	
	
	
} //ComponentImpl
