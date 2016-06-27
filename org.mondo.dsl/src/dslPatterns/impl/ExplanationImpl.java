/**
 */
package dslPatterns.impl;

import dslPatterns.Authors;
import dslPatterns.Consequence;
import dslPatterns.Context;
import dslPatterns.Date;
import dslPatterns.DslPatternsPackage;
import dslPatterns.Explanation;

import dslPatterns.Problem;
import dslPatterns.Version;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslPatterns.impl.ExplanationImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link dslPatterns.impl.ExplanationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link dslPatterns.impl.ExplanationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link dslPatterns.impl.ExplanationImpl#getProblem <em>Problem</em>}</li>
 *   <li>{@link dslPatterns.impl.ExplanationImpl#getContext <em>Context</em>}</li>
 *   <li>{@link dslPatterns.impl.ExplanationImpl#getConsequence <em>Consequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationImpl extends EObjectImpl implements Explanation {
	/**
	 * The cached value of the '{@link #getAuthors() <em>Authors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected Authors authors;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Version version;

	/**
	 * The cached value of the '{@link #getProblem() <em>Problem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblem()
	 * @generated
	 * @ordered
	 */
	protected Problem problem;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Context context;

	/**
	 * The cached value of the '{@link #getConsequence() <em>Consequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequence()
	 * @generated
	 * @ordered
	 */
	protected Consequence consequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPatternsPackage.Literals.EXPLANATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authors getAuthors() {
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthors(Authors newAuthors, NotificationChain msgs) {
		Authors oldAuthors = authors;
		authors = newAuthors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPatternsPackage.EXPLANATION__AUTHORS, oldAuthors, newAuthors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthors(Authors newAuthors) {
		if (newAuthors != authors) {
			NotificationChain msgs = null;
			if (authors != null)
				msgs = ((InternalEObject)authors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPatternsPackage.EXPLANATION__AUTHORS, null, msgs);
			if (newAuthors != null)
				msgs = ((InternalEObject)newAuthors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPatternsPackage.EXPLANATION__AUTHORS, null, msgs);
			msgs = basicSetAuthors(newAuthors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPatternsPackage.EXPLANATION__AUTHORS, newAuthors, newAuthors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(Date newDate, NotificationChain msgs) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPatternsPackage.EXPLANATION__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPatternsPackage.EXPLANATION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPatternsPackage.EXPLANATION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPatternsPackage.EXPLANATION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(Version newVersion, NotificationChain msgs) {
		Version oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPatternsPackage.EXPLANATION__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(Version newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPatternsPackage.EXPLANATION__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPatternsPackage.EXPLANATION__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPatternsPackage.EXPLANATION__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Problem getProblem() {
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProblem(Problem newProblem, NotificationChain msgs) {
		Problem oldProblem = problem;
		problem = newProblem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPatternsPackage.EXPLANATION__PROBLEM, oldProblem, newProblem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblem(Problem newProblem) {
		if (newProblem != problem) {
			NotificationChain msgs = null;
			if (problem != null)
				msgs = ((InternalEObject)problem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPatternsPackage.EXPLANATION__PROBLEM, null, msgs);
			if (newProblem != null)
				msgs = ((InternalEObject)newProblem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPatternsPackage.EXPLANATION__PROBLEM, null, msgs);
			msgs = basicSetProblem(newProblem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPatternsPackage.EXPLANATION__PROBLEM, newProblem, newProblem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Context newContext, NotificationChain msgs) {
		Context oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPatternsPackage.EXPLANATION__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Context newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPatternsPackage.EXPLANATION__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPatternsPackage.EXPLANATION__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPatternsPackage.EXPLANATION__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consequence getConsequence() {
		return consequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsequence(Consequence newConsequence, NotificationChain msgs) {
		Consequence oldConsequence = consequence;
		consequence = newConsequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPatternsPackage.EXPLANATION__CONSEQUENCE, oldConsequence, newConsequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsequence(Consequence newConsequence) {
		if (newConsequence != consequence) {
			NotificationChain msgs = null;
			if (consequence != null)
				msgs = ((InternalEObject)consequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPatternsPackage.EXPLANATION__CONSEQUENCE, null, msgs);
			if (newConsequence != null)
				msgs = ((InternalEObject)newConsequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPatternsPackage.EXPLANATION__CONSEQUENCE, null, msgs);
			msgs = basicSetConsequence(newConsequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPatternsPackage.EXPLANATION__CONSEQUENCE, newConsequence, newConsequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslPatternsPackage.EXPLANATION__AUTHORS:
				return basicSetAuthors(null, msgs);
			case DslPatternsPackage.EXPLANATION__DATE:
				return basicSetDate(null, msgs);
			case DslPatternsPackage.EXPLANATION__VERSION:
				return basicSetVersion(null, msgs);
			case DslPatternsPackage.EXPLANATION__PROBLEM:
				return basicSetProblem(null, msgs);
			case DslPatternsPackage.EXPLANATION__CONTEXT:
				return basicSetContext(null, msgs);
			case DslPatternsPackage.EXPLANATION__CONSEQUENCE:
				return basicSetConsequence(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPatternsPackage.EXPLANATION__AUTHORS:
				return getAuthors();
			case DslPatternsPackage.EXPLANATION__DATE:
				return getDate();
			case DslPatternsPackage.EXPLANATION__VERSION:
				return getVersion();
			case DslPatternsPackage.EXPLANATION__PROBLEM:
				return getProblem();
			case DslPatternsPackage.EXPLANATION__CONTEXT:
				return getContext();
			case DslPatternsPackage.EXPLANATION__CONSEQUENCE:
				return getConsequence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DslPatternsPackage.EXPLANATION__AUTHORS:
				setAuthors((Authors)newValue);
				return;
			case DslPatternsPackage.EXPLANATION__DATE:
				setDate((Date)newValue);
				return;
			case DslPatternsPackage.EXPLANATION__VERSION:
				setVersion((Version)newValue);
				return;
			case DslPatternsPackage.EXPLANATION__PROBLEM:
				setProblem((Problem)newValue);
				return;
			case DslPatternsPackage.EXPLANATION__CONTEXT:
				setContext((Context)newValue);
				return;
			case DslPatternsPackage.EXPLANATION__CONSEQUENCE:
				setConsequence((Consequence)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DslPatternsPackage.EXPLANATION__AUTHORS:
				setAuthors((Authors)null);
				return;
			case DslPatternsPackage.EXPLANATION__DATE:
				setDate((Date)null);
				return;
			case DslPatternsPackage.EXPLANATION__VERSION:
				setVersion((Version)null);
				return;
			case DslPatternsPackage.EXPLANATION__PROBLEM:
				setProblem((Problem)null);
				return;
			case DslPatternsPackage.EXPLANATION__CONTEXT:
				setContext((Context)null);
				return;
			case DslPatternsPackage.EXPLANATION__CONSEQUENCE:
				setConsequence((Consequence)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DslPatternsPackage.EXPLANATION__AUTHORS:
				return authors != null;
			case DslPatternsPackage.EXPLANATION__DATE:
				return date != null;
			case DslPatternsPackage.EXPLANATION__VERSION:
				return version != null;
			case DslPatternsPackage.EXPLANATION__PROBLEM:
				return problem != null;
			case DslPatternsPackage.EXPLANATION__CONTEXT:
				return context != null;
			case DslPatternsPackage.EXPLANATION__CONSEQUENCE:
				return consequence != null;
		}
		return super.eIsSet(featureID);
	}

} //ExplanationImpl
