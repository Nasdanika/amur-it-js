/**
 */
package org.nasdanika.amur.it.js;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Event Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.amur.it.js.JsPackage#getAbstractEventListener()
 * @model abstract="true"
 * @generated
 */
public interface AbstractEventListener extends AbstractNode {
		
	String genCondition(Map<Object, Object> context, IProgressMonitor monitor, MultiStatus status) throws Exception;
	
} // AbstractEventListener
