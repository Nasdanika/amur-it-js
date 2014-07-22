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
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.Participant;
import org.nasdanika.amur.it.js.provider.AbstractNodeItemProvider;

/**
 * This is the item provider adapter for a {@link org.nasdanika.amur.it.js.foundation.Participant} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParticipantItemProvider
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
	public ParticipantItemProvider(AdapterFactory adapterFactory) {
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

			addScopePropertyDescriptor(object);
			addSelectorPropertyDescriptor(object);
			addInputPortsPropertyDescriptor(object);
			addOutputPortsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors.get(object);
	}

	/**
	 * This adds a property descriptor for the Scope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addScopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.get(object).add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Participant_scope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Participant_scope_feature", "_UI_Participant_type"),
				 FoundationPackage.Literals.PARTICIPANT__SCOPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Selector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSelectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.get(object).add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Participant_selector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Participant_selector_feature", "_UI_Participant_type"),
				 FoundationPackage.Literals.PARTICIPANT__SELECTOR,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Ports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addInputPortsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.get(object).add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Participant_inputPorts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Participant_inputPorts_feature", "_UI_Participant_type"),
				 FoundationPackage.Literals.PARTICIPANT__INPUT_PORTS,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Ports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addOutputPortsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.get(object).add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Participant_outputPorts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Participant_outputPorts_feature", "_UI_Participant_type"),
				 FoundationPackage.Literals.PARTICIPANT__OUTPUT_PORTS,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This returns Participant.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Participant"));
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
		String label = ((Participant)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Participant_type") :
			getString("_UI_Participant_type") + " " + label;
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

		switch (notification.getFeatureID(Participant.class)) {
			case FoundationPackage.PARTICIPANT__SCOPE:
			case FoundationPackage.PARTICIPANT__SELECTOR:
			case FoundationPackage.PARTICIPANT__INPUT_PORTS:
			case FoundationPackage.PARTICIPANT__OUTPUT_PORTS:
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
