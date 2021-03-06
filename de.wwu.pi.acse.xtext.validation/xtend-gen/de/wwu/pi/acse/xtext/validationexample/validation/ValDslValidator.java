/**
 * generated by Xtext 2.9.2
 */
package de.wwu.pi.acse.xtext.validationexample.validation;

import de.wwu.pi.acse.xtext.validationexample.valDsl.Entity;
import de.wwu.pi.acse.xtext.validationexample.valDsl.ValDslPackage;
import de.wwu.pi.acse.xtext.validationexample.validation.AbstractValDslValidator;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class ValDslValidator extends AbstractValDslValidator {
  @Check
  public void checkNameStartsWithCapital(final Entity entity) {
    String _name = entity.getName();
    char _charAt = _name.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("Name should start with a capital", 
        ValDslPackage.Literals.ENTITY__NAME);
    }
  }
}
