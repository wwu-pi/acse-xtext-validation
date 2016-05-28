package de.wwu.pi.acse.xtext.validationexample.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.wwu.pi.acse.xtext.validationexample.services.ValDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalValDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Entity'", "'{'", "'Name:'", "','", "'Visibility:'", "'Super:'", "'}'", "'public'", "'private'", "'protected'"
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

        public InternalValDslParser(TokenStream input, ValDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ValDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalValDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalValDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalValDsl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalValDsl.g:72:1: ruleModel returns [EObject current=null] : ( (lv_entities_0_0= ruleEntity ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;



        	enterRule();

        try {
            // InternalValDsl.g:78:2: ( ( (lv_entities_0_0= ruleEntity ) )* )
            // InternalValDsl.g:79:2: ( (lv_entities_0_0= ruleEntity ) )*
            {
            // InternalValDsl.g:79:2: ( (lv_entities_0_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalValDsl.g:80:3: (lv_entities_0_0= ruleEntity )
            	    {
            	    // InternalValDsl.g:80:3: (lv_entities_0_0= ruleEntity )
            	    // InternalValDsl.g:81:4: lv_entities_0_0= ruleEntity
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_entities_0_0=ruleEntity();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"entities",
            	    					lv_entities_0_0,
            	    					"de.wwu.pi.acse.xtext.validationexample.ValDsl.Entity");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // InternalValDsl.g:101:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalValDsl.g:101:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalValDsl.g:102:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalValDsl.g:108:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' otherlv_1= '{' otherlv_2= 'Name:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'Visibility:' ( (lv_visibility_6_0= ruleVisibility ) ) (otherlv_7= ',' otherlv_8= 'Super:' ( (otherlv_9= RULE_ID ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_visibility_6_0 = null;



        	enterRule();

        try {
            // InternalValDsl.g:114:2: ( (otherlv_0= 'Entity' otherlv_1= '{' otherlv_2= 'Name:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'Visibility:' ( (lv_visibility_6_0= ruleVisibility ) ) (otherlv_7= ',' otherlv_8= 'Super:' ( (otherlv_9= RULE_ID ) ) )? otherlv_10= '}' ) )
            // InternalValDsl.g:115:2: (otherlv_0= 'Entity' otherlv_1= '{' otherlv_2= 'Name:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'Visibility:' ( (lv_visibility_6_0= ruleVisibility ) ) (otherlv_7= ',' otherlv_8= 'Super:' ( (otherlv_9= RULE_ID ) ) )? otherlv_10= '}' )
            {
            // InternalValDsl.g:115:2: (otherlv_0= 'Entity' otherlv_1= '{' otherlv_2= 'Name:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'Visibility:' ( (lv_visibility_6_0= ruleVisibility ) ) (otherlv_7= ',' otherlv_8= 'Super:' ( (otherlv_9= RULE_ID ) ) )? otherlv_10= '}' )
            // InternalValDsl.g:116:3: otherlv_0= 'Entity' otherlv_1= '{' otherlv_2= 'Name:' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ',' otherlv_5= 'Visibility:' ( (lv_visibility_6_0= ruleVisibility ) ) (otherlv_7= ',' otherlv_8= 'Super:' ( (otherlv_9= RULE_ID ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getNameKeyword_2());
            		
            // InternalValDsl.g:128:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalValDsl.g:129:4: (lv_name_3_0= RULE_ID )
            {
            // InternalValDsl.g:129:4: (lv_name_3_0= RULE_ID )
            // InternalValDsl.g:130:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_3_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getVisibilityKeyword_5());
            		
            // InternalValDsl.g:154:3: ( (lv_visibility_6_0= ruleVisibility ) )
            // InternalValDsl.g:155:4: (lv_visibility_6_0= ruleVisibility )
            {
            // InternalValDsl.g:155:4: (lv_visibility_6_0= ruleVisibility )
            // InternalValDsl.g:156:5: lv_visibility_6_0= ruleVisibility
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getVisibilityVisibilityEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_visibility_6_0=ruleVisibility();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"visibility",
            						lv_visibility_6_0,
            						"de.wwu.pi.acse.xtext.validationexample.ValDsl.Visibility");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalValDsl.g:173:3: (otherlv_7= ',' otherlv_8= 'Super:' ( (otherlv_9= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalValDsl.g:174:4: otherlv_7= ',' otherlv_8= 'Super:' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getCommaKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getSuperKeyword_7_1());
                    			
                    // InternalValDsl.g:182:4: ( (otherlv_9= RULE_ID ) )
                    // InternalValDsl.g:183:5: (otherlv_9= RULE_ID )
                    {
                    // InternalValDsl.g:183:5: (otherlv_9= RULE_ID )
                    // InternalValDsl.g:184:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_7_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "ruleVisibility"
    // InternalValDsl.g:204:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalValDsl.g:210:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) )
            // InternalValDsl.g:211:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            {
            // InternalValDsl.g:211:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalValDsl.g:212:3: (enumLiteral_0= 'public' )
                    {
                    // InternalValDsl.g:212:3: (enumLiteral_0= 'public' )
                    // InternalValDsl.g:213:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalValDsl.g:220:3: (enumLiteral_1= 'private' )
                    {
                    // InternalValDsl.g:220:3: (enumLiteral_1= 'private' )
                    // InternalValDsl.g:221:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalValDsl.g:228:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalValDsl.g:228:3: (enumLiteral_2= 'protected' )
                    // InternalValDsl.g:229:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibility"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});

}