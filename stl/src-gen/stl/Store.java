/**
 */
package stl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.Store#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link stl.Store#getItemtype <em>Itemtype</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getStore()
 * @model
 * @generated
 */
public interface Store extends Component {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see stl.StlPackage#getStore_Capacity()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link stl.Store#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Itemtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itemtype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemtype</em>' reference.
	 * @see #setItemtype(ItemType)
	 * @see stl.StlPackage#getStore_Itemtype()
	 * @model required="true"
	 * @generated
	 */
	ItemType getItemtype();

	/**
	 * Sets the value of the '{@link stl.Store#getItemtype <em>Itemtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itemtype</em>' reference.
	 * @see #getItemtype()
	 * @generated
	 */
	void setItemtype(ItemType value);

} // Store
