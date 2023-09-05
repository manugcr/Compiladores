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
		NUMERO=1, ID=2, TEXT=3, CHARACTER=4, OP=5, CP=6, OB=7, CB=8, SC=9, ADDITION=10, 
		SUBTR=11, MULT=12, DIV=13, MAIN=14, IF=15, INT=16, STRING=17, BOOLEAN=18, 
		CHAR=19, FLOAT=20, DOUBLE=21, FALSE=22, TRUE=23, WS=24, OTRO=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "NUMERO", "ID", "TEXT", "CHARACTER", "OP", "CP", "OB", 
			"CB", "SC", "ADDITION", "SUBTR", "MULT", "DIV", "MAIN", "IF", "INT", 
			"STRING", "BOOLEAN", "CHAR", "FLOAT", "DOUBLE", "FALSE", "TRUE", "WS", 
			"OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'('", "')'", "'{'", "'}'", "';'", "'+'", 
			"'-'", "'*'", "'/'", "'main'", "'if'", "'int'", "'string'", "'bool'", 
			"'char'", "'float'", "'double'", "'false'", "'true'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMERO", "ID", "TEXT", "CHARACTER", "OP", "CP", "OB", "CB", "SC", 
			"ADDITION", "SUBTR", "MULT", "DIV", "MAIN", "IF", "INT", "STRING", "BOOLEAN", 
			"CHAR", "FLOAT", "DOUBLE", "FALSE", "TRUE", "WS", "OTRO"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00a8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\6\4?\n\4\r\4\16"+
		"\4@\3\5\3\5\5\5E\n\5\3\5\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\6\3\6\7\6Q"+
		"\n\6\f\6\16\6T\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3R\2\35\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r"+
		"\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\33"+
		"\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00ab\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7>\3\2\2\2\tD\3\2\2\2\13N\3\2\2\2\rW\3"+
		"\2\2\2\17[\3\2\2\2\21]\3\2\2\2\23_\3\2\2\2\25a\3\2\2\2\27c\3\2\2\2\31"+
		"e\3\2\2\2\33g\3\2\2\2\35i\3\2\2\2\37k\3\2\2\2!m\3\2\2\2#r\3\2\2\2%u\3"+
		"\2\2\2\'y\3\2\2\2)\u0080\3\2\2\2+\u0085\3\2\2\2-\u008a\3\2\2\2/\u0090"+
		"\3\2\2\2\61\u0097\3\2\2\2\63\u009d\3\2\2\2\65\u00a2\3\2\2\2\67\u00a6\3"+
		"\2\2\29:\t\2\2\2:\4\3\2\2\2;<\t\3\2\2<\6\3\2\2\2=?\5\5\3\2>=\3\2\2\2?"+
		"@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\b\3\2\2\2BE\5\3\2\2CE\7a\2\2DB\3\2\2\2"+
		"DC\3\2\2\2EK\3\2\2\2FJ\5\3\2\2GJ\5\5\3\2HJ\7a\2\2IF\3\2\2\2IG\3\2\2\2"+
		"IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\n\3\2\2\2MK\3\2\2\2NR\7$\2\2"+
		"OQ\13\2\2\2PO\3\2\2\2QT\3\2\2\2RS\3\2\2\2RP\3\2\2\2SU\3\2\2\2TR\3\2\2"+
		"\2UV\7$\2\2V\f\3\2\2\2WX\7)\2\2XY\5\3\2\2YZ\7)\2\2Z\16\3\2\2\2[\\\7*\2"+
		"\2\\\20\3\2\2\2]^\7+\2\2^\22\3\2\2\2_`\7}\2\2`\24\3\2\2\2ab\7\177\2\2"+
		"b\26\3\2\2\2cd\7=\2\2d\30\3\2\2\2ef\7-\2\2f\32\3\2\2\2gh\7/\2\2h\34\3"+
		"\2\2\2ij\7,\2\2j\36\3\2\2\2kl\7\61\2\2l \3\2\2\2mn\7o\2\2no\7c\2\2op\7"+
		"k\2\2pq\7p\2\2q\"\3\2\2\2rs\7k\2\2st\7h\2\2t$\3\2\2\2uv\7k\2\2vw\7p\2"+
		"\2wx\7v\2\2x&\3\2\2\2yz\7u\2\2z{\7v\2\2{|\7t\2\2|}\7k\2\2}~\7p\2\2~\177"+
		"\7i\2\2\177(\3\2\2\2\u0080\u0081\7d\2\2\u0081\u0082\7q\2\2\u0082\u0083"+
		"\7q\2\2\u0083\u0084\7n\2\2\u0084*\3\2\2\2\u0085\u0086\7e\2\2\u0086\u0087"+
		"\7j\2\2\u0087\u0088\7c\2\2\u0088\u0089\7t\2\2\u0089,\3\2\2\2\u008a\u008b"+
		"\7h\2\2\u008b\u008c\7n\2\2\u008c\u008d\7q\2\2\u008d\u008e\7c\2\2\u008e"+
		"\u008f\7v\2\2\u008f.\3\2\2\2\u0090\u0091\7f\2\2\u0091\u0092\7q\2\2\u0092"+
		"\u0093\7w\2\2\u0093\u0094\7d\2\2\u0094\u0095\7n\2\2\u0095\u0096\7g\2\2"+
		"\u0096\60\3\2\2\2\u0097\u0098\7h\2\2\u0098\u0099\7c\2\2\u0099\u009a\7"+
		"n\2\2\u009a\u009b\7u\2\2\u009b\u009c\7g\2\2\u009c\62\3\2\2\2\u009d\u009e"+
		"\7v\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7g\2\2\u00a1"+
		"\64\3\2\2\2\u00a2\u00a3\t\4\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\b\33\2"+
		"\2\u00a5\66\3\2\2\2\u00a6\u00a7\13\2\2\2\u00a78\3\2\2\2\b\2@DIKR\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}