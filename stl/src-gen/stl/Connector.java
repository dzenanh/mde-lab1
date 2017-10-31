/**
 */
package stl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.Connector#getIsInput <em>Is Input</em>}</li>
 *   <li>{@link stl.Connector#getIsOutput <em>Is Output</em>}</li>
 *   <li>{@link stl.Connector#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SlotHasSameInputOutputTypeItemType SlotHasDifferentComponentInputAndOutput'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SlotHasSameInputOutputTypeItemType='\n\t\t\tself.isInput.itemtype = self.isOutput.itemtype' SlotHasDifferentComponentInputAndOutput='\n\t\t\tself.isInput &lt;&gt; self.isOutput'"
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Input</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link stl.Slot#getConnectorInput <em>Connector Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Input</em>' reference.
	 * @see #setIsInput(Slot)
	 * @see stl.StlPackage#getConnector_IsInput()
	 * @see stl.Slot#getConnectorInput
	 * @model opposite="connectorInput" required="true"
	 * @generated
	 */
	Slot getIsInput();

	/**
	 * Sets the value of the '{@link stl.Connector#getIsInput <em>Is Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Input</em>' reference.
	 * @see #getIsInput()
	 * @generated
	 */
	void setIsInput(Slot value);

	/**
	 * Returns the value of the '<em><b>Is Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link stl.Slot#getConnectorOutput <em>Connector Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Output</em>' reference.
	 * @see #setIsOutput(Slot)
	 * @see stl.StlPackage#getConnector_IsOutput()
	 * @see stl.Slot#getConnectorOutput
	 * @model opposite="connectorOutput" required="true"
	 * @generated
	 */
	Slot getIsOutput();

	/**
	 * Sets the value of the '{@link stl.Connector#getIsOutput <em>Is Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Output</em>' reference.
	 * @see #getIsOutput()
	 * @generated
	 */
	void setIsOutput(Slot value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference list.
	 * The list contents are of type {@link stl.Component}.
	 * It is bidirectional and its opposite is '{@link stl.Component#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference list.
	 * @see stl.StlPackage#getConnector_Component()
	 * @see stl.Component#getConnector
	 * @model opposite="connector" lower="2" upper="2"
	 * @generated
	 */
	EList<Component> getComponent();

} // Connector
