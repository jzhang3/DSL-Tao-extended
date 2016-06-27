/**
 */
package dslPatterns.util;

import dslPatterns.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dslPatterns.DslPatternsPackage
 * @generated
 */
public class DslPatternsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DslPatternsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslPatternsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DslPatternsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DslPatternsSwitch<Adapter> modelSwitch =
		new DslPatternsSwitch<Adapter>() {
			@Override
			public Adapter casePatternSet(PatternSet object) {
				return createPatternSetAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter casePattern(Pattern object) {
				return createPatternAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter casePlug(Plug object) {
				return createPlugAdapter();
			}
			@Override
			public Adapter caseSlot(Slot object) {
				return createSlotAdapter();
			}
			@Override
			public Adapter caseInjector(Injector object) {
				return createInjectorAdapter();
			}
			@Override
			public Adapter caseAcceptor(Acceptor object) {
				return createAcceptorAdapter();
			}
			@Override
			public Adapter caseVariant(Variant object) {
				return createVariantAdapter();
			}
			@Override
			public Adapter caseSimpleFeature(SimpleFeature object) {
				return createSimpleFeatureAdapter();
			}
			@Override
			public Adapter caseComplexFeature(ComplexFeature object) {
				return createComplexFeatureAdapter();
			}
			@Override
			public Adapter casePatternMetaModel(PatternMetaModel object) {
				return createPatternMetaModelAdapter();
			}
			@Override
			public Adapter casePatternMetaModelReference(PatternMetaModelReference object) {
				return createPatternMetaModelReferenceAdapter();
			}
			@Override
			public Adapter caseMetaModel(MetaModel object) {
				return createMetaModelAdapter();
			}
			@Override
			public Adapter caseMMInterface(MMInterface object) {
				return createMMInterfaceAdapter();
			}
			@Override
			public Adapter caseClassInterface(ClassInterface object) {
				return createClassInterfaceAdapter();
			}
			@Override
			public Adapter caseFeatureInterface(FeatureInterface object) {
				return createFeatureInterfaceAdapter();
			}
			@Override
			public Adapter caseFeatureType(FeatureType object) {
				return createFeatureTypeAdapter();
			}
			@Override
			public Adapter caseFeatureInstance(FeatureInstance object) {
				return createFeatureInstanceAdapter();
			}
			@Override
			public Adapter caseReferenceInterface(ReferenceInterface object) {
				return createReferenceInterfaceAdapter();
			}
			@Override
			public Adapter caseComplexFeatureMain(ComplexFeatureMain object) {
				return createComplexFeatureMainAdapter();
			}
			@Override
			public Adapter caseComplexFeatureAttached(ComplexFeatureAttached object) {
				return createComplexFeatureAttachedAdapter();
			}
			@Override
			public Adapter casePatternMetaModelAttached(PatternMetaModelAttached object) {
				return createPatternMetaModelAttachedAdapter();
			}
			@Override
			public Adapter caseClassInterfaceAttached(ClassInterfaceAttached object) {
				return createClassInterfaceAttachedAdapter();
			}
			@Override
			public Adapter caseFeatureInterfaceAttached(FeatureInterfaceAttached object) {
				return createFeatureInterfaceAttachedAdapter();
			}
			@Override
			public Adapter caseReferenceInterfaceAttached(ReferenceInterfaceAttached object) {
				return createReferenceInterfaceAttachedAdapter();
			}
			@Override
			public Adapter caseFeatureTypeAttached(FeatureTypeAttached object) {
				return createFeatureTypeAttachedAdapter();
			}
			@Override
			public Adapter caseFeatureInstanceAttached(FeatureInstanceAttached object) {
				return createFeatureInstanceAttachedAdapter();
			}
			@Override
			public Adapter caseMMInterfaceAttached(MMInterfaceAttached object) {
				return createMMInterfaceAttachedAdapter();
			}
			@Override
			public Adapter caseTagSet(TagSet object) {
				return createTagSetAdapter();
			}
			@Override
			public Adapter caseTag(Tag object) {
				return createTagAdapter();
			}
			@Override
			public Adapter caseCardinalityInterface(CardinalityInterface object) {
				return createCardinalityInterfaceAdapter();
			}
			@Override
			public Adapter caseExplanation(Explanation object) {
				return createExplanationAdapter();
			}
			@Override
			public Adapter caseDate(Date object) {
				return createDateAdapter();
			}
			@Override
			public Adapter caseAuthors(Authors object) {
				return createAuthorsAdapter();
			}
			@Override
			public Adapter caseVersion(Version object) {
				return createVersionAdapter();
			}
			@Override
			public Adapter caseProblem(Problem object) {
				return createProblemAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseConsequence(Consequence object) {
				return createConsequenceAdapter();
			}
			@Override
			public Adapter caseAspects(Aspects object) {
				return createAspectsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.PatternSet <em>Pattern Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.PatternSet
	 * @generated
	 */
	public Adapter createPatternSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.Pattern
	 * @generated
	 */
	public Adapter createPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.Plug <em>Plug</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.Plug
	 * @generated
	 */
	public Adapter createPlugAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.Slot
	 * @generated
	 */
	public Adapter createSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.Injector <em>Injector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.Injector
	 * @generated
	 */
	public Adapter createInjectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.Acceptor <em>Acceptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.Acceptor
	 * @generated
	 */
	public Adapter createAcceptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.Variant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.Variant
	 * @generated
	 */
	public Adapter createVariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.SimpleFeature <em>Simple Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.SimpleFeature
	 * @generated
	 */
	public Adapter createSimpleFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.ComplexFeature <em>Complex Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.ComplexFeature
	 * @generated
	 */
	public Adapter createComplexFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.PatternMetaModel <em>Pattern Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.PatternMetaModel
	 * @generated
	 */
	public Adapter createPatternMetaModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.PatternMetaModelReference <em>Pattern Meta Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.PatternMetaModelReference
	 * @generated
	 */
	public Adapter createPatternMetaModelReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.MetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.MetaModel
	 * @generated
	 */
	public Adapter createMetaModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.MMInterface <em>MM Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.MMInterface
	 * @generated
	 */
	public Adapter createMMInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.ClassInterface <em>Class Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.ClassInterface
	 * @generated
	 */
	public Adapter createClassInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.FeatureInterface <em>Feature Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.FeatureInterface
	 * @generated
	 */
	public Adapter createFeatureInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.FeatureType <em>Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.FeatureType
	 * @generated
	 */
	public Adapter createFeatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.FeatureInstance <em>Feature Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.FeatureInstance
	 * @generated
	 */
	public Adapter createFeatureInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.ReferenceInterface <em>Reference Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.ReferenceInterface
	 * @generated
	 */
	public Adapter createReferenceInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.ComplexFeatureMain <em>Complex Feature Main</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.ComplexFeatureMain
	 * @generated
	 */
	public Adapter createComplexFeatureMainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.ComplexFeatureAttached <em>Complex Feature Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.ComplexFeatureAttached
	 * @generated
	 */
	public Adapter createComplexFeatureAttachedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.PatternMetaModelAttached <em>Pattern Meta Model Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.PatternMetaModelAttached
	 * @generated
	 */
	public Adapter createPatternMetaModelAttachedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.ClassInterfaceAttached <em>Class Interface Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.ClassInterfaceAttached
	 * @generated
	 */
	public Adapter createClassInterfaceAttachedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.FeatureInterfaceAttached <em>Feature Interface Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.FeatureInterfaceAttached
	 * @generated
	 */
	public Adapter createFeatureInterfaceAttachedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.ReferenceInterfaceAttached <em>Reference Interface Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.ReferenceInterfaceAttached
	 * @generated
	 */
	public Adapter createReferenceInterfaceAttachedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.FeatureTypeAttached <em>Feature Type Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.FeatureTypeAttached
	 * @generated
	 */
	public Adapter createFeatureTypeAttachedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.FeatureInstanceAttached <em>Feature Instance Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.FeatureInstanceAttached
	 * @generated
	 */
	public Adapter createFeatureInstanceAttachedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.MMInterfaceAttached <em>MM Interface Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.MMInterfaceAttached
	 * @generated
	 */
	public Adapter createMMInterfaceAttachedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.TagSet <em>Tag Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.TagSet
	 * @generated
	 */
	public Adapter createTagSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.CardinalityInterface <em>Cardinality Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.CardinalityInterface
	 * @generated
	 */
	public Adapter createCardinalityInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.Explanation <em>Explanation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.Explanation
	 * @generated
	 */
	public Adapter createExplanationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.Date
	 * @generated
	 */
	public Adapter createDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.Authors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.Authors
	 * @generated
	 */
	public Adapter createAuthorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.Version
	 * @generated
	 */
	public Adapter createVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.Problem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.Problem
	 * @generated
	 */
	public Adapter createProblemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.Consequence <em>Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.Consequence
	 * @generated
	 */
	public Adapter createConsequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dslPatterns.Aspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dslPatterns.Aspects
	 * @generated
	 */
	public Adapter createAspectsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DslPatternsAdapterFactory
