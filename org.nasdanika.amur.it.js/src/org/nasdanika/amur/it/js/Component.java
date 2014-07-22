/**
 */
package org.nasdanika.amur.it.js;

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.URI;
import org.nasdanika.amur.it.js.exec.DependencyInfo;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;

import org.nasdanika.amur.ImplementationType;
import org.nasdanika.amur.lang.Source;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.Component#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.Component#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.Component#getStop <em>Stop</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.it.js.JsPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends ImplementationType {
	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference.
	 * @see #setDeclarations(Source)
	 * @see org.nasdanika.amur.it.js.JsPackage#getComponent_Declarations()
	 * @model containment="true"
	 * @generated
	 */
	Source getDeclarations();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.Component#getDeclarations <em>Declarations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declarations</em>' containment reference.
	 * @see #getDeclarations()
	 * @generated
	 */
	void setDeclarations(Source value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Source)
	 * @see org.nasdanika.amur.it.js.JsPackage#getComponent_Start()
	 * @model containment="true"
	 * @generated
	 */
	Source getStart();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.Component#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Source value);

	/**
	 * Returns the value of the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop</em>' containment reference.
	 * @see #setStop(Source)
	 * @see org.nasdanika.amur.it.js.JsPackage#getComponent_Stop()
	 * @model containment="true"
	 * @generated
	 */
	Source getStop();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.Component#getStop <em>Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop</em>' containment reference.
	 * @see #getStop()
	 * @generated
	 */
	void setStop(Source value);
	
	/**
	 * Creates execution component.
	 * @param resourceURI
	 * @param context
	 * @param monitor
	 * @param status
	 * @return
	 * @throws Exception
	 */
	org.nasdanika.amur.it.js.exec.Component createExecutionComponent(URI resourceURI, Map<Object, Object> context, IProgressMonitor monitor, MultiStatus status) throws Exception;
	
	/**
	 * Populates execution component after it has been mounted into the execution model so proxies can be resolved.
	 * @param executionComponent
	 * @param context
	 * @param monitor
	 * @param status
	 * @throws Exception
	 */
	void populateExecutionComponent(org.nasdanika.amur.it.js.exec.Component executionComponent, Map<Object, Object> context, IProgressMonitor monitor, MultiStatus status) throws Exception;

	/**
	 * Creates a execution component proxy.
	 * @param resourceURI
	 * @param port
	 * @return
	 */
	org.nasdanika.amur.it.js.exec.Component createExecutionComponentProxy(URI resourceURI, String port);
	
	/**
	 * Variable name constructed from component name and ID.
	 * @return
	 */
	String varName();
	
	/**
	 * @param target
	 * @return true if it is possible to navigate from the owner of this implementation type to the target through
	 * connections. 
	 */
	boolean tracesTo(org.nasdanika.amur.Component target);

	/**
	 * Creates dependency info to put to outputs as value.
	 * @return
	 */
	DependencyInfo createInputDependencyInfo(Component input, Map<Object, Object> context, IProgressMonitor monitor, MultiStatus status) throws Exception;
	
	/**
	 * Creates dependency info to put to inputs as value.
	 * @return
	 */
	DependencyInfo createOutputDependencyInfo(Component output, Map<Object, Object> context, IProgressMonitor monitor, MultiStatus status) throws Exception;	

	List<Parameter> genInputParameters(Component input, Map<Object, Object> context, IProgressMonitor monitor, MultiStatus status) throws Exception;
		
	/**
	 * Generates handler for inbound connection - call or (error) transition.
	 * @param inboundConnection
	 * @return
	 */
	String genHandler(Component source, Map<Object, Object> context, IProgressMonitor monitor, MultiStatus status) throws Exception;
	
	/**
	 * Generates accessor and mutator for inbound reference.
	 * @param inboundReference
	 * @return Two element array with accessor at index 0 and mutator at index 1.
	 */
	String[] genAccessorAndMutator(
			Component input, 
			String propertyName, 
			Map<Object, Object> context, 
			IProgressMonitor monitor, 
			MultiStatus status) throws Exception;
	
	// --- Methods for generation ---
	
	/**
	 * @return Container to place generated script(s) to.
	 */
	IContainer getScriptContainer() throws Exception;
	
	/**
	 * @return Container to place generated resources to.
	 */
	IContainer getResourceContainer() throws Exception;
	
	/**
	 * @return Skeleton string or null. Skeleton string can contain $COMPONENT_FACTORY$ and $COMPONENT_NAME$ tokens.
	 */
	String getSkeletonString(MultiStatus status) throws Exception;	

	CompletionProviderFactory getCompletionProviderFactory(String feature);
		
} // Component
