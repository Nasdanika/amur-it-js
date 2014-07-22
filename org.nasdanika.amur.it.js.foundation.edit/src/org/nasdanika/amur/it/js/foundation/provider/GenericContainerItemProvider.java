/**
 */
package org.nasdanika.amur.it.js.foundation.provider;


import java.net.MalformedURLException;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.jface.resource.ImageDescriptor;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.GenericContainer;
import org.nasdanika.amur.it.js.provider.AbstractNodeItemProvider;

import org.nasdanika.common.ElementTreeDialogItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.nasdanika.amur.it.js.foundation.GenericContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericContainerItemProvider
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
	public GenericContainerItemProvider(AdapterFactory adapterFactory) {
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
		if (!itemPropertyDescriptors.containsKey(object)) {
			super.getPropertyDescriptors(object);

			addIconPropertyDescriptor(object);
		}
		return itemPropertyDescriptors.get(object);
	}

	/**
	 * This adds a property descriptor for the Icon feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addIconPropertyDescriptor(Object object) {
		itemPropertyDescriptors.get(object).add
			(new ElementTreeDialogItemPropertyDescriptor(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenericContainer_icon_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenericContainer_icon_feature", "_UI_GenericContainer_type"),
				 FoundationPackage.Literals.GENERIC_CONTAINER__ICON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GeneralPropertyCategory"),
				 null), null, (EObject) object));
	}

	/**
	 * This returns GenericContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		GenericContainer gContainer = (GenericContainer) object;
		if (gContainer.getIcon()!=null && gContainer.getIcon().trim().length()!=0) {
			IResource imageResource = find(gContainer, gContainer.getIcon());
			if (imageResource!=null && imageResource.exists()) {
				try {
					return ImageDescriptor.createFromURL(imageResource.getLocationURI().toURL());
				} catch (MalformedURLException e) {
					e.printStackTrace();
				} 
			}
		}
		return null; //overlayImage(object, getResourceLocator().getImage("full/obj16/GenericContainer"));
	}
	
	private IResource find(EObject obj, String path) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		Resource eResource = obj.eResource();
		if (eResource!=null) {
			URI resourceUri = eResource.getURI();
			if (resourceUri.isFile()) {
				String fileString = resourceUri.toFileString();
				if (fileString!=null) {
					return root.findMember(new Path(fileString).append(path));
				}
			} else if (resourceUri.isPlatform()) {
				String platformString = resourceUri.toPlatformString(true);
				if (platformString!=null) {
					return root.findMember(new Path(platformString).append(path));
				}
			}				
		}
		return root.findMember(new Path(path));
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
		String label = ((GenericContainer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GenericContainer_type") :
			getString("_UI_GenericContainer_type") + " " + label;
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

		switch (notification.getFeatureID(GenericContainer.class)) {
			case FoundationPackage.GENERIC_CONTAINER__ICON:
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
