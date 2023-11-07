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
		PA=1, PC=2, EQ=3, PYC=4, LLA=5, LLC=6, COMA=7, MAS=8, MENOS=9, MULT=10, 
		DIV=11, MOD=12, WHILE=13, TDATO=14, NUMERO=15, ID=16, WS=17, OTRO=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "PA", "PC", "EQ", "PYC", "LLA", "LLC", "COMA", "MAS", 
			"MENOS", "MULT", "DIV", "MOD", "WHILE", "TDATO", "NUMERO", "ID", "WS", 
			"OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", "';'", "'{'", "'}'", "','", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'while'", "'int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PC", "EQ", "PYC", "LLA", "LLC", "COMA", "MAS", "MENOS", 
			"MULT", "DIV", "MOD", "WHILE", "TDATO", "NUMERO", "ID", "WS", "OTRO"
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
		"\u0004\u0000\u0012f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010Q\b\u0010\u000b\u0010"+
		"\f\u0010R\u0001\u0011\u0001\u0011\u0003\u0011W\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\\\b\u0011\n\u0011\f\u0011_\t\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0000"+
		"\u0000\u0014\u0001\u0000\u0003\u0000\u0005\u0001\u0007\u0002\t\u0003\u000b"+
		"\u0004\r\u0005\u000f\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b"+
		"\u001b\f\u001d\r\u001f\u000e!\u000f#\u0010%\u0011\'\u0012\u0001\u0000"+
		"\u0003\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r  h\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0001)\u0001\u0000\u0000\u0000\u0003+\u0001"+
		"\u0000\u0000\u0000\u0005-\u0001\u0000\u0000\u0000\u0007/\u0001\u0000\u0000"+
		"\u0000\t1\u0001\u0000\u0000\u0000\u000b3\u0001\u0000\u0000\u0000\r5\u0001"+
		"\u0000\u0000\u0000\u000f7\u0001\u0000\u0000\u0000\u00119\u0001\u0000\u0000"+
		"\u0000\u0013;\u0001\u0000\u0000\u0000\u0015=\u0001\u0000\u0000\u0000\u0017"+
		"?\u0001\u0000\u0000\u0000\u0019A\u0001\u0000\u0000\u0000\u001bC\u0001"+
		"\u0000\u0000\u0000\u001dE\u0001\u0000\u0000\u0000\u001fK\u0001\u0000\u0000"+
		"\u0000!P\u0001\u0000\u0000\u0000#V\u0001\u0000\u0000\u0000%`\u0001\u0000"+
		"\u0000\u0000\'d\u0001\u0000\u0000\u0000)*\u0007\u0000\u0000\u0000*\u0002"+
		"\u0001\u0000\u0000\u0000+,\u0007\u0001\u0000\u0000,\u0004\u0001\u0000"+
		"\u0000\u0000-.\u0005(\u0000\u0000.\u0006\u0001\u0000\u0000\u0000/0\u0005"+
		")\u0000\u00000\b\u0001\u0000\u0000\u000012\u0005=\u0000\u00002\n\u0001"+
		"\u0000\u0000\u000034\u0005;\u0000\u00004\f\u0001\u0000\u0000\u000056\u0005"+
		"{\u0000\u00006\u000e\u0001\u0000\u0000\u000078\u0005}\u0000\u00008\u0010"+
		"\u0001\u0000\u0000\u00009:\u0005,\u0000\u0000:\u0012\u0001\u0000\u0000"+
		"\u0000;<\u0005+\u0000\u0000<\u0014\u0001\u0000\u0000\u0000=>\u0005-\u0000"+
		"\u0000>\u0016\u0001\u0000\u0000\u0000?@\u0005*\u0000\u0000@\u0018\u0001"+
		"\u0000\u0000\u0000AB\u0005/\u0000\u0000B\u001a\u0001\u0000\u0000\u0000"+
		"CD\u0005%\u0000\u0000D\u001c\u0001\u0000\u0000\u0000EF\u0005w\u0000\u0000"+
		"FG\u0005h\u0000\u0000GH\u0005i\u0000\u0000HI\u0005l\u0000\u0000IJ\u0005"+
		"e\u0000\u0000J\u001e\u0001\u0000\u0000\u0000KL\u0005i\u0000\u0000LM\u0005"+
		"n\u0000\u0000MN\u0005t\u0000\u0000N \u0001\u0000\u0000\u0000OQ\u0003\u0003"+
		"\u0001\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\"\u0001\u0000\u0000\u0000"+
		"TW\u0003\u0001\u0000\u0000UW\u0005_\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"VU\u0001\u0000\u0000\u0000W]\u0001\u0000\u0000\u0000X\\\u0003\u0001\u0000"+
		"\u0000Y\\\u0003\u0003\u0001\u0000Z\\\u0005_\u0000\u0000[X\u0001\u0000"+
		"\u0000\u0000[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^$\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0007\u0002\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bc\u0006\u0012\u0000\u0000c&\u0001\u0000"+
		"\u0000\u0000de\t\u0000\u0000\u0000e(\u0001\u0000\u0000\u0000\u0005\u0000"+
		"RV[]\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}