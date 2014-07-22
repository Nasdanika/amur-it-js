/**
 */
package org.nasdanika.amur.it.js;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.Connection#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.Connection#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.Connection#getTargetPort <em>Target Port</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.Connection#getTargetName <em>Target Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.it.js.JsPackage#getConnection()
 * @model abstract="true"
 * @generated
 */
public interface Connection extends Component {
	
	/**
	 * Returns the value of the '<em><b>Source Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Port</em>' attribute.
	 * @see #setSourcePort(String)
	 * @see org.nasdanika.amur.it.js.JsPackage#getConnection_SourcePort()
	 * @model
	 * @generated
	 */
	String getSourcePort();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.Connection#getSourcePort <em>Source Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Port</em>' attribute.
	 * @see #getSourcePort()
	 * @generated
	 */
	void setSourcePort(String value);

	/**
	 * Returns the value of the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Name</em>' attribute.
	 * @see #setSourceName(String)
	 * @see org.nasdanika.amur.it.js.JsPackage#getConnection_SourceName()
	 * @model
	 * @generated
	 */
	String getSourceName();
		
	String genSourceName();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.Connection#getSourceName <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Name</em>' attribute.
	 * @see #getSourceName()
	 * @generated
	 */
	void setSourceName(String value);

	/**
	 * Returns the value of the '<em><b>Target Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Port</em>' attribute.
	 * @see #setTargetPort(String)
	 * @see org.nasdanika.amur.it.js.JsPackage#getConnection_TargetPort()
	 * @model
	 * @generated
	 */
	String getTargetPort();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.Connection#getTargetPort <em>Target Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Port</em>' attribute.
	 * @see #getTargetPort()
	 * @generated
	 */
	void setTargetPort(String value);

	/**
	 * Returns the value of the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Name</em>' attribute.
	 * @see #setTargetName(String)
	 * @see org.nasdanika.amur.it.js.JsPackage#getConnection_TargetName()
	 * @model
	 * @generated
	 */
	String getTargetName();
	
	String genTargetName();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.Connection#getTargetName <em>Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Name</em>' attribute.
	 * @see #getTargetName()
	 * @generated
	 */
	void setTargetName(String value);

	interface PortInfo {
		String getId();
		String getName();
	}
		
//	EList<Parameter> getTargetParameters();	

//	/**
//	 * Creates a start handler proxy. The handler is transparently resolved after execution model is fully constructed.
//	 * @param resourceURI
//	 * @return
//	 */
//	org.nasdanika.amur.it.js.exec.Handler createStartHandlerProxy(URI resourceURI);
				
} // Connection
