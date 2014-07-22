/**
 */
package org.nasdanika.amur.it.js.foundation.provider;


import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Shape;
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
import org.nasdanika.amur.it.js.foundation.Call;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.provider.AbstractCallItemProvider;
import org.nasdanika.amur.it.js.provider.ui.ParametersDialog;

import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.lang.provider.ui.SourceDialog;
import org.nasdanika.amur.provider.IFigureFilter;
import org.nasdanika.common.Activator;
import org.nasdanika.common.DialogItemPropertyDescriptorImpl;

/**
 * This is the item provider adapter for a {@link org.nasdanika.amur.it.js.foundation.Call} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CallItemProvider
	extends AbstractCallItemProvider
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
	public CallItemProvider(AdapterFactory adapterFactory) {
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
			addHandlerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors.get(object);
	}

	/**
	 * This adds a property descriptor for the Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addParametersPropertyDescriptor(Object object) {
		ItemPropertyDescriptor ipd = createItemPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_Call_parameters_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_Call_parameters_feature", "_UI_Call_type"),
			 FoundationPackage.Literals.CALL__PARAMETERS,
			 true,
			 false,
			 false,
			 Activator.getImageDescriptor("icons/params.png"),
			 getString("_UI_SourcePropertyCategory"),
			 null);
		itemPropertyDescriptors.get(object).add
			(new DialogItemPropertyDescriptorImpl(ipd, null) {

				@Override
				public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
					@SuppressWarnings("unchecked")
					ParametersDialog d = new ParametersDialog(
							cellEditorWindow.getShell(),
							"Call parameters",
							(EList<Parameter>) initialValue);
					
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
			 getString("_UI_Call_handler_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_Call_handler_feature", "_UI_Call_type"),
			 FoundationPackage.Literals.CALL__HANDLER,
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
							((Component) object).getCompletionProviderFactory("handler"));
									
					return d.open()==Window.OK ? d.getValue() : null;
				}
				
			});
	}

	/**
	 * This returns Call.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Call"));
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
		String label = ((Call)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Call_type") : label;
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

		switch (notification.getFeatureID(Call.class)) {
			case FoundationPackage.CALL__PARAMETERS:
			case FoundationPackage.CALL__HANDLER:
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
	
	private Map<Connection, Label[]> labelMap = new WeakHashMap<>();

	@Override
	public void filter(org.nasdanika.amur.Component component, IFigure figure) {
		if (component instanceof org.nasdanika.amur.Call
				&& figure instanceof Shape
				&& component.getImplementationType() instanceof org.nasdanika.amur.it.js.foundation.Call) {
			
			org.nasdanika.amur.it.js.foundation.Call it = (org.nasdanika.amur.it.js.foundation.Call) component.getImplementationType();

			((Shape) figure).setLineWidth(it.getHandler()==null || it.getHandler().isBlank() ? 2 : 3);
			
			// Source and target name labels.
			if (figure instanceof Connection) {
				Connection c = (Connection) figure;
				Label[] cLabels = labelMap.get(c);
				if (cLabels==null) {
					cLabels = new Label[2];
					labelMap.put(c, cLabels);
				}
				if (it.getSourceName()==null || it.getSourceName().trim().length()==0 || it.getSourceName().startsWith(".")) {
					if (cLabels[0]!=null) {
						cLabels[0].setText("");
					}
				} else {
					if (cLabels[0] == null) {
						ConnectionEndpointLocator sourceEndpointLocator = new ConnectionEndpointLocator(c, false);
						sourceEndpointLocator.setVDistance(5);
						sourceEndpointLocator.setUDistance(5);
						cLabels[0] = new Label();
						c.add(cLabels[0], sourceEndpointLocator);
					}
					String sourceName = it.getSourceName();
					if (it.getSourcePort()!=null && it.getSourcePort().trim().length()>0) {
						sourceName+="@"+it.getSourcePort();
					}
					cLabels[0].setText(sourceName);
					
				}
				
				if (it.getTargetName()==null || it.getTargetName().trim().length()==0 || it.getTargetName().startsWith(".")) {
					if (cLabels[1]!=null) {
						cLabels[1].setText("");
					}
				} else {
					if (cLabels[1] == null) {
						ConnectionEndpointLocator targetEndpointLocator = new ConnectionEndpointLocator(c, true);
						targetEndpointLocator.setVDistance(5);
						targetEndpointLocator.setUDistance(5);
						cLabels[1] = new Label();
						c.add(cLabels[1], targetEndpointLocator);
					}
					String targetName = it.getTargetName();
					if (it.getTargetPort()!=null && it.getTargetPort().trim().length()>0) {
						targetName+="@"+it.getTargetPort();
					}
					cLabels[1].setText(targetName);					
				}
			}			
		}
	}
	
}
