/**
 */
package dslPatterns.util;

import dslPatterns.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dslPatterns.DslPatternsPackage
 * @generated
 */
public class DslPatternsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DslPatternsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslPatternsSwitch() {
		if (modelPackage == null) {
			modelPackage = DslPatternsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DslPatternsPackage.PATTERN_SET: {
				PatternSet patternSet = (PatternSet)theEObject;
				T result = casePatternSet(patternSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.CATEGORY: {
				Category category = (Category)theEObject;
				T result = caseCategory(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.PATTERN: {
				Pattern pattern = (Pattern)theEObject;
				T result = casePattern(pattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.PLUG: {
				Plug plug = (Plug)theEObject;
				T result = casePlug(plug);
				if (result == null) result = casePort(plug);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.SLOT: {
				Slot slot = (Slot)theEObject;
				T result = caseSlot(slot);
				if (result == null) result = casePort(slot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.INJECTOR: {
				Injector injector = (Injector)theEObject;
				T result = caseInjector(injector);
				if (result == null) result = casePort(injector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.ACCEPTOR: {
				Acceptor acceptor = (Acceptor)theEObject;
				T result = caseAcceptor(acceptor);
				if (result == null) result = casePort(acceptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.VARIANT: {
				Variant variant = (Variant)theEObject;
				T result = caseVariant(variant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.SIMPLE_FEATURE: {
				SimpleFeature simpleFeature = (SimpleFeature)theEObject;
				T result = caseSimpleFeature(simpleFeature);
				if (result == null) result = caseVariant(simpleFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.COMPLEX_FEATURE: {
				ComplexFeature complexFeature = (ComplexFeature)theEObject;
				T result = caseComplexFeature(complexFeature);
				if (result == null) result = caseVariant(complexFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.PATTERN_META_MODEL: {
				PatternMetaModel patternMetaModel = (PatternMetaModel)theEObject;
				T result = casePatternMetaModel(patternMetaModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.PATTERN_META_MODEL_REFERENCE: {
				PatternMetaModelReference patternMetaModelReference = (PatternMetaModelReference)theEObject;
				T result = casePatternMetaModelReference(patternMetaModelReference);
				if (result == null) result = casePatternMetaModel(patternMetaModelReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.META_MODEL: {
				MetaModel metaModel = (MetaModel)theEObject;
				T result = caseMetaModel(metaModel);
				if (result == null) result = casePatternMetaModel(metaModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.MM_INTERFACE: {
				MMInterface mmInterface = (MMInterface)theEObject;
				T result = caseMMInterface(mmInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.CLASS_INTERFACE: {
				ClassInterface classInterface = (ClassInterface)theEObject;
				T result = caseClassInterface(classInterface);
				if (result == null) result = caseMMInterface(classInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.FEATURE_INTERFACE: {
				FeatureInterface featureInterface = (FeatureInterface)theEObject;
				T result = caseFeatureInterface(featureInterface);
				if (result == null) result = caseMMInterface(featureInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.FEATURE_TYPE: {
				FeatureType featureType = (FeatureType)theEObject;
				T result = caseFeatureType(featureType);
				if (result == null) result = caseFeatureInterface(featureType);
				if (result == null) result = caseCardinalityInterface(featureType);
				if (result == null) result = caseMMInterface(featureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.FEATURE_INSTANCE: {
				FeatureInstance featureInstance = (FeatureInstance)theEObject;
				T result = caseFeatureInstance(featureInstance);
				if (result == null) result = caseFeatureInterface(featureInstance);
				if (result == null) result = caseMMInterface(featureInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.REFERENCE_INTERFACE: {
				ReferenceInterface referenceInterface = (ReferenceInterface)theEObject;
				T result = caseReferenceInterface(referenceInterface);
				if (result == null) result = caseMMInterface(referenceInterface);
				if (result == null) result = caseCardinalityInterface(referenceInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.COMPLEX_FEATURE_MAIN: {
				ComplexFeatureMain complexFeatureMain = (ComplexFeatureMain)theEObject;
				T result = caseComplexFeatureMain(complexFeatureMain);
				if (result == null) result = caseComplexFeature(complexFeatureMain);
				if (result == null) result = caseVariant(complexFeatureMain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.COMPLEX_FEATURE_ATTACHED: {
				ComplexFeatureAttached complexFeatureAttached = (ComplexFeatureAttached)theEObject;
				T result = caseComplexFeatureAttached(complexFeatureAttached);
				if (result == null) result = caseComplexFeature(complexFeatureAttached);
				if (result == null) result = caseVariant(complexFeatureAttached);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.PATTERN_META_MODEL_ATTACHED: {
				PatternMetaModelAttached patternMetaModelAttached = (PatternMetaModelAttached)theEObject;
				T result = casePatternMetaModelAttached(patternMetaModelAttached);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.CLASS_INTERFACE_ATTACHED: {
				ClassInterfaceAttached classInterfaceAttached = (ClassInterfaceAttached)theEObject;
				T result = caseClassInterfaceAttached(classInterfaceAttached);
				if (result == null) result = caseMMInterfaceAttached(classInterfaceAttached);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.FEATURE_INTERFACE_ATTACHED: {
				FeatureInterfaceAttached featureInterfaceAttached = (FeatureInterfaceAttached)theEObject;
				T result = caseFeatureInterfaceAttached(featureInterfaceAttached);
				if (result == null) result = caseMMInterfaceAttached(featureInterfaceAttached);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.REFERENCE_INTERFACE_ATTACHED: {
				ReferenceInterfaceAttached referenceInterfaceAttached = (ReferenceInterfaceAttached)theEObject;
				T result = caseReferenceInterfaceAttached(referenceInterfaceAttached);
				if (result == null) result = caseMMInterfaceAttached(referenceInterfaceAttached);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.FEATURE_TYPE_ATTACHED: {
				FeatureTypeAttached featureTypeAttached = (FeatureTypeAttached)theEObject;
				T result = caseFeatureTypeAttached(featureTypeAttached);
				if (result == null) result = caseFeatureInterfaceAttached(featureTypeAttached);
				if (result == null) result = caseMMInterfaceAttached(featureTypeAttached);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.FEATURE_INSTANCE_ATTACHED: {
				FeatureInstanceAttached featureInstanceAttached = (FeatureInstanceAttached)theEObject;
				T result = caseFeatureInstanceAttached(featureInstanceAttached);
				if (result == null) result = caseFeatureInterfaceAttached(featureInstanceAttached);
				if (result == null) result = caseMMInterfaceAttached(featureInstanceAttached);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.MM_INTERFACE_ATTACHED: {
				MMInterfaceAttached mmInterfaceAttached = (MMInterfaceAttached)theEObject;
				T result = caseMMInterfaceAttached(mmInterfaceAttached);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.TAG_SET: {
				TagSet tagSet = (TagSet)theEObject;
				T result = caseTagSet(tagSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.CARDINALITY_INTERFACE: {
				CardinalityInterface cardinalityInterface = (CardinalityInterface)theEObject;
				T result = caseCardinalityInterface(cardinalityInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.EXPLANATION: {
				Explanation explanation = (Explanation)theEObject;
				T result = caseExplanation(explanation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.DATE: {
				Date date = (Date)theEObject;
				T result = caseDate(date);
				if (result == null) result = caseAspects(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.AUTHORS: {
				Authors authors = (Authors)theEObject;
				T result = caseAuthors(authors);
				if (result == null) result = caseAspects(authors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.VERSION: {
				Version version = (Version)theEObject;
				T result = caseVersion(version);
				if (result == null) result = caseAspects(version);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.PROBLEM: {
				Problem problem = (Problem)theEObject;
				T result = caseProblem(problem);
				if (result == null) result = caseAspects(problem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = caseAspects(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.CONSEQUENCE: {
				Consequence consequence = (Consequence)theEObject;
				T result = caseConsequence(consequence);
				if (result == null) result = caseAspects(consequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DslPatternsPackage.ASPECTS: {
				Aspects aspects = (Aspects)theEObject;
				T result = caseAspects(aspects);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternSet(PatternSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern(Pattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plug</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plug</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlug(Plug object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlot(Slot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Injector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Injector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInjector(Injector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acceptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acceptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptor(Acceptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariant(Variant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleFeature(SimpleFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexFeature(ComplexFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Meta Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Meta Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternMetaModel(PatternMetaModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Meta Model Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Meta Model Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternMetaModelReference(PatternMetaModelReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaModel(MetaModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MM Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MM Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMInterface(MMInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassInterface(ClassInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureInterface(FeatureInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureType(FeatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureInstance(FeatureInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceInterface(ReferenceInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Feature Main</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Feature Main</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexFeatureMain(ComplexFeatureMain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Feature Attached</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Feature Attached</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexFeatureAttached(ComplexFeatureAttached object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Meta Model Attached</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Meta Model Attached</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternMetaModelAttached(PatternMetaModelAttached object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Interface Attached</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Interface Attached</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassInterfaceAttached(ClassInterfaceAttached object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Interface Attached</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Interface Attached</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureInterfaceAttached(FeatureInterfaceAttached object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Interface Attached</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Interface Attached</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceInterfaceAttached(ReferenceInterfaceAttached object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Type Attached</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Type Attached</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureTypeAttached(FeatureTypeAttached object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Instance Attached</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Instance Attached</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureInstanceAttached(FeatureInstanceAttached object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MM Interface Attached</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MM Interface Attached</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMInterfaceAttached(MMInterfaceAttached object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagSet(TagSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalityInterface(CardinalityInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explanation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explanation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplanation(Explanation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthors(Authors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersion(Version object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblem(Problem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsequence(Consequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspects</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspects</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAspects(Aspects object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DslPatternsSwitch
