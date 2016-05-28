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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalValDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'public'", "'private'", "'protected'", "'Entity'", "'{'", "'Name:'", "','", "'Visibility:'", "'}'", "'Super:'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalValDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalValDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalValDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalValDsl.g"; }


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



    // $ANTLR start "entryRuleModel"
    // InternalValDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalValDsl.g:54:1: ( ruleModel EOF )
            // InternalValDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalValDsl.g:62:1: ruleModel : ( ( rule__Model__EntitiesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:66:2: ( ( ( rule__Model__EntitiesAssignment )* ) )
            // InternalValDsl.g:67:2: ( ( rule__Model__EntitiesAssignment )* )
            {
            // InternalValDsl.g:67:2: ( ( rule__Model__EntitiesAssignment )* )
            // InternalValDsl.g:68:3: ( rule__Model__EntitiesAssignment )*
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment()); 
            // InternalValDsl.g:69:3: ( rule__Model__EntitiesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalValDsl.g:69:4: rule__Model__EntitiesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__EntitiesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEntitiesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // InternalValDsl.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalValDsl.g:79:1: ( ruleEntity EOF )
            // InternalValDsl.g:80:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalValDsl.g:87:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:91:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalValDsl.g:92:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalValDsl.g:92:2: ( ( rule__Entity__Group__0 ) )
            // InternalValDsl.g:93:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalValDsl.g:94:3: ( rule__Entity__Group__0 )
            // InternalValDsl.g:94:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "ruleVisibility"
    // InternalValDsl.g:103:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:107:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // InternalValDsl.g:108:2: ( ( rule__Visibility__Alternatives ) )
            {
            // InternalValDsl.g:108:2: ( ( rule__Visibility__Alternatives ) )
            // InternalValDsl.g:109:3: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // InternalValDsl.g:110:3: ( rule__Visibility__Alternatives )
            // InternalValDsl.g:110:4: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Visibility__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "rule__Visibility__Alternatives"
    // InternalValDsl.g:118:1: rule__Visibility__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:122:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalValDsl.g:123:2: ( ( 'public' ) )
                    {
                    // InternalValDsl.g:123:2: ( ( 'public' ) )
                    // InternalValDsl.g:124:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    // InternalValDsl.g:125:3: ( 'public' )
                    // InternalValDsl.g:125:4: 'public'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalValDsl.g:129:2: ( ( 'private' ) )
                    {
                    // InternalValDsl.g:129:2: ( ( 'private' ) )
                    // InternalValDsl.g:130:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    // InternalValDsl.g:131:3: ( 'private' )
                    // InternalValDsl.g:131:4: 'private'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalValDsl.g:135:2: ( ( 'protected' ) )
                    {
                    // InternalValDsl.g:135:2: ( ( 'protected' ) )
                    // InternalValDsl.g:136:3: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                    // InternalValDsl.g:137:3: ( 'protected' )
                    // InternalValDsl.g:137:4: 'protected'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visibility__Alternatives"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalValDsl.g:145:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:149:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalValDsl.g:150:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalValDsl.g:157:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:161:1: ( ( 'Entity' ) )
            // InternalValDsl.g:162:1: ( 'Entity' )
            {
            // InternalValDsl.g:162:1: ( 'Entity' )
            // InternalValDsl.g:163:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalValDsl.g:172:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:176:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalValDsl.g:177:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalValDsl.g:184:1: rule__Entity__Group__1__Impl : ( '{' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:188:1: ( ( '{' ) )
            // InternalValDsl.g:189:1: ( '{' )
            {
            // InternalValDsl.g:189:1: ( '{' )
            // InternalValDsl.g:190:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalValDsl.g:199:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:203:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalValDsl.g:204:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalValDsl.g:211:1: rule__Entity__Group__2__Impl : ( 'Name:' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:215:1: ( ( 'Name:' ) )
            // InternalValDsl.g:216:1: ( 'Name:' )
            {
            // InternalValDsl.g:216:1: ( 'Name:' )
            // InternalValDsl.g:217:2: 'Name:'
            {
             before(grammarAccess.getEntityAccess().getNameKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalValDsl.g:226:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:230:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalValDsl.g:231:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalValDsl.g:238:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__NameAssignment_3 ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:242:1: ( ( ( rule__Entity__NameAssignment_3 ) ) )
            // InternalValDsl.g:243:1: ( ( rule__Entity__NameAssignment_3 ) )
            {
            // InternalValDsl.g:243:1: ( ( rule__Entity__NameAssignment_3 ) )
            // InternalValDsl.g:244:2: ( rule__Entity__NameAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_3()); 
            // InternalValDsl.g:245:2: ( rule__Entity__NameAssignment_3 )
            // InternalValDsl.g:245:3: rule__Entity__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalValDsl.g:253:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:257:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalValDsl.g:258:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalValDsl.g:265:1: rule__Entity__Group__4__Impl : ( ',' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:269:1: ( ( ',' ) )
            // InternalValDsl.g:270:1: ( ',' )
            {
            // InternalValDsl.g:270:1: ( ',' )
            // InternalValDsl.g:271:2: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalValDsl.g:280:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:284:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalValDsl.g:285:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalValDsl.g:292:1: rule__Entity__Group__5__Impl : ( 'Visibility:' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:296:1: ( ( 'Visibility:' ) )
            // InternalValDsl.g:297:1: ( 'Visibility:' )
            {
            // InternalValDsl.g:297:1: ( 'Visibility:' )
            // InternalValDsl.g:298:2: 'Visibility:'
            {
             before(grammarAccess.getEntityAccess().getVisibilityKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getVisibilityKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // InternalValDsl.g:307:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:311:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // InternalValDsl.g:312:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // InternalValDsl.g:319:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__VisibilityAssignment_6 ) ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:323:1: ( ( ( rule__Entity__VisibilityAssignment_6 ) ) )
            // InternalValDsl.g:324:1: ( ( rule__Entity__VisibilityAssignment_6 ) )
            {
            // InternalValDsl.g:324:1: ( ( rule__Entity__VisibilityAssignment_6 ) )
            // InternalValDsl.g:325:2: ( rule__Entity__VisibilityAssignment_6 )
            {
             before(grammarAccess.getEntityAccess().getVisibilityAssignment_6()); 
            // InternalValDsl.g:326:2: ( rule__Entity__VisibilityAssignment_6 )
            // InternalValDsl.g:326:3: rule__Entity__VisibilityAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Entity__VisibilityAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getVisibilityAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group__7"
    // InternalValDsl.g:334:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl rule__Entity__Group__8 ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:338:1: ( rule__Entity__Group__7__Impl rule__Entity__Group__8 )
            // InternalValDsl.g:339:2: rule__Entity__Group__7__Impl rule__Entity__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // InternalValDsl.g:346:1: rule__Entity__Group__7__Impl : ( ( rule__Entity__Group_7__0 )? ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:350:1: ( ( ( rule__Entity__Group_7__0 )? ) )
            // InternalValDsl.g:351:1: ( ( rule__Entity__Group_7__0 )? )
            {
            // InternalValDsl.g:351:1: ( ( rule__Entity__Group_7__0 )? )
            // InternalValDsl.g:352:2: ( rule__Entity__Group_7__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_7()); 
            // InternalValDsl.g:353:2: ( rule__Entity__Group_7__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalValDsl.g:353:3: rule__Entity__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group__8"
    // InternalValDsl.g:361:1: rule__Entity__Group__8 : rule__Entity__Group__8__Impl ;
    public final void rule__Entity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:365:1: ( rule__Entity__Group__8__Impl )
            // InternalValDsl.g:366:2: rule__Entity__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__8"


    // $ANTLR start "rule__Entity__Group__8__Impl"
    // InternalValDsl.g:372:1: rule__Entity__Group__8__Impl : ( '}' ) ;
    public final void rule__Entity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:376:1: ( ( '}' ) )
            // InternalValDsl.g:377:1: ( '}' )
            {
            // InternalValDsl.g:377:1: ( '}' )
            // InternalValDsl.g:378:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__8__Impl"


    // $ANTLR start "rule__Entity__Group_7__0"
    // InternalValDsl.g:388:1: rule__Entity__Group_7__0 : rule__Entity__Group_7__0__Impl rule__Entity__Group_7__1 ;
    public final void rule__Entity__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:392:1: ( rule__Entity__Group_7__0__Impl rule__Entity__Group_7__1 )
            // InternalValDsl.g:393:2: rule__Entity__Group_7__0__Impl rule__Entity__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__Entity__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_7__0"


    // $ANTLR start "rule__Entity__Group_7__0__Impl"
    // InternalValDsl.g:400:1: rule__Entity__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:404:1: ( ( ',' ) )
            // InternalValDsl.g:405:1: ( ',' )
            {
            // InternalValDsl.g:405:1: ( ',' )
            // InternalValDsl.g:406:2: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_7_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_7__0__Impl"


    // $ANTLR start "rule__Entity__Group_7__1"
    // InternalValDsl.g:415:1: rule__Entity__Group_7__1 : rule__Entity__Group_7__1__Impl rule__Entity__Group_7__2 ;
    public final void rule__Entity__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:419:1: ( rule__Entity__Group_7__1__Impl rule__Entity__Group_7__2 )
            // InternalValDsl.g:420:2: rule__Entity__Group_7__1__Impl rule__Entity__Group_7__2
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_7__1"


    // $ANTLR start "rule__Entity__Group_7__1__Impl"
    // InternalValDsl.g:427:1: rule__Entity__Group_7__1__Impl : ( 'Super:' ) ;
    public final void rule__Entity__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:431:1: ( ( 'Super:' ) )
            // InternalValDsl.g:432:1: ( 'Super:' )
            {
            // InternalValDsl.g:432:1: ( 'Super:' )
            // InternalValDsl.g:433:2: 'Super:'
            {
             before(grammarAccess.getEntityAccess().getSuperKeyword_7_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSuperKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_7__1__Impl"


    // $ANTLR start "rule__Entity__Group_7__2"
    // InternalValDsl.g:442:1: rule__Entity__Group_7__2 : rule__Entity__Group_7__2__Impl ;
    public final void rule__Entity__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:446:1: ( rule__Entity__Group_7__2__Impl )
            // InternalValDsl.g:447:2: rule__Entity__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_7__2"


    // $ANTLR start "rule__Entity__Group_7__2__Impl"
    // InternalValDsl.g:453:1: rule__Entity__Group_7__2__Impl : ( ( rule__Entity__SuperEntityAssignment_7_2 ) ) ;
    public final void rule__Entity__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:457:1: ( ( ( rule__Entity__SuperEntityAssignment_7_2 ) ) )
            // InternalValDsl.g:458:1: ( ( rule__Entity__SuperEntityAssignment_7_2 ) )
            {
            // InternalValDsl.g:458:1: ( ( rule__Entity__SuperEntityAssignment_7_2 ) )
            // InternalValDsl.g:459:2: ( rule__Entity__SuperEntityAssignment_7_2 )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityAssignment_7_2()); 
            // InternalValDsl.g:460:2: ( rule__Entity__SuperEntityAssignment_7_2 )
            // InternalValDsl.g:460:3: rule__Entity__SuperEntityAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperEntityAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperEntityAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_7__2__Impl"


    // $ANTLR start "rule__Model__EntitiesAssignment"
    // InternalValDsl.g:469:1: rule__Model__EntitiesAssignment : ( ruleEntity ) ;
    public final void rule__Model__EntitiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:473:1: ( ( ruleEntity ) )
            // InternalValDsl.g:474:2: ( ruleEntity )
            {
            // InternalValDsl.g:474:2: ( ruleEntity )
            // InternalValDsl.g:475:3: ruleEntity
            {
             before(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EntitiesAssignment"


    // $ANTLR start "rule__Entity__NameAssignment_3"
    // InternalValDsl.g:484:1: rule__Entity__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:488:1: ( ( RULE_ID ) )
            // InternalValDsl.g:489:2: ( RULE_ID )
            {
            // InternalValDsl.g:489:2: ( RULE_ID )
            // InternalValDsl.g:490:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_3"


    // $ANTLR start "rule__Entity__VisibilityAssignment_6"
    // InternalValDsl.g:499:1: rule__Entity__VisibilityAssignment_6 : ( ruleVisibility ) ;
    public final void rule__Entity__VisibilityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:503:1: ( ( ruleVisibility ) )
            // InternalValDsl.g:504:2: ( ruleVisibility )
            {
            // InternalValDsl.g:504:2: ( ruleVisibility )
            // InternalValDsl.g:505:3: ruleVisibility
            {
             before(grammarAccess.getEntityAccess().getVisibilityVisibilityEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getVisibilityVisibilityEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__VisibilityAssignment_6"


    // $ANTLR start "rule__Entity__SuperEntityAssignment_7_2"
    // InternalValDsl.g:514:1: rule__Entity__SuperEntityAssignment_7_2 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperEntityAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalValDsl.g:518:1: ( ( ( RULE_ID ) ) )
            // InternalValDsl.g:519:2: ( ( RULE_ID ) )
            {
            // InternalValDsl.g:519:2: ( ( RULE_ID ) )
            // InternalValDsl.g:520:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_7_2_0()); 
            // InternalValDsl.g:521:3: ( RULE_ID )
            // InternalValDsl.g:522:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_7_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_7_2_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperEntityAssignment_7_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});

}