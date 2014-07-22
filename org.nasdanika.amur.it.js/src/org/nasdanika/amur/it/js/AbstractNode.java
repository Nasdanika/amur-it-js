/**
 */
package org.nasdanika.amur.it.js;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.EList;
import org.nasdanika.amur.it.js.Connection.PortInfo;

import org.nasdanika.amur.Connection;
import org.nasdanika.amur.ErrorHandler;
import org.nasdanika.amur.ErrorTransition;
import org.nasdanika.amur.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.AbstractNode#getInboundTransitionsOrder <em>Inbound Transitions Order</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.AbstractNode#getOutboundTransitionsOrder <em>Outbound Transitions Order</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.AbstractNode#getErrorTransitionsOrder <em>Error Transitions Order</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.AbstractNode#getErrorHandlersOrder <em>Error Handlers Order</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.AbstractNode#getJoinConditions <em>Join Conditions</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.AbstractNode#getJoinFork <em>Join Fork</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.it.js.JsPackage#getAbstractNode()
 * @model abstract="true"
 * @generated
 */
public interface AbstractNode extends Component {
	/**
	 * Returns the value of the '<em><b>Inbound Transitions Order</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.amur.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inbound Transitions Order</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbound Transitions Order</em>' reference list.
	 * @see org.nasdanika.amur.it.js.JsPackage#getAbstractNode_InboundTransitionsOrder()
	 * @model
	 * @generated
	 */
	EList<Connection> getInboundTransitionsOrder();

	/**
	 * Returns the value of the '<em><b>Outbound Transitions Order</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.amur.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outbound Transitions Order</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outbound Transitions Order</em>' reference list.
	 * @see org.nasdanika.amur.it.js.JsPackage#getAbstractNode_OutboundTransitionsOrder()
	 * @model
	 * @generated
	 */
	EList<Transition> getOutboundTransitionsOrder();

	/**
	 * Returns the value of the '<em><b>Error Transitions Order</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.amur.ErrorTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Transitions Order</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Transitions Order</em>' reference list.
	 * @see org.nasdanika.amur.it.js.JsPackage#getAbstractNode_ErrorTransitionsOrder()
	 * @model
	 * @generated
	 */
	EList<ErrorTransition> getErrorTransitionsOrder();
	
	// --- For connection sources ---

	/**
	 * @param connection
	 * @return List of output ports names to display in connection source port drop-down.
	 */
	PortInfo[] getOutputPorts(Connection connection);
	
	// --- For connection targets ---

	/**
	 * @param connection
	 * @return List of input ports names to display in connection target port drop-down.
	 */
	PortInfo[] getInputPorts(Connection connection);
	
	/**
	 * Collects error handlers for children. 
	 * @return
	 * @throws Exception 
	 */
	List<AbstractErrorHandler> collectErrorHandlers(Component source, Map<Object, Object> context, IProgressMonitor monitor, MultiStatus status) throws Exception;
	
	/**
	 * Collects event listeners for children.
	 * @return
	 */
	List<AbstractEventListener> collectEventListeners(Component source, Map<Object, Object> context, IProgressMonitor monitor, MultiStatus status) throws Exception;
	
	EList<ErrorHandler> getErrorHandlersOrder();

	/**
	 * Returns the value of the '<em><b>Join Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.amur.it.js.JoinEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Conditions</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Conditions</em>' containment reference list.
	 * @see org.nasdanika.amur.it.js.JsPackage#getAbstractNode_JoinConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<JoinEntry> getJoinConditions();

	/**
	 * Returns the value of the '<em><b>Join Fork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Fork</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Fork</em>' reference.
	 * @see #setJoinFork(org.nasdanika.amur.Component)
	 * @see org.nasdanika.amur.it.js.JsPackage#getAbstractNode_JoinFork()
	 * @model
	 * @generated
	 */
	org.nasdanika.amur.Component getJoinFork();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.AbstractNode#getJoinFork <em>Join Fork</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Fork</em>' reference.
	 * @see #getJoinFork()
	 * @generated
	 */
	void setJoinFork(org.nasdanika.amur.Component value);

} // AbstractNode
