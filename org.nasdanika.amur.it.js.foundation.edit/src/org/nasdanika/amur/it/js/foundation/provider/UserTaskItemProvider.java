/**
 */
package org.nasdanika.amur.it.js.foundation.provider;


import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.lang.provider.ui.SourceDialog;
import org.nasdanika.common.Activator;
import org.nasdanika.common.DialogItemPropertyDescriptorImpl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
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
import org.nasdanika.amur.it.js.Component;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.UserTask;
import org.nasdanika.amur.it.js.provider.AbstractNodeItemProvider;
import org.nasdanika.amur.it.js.provider.ui.ParametersDialog;

/**
 * This is the item provider adapter for a {@link org.nasdanika.amur.it.js.foundation.UserTask} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UserTaskItemProvider
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
	public UserTaskItemProvider(AdapterFactory adapterFactory) {
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

			addParametersPropertyDescriptor(object);
			addPresentationPropertyDescriptor(object);
			addValidationPropertyDescriptor(object);
			addActionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors.get(object);
	}

	/**
	 * This adds a property descriptor for the Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addParametersPropertyDescriptor(final Object object) {
		ItemPropertyDescriptor ipd = createItemPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_UserTask_parameters_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_UserTask_parameters_feature", "_UI_UserTask_type"),
			 FoundationPackage.Literals.USER_TASK__PARAMETERS,
			 true,
			 false,
			 false,
			 Activator.getImageDescriptor("icons/params.png"),
			 getString("_UI_GeneralPropertyCategory"),
			 null);
		
		itemPropertyDescriptors.get(object).add
		(new DialogItemPropertyDescriptorImpl(ipd, null) {

			@Override
			public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
				@SuppressWarnings("unchecked")
				ParametersDialog d = new ParametersDialog(
						cellEditorWindow.getShell(),
						"Input parameters",
						(EList<Parameter>) initialValue);
				
				return d.open()==Window.OK ? d.getValue() : null;
			}
			
		});
		
	}

	/**
	 * This adds a property descriptor for the Presentation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addPresentationPropertyDescriptor(final Object object) {
		ItemPropertyDescriptor ipd = createItemPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_UserTask_presentation_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_UserTask_presentation_feature", "_UI_UserTask_type"),
			 FoundationPackage.Literals.USER_TASK__PRESENTATION,
			 true,
			 false,
			 false,
			 Activator.getImageDescriptor("icons/fugue/icons/application-form.png"),
			 getString("_UI_GeneralPropertyCategory"),
			 null);
		
		itemPropertyDescriptors.get(object).add
		(new DialogItemPropertyDescriptorImpl(ipd, null) {

			@Override
			public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
				SourceDialog d = new SourceDialog(
						cellEditorWindow.getShell(),
						"Presentation",
						(Source) initialValue,
						((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), 
						((Component) object).getCompletionProviderFactory("presentation"));
				
				return d.open()==Window.OK ? d.getValue() : null;
			}
			
		});
		
	}

	/**
	 * This adds a property descriptor for the Validation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addValidationPropertyDescriptor(final Object object) {
		ItemPropertyDescriptor ipd = createItemPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_UserTask_validation_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_UserTask_validation_feature", "_UI_UserTask_type"),
			 FoundationPackage.Literals.USER_TASK__VALIDATION,
			 true,
			 false,
			 false,
			 Activator.getImageDescriptor("icons/essen/16x16/check.png"),
			 getString("_UI_GeneralPropertyCategory"),
			 null);

		itemPropertyDescriptors.get(object).add
		(new DialogItemPropertyDescriptorImpl(ipd, null) {

			@Override
			public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
				SourceDialog d = new SourceDialog(
						cellEditorWindow.getShell(),
						"Validation",
						(Source) initialValue,
						((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), 
						((Component) object).getCompletionProviderFactory("validation"));
				
				return d.open()==Window.OK ? d.getValue() : null;
			}
			
		});
		
	}

	/**
	 * This adds a property descriptor for the Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addActionPropertyDescriptor(final Object object) {
		ItemPropertyDescriptor ipd = createItemPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_UserTask_action_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_UserTask_action_feature", "_UI_UserTask_type"),
			 FoundationPackage.Literals.USER_TASK__ACTION,
			 true,
			 false,
			 false,
			 Activator.getImageDescriptor("icons/fat-cow-farm-fresh-web-icons/16x16/cog_go.png"),
			 getString("_UI_GeneralPropertyCategory"),
			 null);
		
		itemPropertyDescriptors.get(object).add
		(new DialogItemPropertyDescriptorImpl(ipd, null) {

			@Override
			public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
				SourceDialog d = new SourceDialog(
						cellEditorWindow.getShell(),
						"Action",
						(Source) initialValue,
						((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), 
						((Component) object).getCompletionProviderFactory("action"));
				
				return d.open()==Window.OK ? d.getValue() : null;
			}
			
		});
		
	}

	/**
	 * This returns UserTask.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("user.png"));
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
		String label = ((UserTask)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UserTask_type") :
			label;
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

		switch (notification.getFeatureID(UserTask.class)) {
			case FoundationPackage.USER_TASK__PARAMETERS:
			case FoundationPackage.USER_TASK__PRESENTATION:
			case FoundationPackage.USER_TASK__VALIDATION:
			case FoundationPackage.USER_TASK__ACTION:
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
	protected void addErrorHandlersOrderPropertyDescriptor(Object object) {
		// Property suppression.
	}
}
