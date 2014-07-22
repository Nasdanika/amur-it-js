/**
 */
package org.nasdanika.amur.it.js.foundation.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Control;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.PropertyInputPort;
import org.nasdanika.amur.it.js.provider.AbstractNodeItemProvider;

import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.lang.provider.ui.SourceDialog;
import org.nasdanika.amur.provider.ComposeImage;
import org.nasdanika.common.Activator;
import org.nasdanika.common.DialogItemPropertyDescriptorImpl;

/**
 * This is the item provider adapter for a {@link org.nasdanika.amur.it.js.foundation.PropertyInputPort} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyInputPortItemProvider
	extends AbstractNodeItemProvider
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
	public PropertyInputPortItemProvider(AdapterFactory adapterFactory) {
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

			addAccessorPropertyDescriptor(object);
			addMutatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors.get(object);
	}

	/**
	 * This adds a property descriptor for the Accessor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addAccessorPropertyDescriptor(final Object object) {
		ItemPropertyDescriptor ipd = createItemPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_PropertyInputPort_accessor_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_PropertyInputPort_accessor_feature", "_UI_PropertyInputPort_type"),
			 FoundationPackage.Literals.PROPERTY_INPUT_PORT__ACCESSOR,
			 true,
			 false,
			 false,
			 Activator.getImageDescriptor("icons/fat-cow-farm-fresh-web-icons/16x16/source_code.png"),
			 getString("_UI_PropertyPropertyCategory"),
			 null);
		itemPropertyDescriptors.get(object).add
			(new DialogItemPropertyDescriptorImpl(ipd, null) {

				@Override
				public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
					SourceDialog d = new SourceDialog(
							cellEditorWindow.getShell(),
							"Accessor",
							(Source) initialValue,
							((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
							((org.nasdanika.amur.it.js.Component) object).getCompletionProviderFactory("accessor"));
					
					return d.open()==Window.OK ? d.getValue() : null;
				}
				
			});
	}

	/**
	 * This adds a property descriptor for the Mutator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addMutatorPropertyDescriptor(final Object object) {
		ItemPropertyDescriptor ipd = createItemPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_PropertyInputPort_mutator_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_PropertyInputPort_mutator_feature", "_UI_PropertyInputPort_type"),
			 FoundationPackage.Literals.PROPERTY_INPUT_PORT__MUTATOR,
			 true,
			 false,
			 false,
			 Activator.getImageDescriptor("icons/fat-cow-farm-fresh-web-icons/16x16/source_code.png"),
			 getString("_UI_PropertyPropertyCategory"),
			 null);
		itemPropertyDescriptors.get(object).add
			(new DialogItemPropertyDescriptorImpl(ipd, null) {

				@Override
				public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
					SourceDialog d = new SourceDialog(
							cellEditorWindow.getShell(),
							"Mutator",
							(Source) initialValue,
							((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
							((org.nasdanika.amur.it.js.Component) object).getCompletionProviderFactory("mutator"));
					
					return d.open()==Window.OK ? d.getValue() : null;
				}
				
			});
	}

	/**
	 * This returns PropertyInputPort.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	@ComposeImage
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PropertyInputPort"));
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
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((PropertyInputPort)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PropertyInputPort_type") : label;
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

		switch (notification.getFeatureID(PropertyInputPort.class)) {
			case FoundationPackage.PROPERTY_INPUT_PORT__ACCESSOR:
			case FoundationPackage.PROPERTY_INPUT_PORT__MUTATOR:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FoundationEditPlugin.INSTANCE;
	}

}
