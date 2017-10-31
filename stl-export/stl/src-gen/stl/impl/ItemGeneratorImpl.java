/**
 */
package stl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import stl.ItemGenerator;
import stl.ItemType;
import stl.StlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stl.impl.ItemGeneratorImpl#getItemtype <em>Itemtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemGeneratorImpl extends ComponentImpl implements ItemGenerator {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StlPackage.Literals.ITEM_GENERATOR;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.ITEM_GENERATOR__ITEMTYPE,
							oldItemtype, itemtype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.ITEM_GENERATOR__ITEMTYPE, oldItemtype,
					itemtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StlPackage.ITEM_GENERATOR__ITEMTYPE:
			if (resolve)
				return getItemtype();
			return basicGetItemtype();
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
		case StlPackage.ITEM_GENERATOR__ITEMTYPE:
			setItemtype((ItemType) newValue);
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
		case StlPackage.ITEM_GENERATOR__ITEMTYPE:
			setItemtype((ItemType) null);
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
		case StlPackage.ITEM_GENERATOR__ITEMTYPE:
			return itemtype != null;
		}
		return super.eIsSet(featureID);
	}

} //ItemGeneratorImpl
