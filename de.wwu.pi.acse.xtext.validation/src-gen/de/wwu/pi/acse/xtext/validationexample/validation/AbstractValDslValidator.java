/*
 * generated by Xtext 2.9.2
 */
package de.wwu.pi.acse.xtext.validationexample.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractValDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(de.wwu.pi.acse.xtext.validationexample.valDsl.ValDslPackage.eINSTANCE);
		return result;
	}
	
}
