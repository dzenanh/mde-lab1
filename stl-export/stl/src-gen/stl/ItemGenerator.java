/**
 */
package stl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.ItemGenerator#getItemtype <em>Itemtype</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getItemGenerator()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ItemProducedSameAsOutput'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ItemProducedSameAsOutput='\n\t\t self.slot -&gt; select(e | e.isOutput = true) -&gt; forAll(e | e.itemtype = self.itemtype)\n\t\t'"
 * @generated
 */
public interface ItemGenerator extends Component {
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
	 * @see stl.StlPackage#getItemGenerator_Itemtype()
	 * @model required="true"
	 * @generated
	 */
	ItemType getItemtype();

	/**
	 * Sets the value of the '{@link stl.ItemGenerator#getItemtype <em>Itemtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itemtype</em>' reference.
	 * @see #getItemtype()
	 * @generated
	 */
	void setItemtype(ItemType value);

} // ItemGenerator
