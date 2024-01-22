// Generated from /home/manu/facultad/compiladores/Compiladores/proyectobase/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1

    package compiladores;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class compiladoresLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, O_PAREN=3, C_PAREN=4, O_BRACE=5, C_BRACE=6, O_BRACKET=7, 
		C_BRACKET=8, SEMICOLON=9, COMMA=10, EQUAL=11, ADD=12, SUB=13, MULT=14, 
		DIV=15, MOD=16, AND=17, OR=18, EQUALS=19, NOT_EQUALS=20, LESS_THAN=21, 
		GREATER_THAN=22, LESS_OR_EQUAL=23, GREATER_OR_EQUAL=24, INCREMENT=25, 
		DECREMENT=26, RETURN=27, IF=28, ELSE=29, WHILE=30, FOR=31, TYPE=32, ID=33, 
		NUMBER=34, TEXT=35, WS=36, OTHER=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "LETTER", "DIGIT", "INT", "STRING", "BOOLEAN", "CHAR", 
			"DOUBLE", "VOID", "O_PAREN", "C_PAREN", "O_BRACE", "C_BRACE", "O_BRACKET", 
			"C_BRACKET", "SEMICOLON", "COMMA", "EQUAL", "ADD", "SUB", "MULT", "DIV", 
			"MOD", "AND", "OR", "EQUALS", "NOT_EQUALS", "LESS_THAN", "GREATER_THAN", 
			"LESS_OR_EQUAL", "GREATER_OR_EQUAL", "INCREMENT", "DECREMENT", "RETURN", 
			"IF", "ELSE", "WHILE", "FOR", "TYPE", "ID", "NUMBER", "TEXT", "WS", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+='", "'-='", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
			"','", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'=='", 
			"'!='", "'<'", "'>'", "'<='", "'>='", "'++'", "'--'", "'return'", "'if'", 
			"'else'", "'while'", "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "O_PAREN", "C_PAREN", "O_BRACE", "C_BRACE", "O_BRACKET", 
			"C_BRACKET", "SEMICOLON", "COMMA", "EQUAL", "ADD", "SUB", "MULT", "DIV", 
			"MOD", "AND", "OR", "EQUALS", "NOT_EQUALS", "LESS_THAN", "GREATER_THAN", 
			"LESS_OR_EQUAL", "GREATER_OR_EQUAL", "INCREMENT", "DECREMENT", "RETURN", 
			"IF", "ELSE", "WHILE", "FOR", "TYPE", "ID", "NUMBER", "TEXT", "WS", "OTHER"
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


	public compiladoresLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compiladores.g4"; }

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
		"\u0004\u0000%\u0108\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0003\'\u00e1\b\'\u0001(\u0001(\u0003(\u00e5\b(\u0001(\u0001"+
		"(\u0001(\u0005(\u00ea\b(\n(\f(\u00ed\t(\u0001)\u0004)\u00f0\b)\u000b)"+
		"\f)\u00f1\u0001*\u0001*\u0001*\u0003*\u00f7\b*\u0001*\u0001*\u0001*\u0005"+
		"*\u00fc\b*\n*\f*\u00ff\t*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001"+
		",\u0001,\u0000\u0000-\u0001\u0001\u0003\u0002\u0005\u0000\u0007\u0000"+
		"\t\u0000\u000b\u0000\r\u0000\u000f\u0000\u0011\u0000\u0013\u0000\u0015"+
		"\u0003\u0017\u0004\u0019\u0005\u001b\u0006\u001d\u0007\u001f\b!\t#\n%"+
		"\u000b\'\f)\r+\u000e-\u000f/\u00101\u00113\u00125\u00137\u00149\u0015"+
		";\u0016=\u0017?\u0018A\u0019C\u001aE\u001bG\u001cI\u001dK\u001eM\u001f"+
		"O Q!S\"U#W$Y%\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u000009\u0003\u0000"+
		"\t\n\r\r  \u010d\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000"+
		"\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000"+
		"\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I"+
		"\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000"+
		"\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000"+
		"\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W"+
		"\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0001[\u0001\u0000"+
		"\u0000\u0000\u0003^\u0001\u0000\u0000\u0000\u0005a\u0001\u0000\u0000\u0000"+
		"\u0007c\u0001\u0000\u0000\u0000\te\u0001\u0000\u0000\u0000\u000bi\u0001"+
		"\u0000\u0000\u0000\rp\u0001\u0000\u0000\u0000\u000fx\u0001\u0000\u0000"+
		"\u0000\u0011}\u0001\u0000\u0000\u0000\u0013\u0084\u0001\u0000\u0000\u0000"+
		"\u0015\u0089\u0001\u0000\u0000\u0000\u0017\u008b\u0001\u0000\u0000\u0000"+
		"\u0019\u008d\u0001\u0000\u0000\u0000\u001b\u008f\u0001\u0000\u0000\u0000"+
		"\u001d\u0091\u0001\u0000\u0000\u0000\u001f\u0093\u0001\u0000\u0000\u0000"+
		"!\u0095\u0001\u0000\u0000\u0000#\u0097\u0001\u0000\u0000\u0000%\u0099"+
		"\u0001\u0000\u0000\u0000\'\u009b\u0001\u0000\u0000\u0000)\u009d\u0001"+
		"\u0000\u0000\u0000+\u009f\u0001\u0000\u0000\u0000-\u00a1\u0001\u0000\u0000"+
		"\u0000/\u00a3\u0001\u0000\u0000\u00001\u00a5\u0001\u0000\u0000\u00003"+
		"\u00a8\u0001\u0000\u0000\u00005\u00ab\u0001\u0000\u0000\u00007\u00ae\u0001"+
		"\u0000\u0000\u00009\u00b1\u0001\u0000\u0000\u0000;\u00b3\u0001\u0000\u0000"+
		"\u0000=\u00b5\u0001\u0000\u0000\u0000?\u00b8\u0001\u0000\u0000\u0000A"+
		"\u00bb\u0001\u0000\u0000\u0000C\u00be\u0001\u0000\u0000\u0000E\u00c1\u0001"+
		"\u0000\u0000\u0000G\u00c8\u0001\u0000\u0000\u0000I\u00cb\u0001\u0000\u0000"+
		"\u0000K\u00d0\u0001\u0000\u0000\u0000M\u00d6\u0001\u0000\u0000\u0000O"+
		"\u00e0\u0001\u0000\u0000\u0000Q\u00e4\u0001\u0000\u0000\u0000S\u00ef\u0001"+
		"\u0000\u0000\u0000U\u00f3\u0001\u0000\u0000\u0000W\u0102\u0001\u0000\u0000"+
		"\u0000Y\u0106\u0001\u0000\u0000\u0000[\\\u0005+\u0000\u0000\\]\u0005="+
		"\u0000\u0000]\u0002\u0001\u0000\u0000\u0000^_\u0005-\u0000\u0000_`\u0005"+
		"=\u0000\u0000`\u0004\u0001\u0000\u0000\u0000ab\u0007\u0000\u0000\u0000"+
		"b\u0006\u0001\u0000\u0000\u0000cd\u0007\u0001\u0000\u0000d\b\u0001\u0000"+
		"\u0000\u0000ef\u0005i\u0000\u0000fg\u0005n\u0000\u0000gh\u0005t\u0000"+
		"\u0000h\n\u0001\u0000\u0000\u0000ij\u0005s\u0000\u0000jk\u0005t\u0000"+
		"\u0000kl\u0005r\u0000\u0000lm\u0005i\u0000\u0000mn\u0005n\u0000\u0000"+
		"no\u0005g\u0000\u0000o\f\u0001\u0000\u0000\u0000pq\u0005b\u0000\u0000"+
		"qr\u0005o\u0000\u0000rs\u0005o\u0000\u0000st\u0005l\u0000\u0000tu\u0005"+
		"e\u0000\u0000uv\u0005a\u0000\u0000vw\u0005n\u0000\u0000w\u000e\u0001\u0000"+
		"\u0000\u0000xy\u0005c\u0000\u0000yz\u0005h\u0000\u0000z{\u0005a\u0000"+
		"\u0000{|\u0005r\u0000\u0000|\u0010\u0001\u0000\u0000\u0000}~\u0005d\u0000"+
		"\u0000~\u007f\u0005o\u0000\u0000\u007f\u0080\u0005u\u0000\u0000\u0080"+
		"\u0081\u0005b\u0000\u0000\u0081\u0082\u0005l\u0000\u0000\u0082\u0083\u0005"+
		"e\u0000\u0000\u0083\u0012\u0001\u0000\u0000\u0000\u0084\u0085\u0005v\u0000"+
		"\u0000\u0085\u0086\u0005o\u0000\u0000\u0086\u0087\u0005i\u0000\u0000\u0087"+
		"\u0088\u0005d\u0000\u0000\u0088\u0014\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005(\u0000\u0000\u008a\u0016\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		")\u0000\u0000\u008c\u0018\u0001\u0000\u0000\u0000\u008d\u008e\u0005{\u0000"+
		"\u0000\u008e\u001a\u0001\u0000\u0000\u0000\u008f\u0090\u0005}\u0000\u0000"+
		"\u0090\u001c\u0001\u0000\u0000\u0000\u0091\u0092\u0005[\u0000\u0000\u0092"+
		"\u001e\u0001\u0000\u0000\u0000\u0093\u0094\u0005]\u0000\u0000\u0094 \u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005;\u0000\u0000\u0096\"\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005,\u0000\u0000\u0098$\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0005=\u0000\u0000\u009a&\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0005+\u0000\u0000\u009c(\u0001\u0000\u0000\u0000\u009d\u009e\u0005-"+
		"\u0000\u0000\u009e*\u0001\u0000\u0000\u0000\u009f\u00a0\u0005*\u0000\u0000"+
		"\u00a0,\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005/\u0000\u0000\u00a2."+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005%\u0000\u0000\u00a40\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0005&\u0000\u0000\u00a6\u00a7\u0005&\u0000\u0000"+
		"\u00a72\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005|\u0000\u0000\u00a9\u00aa"+
		"\u0005|\u0000\u0000\u00aa4\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005="+
		"\u0000\u0000\u00ac\u00ad\u0005=\u0000\u0000\u00ad6\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0005!\u0000\u0000\u00af\u00b0\u0005=\u0000\u0000\u00b08"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005<\u0000\u0000\u00b2:\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0005>\u0000\u0000\u00b4<\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0005<\u0000\u0000\u00b6\u00b7\u0005=\u0000\u0000\u00b7>"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005>\u0000\u0000\u00b9\u00ba\u0005"+
		"=\u0000\u0000\u00ba@\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005+\u0000"+
		"\u0000\u00bc\u00bd\u0005+\u0000\u0000\u00bdB\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0005-\u0000\u0000\u00bf\u00c0\u0005-\u0000\u0000\u00c0D\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0005r\u0000\u0000\u00c2\u00c3\u0005e\u0000"+
		"\u0000\u00c3\u00c4\u0005t\u0000\u0000\u00c4\u00c5\u0005u\u0000\u0000\u00c5"+
		"\u00c6\u0005r\u0000\u0000\u00c6\u00c7\u0005n\u0000\u0000\u00c7F\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0005i\u0000\u0000\u00c9\u00ca\u0005f\u0000"+
		"\u0000\u00caH\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005e\u0000\u0000\u00cc"+
		"\u00cd\u0005l\u0000\u0000\u00cd\u00ce\u0005s\u0000\u0000\u00ce\u00cf\u0005"+
		"e\u0000\u0000\u00cfJ\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005w\u0000"+
		"\u0000\u00d1\u00d2\u0005h\u0000\u0000\u00d2\u00d3\u0005i\u0000\u0000\u00d3"+
		"\u00d4\u0005l\u0000\u0000\u00d4\u00d5\u0005e\u0000\u0000\u00d5L\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0005f\u0000\u0000\u00d7\u00d8\u0005o\u0000"+
		"\u0000\u00d8\u00d9\u0005r\u0000\u0000\u00d9N\u0001\u0000\u0000\u0000\u00da"+
		"\u00e1\u0003\t\u0004\u0000\u00db\u00e1\u0003\u0011\b\u0000\u00dc\u00e1"+
		"\u0003\u000f\u0007\u0000\u00dd\u00e1\u0003\u0013\t\u0000\u00de\u00e1\u0003"+
		"\u000b\u0005\u0000\u00df\u00e1\u0003\r\u0006\u0000\u00e0\u00da\u0001\u0000"+
		"\u0000\u0000\u00e0\u00db\u0001\u0000\u0000\u0000\u00e0\u00dc\u0001\u0000"+
		"\u0000\u0000\u00e0\u00dd\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1P\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e5\u0003\u0005\u0002\u0000\u00e3\u00e5\u0005_\u0000\u0000"+
		"\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e5\u00eb\u0001\u0000\u0000\u0000\u00e6\u00ea\u0003\u0005\u0002\u0000"+
		"\u00e7\u00ea\u0003\u0007\u0003\u0000\u00e8\u00ea\u0005_\u0000\u0000\u00e9"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e8\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec"+
		"R\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00f0"+
		"\u0003\u0007\u0003\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f2T\u0001\u0000\u0000\u0000\u00f3\u00f6\u0005"+
		"\"\u0000\u0000\u00f4\u00f7\u0003\u0005\u0002\u0000\u00f5\u00f7\u0005_"+
		"\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f7\u00fd\u0001\u0000\u0000\u0000\u00f8\u00fc\u0003\u0005"+
		"\u0002\u0000\u00f9\u00fc\u0003\u0007\u0003\u0000\u00fa\u00fc\u0005_\u0000"+
		"\u0000\u00fb\u00f8\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fe\u0100\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0005\"\u0000\u0000\u0101V\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0007\u0002\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0006+\u0000\u0000\u0105X\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\t\u0000\u0000\u0000\u0107Z\u0001\u0000\u0000\u0000\t\u0000\u00e0\u00e4"+
		"\u00e9\u00eb\u00f1\u00f6\u00fb\u00fd\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}