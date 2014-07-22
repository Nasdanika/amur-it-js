/**
 */
package org.nasdanika.amur.it.js.foundation.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.PointList;
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
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.nasdanika.amur.it.js.foundation.ErrorTransition;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.provider.AbstractErrorTransitionItemProvider;

import org.nasdanika.amur.Component;
import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.lang.provider.ui.SourceDialog;
import org.nasdanika.amur.provider.IFigureFilter;
import org.nasdanika.common.Activator;
import org.nasdanika.common.DialogItemPropertyDescriptorImpl;

/**
 * This is the item provider adapter for a {@link org.nasdanika.amur.it.js.foundation.ErrorTransition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ErrorTransitionItemProvider
	extends AbstractErrorTransitionItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		IFigureFilter {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorTransitionItemProvider(AdapterFactory adapterFactory) {
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

			addConditionPropertyDescriptor(object);
			addHandlerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors.get(object);
	}

	/**
	 * This adds a property descriptor for the Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addConditionPropertyDescriptor(final Object object) {
		ItemPropertyDescriptor ipd = createItemPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_ErrorTransition_condition_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_ErrorTransition_condition_feature", "_UI_ErrorTransition_type"),
			 FoundationPackage.Literals.ERROR_TRANSITION__CONDITION,
			 true,
			 false,
			 false,
			 Activator.getImageDescriptor("icons/led/funnel.png"),
			 getString("_UI_GeneralPropertyCategory"),
			 null);
		itemPropertyDescriptors.get(object).add
			(new DialogItemPropertyDescriptorImpl(ipd, null) {

				@Override
				public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
					SourceDialog d = new SourceDialog(
							cellEditorWindow.getShell(),
							"Condition",
							(Source) initialValue,
							((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), 
							((org.nasdanika.amur.it.js.Component) object).getCompletionProviderFactory("condition"));
					
					return d.open()==Window.OK ? d.getValue() : null;
				}
				
			});
	}

	/**
	 * This adds a property descriptor for the Handler feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addHandlerPropertyDescriptor(final Object object) {
		ItemPropertyDescriptor ipd = createItemPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_ErrorTransition_handler_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_ErrorTransition_handler_feature", "_UI_ErrorTransition_type"),
			 FoundationPackage.Literals.ERROR_TRANSITION__HANDLER,
			 true,
			 false,
			 false,
			 Activator.getImageDescriptor("icons/fat-cow-farm-fresh-web-icons/16x16/source_code.png"),
			 getString("_UI_GeneralPropertyCategory"),
			 null);
		itemPropertyDescriptors.get(object).add
			(new DialogItemPropertyDescriptorImpl(ipd, null) {

				@Override
				public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
					SourceDialog d = new SourceDialog(
							cellEditorWindow.getShell(),
							"Handler",
							(Source) initialValue,
							((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
							((org.nasdanika.amur.it.js.Component) object).getCompletionProviderFactory("handler"));
					
					return d.open()==Window.OK ? d.getValue() : null;
				}
				
			});
	}

	/**
	 * This returns ErrorTransition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ErrorTransition"));
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
		String label = ((ErrorTransition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ErrorTransition_type") : label;
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

		switch (notification.getFeatureID(ErrorTransition.class)) {
			case FoundationPackage.ERROR_TRANSITION__CONDITION:
			case FoundationPackage.ERROR_TRANSITION__HANDLER:
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
	public void filter(Component component, IFigure figure) {
		if (component instanceof org.nasdanika.amur.ErrorTransition
				&& figure instanceof Shape
				&& component.getImplementationType() instanceof org.nasdanika.amur.it.js.foundation.ErrorTransition) {
			
			org.nasdanika.amur.it.js.foundation.ErrorTransition it = (org.nasdanika.amur.it.js.foundation.ErrorTransition) component.getImplementationType();
			
			if (figure instanceof PolylineConnection) {
				if (it.getCondition()==null || it.getCondition().isBlank()) {
					((PolylineConnection) figure).setSourceDecoration(null);
				} else {
					PolygonDecoration decoration = new PolygonDecoration();
					PointList decorationPointList = new PointList();
					decorationPointList.addPoint(0,0);
					decorationPointList.addPoint(-1,1);
					decorationPointList.addPoint(-2,0);
					decorationPointList.addPoint(-1,-1);
					decoration.setTemplate(decorationPointList);
					decoration.setBackgroundColor(Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
					((PolylineConnection) figure).setSourceDecoration(decoration);
				}
			}

			((Shape) figure).setLineWidth(it.getHandler()==null || it.getHandler().isBlank() ? 2 : 3);
		}
	}
	
}
