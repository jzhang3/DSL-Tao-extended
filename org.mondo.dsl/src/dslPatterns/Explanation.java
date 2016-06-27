/**
 */
package dslPatterns;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslPatterns.Explanation#getAuthors <em>Authors</em>}</li>
 *   <li>{@link dslPatterns.Explanation#getDate <em>Date</em>}</li>
 *   <li>{@link dslPatterns.Explanation#getVersion <em>Version</em>}</li>
 *   <li>{@link dslPatterns.Explanation#getProblem <em>Problem</em>}</li>
 *   <li>{@link dslPatterns.Explanation#getContext <em>Context</em>}</li>
 *   <li>{@link dslPatterns.Explanation#getConsequence <em>Consequence</em>}</li>
 * </ul>
 *
 * @see dslPatterns.DslPatternsPackage#getExplanation()
 * @model
 * @generated
 */
public interface Explanation extends EObject {
	/**
	 * Returns the value of the '<em><b>Authors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' containment reference.
	 * @see #setAuthors(Authors)
	 * @see dslPatterns.DslPatternsPackage#getExplanation_Authors()
	 * @model containment="true"
	 * @generated
	 */
	Authors getAuthors();

	/**
	 * Sets the value of the '{@link dslPatterns.Explanation#getAuthors <em>Authors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authors</em>' containment reference.
	 * @see #getAuthors()
	 * @generated
	 */
	void setAuthors(Authors value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see dslPatterns.DslPatternsPackage#getExplanation_Date()
	 * @model containment="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link dslPatterns.Explanation#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(Version)
	 * @see dslPatterns.DslPatternsPackage#getExplanation_Version()
	 * @model containment="true"
	 * @generated
	 */
	Version getVersion();

	/**
	 * Sets the value of the '{@link dslPatterns.Explanation#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Problem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem</em>' containment reference.
	 * @see #setProblem(Problem)
	 * @see dslPatterns.DslPatternsPackage#getExplanation_Problem()
	 * @model containment="true"
	 * @generated
	 */
	Problem getProblem();

	/**
	 * Sets the value of the '{@link dslPatterns.Explanation#getProblem <em>Problem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem</em>' containment reference.
	 * @see #getProblem()
	 * @generated
	 */
	void setProblem(Problem value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(Context)
	 * @see dslPatterns.DslPatternsPackage#getExplanation_Context()
	 * @model containment="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link dslPatterns.Explanation#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Consequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequence</em>' containment reference.
	 * @see #setConsequence(Consequence)
	 * @see dslPatterns.DslPatternsPackage#getExplanation_Consequence()
	 * @model containment="true"
	 * @generated
	 */
	Consequence getConsequence();

	/**
	 * Sets the value of the '{@link dslPatterns.Explanation#getConsequence <em>Consequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequence</em>' containment reference.
	 * @see #getConsequence()
	 * @generated
	 */
	void setConsequence(Consequence value);

} // Explanation
