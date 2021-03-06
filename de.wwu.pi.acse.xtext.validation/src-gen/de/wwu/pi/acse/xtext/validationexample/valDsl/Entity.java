/**
 * generated by Xtext 2.9.2
 */
package de.wwu.pi.acse.xtext.validationexample.valDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.wwu.pi.acse.xtext.validationexample.valDsl.Entity#getName <em>Name</em>}</li>
 *   <li>{@link de.wwu.pi.acse.xtext.validationexample.valDsl.Entity#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.wwu.pi.acse.xtext.validationexample.valDsl.Entity#getSuperEntity <em>Super Entity</em>}</li>
 * </ul>
 *
 * @see de.wwu.pi.acse.xtext.validationexample.valDsl.ValDslPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject
{
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
   * @see de.wwu.pi.acse.xtext.validationexample.valDsl.ValDslPackage#getEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.wwu.pi.acse.xtext.validationexample.valDsl.Entity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link de.wwu.pi.acse.xtext.validationexample.valDsl.Visibility}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see de.wwu.pi.acse.xtext.validationexample.valDsl.Visibility
   * @see #setVisibility(Visibility)
   * @see de.wwu.pi.acse.xtext.validationexample.valDsl.ValDslPackage#getEntity_Visibility()
   * @model
   * @generated
   */
  Visibility getVisibility();

  /**
   * Sets the value of the '{@link de.wwu.pi.acse.xtext.validationexample.valDsl.Entity#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see de.wwu.pi.acse.xtext.validationexample.valDsl.Visibility
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(Visibility value);

  /**
   * Returns the value of the '<em><b>Super Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Entity</em>' reference.
   * @see #setSuperEntity(Entity)
   * @see de.wwu.pi.acse.xtext.validationexample.valDsl.ValDslPackage#getEntity_SuperEntity()
   * @model
   * @generated
   */
  Entity getSuperEntity();

  /**
   * Sets the value of the '{@link de.wwu.pi.acse.xtext.validationexample.valDsl.Entity#getSuperEntity <em>Super Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Entity</em>' reference.
   * @see #getSuperEntity()
   * @generated
   */
  void setSuperEntity(Entity value);

} // Entity
