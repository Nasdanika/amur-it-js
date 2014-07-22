/**
 */
package org.nasdanika.amur.it.js.foundation.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
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
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.ScheduledTransition;

import org.nasdanika.amur.Component;
import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.lang.provider.ui.SourceDialog;
import org.nasdanika.common.Activator;
import org.nasdanika.common.DialogItemPropertyDescriptorImpl;

/**
 * This is the item provider adapter for a {@link org.nasdanika.amur.it.js.foundation.ScheduledTransition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScheduledTransitionItemProvider
	extends TransitionItemProvider
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
	public ScheduledTransitionItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addPeriodPropertyDescriptor(object);
		}
		return itemPropertyDescriptors.get(object);
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.get(object).add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScheduledTransition_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScheduledTransition_type_feature", "_UI_ScheduledTransition_type"),
				 FoundationPackage.Literals.SCHEDULED_TRANSITION__TYPE,
				 true,
				 false,
				 false,
				 Activator.getImageDescriptor("icons/led/timeline_marker.png"),
				 getString("_UI_SchedulingPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addPeriodPropertyDescriptor(final Object object) {
		ItemPropertyDescriptor ipd = createItemPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_ScheduledTransition_period_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_ScheduledTransition_period_feature", "_UI_ScheduledTransition_type"),
			 FoundationPackage.Literals.SCHEDULED_TRANSITION__PERIOD,
			 true,
			 false,
			 false,
			 getResourceLocator().getImage("full/obj16/time.png"),
			 getString("_UI_SchedulingPropertyCategory"),
			 null);
		itemPropertyDescriptors.get(object).add
			(new DialogItemPropertyDescriptorImpl(ipd, null) {

				@Override
				public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
					SourceDialog d = new SourceDialog(
							cellEditorWindow.getShell(),
							"Period",
							(Source) initialValue,
							((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
							((org.nasdanika.amur.it.js.Component) object).getCompletionProviderFactory("period"));
					
					return d.open()==Window.OK ? d.getValue() : null;
				}
				
			});
	}

	/**
	 * This returns ScheduledTransition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ScheduledTransition"));
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
		String label = ((ScheduledTransition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ScheduledTransition_type") : label;
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

		switch (notification.getFeatureID(ScheduledTransition.class)) {
			case FoundationPackage.SCHEDULED_TRANSITION__TYPE:
			case FoundationPackage.SCHEDULED_TRANSITION__PERIOD:
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

	@Override
	public void filter(Component component, IFigure figure) {
		super.filter(component, figure);
		
		if (component instanceof org.nasdanika.amur.Transition
				&& figure instanceof Shape
				&& component.getImplementationType() instanceof ScheduledTransition) {
			
			ScheduledTransition it = (ScheduledTransition) component.getImplementationType();

			switch (it.getType()) {
			case DELAY:
				((Shape) figure).setLineStyle(Graphics.LINE_DASH);				
				break;
			case INTERVAL:
				((Shape) figure).setLineStyle(Graphics.LINE_DOT);				
				break;
			case TIMEOUT:
				((Shape) figure).setLineStyle(Graphics.LINE_DASHDOT);				
				break;
			default:
				break;
			
			}
		}
	}

}
