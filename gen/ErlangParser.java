// Generated from C:/Users/Anatoly/IdeaProjects/antlr4/erlang\Erlang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ErlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, TokAtom=65, TokVar=66, 
		TokFloat=67, TokInteger=68, TokChar=69, TokString=70, AttrName=71, Comment=72, 
		WS=73;
	public static final int
		RULE_forms = 0, RULE_form = 1, RULE_tokAtom = 2, RULE_tokVar = 3, RULE_tokFloat = 4, 
		RULE_tokInteger = 5, RULE_tokChar = 6, RULE_tokString = 7, RULE_attribute = 8, 
		RULE_typeSpec = 9, RULE_specFun = 10, RULE_typedAttrVal = 11, RULE_typedRecordFields = 12, 
		RULE_typedExprs = 13, RULE_typedExpr = 14, RULE_typeSigs = 15, RULE_typeSig = 16, 
		RULE_typeGuards = 17, RULE_typeGuard = 18, RULE_topTypes = 19, RULE_topType = 20, 
		RULE_topType100 = 21, RULE_type200 = 22, RULE_type300 = 23, RULE_type400 = 24, 
		RULE_type500 = 25, RULE_type_ = 26, RULE_funType100 = 27, RULE_funType = 28, 
		RULE_mapPairTypes = 29, RULE_mapPairType = 30, RULE_fieldTypes = 31, RULE_fieldType = 32, 
		RULE_binaryType = 33, RULE_binBaseType = 34, RULE_binUnitType = 35, RULE_attrVal = 36, 
		RULE_function_ = 37, RULE_functionClause = 38, RULE_clauseArgs = 39, RULE_clauseGuard = 40, 
		RULE_clauseBody = 41, RULE_expr = 42, RULE_expr100 = 43, RULE_expr150 = 44, 
		RULE_expr160 = 45, RULE_expr200 = 46, RULE_expr300 = 47, RULE_expr400 = 48, 
		RULE_expr500 = 49, RULE_expr600 = 50, RULE_expr650 = 51, RULE_expr700 = 52, 
		RULE_expr800 = 53, RULE_exprMax = 54, RULE_patExpr = 55, RULE_patExpr200 = 56, 
		RULE_patExpr300 = 57, RULE_patExpr400 = 58, RULE_patExpr500 = 59, RULE_patExpr600 = 60, 
		RULE_patExpr650 = 61, RULE_patExpr700 = 62, RULE_patExpr800 = 63, RULE_patExprMax = 64, 
		RULE_mapPatExpr = 65, RULE_recordPatExpr = 66, RULE_list_ = 67, RULE_tail = 68, 
		RULE_binary = 69, RULE_binElements = 70, RULE_binElement = 71, RULE_bitExpr = 72, 
		RULE_optBitSizeExpr = 73, RULE_optBitTypeList = 74, RULE_bitTypeList = 75, 
		RULE_bitType = 76, RULE_bitSizeExpr = 77, RULE_listComprehension = 78, 
		RULE_binaryComprehension = 79, RULE_lcExprs = 80, RULE_lcExpr = 81, RULE_tuple_ = 82, 
		RULE_mapExpr = 83, RULE_mapTuple = 84, RULE_mapField = 85, RULE_mapFieldAssoc = 86, 
		RULE_mapFieldExact = 87, RULE_mapKey = 88, RULE_recordExpr = 89, RULE_recordTuple = 90, 
		RULE_recordFields = 91, RULE_recordField = 92, RULE_functionCall = 93, 
		RULE_ifExpr = 94, RULE_ifClauses = 95, RULE_ifClause = 96, RULE_caseExpr = 97, 
		RULE_crClauses = 98, RULE_crClause = 99, RULE_receiveExpr = 100, RULE_funExpr = 101, 
		RULE_atomOrVar = 102, RULE_integerOrVar = 103, RULE_funClauses = 104, 
		RULE_funClause = 105, RULE_tryExpr = 106, RULE_tryCatch = 107, RULE_tryClauses = 108, 
		RULE_tryClause = 109, RULE_tryOptStackTrace = 110, RULE_argumentList = 111, 
		RULE_patArgumentList = 112, RULE_exprs = 113, RULE_patExprs = 114, RULE_guard_ = 115, 
		RULE_atomic = 116, RULE_prefixOp = 117, RULE_multOp = 118, RULE_addOp = 119, 
		RULE_listOp = 120, RULE_compOp = 121;
	private static String[] makeRuleNames() {
		return new String[] {
			"forms", "form", "tokAtom", "tokVar", "tokFloat", "tokInteger", "tokChar", 
			"tokString", "attribute", "typeSpec", "specFun", "typedAttrVal", "typedRecordFields", 
			"typedExprs", "typedExpr", "typeSigs", "typeSig", "typeGuards", "typeGuard", 
			"topTypes", "topType", "topType100", "type200", "type300", "type400", 
			"type500", "type_", "funType100", "funType", "mapPairTypes", "mapPairType", 
			"fieldTypes", "fieldType", "binaryType", "binBaseType", "binUnitType", 
			"attrVal", "function_", "functionClause", "clauseArgs", "clauseGuard", 
			"clauseBody", "expr", "expr100", "expr150", "expr160", "expr200", "expr300", 
			"expr400", "expr500", "expr600", "expr650", "expr700", "expr800", "exprMax", 
			"patExpr", "patExpr200", "patExpr300", "patExpr400", "patExpr500", "patExpr600", 
			"patExpr650", "patExpr700", "patExpr800", "patExprMax", "mapPatExpr", 
			"recordPatExpr", "list_", "tail", "binary", "binElements", "binElement", 
			"bitExpr", "optBitSizeExpr", "optBitTypeList", "bitTypeList", "bitType", 
			"bitSizeExpr", "listComprehension", "binaryComprehension", "lcExprs", 
			"lcExpr", "tuple_", "mapExpr", "mapTuple", "mapField", "mapFieldAssoc", 
			"mapFieldExact", "mapKey", "recordExpr", "recordTuple", "recordFields", 
			"recordField", "functionCall", "ifExpr", "ifClauses", "ifClause", "caseExpr", 
			"crClauses", "crClause", "receiveExpr", "funExpr", "atomOrVar", "integerOrVar", 
			"funClauses", "funClause", "tryExpr", "tryCatch", "tryClauses", "tryClause", 
			"tryOptStackTrace", "argumentList", "patArgumentList", "exprs", "patExprs", 
			"guard_", "atomic", "prefixOp", "multOp", "addOp", "listOp", "compOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'-'", "'('", "')'", "':'", "','", "'::'", "'{'", "'}'", 
			"';'", "'when'", "'|'", "'..'", "'['", "']'", "'...'", "'#'", "'fun'", 
			"'->'", "'=>'", "':='", "'<<'", "'>>'", "'*'", "'catch'", "'='", "'!'", 
			"'orelse'", "'andalso'", "'begin'", "'end'", "'/'", "'||'", "'<-'", "'<='", 
			"'if'", "'case'", "'of'", "'receive'", "'after'", "'try'", "'+'", "'bnot'", 
			"'not'", "'div'", "'rem'", "'band'", "'and'", "'bor'", "'bxor'", "'bsl'", 
			"'bsr'", "'or'", "'xor'", "'++'", "'--'", "'=='", "'/='", "'=<'", "'<'", 
			"'>='", "'>'", "'=:='", "'=/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "TokAtom", "TokVar", "TokFloat", "TokInteger", 
			"TokChar", "TokString", "AttrName", "Comment", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Erlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ErlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FormsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ErlangParser.EOF, 0); }
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public FormsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterForms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitForms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitForms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormsContext forms() throws RecognitionException {
		FormsContext _localctx = new FormsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_forms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(244);
				form();
				}
				}
				setState(247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 || _la==TokAtom || _la==AttrName );
			setState(249);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public Function_Context function_() {
			return getRuleContext(Function_Context.class,0);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_form);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case AttrName:
				{
				setState(251);
				attribute();
				}
				break;
			case TokAtom:
				{
				setState(252);
				function_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(255);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokAtomContext extends ParserRuleContext {
		public TerminalNode TokAtom() { return getToken(ErlangParser.TokAtom, 0); }
		public TokAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTokAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTokAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTokAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokAtomContext tokAtom() throws RecognitionException {
		TokAtomContext _localctx = new TokAtomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tokAtom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(TokAtom);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokVarContext extends ParserRuleContext {
		public TerminalNode TokVar() { return getToken(ErlangParser.TokVar, 0); }
		public TokVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTokVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTokVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTokVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokVarContext tokVar() throws RecognitionException {
		TokVarContext _localctx = new TokVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tokVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(TokVar);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokFloatContext extends ParserRuleContext {
		public TerminalNode TokFloat() { return getToken(ErlangParser.TokFloat, 0); }
		public TokFloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokFloat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTokFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTokFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTokFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokFloatContext tokFloat() throws RecognitionException {
		TokFloatContext _localctx = new TokFloatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tokFloat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(TokFloat);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokIntegerContext extends ParserRuleContext {
		public TerminalNode TokInteger() { return getToken(ErlangParser.TokInteger, 0); }
		public TokIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTokInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTokInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTokInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokIntegerContext tokInteger() throws RecognitionException {
		TokIntegerContext _localctx = new TokIntegerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tokInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(TokInteger);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokCharContext extends ParserRuleContext {
		public TerminalNode TokChar() { return getToken(ErlangParser.TokChar, 0); }
		public TokCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTokChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTokChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTokChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokCharContext tokChar() throws RecognitionException {
		TokCharContext _localctx = new TokCharContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tokChar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(TokChar);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokStringContext extends ParserRuleContext {
		public TerminalNode TokString() { return getToken(ErlangParser.TokString, 0); }
		public TokStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTokString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTokString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTokString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokStringContext tokString() throws RecognitionException {
		TokStringContext _localctx = new TokStringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tokString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(TokString);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public TokAtomContext tokAtom() {
			return getRuleContext(TokAtomContext.class,0);
		}
		public AttrValContext attrVal() {
			return getRuleContext(AttrValContext.class,0);
		}
		public TypedAttrValContext typedAttrVal() {
			return getRuleContext(TypedAttrValContext.class,0);
		}
		public TerminalNode AttrName() { return getToken(ErlangParser.AttrName, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attribute);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(T__1);
				setState(270);
				tokAtom();
				setState(271);
				attrVal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(T__1);
				setState(274);
				tokAtom();
				setState(275);
				typedAttrVal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				match(T__1);
				setState(278);
				tokAtom();
				setState(279);
				match(T__2);
				setState(280);
				typedAttrVal();
				setState(281);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				match(AttrName);
				setState(284);
				typeSpec();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecContext extends ParserRuleContext {
		public SpecFunContext specFun() {
			return getRuleContext(SpecFunContext.class,0);
		}
		public TypeSigsContext typeSigs() {
			return getRuleContext(TypeSigsContext.class,0);
		}
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTypeSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTypeSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeSpec);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TokAtom:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				specFun();
				setState(288);
				typeSigs();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(T__2);
				setState(291);
				specFun();
				setState(292);
				typeSigs();
				setState(293);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecFunContext extends ParserRuleContext {
		public List<TokAtomContext> tokAtom() {
			return getRuleContexts(TokAtomContext.class);
		}
		public TokAtomContext tokAtom(int i) {
			return getRuleContext(TokAtomContext.class,i);
		}
		public SpecFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterSpecFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitSpecFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitSpecFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecFunContext specFun() throws RecognitionException {
		SpecFunContext _localctx = new SpecFunContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_specFun);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				tokAtom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				tokAtom();
				setState(299);
				match(T__4);
				setState(300);
				tokAtom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedAttrValContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypedRecordFieldsContext typedRecordFields() {
			return getRuleContext(TypedRecordFieldsContext.class,0);
		}
		public TopTypeContext topType() {
			return getRuleContext(TopTypeContext.class,0);
		}
		public TypedAttrValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedAttrVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTypedAttrVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTypedAttrVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTypedAttrVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedAttrValContext typedAttrVal() throws RecognitionException {
		TypedAttrValContext _localctx = new TypedAttrValContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typedAttrVal);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				expr();
				setState(305);
				match(T__5);
				setState(306);
				typedRecordFields();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				expr();
				setState(309);
				match(T__6);
				setState(310);
				topType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedRecordFieldsContext extends ParserRuleContext {
		public TypedExprsContext typedExprs() {
			return getRuleContext(TypedExprsContext.class,0);
		}
		public TypedRecordFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedRecordFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTypedRecordFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTypedRecordFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTypedRecordFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedRecordFieldsContext typedRecordFields() throws RecognitionException {
		TypedRecordFieldsContext _localctx = new TypedRecordFieldsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typedRecordFields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(T__7);
			setState(315);
			typedExprs();
			setState(316);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedExprsContext extends ParserRuleContext {
		public TypedExprContext typedExpr() {
			return getRuleContext(TypedExprContext.class,0);
		}
		public TypedExprsContext typedExprs() {
			return getRuleContext(TypedExprsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TypedExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTypedExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTypedExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTypedExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedExprsContext typedExprs() throws RecognitionException {
		TypedExprsContext _localctx = new TypedExprsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typedExprs);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				typedExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				typedExpr();
				setState(320);
				match(T__5);
				setState(321);
				typedExprs();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				expr();
				setState(324);
				match(T__5);
				setState(325);
				typedExprs();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				typedExpr();
				setState(328);
				match(T__5);
				setState(329);
				exprs();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TopTypeContext topType() {
			return getRuleContext(TopTypeContext.class,0);
		}
		public TypedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTypedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTypedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTypedExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedExprContext typedExpr() throws RecognitionException {
		TypedExprContext _localctx = new TypedExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typedExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			expr();
			setState(334);
			match(T__6);
			setState(335);
			topType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSigsContext extends ParserRuleContext {
		public List<TypeSigContext> typeSig() {
			return getRuleContexts(TypeSigContext.class);
		}
		public TypeSigContext typeSig(int i) {
			return getRuleContext(TypeSigContext.class,i);
		}
		public TypeSigsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSigs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTypeSigs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTypeSigs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTypeSigs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSigsContext typeSigs() throws RecognitionException {
		TypeSigsContext _localctx = new TypeSigsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeSigs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			typeSig();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(338);
				match(T__9);
				setState(339);
				typeSig();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSigContext extends ParserRuleContext {
		public FunTypeContext funType() {
			return getRuleContext(FunTypeContext.class,0);
		}
		public TypeGuardsContext typeGuards() {
			return getRuleContext(TypeGuardsContext.class,0);
		}
		public TypeSigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTypeSig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTypeSig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTypeSig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSigContext typeSig() throws RecognitionException {
		TypeSigContext _localctx = new TypeSigContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeSig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			funType();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(346);
				match(T__10);
				setState(347);
				typeGuards();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeGuardsContext extends ParserRuleContext {
		public List<TypeGuardContext> typeGuard() {
			return getRuleContexts(TypeGuardContext.class);
		}
		public TypeGuardContext typeGuard(int i) {
			return getRuleContext(TypeGuardContext.class,i);
		}
		public TypeGuardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeGuards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTypeGuards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTypeGuards(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTypeGuards(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeGuardsContext typeGuards() throws RecognitionException {
		TypeGuardsContext _localctx = new TypeGuardsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeGuards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			typeGuard();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(351);
				match(T__5);
				setState(352);
				typeGuard();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeGuardContext extends ParserRuleContext {
		public TokAtomContext tokAtom() {
			return getRuleContext(TokAtomContext.class,0);
		}
		public TopTypesContext topTypes() {
			return getRuleContext(TopTypesContext.class,0);
		}
		public TokVarContext tokVar() {
			return getRuleContext(TokVarContext.class,0);
		}
		public TopTypeContext topType() {
			return getRuleContext(TopTypeContext.class,0);
		}
		public TypeGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTypeGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTypeGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTypeGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeGuardContext typeGuard() throws RecognitionException {
		TypeGuardContext _localctx = new TypeGuardContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeGuard);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TokAtom:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				tokAtom();
				setState(359);
				match(T__2);
				setState(360);
				topTypes();
				setState(361);
				match(T__3);
				}
				break;
			case TokVar:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				tokVar();
				setState(364);
				match(T__6);
				setState(365);
				topType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopTypesContext extends ParserRuleContext {
		public List<TopTypeContext> topType() {
			return getRuleContexts(TopTypeContext.class);
		}
		public TopTypeContext topType(int i) {
			return getRuleContext(TopTypeContext.class,i);
		}
		public TopTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTopTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTopTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTopTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopTypesContext topTypes() throws RecognitionException {
		TopTypesContext _localctx = new TopTypesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_topTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			topType();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(370);
				match(T__5);
				setState(371);
				topType();
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopTypeContext extends ParserRuleContext {
		public TopType100Context topType100() {
			return getRuleContext(TopType100Context.class,0);
		}
		public TokVarContext tokVar() {
			return getRuleContext(TokVarContext.class,0);
		}
		public TopTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTopType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTopType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTopType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopTypeContext topType() throws RecognitionException {
		TopTypeContext _localctx = new TopTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_topType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(377);
				tokVar();
				setState(378);
				match(T__6);
				}
				break;
			}
			setState(382);
			topType100();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopType100Context extends ParserRuleContext {
		public Type200Context type200() {
			return getRuleContext(Type200Context.class,0);
		}
		public TopType100Context topType100() {
			return getRuleContext(TopType100Context.class,0);
		}
		public TopType100Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topType100; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTopType100(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTopType100(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTopType100(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopType100Context topType100() throws RecognitionException {
		TopType100Context _localctx = new TopType100Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_topType100);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			type200();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(385);
				match(T__11);
				setState(386);
				topType100();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type200Context extends ParserRuleContext {
		public List<Type300Context> type300() {
			return getRuleContexts(Type300Context.class);
		}
		public Type300Context type300(int i) {
			return getRuleContext(Type300Context.class,i);
		}
		public Type200Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type200; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterType200(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitType200(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitType200(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type200Context type200() throws RecognitionException {
		Type200Context _localctx = new Type200Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_type200);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			type300(0);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(390);
				match(T__12);
				setState(391);
				type300(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type300Context extends ParserRuleContext {
		public Type400Context type400() {
			return getRuleContext(Type400Context.class,0);
		}
		public Type300Context type300() {
			return getRuleContext(Type300Context.class,0);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public Type300Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type300; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterType300(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitType300(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitType300(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type300Context type300() throws RecognitionException {
		return type300(0);
	}

	private Type300Context type300(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type300Context _localctx = new Type300Context(_ctx, _parentState);
		Type300Context _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_type300, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(395);
			type400(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type300Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type300);
					setState(397);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(398);
					addOp();
					setState(399);
					type400(0);
					}
					} 
				}
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Type400Context extends ParserRuleContext {
		public Type500Context type500() {
			return getRuleContext(Type500Context.class,0);
		}
		public Type400Context type400() {
			return getRuleContext(Type400Context.class,0);
		}
		public MultOpContext multOp() {
			return getRuleContext(MultOpContext.class,0);
		}
		public Type400Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type400; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterType400(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitType400(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitType400(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type400Context type400() throws RecognitionException {
		return type400(0);
	}

	private Type400Context type400(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type400Context _localctx = new Type400Context(_ctx, _parentState);
		Type400Context _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_type400, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(407);
			type500();
			}
			_ctx.stop = _input.LT(-1);
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type400Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type400);
					setState(409);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(410);
					multOp();
					setState(411);
					type500();
					}
					} 
				}
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Type500Context extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public PrefixOpContext prefixOp() {
			return getRuleContext(PrefixOpContext.class,0);
		}
		public Type500Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type500; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterType500(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitType500(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitType500(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type500Context type500() throws RecognitionException {
		Type500Context _localctx = new Type500Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_type500);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) {
				{
				setState(418);
				prefixOp();
				}
			}

			setState(421);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_Context extends ParserRuleContext {
		public TopTypeContext topType() {
			return getRuleContext(TopTypeContext.class,0);
		}
		public TokVarContext tokVar() {
			return getRuleContext(TokVarContext.class,0);
		}
		public List<TokAtomContext> tokAtom() {
			return getRuleContexts(TokAtomContext.class);
		}
		public TokAtomContext tokAtom(int i) {
			return getRuleContext(TokAtomContext.class,i);
		}
		public TopTypesContext topTypes() {
			return getRuleContext(TopTypesContext.class,0);
		}
		public MapPairTypesContext mapPairTypes() {
			return getRuleContext(MapPairTypesContext.class,0);
		}
		public FieldTypesContext fieldTypes() {
			return getRuleContext(FieldTypesContext.class,0);
		}
		public BinaryTypeContext binaryType() {
			return getRuleContext(BinaryTypeContext.class,0);
		}
		public TokIntegerContext tokInteger() {
			return getRuleContext(TokIntegerContext.class,0);
		}
		public TokCharContext tokChar() {
			return getRuleContext(TokCharContext.class,0);
		}
		public FunType100Context funType100() {
			return getRuleContext(FunType100Context.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitType_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_type_);
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				match(T__2);
				setState(424);
				topType();
				setState(425);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				tokVar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				tokAtom();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(429);
				tokAtom();
				setState(430);
				match(T__2);
				setState(431);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(433);
				tokAtom();
				setState(434);
				match(T__2);
				setState(435);
				topTypes();
				setState(436);
				match(T__3);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(438);
				tokAtom();
				setState(439);
				match(T__4);
				setState(440);
				tokAtom();
				setState(441);
				match(T__2);
				setState(442);
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(444);
				tokAtom();
				setState(445);
				match(T__4);
				setState(446);
				tokAtom();
				setState(447);
				match(T__2);
				setState(448);
				topTypes();
				setState(449);
				match(T__3);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(451);
				match(T__13);
				setState(452);
				match(T__14);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(453);
				match(T__13);
				setState(454);
				topType();
				setState(455);
				match(T__14);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(457);
				match(T__13);
				setState(458);
				topType();
				setState(459);
				match(T__5);
				setState(460);
				match(T__15);
				setState(461);
				match(T__14);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(463);
				match(T__16);
				setState(464);
				match(T__7);
				setState(465);
				match(T__8);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(466);
				match(T__16);
				setState(467);
				match(T__7);
				setState(468);
				mapPairTypes();
				setState(469);
				match(T__8);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(471);
				match(T__7);
				setState(472);
				match(T__8);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(473);
				match(T__7);
				setState(474);
				topTypes();
				setState(475);
				match(T__8);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(477);
				match(T__16);
				setState(478);
				tokAtom();
				setState(479);
				match(T__7);
				setState(480);
				match(T__8);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(482);
				match(T__16);
				setState(483);
				tokAtom();
				setState(484);
				match(T__7);
				setState(485);
				fieldTypes();
				setState(486);
				match(T__8);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(488);
				binaryType();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(489);
				tokInteger();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(490);
				tokChar();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(491);
				match(T__17);
				setState(492);
				match(T__2);
				setState(493);
				match(T__3);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(494);
				match(T__17);
				setState(495);
				match(T__2);
				setState(496);
				funType100();
				setState(497);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunType100Context extends ParserRuleContext {
		public TopTypeContext topType() {
			return getRuleContext(TopTypeContext.class,0);
		}
		public FunTypeContext funType() {
			return getRuleContext(FunTypeContext.class,0);
		}
		public FunType100Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funType100; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFunType100(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFunType100(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitFunType100(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunType100Context funType100() throws RecognitionException {
		FunType100Context _localctx = new FunType100Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_funType100);
		try {
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				match(T__2);
				setState(502);
				match(T__15);
				setState(503);
				match(T__3);
				setState(504);
				match(T__18);
				setState(505);
				topType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				funType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunTypeContext extends ParserRuleContext {
		public TopTypeContext topType() {
			return getRuleContext(TopTypeContext.class,0);
		}
		public TopTypesContext topTypes() {
			return getRuleContext(TopTypesContext.class,0);
		}
		public FunTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFunType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFunType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitFunType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunTypeContext funType() throws RecognitionException {
		FunTypeContext _localctx = new FunTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_funType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(T__2);
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__7) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__21) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TokAtom - 65)) | (1L << (TokVar - 65)) | (1L << (TokInteger - 65)) | (1L << (TokChar - 65)))) != 0)) {
				{
				setState(510);
				topTypes();
				}
			}

			setState(513);
			match(T__3);
			setState(514);
			match(T__18);
			setState(515);
			topType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapPairTypesContext extends ParserRuleContext {
		public List<MapPairTypeContext> mapPairType() {
			return getRuleContexts(MapPairTypeContext.class);
		}
		public MapPairTypeContext mapPairType(int i) {
			return getRuleContext(MapPairTypeContext.class,i);
		}
		public MapPairTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapPairTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterMapPairTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitMapPairTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitMapPairTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapPairTypesContext mapPairTypes() throws RecognitionException {
		MapPairTypesContext _localctx = new MapPairTypesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mapPairTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			mapPairType();
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(518);
				match(T__5);
				setState(519);
				mapPairType();
				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapPairTypeContext extends ParserRuleContext {
		public List<TopTypeContext> topType() {
			return getRuleContexts(TopTypeContext.class);
		}
		public TopTypeContext topType(int i) {
			return getRuleContext(TopTypeContext.class,i);
		}
		public MapPairTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapPairType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterMapPairType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitMapPairType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitMapPairType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapPairTypeContext mapPairType() throws RecognitionException {
		MapPairTypeContext _localctx = new MapPairTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_mapPairType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			topType();
			setState(526);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(527);
			topType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldTypesContext extends ParserRuleContext {
		public List<FieldTypeContext> fieldType() {
			return getRuleContexts(FieldTypeContext.class);
		}
		public FieldTypeContext fieldType(int i) {
			return getRuleContext(FieldTypeContext.class,i);
		}
		public FieldTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFieldTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFieldTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitFieldTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldTypesContext fieldTypes() throws RecognitionException {
		FieldTypesContext _localctx = new FieldTypesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fieldTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			fieldType();
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(530);
				match(T__5);
				setState(531);
				fieldType();
				}
				}
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldTypeContext extends ParserRuleContext {
		public TokAtomContext tokAtom() {
			return getRuleContext(TokAtomContext.class,0);
		}
		public TopTypeContext topType() {
			return getRuleContext(TopTypeContext.class,0);
		}
		public FieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFieldType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFieldType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitFieldType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldTypeContext fieldType() throws RecognitionException {
		FieldTypeContext _localctx = new FieldTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_fieldType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			tokAtom();
			setState(538);
			match(T__6);
			setState(539);
			topType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryTypeContext extends ParserRuleContext {
		public BinBaseTypeContext binBaseType() {
			return getRuleContext(BinBaseTypeContext.class,0);
		}
		public BinUnitTypeContext binUnitType() {
			return getRuleContext(BinUnitTypeContext.class,0);
		}
		public BinaryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBinaryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBinaryType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBinaryType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryTypeContext binaryType() throws RecognitionException {
		BinaryTypeContext _localctx = new BinaryTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_binaryType);
		try {
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				match(T__21);
				setState(542);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				match(T__21);
				setState(544);
				binBaseType();
				setState(545);
				match(T__22);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(547);
				match(T__21);
				setState(548);
				binUnitType();
				setState(549);
				match(T__22);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(551);
				match(T__21);
				setState(552);
				binBaseType();
				setState(553);
				match(T__5);
				setState(554);
				binUnitType();
				setState(555);
				match(T__22);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinBaseTypeContext extends ParserRuleContext {
		public TokVarContext tokVar() {
			return getRuleContext(TokVarContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public BinBaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binBaseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBinBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBinBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBinBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinBaseTypeContext binBaseType() throws RecognitionException {
		BinBaseTypeContext _localctx = new BinBaseTypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_binBaseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			tokVar();
			setState(560);
			match(T__4);
			setState(561);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinUnitTypeContext extends ParserRuleContext {
		public List<TokVarContext> tokVar() {
			return getRuleContexts(TokVarContext.class);
		}
		public TokVarContext tokVar(int i) {
			return getRuleContext(TokVarContext.class,i);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public BinUnitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binUnitType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBinUnitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBinUnitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBinUnitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinUnitTypeContext binUnitType() throws RecognitionException {
		BinUnitTypeContext _localctx = new BinUnitTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_binUnitType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			tokVar();
			setState(564);
			match(T__4);
			setState(565);
			tokVar();
			setState(566);
			match(T__23);
			setState(567);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrValContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public AttrValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterAttrVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitAttrVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitAttrVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrValContext attrVal() throws RecognitionException {
		AttrValContext _localctx = new AttrValContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_attrVal);
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				match(T__2);
				setState(571);
				expr();
				setState(572);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
				expr();
				setState(575);
				match(T__5);
				setState(576);
				exprs();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(578);
				match(T__2);
				setState(579);
				expr();
				setState(580);
				match(T__5);
				setState(581);
				exprs();
				setState(582);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_Context extends ParserRuleContext {
		public List<FunctionClauseContext> functionClause() {
			return getRuleContexts(FunctionClauseContext.class);
		}
		public FunctionClauseContext functionClause(int i) {
			return getRuleContext(FunctionClauseContext.class,i);
		}
		public Function_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFunction_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFunction_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitFunction_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_Context function_() throws RecognitionException {
		Function_Context _localctx = new Function_Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_function_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			functionClause();
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(587);
				match(T__9);
				setState(588);
				functionClause();
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionClauseContext extends ParserRuleContext {
		public TokAtomContext tokAtom() {
			return getRuleContext(TokAtomContext.class,0);
		}
		public ClauseArgsContext clauseArgs() {
			return getRuleContext(ClauseArgsContext.class,0);
		}
		public ClauseGuardContext clauseGuard() {
			return getRuleContext(ClauseGuardContext.class,0);
		}
		public ClauseBodyContext clauseBody() {
			return getRuleContext(ClauseBodyContext.class,0);
		}
		public FunctionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFunctionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFunctionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitFunctionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionClauseContext functionClause() throws RecognitionException {
		FunctionClauseContext _localctx = new FunctionClauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_functionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			tokAtom();
			setState(595);
			clauseArgs();
			setState(596);
			clauseGuard();
			setState(597);
			clauseBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClauseArgsContext extends ParserRuleContext {
		public PatArgumentListContext patArgumentList() {
			return getRuleContext(PatArgumentListContext.class,0);
		}
		public ClauseArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauseArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterClauseArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitClauseArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitClauseArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseArgsContext clauseArgs() throws RecognitionException {
		ClauseArgsContext _localctx = new ClauseArgsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_clauseArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			patArgumentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClauseGuardContext extends ParserRuleContext {
		public Guard_Context guard_() {
			return getRuleContext(Guard_Context.class,0);
		}
		public ClauseGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauseGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterClauseGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitClauseGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitClauseGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseGuardContext clauseGuard() throws RecognitionException {
		ClauseGuardContext _localctx = new ClauseGuardContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_clauseGuard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(601);
				match(T__10);
				setState(602);
				guard_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClauseBodyContext extends ParserRuleContext {
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public ClauseBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauseBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterClauseBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitClauseBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitClauseBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseBodyContext clauseBody() throws RecognitionException {
		ClauseBodyContext _localctx = new ClauseBodyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_clauseBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(T__18);
			setState(606);
			exprs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr100Context expr100() {
			return getRuleContext(Expr100Context.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expr);
		try {
			setState(611);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				match(T__24);
				setState(609);
				expr();
				}
				break;
			case T__1:
			case T__2:
			case T__7:
			case T__13:
			case T__16:
			case T__17:
			case T__21:
			case T__29:
			case T__35:
			case T__36:
			case T__38:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case TokAtom:
			case TokVar:
			case TokFloat:
			case TokInteger:
			case TokChar:
			case TokString:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				expr100();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr100Context extends ParserRuleContext {
		public List<Expr150Context> expr150() {
			return getRuleContexts(Expr150Context.class);
		}
		public Expr150Context expr150(int i) {
			return getRuleContext(Expr150Context.class,i);
		}
		public Expr100Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr100; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr100(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr100(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr100(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr100Context expr100() throws RecognitionException {
		Expr100Context _localctx = new Expr100Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_expr100);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			expr150();
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25 || _la==T__26) {
				{
				{
				setState(614);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(615);
				expr150();
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr150Context extends ParserRuleContext {
		public List<Expr160Context> expr160() {
			return getRuleContexts(Expr160Context.class);
		}
		public Expr160Context expr160(int i) {
			return getRuleContext(Expr160Context.class,i);
		}
		public Expr150Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr150; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr150(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr150(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr150(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr150Context expr150() throws RecognitionException {
		Expr150Context _localctx = new Expr150Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_expr150);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			expr160();
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(622);
				match(T__27);
				setState(623);
				expr160();
				}
				}
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr160Context extends ParserRuleContext {
		public List<Expr200Context> expr200() {
			return getRuleContexts(Expr200Context.class);
		}
		public Expr200Context expr200(int i) {
			return getRuleContext(Expr200Context.class,i);
		}
		public Expr160Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr160; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr160(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr160(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr160(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr160Context expr160() throws RecognitionException {
		Expr160Context _localctx = new Expr160Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_expr160);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			expr200();
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(630);
				match(T__28);
				setState(631);
				expr200();
				}
				}
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr200Context extends ParserRuleContext {
		public List<Expr300Context> expr300() {
			return getRuleContexts(Expr300Context.class);
		}
		public Expr300Context expr300(int i) {
			return getRuleContext(Expr300Context.class,i);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public Expr200Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr200; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr200(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr200(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr200(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr200Context expr200() throws RecognitionException {
		Expr200Context _localctx = new Expr200Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_expr200);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			expr300();
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (T__56 - 57)) | (1L << (T__57 - 57)) | (1L << (T__58 - 57)) | (1L << (T__59 - 57)) | (1L << (T__60 - 57)) | (1L << (T__61 - 57)) | (1L << (T__62 - 57)) | (1L << (T__63 - 57)))) != 0)) {
				{
				setState(638);
				compOp();
				setState(639);
				expr300();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr300Context extends ParserRuleContext {
		public List<Expr400Context> expr400() {
			return getRuleContexts(Expr400Context.class);
		}
		public Expr400Context expr400(int i) {
			return getRuleContext(Expr400Context.class,i);
		}
		public List<ListOpContext> listOp() {
			return getRuleContexts(ListOpContext.class);
		}
		public ListOpContext listOp(int i) {
			return getRuleContext(ListOpContext.class,i);
		}
		public Expr300Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr300; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr300(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr300(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr300(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr300Context expr300() throws RecognitionException {
		Expr300Context _localctx = new Expr300Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_expr300);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			expr400();
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__54 || _la==T__55) {
				{
				{
				setState(644);
				listOp();
				setState(645);
				expr400();
				}
				}
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr400Context extends ParserRuleContext {
		public List<Expr500Context> expr500() {
			return getRuleContexts(Expr500Context.class);
		}
		public Expr500Context expr500(int i) {
			return getRuleContext(Expr500Context.class,i);
		}
		public List<AddOpContext> addOp() {
			return getRuleContexts(AddOpContext.class);
		}
		public AddOpContext addOp(int i) {
			return getRuleContext(AddOpContext.class,i);
		}
		public Expr400Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr400; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr400(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr400(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr400(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr400Context expr400() throws RecognitionException {
		Expr400Context _localctx = new Expr400Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_expr400);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			expr500();
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__41) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0)) {
				{
				{
				setState(653);
				addOp();
				setState(654);
				expr500();
				}
				}
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr500Context extends ParserRuleContext {
		public List<Expr600Context> expr600() {
			return getRuleContexts(Expr600Context.class);
		}
		public Expr600Context expr600(int i) {
			return getRuleContext(Expr600Context.class,i);
		}
		public List<MultOpContext> multOp() {
			return getRuleContexts(MultOpContext.class);
		}
		public MultOpContext multOp(int i) {
			return getRuleContext(MultOpContext.class,i);
		}
		public Expr500Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr500; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr500(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr500(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr500(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr500Context expr500() throws RecognitionException {
		Expr500Context _localctx = new Expr500Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_expr500);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			expr600();
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__31) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) {
				{
				{
				setState(662);
				multOp();
				setState(663);
				expr600();
				}
				}
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr600Context extends ParserRuleContext {
		public PrefixOpContext prefixOp() {
			return getRuleContext(PrefixOpContext.class,0);
		}
		public Expr600Context expr600() {
			return getRuleContext(Expr600Context.class,0);
		}
		public Expr650Context expr650() {
			return getRuleContext(Expr650Context.class,0);
		}
		public Expr600Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr600; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr600(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr600(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr600(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr600Context expr600() throws RecognitionException {
		Expr600Context _localctx = new Expr600Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_expr600);
		try {
			setState(674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__41:
			case T__42:
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				prefixOp();
				setState(671);
				expr600();
				}
				break;
			case T__2:
			case T__7:
			case T__13:
			case T__16:
			case T__17:
			case T__21:
			case T__29:
			case T__35:
			case T__36:
			case T__38:
			case T__40:
			case TokAtom:
			case TokVar:
			case TokFloat:
			case TokInteger:
			case TokChar:
			case TokString:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				expr650();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr650Context extends ParserRuleContext {
		public MapExprContext mapExpr() {
			return getRuleContext(MapExprContext.class,0);
		}
		public Expr700Context expr700() {
			return getRuleContext(Expr700Context.class,0);
		}
		public Expr650Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr650; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr650(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr650(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr650(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr650Context expr650() throws RecognitionException {
		Expr650Context _localctx = new Expr650Context(_ctx, getState());
		enterRule(_localctx, 102, RULE_expr650);
		try {
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				mapExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				expr700();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr700Context extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public RecordExprContext recordExpr() {
			return getRuleContext(RecordExprContext.class,0);
		}
		public Expr800Context expr800() {
			return getRuleContext(Expr800Context.class,0);
		}
		public Expr700Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr700; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr700(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr700(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr700(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr700Context expr700() throws RecognitionException {
		Expr700Context _localctx = new Expr700Context(_ctx, getState());
		enterRule(_localctx, 104, RULE_expr700);
		try {
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				recordExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(682);
				expr800();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr800Context extends ParserRuleContext {
		public List<ExprMaxContext> exprMax() {
			return getRuleContexts(ExprMaxContext.class);
		}
		public ExprMaxContext exprMax(int i) {
			return getRuleContext(ExprMaxContext.class,i);
		}
		public Expr800Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr800; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr800(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr800(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr800(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr800Context expr800() throws RecognitionException {
		Expr800Context _localctx = new Expr800Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_expr800);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			exprMax();
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(686);
				match(T__4);
				setState(687);
				exprMax();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprMaxContext extends ParserRuleContext {
		public TokVarContext tokVar() {
			return getRuleContext(TokVarContext.class,0);
		}
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public List_Context list_() {
			return getRuleContext(List_Context.class,0);
		}
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public ListComprehensionContext listComprehension() {
			return getRuleContext(ListComprehensionContext.class,0);
		}
		public BinaryComprehensionContext binaryComprehension() {
			return getRuleContext(BinaryComprehensionContext.class,0);
		}
		public Tuple_Context tuple_() {
			return getRuleContext(Tuple_Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public CaseExprContext caseExpr() {
			return getRuleContext(CaseExprContext.class,0);
		}
		public ReceiveExprContext receiveExpr() {
			return getRuleContext(ReceiveExprContext.class,0);
		}
		public FunExprContext funExpr() {
			return getRuleContext(FunExprContext.class,0);
		}
		public TryExprContext tryExpr() {
			return getRuleContext(TryExprContext.class,0);
		}
		public ExprMaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprMax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExprMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExprMax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExprMax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprMaxContext exprMax() throws RecognitionException {
		ExprMaxContext _localctx = new ExprMaxContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_exprMax);
		try {
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				tokVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
				atomic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(692);
				list_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(693);
				binary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(694);
				listComprehension();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(695);
				binaryComprehension();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(696);
				tuple_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(697);
				match(T__2);
				setState(698);
				expr();
				setState(699);
				match(T__3);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(701);
				match(T__29);
				setState(702);
				exprs();
				setState(703);
				match(T__30);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(705);
				ifExpr();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(706);
				caseExpr();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(707);
				receiveExpr();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(708);
				funExpr();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(709);
				tryExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatExprContext extends ParserRuleContext {
		public PatExpr200Context patExpr200() {
			return getRuleContext(PatExpr200Context.class,0);
		}
		public PatExprContext patExpr() {
			return getRuleContext(PatExprContext.class,0);
		}
		public PatExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterPatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitPatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitPatExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatExprContext patExpr() throws RecognitionException {
		PatExprContext _localctx = new PatExprContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_patExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			patExpr200();
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(713);
				match(T__25);
				setState(714);
				patExpr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatExpr200Context extends ParserRuleContext {
		public List<PatExpr300Context> patExpr300() {
			return getRuleContexts(PatExpr300Context.class);
		}
		public PatExpr300Context patExpr300(int i) {
			return getRuleContext(PatExpr300Context.class,i);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public PatExpr200Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patExpr200; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterPatExpr200(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitPatExpr200(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitPatExpr200(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatExpr200Context patExpr200() throws RecognitionException {
		PatExpr200Context _localctx = new PatExpr200Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_patExpr200);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			patExpr300();
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (T__56 - 57)) | (1L << (T__57 - 57)) | (1L << (T__58 - 57)) | (1L << (T__59 - 57)) | (1L << (T__60 - 57)) | (1L << (T__61 - 57)) | (1L << (T__62 - 57)) | (1L << (T__63 - 57)))) != 0)) {
				{
				setState(718);
				compOp();
				setState(719);
				patExpr300();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatExpr300Context extends ParserRuleContext {
		public PatExpr400Context patExpr400() {
			return getRuleContext(PatExpr400Context.class,0);
		}
		public ListOpContext listOp() {
			return getRuleContext(ListOpContext.class,0);
		}
		public PatExpr300Context patExpr300() {
			return getRuleContext(PatExpr300Context.class,0);
		}
		public PatExpr300Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patExpr300; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterPatExpr300(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitPatExpr300(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitPatExpr300(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatExpr300Context patExpr300() throws RecognitionException {
		PatExpr300Context _localctx = new PatExpr300Context(_ctx, getState());
		enterRule(_localctx, 114, RULE_patExpr300);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			patExpr400(0);
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__54 || _la==T__55) {
				{
				setState(724);
				listOp();
				setState(725);
				patExpr300();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatExpr400Context extends ParserRuleContext {
		public PatExpr500Context patExpr500() {
			return getRuleContext(PatExpr500Context.class,0);
		}
		public PatExpr400Context patExpr400() {
			return getRuleContext(PatExpr400Context.class,0);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public PatExpr400Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patExpr400; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterPatExpr400(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitPatExpr400(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitPatExpr400(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatExpr400Context patExpr400() throws RecognitionException {
		return patExpr400(0);
	}

	private PatExpr400Context patExpr400(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PatExpr400Context _localctx = new PatExpr400Context(_ctx, _parentState);
		PatExpr400Context _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_patExpr400, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(730);
			patExpr500(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(738);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PatExpr400Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_patExpr400);
					setState(732);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(733);
					addOp();
					setState(734);
					patExpr500(0);
					}
					} 
				}
				setState(740);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PatExpr500Context extends ParserRuleContext {
		public PatExpr600Context patExpr600() {
			return getRuleContext(PatExpr600Context.class,0);
		}
		public PatExpr500Context patExpr500() {
			return getRuleContext(PatExpr500Context.class,0);
		}
		public MultOpContext multOp() {
			return getRuleContext(MultOpContext.class,0);
		}
		public PatExpr500Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patExpr500; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterPatExpr500(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitPatExpr500(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitPatExpr500(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatExpr500Context patExpr500() throws RecognitionException {
		return patExpr500(0);
	}

	private PatExpr500Context patExpr500(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PatExpr500Context _localctx = new PatExpr500Context(_ctx, _parentState);
		PatExpr500Context _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_patExpr500, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(742);
			patExpr600();
			}
			_ctx.stop = _input.LT(-1);
			setState(750);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PatExpr500Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_patExpr500);
					setState(744);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(745);
					multOp();
					setState(746);
					patExpr600();
					}
					} 
				}
				setState(752);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PatExpr600Context extends ParserRuleContext {
		public PrefixOpContext prefixOp() {
			return getRuleContext(PrefixOpContext.class,0);
		}
		public PatExpr600Context patExpr600() {
			return getRuleContext(PatExpr600Context.class,0);
		}
		public PatExpr650Context patExpr650() {
			return getRuleContext(PatExpr650Context.class,0);
		}
		public PatExpr600Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patExpr600; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterPatExpr600(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitPatExpr600(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitPatExpr600(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatExpr600Context patExpr600() throws RecognitionException {
		PatExpr600Context _localctx = new PatExpr600Context(_ctx, getState());
		enterRule(_localctx, 120, RULE_patExpr600);
		try {
			setState(757);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__41:
			case T__42:
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(753);
				prefixOp();
				setState(754);
				patExpr600();
				}
				break;
			case T__2:
			case T__7:
			case T__13:
			case T__16:
			case T__21:
			case TokAtom:
			case TokVar:
			case TokFloat:
			case TokInteger:
			case TokChar:
			case TokString:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				patExpr650();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatExpr650Context extends ParserRuleContext {
		public MapPatExprContext mapPatExpr() {
			return getRuleContext(MapPatExprContext.class,0);
		}
		public PatExpr700Context patExpr700() {
			return getRuleContext(PatExpr700Context.class,0);
		}
		public PatExpr650Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patExpr650; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterPatExpr650(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitPatExpr650(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitPatExpr650(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatExpr650Context patExpr650() throws RecognitionException {
		PatExpr650Context _localctx = new PatExpr650Context(_ctx, getState());
		enterRule(_localctx, 122, RULE_patExpr650);
		try {
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				mapPatExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(760);
				patExpr700();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatExpr700Context extends ParserRuleContext {
		public RecordPatExprContext recordPatExpr() {
			return getRuleContext(RecordPatExprContext.class,0);
		}
		public PatExpr800Context patExpr800() {
			return getRuleContext(PatExpr800Context.class,0);
		}
		public PatExpr700Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patExpr700; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterPatExpr700(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitPatExpr700(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitPatExpr700(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatExpr700Context patExpr700() throws RecognitionException {
		PatExpr700Context _localctx = new PatExpr700Context(_ctx, getState());
		enterRule(_localctx, 124, RULE_patExpr700);
		try {
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				recordPatExpr();
				}
				break;
			case T__2:
			case T__7:
			case T__13:
			case T__21:
			case TokAtom:
			case TokVar:
			case TokFloat:
			case TokInteger:
			case TokChar:
			case TokString:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				patExpr800();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatExpr800Context extends ParserRuleContext {
		public PatExprMaxContext patExprMax() {
			return getRuleContext(PatExprMaxContext.class,0);
		}
		public PatExpr800Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patExpr800; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterPatExpr800(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitPatExpr800(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitPatExpr800(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatExpr800Context patExpr800() throws RecognitionException {
		PatExpr800Context _localctx = new PatExpr800Context(_ctx, getState());
		enterRule(_localctx, 126, RULE_patExpr800);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			patExprMax();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatExprMaxContext extends ParserRuleContext {
		public TokVarContext tokVar() {
			return getRuleContext(TokVarContext.class,0);
		}
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public List_Context list_() {
			return getRuleContext(List_Context.class,0);
		}
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public Tuple_Context tuple_() {
			return getRuleContext(Tuple_Context.class,0);
		}
		public PatExprContext patExpr() {
			return getRuleContext(PatExprContext.class,0);
		}
		public PatExprMaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patExprMax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterPatExprMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitPatExprMax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitPatExprMax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatExprMaxContext patExprMax() throws RecognitionException {
		PatExprMaxContext _localctx = new PatExprMaxContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_patExprMax);
		try {
			setState(778);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TokVar:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				tokVar();
				}
				break;
			case TokAtom:
			case TokFloat:
			case TokInteger:
			case TokChar:
			case TokString:
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
				atomic();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(771);
				list_();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(772);
				binary();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(773);
				tuple_();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 6);
				{
				setState(774);
				match(T__2);
				setState(775);
				patExpr();
				setState(776);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapPatExprContext extends ParserRuleContext {
		public MapTupleContext mapTuple() {
			return getRuleContext(MapTupleContext.class,0);
		}
		public PatExprMaxContext patExprMax() {
			return getRuleContext(PatExprMaxContext.class,0);
		}
		public MapPatExprContext mapPatExpr() {
			return getRuleContext(MapPatExprContext.class,0);
		}
		public MapPatExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapPatExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterMapPatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitMapPatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitMapPatExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapPatExprContext mapPatExpr() throws RecognitionException {
		return mapPatExpr(0);
	}

	private MapPatExprContext mapPatExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MapPatExprContext _localctx = new MapPatExprContext(_ctx, _parentState);
		MapPatExprContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_mapPatExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << T__13) | (1L << T__21))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TokAtom - 65)) | (1L << (TokVar - 65)) | (1L << (TokFloat - 65)) | (1L << (TokInteger - 65)) | (1L << (TokChar - 65)) | (1L << (TokString - 65)))) != 0)) {
				{
				setState(781);
				patExprMax();
				}
			}

			setState(784);
			match(T__16);
			setState(785);
			mapTuple();
			}
			_ctx.stop = _input.LT(-1);
			setState(792);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MapPatExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mapPatExpr);
					setState(787);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(788);
					match(T__16);
					setState(789);
					mapTuple();
					}
					} 
				}
				setState(794);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RecordPatExprContext extends ParserRuleContext {
		public List<TokAtomContext> tokAtom() {
			return getRuleContexts(TokAtomContext.class);
		}
		public TokAtomContext tokAtom(int i) {
			return getRuleContext(TokAtomContext.class,i);
		}
		public RecordTupleContext recordTuple() {
			return getRuleContext(RecordTupleContext.class,0);
		}
		public RecordPatExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordPatExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterRecordPatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitRecordPatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitRecordPatExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordPatExprContext recordPatExpr() throws RecognitionException {
		RecordPatExprContext _localctx = new RecordPatExprContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_recordPatExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(T__16);
			setState(796);
			tokAtom();
			setState(800);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(797);
				match(T__0);
				setState(798);
				tokAtom();
				}
				break;
			case T__7:
				{
				setState(799);
				recordTuple();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public List_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterList_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitList_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitList_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_Context list_() throws RecognitionException {
		List_Context _localctx = new List_Context(_ctx, getState());
		enterRule(_localctx, 134, RULE_list_);
		try {
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				match(T__13);
				setState(803);
				match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(804);
				match(T__13);
				setState(805);
				expr();
				setState(806);
				tail();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TailContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public TailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TailContext tail() throws RecognitionException {
		TailContext _localctx = new TailContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_tail);
		try {
			setState(819);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				match(T__14);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				match(T__11);
				setState(812);
				expr();
				setState(813);
				match(T__14);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(815);
				match(T__5);
				setState(816);
				expr();
				setState(817);
				tail();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryContext extends ParserRuleContext {
		public BinElementsContext binElements() {
			return getRuleContext(BinElementsContext.class,0);
		}
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_binary);
		try {
			setState(827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(821);
				match(T__21);
				setState(822);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(823);
				match(T__21);
				setState(824);
				binElements();
				setState(825);
				match(T__22);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinElementsContext extends ParserRuleContext {
		public List<BinElementContext> binElement() {
			return getRuleContexts(BinElementContext.class);
		}
		public BinElementContext binElement(int i) {
			return getRuleContext(BinElementContext.class,i);
		}
		public BinElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBinElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBinElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBinElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinElementsContext binElements() throws RecognitionException {
		BinElementsContext _localctx = new BinElementsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_binElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			binElement();
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(830);
				match(T__5);
				setState(831);
				binElement();
				}
				}
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinElementContext extends ParserRuleContext {
		public BitExprContext bitExpr() {
			return getRuleContext(BitExprContext.class,0);
		}
		public OptBitSizeExprContext optBitSizeExpr() {
			return getRuleContext(OptBitSizeExprContext.class,0);
		}
		public OptBitTypeListContext optBitTypeList() {
			return getRuleContext(OptBitTypeListContext.class,0);
		}
		public BinElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBinElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBinElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBinElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinElementContext binElement() throws RecognitionException {
		BinElementContext _localctx = new BinElementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_binElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			bitExpr();
			setState(838);
			optBitSizeExpr();
			setState(839);
			optBitTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitExprContext extends ParserRuleContext {
		public ExprMaxContext exprMax() {
			return getRuleContext(ExprMaxContext.class,0);
		}
		public PrefixOpContext prefixOp() {
			return getRuleContext(PrefixOpContext.class,0);
		}
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitExprContext bitExpr() throws RecognitionException {
		BitExprContext _localctx = new BitExprContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_bitExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) {
				{
				setState(841);
				prefixOp();
				}
			}

			setState(844);
			exprMax();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptBitSizeExprContext extends ParserRuleContext {
		public BitSizeExprContext bitSizeExpr() {
			return getRuleContext(BitSizeExprContext.class,0);
		}
		public OptBitSizeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optBitSizeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterOptBitSizeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitOptBitSizeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitOptBitSizeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptBitSizeExprContext optBitSizeExpr() throws RecognitionException {
		OptBitSizeExprContext _localctx = new OptBitSizeExprContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_optBitSizeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(846);
				match(T__4);
				setState(847);
				bitSizeExpr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptBitTypeListContext extends ParserRuleContext {
		public BitTypeListContext bitTypeList() {
			return getRuleContext(BitTypeListContext.class,0);
		}
		public OptBitTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optBitTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterOptBitTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitOptBitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitOptBitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptBitTypeListContext optBitTypeList() throws RecognitionException {
		OptBitTypeListContext _localctx = new OptBitTypeListContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_optBitTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(850);
				match(T__31);
				setState(851);
				bitTypeList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitTypeListContext extends ParserRuleContext {
		public List<BitTypeContext> bitType() {
			return getRuleContexts(BitTypeContext.class);
		}
		public BitTypeContext bitType(int i) {
			return getRuleContext(BitTypeContext.class,i);
		}
		public BitTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBitTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitTypeListContext bitTypeList() throws RecognitionException {
		BitTypeListContext _localctx = new BitTypeListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_bitTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			bitType();
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(855);
				match(T__1);
				setState(856);
				bitType();
				}
				}
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitTypeContext extends ParserRuleContext {
		public TokAtomContext tokAtom() {
			return getRuleContext(TokAtomContext.class,0);
		}
		public TokIntegerContext tokInteger() {
			return getRuleContext(TokIntegerContext.class,0);
		}
		public BitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitTypeContext bitType() throws RecognitionException {
		BitTypeContext _localctx = new BitTypeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_bitType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			tokAtom();
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(863);
				match(T__4);
				setState(864);
				tokInteger();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitSizeExprContext extends ParserRuleContext {
		public ExprMaxContext exprMax() {
			return getRuleContext(ExprMaxContext.class,0);
		}
		public BitSizeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitSizeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBitSizeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBitSizeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBitSizeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitSizeExprContext bitSizeExpr() throws RecognitionException {
		BitSizeExprContext _localctx = new BitSizeExprContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_bitSizeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			exprMax();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListComprehensionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LcExprsContext lcExprs() {
			return getRuleContext(LcExprsContext.class,0);
		}
		public ListComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listComprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterListComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitListComprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitListComprehension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListComprehensionContext listComprehension() throws RecognitionException {
		ListComprehensionContext _localctx = new ListComprehensionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_listComprehension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(T__13);
			setState(870);
			expr();
			setState(871);
			match(T__32);
			setState(872);
			lcExprs();
			setState(873);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryComprehensionContext extends ParserRuleContext {
		public ExprMaxContext exprMax() {
			return getRuleContext(ExprMaxContext.class,0);
		}
		public LcExprsContext lcExprs() {
			return getRuleContext(LcExprsContext.class,0);
		}
		public BinaryComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryComprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBinaryComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBinaryComprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBinaryComprehension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryComprehensionContext binaryComprehension() throws RecognitionException {
		BinaryComprehensionContext _localctx = new BinaryComprehensionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_binaryComprehension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(T__21);
			setState(876);
			exprMax();
			setState(877);
			match(T__32);
			setState(878);
			lcExprs();
			setState(879);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LcExprsContext extends ParserRuleContext {
		public List<LcExprContext> lcExpr() {
			return getRuleContexts(LcExprContext.class);
		}
		public LcExprContext lcExpr(int i) {
			return getRuleContext(LcExprContext.class,i);
		}
		public LcExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterLcExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitLcExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitLcExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LcExprsContext lcExprs() throws RecognitionException {
		LcExprsContext _localctx = new LcExprsContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_lcExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			lcExpr();
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(882);
				match(T__5);
				setState(883);
				lcExpr();
				}
				}
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LcExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public LcExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterLcExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitLcExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitLcExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LcExprContext lcExpr() throws RecognitionException {
		LcExprContext _localctx = new LcExprContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_lcExpr);
		try {
			setState(898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(889);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(890);
				expr();
				setState(891);
				match(T__33);
				setState(892);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(894);
				binary();
				setState(895);
				match(T__34);
				setState(896);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_Context extends ParserRuleContext {
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public Tuple_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTuple_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTuple_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTuple_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_Context tuple_() throws RecognitionException {
		Tuple_Context _localctx = new Tuple_Context(_ctx, getState());
		enterRule(_localctx, 164, RULE_tuple_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			match(T__7);
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__7) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__21) | (1L << T__24) | (1L << T__29) | (1L << T__35) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TokAtom - 65)) | (1L << (TokVar - 65)) | (1L << (TokFloat - 65)) | (1L << (TokInteger - 65)) | (1L << (TokChar - 65)) | (1L << (TokString - 65)))) != 0)) {
				{
				setState(901);
				exprs();
				}
			}

			setState(904);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapExprContext extends ParserRuleContext {
		public MapTupleContext mapTuple() {
			return getRuleContext(MapTupleContext.class,0);
		}
		public ExprMaxContext exprMax() {
			return getRuleContext(ExprMaxContext.class,0);
		}
		public MapExprContext mapExpr() {
			return getRuleContext(MapExprContext.class,0);
		}
		public MapExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterMapExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitMapExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitMapExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapExprContext mapExpr() throws RecognitionException {
		return mapExpr(0);
	}

	private MapExprContext mapExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MapExprContext _localctx = new MapExprContext(_ctx, _parentState);
		MapExprContext _prevctx = _localctx;
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_mapExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << T__13) | (1L << T__17) | (1L << T__21) | (1L << T__29) | (1L << T__35) | (1L << T__36) | (1L << T__38) | (1L << T__40))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TokAtom - 65)) | (1L << (TokVar - 65)) | (1L << (TokFloat - 65)) | (1L << (TokInteger - 65)) | (1L << (TokChar - 65)) | (1L << (TokString - 65)))) != 0)) {
				{
				setState(907);
				exprMax();
				}
			}

			setState(910);
			match(T__16);
			setState(911);
			mapTuple();
			}
			_ctx.stop = _input.LT(-1);
			setState(918);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MapExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mapExpr);
					setState(913);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(914);
					match(T__16);
					setState(915);
					mapTuple();
					}
					} 
				}
				setState(920);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MapTupleContext extends ParserRuleContext {
		public List<MapFieldContext> mapField() {
			return getRuleContexts(MapFieldContext.class);
		}
		public MapFieldContext mapField(int i) {
			return getRuleContext(MapFieldContext.class,i);
		}
		public MapTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterMapTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitMapTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitMapTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapTupleContext mapTuple() throws RecognitionException {
		MapTupleContext _localctx = new MapTupleContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_mapTuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			match(T__7);
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__7) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__21) | (1L << T__24) | (1L << T__29) | (1L << T__35) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TokAtom - 65)) | (1L << (TokVar - 65)) | (1L << (TokFloat - 65)) | (1L << (TokInteger - 65)) | (1L << (TokChar - 65)) | (1L << (TokString - 65)))) != 0)) {
				{
				setState(922);
				mapField();
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(923);
					match(T__5);
					setState(924);
					mapField();
					}
					}
					setState(929);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(932);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapFieldContext extends ParserRuleContext {
		public MapFieldAssocContext mapFieldAssoc() {
			return getRuleContext(MapFieldAssocContext.class,0);
		}
		public MapFieldExactContext mapFieldExact() {
			return getRuleContext(MapFieldExactContext.class,0);
		}
		public MapFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterMapField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitMapField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitMapField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapFieldContext mapField() throws RecognitionException {
		MapFieldContext _localctx = new MapFieldContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_mapField);
		try {
			setState(936);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(934);
				mapFieldAssoc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(935);
				mapFieldExact();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapFieldAssocContext extends ParserRuleContext {
		public MapKeyContext mapKey() {
			return getRuleContext(MapKeyContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MapFieldAssocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapFieldAssoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterMapFieldAssoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitMapFieldAssoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitMapFieldAssoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapFieldAssocContext mapFieldAssoc() throws RecognitionException {
		MapFieldAssocContext _localctx = new MapFieldAssocContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_mapFieldAssoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			mapKey();
			setState(939);
			match(T__19);
			setState(940);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapFieldExactContext extends ParserRuleContext {
		public MapKeyContext mapKey() {
			return getRuleContext(MapKeyContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MapFieldExactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapFieldExact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterMapFieldExact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitMapFieldExact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitMapFieldExact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapFieldExactContext mapFieldExact() throws RecognitionException {
		MapFieldExactContext _localctx = new MapFieldExactContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_mapFieldExact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			mapKey();
			setState(943);
			match(T__20);
			setState(944);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapKeyContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MapKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterMapKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitMapKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitMapKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapKeyContext mapKey() throws RecognitionException {
		MapKeyContext _localctx = new MapKeyContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_mapKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordExprContext extends ParserRuleContext {
		public List<TokAtomContext> tokAtom() {
			return getRuleContexts(TokAtomContext.class);
		}
		public TokAtomContext tokAtom(int i) {
			return getRuleContext(TokAtomContext.class,i);
		}
		public RecordTupleContext recordTuple() {
			return getRuleContext(RecordTupleContext.class,0);
		}
		public ExprMaxContext exprMax() {
			return getRuleContext(ExprMaxContext.class,0);
		}
		public RecordExprContext recordExpr() {
			return getRuleContext(RecordExprContext.class,0);
		}
		public RecordExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterRecordExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitRecordExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitRecordExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordExprContext recordExpr() throws RecognitionException {
		return recordExpr(0);
	}

	private RecordExprContext recordExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RecordExprContext _localctx = new RecordExprContext(_ctx, _parentState);
		RecordExprContext _prevctx = _localctx;
		int _startState = 178;
		enterRecursionRule(_localctx, 178, RULE_recordExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << T__13) | (1L << T__17) | (1L << T__21) | (1L << T__29) | (1L << T__35) | (1L << T__36) | (1L << T__38) | (1L << T__40))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TokAtom - 65)) | (1L << (TokVar - 65)) | (1L << (TokFloat - 65)) | (1L << (TokInteger - 65)) | (1L << (TokChar - 65)) | (1L << (TokString - 65)))) != 0)) {
				{
				setState(949);
				exprMax();
				}
			}

			setState(952);
			match(T__16);
			setState(953);
			tokAtom();
			setState(957);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(954);
				match(T__0);
				setState(955);
				tokAtom();
				}
				break;
			case T__7:
				{
				setState(956);
				recordTuple();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(969);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RecordExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_recordExpr);
					setState(959);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(960);
					match(T__16);
					setState(961);
					tokAtom();
					setState(965);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(962);
						match(T__0);
						setState(963);
						tokAtom();
						}
						break;
					case T__7:
						{
						setState(964);
						recordTuple();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(971);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RecordTupleContext extends ParserRuleContext {
		public RecordFieldsContext recordFields() {
			return getRuleContext(RecordFieldsContext.class,0);
		}
		public RecordTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterRecordTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitRecordTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitRecordTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordTupleContext recordTuple() throws RecognitionException {
		RecordTupleContext _localctx = new RecordTupleContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_recordTuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			match(T__7);
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TokAtom || _la==TokVar) {
				{
				setState(973);
				recordFields();
				}
			}

			setState(976);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordFieldsContext extends ParserRuleContext {
		public List<RecordFieldContext> recordField() {
			return getRuleContexts(RecordFieldContext.class);
		}
		public RecordFieldContext recordField(int i) {
			return getRuleContext(RecordFieldContext.class,i);
		}
		public RecordFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterRecordFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitRecordFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitRecordFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordFieldsContext recordFields() throws RecognitionException {
		RecordFieldsContext _localctx = new RecordFieldsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_recordFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			recordField();
			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(979);
				match(T__5);
				setState(980);
				recordField();
				}
				}
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordFieldContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TokVarContext tokVar() {
			return getRuleContext(TokVarContext.class,0);
		}
		public TokAtomContext tokAtom() {
			return getRuleContext(TokAtomContext.class,0);
		}
		public RecordFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterRecordField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitRecordField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitRecordField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordFieldContext recordField() throws RecognitionException {
		RecordFieldContext _localctx = new RecordFieldContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_recordField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TokVar:
				{
				setState(986);
				tokVar();
				}
				break;
			case TokAtom:
				{
				setState(987);
				tokAtom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(990);
			match(T__25);
			setState(991);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public Expr800Context expr800() {
			return getRuleContext(Expr800Context.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			expr800();
			setState(994);
			argumentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfExprContext extends ParserRuleContext {
		public IfClausesContext ifClauses() {
			return getRuleContext(IfClausesContext.class,0);
		}
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitIfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_ifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			match(T__35);
			setState(997);
			ifClauses();
			setState(998);
			match(T__30);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfClausesContext extends ParserRuleContext {
		public List<IfClauseContext> ifClause() {
			return getRuleContexts(IfClauseContext.class);
		}
		public IfClauseContext ifClause(int i) {
			return getRuleContext(IfClauseContext.class,i);
		}
		public IfClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterIfClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitIfClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitIfClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfClausesContext ifClauses() throws RecognitionException {
		IfClausesContext _localctx = new IfClausesContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_ifClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			ifClause();
			setState(1005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(1001);
				match(T__9);
				setState(1002);
				ifClause();
				}
				}
				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfClauseContext extends ParserRuleContext {
		public Guard_Context guard_() {
			return getRuleContext(Guard_Context.class,0);
		}
		public ClauseBodyContext clauseBody() {
			return getRuleContext(ClauseBodyContext.class,0);
		}
		public IfClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterIfClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitIfClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitIfClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfClauseContext ifClause() throws RecognitionException {
		IfClauseContext _localctx = new IfClauseContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_ifClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			guard_();
			setState(1009);
			clauseBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CrClausesContext crClauses() {
			return getRuleContext(CrClausesContext.class,0);
		}
		public CaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterCaseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitCaseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitCaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExprContext caseExpr() throws RecognitionException {
		CaseExprContext _localctx = new CaseExprContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_caseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			match(T__36);
			setState(1012);
			expr();
			setState(1013);
			match(T__37);
			setState(1014);
			crClauses();
			setState(1015);
			match(T__30);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CrClausesContext extends ParserRuleContext {
		public List<CrClauseContext> crClause() {
			return getRuleContexts(CrClauseContext.class);
		}
		public CrClauseContext crClause(int i) {
			return getRuleContext(CrClauseContext.class,i);
		}
		public CrClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterCrClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitCrClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitCrClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrClausesContext crClauses() throws RecognitionException {
		CrClausesContext _localctx = new CrClausesContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_crClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			crClause();
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(1018);
				match(T__9);
				setState(1019);
				crClause();
				}
				}
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CrClauseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ClauseGuardContext clauseGuard() {
			return getRuleContext(ClauseGuardContext.class,0);
		}
		public ClauseBodyContext clauseBody() {
			return getRuleContext(ClauseBodyContext.class,0);
		}
		public CrClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterCrClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitCrClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitCrClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrClauseContext crClause() throws RecognitionException {
		CrClauseContext _localctx = new CrClauseContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_crClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			expr();
			setState(1026);
			clauseGuard();
			setState(1027);
			clauseBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiveExprContext extends ParserRuleContext {
		public CrClausesContext crClauses() {
			return getRuleContext(CrClausesContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ClauseBodyContext clauseBody() {
			return getRuleContext(ClauseBodyContext.class,0);
		}
		public ReceiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiveExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterReceiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitReceiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitReceiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiveExprContext receiveExpr() throws RecognitionException {
		ReceiveExprContext _localctx = new ReceiveExprContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_receiveExpr);
		try {
			setState(1046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1029);
				match(T__38);
				setState(1030);
				crClauses();
				setState(1031);
				match(T__30);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1033);
				match(T__38);
				setState(1034);
				match(T__39);
				setState(1035);
				expr();
				setState(1036);
				clauseBody();
				setState(1037);
				match(T__30);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1039);
				match(T__38);
				setState(1040);
				crClauses();
				setState(1041);
				match(T__39);
				setState(1042);
				expr();
				setState(1043);
				clauseBody();
				setState(1044);
				match(T__30);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunExprContext extends ParserRuleContext {
		public TokAtomContext tokAtom() {
			return getRuleContext(TokAtomContext.class,0);
		}
		public TokIntegerContext tokInteger() {
			return getRuleContext(TokIntegerContext.class,0);
		}
		public List<AtomOrVarContext> atomOrVar() {
			return getRuleContexts(AtomOrVarContext.class);
		}
		public AtomOrVarContext atomOrVar(int i) {
			return getRuleContext(AtomOrVarContext.class,i);
		}
		public IntegerOrVarContext integerOrVar() {
			return getRuleContext(IntegerOrVarContext.class,0);
		}
		public FunClausesContext funClauses() {
			return getRuleContext(FunClausesContext.class,0);
		}
		public FunExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFunExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFunExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitFunExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunExprContext funExpr() throws RecognitionException {
		FunExprContext _localctx = new FunExprContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_funExpr);
		try {
			setState(1064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1048);
				match(T__17);
				setState(1049);
				tokAtom();
				setState(1050);
				match(T__31);
				setState(1051);
				tokInteger();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1053);
				match(T__17);
				setState(1054);
				atomOrVar();
				setState(1055);
				match(T__4);
				setState(1056);
				atomOrVar();
				setState(1057);
				match(T__31);
				setState(1058);
				integerOrVar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1060);
				match(T__17);
				setState(1061);
				funClauses();
				setState(1062);
				match(T__30);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomOrVarContext extends ParserRuleContext {
		public TokAtomContext tokAtom() {
			return getRuleContext(TokAtomContext.class,0);
		}
		public TokVarContext tokVar() {
			return getRuleContext(TokVarContext.class,0);
		}
		public AtomOrVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomOrVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterAtomOrVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitAtomOrVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitAtomOrVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomOrVarContext atomOrVar() throws RecognitionException {
		AtomOrVarContext _localctx = new AtomOrVarContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_atomOrVar);
		try {
			setState(1068);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TokAtom:
				enterOuterAlt(_localctx, 1);
				{
				setState(1066);
				tokAtom();
				}
				break;
			case TokVar:
				enterOuterAlt(_localctx, 2);
				{
				setState(1067);
				tokVar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerOrVarContext extends ParserRuleContext {
		public TokIntegerContext tokInteger() {
			return getRuleContext(TokIntegerContext.class,0);
		}
		public TokVarContext tokVar() {
			return getRuleContext(TokVarContext.class,0);
		}
		public IntegerOrVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerOrVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterIntegerOrVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitIntegerOrVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitIntegerOrVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerOrVarContext integerOrVar() throws RecognitionException {
		IntegerOrVarContext _localctx = new IntegerOrVarContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_integerOrVar);
		try {
			setState(1072);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TokInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(1070);
				tokInteger();
				}
				break;
			case TokVar:
				enterOuterAlt(_localctx, 2);
				{
				setState(1071);
				tokVar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunClausesContext extends ParserRuleContext {
		public List<FunClauseContext> funClause() {
			return getRuleContexts(FunClauseContext.class);
		}
		public FunClauseContext funClause(int i) {
			return getRuleContext(FunClauseContext.class,i);
		}
		public FunClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFunClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFunClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitFunClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunClausesContext funClauses() throws RecognitionException {
		FunClausesContext _localctx = new FunClausesContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_funClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			funClause();
			setState(1079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(1075);
				match(T__9);
				setState(1076);
				funClause();
				}
				}
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunClauseContext extends ParserRuleContext {
		public PatArgumentListContext patArgumentList() {
			return getRuleContext(PatArgumentListContext.class,0);
		}
		public ClauseGuardContext clauseGuard() {
			return getRuleContext(ClauseGuardContext.class,0);
		}
		public ClauseBodyContext clauseBody() {
			return getRuleContext(ClauseBodyContext.class,0);
		}
		public TokVarContext tokVar() {
			return getRuleContext(TokVarContext.class,0);
		}
		public FunClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFunClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFunClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitFunClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunClauseContext funClause() throws RecognitionException {
		FunClauseContext _localctx = new FunClauseContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_funClause);
		try {
			setState(1091);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(1082);
				patArgumentList();
				setState(1083);
				clauseGuard();
				setState(1084);
				clauseBody();
				}
				break;
			case TokVar:
				enterOuterAlt(_localctx, 2);
				{
				setState(1086);
				tokVar();
				setState(1087);
				patArgumentList();
				setState(1088);
				clauseGuard();
				setState(1089);
				clauseBody();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryExprContext extends ParserRuleContext {
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TryCatchContext tryCatch() {
			return getRuleContext(TryCatchContext.class,0);
		}
		public CrClausesContext crClauses() {
			return getRuleContext(CrClausesContext.class,0);
		}
		public TryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryExprContext tryExpr() throws RecognitionException {
		TryExprContext _localctx = new TryExprContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_tryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			match(T__40);
			setState(1094);
			exprs();
			setState(1097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(1095);
				match(T__37);
				setState(1096);
				crClauses();
				}
			}

			setState(1099);
			tryCatch();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryCatchContext extends ParserRuleContext {
		public TryClausesContext tryClauses() {
			return getRuleContext(TryClausesContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TryCatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTryCatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTryCatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTryCatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchContext tryCatch() throws RecognitionException {
		TryCatchContext _localctx = new TryCatchContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_tryCatch);
		try {
			setState(1115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1101);
				match(T__24);
				setState(1102);
				tryClauses();
				setState(1103);
				match(T__30);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1105);
				match(T__24);
				setState(1106);
				tryClauses();
				setState(1107);
				match(T__39);
				setState(1108);
				exprs();
				setState(1109);
				match(T__30);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1111);
				match(T__39);
				setState(1112);
				exprs();
				setState(1113);
				match(T__30);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryClausesContext extends ParserRuleContext {
		public List<TryClauseContext> tryClause() {
			return getRuleContexts(TryClauseContext.class);
		}
		public TryClauseContext tryClause(int i) {
			return getRuleContext(TryClauseContext.class,i);
		}
		public TryClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTryClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTryClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTryClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryClausesContext tryClauses() throws RecognitionException {
		TryClausesContext _localctx = new TryClausesContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_tryClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			tryClause();
			setState(1122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(1118);
				match(T__9);
				setState(1119);
				tryClause();
				}
				}
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryClauseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ClauseGuardContext clauseGuard() {
			return getRuleContext(ClauseGuardContext.class,0);
		}
		public ClauseBodyContext clauseBody() {
			return getRuleContext(ClauseBodyContext.class,0);
		}
		public PatExprContext patExpr() {
			return getRuleContext(PatExprContext.class,0);
		}
		public TryOptStackTraceContext tryOptStackTrace() {
			return getRuleContext(TryOptStackTraceContext.class,0);
		}
		public AtomOrVarContext atomOrVar() {
			return getRuleContext(AtomOrVarContext.class,0);
		}
		public TryClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTryClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTryClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTryClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryClauseContext tryClause() throws RecognitionException {
		TryClauseContext _localctx = new TryClauseContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_tryClause);
		try {
			setState(1139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1125);
				expr();
				setState(1126);
				clauseGuard();
				setState(1127);
				clauseBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(1129);
					atomOrVar();
					setState(1130);
					match(T__4);
					}
					break;
				}
				setState(1134);
				patExpr();
				setState(1135);
				tryOptStackTrace();
				setState(1136);
				clauseGuard();
				setState(1137);
				clauseBody();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryOptStackTraceContext extends ParserRuleContext {
		public TokVarContext tokVar() {
			return getRuleContext(TokVarContext.class,0);
		}
		public TryOptStackTraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryOptStackTrace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTryOptStackTrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTryOptStackTrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTryOptStackTrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryOptStackTraceContext tryOptStackTrace() throws RecognitionException {
		TryOptStackTraceContext _localctx = new TryOptStackTraceContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_tryOptStackTrace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(1141);
				match(T__4);
				setState(1142);
				tokVar();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			match(T__2);
			setState(1147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__7) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__21) | (1L << T__24) | (1L << T__29) | (1L << T__35) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TokAtom - 65)) | (1L << (TokVar - 65)) | (1L << (TokFloat - 65)) | (1L << (TokInteger - 65)) | (1L << (TokChar - 65)) | (1L << (TokString - 65)))) != 0)) {
				{
				setState(1146);
				exprs();
				}
			}

			setState(1149);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatArgumentListContext extends ParserRuleContext {
		public PatExprsContext patExprs() {
			return getRuleContext(PatExprsContext.class,0);
		}
		public PatArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterPatArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitPatArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitPatArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatArgumentListContext patArgumentList() throws RecognitionException {
		PatArgumentListContext _localctx = new PatArgumentListContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_patArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(T__2);
			setState(1153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__7) | (1L << T__13) | (1L << T__16) | (1L << T__21) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TokAtom - 65)) | (1L << (TokVar - 65)) | (1L << (TokFloat - 65)) | (1L << (TokInteger - 65)) | (1L << (TokChar - 65)) | (1L << (TokString - 65)))) != 0)) {
				{
				setState(1152);
				patExprs();
				}
			}

			setState(1155);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
			expr();
			setState(1162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(1158);
				match(T__5);
				setState(1159);
				expr();
				}
				}
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatExprsContext extends ParserRuleContext {
		public List<PatExprContext> patExpr() {
			return getRuleContexts(PatExprContext.class);
		}
		public PatExprContext patExpr(int i) {
			return getRuleContext(PatExprContext.class,i);
		}
		public PatExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterPatExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitPatExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitPatExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatExprsContext patExprs() throws RecognitionException {
		PatExprsContext _localctx = new PatExprsContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_patExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			patExpr();
			setState(1170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(1166);
				match(T__5);
				setState(1167);
				patExpr();
				}
				}
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Guard_Context extends ParserRuleContext {
		public List<ExprsContext> exprs() {
			return getRuleContexts(ExprsContext.class);
		}
		public ExprsContext exprs(int i) {
			return getRuleContext(ExprsContext.class,i);
		}
		public Guard_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterGuard_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitGuard_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitGuard_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guard_Context guard_() throws RecognitionException {
		Guard_Context _localctx = new Guard_Context(_ctx, getState());
		enterRule(_localctx, 230, RULE_guard_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			exprs();
			setState(1178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(1174);
				match(T__9);
				setState(1175);
				exprs();
				}
				}
				setState(1180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicContext extends ParserRuleContext {
		public TokCharContext tokChar() {
			return getRuleContext(TokCharContext.class,0);
		}
		public TokIntegerContext tokInteger() {
			return getRuleContext(TokIntegerContext.class,0);
		}
		public TokFloatContext tokFloat() {
			return getRuleContext(TokFloatContext.class,0);
		}
		public TokAtomContext tokAtom() {
			return getRuleContext(TokAtomContext.class,0);
		}
		public List<TokStringContext> tokString() {
			return getRuleContexts(TokStringContext.class);
		}
		public TokStringContext tokString(int i) {
			return getRuleContext(TokStringContext.class,i);
		}
		public AtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterAtomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitAtomic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitAtomic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicContext atomic() throws RecognitionException {
		AtomicContext _localctx = new AtomicContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_atomic);
		try {
			int _alt;
			setState(1190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TokChar:
				enterOuterAlt(_localctx, 1);
				{
				setState(1181);
				tokChar();
				}
				break;
			case TokInteger:
				enterOuterAlt(_localctx, 2);
				{
				setState(1182);
				tokInteger();
				}
				break;
			case TokFloat:
				enterOuterAlt(_localctx, 3);
				{
				setState(1183);
				tokFloat();
				}
				break;
			case TokAtom:
				enterOuterAlt(_localctx, 4);
				{
				setState(1184);
				tokAtom();
				}
				break;
			case TokString:
				enterOuterAlt(_localctx, 5);
				{
				setState(1186); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1185);
						tokString();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1188); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixOpContext extends ParserRuleContext {
		public PrefixOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterPrefixOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitPrefixOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitPrefixOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixOpContext prefixOp() throws RecognitionException {
		PrefixOpContext _localctx = new PrefixOpContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_prefixOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultOpContext extends ParserRuleContext {
		public MultOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterMultOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitMultOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitMultOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultOpContext multOp() throws RecognitionException {
		MultOpContext _localctx = new MultOpContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__31) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddOpContext extends ParserRuleContext {
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitAddOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__41) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListOpContext extends ParserRuleContext {
		public ListOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterListOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitListOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitListOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListOpContext listOp() throws RecognitionException {
		ListOpContext _localctx = new ListOpContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_listOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			_la = _input.LA(1);
			if ( !(_la==T__54 || _la==T__55) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompOpContext extends ParserRuleContext {
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitCompOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitCompOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			_la = _input.LA(1);
			if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (T__56 - 57)) | (1L << (T__57 - 57)) | (1L << (T__58 - 57)) | (1L << (T__59 - 57)) | (1L << (T__60 - 57)) | (1L << (T__61 - 57)) | (1L << (T__62 - 57)) | (1L << (T__63 - 57)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23:
			return type300_sempred((Type300Context)_localctx, predIndex);
		case 24:
			return type400_sempred((Type400Context)_localctx, predIndex);
		case 58:
			return patExpr400_sempred((PatExpr400Context)_localctx, predIndex);
		case 59:
			return patExpr500_sempred((PatExpr500Context)_localctx, predIndex);
		case 65:
			return mapPatExpr_sempred((MapPatExprContext)_localctx, predIndex);
		case 83:
			return mapExpr_sempred((MapExprContext)_localctx, predIndex);
		case 89:
			return recordExpr_sempred((RecordExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type300_sempred(Type300Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean type400_sempred(Type400Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean patExpr400_sempred(PatExpr400Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean patExpr500_sempred(PatExpr500Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mapPatExpr_sempred(MapPatExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean mapExpr_sempred(MapExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean recordExpr_sempred(RecordExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u04b5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\3\2\6\2\u00f8\n\2\r\2\16\2\u00f9\3\2\3\2"+
		"\3\3\3\3\5\3\u0100\n\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u0120\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u012a\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\5\f\u0131\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u013b\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u014e\n\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\7\21\u0157\n\21\f\21\16\21\u015a\13\21\3\22\3\22\3\22\5\22"+
		"\u015f\n\22\3\23\3\23\3\23\7\23\u0164\n\23\f\23\16\23\u0167\13\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0172\n\24\3\25\3\25\3\25"+
		"\7\25\u0177\n\25\f\25\16\25\u017a\13\25\3\26\3\26\3\26\5\26\u017f\n\26"+
		"\3\26\3\26\3\27\3\27\3\27\5\27\u0186\n\27\3\30\3\30\3\30\5\30\u018b\n"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0194\n\31\f\31\16\31\u0197"+
		"\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u01a0\n\32\f\32\16\32\u01a3"+
		"\13\32\3\33\5\33\u01a6\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5"+
		"\34\u01f6\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01fe\n\35\3\36\3\36"+
		"\5\36\u0202\n\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u020b\n\37\f"+
		"\37\16\37\u020e\13\37\3 \3 \3 \3 \3!\3!\3!\7!\u0217\n!\f!\16!\u021a\13"+
		"!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0230"+
		"\n#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\5&\u024b\n&\3\'\3\'\3\'\7\'\u0250\n\'\f\'\16\'\u0253\13\'\3"+
		"(\3(\3(\3(\3(\3)\3)\3*\3*\5*\u025e\n*\3+\3+\3+\3,\3,\3,\5,\u0266\n,\3"+
		"-\3-\3-\7-\u026b\n-\f-\16-\u026e\13-\3.\3.\3.\7.\u0273\n.\f.\16.\u0276"+
		"\13.\3/\3/\3/\7/\u027b\n/\f/\16/\u027e\13/\3\60\3\60\3\60\3\60\5\60\u0284"+
		"\n\60\3\61\3\61\3\61\3\61\7\61\u028a\n\61\f\61\16\61\u028d\13\61\3\62"+
		"\3\62\3\62\3\62\7\62\u0293\n\62\f\62\16\62\u0296\13\62\3\63\3\63\3\63"+
		"\3\63\7\63\u029c\n\63\f\63\16\63\u029f\13\63\3\64\3\64\3\64\3\64\5\64"+
		"\u02a5\n\64\3\65\3\65\5\65\u02a9\n\65\3\66\3\66\3\66\5\66\u02ae\n\66\3"+
		"\67\3\67\3\67\5\67\u02b3\n\67\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\58\u02c9\n8\39\39\39\59\u02ce\n9\3:\3:\3:\3:\5:\u02d4"+
		"\n:\3;\3;\3;\3;\5;\u02da\n;\3<\3<\3<\3<\3<\3<\3<\7<\u02e3\n<\f<\16<\u02e6"+
		"\13<\3=\3=\3=\3=\3=\3=\3=\7=\u02ef\n=\f=\16=\u02f2\13=\3>\3>\3>\3>\5>"+
		"\u02f8\n>\3?\3?\5?\u02fc\n?\3@\3@\5@\u0300\n@\3A\3A\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\5B\u030d\nB\3C\3C\5C\u0311\nC\3C\3C\3C\3C\3C\3C\7C\u0319\nC"+
		"\fC\16C\u031c\13C\3D\3D\3D\3D\3D\5D\u0323\nD\3E\3E\3E\3E\3E\3E\5E\u032b"+
		"\nE\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0336\nF\3G\3G\3G\3G\3G\3G\5G\u033e"+
		"\nG\3H\3H\3H\7H\u0343\nH\fH\16H\u0346\13H\3I\3I\3I\3I\3J\5J\u034d\nJ\3"+
		"J\3J\3K\3K\5K\u0353\nK\3L\3L\5L\u0357\nL\3M\3M\3M\7M\u035c\nM\fM\16M\u035f"+
		"\13M\3N\3N\3N\5N\u0364\nN\3O\3O\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3"+
		"R\3R\3R\7R\u0377\nR\fR\16R\u037a\13R\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u0385"+
		"\nS\3T\3T\5T\u0389\nT\3T\3T\3U\3U\5U\u038f\nU\3U\3U\3U\3U\3U\3U\7U\u0397"+
		"\nU\fU\16U\u039a\13U\3V\3V\3V\3V\7V\u03a0\nV\fV\16V\u03a3\13V\5V\u03a5"+
		"\nV\3V\3V\3W\3W\5W\u03ab\nW\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Z\3Z\3[\3[\5[\u03b9"+
		"\n[\3[\3[\3[\3[\3[\5[\u03c0\n[\3[\3[\3[\3[\3[\3[\5[\u03c8\n[\7[\u03ca"+
		"\n[\f[\16[\u03cd\13[\3\\\3\\\5\\\u03d1\n\\\3\\\3\\\3]\3]\3]\7]\u03d8\n"+
		"]\f]\16]\u03db\13]\3^\3^\5^\u03df\n^\3^\3^\3^\3_\3_\3_\3`\3`\3`\3`\3a"+
		"\3a\3a\7a\u03ee\na\fa\16a\u03f1\13a\3b\3b\3b\3c\3c\3c\3c\3c\3c\3d\3d\3"+
		"d\7d\u03ff\nd\fd\16d\u0402\13d\3e\3e\3e\3e\3f\3f\3f\3f\3f\3f\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\3f\3f\3f\5f\u0419\nf\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g"+
		"\3g\3g\3g\3g\3g\5g\u042b\ng\3h\3h\5h\u042f\nh\3i\3i\5i\u0433\ni\3j\3j"+
		"\3j\7j\u0438\nj\fj\16j\u043b\13j\3k\3k\3k\3k\3k\3k\3k\3k\3k\5k\u0446\n"+
		"k\3l\3l\3l\3l\5l\u044c\nl\3l\3l\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3"+
		"m\3m\5m\u045e\nm\3n\3n\3n\7n\u0463\nn\fn\16n\u0466\13n\3o\3o\3o\3o\3o"+
		"\3o\3o\5o\u046f\no\3o\3o\3o\3o\3o\5o\u0476\no\3p\3p\5p\u047a\np\3q\3q"+
		"\5q\u047e\nq\3q\3q\3r\3r\5r\u0484\nr\3r\3r\3s\3s\3s\7s\u048b\ns\fs\16"+
		"s\u048e\13s\3t\3t\3t\7t\u0493\nt\ft\16t\u0496\13t\3u\3u\3u\7u\u049b\n"+
		"u\fu\16u\u049e\13u\3v\3v\3v\3v\3v\6v\u04a5\nv\rv\16v\u04a6\5v\u04a9\n"+
		"v\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3{\2\t\60\62vx\u0084\u00a8\u00b4|\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\2\t\3\2\26\27\3\2\34\35\4\2\4\4,.\5\2\32\32\"\"/\62"+
		"\5\2\4\4,,\638\3\29:\3\2;B\2\u04cf\2\u00f7\3\2\2\2\4\u00ff\3\2\2\2\6\u0103"+
		"\3\2\2\2\b\u0105\3\2\2\2\n\u0107\3\2\2\2\f\u0109\3\2\2\2\16\u010b\3\2"+
		"\2\2\20\u010d\3\2\2\2\22\u011f\3\2\2\2\24\u0129\3\2\2\2\26\u0130\3\2\2"+
		"\2\30\u013a\3\2\2\2\32\u013c\3\2\2\2\34\u014d\3\2\2\2\36\u014f\3\2\2\2"+
		" \u0153\3\2\2\2\"\u015b\3\2\2\2$\u0160\3\2\2\2&\u0171\3\2\2\2(\u0173\3"+
		"\2\2\2*\u017e\3\2\2\2,\u0182\3\2\2\2.\u0187\3\2\2\2\60\u018c\3\2\2\2\62"+
		"\u0198\3\2\2\2\64\u01a5\3\2\2\2\66\u01f5\3\2\2\28\u01fd\3\2\2\2:\u01ff"+
		"\3\2\2\2<\u0207\3\2\2\2>\u020f\3\2\2\2@\u0213\3\2\2\2B\u021b\3\2\2\2D"+
		"\u022f\3\2\2\2F\u0231\3\2\2\2H\u0235\3\2\2\2J\u024a\3\2\2\2L\u024c\3\2"+
		"\2\2N\u0254\3\2\2\2P\u0259\3\2\2\2R\u025d\3\2\2\2T\u025f\3\2\2\2V\u0265"+
		"\3\2\2\2X\u0267\3\2\2\2Z\u026f\3\2\2\2\\\u0277\3\2\2\2^\u027f\3\2\2\2"+
		"`\u0285\3\2\2\2b\u028e\3\2\2\2d\u0297\3\2\2\2f\u02a4\3\2\2\2h\u02a8\3"+
		"\2\2\2j\u02ad\3\2\2\2l\u02af\3\2\2\2n\u02c8\3\2\2\2p\u02ca\3\2\2\2r\u02cf"+
		"\3\2\2\2t\u02d5\3\2\2\2v\u02db\3\2\2\2x\u02e7\3\2\2\2z\u02f7\3\2\2\2|"+
		"\u02fb\3\2\2\2~\u02ff\3\2\2\2\u0080\u0301\3\2\2\2\u0082\u030c\3\2\2\2"+
		"\u0084\u030e\3\2\2\2\u0086\u031d\3\2\2\2\u0088\u032a\3\2\2\2\u008a\u0335"+
		"\3\2\2\2\u008c\u033d\3\2\2\2\u008e\u033f\3\2\2\2\u0090\u0347\3\2\2\2\u0092"+
		"\u034c\3\2\2\2\u0094\u0352\3\2\2\2\u0096\u0356\3\2\2\2\u0098\u0358\3\2"+
		"\2\2\u009a\u0360\3\2\2\2\u009c\u0365\3\2\2\2\u009e\u0367\3\2\2\2\u00a0"+
		"\u036d\3\2\2\2\u00a2\u0373\3\2\2\2\u00a4\u0384\3\2\2\2\u00a6\u0386\3\2"+
		"\2\2\u00a8\u038c\3\2\2\2\u00aa\u039b\3\2\2\2\u00ac\u03aa\3\2\2\2\u00ae"+
		"\u03ac\3\2\2\2\u00b0\u03b0\3\2\2\2\u00b2\u03b4\3\2\2\2\u00b4\u03b6\3\2"+
		"\2\2\u00b6\u03ce\3\2\2\2\u00b8\u03d4\3\2\2\2\u00ba\u03de\3\2\2\2\u00bc"+
		"\u03e3\3\2\2\2\u00be\u03e6\3\2\2\2\u00c0\u03ea\3\2\2\2\u00c2\u03f2\3\2"+
		"\2\2\u00c4\u03f5\3\2\2\2\u00c6\u03fb\3\2\2\2\u00c8\u0403\3\2\2\2\u00ca"+
		"\u0418\3\2\2\2\u00cc\u042a\3\2\2\2\u00ce\u042e\3\2\2\2\u00d0\u0432\3\2"+
		"\2\2\u00d2\u0434\3\2\2\2\u00d4\u0445\3\2\2\2\u00d6\u0447\3\2\2\2\u00d8"+
		"\u045d\3\2\2\2\u00da\u045f\3\2\2\2\u00dc\u0475\3\2\2\2\u00de\u0479\3\2"+
		"\2\2\u00e0\u047b\3\2\2\2\u00e2\u0481\3\2\2\2\u00e4\u0487\3\2\2\2\u00e6"+
		"\u048f\3\2\2\2\u00e8\u0497\3\2\2\2\u00ea\u04a8\3\2\2\2\u00ec\u04aa\3\2"+
		"\2\2\u00ee\u04ac\3\2\2\2\u00f0\u04ae\3\2\2\2\u00f2\u04b0\3\2\2\2\u00f4"+
		"\u04b2\3\2\2\2\u00f6\u00f8\5\4\3\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\7\2\2\3\u00fc\3\3\2\2\2\u00fd\u0100\5\22\n\2\u00fe\u0100\5L\'\2"+
		"\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102"+
		"\7\3\2\2\u0102\5\3\2\2\2\u0103\u0104\7C\2\2\u0104\7\3\2\2\2\u0105\u0106"+
		"\7D\2\2\u0106\t\3\2\2\2\u0107\u0108\7E\2\2\u0108\13\3\2\2\2\u0109\u010a"+
		"\7F\2\2\u010a\r\3\2\2\2\u010b\u010c\7G\2\2\u010c\17\3\2\2\2\u010d\u010e"+
		"\7H\2\2\u010e\21\3\2\2\2\u010f\u0110\7\4\2\2\u0110\u0111\5\6\4\2\u0111"+
		"\u0112\5J&\2\u0112\u0120\3\2\2\2\u0113\u0114\7\4\2\2\u0114\u0115\5\6\4"+
		"\2\u0115\u0116\5\30\r\2\u0116\u0120\3\2\2\2\u0117\u0118\7\4\2\2\u0118"+
		"\u0119\5\6\4\2\u0119\u011a\7\5\2\2\u011a\u011b\5\30\r\2\u011b\u011c\7"+
		"\6\2\2\u011c\u0120\3\2\2\2\u011d\u011e\7I\2\2\u011e\u0120\5\24\13\2\u011f"+
		"\u010f\3\2\2\2\u011f\u0113\3\2\2\2\u011f\u0117\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u0120\23\3\2\2\2\u0121\u0122\5\26\f\2\u0122\u0123\5 \21\2\u0123\u012a"+
		"\3\2\2\2\u0124\u0125\7\5\2\2\u0125\u0126\5\26\f\2\u0126\u0127\5 \21\2"+
		"\u0127\u0128\7\6\2\2\u0128\u012a\3\2\2\2\u0129\u0121\3\2\2\2\u0129\u0124"+
		"\3\2\2\2\u012a\25\3\2\2\2\u012b\u0131\5\6\4\2\u012c\u012d\5\6\4\2\u012d"+
		"\u012e\7\7\2\2\u012e\u012f\5\6\4\2\u012f\u0131\3\2\2\2\u0130\u012b\3\2"+
		"\2\2\u0130\u012c\3\2\2\2\u0131\27\3\2\2\2\u0132\u0133\5V,\2\u0133\u0134"+
		"\7\b\2\2\u0134\u0135\5\32\16\2\u0135\u013b\3\2\2\2\u0136\u0137\5V,\2\u0137"+
		"\u0138\7\t\2\2\u0138\u0139\5*\26\2\u0139\u013b\3\2\2\2\u013a\u0132\3\2"+
		"\2\2\u013a\u0136\3\2\2\2\u013b\31\3\2\2\2\u013c\u013d\7\n\2\2\u013d\u013e"+
		"\5\34\17\2\u013e\u013f\7\13\2\2\u013f\33\3\2\2\2\u0140\u014e\5\36\20\2"+
		"\u0141\u0142\5\36\20\2\u0142\u0143\7\b\2\2\u0143\u0144\5\34\17\2\u0144"+
		"\u014e\3\2\2\2\u0145\u0146\5V,\2\u0146\u0147\7\b\2\2\u0147\u0148\5\34"+
		"\17\2\u0148\u014e\3\2\2\2\u0149\u014a\5\36\20\2\u014a\u014b\7\b\2\2\u014b"+
		"\u014c\5\u00e4s\2\u014c\u014e\3\2\2\2\u014d\u0140\3\2\2\2\u014d\u0141"+
		"\3\2\2\2\u014d\u0145\3\2\2\2\u014d\u0149\3\2\2\2\u014e\35\3\2\2\2\u014f"+
		"\u0150\5V,\2\u0150\u0151\7\t\2\2\u0151\u0152\5*\26\2\u0152\37\3\2\2\2"+
		"\u0153\u0158\5\"\22\2\u0154\u0155\7\f\2\2\u0155\u0157\5\"\22\2\u0156\u0154"+
		"\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"!\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015e\5:\36\2\u015c\u015d\7\r\2\2"+
		"\u015d\u015f\5$\23\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f#\3"+
		"\2\2\2\u0160\u0165\5&\24\2\u0161\u0162\7\b\2\2\u0162\u0164\5&\24\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166%\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\5\6\4\2\u0169\u016a"+
		"\7\5\2\2\u016a\u016b\5(\25\2\u016b\u016c\7\6\2\2\u016c\u0172\3\2\2\2\u016d"+
		"\u016e\5\b\5\2\u016e\u016f\7\t\2\2\u016f\u0170\5*\26\2\u0170\u0172\3\2"+
		"\2\2\u0171\u0168\3\2\2\2\u0171\u016d\3\2\2\2\u0172\'\3\2\2\2\u0173\u0178"+
		"\5*\26\2\u0174\u0175\7\b\2\2\u0175\u0177\5*\26\2\u0176\u0174\3\2\2\2\u0177"+
		"\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179)\3\2\2\2"+
		"\u017a\u0178\3\2\2\2\u017b\u017c\5\b\5\2\u017c\u017d\7\t\2\2\u017d\u017f"+
		"\3\2\2\2\u017e\u017b\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0181\5,\27\2\u0181+\3\2\2\2\u0182\u0185\5.\30\2\u0183\u0184\7\16\2\2"+
		"\u0184\u0186\5,\27\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186-\3"+
		"\2\2\2\u0187\u018a\5\60\31\2\u0188\u0189\7\17\2\2\u0189\u018b\5\60\31"+
		"\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b/\3\2\2\2\u018c\u018d"+
		"\b\31\1\2\u018d\u018e\5\62\32\2\u018e\u0195\3\2\2\2\u018f\u0190\f\4\2"+
		"\2\u0190\u0191\5\u00f0y\2\u0191\u0192\5\62\32\2\u0192\u0194\3\2\2\2\u0193"+
		"\u018f\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\61\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\b\32\1\2\u0199\u019a"+
		"\5\64\33\2\u019a\u01a1\3\2\2\2\u019b\u019c\f\4\2\2\u019c\u019d\5\u00ee"+
		"x\2\u019d\u019e\5\64\33\2\u019e\u01a0\3\2\2\2\u019f\u019b\3\2\2\2\u01a0"+
		"\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\63\3\2\2"+
		"\2\u01a3\u01a1\3\2\2\2\u01a4\u01a6\5\u00ecw\2\u01a5\u01a4\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\5\66\34\2\u01a8\65\3\2"+
		"\2\2\u01a9\u01aa\7\5\2\2\u01aa\u01ab\5*\26\2\u01ab\u01ac\7\6\2\2\u01ac"+
		"\u01f6\3\2\2\2\u01ad\u01f6\5\b\5\2\u01ae\u01f6\5\6\4\2\u01af\u01b0\5\6"+
		"\4\2\u01b0\u01b1\7\5\2\2\u01b1\u01b2\7\6\2\2\u01b2\u01f6\3\2\2\2\u01b3"+
		"\u01b4\5\6\4\2\u01b4\u01b5\7\5\2\2\u01b5\u01b6\5(\25\2\u01b6\u01b7\7\6"+
		"\2\2\u01b7\u01f6\3\2\2\2\u01b8\u01b9\5\6\4\2\u01b9\u01ba\7\7\2\2\u01ba"+
		"\u01bb\5\6\4\2\u01bb\u01bc\7\5\2\2\u01bc\u01bd\7\6\2\2\u01bd\u01f6\3\2"+
		"\2\2\u01be\u01bf\5\6\4\2\u01bf\u01c0\7\7\2\2\u01c0\u01c1\5\6\4\2\u01c1"+
		"\u01c2\7\5\2\2\u01c2\u01c3\5(\25\2\u01c3\u01c4\7\6\2\2\u01c4\u01f6\3\2"+
		"\2\2\u01c5\u01c6\7\20\2\2\u01c6\u01f6\7\21\2\2\u01c7\u01c8\7\20\2\2\u01c8"+
		"\u01c9\5*\26\2\u01c9\u01ca\7\21\2\2\u01ca\u01f6\3\2\2\2\u01cb\u01cc\7"+
		"\20\2\2\u01cc\u01cd\5*\26\2\u01cd\u01ce\7\b\2\2\u01ce\u01cf\7\22\2\2\u01cf"+
		"\u01d0\7\21\2\2\u01d0\u01f6\3\2\2\2\u01d1\u01d2\7\23\2\2\u01d2\u01d3\7"+
		"\n\2\2\u01d3\u01f6\7\13\2\2\u01d4\u01d5\7\23\2\2\u01d5\u01d6\7\n\2\2\u01d6"+
		"\u01d7\5<\37\2\u01d7\u01d8\7\13\2\2\u01d8\u01f6\3\2\2\2\u01d9\u01da\7"+
		"\n\2\2\u01da\u01f6\7\13\2\2\u01db\u01dc\7\n\2\2\u01dc\u01dd\5(\25\2\u01dd"+
		"\u01de\7\13\2\2\u01de\u01f6\3\2\2\2\u01df\u01e0\7\23\2\2\u01e0\u01e1\5"+
		"\6\4\2\u01e1\u01e2\7\n\2\2\u01e2\u01e3\7\13\2\2\u01e3\u01f6\3\2\2\2\u01e4"+
		"\u01e5\7\23\2\2\u01e5\u01e6\5\6\4\2\u01e6\u01e7\7\n\2\2\u01e7\u01e8\5"+
		"@!\2\u01e8\u01e9\7\13\2\2\u01e9\u01f6\3\2\2\2\u01ea\u01f6\5D#\2\u01eb"+
		"\u01f6\5\f\7\2\u01ec\u01f6\5\16\b\2\u01ed\u01ee\7\24\2\2\u01ee\u01ef\7"+
		"\5\2\2\u01ef\u01f6\7\6\2\2\u01f0\u01f1\7\24\2\2\u01f1\u01f2\7\5\2\2\u01f2"+
		"\u01f3\58\35\2\u01f3\u01f4\7\6\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01a9\3\2"+
		"\2\2\u01f5\u01ad\3\2\2\2\u01f5\u01ae\3\2\2\2\u01f5\u01af\3\2\2\2\u01f5"+
		"\u01b3\3\2\2\2\u01f5\u01b8\3\2\2\2\u01f5\u01be\3\2\2\2\u01f5\u01c5\3\2"+
		"\2\2\u01f5\u01c7\3\2\2\2\u01f5\u01cb\3\2\2\2\u01f5\u01d1\3\2\2\2\u01f5"+
		"\u01d4\3\2\2\2\u01f5\u01d9\3\2\2\2\u01f5\u01db\3\2\2\2\u01f5\u01df\3\2"+
		"\2\2\u01f5\u01e4\3\2\2\2\u01f5\u01ea\3\2\2\2\u01f5\u01eb\3\2\2\2\u01f5"+
		"\u01ec\3\2\2\2\u01f5\u01ed\3\2\2\2\u01f5\u01f0\3\2\2\2\u01f6\67\3\2\2"+
		"\2\u01f7\u01f8\7\5\2\2\u01f8\u01f9\7\22\2\2\u01f9\u01fa\7\6\2\2\u01fa"+
		"\u01fb\7\25\2\2\u01fb\u01fe\5*\26\2\u01fc\u01fe\5:\36\2\u01fd\u01f7\3"+
		"\2\2\2\u01fd\u01fc\3\2\2\2\u01fe9\3\2\2\2\u01ff\u0201\7\5\2\2\u0200\u0202"+
		"\5(\25\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\u0204\7\6\2\2\u0204\u0205\7\25\2\2\u0205\u0206\5*\26\2\u0206;\3\2\2\2"+
		"\u0207\u020c\5> \2\u0208\u0209\7\b\2\2\u0209\u020b\5> \2\u020a\u0208\3"+
		"\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"=\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0210\5*\26\2\u0210\u0211\t\2\2\2"+
		"\u0211\u0212\5*\26\2\u0212?\3\2\2\2\u0213\u0218\5B\"\2\u0214\u0215\7\b"+
		"\2\2\u0215\u0217\5B\"\2\u0216\u0214\3\2\2\2\u0217\u021a\3\2\2\2\u0218"+
		"\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219A\3\2\2\2\u021a\u0218\3\2\2\2"+
		"\u021b\u021c\5\6\4\2\u021c\u021d\7\t\2\2\u021d\u021e\5*\26\2\u021eC\3"+
		"\2\2\2\u021f\u0220\7\30\2\2\u0220\u0230\7\31\2\2\u0221\u0222\7\30\2\2"+
		"\u0222\u0223\5F$\2\u0223\u0224\7\31\2\2\u0224\u0230\3\2\2\2\u0225\u0226"+
		"\7\30\2\2\u0226\u0227\5H%\2\u0227\u0228\7\31\2\2\u0228\u0230\3\2\2\2\u0229"+
		"\u022a\7\30\2\2\u022a\u022b\5F$\2\u022b\u022c\7\b\2\2\u022c\u022d\5H%"+
		"\2\u022d\u022e\7\31\2\2\u022e\u0230\3\2\2\2\u022f\u021f\3\2\2\2\u022f"+
		"\u0221\3\2\2\2\u022f\u0225\3\2\2\2\u022f\u0229\3\2\2\2\u0230E\3\2\2\2"+
		"\u0231\u0232\5\b\5\2\u0232\u0233\7\7\2\2\u0233\u0234\5\66\34\2\u0234G"+
		"\3\2\2\2\u0235\u0236\5\b\5\2\u0236\u0237\7\7\2\2\u0237\u0238\5\b\5\2\u0238"+
		"\u0239\7\32\2\2\u0239\u023a\5\66\34\2\u023aI\3\2\2\2\u023b\u024b\5V,\2"+
		"\u023c\u023d\7\5\2\2\u023d\u023e\5V,\2\u023e\u023f\7\6\2\2\u023f\u024b"+
		"\3\2\2\2\u0240\u0241\5V,\2\u0241\u0242\7\b\2\2\u0242\u0243\5\u00e4s\2"+
		"\u0243\u024b\3\2\2\2\u0244\u0245\7\5\2\2\u0245\u0246\5V,\2\u0246\u0247"+
		"\7\b\2\2\u0247\u0248\5\u00e4s\2\u0248\u0249\7\6\2\2\u0249\u024b\3\2\2"+
		"\2\u024a\u023b\3\2\2\2\u024a\u023c\3\2\2\2\u024a\u0240\3\2\2\2\u024a\u0244"+
		"\3\2\2\2\u024bK\3\2\2\2\u024c\u0251\5N(\2\u024d\u024e\7\f\2\2\u024e\u0250"+
		"\5N(\2\u024f\u024d\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251"+
		"\u0252\3\2\2\2\u0252M\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0255\5\6\4\2"+
		"\u0255\u0256\5P)\2\u0256\u0257\5R*\2\u0257\u0258\5T+\2\u0258O\3\2\2\2"+
		"\u0259\u025a\5\u00e2r\2\u025aQ\3\2\2\2\u025b\u025c\7\r\2\2\u025c\u025e"+
		"\5\u00e8u\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025eS\3\2\2\2\u025f"+
		"\u0260\7\25\2\2\u0260\u0261\5\u00e4s\2\u0261U\3\2\2\2\u0262\u0263\7\33"+
		"\2\2\u0263\u0266\5V,\2\u0264\u0266\5X-\2\u0265\u0262\3\2\2\2\u0265\u0264"+
		"\3\2\2\2\u0266W\3\2\2\2\u0267\u026c\5Z.\2\u0268\u0269\t\3\2\2\u0269\u026b"+
		"\5Z.\2\u026a\u0268\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c"+
		"\u026d\3\2\2\2\u026dY\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0274\5\\/\2\u0270"+
		"\u0271\7\36\2\2\u0271\u0273\5\\/\2\u0272\u0270\3\2\2\2\u0273\u0276\3\2"+
		"\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275[\3\2\2\2\u0276\u0274"+
		"\3\2\2\2\u0277\u027c\5^\60\2\u0278\u0279\7\37\2\2\u0279\u027b\5^\60\2"+
		"\u027a\u0278\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d"+
		"\3\2\2\2\u027d]\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0283\5`\61\2\u0280"+
		"\u0281\5\u00f4{\2\u0281\u0282\5`\61\2\u0282\u0284\3\2\2\2\u0283\u0280"+
		"\3\2\2\2\u0283\u0284\3\2\2\2\u0284_\3\2\2\2\u0285\u028b\5b\62\2\u0286"+
		"\u0287\5\u00f2z\2\u0287\u0288\5b\62\2\u0288\u028a\3\2\2\2\u0289\u0286"+
		"\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"a\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u0294\5d\63\2\u028f\u0290\5\u00f0"+
		"y\2\u0290\u0291\5d\63\2\u0291\u0293\3\2\2\2\u0292\u028f\3\2\2\2\u0293"+
		"\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295c\3\2\2\2"+
		"\u0296\u0294\3\2\2\2\u0297\u029d\5f\64\2\u0298\u0299\5\u00eex\2\u0299"+
		"\u029a\5f\64\2\u029a\u029c\3\2\2\2\u029b\u0298\3\2\2\2\u029c\u029f\3\2"+
		"\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029ee\3\2\2\2\u029f\u029d"+
		"\3\2\2\2\u02a0\u02a1\5\u00ecw\2\u02a1\u02a2\5f\64\2\u02a2\u02a5\3\2\2"+
		"\2\u02a3\u02a5\5h\65\2\u02a4\u02a0\3\2\2\2\u02a4\u02a3\3\2\2\2\u02a5g"+
		"\3\2\2\2\u02a6\u02a9\5\u00a8U\2\u02a7\u02a9\5j\66\2\u02a8\u02a6\3\2\2"+
		"\2\u02a8\u02a7\3\2\2\2\u02a9i\3\2\2\2\u02aa\u02ae\5\u00bc_\2\u02ab\u02ae"+
		"\5\u00b4[\2\u02ac\u02ae\5l\67\2\u02ad\u02aa\3\2\2\2\u02ad\u02ab\3\2\2"+
		"\2\u02ad\u02ac\3\2\2\2\u02aek\3\2\2\2\u02af\u02b2\5n8\2\u02b0\u02b1\7"+
		"\7\2\2\u02b1\u02b3\5n8\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3"+
		"m\3\2\2\2\u02b4\u02c9\5\b\5\2\u02b5\u02c9\5\u00eav\2\u02b6\u02c9\5\u0088"+
		"E\2\u02b7\u02c9\5\u008cG\2\u02b8\u02c9\5\u009eP\2\u02b9\u02c9\5\u00a0"+
		"Q\2\u02ba\u02c9\5\u00a6T\2\u02bb\u02bc\7\5\2\2\u02bc\u02bd\5V,\2\u02bd"+
		"\u02be\7\6\2\2\u02be\u02c9\3\2\2\2\u02bf\u02c0\7 \2\2\u02c0\u02c1\5\u00e4"+
		"s\2\u02c1\u02c2\7!\2\2\u02c2\u02c9\3\2\2\2\u02c3\u02c9\5\u00be`\2\u02c4"+
		"\u02c9\5\u00c4c\2\u02c5\u02c9\5\u00caf\2\u02c6\u02c9\5\u00ccg\2\u02c7"+
		"\u02c9\5\u00d6l\2\u02c8\u02b4\3\2\2\2\u02c8\u02b5\3\2\2\2\u02c8\u02b6"+
		"\3\2\2\2\u02c8\u02b7\3\2\2\2\u02c8\u02b8\3\2\2\2\u02c8\u02b9\3\2\2\2\u02c8"+
		"\u02ba\3\2\2\2\u02c8\u02bb\3\2\2\2\u02c8\u02bf\3\2\2\2\u02c8\u02c3\3\2"+
		"\2\2\u02c8\u02c4\3\2\2\2\u02c8\u02c5\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8"+
		"\u02c7\3\2\2\2\u02c9o\3\2\2\2\u02ca\u02cd\5r:\2\u02cb\u02cc\7\34\2\2\u02cc"+
		"\u02ce\5p9\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ceq\3\2\2\2\u02cf"+
		"\u02d3\5t;\2\u02d0\u02d1\5\u00f4{\2\u02d1\u02d2\5t;\2\u02d2\u02d4\3\2"+
		"\2\2\u02d3\u02d0\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4s\3\2\2\2\u02d5\u02d9"+
		"\5v<\2\u02d6\u02d7\5\u00f2z\2\u02d7\u02d8\5t;\2\u02d8\u02da\3\2\2\2\u02d9"+
		"\u02d6\3\2\2\2\u02d9\u02da\3\2\2\2\u02dau\3\2\2\2\u02db\u02dc\b<\1\2\u02dc"+
		"\u02dd\5x=\2\u02dd\u02e4\3\2\2\2\u02de\u02df\f\4\2\2\u02df\u02e0\5\u00f0"+
		"y\2\u02e0\u02e1\5x=\2\u02e1\u02e3\3\2\2\2\u02e2\u02de\3\2\2\2\u02e3\u02e6"+
		"\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5w\3\2\2\2\u02e6"+
		"\u02e4\3\2\2\2\u02e7\u02e8\b=\1\2\u02e8\u02e9\5z>\2\u02e9\u02f0\3\2\2"+
		"\2\u02ea\u02eb\f\4\2\2\u02eb\u02ec\5\u00eex\2\u02ec\u02ed\5z>\2\u02ed"+
		"\u02ef\3\2\2\2\u02ee\u02ea\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2"+
		"\2\2\u02f0\u02f1\3\2\2\2\u02f1y\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02f4"+
		"\5\u00ecw\2\u02f4\u02f5\5z>\2\u02f5\u02f8\3\2\2\2\u02f6\u02f8\5|?\2\u02f7"+
		"\u02f3\3\2\2\2\u02f7\u02f6\3\2\2\2\u02f8{\3\2\2\2\u02f9\u02fc\5\u0084"+
		"C\2\u02fa\u02fc\5~@\2\u02fb\u02f9\3\2\2\2\u02fb\u02fa\3\2\2\2\u02fc}\3"+
		"\2\2\2\u02fd\u0300\5\u0086D\2\u02fe\u0300\5\u0080A\2\u02ff\u02fd\3\2\2"+
		"\2\u02ff\u02fe\3\2\2\2\u0300\177\3\2\2\2\u0301\u0302\5\u0082B\2\u0302"+
		"\u0081\3\2\2\2\u0303\u030d\5\b\5\2\u0304\u030d\5\u00eav\2\u0305\u030d"+
		"\5\u0088E\2\u0306\u030d\5\u008cG\2\u0307\u030d\5\u00a6T\2\u0308\u0309"+
		"\7\5\2\2\u0309\u030a\5p9\2\u030a\u030b\7\6\2\2\u030b\u030d\3\2\2\2\u030c"+
		"\u0303\3\2\2\2\u030c\u0304\3\2\2\2\u030c\u0305\3\2\2\2\u030c\u0306\3\2"+
		"\2\2\u030c\u0307\3\2\2\2\u030c\u0308\3\2\2\2\u030d\u0083\3\2\2\2\u030e"+
		"\u0310\bC\1\2\u030f\u0311\5\u0082B\2\u0310\u030f\3\2\2\2\u0310\u0311\3"+
		"\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\7\23\2\2\u0313\u0314\5\u00aaV\2"+
		"\u0314\u031a\3\2\2\2\u0315\u0316\f\3\2\2\u0316\u0317\7\23\2\2\u0317\u0319"+
		"\5\u00aaV\2\u0318\u0315\3\2\2\2\u0319\u031c\3\2\2\2\u031a\u0318\3\2\2"+
		"\2\u031a\u031b\3\2\2\2\u031b\u0085\3\2\2\2\u031c\u031a\3\2\2\2\u031d\u031e"+
		"\7\23\2\2\u031e\u0322\5\6\4\2\u031f\u0320\7\3\2\2\u0320\u0323\5\6\4\2"+
		"\u0321\u0323\5\u00b6\\\2\u0322\u031f\3\2\2\2\u0322\u0321\3\2\2\2\u0323"+
		"\u0087\3\2\2\2\u0324\u0325\7\20\2\2\u0325\u032b\7\21\2\2\u0326\u0327\7"+
		"\20\2\2\u0327\u0328\5V,\2\u0328\u0329\5\u008aF\2\u0329\u032b\3\2\2\2\u032a"+
		"\u0324\3\2\2\2\u032a\u0326\3\2\2\2\u032b\u0089\3\2\2\2\u032c\u0336\7\21"+
		"\2\2\u032d\u032e\7\16\2\2\u032e\u032f\5V,\2\u032f\u0330\7\21\2\2\u0330"+
		"\u0336\3\2\2\2\u0331\u0332\7\b\2\2\u0332\u0333\5V,\2\u0333\u0334\5\u008a"+
		"F\2\u0334\u0336\3\2\2\2\u0335\u032c\3\2\2\2\u0335\u032d\3\2\2\2\u0335"+
		"\u0331\3\2\2\2\u0336\u008b\3\2\2\2\u0337\u0338\7\30\2\2\u0338\u033e\7"+
		"\31\2\2\u0339\u033a\7\30\2\2\u033a\u033b\5\u008eH\2\u033b\u033c\7\31\2"+
		"\2\u033c\u033e\3\2\2\2\u033d\u0337\3\2\2\2\u033d\u0339\3\2\2\2\u033e\u008d"+
		"\3\2\2\2\u033f\u0344\5\u0090I\2\u0340\u0341\7\b\2\2\u0341\u0343\5\u0090"+
		"I\2\u0342\u0340\3\2\2\2\u0343\u0346\3\2\2\2\u0344\u0342\3\2\2\2\u0344"+
		"\u0345\3\2\2\2\u0345\u008f\3\2\2\2\u0346\u0344\3\2\2\2\u0347\u0348\5\u0092"+
		"J\2\u0348\u0349\5\u0094K\2\u0349\u034a\5\u0096L\2\u034a\u0091\3\2\2\2"+
		"\u034b\u034d\5\u00ecw\2\u034c\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d"+
		"\u034e\3\2\2\2\u034e\u034f\5n8\2\u034f\u0093\3\2\2\2\u0350\u0351\7\7\2"+
		"\2\u0351\u0353\5\u009cO\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353"+
		"\u0095\3\2\2\2\u0354\u0355\7\"\2\2\u0355\u0357\5\u0098M\2\u0356\u0354"+
		"\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0097\3\2\2\2\u0358\u035d\5\u009aN"+
		"\2\u0359\u035a\7\4\2\2\u035a\u035c\5\u009aN\2\u035b\u0359\3\2\2\2\u035c"+
		"\u035f\3\2\2\2\u035d\u035b\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u0099\3\2"+
		"\2\2\u035f\u035d\3\2\2\2\u0360\u0363\5\6\4\2\u0361\u0362\7\7\2\2\u0362"+
		"\u0364\5\f\7\2\u0363\u0361\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u009b\3\2"+
		"\2\2\u0365\u0366\5n8\2\u0366\u009d\3\2\2\2\u0367\u0368\7\20\2\2\u0368"+
		"\u0369\5V,\2\u0369\u036a\7#\2\2\u036a\u036b\5\u00a2R\2\u036b\u036c\7\21"+
		"\2\2\u036c\u009f\3\2\2\2\u036d\u036e\7\30\2\2\u036e\u036f\5n8\2\u036f"+
		"\u0370\7#\2\2\u0370\u0371\5\u00a2R\2\u0371\u0372\7\31\2\2\u0372\u00a1"+
		"\3\2\2\2\u0373\u0378\5\u00a4S\2\u0374\u0375\7\b\2\2\u0375\u0377\5\u00a4"+
		"S\2\u0376\u0374\3\2\2\2\u0377\u037a\3\2\2\2\u0378\u0376\3\2\2\2\u0378"+
		"\u0379\3\2\2\2\u0379\u00a3\3\2\2\2\u037a\u0378\3\2\2\2\u037b\u0385\5V"+
		",\2\u037c\u037d\5V,\2\u037d\u037e\7$\2\2\u037e\u037f\5V,\2\u037f\u0385"+
		"\3\2\2\2\u0380\u0381\5\u008cG\2\u0381\u0382\7%\2\2\u0382\u0383\5V,\2\u0383"+
		"\u0385\3\2\2\2\u0384\u037b\3\2\2\2\u0384\u037c\3\2\2\2\u0384\u0380\3\2"+
		"\2\2\u0385\u00a5\3\2\2\2\u0386\u0388\7\n\2\2\u0387\u0389\5\u00e4s\2\u0388"+
		"\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038b\7\13"+
		"\2\2\u038b\u00a7\3\2\2\2\u038c\u038e\bU\1\2\u038d\u038f\5n8\2\u038e\u038d"+
		"\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0391\7\23\2\2"+
		"\u0391\u0392\5\u00aaV\2\u0392\u0398\3\2\2\2\u0393\u0394\f\3\2\2\u0394"+
		"\u0395\7\23\2\2\u0395\u0397\5\u00aaV\2\u0396\u0393\3\2\2\2\u0397\u039a"+
		"\3\2\2\2\u0398\u0396\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u00a9\3\2\2\2\u039a"+
		"\u0398\3\2\2\2\u039b\u03a4\7\n\2\2\u039c\u03a1\5\u00acW\2\u039d\u039e"+
		"\7\b\2\2\u039e\u03a0\5\u00acW\2\u039f\u039d\3\2\2\2\u03a0\u03a3\3\2\2"+
		"\2\u03a1\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3\u03a1"+
		"\3\2\2\2\u03a4\u039c\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6"+
		"\u03a7\7\13\2\2\u03a7\u00ab\3\2\2\2\u03a8\u03ab\5\u00aeX\2\u03a9\u03ab"+
		"\5\u00b0Y\2\u03aa\u03a8\3\2\2\2\u03aa\u03a9\3\2\2\2\u03ab\u00ad\3\2\2"+
		"\2\u03ac\u03ad\5\u00b2Z\2\u03ad\u03ae\7\26\2\2\u03ae\u03af\5V,\2\u03af"+
		"\u00af\3\2\2\2\u03b0\u03b1\5\u00b2Z\2\u03b1\u03b2\7\27\2\2\u03b2\u03b3"+
		"\5V,\2\u03b3\u00b1\3\2\2\2\u03b4\u03b5\5V,\2\u03b5\u00b3\3\2\2\2\u03b6"+
		"\u03b8\b[\1\2\u03b7\u03b9\5n8\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9\3\2\2"+
		"\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\7\23\2\2\u03bb\u03bf\5\6\4\2\u03bc"+
		"\u03bd\7\3\2\2\u03bd\u03c0\5\6\4\2\u03be\u03c0\5\u00b6\\\2\u03bf\u03bc"+
		"\3\2\2\2\u03bf\u03be\3\2\2\2\u03c0\u03cb\3\2\2\2\u03c1\u03c2\f\3\2\2\u03c2"+
		"\u03c3\7\23\2\2\u03c3\u03c7\5\6\4\2\u03c4\u03c5\7\3\2\2\u03c5\u03c8\5"+
		"\6\4\2\u03c6\u03c8\5\u00b6\\\2\u03c7\u03c4\3\2\2\2\u03c7\u03c6\3\2\2\2"+
		"\u03c8\u03ca\3\2\2\2\u03c9\u03c1\3\2\2\2\u03ca\u03cd\3\2\2\2\u03cb\u03c9"+
		"\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u00b5\3\2\2\2\u03cd\u03cb\3\2\2\2\u03ce"+
		"\u03d0\7\n\2\2\u03cf\u03d1\5\u00b8]\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1"+
		"\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\7\13\2\2\u03d3\u00b7\3\2\2\2"+
		"\u03d4\u03d9\5\u00ba^\2\u03d5\u03d6\7\b\2\2\u03d6\u03d8\5\u00ba^\2\u03d7"+
		"\u03d5\3\2\2\2\u03d8\u03db\3\2\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2"+
		"\2\2\u03da\u00b9\3\2\2\2\u03db\u03d9\3\2\2\2\u03dc\u03df\5\b\5\2\u03dd"+
		"\u03df\5\6\4\2\u03de\u03dc\3\2\2\2\u03de\u03dd\3\2\2\2\u03df\u03e0\3\2"+
		"\2\2\u03e0\u03e1\7\34\2\2\u03e1\u03e2\5V,\2\u03e2\u00bb\3\2\2\2\u03e3"+
		"\u03e4\5l\67\2\u03e4\u03e5\5\u00e0q\2\u03e5\u00bd\3\2\2\2\u03e6\u03e7"+
		"\7&\2\2\u03e7\u03e8\5\u00c0a\2\u03e8\u03e9\7!\2\2\u03e9\u00bf\3\2\2\2"+
		"\u03ea\u03ef\5\u00c2b\2\u03eb\u03ec\7\f\2\2\u03ec\u03ee\5\u00c2b\2\u03ed"+
		"\u03eb\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef\u03ed\3\2\2\2\u03ef\u03f0\3\2"+
		"\2\2\u03f0\u00c1\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2\u03f3\5\u00e8u\2\u03f3"+
		"\u03f4\5T+\2\u03f4\u00c3\3\2\2\2\u03f5\u03f6\7\'\2\2\u03f6\u03f7\5V,\2"+
		"\u03f7\u03f8\7(\2\2\u03f8\u03f9\5\u00c6d\2\u03f9\u03fa\7!\2\2\u03fa\u00c5"+
		"\3\2\2\2\u03fb\u0400\5\u00c8e\2\u03fc\u03fd\7\f\2\2\u03fd\u03ff\5\u00c8"+
		"e\2\u03fe\u03fc\3\2\2\2\u03ff\u0402\3\2\2\2\u0400\u03fe\3\2\2\2\u0400"+
		"\u0401\3\2\2\2\u0401\u00c7\3\2\2\2\u0402\u0400\3\2\2\2\u0403\u0404\5V"+
		",\2\u0404\u0405\5R*\2\u0405\u0406\5T+\2\u0406\u00c9\3\2\2\2\u0407\u0408"+
		"\7)\2\2\u0408\u0409\5\u00c6d\2\u0409\u040a\7!\2\2\u040a\u0419\3\2\2\2"+
		"\u040b\u040c\7)\2\2\u040c\u040d\7*\2\2\u040d\u040e\5V,\2\u040e\u040f\5"+
		"T+\2\u040f\u0410\7!\2\2\u0410\u0419\3\2\2\2\u0411\u0412\7)\2\2\u0412\u0413"+
		"\5\u00c6d\2\u0413\u0414\7*\2\2\u0414\u0415\5V,\2\u0415\u0416\5T+\2\u0416"+
		"\u0417\7!\2\2\u0417\u0419\3\2\2\2\u0418\u0407\3\2\2\2\u0418\u040b\3\2"+
		"\2\2\u0418\u0411\3\2\2\2\u0419\u00cb\3\2\2\2\u041a\u041b\7\24\2\2\u041b"+
		"\u041c\5\6\4\2\u041c\u041d\7\"\2\2\u041d\u041e\5\f\7\2\u041e\u042b\3\2"+
		"\2\2\u041f\u0420\7\24\2\2\u0420\u0421\5\u00ceh\2\u0421\u0422\7\7\2\2\u0422"+
		"\u0423\5\u00ceh\2\u0423\u0424\7\"\2\2\u0424\u0425\5\u00d0i\2\u0425\u042b"+
		"\3\2\2\2\u0426\u0427\7\24\2\2\u0427\u0428\5\u00d2j\2\u0428\u0429\7!\2"+
		"\2\u0429\u042b\3\2\2\2\u042a\u041a\3\2\2\2\u042a\u041f\3\2\2\2\u042a\u0426"+
		"\3\2\2\2\u042b\u00cd\3\2\2\2\u042c\u042f\5\6\4\2\u042d\u042f\5\b\5\2\u042e"+
		"\u042c\3\2\2\2\u042e\u042d\3\2\2\2\u042f\u00cf\3\2\2\2\u0430\u0433\5\f"+
		"\7\2\u0431\u0433\5\b\5\2\u0432\u0430\3\2\2\2\u0432\u0431\3\2\2\2\u0433"+
		"\u00d1\3\2\2\2\u0434\u0439\5\u00d4k\2\u0435\u0436\7\f\2\2\u0436\u0438"+
		"\5\u00d4k\2\u0437\u0435\3\2\2\2\u0438\u043b\3\2\2\2\u0439\u0437\3\2\2"+
		"\2\u0439\u043a\3\2\2\2\u043a\u00d3\3\2\2\2\u043b\u0439\3\2\2\2\u043c\u043d"+
		"\5\u00e2r\2\u043d\u043e\5R*\2\u043e\u043f\5T+\2\u043f\u0446\3\2\2\2\u0440"+
		"\u0441\5\b\5\2\u0441\u0442\5\u00e2r\2\u0442\u0443\5R*\2\u0443\u0444\5"+
		"T+\2\u0444\u0446\3\2\2\2\u0445\u043c\3\2\2\2\u0445\u0440\3\2\2\2\u0446"+
		"\u00d5\3\2\2\2\u0447\u0448\7+\2\2\u0448\u044b\5\u00e4s\2\u0449\u044a\7"+
		"(\2\2\u044a\u044c\5\u00c6d\2\u044b\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c"+
		"\u044d\3\2\2\2\u044d\u044e\5\u00d8m\2\u044e\u00d7\3\2\2\2\u044f\u0450"+
		"\7\33\2\2\u0450\u0451\5\u00dan\2\u0451\u0452\7!\2\2\u0452\u045e\3\2\2"+
		"\2\u0453\u0454\7\33\2\2\u0454\u0455\5\u00dan\2\u0455\u0456\7*\2\2\u0456"+
		"\u0457\5\u00e4s\2\u0457\u0458\7!\2\2\u0458\u045e\3\2\2\2\u0459\u045a\7"+
		"*\2\2\u045a\u045b\5\u00e4s\2\u045b\u045c\7!\2\2\u045c\u045e\3\2\2\2\u045d"+
		"\u044f\3\2\2\2\u045d\u0453\3\2\2\2\u045d\u0459\3\2\2\2\u045e\u00d9\3\2"+
		"\2\2\u045f\u0464\5\u00dco\2\u0460\u0461\7\f\2\2\u0461\u0463\5\u00dco\2"+
		"\u0462\u0460\3\2\2\2\u0463\u0466\3\2\2\2\u0464\u0462\3\2\2\2\u0464\u0465"+
		"\3\2\2\2\u0465\u00db\3\2\2\2\u0466\u0464\3\2\2\2\u0467\u0468\5V,\2\u0468"+
		"\u0469\5R*\2\u0469\u046a\5T+\2\u046a\u0476\3\2\2\2\u046b\u046c\5\u00ce"+
		"h\2\u046c\u046d\7\7\2\2\u046d\u046f\3\2\2\2\u046e\u046b\3\2\2\2\u046e"+
		"\u046f\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0471\5p9\2\u0471\u0472\5\u00de"+
		"p\2\u0472\u0473\5R*\2\u0473\u0474\5T+\2\u0474\u0476\3\2\2\2\u0475\u0467"+
		"\3\2\2\2\u0475\u046e\3\2\2\2\u0476\u00dd\3\2\2\2\u0477\u0478\7\7\2\2\u0478"+
		"\u047a\5\b\5\2\u0479\u0477\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u00df\3\2"+
		"\2\2\u047b\u047d\7\5\2\2\u047c\u047e\5\u00e4s\2\u047d\u047c\3\2\2\2\u047d"+
		"\u047e\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0480\7\6\2\2\u0480\u00e1\3\2"+
		"\2\2\u0481\u0483\7\5\2\2\u0482\u0484\5\u00e6t\2\u0483\u0482\3\2\2\2\u0483"+
		"\u0484\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0486\7\6\2\2\u0486\u00e3\3\2"+
		"\2\2\u0487\u048c\5V,\2\u0488\u0489\7\b\2\2\u0489\u048b\5V,\2\u048a\u0488"+
		"\3\2\2\2\u048b\u048e\3\2\2\2\u048c\u048a\3\2\2\2\u048c\u048d\3\2\2\2\u048d"+
		"\u00e5\3\2\2\2\u048e\u048c\3\2\2\2\u048f\u0494\5p9\2\u0490\u0491\7\b\2"+
		"\2\u0491\u0493\5p9\2\u0492\u0490\3\2\2\2\u0493\u0496\3\2\2\2\u0494\u0492"+
		"\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u00e7\3\2\2\2\u0496\u0494\3\2\2\2\u0497"+
		"\u049c\5\u00e4s\2\u0498\u0499\7\f\2\2\u0499\u049b\5\u00e4s\2\u049a\u0498"+
		"\3\2\2\2\u049b\u049e\3\2\2\2\u049c\u049a\3\2\2\2\u049c\u049d\3\2\2\2\u049d"+
		"\u00e9\3\2\2\2\u049e\u049c\3\2\2\2\u049f\u04a9\5\16\b\2\u04a0\u04a9\5"+
		"\f\7\2\u04a1\u04a9\5\n\6\2\u04a2\u04a9\5\6\4\2\u04a3\u04a5\5\20\t\2\u04a4"+
		"\u04a3\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a6\u04a7\3\2"+
		"\2\2\u04a7\u04a9\3\2\2\2\u04a8\u049f\3\2\2\2\u04a8\u04a0\3\2\2\2\u04a8"+
		"\u04a1\3\2\2\2\u04a8\u04a2\3\2\2\2\u04a8\u04a4\3\2\2\2\u04a9\u00eb\3\2"+
		"\2\2\u04aa\u04ab\t\4\2\2\u04ab\u00ed\3\2\2\2\u04ac\u04ad\t\5\2\2\u04ad"+
		"\u00ef\3\2\2\2\u04ae\u04af\t\6\2\2\u04af\u00f1\3\2\2\2\u04b0\u04b1\t\7"+
		"\2\2\u04b1\u00f3\3\2\2\2\u04b2\u04b3\t\b\2\2\u04b3\u00f5\3\2\2\2c\u00f9"+
		"\u00ff\u011f\u0129\u0130\u013a\u014d\u0158\u015e\u0165\u0171\u0178\u017e"+
		"\u0185\u018a\u0195\u01a1\u01a5\u01f5\u01fd\u0201\u020c\u0218\u022f\u024a"+
		"\u0251\u025d\u0265\u026c\u0274\u027c\u0283\u028b\u0294\u029d\u02a4\u02a8"+
		"\u02ad\u02b2\u02c8\u02cd\u02d3\u02d9\u02e4\u02f0\u02f7\u02fb\u02ff\u030c"+
		"\u0310\u031a\u0322\u032a\u0335\u033d\u0344\u034c\u0352\u0356\u035d\u0363"+
		"\u0378\u0384\u0388\u038e\u0398\u03a1\u03a4\u03aa\u03b8\u03bf\u03c7\u03cb"+
		"\u03d0\u03d9\u03de\u03ef\u0400\u0418\u042a\u042e\u0432\u0439\u0445\u044b"+
		"\u045d\u0464\u046e\u0475\u0479\u047d\u0483\u048c\u0494\u049c\u04a6\u04a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}