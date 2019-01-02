// Generated from D:/Desktop/Informatyka/TKOM/Krzysztof Urbanowicz/src\fractions.g4 by ANTLR 4.7
package fractions;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fractionsLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "ADD_OPER", "MULT_OPER", "VOID_RETURN", "LOG_OPER", 
		"COMP_OPER", "U_TYPE", "S_TYPE", "NUMBER", "WS", "ID", "STRING"
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


	public fractionsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "fractions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00a2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\5\32\u0081\n\32\3\33\3\33\3\34\3\34\3\35\3\35\7\35\u0089\n\35"+
		"\f\35\16\35\u008c\13\35\3\36\6\36\u008f\n\36\r\36\16\36\u0090\3\36\3\36"+
		"\3\37\6\37\u0096\n\37\r\37\16\37\u0097\3 \3 \7 \u009c\n \f \16 \u009f"+
		"\13 \3 \3 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!\3\2\n\4\2--//\4\2,,\61\61\4\2``xx\3\2\63;\3\2\62"+
		";\5\2\13\f\17\17\"\"\4\2C\\c|\5\2\f\f\17\17$$\2\u00a8\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\r"+
		"K\3\2\2\2\17M\3\2\2\2\21O\3\2\2\2\23Q\3\2\2\2\25S\3\2\2\2\27U\3\2\2\2"+
		"\31X\3\2\2\2\33[\3\2\2\2\35]\3\2\2\2\37_\3\2\2\2!c\3\2\2\2#f\3\2\2\2%"+
		"h\3\2\2\2\'j\3\2\2\2)m\3\2\2\2+p\3\2\2\2-r\3\2\2\2/t\3\2\2\2\61w\3\2\2"+
		"\2\63\u0080\3\2\2\2\65\u0082\3\2\2\2\67\u0084\3\2\2\29\u0086\3\2\2\2;"+
		"\u008e\3\2\2\2=\u0095\3\2\2\2?\u0099\3\2\2\2AB\7]\2\2B\4\3\2\2\2CD\7<"+
		"\2\2D\6\3\2\2\2EF\7_\2\2F\b\3\2\2\2GH\7~\2\2H\n\3\2\2\2IJ\7/\2\2J\f\3"+
		"\2\2\2KL\7*\2\2L\16\3\2\2\2MN\7+\2\2N\20\3\2\2\2OP\7>\2\2P\22\3\2\2\2"+
		"QR\7\60\2\2R\24\3\2\2\2ST\7@\2\2T\26\3\2\2\2UV\7>\2\2VW\7@\2\2W\30\3\2"+
		"\2\2XY\7>\2\2YZ\7<\2\2Z\32\3\2\2\2[\\\7%\2\2\\\34\3\2\2\2]^\7\61\2\2^"+
		"\36\3\2\2\2_`\7\61\2\2`a\7/\2\2ab\7\61\2\2b \3\2\2\2cd\7^\2\2de\7^\2\2"+
		"e\"\3\2\2\2fg\7#\2\2g$\3\2\2\2hi\7B\2\2i&\3\2\2\2jk\7>\2\2kl\7>\2\2l("+
		"\3\2\2\2mn\7@\2\2no\7@\2\2o*\3\2\2\2pq\t\2\2\2q,\3\2\2\2rs\t\3\2\2s.\3"+
		"\2\2\2tu\7%\2\2uv\7%\2\2v\60\3\2\2\2wx\t\4\2\2x\62\3\2\2\2y\u0081\4>@"+
		"\2z{\7#\2\2{\u0081\7?\2\2|}\7>\2\2}\u0081\7?\2\2~\177\7@\2\2\177\u0081"+
		"\7?\2\2\u0080y\3\2\2\2\u0080z\3\2\2\2\u0080|\3\2\2\2\u0080~\3\2\2\2\u0081"+
		"\64\3\2\2\2\u0082\u0083\7w\2\2\u0083\66\3\2\2\2\u0084\u0085\7u\2\2\u0085"+
		"8\3\2\2\2\u0086\u008a\t\5\2\2\u0087\u0089\t\6\2\2\u0088\u0087\3\2\2\2"+
		"\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b:\3"+
		"\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\t\7\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0093\b\36\2\2\u0093<\3\2\2\2\u0094\u0096\t\b\2\2\u0095\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		">\3\2\2\2\u0099\u009d\7$\2\2\u009a\u009c\n\t\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7$\2\2\u00a1@\3\2\2\2\t\2\u0080\u008a"+
		"\u0090\u0095\u0097\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}