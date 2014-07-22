/**
 */
package org.nasdanika.amur.it.js.exec.impl;

import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.exec.ExecPackage;
import org.nasdanika.amur.it.js.exec.Hash;
import org.nasdanika.amur.it.js.exec.Initializer;
import org.nasdanika.amur.it.js.exec.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hash</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.HashImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.HashImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HashImpl extends InitializerImpl implements Hash {

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HashImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecPackage.Literals.HASH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getJavaScript() {
		StringBuilder eList = new StringBuilder();
		for (Entry<String, Initializer> e: getEntries()) {
			if (e.getValue() instanceof Hash && ((Hash) e.getValue()).isEmpty()) {
				continue; // Do not output empty hashes. If empty hash is needed use fragment.
			} else if (INLINE_KEY.equals(e.getKey())) {
				if (eList.length()>0) {
					eList.append(",");
					eList.append(System.lineSeparator());
				}
				if (e.getValue().getComment()!=null) {
					eList.append("/* "+e.getValue().getComment()+" */"+System.lineSeparator());
				}
				eList.append(System.lineSeparator());
				eList.append(e.getValue().getJavaScript());
				eList.append(System.lineSeparator());
			} else if (e.getValue() instanceof Property) {
				Property prop = (Property) e.getValue();
				if (!isBlank(prop.getAccessor())) {
					if (eList.length()>0) {
						eList.append(",");
						eList.append(System.lineSeparator());
					}
					if (!isBlank(prop.getComment())) {
						eList.append("/* "+prop.getComment()+" */"+System.lineSeparator());
					}
					eList.append("get "+e.getKey()+"() {"+prop.getAccessor()+"}");
				}
				if (!isBlank(prop.getMutator())) {
					if (eList.length()>0) {
						eList.append(",");
						eList.append(System.lineSeparator());
					}
					if (isBlank(prop.getAccessor()) && !isBlank(prop.getComment())) {
						eList.append("/* "+e.getValue().getComment()+" */"+System.lineSeparator());
					}
					eList.append("set "+e.getKey()+"("+prop.getMutatorParameterName()+") {"+prop.getMutator()+"}");
				}				
			} else {
				if (eList.length()>0) {
					eList.append(",");
					eList.append(System.lineSeparator());
				}
				if (e.getValue().getComment()!=null) {
					eList.append("/* "+e.getValue().getComment()+" */"+System.lineSeparator());
				}
				eList.append(e.getKey()+" : "+e.getValue().getJavaScript());
			}
		}
		return "{"+System.lineSeparator()+eList+System.lineSeparator()+"}";
	}
	
	@Override
	public boolean isEmpty() {
		for (Entry<String, Initializer> e: getEntries()) {
			if (e.getValue() instanceof Hash && ((Hash) e.getValue()).isEmpty()) {
				continue;
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, Initializer> getEntries() {
		return (EMap<String, Initializer>)eGet(ExecPackage.Literals.HASH__ENTRIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getPath() {
		if (ExecPackage.eINSTANCE.getHashEntry_Value().equals(eContainingFeature())) {
			String containerHashPath = eContainer().eContainer() instanceof Hash ? ((Hash) eContainer().eContainer()).getPath() : null;
			@SuppressWarnings("unchecked")
			String key = ((Map.Entry<String, Initializer>) eContainer()).getKey();
			return containerHashPath == null ? key : containerHashPath+"."+key;
		}
		
		return null;
	}

} //HashImpl
