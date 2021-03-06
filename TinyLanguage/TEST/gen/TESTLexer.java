// Generated from C:/Users/famille meza/TEST/src\TEST.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TESTLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, INTcompil=11, FLOATcompil=12, STRINGcompil=13, SCANcompil=14, 
		PRINTcompil=15, START=16, IF=17, THEN=18, ELSE=19, WHILE=20, DO=21, PLUS=22, 
		MINUS=23, MULT=24, DIV=25, SUP=26, INF=27, PROGNAME=28, ID=29, INT=30, 
		FLOAT=31, COMMENT=32, TEXT=33, WS=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "INTcompil", "FLOATcompil", "STRINGcompil", "SCANcompil", "PRINTcompil", 
			"START", "IF", "THEN", "ELSE", "WHILE", "DO", "PLUS", "MINUS", "MULT", 
			"DIV", "SUP", "INF", "PROGNAME", "ID", "INT", "FLOAT", "COMMENT", "TEXT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'compil'", "'('", "')'", "'{'", "'}'", "';'", "','", "'='", "'=='", 
			"'!='", "'intCompil'", "'floatCompil'", "'stringCompil'", "'scancompil'", 
			"'printcompil'", "'start'", "'if'", "'then'", "'else'", "'while'", "'do'", 
			"'+'", "'-'", "'*'", "'/'", "'>'", "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "INTcompil", 
			"FLOATcompil", "STRINGcompil", "SCANcompil", "PRINTcompil", "START", 
			"IF", "THEN", "ELSE", "WHILE", "DO", "PLUS", "MINUS", "MULT", "DIV", 
			"SUP", "INF", "PROGNAME", "ID", "INT", "FLOAT", "COMMENT", "TEXT", "WS"
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


	public TESTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TEST.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u0111\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\6\35\u00c6\n\35\r\35\16\35"+
		"\u00c7\3\35\7\35\u00cb\n\35\f\35\16\35\u00ce\13\35\3\36\6\36\u00d1\n\36"+
		"\r\36\16\36\u00d2\3\36\7\36\u00d6\n\36\f\36\16\36\u00d9\13\36\3\37\3\37"+
		"\3\37\7\37\u00de\n\37\f\37\16\37\u00e1\13\37\5\37\u00e3\n\37\3 \5 \u00e6"+
		"\n \3 \3 \3 \3 \3 \5 \u00ed\n \3 \5 \u00f0\n \3!\3!\3!\3!\7!\u00f6\n!"+
		"\f!\16!\u00f9\13!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\7\"\u0104\n\"\f\"\16"+
		"\"\u0107\13\"\3\"\3\"\3#\6#\u010c\n#\r#\16#\u010d\3#\3#\3\u00f7\2$\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$\3\2\n\3\2C\\\6\2\62;C\\aac|\4\2C\\c|\5\2\62;C\\c|\3\2\63;\3\2"+
		"\62;\3\2$$\5\2\13\f\17\17\"\"\2\u011d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5N\3\2\2\2\7P\3\2\2\2\tR\3\2\2"+
		"\2\13T\3\2\2\2\rV\3\2\2\2\17X\3\2\2\2\21Z\3\2\2\2\23\\\3\2\2\2\25_\3\2"+
		"\2\2\27b\3\2\2\2\31l\3\2\2\2\33x\3\2\2\2\35\u0085\3\2\2\2\37\u0090\3\2"+
		"\2\2!\u009c\3\2\2\2#\u00a2\3\2\2\2%\u00a5\3\2\2\2\'\u00aa\3\2\2\2)\u00af"+
		"\3\2\2\2+\u00b5\3\2\2\2-\u00b8\3\2\2\2/\u00ba\3\2\2\2\61\u00bc\3\2\2\2"+
		"\63\u00be\3\2\2\2\65\u00c0\3\2\2\2\67\u00c2\3\2\2\29\u00c5\3\2\2\2;\u00d0"+
		"\3\2\2\2=\u00e2\3\2\2\2?\u00ef\3\2\2\2A\u00f1\3\2\2\2C\u00ff\3\2\2\2E"+
		"\u010b\3\2\2\2GH\7e\2\2HI\7q\2\2IJ\7o\2\2JK\7r\2\2KL\7k\2\2LM\7n\2\2M"+
		"\4\3\2\2\2NO\7*\2\2O\6\3\2\2\2PQ\7+\2\2Q\b\3\2\2\2RS\7}\2\2S\n\3\2\2\2"+
		"TU\7\177\2\2U\f\3\2\2\2VW\7=\2\2W\16\3\2\2\2XY\7.\2\2Y\20\3\2\2\2Z[\7"+
		"?\2\2[\22\3\2\2\2\\]\7?\2\2]^\7?\2\2^\24\3\2\2\2_`\7#\2\2`a\7?\2\2a\26"+
		"\3\2\2\2bc\7k\2\2cd\7p\2\2de\7v\2\2ef\7E\2\2fg\7q\2\2gh\7o\2\2hi\7r\2"+
		"\2ij\7k\2\2jk\7n\2\2k\30\3\2\2\2lm\7h\2\2mn\7n\2\2no\7q\2\2op\7c\2\2p"+
		"q\7v\2\2qr\7E\2\2rs\7q\2\2st\7o\2\2tu\7r\2\2uv\7k\2\2vw\7n\2\2w\32\3\2"+
		"\2\2xy\7u\2\2yz\7v\2\2z{\7t\2\2{|\7k\2\2|}\7p\2\2}~\7i\2\2~\177\7E\2\2"+
		"\177\u0080\7q\2\2\u0080\u0081\7o\2\2\u0081\u0082\7r\2\2\u0082\u0083\7"+
		"k\2\2\u0083\u0084\7n\2\2\u0084\34\3\2\2\2\u0085\u0086\7u\2\2\u0086\u0087"+
		"\7e\2\2\u0087\u0088\7c\2\2\u0088\u0089\7p\2\2\u0089\u008a\7e\2\2\u008a"+
		"\u008b\7q\2\2\u008b\u008c\7o\2\2\u008c\u008d\7r\2\2\u008d\u008e\7k\2\2"+
		"\u008e\u008f\7n\2\2\u008f\36\3\2\2\2\u0090\u0091\7r\2\2\u0091\u0092\7"+
		"t\2\2\u0092\u0093\7k\2\2\u0093\u0094\7p\2\2\u0094\u0095\7v\2\2\u0095\u0096"+
		"\7e\2\2\u0096\u0097\7q\2\2\u0097\u0098\7o\2\2\u0098\u0099\7r\2\2\u0099"+
		"\u009a\7k\2\2\u009a\u009b\7n\2\2\u009b \3\2\2\2\u009c\u009d\7u\2\2\u009d"+
		"\u009e\7v\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7v\2\2"+
		"\u00a1\"\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7h\2\2\u00a4$\3\2\2\2"+
		"\u00a5\u00a6\7v\2\2\u00a6\u00a7\7j\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9"+
		"\7p\2\2\u00a9&\3\2\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad"+
		"\7u\2\2\u00ad\u00ae\7g\2\2\u00ae(\3\2\2\2\u00af\u00b0\7y\2\2\u00b0\u00b1"+
		"\7j\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7g\2\2\u00b4"+
		"*\3\2\2\2\u00b5\u00b6\7f\2\2\u00b6\u00b7\7q\2\2\u00b7,\3\2\2\2\u00b8\u00b9"+
		"\7-\2\2\u00b9.\3\2\2\2\u00ba\u00bb\7/\2\2\u00bb\60\3\2\2\2\u00bc\u00bd"+
		"\7,\2\2\u00bd\62\3\2\2\2\u00be\u00bf\7\61\2\2\u00bf\64\3\2\2\2\u00c0\u00c1"+
		"\7@\2\2\u00c1\66\3\2\2\2\u00c2\u00c3\7>\2\2\u00c38\3\2\2\2\u00c4\u00c6"+
		"\t\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00cc\3\2\2\2\u00c9\u00cb\t\3\2\2\u00ca\u00c9\3\2"+
		"\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		":\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d1\t\4\2\2\u00d0\u00cf\3\2\2\2"+
		"\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d7"+
		"\3\2\2\2\u00d4\u00d6\t\5\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8<\3\2\2\2\u00d9\u00d7\3\2\2\2"+
		"\u00da\u00e3\7\62\2\2\u00db\u00df\t\6\2\2\u00dc\u00de\t\7\2\2\u00dd\u00dc"+
		"\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00da\3\2\2\2\u00e2\u00db\3\2"+
		"\2\2\u00e3>\3\2\2\2\u00e4\u00e6\7/\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\5=\37\2\u00e8\u00e9\7\60\2\2"+
		"\u00e9\u00ea\5=\37\2\u00ea\u00f0\3\2\2\2\u00eb\u00ed\7/\2\2\u00ec\u00eb"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\5=\37\2\u00ef"+
		"\u00e5\3\2\2\2\u00ef\u00ec\3\2\2\2\u00f0@\3\2\2\2\u00f1\u00f2\7\61\2\2"+
		"\u00f2\u00f3\7,\2\2\u00f3\u00f7\3\2\2\2\u00f4\u00f6\13\2\2\2\u00f5\u00f4"+
		"\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7,\2\2\u00fb\u00fc\7\61"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\b!\2\2\u00feB\3\2\2\2\u00ff\u0105"+
		"\7$\2\2\u0100\u0104\n\b\2\2\u0101\u0102\7^\2\2\u0102\u0104\7$\2\2\u0103"+
		"\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u0109\7$\2\2\u0109D\3\2\2\2\u010a\u010c\t\t\2\2\u010b\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0110\b#\2\2\u0110F\3\2\2\2\20\2\u00c7\u00cc\u00d2\u00d7\u00df"+
		"\u00e2\u00e5\u00ec\u00ef\u00f7\u0103\u0105\u010d\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}