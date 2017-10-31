/**
 */
package stl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.ProductLine#getItemtype <em>Itemtype</em>}</li>
 *   <li>{@link stl.ProductLine#getArea <em>Area</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getProductLine()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasItemType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot hasItemType='\n\t\t\tself.itemtype -&gt; size() &gt; 1 '"
 * @generated
 */
public interface ProductLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Itemtype</b></em>' containment reference list.
	 * The list contents are of type {@link stl.ItemType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itemtype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemtype</em>' containment reference list.
	 * @see stl.StlPackage#getProductLine_Itemtype()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemType> getItemtype();

	/**
	 * Returns the value of the '<em><b>Area</b></em>' containment reference list.
	 * The list contents are of type {@link stl.Area}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' containment reference list.
	 * @see stl.StlPackage#getProductLine_Area()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Area> getArea();

} // ProductLine
