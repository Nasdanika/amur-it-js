/**
 */
package org.nasdanika.amur.it.js.exec;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.exec.Component#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.Component#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.Component#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.Component#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.Component#getStartLevel <em>Start Level</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.Component#isForceable <em>Forceable</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.Component#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.Component#getStartRoot <em>Start Root</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.Component#getStartTerminal <em>Start Terminal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends Hash {
	
	String CHILDREN_KEY = "$children";
	String HANDLER_KEY = "$handler";
	String ACCESSOR_KEY = "$get";
	String MUTATOR_KEY = "$set";
	
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getComponent_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.exec.Component#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' map.
	 * The key is of type {@link org.nasdanika.amur.it.js.exec.Component},
	 * and the value is of type {@link org.nasdanika.amur.it.js.exec.DependencyInfo},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' map.
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getComponent_Inputs()
	 * @model mapType="org.nasdanika.amur.it.js.exec.DependencyEntry<org.nasdanika.amur.it.js.exec.Component, org.nasdanika.amur.it.js.exec.DependencyInfo>"
	 * @generated
	 */
	EMap<Component, DependencyInfo> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' map.
	 * The key is of type {@link org.nasdanika.amur.it.js.exec.Component},
	 * and the value is of type {@link org.nasdanika.amur.it.js.exec.DependencyInfo},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' map.
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getComponent_Outputs()
	 * @model mapType="org.nasdanika.amur.it.js.exec.DependencyEntry<org.nasdanika.amur.it.js.exec.Component, org.nasdanika.amur.it.js.exec.DependencyInfo>"
	 * @generated
	 */
	EMap<Component, DependencyInfo> getOutputs();

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(Integer)
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getComponent_Weight()
	 * @model
	 * @generated
	 */
	Integer getWeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.exec.Component#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(Integer value);

	/**
	 * Returns the value of the '<em><b>Start Level</b></em>' attribute.
	 * The default value is <code>"-2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Level</em>' attribute.
	 * @see #setStartLevel(int)
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getComponent_StartLevel()
	 * @model default="-2"
	 * @generated
	 */
	int getStartLevel();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.exec.Component#getStartLevel <em>Start Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Level</em>' attribute.
	 * @see #getStartLevel()
	 * @generated
	 */
	void setStartLevel(int value);

	/**
	 * Returns the value of the '<em><b>Forceable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forceable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forceable</em>' attribute.
	 * @see #setForceable(boolean)
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getComponent_Forceable()
	 * @model default="true"
	 * @generated
	 */
	boolean isForceable();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.exec.Component#isForceable <em>Forceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forceable</em>' attribute.
	 * @see #isForceable()
	 * @generated
	 */
	void setForceable(boolean value);

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' reference.
	 * @see #setCreator(org.nasdanika.amur.it.js.Component)
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getComponent_Creator()
	 * @model transient="true"
	 * @generated
	 */
	org.nasdanika.amur.it.js.Component getCreator();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.exec.Component#getCreator <em>Creator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' reference.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(org.nasdanika.amur.it.js.Component value);

	/**
	 * Returns the value of the '<em><b>Start Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Root</em>' attribute.
	 * @see #setStartRoot(Boolean)
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getComponent_StartRoot()
	 * @model
	 * @generated
	 */
	Boolean getStartRoot();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.exec.Component#getStartRoot <em>Start Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Root</em>' attribute.
	 * @see #getStartRoot()
	 * @generated
	 */
	void setStartRoot(Boolean value);

	/**
	 * Returns the value of the '<em><b>Start Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Terminal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Terminal</em>' attribute.
	 * @see #setStartTerminal(Boolean)
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getComponent_StartTerminal()
	 * @model
	 * @generated
	 */
	Boolean getStartTerminal();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.exec.Component#getStartTerminal <em>Start Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Terminal</em>' attribute.
	 * @see #getStartTerminal()
	 * @generated
	 */
	void setStartTerminal(Boolean value);

	void populate(Map<Object, Object> context, IProgressMonitor monitor, MultiStatus status) throws Exception;
	
	/**
	 * @param c
	 * @return true if navigation of output links from this component eventually reaches c component. 
	 */
	boolean tracesTo(Component c);

} // Component
