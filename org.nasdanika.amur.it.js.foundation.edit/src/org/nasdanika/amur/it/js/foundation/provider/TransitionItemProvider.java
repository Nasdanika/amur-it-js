/**
 */
package org.nasdanika.amur.it.js.foundation.provider;


import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.PointList;
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
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.nasdanika.amur.it.js.Join;
import org.nasdanika.amur.it.js.Parameter;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.Transition;
import org.nasdanika.amur.it.js.provider.AbstractTransitionItemProvider;
import org.nasdanika.amur.it.js.provider.ui.ParametersDialog;

import org.nasdanika.amur.Component;
import org.nasdanika.amur.lang.Source;
import org.nasdanika.amur.lang.provider.ui.SourceDialog;
import org.nasdanika.amur.provider.IFigureFilter;
import org.nasdanika.common.Activator;
import org.nasdanika.common.DialogItemPropertyDescriptorImpl;

/**
 * This is the item provider adapter for a {@link org.nasdanika.amur.it.js.foundation.Transition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionItemProvider
	extends AbstractTransitionItemProvider
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
	public TransitionItemProvider(AdapterFactory adapterFactory) {
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
			addParametersPropertyDescriptor(object);
			addDispatchPropertyDescriptor(object);
			addHandlerPropertyDescriptor(object);
			addJoinTypePropertyDescriptor(object);
			addOutputParametersPropertyDescriptor(object);
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
			 getString("_UI_Transition_condition_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_Transition_condition_feature", "_UI_Transition_type"),
			 FoundationPackage.Literals.TRANSITION__CONDITION,
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
	 * This adds a property descriptor for the Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addParametersPropertyDescriptor(Object object) {
		ItemPropertyDescriptor ipd = createItemPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_Transition_parameters_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_Transition_parameters_feature", "_UI_Transition_type"),
			 FoundationPackage.Literals.TRANSITION__PARAMETERS,
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
							"Transition parameters",
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
			 getString("_UI_Transition_handler_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_Transition_handler_feature", "_UI_Transition_type"),
			 FoundationPackage.Literals.TRANSITION__HANDLER,
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
	 * This adds a property descriptor for the Dispatch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addDispatchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.get(object).add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_dispatch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_dispatch_feature", "_UI_Transition_type"),
				 FoundationPackage.Literals.TRANSITION__DISPATCH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_SourcePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Join Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addJoinTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.get(object).add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_joinType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_joinType_feature", "_UI_Transition_type"),
				 FoundationPackage.Literals.TRANSITION__JOIN_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_TargetPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addOutputParametersPropertyDescriptor(Object object) {
		ItemPropertyDescriptor ipd = createItemPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_Transition_outputParameters_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_Transition_outputParameters_feature", "_UI_Transition_type"),
			 FoundationPackage.Literals.TRANSITION__OUTPUT_PARAMETERS,
			 true,
			 false,
			 false,
			 Activator.getImageDescriptor("icons/params.png"),
			 getString("_UI_TargetPropertyCategory"),
			 null);
		itemPropertyDescriptors.get(object).add
			(new DialogItemPropertyDescriptorImpl(ipd, null) {

				@Override
				public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
					@SuppressWarnings("unchecked")
					ParametersDialog d = new ParametersDialog(
							cellEditorWindow.getShell(),
							"Output (join) parameters",
							(EList<Parameter>) initialValue);
					
					return d.open()==Window.OK ? d.getValue() : null;
				}
				
			});
	}

	/**
	 * This returns Transition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Transition"));
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
		String label = ((Transition)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Transition_type") : label;
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

		switch (notification.getFeatureID(Transition.class)) {
			case FoundationPackage.TRANSITION__CONDITION:
			case FoundationPackage.TRANSITION__PARAMETERS:
			case FoundationPackage.TRANSITION__HANDLER:
			case FoundationPackage.TRANSITION__DISPATCH:
			case FoundationPackage.TRANSITION__JOIN_TYPE:
			case FoundationPackage.TRANSITION__OUTPUT_PARAMETERS:
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
	public void filter(Component component, IFigure figure) {
		if (component instanceof org.nasdanika.amur.Transition
				&& figure instanceof Shape
				&& component.getImplementationType() instanceof org.nasdanika.amur.it.js.foundation.Transition) {
			
			org.nasdanika.amur.it.js.foundation.Transition it = (org.nasdanika.amur.it.js.foundation.Transition) component.getImplementationType();
			
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
				
				if (it.getJoinType()==null || Join.NONE.equals(it.getJoinType())) {
					((PolylineConnection) figure).setTargetDecoration(new PolylineDecoration());					
				} else if (Join.INNER.equals(it.getJoinType())) {
					((PolylineConnection) figure).setTargetDecoration(new PolygonDecoration());										
				} else if (Join.OUTER.equals(it.getJoinType())) {
					PolygonDecoration decoration = new PolygonDecoration();
					decoration.setBackgroundColor(Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
					((PolylineConnection) figure).setTargetDecoration(decoration);										
				}
			}

//			((Shape) figure).setLineStyle(it.getCondition()==null || it.getCondition().isBlank() ? Graphics.LINE_SOLID : Graphics.LINE_DASH);				
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
