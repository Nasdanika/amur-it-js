/**
 */
package org.nasdanika.amur.it.js.foundation.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.amur.ImplementationType;
import org.nasdanika.amur.it.js.AbstractCall;
import org.nasdanika.amur.it.js.AbstractErrorHandler;
import org.nasdanika.amur.it.js.AbstractErrorTransition;
import org.nasdanika.amur.it.js.AbstractEventListener;
import org.nasdanika.amur.it.js.AbstractNode;
import org.nasdanika.amur.it.js.AbstractReference;
import org.nasdanika.amur.it.js.AbstractTransition;
import org.nasdanika.amur.it.js.Component;
import org.nasdanika.amur.it.js.Connection;
import org.nasdanika.amur.it.js.foundation.Activity;
import org.nasdanika.amur.it.js.foundation.Call;
import org.nasdanika.amur.it.js.foundation.ErrorHandler;
import org.nasdanika.amur.it.js.foundation.ErrorTransition;
import org.nasdanika.amur.it.js.foundation.EventListener;
import org.nasdanika.amur.it.js.foundation.FoundationPackage;
import org.nasdanika.amur.it.js.foundation.FunctionInputPort;
import org.nasdanika.amur.it.js.foundation.FunctionOutputPort;
import org.nasdanika.amur.it.js.foundation.GenericContainer;
import org.nasdanika.amur.it.js.foundation.GenericNode;
import org.nasdanika.amur.it.js.foundation.ObjectNode;
import org.nasdanika.amur.it.js.foundation.Participant;
import org.nasdanika.amur.it.js.foundation.PropertyInputPort;
import org.nasdanika.amur.it.js.foundation.PropertyOutputPort;
import org.nasdanika.amur.it.js.foundation.Reference;
import org.nasdanika.amur.it.js.foundation.ScheduledTransition;
import org.nasdanika.amur.it.js.foundation.SubFlow;
import org.nasdanika.amur.it.js.foundation.Suite;
import org.nasdanika.amur.it.js.foundation.TopLevelFlow;
import org.nasdanika.amur.it.js.foundation.Transition;
import org.nasdanika.amur.it.js.foundation.UserTask;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.amur.it.js.foundation.FoundationPackage
 * @generated
 */
public class FoundationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FoundationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoundationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FoundationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FoundationSwitch<Adapter> modelSwitch =
		new FoundationSwitch<Adapter>() {
			@Override
			public Adapter caseCall(Call object) {
				return createCallAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseScheduledTransition(ScheduledTransition object) {
				return createScheduledTransitionAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseErrorTransition(ErrorTransition object) {
				return createErrorTransitionAdapter();
			}
			@Override
			public Adapter caseErrorHandler(ErrorHandler object) {
				return createErrorHandlerAdapter();
			}
			@Override
			public Adapter caseEventListener(EventListener object) {
				return createEventListenerAdapter();
			}
			@Override
			public Adapter caseTopLevelFlow(TopLevelFlow object) {
				return createTopLevelFlowAdapter();
			}
			@Override
			public Adapter casePropertyInputPort(PropertyInputPort object) {
				return createPropertyInputPortAdapter();
			}
			@Override
			public Adapter caseFunctionInputPort(FunctionInputPort object) {
				return createFunctionInputPortAdapter();
			}
			@Override
			public Adapter casePropertyOutputPort(PropertyOutputPort object) {
				return createPropertyOutputPortAdapter();
			}
			@Override
			public Adapter caseFunctionOutputPort(FunctionOutputPort object) {
				return createFunctionOutputPortAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseSuite(Suite object) {
				return createSuiteAdapter();
			}
			@Override
			public Adapter caseGenericNode(GenericNode object) {
				return createGenericNodeAdapter();
			}
			@Override
			public Adapter caseObjectNode(ObjectNode object) {
				return createObjectNodeAdapter();
			}
			@Override
			public Adapter caseUserTask(UserTask object) {
				return createUserTaskAdapter();
			}
			@Override
			public Adapter caseSubFlow(SubFlow object) {
				return createSubFlowAdapter();
			}
			@Override
			public Adapter caseParticipant(Participant object) {
				return createParticipantAdapter();
			}
			@Override
			public Adapter caseGenericContainer(GenericContainer object) {
				return createGenericContainerAdapter();
			}
			@Override
			public Adapter caseImplementationType(ImplementationType object) {
				return createImplementationTypeAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseAbstractCall(AbstractCall object) {
				return createAbstractCallAdapter();
			}
			@Override
			public Adapter caseAbstractTransition(AbstractTransition object) {
				return createAbstractTransitionAdapter();
			}
			@Override
			public Adapter caseAbstractReference(AbstractReference object) {
				return createAbstractReferenceAdapter();
			}
			@Override
			public Adapter caseAbstractErrorTransition(AbstractErrorTransition object) {
				return createAbstractErrorTransitionAdapter();
			}
			@Override
			public Adapter caseAbstractNode(AbstractNode object) {
				return createAbstractNodeAdapter();
			}
			@Override
			public Adapter caseAbstractErrorHandler(AbstractErrorHandler object) {
				return createAbstractErrorHandlerAdapter();
			}
			@Override
			public Adapter caseAbstractEventListener(AbstractEventListener object) {
				return createAbstractEventListenerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.foundation.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.foundation.Call
	 * @generated
	 */
	public Adapter createCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.foundation.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.foundation.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.foundation.ScheduledTransition <em>Scheduled Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.foundation.ScheduledTransition
	 * @generated
	 */
	public Adapter createScheduledTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.foundation.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.foundation.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.foundation.ErrorTransition <em>Error Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.foundation.ErrorTransition
	 * @generated
	 */
	public Adapter createErrorTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.foundation.ErrorHandler <em>Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.foundation.ErrorHandler
	 * @generated
	 */
	public Adapter createErrorHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.foundation.EventListener <em>Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.foundation.EventListener
	 * @generated
	 */
	public Adapter createEventListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.foundation.TopLevelFlow <em>Top Level Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.foundation.TopLevelFlow
	 * @generated
	 */
	public Adapter createTopLevelFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.foundation.PropertyInputPort <em>Property Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.foundation.PropertyInputPort
	 * @generated
	 */
	public Adapter createPropertyInputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.foundation.FunctionInputPort <em>Function Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.foundation.FunctionInputPort
	 * @generated
	 */
	public Adapter createFunctionInputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.foundation.PropertyOutputPort <em>Property Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.foundation.PropertyOutputPort
	 * @generated
	 */
	public Adapter createPropertyOutputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.foundation.FunctionOutputPort <em>Function Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.foundation.FunctionOutputPort
	 * @generated
	 */
	public Adapter createFunctionOutputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.foundation.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.foundation.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.foundation.Suite <em>Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.foundation.Suite
	 * @generated
	 */
	public Adapter createSuiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.foundation.GenericNode <em>Generic Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.foundation.GenericNode
	 * @generated
	 */
	public Adapter createGenericNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.foundation.ObjectNode <em>Object Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.foundation.ObjectNode
	 * @generated
	 */
	public Adapter createObjectNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.foundation.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.foundation.UserTask
	 * @generated
	 */
	public Adapter createUserTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.foundation.SubFlow <em>Sub Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.foundation.SubFlow
	 * @generated
	 */
	public Adapter createSubFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.foundation.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.foundation.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.foundation.GenericContainer <em>Generic Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.foundation.GenericContainer
	 * @generated
	 */
	public Adapter createGenericContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.licensing.Licenseable <em>Licenseable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.licensing.Licenseable
	 * @generated
	 */
	public Adapter createLicenseableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.ImplementationType <em>Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.ImplementationType
	 * @generated
	 */
	public Adapter createImplementationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.AbstractCall <em>Abstract Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.AbstractCall
	 * @generated
	 */
	public Adapter createAbstractCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.AbstractTransition <em>Abstract Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.AbstractTransition
	 * @generated
	 */
	public Adapter createAbstractTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.AbstractReference <em>Abstract Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.AbstractReference
	 * @generated
	 */
	public Adapter createAbstractReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.AbstractErrorTransition <em>Abstract Error Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.AbstractErrorTransition
	 * @generated
	 */
	public Adapter createAbstractErrorTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.AbstractNode
	 * @generated
	 */
	public Adapter createAbstractNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.AbstractErrorHandler <em>Abstract Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.AbstractErrorHandler
	 * @generated
	 */
	public Adapter createAbstractErrorHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.amur.it.js.AbstractEventListener <em>Abstract Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.amur.it.js.AbstractEventListener
	 * @generated
	 */
	public Adapter createAbstractEventListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FoundationAdapterFactory
