/**
 */
package org.nasdanika.amur.it.js.foundation.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.ui.dialogs.ResourceSelectionDialog;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.Suite;
import org.nasdanika.amur.it.js.provider.AbstractNodeItemProvider;

import org.nasdanika.common.DialogItemPropertyDescriptorImpl;

/**
 * This is the item provider adapter for a {@link org.nasdanika.amur.it.js.foundation.Suite} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SuiteItemProvider
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
	public SuiteItemProvider(AdapterFactory adapterFactory) {
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

			addComponentsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors.get(object);
	}

	/**
	 * This adds a property descriptor for the Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addComponentsPropertyDescriptor(Object object) {
		ItemPropertyDescriptor ipd = createItemPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_Suite_components_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_Suite_components_feature", "_UI_Suite_type"),
			 FoundationPackage.Literals.SUITE__COMPONENTS,
			 true,
			 false,
			 false,
			 getResourceLocator().getImage("full/obj16/images-stack.png"),
			 getString("_UI_GeneralPropertyCategory"),
			 null);
		itemPropertyDescriptors.get(object).add
			(new DialogItemPropertyDescriptorImpl(ipd, null) {

				@Override
				public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
					IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();		
					List<IResource> selectedElements = new ArrayList<>();
					if (initialValue instanceof Collection) {
						for (Object ce: (Collection<?>) initialValue) {
							IResource res = root.findMember(new Path((String) ce));
							if (res!=null) {
								selectedElements.add(res);
							}							
						}
					} 
					
					ResourceSelectionDialog rsd = new ResourceSelectionDialog(
							cellEditorWindow.getShell(), 
							root, 
							master.getDisplayName(initialValue));
					rsd.setTitle("Referenced components");
					rsd.setInitialElementSelections(selectedElements);
					if (rsd.open() == Window.OK) {
						EList<String> ret = new BasicEList<String>();
						for (Object re: rsd.getResult()) {
							if (re instanceof IResource) {
								ret.add(((IResource) re).getFullPath().toPortableString());
							}
						}
						return ret;
					}
					
					return initialValue;
				}
				
			});
	}

	/**
	 * This returns Suite.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/drawer.png"));
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
		String label = ((Suite)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Suite_type") : label;
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

		switch (notification.getFeatureID(Suite.class)) {
			case FoundationPackage.SUITE__COMPONENTS:
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
		// Property suppression
	}

	@Override
	protected void addOutboundTransitionsOrderPropertyDescriptor(Object object) {
		// Property suppression
	}

	@Override
	protected void addErrorTransitionsOrderPropertyDescriptor(Object object) {
		// Property suppression
	}

	@Override
	protected void addErrorHandlersOrderPropertyDescriptor(Object object) {
		// Property suppression
	}

	@Override
	protected void addJoinConditionsPropertyDescriptor(Object object) {
		// Property suppression
	}

	@Override
	protected void addJoinForkPropertyDescriptor(Object object) {
		// Property suppression
	}

	@Override
	protected void addDeclarationsPropertyDescriptor(Object object) {
		// Property suppression
	}

	@Override
	protected void addStartPropertyDescriptor(Object object) {
		// Property suppression
	}

	@Override
	protected void addStopPropertyDescriptor(Object object) {
		// Property suppression
	}
	
}
