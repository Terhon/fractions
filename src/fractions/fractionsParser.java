// Generated from D:/Desktop/Informatyka/TKOM/Krzysztof Urbanowicz/src\fractions.g4 by ANTLR 4.7
package fractions;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fractionsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, ADD_OPER=21, MULT_OPER=22, VOID_RETURN=23, 
		LOG_OPER=24, COMP_OPER=25, U_TYPE=26, S_TYPE=27, NUMBER=28, WS=29, ID=30, 
		STRING=31;
	public static final int
		RULE_program = 0, RULE_operation = 1, RULE_s_decl = 2, RULE_u_decl = 3, 
		RULE_expr = 4, RULE_addExpr = 5, RULE_multExpr = 6, RULE_atomExpr = 7, 
		RULE_attribution = 8, RULE_func_arg = 9, RULE_func_decl = 10, RULE_func_body = 11, 
		RULE_void_func_decl = 12, RULE_void_func_body = 13, RULE_val_return = 14, 
		RULE_func_call = 15, RULE_variable = 16, RULE_condition = 17, RULE_condition_body = 18, 
		RULE_logExpr = 19, RULE_compExpr = 20, RULE_loop = 21, RULE_loop_body = 22, 
		RULE_write = 23, RULE_read = 24;
	public static final String[] ruleNames = {
		"program", "operation", "s_decl", "u_decl", "expr", "addExpr", "multExpr", 
		"atomExpr", "attribution", "func_arg", "func_decl", "func_body", "void_func_decl", 
		"void_func_body", "val_return", "func_call", "variable", "condition", 
		"condition_body", "logExpr", "compExpr", "loop", "loop_body", "write", 
		"read"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "':'", "']'", "'|'", "'-'", "'('", "')'", "'<'", "'.'", "'>'", 
		"'<>'", "'<:'", "'#'", "'/'", "'/-/'", "'\\\\'", "'!'", "'@'", "'<<'", 
		"'>>'", null, null, "'##'", null, null, "'u'", "'s'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "ADD_OPER", "MULT_OPER", 
		"VOID_RETURN", "LOG_OPER", "COMP_OPER", "U_TYPE", "S_TYPE", "NUMBER", 
		"WS", "ID", "STRING"
	};
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
	public String getGrammarFileName() { return "fractions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public fractionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<Func_declContext> func_decl() {
			return getRuleContexts(Func_declContext.class);
		}
		public Func_declContext func_decl(int i) {
			return getRuleContext(Func_declContext.class,i);
		}
		public List<Void_func_declContext> void_func_decl() {
			return getRuleContexts(Void_func_declContext.class);
		}
		public Void_func_declContext void_func_decl(int i) {
			return getRuleContext(Void_func_declContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__11) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << U_TYPE) | (1L << S_TYPE))) != 0)) {
				{
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(50);
					operation();
					}
					break;
				case 2:
					{
					setState(51);
					func_decl();
					}
					break;
				case 3:
					{
					setState(52);
					void_func_decl();
					}
					break;
				}
				}
				setState(57);
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

	public static class OperationContext extends ParserRuleContext {
		public S_declContext s_decl() {
			return getRuleContext(S_declContext.class,0);
		}
		public U_declContext u_decl() {
			return getRuleContext(U_declContext.class,0);
		}
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_operation);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case S_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				s_decl();
				}
				break;
			case U_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				u_decl();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				attribution();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				write();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				read();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				func_call();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(64);
				condition();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 8);
				{
				setState(65);
				loop();
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

	public static class S_declContext extends ParserRuleContext {
		public TerminalNode S_TYPE() { return getToken(fractionsParser.S_TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(fractionsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(fractionsParser.ID, i);
		}
		public TerminalNode STRING() { return getToken(fractionsParser.STRING, 0); }
		public S_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterS_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitS_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitS_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_declContext s_decl() throws RecognitionException {
		S_declContext _localctx = new S_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_s_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(S_TYPE);
			setState(69);
			match(T__0);
			setState(70);
			match(ID);
			setState(71);
			match(T__1);
			setState(72);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(73);
			match(T__2);
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

	public static class U_declContext extends ParserRuleContext {
		public TerminalNode U_TYPE() { return getToken(fractionsParser.U_TYPE, 0); }
		public TerminalNode ID() { return getToken(fractionsParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public U_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_u_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterU_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitU_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitU_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final U_declContext u_decl() throws RecognitionException {
		U_declContext _localctx = new U_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_u_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(U_TYPE);
			setState(76);
			match(T__0);
			setState(77);
			match(ID);
			setState(78);
			match(T__1);
			setState(79);
			expr();
			setState(80);
			match(T__2);
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
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			addExpr();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(83);
				match(T__3);
				setState(84);
				addExpr();
				}
				}
				setState(89);
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

	public static class AddExprContext extends ParserRuleContext {
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public List<TerminalNode> ADD_OPER() { return getTokens(fractionsParser.ADD_OPER); }
		public TerminalNode ADD_OPER(int i) {
			return getToken(fractionsParser.ADD_OPER, i);
		}
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_addExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			multExpr();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD_OPER) {
				{
				{
				setState(91);
				match(ADD_OPER);
				setState(92);
				multExpr();
				}
				}
				setState(97);
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

	public static class MultExprContext extends ParserRuleContext {
		public List<AtomExprContext> atomExpr() {
			return getRuleContexts(AtomExprContext.class);
		}
		public AtomExprContext atomExpr(int i) {
			return getRuleContext(AtomExprContext.class,i);
		}
		public List<TerminalNode> MULT_OPER() { return getTokens(fractionsParser.MULT_OPER); }
		public TerminalNode MULT_OPER(int i) {
			return getToken(fractionsParser.MULT_OPER, i);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitMultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			atomExpr();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT_OPER) {
				{
				{
				setState(99);
				match(MULT_OPER);
				setState(100);
				atomExpr();
				}
				}
				setState(105);
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

	public static class AtomExprContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(fractionsParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(fractionsParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public AtomExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomExprContext atomExpr() throws RecognitionException {
		AtomExprContext _localctx = new AtomExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atomExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(106);
				match(T__4);
				}
			}

			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(109);
				match(NUMBER);
				}
				break;
			case ID:
				{
				setState(110);
				match(ID);
				}
				break;
			case T__5:
				{
				setState(111);
				match(T__5);
				setState(112);
				expr();
				setState(113);
				match(T__6);
				}
				break;
			case T__7:
				{
				setState(115);
				func_call();
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

	public static class AttributionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fractionsParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(fractionsParser.STRING, 0); }
		public AttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterAttribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitAttribution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitAttribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__0);
			setState(119);
			match(ID);
			setState(120);
			match(T__1);
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__7:
			case NUMBER:
			case ID:
				{
				setState(121);
				expr();
				}
				break;
			case STRING:
				{
				setState(122);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(125);
			match(T__2);
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

	public static class Func_argContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fractionsParser.ID, 0); }
		public TerminalNode S_TYPE() { return getToken(fractionsParser.S_TYPE, 0); }
		public TerminalNode U_TYPE() { return getToken(fractionsParser.U_TYPE, 0); }
		public Func_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterFunc_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitFunc_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitFunc_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_argContext func_arg() throws RecognitionException {
		Func_argContext _localctx = new Func_argContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_func_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==U_TYPE || _la==S_TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(128);
			match(T__4);
			setState(129);
			match(ID);
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

	public static class Func_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fractionsParser.ID, 0); }
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public TerminalNode S_TYPE() { return getToken(fractionsParser.S_TYPE, 0); }
		public TerminalNode U_TYPE() { return getToken(fractionsParser.U_TYPE, 0); }
		public List<Func_argContext> func_arg() {
			return getRuleContexts(Func_argContext.class);
		}
		public Func_argContext func_arg(int i) {
			return getRuleContext(Func_argContext.class,i);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterFunc_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitFunc_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitFunc_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_func_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__7);
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==U_TYPE || _la==S_TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(133);
			match(T__1);
			setState(134);
			match(ID);
			setState(135);
			match(T__1);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==U_TYPE || _la==S_TYPE) {
				{
				setState(136);
				func_arg();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(137);
					match(T__8);
					setState(138);
					func_arg();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(146);
			match(T__9);
			setState(147);
			func_body();
			setState(148);
			match(T__10);
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

	public static class Func_bodyContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<Val_returnContext> val_return() {
			return getRuleContexts(Val_returnContext.class);
		}
		public Val_returnContext val_return(int i) {
			return getRuleContext(Val_returnContext.class,i);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterFunc_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitFunc_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitFunc_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_func_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(152);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case T__7:
					case T__13:
					case T__17:
					case T__18:
					case T__19:
					case U_TYPE:
					case S_TYPE:
						{
						setState(150);
						operation();
						}
						break;
					case T__12:
						{
						setState(151);
						val_return();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(158); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(157);
					val_return();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(160); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__12) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << U_TYPE) | (1L << S_TYPE))) != 0)) {
				{
				setState(164);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__7:
				case T__13:
				case T__17:
				case T__18:
				case T__19:
				case U_TYPE:
				case S_TYPE:
					{
					setState(162);
					operation();
					}
					break;
				case T__12:
					{
					setState(163);
					val_return();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(168);
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

	public static class Void_func_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fractionsParser.ID, 0); }
		public Void_func_bodyContext void_func_body() {
			return getRuleContext(Void_func_bodyContext.class,0);
		}
		public List<Func_argContext> func_arg() {
			return getRuleContexts(Func_argContext.class);
		}
		public Func_argContext func_arg(int i) {
			return getRuleContext(Func_argContext.class,i);
		}
		public Void_func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_void_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterVoid_func_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitVoid_func_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitVoid_func_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Void_func_declContext void_func_decl() throws RecognitionException {
		Void_func_declContext _localctx = new Void_func_declContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_void_func_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__11);
			setState(170);
			match(ID);
			setState(171);
			match(T__1);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==U_TYPE || _la==S_TYPE) {
				{
				setState(172);
				func_arg();
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(173);
					match(T__8);
					setState(174);
					func_arg();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(182);
			match(T__9);
			setState(183);
			void_func_body();
			setState(184);
			match(T__10);
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

	public static class Void_func_bodyContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<TerminalNode> VOID_RETURN() { return getTokens(fractionsParser.VOID_RETURN); }
		public TerminalNode VOID_RETURN(int i) {
			return getToken(fractionsParser.VOID_RETURN, i);
		}
		public Void_func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_void_func_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterVoid_func_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitVoid_func_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitVoid_func_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Void_func_bodyContext void_func_body() throws RecognitionException {
		Void_func_bodyContext _localctx = new Void_func_bodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_void_func_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << VOID_RETURN) | (1L << U_TYPE) | (1L << S_TYPE))) != 0)) {
				{
				setState(188);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__7:
				case T__13:
				case T__17:
				case T__18:
				case T__19:
				case U_TYPE:
				case S_TYPE:
					{
					setState(186);
					operation();
					}
					break;
				case VOID_RETURN:
					{
					setState(187);
					match(VOID_RETURN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(192);
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

	public static class Val_returnContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(fractionsParser.STRING, 0); }
		public Val_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterVal_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitVal_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitVal_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Val_returnContext val_return() throws RecognitionException {
		Val_returnContext _localctx = new Val_returnContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_val_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__12);
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__7:
			case NUMBER:
			case ID:
				{
				setState(194);
				expr();
				}
				break;
			case STRING:
				{
				setState(195);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(198);
			match(T__12);
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

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fractionsParser.ID, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__7);
			setState(201);
			match(ID);
			setState(202);
			match(T__1);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << NUMBER) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(203);
				variable();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(204);
					match(T__8);
					setState(205);
					variable();
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(213);
			match(T__9);
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

	public static class VariableContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(fractionsParser.STRING, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__7:
			case NUMBER:
			case ID:
				{
				setState(215);
				expr();
				}
				break;
			case STRING:
				{
				setState(216);
				match(STRING);
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

	public static class ConditionContext extends ParserRuleContext {
		public LogExprContext logExpr() {
			return getRuleContext(LogExprContext.class,0);
		}
		public List<Condition_bodyContext> condition_body() {
			return getRuleContexts(Condition_bodyContext.class);
		}
		public Condition_bodyContext condition_body(int i) {
			return getRuleContext(Condition_bodyContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__13);
			setState(220);
			logExpr();
			setState(221);
			match(T__13);
			setState(222);
			condition_body();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(223);
				match(T__14);
				setState(224);
				condition_body();
				}
			}

			setState(227);
			match(T__15);
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

	public static class Condition_bodyContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public Condition_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterCondition_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitCondition_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitCondition_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_bodyContext condition_body() throws RecognitionException {
		Condition_bodyContext _localctx = new Condition_bodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(229);
				operation();
				}
				}
				setState(232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << U_TYPE) | (1L << S_TYPE))) != 0) );
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

	public static class LogExprContext extends ParserRuleContext {
		public List<CompExprContext> compExpr() {
			return getRuleContexts(CompExprContext.class);
		}
		public CompExprContext compExpr(int i) {
			return getRuleContext(CompExprContext.class,i);
		}
		public List<TerminalNode> LOG_OPER() { return getTokens(fractionsParser.LOG_OPER); }
		public TerminalNode LOG_OPER(int i) {
			return getToken(fractionsParser.LOG_OPER, i);
		}
		public LogExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterLogExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitLogExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitLogExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogExprContext logExpr() throws RecognitionException {
		LogExprContext _localctx = new LogExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			compExpr();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOG_OPER) {
				{
				{
				setState(235);
				match(LOG_OPER);
				setState(236);
				compExpr();
				}
				}
				setState(241);
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

	public static class CompExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMP_OPER() { return getToken(fractionsParser.COMP_OPER, 0); }
		public LogExprContext logExpr() {
			return getRuleContext(LogExprContext.class,0);
		}
		public CompExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompExprContext compExpr() throws RecognitionException {
		CompExprContext _localctx = new CompExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_compExpr);
		int _la;
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(242);
					match(T__16);
					}
				}

				setState(245);
				expr();
				setState(246);
				match(COMP_OPER);
				setState(247);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(T__5);
				setState(250);
				logExpr();
				setState(251);
				match(T__6);
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

	public static class LoopContext extends ParserRuleContext {
		public LogExprContext logExpr() {
			return getRuleContext(LogExprContext.class,0);
		}
		public Loop_bodyContext loop_body() {
			return getRuleContext(Loop_bodyContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__17);
			setState(256);
			logExpr();
			setState(257);
			match(T__17);
			setState(258);
			loop_body();
			setState(259);
			match(T__17);
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

	public static class Loop_bodyContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public Loop_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterLoop_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitLoop_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitLoop_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_bodyContext loop_body() throws RecognitionException {
		Loop_bodyContext _localctx = new Loop_bodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_loop_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(261);
					operation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(264); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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

	public static class WriteContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(fractionsParser.STRING, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__18);
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__7:
			case NUMBER:
			case ID:
				{
				setState(267);
				expr();
				}
				break;
			case STRING:
				{
				setState(268);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(271);
			match(T__19);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fractionsParser.ID, 0); }
		public TerminalNode S_TYPE() { return getToken(fractionsParser.S_TYPE, 0); }
		public TerminalNode U_TYPE() { return getToken(fractionsParser.U_TYPE, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fractionsListener ) ((fractionsListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fractionsVisitor ) return ((fractionsVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__19);
			setState(274);
			_la = _input.LA(1);
			if ( !(_la==U_TYPE || _la==S_TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(275);
			match(T__1);
			setState(276);
			match(ID);
			setState(277);
			match(T__18);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u011a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3E\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\7\3\7\3\7\7\7`\n\7\f\7\16\7"+
		"c\13\7\3\b\3\b\3\b\7\bh\n\b\f\b\16\bk\13\b\3\t\5\tn\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\tw\n\t\3\n\3\n\3\n\3\n\3\n\5\n~\n\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u008e\n\f\f\f\16\f\u0091"+
		"\13\f\5\f\u0093\n\f\3\f\3\f\3\f\3\f\3\r\3\r\7\r\u009b\n\r\f\r\16\r\u009e"+
		"\13\r\3\r\6\r\u00a1\n\r\r\r\16\r\u00a2\3\r\3\r\7\r\u00a7\n\r\f\r\16\r"+
		"\u00aa\13\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00b2\n\16\f\16\16\16\u00b5"+
		"\13\16\5\16\u00b7\n\16\3\16\3\16\3\16\3\16\3\17\3\17\7\17\u00bf\n\17\f"+
		"\17\16\17\u00c2\13\17\3\20\3\20\3\20\5\20\u00c7\n\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\7\21\u00d1\n\21\f\21\16\21\u00d4\13\21\5\21\u00d6"+
		"\n\21\3\21\3\21\3\22\3\22\5\22\u00dc\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00e4\n\23\3\23\3\23\3\24\6\24\u00e9\n\24\r\24\16\24\u00ea\3\25"+
		"\3\25\3\25\7\25\u00f0\n\25\f\25\16\25\u00f3\13\25\3\26\5\26\u00f6\n\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0100\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\6\30\u0109\n\30\r\30\16\30\u010a\3\31\3\31\3\31\5"+
		"\31\u0110\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\2\2\33\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\4\3\2 !\3\2\34\35"+
		"\2\u0128\29\3\2\2\2\4D\3\2\2\2\6F\3\2\2\2\bM\3\2\2\2\nT\3\2\2\2\f\\\3"+
		"\2\2\2\16d\3\2\2\2\20m\3\2\2\2\22x\3\2\2\2\24\u0081\3\2\2\2\26\u0085\3"+
		"\2\2\2\30\u009c\3\2\2\2\32\u00ab\3\2\2\2\34\u00c0\3\2\2\2\36\u00c3\3\2"+
		"\2\2 \u00ca\3\2\2\2\"\u00db\3\2\2\2$\u00dd\3\2\2\2&\u00e8\3\2\2\2(\u00ec"+
		"\3\2\2\2*\u00ff\3\2\2\2,\u0101\3\2\2\2.\u0108\3\2\2\2\60\u010c\3\2\2\2"+
		"\62\u0113\3\2\2\2\648\5\4\3\2\658\5\26\f\2\668\5\32\16\2\67\64\3\2\2\2"+
		"\67\65\3\2\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\3\3\2\2"+
		"\2;9\3\2\2\2<E\5\6\4\2=E\5\b\5\2>E\5\22\n\2?E\5\60\31\2@E\5\62\32\2AE"+
		"\5 \21\2BE\5$\23\2CE\5,\27\2D<\3\2\2\2D=\3\2\2\2D>\3\2\2\2D?\3\2\2\2D"+
		"@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\5\3\2\2\2FG\7\35\2\2GH\7\3\2"+
		"\2HI\7 \2\2IJ\7\4\2\2JK\t\2\2\2KL\7\5\2\2L\7\3\2\2\2MN\7\34\2\2NO\7\3"+
		"\2\2OP\7 \2\2PQ\7\4\2\2QR\5\n\6\2RS\7\5\2\2S\t\3\2\2\2TY\5\f\7\2UV\7\6"+
		"\2\2VX\5\f\7\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\13\3\2\2\2[Y\3"+
		"\2\2\2\\a\5\16\b\2]^\7\27\2\2^`\5\16\b\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2"+
		"ab\3\2\2\2b\r\3\2\2\2ca\3\2\2\2di\5\20\t\2ef\7\30\2\2fh\5\20\t\2ge\3\2"+
		"\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\17\3\2\2\2ki\3\2\2\2ln\7\7\2\2ml\3"+
		"\2\2\2mn\3\2\2\2nv\3\2\2\2ow\7\36\2\2pw\7 \2\2qr\7\b\2\2rs\5\n\6\2st\7"+
		"\t\2\2tw\3\2\2\2uw\5 \21\2vo\3\2\2\2vp\3\2\2\2vq\3\2\2\2vu\3\2\2\2w\21"+
		"\3\2\2\2xy\7\3\2\2yz\7 \2\2z}\7\4\2\2{~\5\n\6\2|~\7!\2\2}{\3\2\2\2}|\3"+
		"\2\2\2~\177\3\2\2\2\177\u0080\7\5\2\2\u0080\23\3\2\2\2\u0081\u0082\t\3"+
		"\2\2\u0082\u0083\7\7\2\2\u0083\u0084\7 \2\2\u0084\25\3\2\2\2\u0085\u0086"+
		"\7\n\2\2\u0086\u0087\t\3\2\2\u0087\u0088\7\4\2\2\u0088\u0089\7 \2\2\u0089"+
		"\u0092\7\4\2\2\u008a\u008f\5\24\13\2\u008b\u008c\7\13\2\2\u008c\u008e"+
		"\5\24\13\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2"+
		"\u008f\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u008a"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\f\2\2\u0095"+
		"\u0096\5\30\r\2\u0096\u0097\7\r\2\2\u0097\27\3\2\2\2\u0098\u009b\5\4\3"+
		"\2\u0099\u009b\5\36\20\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\5\36\20\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a8\3\2"+
		"\2\2\u00a4\u00a7\5\4\3\2\u00a5\u00a7\5\36\20\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\31\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\16\2\2\u00ac\u00ad"+
		"\7 \2\2\u00ad\u00b6\7\4\2\2\u00ae\u00b3\5\24\13\2\u00af\u00b0\7\13\2\2"+
		"\u00b0\u00b2\5\24\13\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00ae\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\f"+
		"\2\2\u00b9\u00ba\5\34\17\2\u00ba\u00bb\7\r\2\2\u00bb\33\3\2\2\2\u00bc"+
		"\u00bf\5\4\3\2\u00bd\u00bf\7\31\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3"+
		"\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\35\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\7\17\2\2\u00c4\u00c7\5\n\6"+
		"\2\u00c5\u00c7\7!\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00c9\7\17\2\2\u00c9\37\3\2\2\2\u00ca\u00cb\7\n\2\2\u00cb"+
		"\u00cc\7 \2\2\u00cc\u00d5\7\4\2\2\u00cd\u00d2\5\"\22\2\u00ce\u00cf\7\13"+
		"\2\2\u00cf\u00d1\5\"\22\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d5\u00cd\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d8\7\f\2\2\u00d8!\3\2\2\2\u00d9\u00dc\5\n\6\2\u00da\u00dc\7!\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc#\3\2\2\2\u00dd\u00de\7\20\2\2"+
		"\u00de\u00df\5(\25\2\u00df\u00e0\7\20\2\2\u00e0\u00e3\5&\24\2\u00e1\u00e2"+
		"\7\21\2\2\u00e2\u00e4\5&\24\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2"+
		"\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\22\2\2\u00e6%\3\2\2\2\u00e7\u00e9\5"+
		"\4\3\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\'\3\2\2\2\u00ec\u00f1\5*\26\2\u00ed\u00ee\7\32\2"+
		"\2\u00ee\u00f0\5*\26\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2)\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f6\7\23\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3"+
		"\2\2\2\u00f7\u00f8\5\n\6\2\u00f8\u00f9\7\33\2\2\u00f9\u00fa\5\n\6\2\u00fa"+
		"\u0100\3\2\2\2\u00fb\u00fc\7\b\2\2\u00fc\u00fd\5(\25\2\u00fd\u00fe\7\t"+
		"\2\2\u00fe\u0100\3\2\2\2\u00ff\u00f5\3\2\2\2\u00ff\u00fb\3\2\2\2\u0100"+
		"+\3\2\2\2\u0101\u0102\7\24\2\2\u0102\u0103\5(\25\2\u0103\u0104\7\24\2"+
		"\2\u0104\u0105\5.\30\2\u0105\u0106\7\24\2\2\u0106-\3\2\2\2\u0107\u0109"+
		"\5\4\3\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b/\3\2\2\2\u010c\u010f\7\25\2\2\u010d\u0110\5\n\6\2"+
		"\u010e\u0110\7!\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u0112\7\26\2\2\u0112\61\3\2\2\2\u0113\u0114\7\26\2\2\u0114"+
		"\u0115\t\3\2\2\u0115\u0116\7\4\2\2\u0116\u0117\7 \2\2\u0117\u0118\7\25"+
		"\2\2\u0118\63\3\2\2\2!\679DYaimv}\u008f\u0092\u009a\u009c\u00a2\u00a6"+
		"\u00a8\u00b3\u00b6\u00be\u00c0\u00c6\u00d2\u00d5\u00db\u00e3\u00ea\u00f1"+
		"\u00f5\u00ff\u010a\u010f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}