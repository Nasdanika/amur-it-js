/**
 */
package org.nasdanika.amur.it.js.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.ui.celleditor.ExtendedComboBoxCellEditor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Control;
import org.nasdanika.amur.it.js.AbstractNode;
import org.nasdanika.amur.it.js.AbstractTransition;
import org.nasdanika.amur.it.js.Join;
import org.nasdanika.amur.it.js.JoinEntry;
import org.nasdanika.amur.it.js.JsPackage;
import org.nasdanika.amur.it.js.provider.ui.ComponentsOrderDialog;
import org.nasdanika.amur.it.js.provider.ui.JoinConditionsDialog;

import org.nasdanika.amur.AbstractConnectionSource;
import org.nasdanika.amur.AbstractConnectionTarget;
import org.nasdanika.amur.Component;
import org.nasdanika.amur.Composite;
import org.nasdanika.amur.Connection;
import org.nasdanika.amur.ErrorHandler;
import org.nasdanika.amur.ErrorTransition;
import org.nasdanika.amur.Transition;
import org.nasdanika.common.Activator;
import org.nasdanika.common.CustomItemPropertyDescriptor;
import org.nasdanika.common.DialogItemPropertyDescriptorImpl;
import org.nasdanika.common.ResolvingItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.nasdanika.amur.it.js.AbstractNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractNodeItemProvider
	extends ComponentItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNodeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors.get(object) == null) {
			super.getPropertyDescriptors(object);

			addInboundTransitionsOrderPropertyDescriptor(object);
			addOutboundTransitionsOrderPropertyDescriptor(object);
			addErrorTransitionsOrderPropertyDescriptor(object);
			addErrorHandlersOrderPropertyDescriptor(object);
			addJoinConditionsPropertyDescriptor(object);
			addJoinForkPropertyDescriptor(object);
		}
		return itemPropertyDescriptors.get(object);
	}

	/**
	 * This adds a property descriptor for the Inbound Transitions Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addInboundTransitionsOrderPropertyDescriptor(final Object object) {
		if (((AbstractNode) object).getOwner() instanceof AbstractConnectionTarget) {
			ItemPropertyDescriptor ipd = createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractNode_inboundTransitionsOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractNode_inboundTransitionsOrder_feature", "_UI_AbstractNode_type"),
				 JsPackage.Literals.ABSTRACT_NODE__INBOUND_TRANSITIONS_ORDER,
				 true,
				 false,
				 true,
				 Activator.getImageDescriptor("icons/fugue/icons/edit-list-order.png"),
				 getString("_UI_JoinPropertyCategory"),
				 null);
			
			itemPropertyDescriptors.get(object).add
				(new DialogItemPropertyDescriptorImpl(ipd, null) {
	
					@Override
					public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
						List<Component> allInboundTransitions = new ArrayList<>();
						AbstractNode node = (AbstractNode) object;
						for (Connection c: ((AbstractConnectionTarget) node.getOwner()).getInboundConnections()) {
							if (c instanceof Transition
									&& c.getImplementationType() instanceof AbstractTransition
									&& !Join.NONE.equals(((AbstractTransition) c.getImplementationType()).getJoinType())) {
								allInboundTransitions.add(c);
							}
						}
						
						@SuppressWarnings("unchecked")
						ComponentsOrderDialog d = new ComponentsOrderDialog(																					
								cellEditorWindow.getShell(),
								"Inbound transitions order",
								(EList<Component>) initialValue,
								allInboundTransitions,
								adapterFactory,
								false);
						
						return d.open()==Window.OK ? d.getValue() : null;
					}
					
				});
		}
	}

	/**
	 * This adds a property descriptor for the Outbound Transitions Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addOutboundTransitionsOrderPropertyDescriptor(final Object object) {
		if (((AbstractNode) object).getOwner() instanceof AbstractConnectionSource) {
			ItemPropertyDescriptor ipd = createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractNode_outboundTransitionsOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractNode_outboundTransitionsOrder_feature", "_UI_AbstractNode_type"),
				 JsPackage.Literals.ABSTRACT_NODE__OUTBOUND_TRANSITIONS_ORDER,
				 true,
				 false,
				 true,
				 Activator.getImageDescriptor("icons/fugue/icons/edit-list-order.png"),
				 getString("_UI_GeneralPropertyCategory"),
				 null);
			itemPropertyDescriptors.get(object).add
				(new DialogItemPropertyDescriptorImpl(ipd, null) {
	
					@Override
					public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
						List<Component> allOutboundTransitions = new ArrayList<>();
						AbstractNode node = (AbstractNode) object;
						for (Connection c: ((AbstractConnectionSource) node.getOwner()).getOutboundConnections()) {
							if (c instanceof Transition 
									&& c.getImplementationType() instanceof AbstractTransition
									&& ((AbstractTransition) c.getImplementationType()).isDispatch()) {
								allOutboundTransitions.add(c);
							}
						}
						
						@SuppressWarnings("unchecked")
						ComponentsOrderDialog d = new ComponentsOrderDialog(																					
								cellEditorWindow.getShell(),
								"Outbound transitions order",
								(EList<Component>) initialValue,
								allOutboundTransitions,
								adapterFactory,
								false);
						
						return d.open()==Window.OK ? d.getValue() : null;
					}
					
				});
		}
	}

	/**
	 * This adds a property descriptor for the Error Transitions Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addErrorTransitionsOrderPropertyDescriptor(final Object object) {
		if (((AbstractNode) object).getOwner() instanceof AbstractConnectionSource) {
			ItemPropertyDescriptor ipd = createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractNode_errorTransitionsOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractNode_errorTransitionsOrder_feature", "_UI_AbstractNode_type"),
				 JsPackage.Literals.ABSTRACT_NODE__ERROR_TRANSITIONS_ORDER,
				 true,
				 false,
				 true,
				 Activator.getImageDescriptor("icons/fugue/icons/edit-list-order.png"),
				 getString("_UI_GeneralPropertyCategory"),
				 null);
			itemPropertyDescriptors.get(object).add
				(new DialogItemPropertyDescriptorImpl(ipd, null) {
	
					@Override
					public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
						List<Component> allOutboundTransitions = new ArrayList<>();
						AbstractNode node = (AbstractNode) object;
						for (Connection c: ((AbstractConnectionSource) node.getOwner()).getOutboundConnections()) {
							if (c instanceof ErrorTransition) {
								allOutboundTransitions.add(c);
							}
						}
						
						@SuppressWarnings("unchecked")
						ComponentsOrderDialog d = new ComponentsOrderDialog(																					
								cellEditorWindow.getShell(),
								"Error transitions order",
								(EList<Component>) initialValue,
								allOutboundTransitions,
								adapterFactory,
								false);
						
						return d.open()==Window.OK ? d.getValue() : null;
					}
					
				});
		}
	}

	/**
	 * This adds a property descriptor for the Error Handlers Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addErrorHandlersOrderPropertyDescriptor(final Object object) {
		if (((AbstractNode) object).getOwner() instanceof Composite) {
			ItemPropertyDescriptor ipd = createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractNode_errorHandlersOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractNode_errorHandlersOrder_feature", "_UI_AbstractNode_type"),
				 JsPackage.Literals.ABSTRACT_NODE__ERROR_HANDLERS_ORDER,
				 true,
				 false,
				 true,
				 Activator.getImageDescriptor("icons/fugue/icons/edit-list-order.png"),
				 getString("_UI_GeneralPropertyCategory"),
				 null);
			itemPropertyDescriptors.get(object).add
				(new DialogItemPropertyDescriptorImpl(ipd, null) {

					@Override
					public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
						List<Component> errorHandlers = new ArrayList<>();
						AbstractNode cmp = (AbstractNode) object;
						for (Component c: ((Composite) cmp.getOwner()).getChildren()) {
							if (c instanceof ErrorHandler) {
								errorHandlers.add(c);
							}
						}
						
						@SuppressWarnings("unchecked")
						ComponentsOrderDialog d = new ComponentsOrderDialog(																					
								cellEditorWindow.getShell(),
								"Error handlers order",
								(EList<Component>) initialValue,
								errorHandlers,
								adapterFactory,
								false);
						
						return d.open()==Window.OK ? d.getValue() : null;
					}
					
				});
		}
	}

	/**
	 * This adds a property descriptor for the Join Conditions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addJoinConditionsPropertyDescriptor(final Object object) {
		if (((AbstractNode) object).getOwner() instanceof AbstractConnectionTarget) {
			ItemPropertyDescriptor ipd = createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractNode_joinConditions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractNode_joinConditions_feature", "_UI_AbstractNode_type"),
				 JsPackage.Literals.ABSTRACT_NODE__JOIN_CONDITIONS,
				 true,
				 false,
				 true,
				 Activator.getImageDescriptor("icons/led/funnel.png"),
				 getString("_UI_JoinPropertyCategory"),
				 null);
			itemPropertyDescriptors.get(object).add
				(new DialogItemPropertyDescriptorImpl(ipd, null) { // TODO
					
					@Override
					public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
						JoinConditionsDialog d = new JoinConditionsDialog(
								cellEditorWindow.getShell(),
								"Join conditions",
								((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), 
								((org.nasdanika.amur.it.js.Component) object).getCompletionProviderFactory("joinCondition"),							
								(List<JoinEntry>) initialValue);
						
						return d.open()==Window.OK ? d.getValue() : null;
					}
				});
		}
	}
	
	static class JoinForkComboBoxPropertyDescriptor extends ResolvingItemPropertyDescriptor implements CustomItemPropertyDescriptor {

		private Object source;

		JoinForkComboBoxPropertyDescriptor(IItemPropertyDescriptor master, Object source) {
			super(master);
			this.source = source;
		}
		
		@Override
		public CellEditor createPropertyEditor(org.eclipse.swt.widgets.Composite composite,	ILabelProvider editLabelProvider, final Object object) {			
			return new ExtendedComboBoxCellEditor(composite, forksList(object), editLabelProvider, false);	
		}

		private List<Object> forksList(Object object) {
			List<Object> ret = new ArrayList<>();
			ret.add(((AbstractNode) object).getOwner());
			
			List<Connection> joinConnections = new ArrayList<>();
			
			if (((AbstractNode) object).getOwner() instanceof AbstractConnectionTarget) {
				for (Connection ic: ((AbstractConnectionTarget) ((AbstractNode) object).getOwner()).getInboundConnections()) {
					if (ic.getImplementationType() instanceof AbstractTransition && !Join.NONE.equals(((AbstractTransition) ic.getImplementationType()).getJoinType())) {
						joinConnections.add(ic);
					}
				}
				
				Map<AbstractConnectionSource, Set<Connection>> forkMap = new LinkedHashMap<>();
				
				for (Connection jc: joinConnections) {
					Set<Connection> outbound = new HashSet<>();
					outbound.add(jc);
					trace(joinConnections, forkMap, jc.getSource(), outbound);
				}
				
				for (Entry<AbstractConnectionSource, Set<Connection>> fme: forkMap.entrySet()) {
					if (fme.getValue().containsAll(joinConnections)) {
						ret.add(fme.getKey());
					}
				}
			}
			
			return ret;
		}
				
		private static void trace(
				List<Connection> joinConnections, 
				Map<AbstractConnectionSource, Set<Connection>> forkMap,
				AbstractConnectionSource source,
				Set<Connection> outbound) {
			Set<Connection> c = forkMap.get(source);
			if (c==null) {
				c = new HashSet<>();
				forkMap.put(source, c);
			}
			
			// We added a connection, but connection set doesn't contain all join connections - not a fork, and is a connection target.
			if (c.addAll(outbound) && !c.containsAll(joinConnections) && source instanceof AbstractConnectionTarget) {
				for (Connection ic: ((AbstractConnectionTarget) source).getInboundConnections()) {
					trace(joinConnections, forkMap, ic.getSource(), c);
				}
			}			
		}

		@Override
		public ILabelProvider getLabelProvider(final ILabelProvider superLabelProvider) {
			return new ILabelProvider() {

				@Override
				public void addListener(ILabelProviderListener listener) {
					superLabelProvider.addListener(listener);					
				}

				@Override
				public void dispose() {
					superLabelProvider.dispose();
				}

				@Override
				public boolean isLabelProperty(Object element, String property) {
					return superLabelProvider.isLabelProperty(element, property);
				}

				@Override
				public void removeListener(ILabelProviderListener listener) {
					superLabelProvider.removeListener(listener);					
				}

				@Override
				public Image getImage(Object element) {					
					return superLabelProvider.getImage(element);
				}

				@Override
				public String getText(Object element) {					
					return element instanceof Component && ((Component) element).getImplementationType() == source ? "(None)" : superLabelProvider.getText(element);
				}
				
			};
		}

	}	
	

	/**
	 * This adds a property descriptor for the Join Fork feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addJoinForkPropertyDescriptor(Object object) {
		if (((AbstractNode) object).getOwner() instanceof AbstractConnectionTarget) {
			ItemPropertyDescriptor ipd = createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractNode_joinFork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractNode_joinFork_feature", "_UI_AbstractNode_type"),
				 JsPackage.Literals.ABSTRACT_NODE__JOIN_FORK,
				 true,
				 false,
				 true,
				 Activator.getImageDescriptor("icons/fugue/icons/arrow-split.png"),
				 getString("_UI_JoinPropertyCategory"),
				 null);
			
			itemPropertyDescriptors.get(object).add(new JoinForkComboBoxPropertyDescriptor(ipd, object));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractNode)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractNode_type") :
			getString("_UI_AbstractNode_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AbstractNode.class)) {
			case JsPackage.ABSTRACT_NODE__INBOUND_TRANSITIONS_ORDER:
			case JsPackage.ABSTRACT_NODE__JOIN_CONDITIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
