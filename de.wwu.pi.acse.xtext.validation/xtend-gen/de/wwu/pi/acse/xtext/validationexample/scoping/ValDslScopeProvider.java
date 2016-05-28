/**
 * generated by Xtext 2.9.2
 */
package de.wwu.pi.acse.xtext.validationexample.scoping;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import de.wwu.pi.acse.xtext.validationexample.scoping.AbstractValDslScopeProvider;
import de.wwu.pi.acse.xtext.validationexample.valDsl.Entity;
import de.wwu.pi.acse.xtext.validationexample.valDsl.ValDslPackage;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.FilteringScope;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class ValDslScopeProvider extends AbstractValDslScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    boolean _and = false;
    if (!(context instanceof Entity)) {
      _and = false;
    } else {
      boolean _equals = Objects.equal(reference, ValDslPackage.Literals.ENTITY__SUPER_ENTITY);
      _and = _equals;
    }
    if (_and) {
      final EObject rootElement = EcoreUtil2.getRootContainer(context);
      final List<Entity> candidates = EcoreUtil2.<Entity>getAllContentsOfType(rootElement, Entity.class);
      final IScope existingScope = Scopes.scopeFor(candidates);
      final Predicate<IEObjectDescription> _function = (IEObjectDescription it) -> {
        EObject _eObjectOrProxy = it.getEObjectOrProxy();
        return (!Objects.equal(_eObjectOrProxy, context));
      };
      return new FilteringScope(existingScope, _function);
    }
    return super.getScope(context, reference);
  }
}