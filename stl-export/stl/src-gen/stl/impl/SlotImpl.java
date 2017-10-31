/**
 */
package stl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import stl.Connector;
import stl.ItemType;
import stl.Slot;
import stl.StlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stl.impl.SlotImpl#getConnectorInput <em>Connector Input</em>}</li>
 *   <li>{@link stl.impl.SlotImpl#getConnectorOutput <em>Connector Output</em>}</li>
 *   <li>{@link stl.impl.SlotImpl#getItemtype <em>Itemtype</em>}</li>
 *   <li>{@link stl.impl.SlotImpl#getName <em>Name</em>}</li>
 *   <li>{@link stl.impl.SlotImpl#isIsInput <em>Is Input</em>}</li>
 *   <li>{@link stl.impl.SlotImpl#isIsOutput <em>Is Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlotImpl extends MinimalEObjectImpl.Container implements Slot {
	/**
	 * The cached value of the '{@link #getConnectorInput() <em>Connector Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorInput()
	 * @generated
	 * @ordered
	 */
	protected Connector connectorInput;

	/**
	 * The cached value of the '{@link #getConnectorOutput() <em>Connector Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorOutput()
	 * @generated
	 * @ordered
	 */
	protected Connector connectorOutput;

	/**
	 * The cached value of the '{@link #getItemtype() <em>Itemtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemtype()
	 * @generated
	 * @ordered
	 */
	protected ItemType itemtype;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsInput() <em>Is Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInput() <em>Is Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInput()
	 * @generated
	 * @ordered
	 */
	protected boolean isInput = IS_INPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOutput() <em>Is Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOutput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OUTPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOutput() <em>Is Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOutput()
	 * @generated
	 * @ordered
	 */
	protected boolean isOutput = IS_OUTPUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StlPackage.Literals.SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getConnectorInput() {
		if (connectorInput != null && connectorInput.eIsProxy()) {
			InternalEObject oldConnectorInput = (InternalEObject) connectorInput;
			connectorInput = (Connector) eResolveProxy(oldConnectorInput);
			if (connectorInput != oldConnectorInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.SLOT__CONNECTOR_INPUT,
							oldConnectorInput, connectorInput));
			}
		}
		return connectorInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetConnectorInput() {
		return connectorInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectorInput(Connector newConnectorInput, NotificationChain msgs) {
		Connector oldConnectorInput = connectorInput;
		connectorInput = newConnectorInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StlPackage.SLOT__CONNECTOR_INPUT, oldConnectorInput, newConnectorInput);
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
	public void setConnectorInput(Connector newConnectorInput) {
		if (newConnectorInput != connectorInput) {
			NotificationChain msgs = null;
			if (connectorInput != null)
				msgs = ((InternalEObject) connectorInput).eInverseRemove(this, StlPackage.CONNECTOR__IS_INPUT,
						Connector.class, msgs);
			if (newConnectorInput != null)
				msgs = ((InternalEObject) newConnectorInput).eInverseAdd(this, StlPackage.CONNECTOR__IS_INPUT,
						Connector.class, msgs);
			msgs = basicSetConnectorInput(newConnectorInput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.SLOT__CONNECTOR_INPUT, newConnectorInput,
					newConnectorInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getConnectorOutput() {
		if (connectorOutput != null && connectorOutput.eIsProxy()) {
			InternalEObject oldConnectorOutput = (InternalEObject) connectorOutput;
			connectorOutput = (Connector) eResolveProxy(oldConnectorOutput);
			if (connectorOutput != oldConnectorOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.SLOT__CONNECTOR_OUTPUT,
							oldConnectorOutput, connectorOutput));
			}
		}
		return connectorOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetConnectorOutput() {
		return connectorOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectorOutput(Connector newConnectorOutput, NotificationChain msgs) {
		Connector oldConnectorOutput = connectorOutput;
		connectorOutput = newConnectorOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StlPackage.SLOT__CONNECTOR_OUTPUT, oldConnectorOutput, newConnectorOutput);
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
	public void setConnectorOutput(Connector newConnectorOutput) {
		if (newConnectorOutput != connectorOutput) {
			NotificationChain msgs = null;
			if (connectorOutput != null)
				msgs = ((InternalEObject) connectorOutput).eInverseRemove(this, StlPackage.CONNECTOR__IS_OUTPUT,
						Connector.class, msgs);
			if (newConnectorOutput != null)
				msgs = ((InternalEObject) newConnectorOutput).eInverseAdd(this, StlPackage.CONNECTOR__IS_OUTPUT,
						Connector.class, msgs);
			msgs = basicSetConnectorOutput(newConnectorOutput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.SLOT__CONNECTOR_OUTPUT, newConnectorOutput,
					newConnectorOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType getItemtype() {
		if (itemtype != null && itemtype.eIsProxy()) {
			InternalEObject oldItemtype = (InternalEObject) itemtype;
			itemtype = (ItemType) eResolveProxy(oldItemtype);
			if (itemtype != oldItemtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.SLOT__ITEMTYPE, oldItemtype,
							itemtype));
			}
		}
		return itemtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType basicGetItemtype() {
		return itemtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemtype(ItemType newItemtype) {
		ItemType oldItemtype = itemtype;
		itemtype = newItemtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.SLOT__ITEMTYPE, oldItemtype, itemtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.SLOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInput() {
		return isInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInput(boolean newIsInput) {
		boolean oldIsInput = isInput;
		isInput = newIsInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.SLOT__IS_INPUT, oldIsInput, isInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOutput() {
		return isOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOutput(boolean newIsOutput) {
		boolean oldIsOutput = isOutput;
		isOutput = newIsOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.SLOT__IS_OUTPUT, oldIsOutput, isOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StlPackage.SLOT__CONNECTOR_INPUT:
			if (connectorInput != null)
				msgs = ((InternalEObject) connectorInput).eInverseRemove(this, StlPackage.CONNECTOR__IS_INPUT,
						Connector.class, msgs);
			return basicSetConnectorInput((Connector) otherEnd, msgs);
		case StlPackage.SLOT__CONNECTOR_OUTPUT:
			if (connectorOutput != null)
				msgs = ((InternalEObject) connectorOutput).eInverseRemove(this, StlPackage.CONNECTOR__IS_OUTPUT,
						Connector.class, msgs);
			return basicSetConnectorOutput((Connector) otherEnd, msgs);
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
		case StlPackage.SLOT__CONNECTOR_INPUT:
			return basicSetConnectorInput(null, msgs);
		case StlPackage.SLOT__CONNECTOR_OUTPUT:
			return basicSetConnectorOutput(null, msgs);
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
		case StlPackage.SLOT__CONNECTOR_INPUT:
			if (resolve)
				return getConnectorInput();
			return basicGetConnectorInput();
		case StlPackage.SLOT__CONNECTOR_OUTPUT:
			if (resolve)
				return getConnectorOutput();
			return basicGetConnectorOutput();
		case StlPackage.SLOT__ITEMTYPE:
			if (resolve)
				return getItemtype();
			return basicGetItemtype();
		case StlPackage.SLOT__NAME:
			return getName();
		case StlPackage.SLOT__IS_INPUT:
			return isIsInput();
		case StlPackage.SLOT__IS_OUTPUT:
			return isIsOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StlPackage.SLOT__CONNECTOR_INPUT:
			setConnectorInput((Connector) newValue);
			return;
		case StlPackage.SLOT__CONNECTOR_OUTPUT:
			setConnectorOutput((Connector) newValue);
			return;
		case StlPackage.SLOT__ITEMTYPE:
			setItemtype((ItemType) newValue);
			return;
		case StlPackage.SLOT__NAME:
			setName((String) newValue);
			return;
		case StlPackage.SLOT__IS_INPUT:
			setIsInput((Boolean) newValue);
			return;
		case StlPackage.SLOT__IS_OUTPUT:
			setIsOutput((Boolean) newValue);
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
		case StlPackage.SLOT__CONNECTOR_INPUT:
			setConnectorInput((Connector) null);
			return;
		case StlPackage.SLOT__CONNECTOR_OUTPUT:
			setConnectorOutput((Connector) null);
			return;
		case StlPackage.SLOT__ITEMTYPE:
			setItemtype((ItemType) null);
			return;
		case StlPackage.SLOT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StlPackage.SLOT__IS_INPUT:
			setIsInput(IS_INPUT_EDEFAULT);
			return;
		case StlPackage.SLOT__IS_OUTPUT:
			setIsOutput(IS_OUTPUT_EDEFAULT);
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
		case StlPackage.SLOT__CONNECTOR_INPUT:
			return connectorInput != null;
		case StlPackage.SLOT__CONNECTOR_OUTPUT:
			return connectorOutput != null;
		case StlPackage.SLOT__ITEMTYPE:
			return itemtype != null;
		case StlPackage.SLOT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StlPackage.SLOT__IS_INPUT:
			return isInput != IS_INPUT_EDEFAULT;
		case StlPackage.SLOT__IS_OUTPUT:
			return isOutput != IS_OUTPUT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", isInput: ");
		result.append(isInput);
		result.append(", isOutput: ");
		result.append(isOutput);
		result.append(')');
		return result.toString();
	}

} //SlotImpl
