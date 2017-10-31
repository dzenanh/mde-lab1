/**
 */
package stl.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import stl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see stl.StlPackage
 * @generated
 */
public class StlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StlValidator INSTANCE = new StlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "stl";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StlValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return StlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case StlPackage.PRODUCT_LINE:
			return validateProductLine((ProductLine) value, diagnostics, context);
		case StlPackage.AREA:
			return validateArea((Area) value, diagnostics, context);
		case StlPackage.ITEM_TYPE:
			return validateItemType((ItemType) value, diagnostics, context);
		case StlPackage.COMPONENT:
			return validateComponent((Component) value, diagnostics, context);
		case StlPackage.CONNECTOR:
			return validateConnector((Connector) value, diagnostics, context);
		case StlPackage.SLOT:
			return validateSlot((Slot) value, diagnostics, context);
		case StlPackage.SERVICE:
			return validateService((Service) value, diagnostics, context);
		case StlPackage.PARAMETER:
			return validateParameter((Parameter) value, diagnostics, context);
		case StlPackage.MACHINE:
			return validateMachine((Machine) value, diagnostics, context);
		case StlPackage.BUFFER:
			return validateBuffer((Buffer) value, diagnostics, context);
		case StlPackage.STORE:
			return validateStore((Store) value, diagnostics, context);
		case StlPackage.ITEM_GENERATOR:
			return validateItemGenerator((ItemGenerator) value, diagnostics, context);
		case StlPackage.CONVEYOR:
			return validateConveyor((Conveyor) value, diagnostics, context);
		case StlPackage.PRODUCTION_STORE:
			return validateProductionStore((ProductionStore) value, diagnostics, context);
		case StlPackage.WASTE_STORE:
			return validateWasteStore((WasteStore) value, diagnostics, context);
		case StlPackage.TURN_TABLE:
			return validateTurnTable((TurnTable) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductLine(ProductLine productLine, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(productLine, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(productLine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(productLine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(productLine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(productLine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(productLine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(productLine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(productLine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(productLine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProductLine_hasItemType(productLine, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the hasItemType constraint of '<em>Product Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRODUCT_LINE__HAS_ITEM_TYPE__EEXPRESSION = "\n"
			+ "\t\t\tself.itemtype -> size() > 1 ";

	/**
	 * Validates the hasItemType constraint of '<em>Product Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductLine_hasItemType(ProductLine productLine, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.PRODUCT_LINE, productLine, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "hasItemType",
				PRODUCT_LINE__HAS_ITEM_TYPE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArea(Area area, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(area, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(area, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(area, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(area, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(area, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(area, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(area, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(area, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(area, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateArea_UniqueName(area, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueName constraint of '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AREA__UNIQUE_NAME__EEXPRESSION = "\n"
			+ "\t\t\tArea.allInstances() -> select(e | e.name = self.name ) -> excluding(self)  -> isEmpty()";

	/**
	 * Validates the UniqueName constraint of '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArea_UniqueName(Area area, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(StlPackage.Literals.AREA, area, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UniqueName", AREA__UNIQUE_NAME__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemType(ItemType itemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(component, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ServiceAvailailability(component, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ServiceAvailailability constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT__SERVICE_AVAILAILABILITY__EEXPRESSION = "\n"
			+ "\t\t\tself.service -> forAll(e1 | e1.reliability > 0.0)";

	/**
	 * Validates the ServiceAvailailability constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent_ServiceAvailailability(Component component, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.COMPONENT, component, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ServiceAvailailability",
				COMPONENT__SERVICE_AVAILAILABILITY__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connector, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConnector_SlotHasSameInputOutputTypeItemType(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConnector_SlotHasDifferentComponentInputAndOutput(connector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SlotHasSameInputOutputTypeItemType constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR__SLOT_HAS_SAME_INPUT_OUTPUT_TYPE_ITEM_TYPE__EEXPRESSION = "\n"
			+ "\t\t\tself.isInput.itemtype = self.isOutput.itemtype";

	/**
	 * Validates the SlotHasSameInputOutputTypeItemType constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector_SlotHasSameInputOutputTypeItemType(Connector connector,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(StlPackage.Literals.CONNECTOR, connector, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "SlotHasSameInputOutputTypeItemType",
				CONNECTOR__SLOT_HAS_SAME_INPUT_OUTPUT_TYPE_ITEM_TYPE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * The cached validation expression for the SlotHasDifferentComponentInputAndOutput constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR__SLOT_HAS_DIFFERENT_COMPONENT_INPUT_AND_OUTPUT__EEXPRESSION = "\n"
			+ "\t\t\tself.isInput <> self.isOutput";

	/**
	 * Validates the SlotHasDifferentComponentInputAndOutput constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector_SlotHasDifferentComponentInputAndOutput(Connector connector,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(StlPackage.Literals.CONNECTOR, connector, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "SlotHasDifferentComponentInputAndOutput",
				CONNECTOR__SLOT_HAS_DIFFERENT_COMPONENT_INPUT_AND_OUTPUT__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlot(Slot slot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(service, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine(Machine machine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(machine, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ServiceAvailailability(machine, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuffer(Buffer buffer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(buffer, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ServiceAvailailability(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBuffer_OneInputSlotAndOneOutputSlot(buffer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OneInputSlotAndOneOutputSlot constraint of '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BUFFER__ONE_INPUT_SLOT_AND_ONE_OUTPUT_SLOT__EEXPRESSION = "\n"
			+ "\t\t\tself.slot -> select(e | e.isInput = true) -> size()=1 and self.slot -> select(e | e.isOutput = true) ->size()=1";

	/**
	 * Validates the OneInputSlotAndOneOutputSlot constraint of '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuffer_OneInputSlotAndOneOutputSlot(Buffer buffer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.BUFFER, buffer, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "OneInputSlotAndOneOutputSlot",
				BUFFER__ONE_INPUT_SLOT_AND_ONE_OUTPUT_SLOT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStore(Store store, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(store, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(store, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ServiceAvailailability(store, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemGenerator(ItemGenerator itemGenerator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(itemGenerator, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ServiceAvailailability(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateItemGenerator_ItemProducedSameAsOutput(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateItemGenerator_NoInputSlots(itemGenerator, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ItemProducedSameAsOutput constraint of '<em>Item Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ITEM_GENERATOR__ITEM_PRODUCED_SAME_AS_OUTPUT__EEXPRESSION = "\n"
			+ "\t\t self.slot -> select(e | e.isOutput = true) -> forAll(e | e.itemtype = self.itemtype)\n" + "\t\t";

	/**
	 * Validates the ItemProducedSameAsOutput constraint of '<em>Item Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemGenerator_ItemProducedSameAsOutput(ItemGenerator itemGenerator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(StlPackage.Literals.ITEM_GENERATOR, itemGenerator, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ItemProducedSameAsOutput",
				ITEM_GENERATOR__ITEM_PRODUCED_SAME_AS_OUTPUT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the NoInputSlots constraint of '<em>Item Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ITEM_GENERATOR__NO_INPUT_SLOTS__EEXPRESSION = "\n"
			+ "\t\t\tself.slot -> select(e | e.isInput = true) -> size()=0";

	/**
	 * Validates the NoInputSlots constraint of '<em>Item Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemGenerator_NoInputSlots(ItemGenerator itemGenerator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.ITEM_GENERATOR, itemGenerator, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NoInputSlots",
				ITEM_GENERATOR__NO_INPUT_SLOTS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConveyor(Conveyor conveyor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conveyor, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ServiceAvailailability(conveyor, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductionStore(ProductionStore productionStore, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(productionStore, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(productionStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(productionStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(productionStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(productionStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(productionStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(productionStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(productionStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(productionStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ServiceAvailailability(productionStore, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWasteStore(WasteStore wasteStore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wasteStore, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ServiceAvailailability(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateWasteStore_NoOutputSlots(wasteStore, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NoOutputSlots constraint of '<em>Waste Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WASTE_STORE__NO_OUTPUT_SLOTS__EEXPRESSION = "\n"
			+ "\t\t\tself.slot -> select(e | e.isOutput = true) -> size()=0";

	/**
	 * Validates the NoOutputSlots constraint of '<em>Waste Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWasteStore_NoOutputSlots(WasteStore wasteStore, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.WASTE_STORE, wasteStore, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NoOutputSlots",
				WASTE_STORE__NO_OUTPUT_SLOTS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnTable(TurnTable turnTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(turnTable, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(turnTable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(turnTable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(turnTable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(turnTable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(turnTable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(turnTable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(turnTable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(turnTable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ServiceAvailailability(turnTable, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //StlValidator
