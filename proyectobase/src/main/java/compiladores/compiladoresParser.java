// Generated from /home/manu/facultad/compiladores/Compiladores/proyectobase/src/main/java/compiladores/compiladores.g4 by ANTLR 4.9.2

package compiladores;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compiladoresParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, NUMERO=2, TEXTO=3, CARACTER=4, PA=5, PC=6, LLA=7, LLC=8, CA=9, CC=10, 
		PYC=11, SUMA=12, MULT=13, DIVI=14, RESTA=15, MAIN=16, IF=17, INT=18, STRING=19, 
		BOOLEAN=20, CHAR=21, FLOAT=22, DOUBLE=23, FALSE=24, TRUE=25, WS=26, OTRO=27;
	public static final int
		RULE_si = 0, RULE_s = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"si", "s"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "'+'", "'*'", "'/'", "'-'", "'main'", "'if'", "'int'", "'string'", 
			"'bool'", "'char'", "'float'", "'double'", "'false'", "'true'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "NUMERO", "TEXTO", "CARACTER", "PA", "PC", "LLA", "LLC", 
			"CA", "CC", "PYC", "SUMA", "MULT", "DIVI", "RESTA", "MAIN", "IF", "INT", 
			"STRING", "BOOLEAN", "CHAR", "FLOAT", "DOUBLE", "FALSE", "TRUE", "WS", 
			"OTRO"
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
	public String getGrammarFileName() { return "compiladores.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public compiladoresParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SiContext extends ParserRuleContext {
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode EOF() { return getToken(compiladoresParser.EOF, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			s();
			setState(5);
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

	public static class SContext extends ParserRuleContext {
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public List<SContext> s() {
			return getRuleContexts(SContext.class);
		}
		public SContext s(int i) {
			return getRuleContext(SContext.class,i);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public TerminalNode LLA() { return getToken(compiladoresParser.LLA, 0); }
		public TerminalNode LLC() { return getToken(compiladoresParser.LLC, 0); }
		public TerminalNode CA() { return getToken(compiladoresParser.CA, 0); }
		public TerminalNode CC() { return getToken(compiladoresParser.CC, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_s);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
				enterOuterAlt(_localctx, 1);
				{
				setState(7);
				match(PA);
				setState(8);
				s();
				setState(9);
				match(PC);
				setState(10);
				s();
				}
				break;
			case LLA:
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				match(LLA);
				setState(13);
				s();
				setState(14);
				match(LLC);
				setState(15);
				s();
				}
				break;
			case CA:
				enterOuterAlt(_localctx, 3);
				{
				setState(17);
				match(CA);
				setState(18);
				s();
				setState(19);
				match(CC);
				setState(20);
				s();
				}
				break;
			case EOF:
			case PC:
			case LLC:
			case CC:
				enterOuterAlt(_localctx, 4);
				{
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\34\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\32\n\3\3\3\2\2\4\2\4\2\2\2\34\2\6\3\2\2\2\4\31\3\2\2\2"+
		"\6\7\5\4\3\2\7\b\7\2\2\3\b\3\3\2\2\2\t\n\7\7\2\2\n\13\5\4\3\2\13\f\7\b"+
		"\2\2\f\r\5\4\3\2\r\32\3\2\2\2\16\17\7\t\2\2\17\20\5\4\3\2\20\21\7\n\2"+
		"\2\21\22\5\4\3\2\22\32\3\2\2\2\23\24\7\13\2\2\24\25\5\4\3\2\25\26\7\f"+
		"\2\2\26\27\5\4\3\2\27\32\3\2\2\2\30\32\3\2\2\2\31\t\3\2\2\2\31\16\3\2"+
		"\2\2\31\23\3\2\2\2\31\30\3\2\2\2\32\5\3\2\2\2\3\31";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}