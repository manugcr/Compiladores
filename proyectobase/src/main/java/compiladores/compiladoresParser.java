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
		NUMERO=1, ID=2, TEXT=3, CHARACTER=4, OP=5, CP=6, OB=7, CB=8, SC=9, ADDITION=10, 
		SUBTR=11, MULT=12, DIV=13, MAIN=14, IF=15, INT=16, STRING=17, BOOLEAN=18, 
		CHAR=19, FLOAT=20, DOUBLE=21, FALSE=22, TRUE=23, WS=24, OTRO=25;
	public static final int
		RULE_s = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"s"
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

	public static class SContext extends ParserRuleContext {
		public Token ID;
		public Token NUMERO;
		public Token OTRO;
		public Token OP;
		public Token CP;
		public Token OB;
		public Token CB;
		public Token SC;
		public Token ADDITION;
		public Token SUBTR;
		public Token MULT;
		public Token DIV;
		public Token TEXT;
		public Token CHARACTER;
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(compiladoresParser.NUMERO, 0); }
		public TerminalNode OTRO() { return getToken(compiladoresParser.OTRO, 0); }
		public TerminalNode OP() { return getToken(compiladoresParser.OP, 0); }
		public TerminalNode CP() { return getToken(compiladoresParser.CP, 0); }
		public TerminalNode OB() { return getToken(compiladoresParser.OB, 0); }
		public TerminalNode CB() { return getToken(compiladoresParser.CB, 0); }
		public TerminalNode SC() { return getToken(compiladoresParser.SC, 0); }
		public TerminalNode ADDITION() { return getToken(compiladoresParser.ADDITION, 0); }
		public TerminalNode SUBTR() { return getToken(compiladoresParser.SUBTR, 0); }
		public TerminalNode MULT() { return getToken(compiladoresParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(compiladoresParser.DIV, 0); }
		public TerminalNode TEXT() { return getToken(compiladoresParser.TEXT, 0); }
		public TerminalNode CHARACTER() { return getToken(compiladoresParser.CHARACTER, 0); }
		public TerminalNode EOF() { return getToken(compiladoresParser.EOF, 0); }
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
		enterRule(_localctx, 0, RULE_s);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2);
				((SContext)_localctx).ID = match(ID);
				 System.out.println("ID ->" + ((SContext)_localctx).ID.getText() + "<--"); 
				setState(4);
				s();
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(5);
				((SContext)_localctx).NUMERO = match(NUMERO);
				 System.out.println("NUMERO ->" + ((SContext)_localctx).NUMERO.getText() + "<--"); 
				setState(7);
				s();
				}
				break;
			case OTRO:
				enterOuterAlt(_localctx, 3);
				{
				setState(8);
				((SContext)_localctx).OTRO = match(OTRO);
				 System.out.println("Otro ->" + ((SContext)_localctx).OTRO.getText() + "<--"); 
				setState(10);
				s();
				}
				break;
			case OP:
				enterOuterAlt(_localctx, 4);
				{
				setState(11);
				((SContext)_localctx).OP = match(OP);
				 System.out.println("OP ->" + ((SContext)_localctx).OP.getText() + "<--"); 
				setState(13);
				s();
				}
				break;
			case CP:
				enterOuterAlt(_localctx, 5);
				{
				setState(14);
				((SContext)_localctx).CP = match(CP);
				 System.out.println("CP ->" + ((SContext)_localctx).CP.getText() + "<--"); 
				setState(16);
				s();
				}
				break;
			case OB:
				enterOuterAlt(_localctx, 6);
				{
				setState(17);
				((SContext)_localctx).OB = match(OB);
				 System.out.println("OB ->" + ((SContext)_localctx).OB.getText() + "<--"); 
				setState(19);
				s();
				}
				break;
			case CB:
				enterOuterAlt(_localctx, 7);
				{
				setState(20);
				((SContext)_localctx).CB = match(CB);
				 System.out.println("CB ->" + ((SContext)_localctx).CB.getText() + "<--"); 
				setState(22);
				s();
				}
				break;
			case SC:
				enterOuterAlt(_localctx, 8);
				{
				setState(23);
				((SContext)_localctx).SC = match(SC);
				 System.out.println("SC ->" + ((SContext)_localctx).SC.getText() + "<--"); 
				setState(25);
				s();
				}
				break;
			case ADDITION:
				enterOuterAlt(_localctx, 9);
				{
				setState(26);
				((SContext)_localctx).ADDITION = match(ADDITION);
				 System.out.println("ADDITION ->" + ((SContext)_localctx).ADDITION.getText() + "<--"); 
				setState(28);
				s();
				}
				break;
			case SUBTR:
				enterOuterAlt(_localctx, 10);
				{
				setState(29);
				((SContext)_localctx).SUBTR = match(SUBTR);
				 System.out.println("SUBTR ->" + ((SContext)_localctx).SUBTR.getText() + "<--"); 
				setState(31);
				s();
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 11);
				{
				setState(32);
				((SContext)_localctx).MULT = match(MULT);
				 System.out.println("MULT ->" + ((SContext)_localctx).MULT.getText() + "<--"); 
				setState(34);
				s();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 12);
				{
				setState(35);
				((SContext)_localctx).DIV = match(DIV);
				 System.out.println("DIV ->" + ((SContext)_localctx).DIV.getText() + "<--"); 
				setState(37);
				s();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 13);
				{
				setState(38);
				((SContext)_localctx).TEXT = match(TEXT);
				 System.out.println("TEXT ->" + ((SContext)_localctx).TEXT.getText() + "<--"); 
				setState(40);
				s();
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 14);
				{
				setState(41);
				((SContext)_localctx).CHARACTER = match(CHARACTER);
				 System.out.println("CHARACTER ->" + ((SContext)_localctx).CHARACTER.getText() + "<--"); 
				setState(43);
				s();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 15);
				{
				setState(44);
				match(EOF);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\62\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\60\n\2\3\2\2\2\3\2\2\2\2>\2/\3\2\2\2"+
		"\4\5\7\4\2\2\5\6\b\2\1\2\6\60\5\2\2\2\7\b\7\3\2\2\b\t\b\2\1\2\t\60\5\2"+
		"\2\2\n\13\7\33\2\2\13\f\b\2\1\2\f\60\5\2\2\2\r\16\7\7\2\2\16\17\b\2\1"+
		"\2\17\60\5\2\2\2\20\21\7\b\2\2\21\22\b\2\1\2\22\60\5\2\2\2\23\24\7\t\2"+
		"\2\24\25\b\2\1\2\25\60\5\2\2\2\26\27\7\n\2\2\27\30\b\2\1\2\30\60\5\2\2"+
		"\2\31\32\7\13\2\2\32\33\b\2\1\2\33\60\5\2\2\2\34\35\7\f\2\2\35\36\b\2"+
		"\1\2\36\60\5\2\2\2\37 \7\r\2\2 !\b\2\1\2!\60\5\2\2\2\"#\7\16\2\2#$\b\2"+
		"\1\2$\60\5\2\2\2%&\7\17\2\2&\'\b\2\1\2\'\60\5\2\2\2()\7\5\2\2)*\b\2\1"+
		"\2*\60\5\2\2\2+,\7\6\2\2,-\b\2\1\2-\60\5\2\2\2.\60\7\2\2\3/\4\3\2\2\2"+
		"/\7\3\2\2\2/\n\3\2\2\2/\r\3\2\2\2/\20\3\2\2\2/\23\3\2\2\2/\26\3\2\2\2"+
		"/\31\3\2\2\2/\34\3\2\2\2/\37\3\2\2\2/\"\3\2\2\2/%\3\2\2\2/(\3\2\2\2/+"+
		"\3\2\2\2/.\3\2\2\2\60\3\3\2\2\2\3/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}