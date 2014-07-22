/**
 */
package org.nasdanika.amur.it.js.exec;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.nasdanika.amur.it.js.Join;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.ReferenceScope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getWeightCoeff <em>Weight Coeff</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getOrder <em>Order</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getRole <em>Role</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getOutputType <em>Output Type</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getCode <em>Code</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getReferenceScope <em>Reference Scope</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getJoinType <em>Join Type</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getJoinConditions <em>Join Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getDependencyInfo()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface DependencyInfo extends CDOObject {
	
	int CALL_WEIGHT_COEFF = 3;
	int REFERENCE_WEIGHT_COEFF = 10;
	String HANDLER_KEY = "handler";
	String CONDITION_KEY = "condition";
	String PERIOD_KEY = "period";
	String ACCESSOR_KEY = "get";
	String MUTATOR_KEY = "set";
	String TARGET_KEY = "target";

	/**
	 * Returns the value of the '<em><b>Weight Coeff</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight Coeff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight Coeff</em>' attribute.
	 * @see #setWeightCoeff(int)
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getDependencyInfo_WeightCoeff()
	 * @model default="1"
	 * @generated
	 */
	int getWeightCoeff();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getWeightCoeff <em>Weight Coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight Coeff</em>' attribute.
	 * @see #getWeightCoeff()
	 * @generated
	 */
	void setWeightCoeff(int value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' attribute.
	 * @see #setGuard(Boolean)
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getDependencyInfo_Guard()
	 * @model
	 * @generated
	 */
	Boolean getGuard();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getGuard <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' attribute.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.amur.it.js.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getDependencyInfo_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' map.
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getDependencyInfo_Code()
	 * @model mapType="org.nasdanika.amur.it.js.exec.CodeEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getCode();

	/**
	 * Returns the value of the '<em><b>Reference Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.amur.it.js.ReferenceScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Scope</em>' attribute.
	 * @see org.nasdanika.amur.it.js.ReferenceScope
	 * @see #setReferenceScope(ReferenceScope)
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getDependencyInfo_ReferenceScope()
	 * @model
	 * @generated
	 */
	ReferenceScope getReferenceScope();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getReferenceScope <em>Reference Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Scope</em>' attribute.
	 * @see org.nasdanika.amur.it.js.ReferenceScope
	 * @see #getReferenceScope()
	 * @generated
	 */
	void setReferenceScope(ReferenceScope value);

	/**
	 * Returns the value of the '<em><b>Join Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.amur.it.js.Join}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Type</em>' attribute.
	 * @see org.nasdanika.amur.it.js.Join
	 * @see #setJoinType(Join)
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getDependencyInfo_JoinType()
	 * @model
	 * @generated
	 */
	Join getJoinType();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getJoinType <em>Join Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Type</em>' attribute.
	 * @see org.nasdanika.amur.it.js.Join
	 * @see #getJoinType()
	 * @generated
	 */
	void setJoinType(Join value);

	/**
	 * Returns the value of the '<em><b>Join Conditions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Conditions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Conditions</em>' attribute list.
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getDependencyInfo_JoinConditions()
	 * @model
	 * @generated
	 */
	EList<String> getJoinConditions();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getDependencyInfo_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getDependencyInfo_Order()
	 * @model default="-1"
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.amur.it.js.exec.DependencyRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see org.nasdanika.amur.it.js.exec.DependencyRole
	 * @see #setRole(DependencyRole)
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getDependencyInfo_Role()
	 * @model default="None"
	 * @generated
	 */
	DependencyRole getRole();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see org.nasdanika.amur.it.js.exec.DependencyRole
	 * @see #getRole()
	 * @generated
	 */
	void setRole(DependencyRole value);

	/**
	 * Returns the value of the '<em><b>Output Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.amur.it.js.exec.OutputType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Type</em>' attribute.
	 * @see org.nasdanika.amur.it.js.exec.OutputType
	 * @see #setOutputType(OutputType)
	 * @see org.nasdanika.amur.it.js.exec.ExecPackage#getDependencyInfo_OutputType()
	 * @model
	 * @generated
	 */
	OutputType getOutputType();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.it.js.exec.DependencyInfo#getOutputType <em>Output Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Type</em>' attribute.
	 * @see org.nasdanika.amur.it.js.exec.OutputType
	 * @see #getOutputType()
	 * @generated
	 */
	void setOutputType(OutputType value);

	/**
	 * @return Opposite dependency info.
	 */
	DependencyInfo getOpposite();
	
	/**
	 * @return Short id unique within inputs/outputs. 
	 */
	String getId();

} // DependencyInfo
