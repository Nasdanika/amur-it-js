/**
 */
package org.nasdanika.amur.it.js.foundation.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.TopLevelFlow;
import org.nasdanika.amur.it.js.provider.AbstractNodeItemProvider;

import org.nasdanika.common.Activator;
import org.nasdanika.common.ContainerDialogItemPropertyDescriptor;
import org.nasdanika.common.ElementTreeDialogItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.nasdanika.amur.it.js.foundation.TopLevelFlow} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TopLevelFlowItemProvider
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
	public TopLevelFlowItemProvider(AdapterFactory adapterFactory) {
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

			addScriptFolderPropertyDescriptor(object);
			addResourceFolderPropertyDescriptor(object);
			addSkeletonPropertyDescriptor(object);
		}
		return itemPropertyDescriptors.get(object);
	}

	/**
	 * This adds a property descriptor for the Script Folder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addScriptFolderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.get(object).add
			(new ContainerDialogItemPropertyDescriptor(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TopLevelFlow_scriptFolder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TopLevelFlow_scriptFolder_feature", "_UI_TopLevelFlow_type"),
				 FoundationPackage.Literals.TOP_LEVEL_FLOW__SCRIPT_FOLDER,
				 true,
				 false,
				 false,
				 Activator.getImageDescriptor("icons/fugue/icons/script-import.png"),
				 getString("_UI_GenerationPropertyCategory"),
				 null), null, (EObject) object));
	}

	/**
	 * This adds a property descriptor for the Resource Folder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addResourceFolderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.get(object).add
			(new ContainerDialogItemPropertyDescriptor(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TopLevelFlow_resourceFolder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TopLevelFlow_resourceFolder_feature", "_UI_TopLevelFlow_type"),
				 FoundationPackage.Literals.TOP_LEVEL_FLOW__RESOURCE_FOLDER,
				 true,
				 false,
				 false,
				 Activator.getImageDescriptor("icons/fugue/icons/blue-folder-import.png"),
				 getString("_UI_GenerationPropertyCategory"),
				 null), null, (EObject) object));
	}

	/**
	 * This adds a property descriptor for the Skeleton feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSkeletonPropertyDescriptor(Object object) {
		itemPropertyDescriptors.get(object).add
			(new ElementTreeDialogItemPropertyDescriptor(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TopLevelFlow_skeleton_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TopLevelFlow_skeleton_feature", "_UI_TopLevelFlow_type"),
				 FoundationPackage.Literals.TOP_LEVEL_FLOW__SKELETON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GenerationPropertyCategory"),
				 null), null, (EObject) object));
	}

	/**
	 * This returns TopLevelFlow.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/process.png"));
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
		String label = ((TopLevelFlow)object).getName();
		return label == null || label.length() == 0 ? getString("_UI_TopLevelFlow_type") : label;
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

		switch (notification.getFeatureID(TopLevelFlow.class)) {
			case FoundationPackage.TOP_LEVEL_FLOW__SCRIPT_FOLDER:
			case FoundationPackage.TOP_LEVEL_FLOW__RESOURCE_FOLDER:
			case FoundationPackage.TOP_LEVEL_FLOW__SKELETON:
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

	@Override
	protected void addInboundTransitionsOrderPropertyDescriptor(Object object) {
		// Suppression of property as not applicable
	}

	@Override
	protected void addOutboundTransitionsOrderPropertyDescriptor(Object object) {
		// Suppression of property as not applicable
	}

	@Override
	protected void addErrorTransitionsOrderPropertyDescriptor(Object object) {
		// Suppression of property as not applicable
	}

	@Override
	protected void addJoinConditionsPropertyDescriptor(Object object) {
		// Suppression of property as not applicable
	}

	@Override
	protected void addJoinForkPropertyDescriptor(Object object) {
		// Suppression of property as not applicable
	}

}
