/**
 */
package stl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import stl.Area;
import stl.ItemType;
import stl.ProductLine;
import stl.StlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stl.impl.ProductLineImpl#getItemtype <em>Itemtype</em>}</li>
 *   <li>{@link stl.impl.ProductLineImpl#getArea <em>Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductLineImpl extends MinimalEObjectImpl.Container implements ProductLine {
	/**
	 * The cached value of the '{@link #getItemtype() <em>Itemtype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemtype()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemType> itemtype;

	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected EList<Area> area;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StlPackage.Literals.PRODUCT_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getItemtype() {
		if (itemtype == null) {
			itemtype = new EObjectContainmentEList<ItemType>(ItemType.class, this, StlPackage.PRODUCT_LINE__ITEMTYPE);
		}
		return itemtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Area> getArea() {
		if (area == null) {
			area = new EObjectContainmentEList<Area>(Area.class, this, StlPackage.PRODUCT_LINE__AREA);
		}
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StlPackage.PRODUCT_LINE__ITEMTYPE:
			return ((InternalEList<?>) getItemtype()).basicRemove(otherEnd, msgs);
		case StlPackage.PRODUCT_LINE__AREA:
			return ((InternalEList<?>) getArea()).basicRemove(otherEnd, msgs);
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
		case StlPackage.PRODUCT_LINE__ITEMTYPE:
			return getItemtype();
		case StlPackage.PRODUCT_LINE__AREA:
			return getArea();
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
		case StlPackage.PRODUCT_LINE__ITEMTYPE:
			getItemtype().clear();
			getItemtype().addAll((Collection<? extends ItemType>) newValue);
			return;
		case StlPackage.PRODUCT_LINE__AREA:
			getArea().clear();
			getArea().addAll((Collection<? extends Area>) newValue);
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
		case StlPackage.PRODUCT_LINE__ITEMTYPE:
			getItemtype().clear();
			return;
		case StlPackage.PRODUCT_LINE__AREA:
			getArea().clear();
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
		case StlPackage.PRODUCT_LINE__ITEMTYPE:
			return itemtype != null && !itemtype.isEmpty();
		case StlPackage.PRODUCT_LINE__AREA:
			return area != null && !area.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductLineImpl
