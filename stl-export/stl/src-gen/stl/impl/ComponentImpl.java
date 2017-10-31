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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import stl.Component;
import stl.Connector;
import stl.Service;
import stl.Slot;
import stl.StlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stl.impl.ComponentImpl#getService <em>Service</em>}</li>
 *   <li>{@link stl.impl.ComponentImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link stl.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link stl.impl.ComponentImpl#getCosts <em>Costs</em>}</li>
 *   <li>{@link stl.impl.ComponentImpl#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> service;

	/**
	 * The cached value of the '{@link #getSlot() <em>Slot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<Slot> slot;

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
	 * The default value of the '{@link #getCosts() <em>Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCosts()
	 * @generated
	 * @ordered
	 */
	protected static final double COSTS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCosts() <em>Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCosts()
	 * @generated
	 * @ordered
	 */
	protected double costs = COSTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StlPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<Service>(Service.class, this, StlPackage.COMPONENT__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slot> getSlot() {
		if (slot == null) {
			slot = new EObjectContainmentEList<Slot>(Slot.class, this, StlPackage.COMPONENT__SLOT);
		}
		return slot;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCosts() {
		return costs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCosts(double newCosts) {
		double oldCosts = costs;
		costs = newCosts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.COMPONENT__COSTS, oldCosts, costs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnector() {
		if (connector == null) {
			connector = new EObjectWithInverseResolvingEList.ManyInverse<Connector>(Connector.class, this,
					StlPackage.COMPONENT__CONNECTOR, StlPackage.CONNECTOR__COMPONENT);
		}
		return connector;
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
		case StlPackage.COMPONENT__CONNECTOR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConnector()).basicAdd(otherEnd, msgs);
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
		case StlPackage.COMPONENT__SERVICE:
			return ((InternalEList<?>) getService()).basicRemove(otherEnd, msgs);
		case StlPackage.COMPONENT__SLOT:
			return ((InternalEList<?>) getSlot()).basicRemove(otherEnd, msgs);
		case StlPackage.COMPONENT__CONNECTOR:
			return ((InternalEList<?>) getConnector()).basicRemove(otherEnd, msgs);
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
		case StlPackage.COMPONENT__SERVICE:
			return getService();
		case StlPackage.COMPONENT__SLOT:
			return getSlot();
		case StlPackage.COMPONENT__NAME:
			return getName();
		case StlPackage.COMPONENT__COSTS:
			return getCosts();
		case StlPackage.COMPONENT__CONNECTOR:
			return getConnector();
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
		case StlPackage.COMPONENT__SERVICE:
			getService().clear();
			getService().addAll((Collection<? extends Service>) newValue);
			return;
		case StlPackage.COMPONENT__SLOT:
			getSlot().clear();
			getSlot().addAll((Collection<? extends Slot>) newValue);
			return;
		case StlPackage.COMPONENT__NAME:
			setName((String) newValue);
			return;
		case StlPackage.COMPONENT__COSTS:
			setCosts((Double) newValue);
			return;
		case StlPackage.COMPONENT__CONNECTOR:
			getConnector().clear();
			getConnector().addAll((Collection<? extends Connector>) newValue);
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
		case StlPackage.COMPONENT__SERVICE:
			getService().clear();
			return;
		case StlPackage.COMPONENT__SLOT:
			getSlot().clear();
			return;
		case StlPackage.COMPONENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StlPackage.COMPONENT__COSTS:
			setCosts(COSTS_EDEFAULT);
			return;
		case StlPackage.COMPONENT__CONNECTOR:
			getConnector().clear();
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
		case StlPackage.COMPONENT__SERVICE:
			return service != null && !service.isEmpty();
		case StlPackage.COMPONENT__SLOT:
			return slot != null && !slot.isEmpty();
		case StlPackage.COMPONENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StlPackage.COMPONENT__COSTS:
			return costs != COSTS_EDEFAULT;
		case StlPackage.COMPONENT__CONNECTOR:
			return connector != null && !connector.isEmpty();
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
		result.append(", costs: ");
		result.append(costs);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
