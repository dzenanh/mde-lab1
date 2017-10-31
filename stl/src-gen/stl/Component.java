/**
 */
package stl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.Component#getService <em>Service</em>}</li>
 *   <li>{@link stl.Component#getSlot <em>Slot</em>}</li>
 *   <li>{@link stl.Component#getName <em>Name</em>}</li>
 *   <li>{@link stl.Component#getCosts <em>Costs</em>}</li>
 *   <li>{@link stl.Component#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ServiceAvailailability'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ServiceAvailailability='\n\t\t\tself.service -&gt; forAll(e1 | e1.reliability &gt; 0.0)'"
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link stl.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see stl.StlPackage#getComponent_Service()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference list.
	 * The list contents are of type {@link stl.Slot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference list.
	 * @see stl.StlPackage#getComponent_Slot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Slot> getSlot();

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
	 * @see stl.StlPackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link stl.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Costs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Costs</em>' attribute.
	 * @see #setCosts(double)
	 * @see stl.StlPackage#getComponent_Costs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getCosts();

	/**
	 * Sets the value of the '{@link stl.Component#getCosts <em>Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Costs</em>' attribute.
	 * @see #getCosts()
	 * @generated
	 */
	void setCosts(double value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference list.
	 * The list contents are of type {@link stl.Connector}.
	 * It is bidirectional and its opposite is '{@link stl.Connector#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference list.
	 * @see stl.StlPackage#getComponent_Connector()
	 * @see stl.Connector#getComponent
	 * @model opposite="component"
	 * @generated
	 */
	EList<Connector> getConnector();

} // Component
