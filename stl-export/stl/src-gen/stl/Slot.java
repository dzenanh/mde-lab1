/**
 */
package stl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.Slot#getConnectorInput <em>Connector Input</em>}</li>
 *   <li>{@link stl.Slot#getConnectorOutput <em>Connector Output</em>}</li>
 *   <li>{@link stl.Slot#getItemtype <em>Itemtype</em>}</li>
 *   <li>{@link stl.Slot#getName <em>Name</em>}</li>
 *   <li>{@link stl.Slot#isIsInput <em>Is Input</em>}</li>
 *   <li>{@link stl.Slot#isIsOutput <em>Is Output</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getSlot()
 * @model
 * @generated
 */
public interface Slot extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector Input</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link stl.Connector#getIsInput <em>Is Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Input</em>' reference.
	 * @see #setConnectorInput(Connector)
	 * @see stl.StlPackage#getSlot_ConnectorInput()
	 * @see stl.Connector#getIsInput
	 * @model opposite="isInput"
	 * @generated
	 */
	Connector getConnectorInput();

	/**
	 * Sets the value of the '{@link stl.Slot#getConnectorInput <em>Connector Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Input</em>' reference.
	 * @see #getConnectorInput()
	 * @generated
	 */
	void setConnectorInput(Connector value);

	/**
	 * Returns the value of the '<em><b>Connector Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link stl.Connector#getIsOutput <em>Is Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Output</em>' reference.
	 * @see #setConnectorOutput(Connector)
	 * @see stl.StlPackage#getSlot_ConnectorOutput()
	 * @see stl.Connector#getIsOutput
	 * @model opposite="isOutput"
	 * @generated
	 */
	Connector getConnectorOutput();

	/**
	 * Sets the value of the '{@link stl.Slot#getConnectorOutput <em>Connector Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Output</em>' reference.
	 * @see #getConnectorOutput()
	 * @generated
	 */
	void setConnectorOutput(Connector value);

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
	 * @see stl.StlPackage#getSlot_Itemtype()
	 * @model required="true"
	 * @generated
	 */
	ItemType getItemtype();

	/**
	 * Sets the value of the '{@link stl.Slot#getItemtype <em>Itemtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itemtype</em>' reference.
	 * @see #getItemtype()
	 * @generated
	 */
	void setItemtype(ItemType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see stl.StlPackage#getSlot_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link stl.Slot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Input</em>' attribute.
	 * @see #setIsInput(boolean)
	 * @see stl.StlPackage#getSlot_IsInput()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsInput();

	/**
	 * Sets the value of the '{@link stl.Slot#isIsInput <em>Is Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Input</em>' attribute.
	 * @see #isIsInput()
	 * @generated
	 */
	void setIsInput(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Output</em>' attribute.
	 * @see #setIsOutput(boolean)
	 * @see stl.StlPackage#getSlot_IsOutput()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsOutput();

	/**
	 * Sets the value of the '{@link stl.Slot#isIsOutput <em>Is Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Output</em>' attribute.
	 * @see #isIsOutput()
	 * @generated
	 */
	void setIsOutput(boolean value);

} // Slot
