/**
 */
package stl.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import stl.Component;
import stl.Connector;
import stl.Slot;
import stl.StlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stl.impl.ConnectorImpl#getIsInput <em>Is Input</em>}</li>
 *   <li>{@link stl.impl.ConnectorImpl#getIsOutput <em>Is Output</em>}</li>
 *   <li>{@link stl.impl.ConnectorImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
	/**
	 * The cached value of the '{@link #getIsInput() <em>Is Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInput()
	 * @generated
	 * @ordered
	 */
	protected Slot isInput;

	/**
	 * The cached value of the '{@link #getIsOutput() <em>Is Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOutput()
	 * @generated
	 * @ordered
	 */
	protected Slot isOutput;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StlPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot getIsInput() {
		if (isInput != null && isInput.eIsProxy()) {
			InternalEObject oldIsInput = (InternalEObject) isInput;
			isInput = (Slot) eResolveProxy(oldIsInput);
			if (isInput != oldIsInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.CONNECTOR__IS_INPUT,
							oldIsInput, isInput));
			}
		}
		return isInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot basicGetIsInput() {
		return isInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsInput(Slot newIsInput, NotificationChain msgs) {
		Slot oldIsInput = isInput;
		isInput = newIsInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StlPackage.CONNECTOR__IS_INPUT, oldIsInput, newIsInput);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInput(Slot newIsInput) {
		if (newIsInput != isInput) {
			NotificationChain msgs = null;
			if (isInput != null)
				msgs = ((InternalEObject) isInput).eInverseRemove(this, StlPackage.SLOT__CONNECTOR_INPUT, Slot.class,
						msgs);
			if (newIsInput != null)
				msgs = ((InternalEObject) newIsInput).eInverseAdd(this, StlPackage.SLOT__CONNECTOR_INPUT, Slot.class,
						msgs);
			msgs = basicSetIsInput(newIsInput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.CONNECTOR__IS_INPUT, newIsInput,
					newIsInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot getIsOutput() {
		if (isOutput != null && isOutput.eIsProxy()) {
			InternalEObject oldIsOutput = (InternalEObject) isOutput;
			isOutput = (Slot) eResolveProxy(oldIsOutput);
			if (isOutput != oldIsOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.CONNECTOR__IS_OUTPUT,
							oldIsOutput, isOutput));
			}
		}
		return isOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot basicGetIsOutput() {
		return isOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsOutput(Slot newIsOutput, NotificationChain msgs) {
		Slot oldIsOutput = isOutput;
		isOutput = newIsOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StlPackage.CONNECTOR__IS_OUTPUT, oldIsOutput, newIsOutput);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOutput(Slot newIsOutput) {
		if (newIsOutput != isOutput) {
			NotificationChain msgs = null;
			if (isOutput != null)
				msgs = ((InternalEObject) isOutput).eInverseRemove(this, StlPackage.SLOT__CONNECTOR_OUTPUT, Slot.class,
						msgs);
			if (newIsOutput != null)
				msgs = ((InternalEObject) newIsOutput).eInverseAdd(this, StlPackage.SLOT__CONNECTOR_OUTPUT, Slot.class,
						msgs);
			msgs = basicSetIsOutput(newIsOutput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.CONNECTOR__IS_OUTPUT, newIsOutput,
					newIsOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectWithInverseResolvingEList.ManyInverse<Component>(Component.class, this,
					StlPackage.CONNECTOR__COMPONENT, StlPackage.COMPONENT__CONNECTOR);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StlPackage.CONNECTOR__IS_INPUT:
			if (isInput != null)
				msgs = ((InternalEObject) isInput).eInverseRemove(this, StlPackage.SLOT__CONNECTOR_INPUT, Slot.class,
						msgs);
			return basicSetIsInput((Slot) otherEnd, msgs);
		case StlPackage.CONNECTOR__IS_OUTPUT:
			if (isOutput != null)
				msgs = ((InternalEObject) isOutput).eInverseRemove(this, StlPackage.SLOT__CONNECTOR_OUTPUT, Slot.class,
						msgs);
			return basicSetIsOutput((Slot) otherEnd, msgs);
		case StlPackage.CONNECTOR__COMPONENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getComponent()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StlPackage.CONNECTOR__IS_INPUT:
			return basicSetIsInput(null, msgs);
		case StlPackage.CONNECTOR__IS_OUTPUT:
			return basicSetIsOutput(null, msgs);
		case StlPackage.CONNECTOR__COMPONENT:
			return ((InternalEList<?>) getComponent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StlPackage.CONNECTOR__IS_INPUT:
			if (resolve)
				return getIsInput();
			return basicGetIsInput();
		case StlPackage.CONNECTOR__IS_OUTPUT:
			if (resolve)
				return getIsOutput();
			return basicGetIsOutput();
		case StlPackage.CONNECTOR__COMPONENT:
			return getComponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StlPackage.CONNECTOR__IS_INPUT:
			setIsInput((Slot) newValue);
			return;
		case StlPackage.CONNECTOR__IS_OUTPUT:
			setIsOutput((Slot) newValue);
			return;
		case StlPackage.CONNECTOR__COMPONENT:
			getComponent().clear();
			getComponent().addAll((Collection<? extends Component>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case StlPackage.CONNECTOR__IS_INPUT:
			setIsInput((Slot) null);
			return;
		case StlPackage.CONNECTOR__IS_OUTPUT:
			setIsOutput((Slot) null);
			return;
		case StlPackage.CONNECTOR__COMPONENT:
			getComponent().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case StlPackage.CONNECTOR__IS_INPUT:
			return isInput != null;
		case StlPackage.CONNECTOR__IS_OUTPUT:
			return isOutput != null;
		case StlPackage.CONNECTOR__COMPONENT:
			return component != null && !component.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
