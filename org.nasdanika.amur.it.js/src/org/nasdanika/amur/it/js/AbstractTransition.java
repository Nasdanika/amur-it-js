/**
 */
package org.nasdanika.amur.it.js;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.nasdanika.amur.it.js.exec.OutputType;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.amur.it.js.JsPackage#getAbstractTransition()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTransition extends Connection {
	
	String genCondition(Map<Object, Object> context, IProgressMonitor monitor, MultiStatus status) throws Exception;
	
	OutputType genType(Map<Object, Object> context, IProgressMonitor monitor, MultiStatus status) throws Exception;
	
	String genPeriod(Map<Object, Object> context, IProgressMonitor monitor, MultiStatus status) throws Exception;
	
	boolean isDispatch();
	
	Join getJoinType();
	
	List<Parameter> genOutputParameters(Map<Object, Object> context, IProgressMonitor monitor, MultiStatus status) throws Exception;
		
} // AbstractTransition
