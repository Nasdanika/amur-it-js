/**
 */
package org.nasdanika.amur.it.js.foundation.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.nasdanika.amur.it.js.foundation.util.FoundationAdapterFactory;

import org.nasdanika.amur.provider.IFigureFilter;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FoundationItemProviderAdapterFactory extends FoundationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FoundationItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		
		supportedTypes.add(IFigureFilter.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.amur.it.js.foundation.Call} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallItemProvider callItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.amur.it.js.foundation.Call}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCallAdapter() {
		if (callItemProvider == null) {
			callItemProvider = new CallItemProvider(this);
		}

		return callItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.amur.it.js.foundation.Transition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionItemProvider transitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.amur.it.js.foundation.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionAdapter() {
		if (transitionItemProvider == null) {
			transitionItemProvider = new TransitionItemProvider(this);
		}

		return transitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.amur.it.js.foundation.ScheduledTransition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduledTransitionItemProvider scheduledTransitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.amur.it.js.foundation.ScheduledTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScheduledTransitionAdapter() {
		if (scheduledTransitionItemProvider == null) {
			scheduledTransitionItemProvider = new ScheduledTransitionItemProvider(this);
		}

		return scheduledTransitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.amur.it.js.foundation.Reference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceItemProvider referenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.amur.it.js.foundation.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferenceAdapter() {
		if (referenceItemProvider == null) {
			referenceItemProvider = new ReferenceItemProvider(this);
		}

		return referenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.amur.it.js.foundation.ErrorTransition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorTransitionItemProvider errorTransitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.amur.it.js.foundation.ErrorTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createErrorTransitionAdapter() {
		if (errorTransitionItemProvider == null) {
			errorTransitionItemProvider = new ErrorTransitionItemProvider(this);
		}

		return errorTransitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.amur.it.js.foundation.ErrorHandler} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorHandlerItemProvider errorHandlerItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.amur.it.js.foundation.ErrorHandler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createErrorHandlerAdapter() {
		if (errorHandlerItemProvider == null) {
			errorHandlerItemProvider = new ErrorHandlerItemProvider(this);
		}

		return errorHandlerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.amur.it.js.foundation.EventListener} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventListenerItemProvider eventListenerItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.amur.it.js.foundation.EventListener}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventListenerAdapter() {
		if (eventListenerItemProvider == null) {
			eventListenerItemProvider = new EventListenerItemProvider(this);
		}

		return eventListenerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.amur.it.js.foundation.TopLevelFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopLevelFlowItemProvider topLevelFlowItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.amur.it.js.foundation.TopLevelFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTopLevelFlowAdapter() {
		if (topLevelFlowItemProvider == null) {
			topLevelFlowItemProvider = new TopLevelFlowItemProvider(this);
		}

		return topLevelFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.amur.it.js.foundation.PropertyInputPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyInputPortItemProvider propertyInputPortItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.amur.it.js.foundation.PropertyInputPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyInputPortAdapter() {
		if (propertyInputPortItemProvider == null) {
			propertyInputPortItemProvider = new PropertyInputPortItemProvider(this);
		}

		return propertyInputPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.amur.it.js.foundation.FunctionInputPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionInputPortItemProvider functionInputPortItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.amur.it.js.foundation.FunctionInputPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionInputPortAdapter() {
		if (functionInputPortItemProvider == null) {
			functionInputPortItemProvider = new FunctionInputPortItemProvider(this);
		}

		return functionInputPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.amur.it.js.foundation.PropertyOutputPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyOutputPortItemProvider propertyOutputPortItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.amur.it.js.foundation.PropertyOutputPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyOutputPortAdapter() {
		if (propertyOutputPortItemProvider == null) {
			propertyOutputPortItemProvider = new PropertyOutputPortItemProvider(this);
		}

		return propertyOutputPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.amur.it.js.foundation.FunctionOutputPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionOutputPortItemProvider functionOutputPortItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.amur.it.js.foundation.FunctionOutputPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionOutputPortAdapter() {
		if (functionOutputPortItemProvider == null) {
			functionOutputPortItemProvider = new FunctionOutputPortItemProvider(this);
		}

		return functionOutputPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.amur.it.js.foundation.Activity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityItemProvider activityItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.amur.it.js.foundation.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityAdapter() {
		if (activityItemProvider == null) {
			activityItemProvider = new ActivityItemProvider(this);
		}

		return activityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.amur.it.js.foundation.Suite} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuiteItemProvider suiteItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.amur.it.js.foundation.Suite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSuiteAdapter() {
		if (suiteItemProvider == null) {
			suiteItemProvider = new SuiteItemProvider(this);
		}

		return suiteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.amur.it.js.foundation.GenericNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericNodeItemProvider genericNodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.amur.it.js.foundation.GenericNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenericNodeAdapter() {
		if (genericNodeItemProvider == null) {
			genericNodeItemProvider = new GenericNodeItemProvider(this);
		}

		return genericNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.amur.it.js.foundation.ObjectNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectNodeItemProvider objectNodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.amur.it.js.foundation.ObjectNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectNodeAdapter() {
		if (objectNodeItemProvider == null) {
			objectNodeItemProvider = new ObjectNodeItemProvider(this);
		}

		return objectNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.amur.it.js.foundation.UserTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserTaskItemProvider userTaskItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.amur.it.js.foundation.UserTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUserTaskAdapter() {
		if (userTaskItemProvider == null) {
			userTaskItemProvider = new UserTaskItemProvider(this);
		}

		return userTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.amur.it.js.foundation.SubFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubFlowItemProvider subFlowItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.amur.it.js.foundation.SubFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubFlowAdapter() {
		if (subFlowItemProvider == null) {
			subFlowItemProvider = new SubFlowItemProvider(this);
		}

		return subFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.amur.it.js.foundation.Participant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantItemProvider participantItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.amur.it.js.foundation.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParticipantAdapter() {
		if (participantItemProvider == null) {
			participantItemProvider = new ParticipantItemProvider(this);
		}

		return participantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.amur.it.js.foundation.GenericContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericContainerItemProvider genericContainerItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.amur.it.js.foundation.GenericContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenericContainerAdapter() {
		if (genericContainerItemProvider == null) {
			genericContainerItemProvider = new GenericContainerItemProvider(this);
		}

		return genericContainerItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (callItemProvider != null) callItemProvider.dispose();
		if (transitionItemProvider != null) transitionItemProvider.dispose();
		if (scheduledTransitionItemProvider != null) scheduledTransitionItemProvider.dispose();
		if (referenceItemProvider != null) referenceItemProvider.dispose();
		if (errorTransitionItemProvider != null) errorTransitionItemProvider.dispose();
		if (errorHandlerItemProvider != null) errorHandlerItemProvider.dispose();
		if (eventListenerItemProvider != null) eventListenerItemProvider.dispose();
		if (topLevelFlowItemProvider != null) topLevelFlowItemProvider.dispose();
		if (propertyInputPortItemProvider != null) propertyInputPortItemProvider.dispose();
		if (functionInputPortItemProvider != null) functionInputPortItemProvider.dispose();
		if (propertyOutputPortItemProvider != null) propertyOutputPortItemProvider.dispose();
		if (functionOutputPortItemProvider != null) functionOutputPortItemProvider.dispose();
		if (activityItemProvider != null) activityItemProvider.dispose();
		if (suiteItemProvider != null) suiteItemProvider.dispose();
		if (genericNodeItemProvider != null) genericNodeItemProvider.dispose();
		if (objectNodeItemProvider != null) objectNodeItemProvider.dispose();
		if (userTaskItemProvider != null) userTaskItemProvider.dispose();
		if (subFlowItemProvider != null) subFlowItemProvider.dispose();
		if (participantItemProvider != null) participantItemProvider.dispose();
		if (genericContainerItemProvider != null) genericContainerItemProvider.dispose();
	}

}