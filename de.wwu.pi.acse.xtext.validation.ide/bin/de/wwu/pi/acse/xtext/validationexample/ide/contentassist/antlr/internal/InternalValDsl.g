/*
 * generated by Xtext 2.9.2
 */
grammar InternalValDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package de.wwu.pi.acse.xtext.validationexample.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package de.wwu.pi.acse.xtext.validationexample.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.wwu.pi.acse.xtext.validationexample.services.ValDslGrammarAccess;

}
@parser::members {
	private ValDslGrammarAccess grammarAccess;

	public void setGrammarAccess(ValDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getEntitiesAssignment()); }
		(rule__Model__EntitiesAssignment)*
		{ after(grammarAccess.getModelAccess().getEntitiesAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntity
entryRuleEntity
:
{ before(grammarAccess.getEntityRule()); }
	 ruleEntity
{ after(grammarAccess.getEntityRule()); } 
	 EOF 
;

// Rule Entity
ruleEntity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityAccess().getGroup()); }
		(rule__Entity__Group__0)
		{ after(grammarAccess.getEntityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Visibility
ruleVisibility
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVisibilityAccess().getAlternatives()); }
		(rule__Visibility__Alternatives)
		{ after(grammarAccess.getVisibilityAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Visibility__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); }
		('public')
		{ after(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); }
		('private')
		{ after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); }
		('protected')
		{ after(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__0__Impl
	rule__Entity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
	'Entity'
	{ after(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__1__Impl
	rule__Entity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__2__Impl
	rule__Entity__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getNameKeyword_2()); }
	'Name:'
	{ after(grammarAccess.getEntityAccess().getNameKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__3__Impl
	rule__Entity__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getNameAssignment_3()); }
	(rule__Entity__NameAssignment_3)
	{ after(grammarAccess.getEntityAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__4__Impl
	rule__Entity__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getCommaKeyword_4()); }
	','
	{ after(grammarAccess.getEntityAccess().getCommaKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__5__Impl
	rule__Entity__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getVisibilityKeyword_5()); }
	'Visibility:'
	{ after(grammarAccess.getEntityAccess().getVisibilityKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__6__Impl
	rule__Entity__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getVisibilityAssignment_6()); }
	(rule__Entity__VisibilityAssignment_6)
	{ after(grammarAccess.getEntityAccess().getVisibilityAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__7__Impl
	rule__Entity__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getGroup_7()); }
	(rule__Entity__Group_7__0)?
	{ after(grammarAccess.getEntityAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_7__0__Impl
	rule__Entity__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getCommaKeyword_7_0()); }
	','
	{ after(grammarAccess.getEntityAccess().getCommaKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_7__1__Impl
	rule__Entity__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getSuperKeyword_7_1()); }
	'Super:'
	{ after(grammarAccess.getEntityAccess().getSuperKeyword_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_7__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_7__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_7__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getSuperEntityAssignment_7_2()); }
	(rule__Entity__SuperEntityAssignment_7_2)
	{ after(grammarAccess.getEntityAccess().getSuperEntityAssignment_7_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__EntitiesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0()); }
		ruleEntity
		{ after(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__VisibilityAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getVisibilityVisibilityEnumRuleCall_6_0()); }
		ruleVisibility
		{ after(grammarAccess.getEntityAccess().getVisibilityVisibilityEnumRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__SuperEntityAssignment_7_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_7_2_0()); }
		(
			{ before(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_7_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_7_2_0_1()); }
		)
		{ after(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_7_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
