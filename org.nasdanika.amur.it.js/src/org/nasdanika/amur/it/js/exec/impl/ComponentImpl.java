/**
 */
package org.nasdanika.amur.it.js.exec.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.it.js.exec.Component;
import org.nasdanika.amur.it.js.exec.DependencyInfo;
import org.nasdanika.amur.it.js.exec.ExecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.ComponentImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.ComponentImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.ComponentImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.ComponentImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.ComponentImpl#getStartLevel <em>Start Level</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.ComponentImpl#isForceable <em>Forceable</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.ComponentImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.ComponentImpl#getStartRoot <em>Start Root</em>}</li>
 *   <li>{@link org.nasdanika.amur.it.js.exec.impl.ComponentImpl#getStartTerminal <em>Start Terminal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends HashImpl implements Component {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * Creates proxy component.
	 * @param proxyURI
	 */
	public ComponentImpl(URI resourceURI, String id) {
		this();
		eSetProxyURI(URI.createURI("#"+id).resolve(resourceURI));
		setId(id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eGet(ExecPackage.Literals.COMPONENT__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(ExecPackage.Literals.COMPONENT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public EMap<Component, DependencyInfo> getInputs() {
		return new SafeEMap((EMap<Component, DependencyInfo>)eGet(ExecPackage.Literals.COMPONENT__INPUTS, true));
	}
	
	private static class SafeEMap implements EMap<Component, DependencyInfo> {
		
		private EMap<Component, DependencyInfo> master;

		SafeEMap(EMap<Component, DependencyInfo> master) {
			this.master = master;
		}

		public void move(int newPosition, Entry<Component, DependencyInfo> object) {
			master.move(newPosition, object);
		}

		public Entry<Component, DependencyInfo> move(int newPosition, int oldPosition) {
			return master.move(newPosition, oldPosition);
		}

		public DependencyInfo get(Object key) {
			// Resolves hash problems.
			for (Entry<Component, DependencyInfo> e: master.entrySet()) {
				if (key!=null && key.equals(e.getKey())) {
					return e.getValue();
				}
			}
			return master.get(key);
		}

		public DependencyInfo put(Component key, DependencyInfo value) {
			String id = key.getId();
			if (id==null || id.trim().length()==0) {
				throw new IllegalStateException("Key with blank id");
			}
			// Resolves hash problems.
			for (Entry<Component, DependencyInfo> e: master.entrySet()) {
				String eId = e.getKey().getId();
				if (eId.equals(id)) {
					return master.put(e.getKey(), value);
				}
			}
			return master.put(key, value);
		}

		public void putAll(
				Map<? extends Component, ? extends DependencyInfo> map) {
			master.putAll(map);
		}

		public void putAll(
				EMap<? extends Component, ? extends DependencyInfo> map) {
			master.putAll(map);
		}

		public int indexOfKey(Object key) {
			return master.indexOfKey(key);
		}

		public boolean containsKey(Object key) {
			return master.containsKey(key);
		}

		public boolean containsValue(Object value) {
			return master.containsValue(value);
		}

		public DependencyInfo removeKey(Object key) {
			return master.removeKey(key);
		}

		public Map<Component, DependencyInfo> map() {
			return master.map();
		}

		public Set<Entry<Component, DependencyInfo>> entrySet() {
			return master.entrySet();
		}

		public Set<Component> keySet() {
			return master.keySet();
		}

		public Collection<DependencyInfo> values() {
			return master.values();
		}

		public int size() {
			return master.size();
		}

		public boolean isEmpty() {
			return master.isEmpty();
		}

		public boolean contains(Object o) {
			return master.contains(o);
		}

		public Iterator<Entry<Component, DependencyInfo>> iterator() {
			return master.iterator();
		}

		public Object[] toArray() {
			return master.toArray();
		}

		public <T> T[] toArray(T[] a) {
			return master.toArray(a);
		}

		public boolean add(Entry<Component, DependencyInfo> e) {
			return master.add(e);
		}

		public boolean remove(Object o) {
			return master.remove(o);
		}

		public boolean containsAll(Collection<?> c) {
			return master.containsAll(c);
		}

		public boolean addAll(
				Collection<? extends Entry<Component, DependencyInfo>> c) {
			return master.addAll(c);
		}

		public boolean addAll(int index,
				Collection<? extends Entry<Component, DependencyInfo>> c) {
			return master.addAll(index, c);
		}

		public boolean removeAll(Collection<?> c) {
			return master.removeAll(c);
		}

		public boolean retainAll(Collection<?> c) {
			return master.retainAll(c);
		}

		public void clear() {
			master.clear();
		}

		public boolean equals(Object o) {
			return master.equals(o);
		}

		public int hashCode() {
			return master.hashCode();
		}

		public Entry<Component, DependencyInfo> get(int index) {
			return master.get(index);
		}

		public Entry<Component, DependencyInfo> set(int index,
				Entry<Component, DependencyInfo> element) {
			return master.set(index, element);
		}

		public void add(int index, Entry<Component, DependencyInfo> element) {
			master.add(index, element);
		}

		public Entry<Component, DependencyInfo> remove(int index) {
			return master.remove(index);
		}

		public int indexOf(Object o) {
			return master.indexOf(o);
		}

		public int lastIndexOf(Object o) {
			return master.lastIndexOf(o);
		}

		public ListIterator<Entry<Component, DependencyInfo>> listIterator() {
			return master.listIterator();
		}

		public ListIterator<Entry<Component, DependencyInfo>> listIterator(
				int index) {
			return master.listIterator(index);
		}

		public List<Entry<Component, DependencyInfo>> subList(int fromIndex,
				int toIndex) {
			return master.subList(fromIndex, toIndex);
		}				
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public EMap<Component, DependencyInfo> getOutputs() {
		return new SafeEMap((EMap<Component, DependencyInfo>)eGet(ExecPackage.Literals.COMPONENT__OUTPUTS, true));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getWeight() {
		return (Integer)eGet(ExecPackage.Literals.COMPONENT__WEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(Integer newWeight) {
		eSet(ExecPackage.Literals.COMPONENT__WEIGHT, newWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartLevel() {
		return (Integer)eGet(ExecPackage.Literals.COMPONENT__START_LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartLevel(int newStartLevel) {
		eSet(ExecPackage.Literals.COMPONENT__START_LEVEL, newStartLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForceable() {
		return (Boolean)eGet(ExecPackage.Literals.COMPONENT__FORCEABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceable(boolean newForceable) {
		eSet(ExecPackage.Literals.COMPONENT__FORCEABLE, newForceable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.amur.it.js.Component getCreator() {
		return (org.nasdanika.amur.it.js.Component)eGet(ExecPackage.Literals.COMPONENT__CREATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(org.nasdanika.amur.it.js.Component newCreator) {
		eSet(ExecPackage.Literals.COMPONENT__CREATOR, newCreator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getStartRoot() {
		return (Boolean)eGet(ExecPackage.Literals.COMPONENT__START_ROOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartRoot(Boolean newStartRoot) {
		eSet(ExecPackage.Literals.COMPONENT__START_ROOT, newStartRoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getStartTerminal() {
		return (Boolean)eGet(ExecPackage.Literals.COMPONENT__START_TERMINAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTerminal(Boolean newStartTerminal) {
		eSet(ExecPackage.Literals.COMPONENT__START_TERMINAL, newStartTerminal);
	}

	@Override
	public void populate(Map<Object, Object> context, IProgressMonitor monitor, MultiStatus status) throws Exception {
		if (getCreator()!=null) {
			getCreator().populateExecutionComponent(this, context, monitor, status);
		}		
	}

	@Override
	public boolean tracesTo(Component c) {
		return tracesTo(this, c, new HashSet<Component>());
	}

	protected static boolean tracesTo(Component source, Component c, Set<Component> traversed) {
		if (traversed.add(source)) {
			for (Component o: source.getOutputs().keySet()) {
				if (c.equals(o)) {
					return true;
				}
				if (tracesTo(o, c, traversed)) {
					return true;
				}
			}
		}
		return false;
	}	
	
} //ComponentImpl
