/**
 */
package org.nasdanika.amur.it.js.provider;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.ui.celleditor.ExtendedComboBoxCellEditor;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor.PropertyValueWrapper;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Composite;
import org.nasdanika.amur.it.js.AbstractNode;
import org.nasdanika.amur.it.js.Connection;
import org.nasdanika.amur.it.js.JsPackage;
import org.nasdanika.amur.it.js.Connection.PortInfo;

import org.nasdanika.amur.Component;
import org.nasdanika.amur.ImplementationType;
import org.nasdanika.common.Activator;
import org.nasdanika.common.CustomItemPropertyDescriptor;
import org.nasdanika.common.ResolvingItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.nasdanika.amur.it.js.Connection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectionItemProvider
	extends ComponentItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {		

	static class PortsComboBoxPropertyDescriptor extends ResolvingItemPropertyDescriptor implements CustomItemPropertyDescriptor {

		private boolean forSource;
		
//		private ILabelProvider labelProvider = new LabelProvider() {
//			
//			public String getText(Object element) {
//				for (PortInfo p: portsList(element)) {
//					
//				}
//				return String.valueOf(element);
//			};
//		};

		PortsComboBoxPropertyDescriptor(IItemPropertyDescriptor master, boolean forSource) {
			super(master);
			this.forSource = forSource;
		}
		
		@Override
		public IItemLabelProvider getLabelProvider(final Object obj) {
			final IItemLabelProvider superLabelProvider = super.getLabelProvider(obj);
			return new IItemLabelProvider() {
				
				@Override
				public String getText(Object val) {
					if (val instanceof PortInfo) {
						return ((PortInfo) val).getName();
					} else if (val instanceof String) {
						for (PortInfo p: portsList(obj)) {
							if (p.getId().equals(val)) {
								return p.getName();
							}
						}
					} else if (val instanceof PropertyValueWrapper) {
						return getText(((PropertyValueWrapper) val).getEditableValue(null));
					}
					
					return superLabelProvider.getText(val);
				}
				
				@Override
				public Object getImage(Object object) {
					return superLabelProvider.getImage(object);
				}
			};
		}

		@Override
		public CellEditor createPropertyEditor(Composite composite,	ILabelProvider editLabelProvider, Object object) {
			
			return new ExtendedComboBoxCellEditor(
			        composite,
			        portsList(object),
			        editLabelProvider,
			        true) {
				
				@Override
				public Object doGetValue() {
					Object ret = super.doGetValue();
					return ret==null ? null : ((PortInfo) ret).getId();
				}
				
				@Override
				public void doSetValue(Object value) {
					if (value!=null) {
						for (Object obj: list) {
							if (value.equals(((PortInfo) obj).getId())) {
								super.doSetValue(obj);
								return;
							}
						}
					}
					super.doSetValue(null);
				}
				
			};		
		}

		private List<PortInfo> portsList(Object object) {
			PortInfo[] ret = null;
			
			org.nasdanika.amur.Connection connection = (org.nasdanika.amur.Connection) ((Connection) object).getOwner();
			if (forSource) {
				ImplementationType implementationType = ((Component) connection.getSource()).getImplementationType();
				if (implementationType instanceof AbstractNode) {
					ret = ((AbstractNode) implementationType).getOutputPorts(connection);
				}
			} else {
				ImplementationType implementationType = ((Component) connection.getTarget()).getImplementationType();
				if (implementationType instanceof AbstractNode) {
					ret = ((AbstractNode) implementationType).getInputPorts(connection);
				}
			}
			
			return ret == null ? Collections.<PortInfo>emptyList() : Arrays.asList(ret);
		}
				
		@Override
		public ILabelProvider getLabelProvider(ILabelProvider superLabelProvider) {
			return null;
		}

	}	
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionItemProvider(AdapterFactory adapterFactory) {
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

			addSourcePortPropertyDescriptor(object);
			addTargetPortPropertyDescriptor(object);
			addSourceNamePropertyDescriptor(object);
			addTargetNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors.get(object);
	}

	/**
	 * This adds a property descriptor for the Source Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSourcePortPropertyDescriptor(Object object) {
		ItemPropertyDescriptor ipd = createItemPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_Connection_sourcePort_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_Connection_sourcePort_feature", "_UI_Connection_type"),
			 JsPackage.Literals.CONNECTION__SOURCE_PORT,
			 true,
			 false,
			 false,
			 Activator.getImageDescriptor("icons/fugue/icons/socket.png"),
			 getString("_UI_SourcePropertyCategory"),
			 null);
		itemPropertyDescriptors.get(object).add(new PortsComboBoxPropertyDescriptor(ipd, true));
	}

	/**
	 * This adds a property descriptor for the Source Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSourceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.get(object).add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connection_sourceName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connection_sourceName_feature", "_UI_Connection_type"),
				 JsPackage.Literals.CONNECTION__SOURCE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_SourcePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTargetPortPropertyDescriptor(Object object) {
		ItemPropertyDescriptor ipd = createItemPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_Connection_targetPort_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_Connection_targetPort_feature", "_UI_Connection_type"),
			 JsPackage.Literals.CONNECTION__TARGET_PORT,
			 true,
			 false,
			 false,
			 Activator.getImageDescriptor("icons/fugue/icons/socket.png"),
			 getString("_UI_TargetPropertyCategory"),
			 null);
		itemPropertyDescriptors.get(object).add
			(new PortsComboBoxPropertyDescriptor(ipd, false));
	}

	/**
	 * This adds a property descriptor for the Target Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTargetNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.get(object).add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connection_targetName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connection_targetName_feature", "_UI_Connection_type"),
				 JsPackage.Literals.CONNECTION__TARGET_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_TargetPropertyCategory"),
				 null));
	}

	/**
	 * This returns Connection.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Connection"));
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
		String label = ((Connection)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Connection_type") :
			getString("_UI_Connection_type") + " " + label;
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

		switch (notification.getFeatureID(Connection.class)) {
			case JsPackage.CONNECTION__SOURCE_PORT:
			case JsPackage.CONNECTION__SOURCE_NAME:
			case JsPackage.CONNECTION__TARGET_PORT:
			case JsPackage.CONNECTION__TARGET_NAME:
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
