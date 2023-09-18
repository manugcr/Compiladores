// Generated from /home/manu/facultad/compiladores/Compiladores/proyectobase/src/main/java/compiladores/compiladores.g4 by ANTLR 4.9.2

package compiladores;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compiladoresLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, ID=17, 
		NUMERO=18, TEXTO=19, CARACTER=20, PA=21, PC=22, LLA=23, LLC=24, CA=25, 
		CC=26, PYC=27, SUMA=28, MULT=29, DIVI=30, RESTA=31, MAIN=32, IF=33, INT=34, 
		STRING=35, BOOLEAN=36, CHAR=37, FLOAT=38, DOUBLE=39, FALSE=40, TRUE=41, 
		WS=42, OTRO=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "LETRA", 
			"DIGITO", "ID", "NUMERO", "TEXTO", "CARACTER", "PA", "PC", "LLA", "LLC", 
			"CA", "CC", "PYC", "SUMA", "MULT", "DIVI", "RESTA", "MAIN", "IF", "INT", 
			"STRING", "BOOLEAN", "CHAR", "FLOAT", "DOUBLE", "FALSE", "TRUE", "WS", 
			"OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'<='", "'>='", "'!='", "'=='", "'+='", "'++'", "'--'", 
			"'-='", "'='", "','", "'return'", "'for'", "'while'", "'else'", null, 
			null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "'+'", 
			"'*'", "'/'", "'-'", "'main'", "'if'", "'int'", "'string'", "'bool'", 
			"'char'", "'float'", "'double'", "'false'", "'true'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ID", "NUMERO", "TEXTO", "CARACTER", "PA", 
			"PC", "LLA", "LLC", "CA", "CC", "PYC", "SUMA", "MULT", "DIVI", "RESTA", 
			"MAIN", "IF", "INT", "STRING", "BOOLEAN", "CHAR", "FLOAT", "DOUBLE", 
			"FALSE", "TRUE", "WS", "OTRO"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0106\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\5\24\u009a\n\24\3\24\3\24\3\24\7\24\u009f\n\24\f\24\16\24\u00a2"+
		"\13\24\3\25\6\25\u00a5\n\25\r\25\16\25\u00a6\3\26\3\26\7\26\u00ab\n\26"+
		"\f\26\16\26\u00ae\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*"+
		"\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3\u00ac\2/\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\2%\2\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36"+
		"?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17"+
		"\17\"\"\2\u0109\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7a\3\2\2\2\t"+
		"d\3\2\2\2\13g\3\2\2\2\rj\3\2\2\2\17m\3\2\2\2\21p\3\2\2\2\23s\3\2\2\2\25"+
		"v\3\2\2\2\27y\3\2\2\2\31{\3\2\2\2\33}\3\2\2\2\35\u0084\3\2\2\2\37\u0088"+
		"\3\2\2\2!\u008e\3\2\2\2#\u0093\3\2\2\2%\u0095\3\2\2\2\'\u0099\3\2\2\2"+
		")\u00a4\3\2\2\2+\u00a8\3\2\2\2-\u00b1\3\2\2\2/\u00b5\3\2\2\2\61\u00b7"+
		"\3\2\2\2\63\u00b9\3\2\2\2\65\u00bb\3\2\2\2\67\u00bd\3\2\2\29\u00bf\3\2"+
		"\2\2;\u00c1\3\2\2\2=\u00c3\3\2\2\2?\u00c5\3\2\2\2A\u00c7\3\2\2\2C\u00c9"+
		"\3\2\2\2E\u00cb\3\2\2\2G\u00d0\3\2\2\2I\u00d3\3\2\2\2K\u00d7\3\2\2\2M"+
		"\u00de\3\2\2\2O\u00e3\3\2\2\2Q\u00e8\3\2\2\2S\u00ee\3\2\2\2U\u00f5\3\2"+
		"\2\2W\u00fb\3\2\2\2Y\u0100\3\2\2\2[\u0104\3\2\2\2]^\7>\2\2^\4\3\2\2\2"+
		"_`\7@\2\2`\6\3\2\2\2ab\7>\2\2bc\7?\2\2c\b\3\2\2\2de\7@\2\2ef\7?\2\2f\n"+
		"\3\2\2\2gh\7#\2\2hi\7?\2\2i\f\3\2\2\2jk\7?\2\2kl\7?\2\2l\16\3\2\2\2mn"+
		"\7-\2\2no\7?\2\2o\20\3\2\2\2pq\7-\2\2qr\7-\2\2r\22\3\2\2\2st\7/\2\2tu"+
		"\7/\2\2u\24\3\2\2\2vw\7/\2\2wx\7?\2\2x\26\3\2\2\2yz\7?\2\2z\30\3\2\2\2"+
		"{|\7.\2\2|\32\3\2\2\2}~\7t\2\2~\177\7g\2\2\177\u0080\7v\2\2\u0080\u0081"+
		"\7w\2\2\u0081\u0082\7t\2\2\u0082\u0083\7p\2\2\u0083\34\3\2\2\2\u0084\u0085"+
		"\7h\2\2\u0085\u0086\7q\2\2\u0086\u0087\7t\2\2\u0087\36\3\2\2\2\u0088\u0089"+
		"\7y\2\2\u0089\u008a\7j\2\2\u008a\u008b\7k\2\2\u008b\u008c\7n\2\2\u008c"+
		"\u008d\7g\2\2\u008d \3\2\2\2\u008e\u008f\7g\2\2\u008f\u0090\7n\2\2\u0090"+
		"\u0091\7u\2\2\u0091\u0092\7g\2\2\u0092\"\3\2\2\2\u0093\u0094\t\2\2\2\u0094"+
		"$\3\2\2\2\u0095\u0096\t\3\2\2\u0096&\3\2\2\2\u0097\u009a\5#\22\2\u0098"+
		"\u009a\7a\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\u00a0\3\2"+
		"\2\2\u009b\u009f\5#\22\2\u009c\u009f\5%\23\2\u009d\u009f\7a\2\2\u009e"+
		"\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1(\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a3\u00a5\5%\23\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7*\3\2\2\2\u00a8\u00ac\7$\2\2\u00a9"+
		"\u00ab\13\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00ad\3"+
		"\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b0\7$\2\2\u00b0,\3\2\2\2\u00b1\u00b2\7)\2\2\u00b2\u00b3\5#\22\2\u00b3"+
		"\u00b4\7)\2\2\u00b4.\3\2\2\2\u00b5\u00b6\7*\2\2\u00b6\60\3\2\2\2\u00b7"+
		"\u00b8\7+\2\2\u00b8\62\3\2\2\2\u00b9\u00ba\7}\2\2\u00ba\64\3\2\2\2\u00bb"+
		"\u00bc\7\177\2\2\u00bc\66\3\2\2\2\u00bd\u00be\7]\2\2\u00be8\3\2\2\2\u00bf"+
		"\u00c0\7_\2\2\u00c0:\3\2\2\2\u00c1\u00c2\7=\2\2\u00c2<\3\2\2\2\u00c3\u00c4"+
		"\7-\2\2\u00c4>\3\2\2\2\u00c5\u00c6\7,\2\2\u00c6@\3\2\2\2\u00c7\u00c8\7"+
		"\61\2\2\u00c8B\3\2\2\2\u00c9\u00ca\7/\2\2\u00caD\3\2\2\2\u00cb\u00cc\7"+
		"o\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7p\2\2\u00cfF"+
		"\3\2\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7h\2\2\u00d2H\3\2\2\2\u00d3\u00d4"+
		"\7k\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7v\2\2\u00d6J\3\2\2\2\u00d7\u00d8"+
		"\7u\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7k\2\2\u00db"+
		"\u00dc\7p\2\2\u00dc\u00dd\7i\2\2\u00ddL\3\2\2\2\u00de\u00df\7d\2\2\u00df"+
		"\u00e0\7q\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7n\2\2\u00e2N\3\2\2\2\u00e3"+
		"\u00e4\7e\2\2\u00e4\u00e5\7j\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7t\2\2"+
		"\u00e7P\3\2\2\2\u00e8\u00e9\7h\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb\7q\2"+
		"\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7v\2\2\u00edR\3\2\2\2\u00ee\u00ef\7"+
		"f\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7d\2\2\u00f2\u00f3"+
		"\7n\2\2\u00f3\u00f4\7g\2\2\u00f4T\3\2\2\2\u00f5\u00f6\7h\2\2\u00f6\u00f7"+
		"\7c\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7u\2\2\u00f9\u00fa\7g\2\2\u00fa"+
		"V\3\2\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7w\2\2\u00fe"+
		"\u00ff\7g\2\2\u00ffX\3\2\2\2\u0100\u0101\t\4\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0103\b-\2\2\u0103Z\3\2\2\2\u0104\u0105\13\2\2\2\u0105\\\3\2\2\2\b\2"+
		"\u0099\u009e\u00a0\u00a6\u00ac\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}