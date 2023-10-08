// Generated from /home/manu/facultad/compiladores/Compiladores/proyectobase/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1

package compiladores;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class compiladoresParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NUMERO=3, TEXTO=4, CARACTER=5, PA=6, PC=7, LLA=8, LLC=9, 
		CA=10, CC=11, PYC=12, SUMA=13, MULT=14, DIVI=15, RESTA=16, MOD=17, MAIN=18, 
		IF=19, FOR=20, WHILE=21, RETURN=22, INT=23, STRING=24, BOOLEAN=25, CHAR=26, 
		FLOAT=27, DOUBLE=28, FALSE=29, TRUE=30, WS=31, ID=32, OTRO=33;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_tipo = 2, RULE_instruccion = 3, 
		RULE_asignacion = 4, RULE_principal = 5, RULE_bloque = 6, RULE_declaracion = 7, 
		RULE_ireturn = 8, RULE_inst_while = 9, RULE_opal = 10, RULE_expresion = 11, 
		RULE_exp = 12, RULE_termino = 13, RULE_term = 14, RULE_factor = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "tipo", "instruccion", "asignacion", "principal", 
			"bloque", "declaracion", "ireturn", "inst_while", "opal", "expresion", 
			"exp", "termino", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "','", null, null, null, "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "';'", "'+'", "'*'", "'/'", "'-'", "'%'", "'main'", "'if'", "'for'", 
			"'while'", "'return'", "'int'", "'string'", "'bool'", "'char'", "'float'", 
			"'double'", "'false'", "'true'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NUMERO", "TEXTO", "CARACTER", "PA", "PC", "LLA", "LLC", 
			"CA", "CC", "PYC", "SUMA", "MULT", "DIVI", "RESTA", "MOD", "MAIN", "IF", 
			"FOR", "WHILE", "RETURN", "INT", "STRING", "BOOLEAN", "CHAR", "FLOAT", 
			"DOUBLE", "FALSE", "TRUE", "WS", "ID", "OTRO"
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(compiladoresParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			instrucciones();
			setState(33);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitInstrucciones(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LLA:
			case WHILE:
			case RETURN:
			case INT:
			case STRING:
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case DOUBLE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				instruccion();
				setState(36);
				instrucciones();
				}
				break;
			case EOF:
			case LLC:
				enterOuterAlt(_localctx, 2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(compiladoresParser.INT, 0); }
		public TerminalNode STRING() { return getToken(compiladoresParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(compiladoresParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(compiladoresParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(compiladoresParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(compiladoresParser.DOUBLE, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 528482304L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public IreturnContext ireturn() {
			return getRuleContext(IreturnContext.class,0);
		}
		public Inst_whileContext inst_while() {
			return getRuleContext(Inst_whileContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitInstruccion(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruccion);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				principal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				bloque();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				asignacion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				declaracion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				ireturn();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				inst_while();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asignacion);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(ID);
				setState(52);
				match(T__0);
				setState(53);
				exp();
				setState(54);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(ID);
				setState(57);
				match(T__0);
				setState(58);
				exp();
				setState(59);
				match(T__1);
				setState(60);
				asignacion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrincipalContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(compiladoresParser.INT, 0); }
		public TerminalNode MAIN() { return getToken(compiladoresParser.MAIN, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitPrincipal(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_principal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(INT);
			setState(65);
			match(MAIN);
			setState(66);
			match(PA);
			setState(67);
			match(PC);
			setState(68);
			bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLA() { return getToken(compiladoresParser.LLA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLC() { return getToken(compiladoresParser.LLC, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitBloque(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(LLA);
			setState(71);
			instrucciones();
			setState(72);
			match(LLC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(compiladoresParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(compiladoresParser.ID, i);
		}
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public TerminalNode NUMERO() { return getToken(compiladoresParser.NUMERO, 0); }
		public TerminalNode TEXTO() { return getToken(compiladoresParser.TEXTO, 0); }
		public TerminalNode CARACTER() { return getToken(compiladoresParser.CARACTER, 0); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitDeclaracion(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracion);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				tipo();
				setState(75);
				match(ID);
				setState(76);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				tipo();
				setState(79);
				match(ID);
				setState(80);
				match(T__0);
				setState(81);
				match(NUMERO);
				setState(82);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				tipo();
				setState(85);
				match(ID);
				setState(86);
				match(T__0);
				setState(87);
				match(TEXTO);
				setState(88);
				match(PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				tipo();
				setState(91);
				match(ID);
				setState(92);
				match(T__0);
				setState(93);
				match(CARACTER);
				setState(94);
				match(PYC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				tipo();
				setState(97);
				match(ID);
				setState(98);
				match(T__0);
				setState(99);
				match(ID);
				setState(100);
				match(PYC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				tipo();
				setState(103);
				match(ID);
				setState(104);
				match(T__0);
				setState(105);
				match(ID);
				setState(106);
				match(T__1);
				setState(107);
				declaracion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IreturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(compiladoresParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public TerminalNode NUMERO() { return getToken(compiladoresParser.NUMERO, 0); }
		public TerminalNode TEXTO() { return getToken(compiladoresParser.TEXTO, 0); }
		public IreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ireturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterIreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitIreturn(this);
		}
	}

	public final IreturnContext ireturn() throws RecognitionException {
		IreturnContext _localctx = new IreturnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ireturn);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(RETURN);
				setState(112);
				match(ID);
				setState(113);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(RETURN);
				setState(115);
				match(NUMERO);
				setState(116);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(RETURN);
				setState(118);
				match(TEXTO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Inst_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(compiladoresParser.WHILE, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public Inst_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterInst_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitInst_while(this);
		}
	}

	public final Inst_whileContext inst_while() throws RecognitionException {
		Inst_whileContext _localctx = new Inst_whileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inst_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(WHILE);
			setState(122);
			match(PA);
			setState(123);
			opal();
			setState(124);
			match(PC);
			setState(125);
			instruccion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public OpalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterOpal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitOpal(this);
		}
	}

	public final OpalContext opal() throws RecognitionException {
		OpalContext _localctx = new OpalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_opal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			termino();
			setState(130);
			exp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(compiladoresParser.SUMA, 0); }
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(compiladoresParser.RESTA, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exp);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(SUMA);
				setState(133);
				termino();
				setState(134);
				exp();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(RESTA);
				setState(137);
				termino();
				setState(138);
				exp();
				}
				break;
			case T__1:
			case PC:
			case PYC:
				enterOuterAlt(_localctx, 3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitTermino(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			factor();
			setState(144);
			term();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(compiladoresParser.MULT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode DIVI() { return getToken(compiladoresParser.DIVI, 0); }
		public TerminalNode MOD() { return getToken(compiladoresParser.MOD, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(MULT);
				setState(147);
				factor();
				setState(148);
				term();
				}
				break;
			case DIVI:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(DIVI);
				setState(151);
				factor();
				setState(152);
				term();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(MOD);
				setState(155);
				factor();
				setState(156);
				term();
				}
				break;
			case T__1:
			case PC:
			case PYC:
			case SUMA:
			case RESTA:
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(compiladoresParser.NUMERO, 0); }
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(NUMERO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(ID);
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(PA);
				setState(164);
				expresion();
				setState(165);
				match(PC);
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
		"\u0004\u0001!\u00aa\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"2\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004?\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"n\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bx\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u008e\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00a0\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00a8"+
		"\b\u000f\u0001\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0001\u0001\u0000"+
		"\u0017\u001c\u00ae\u0000 \u0001\u0000\u0000\u0000\u0002\'\u0001\u0000"+
		"\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000"+
		"\b>\u0001\u0000\u0000\u0000\n@\u0001\u0000\u0000\u0000\fF\u0001\u0000"+
		"\u0000\u0000\u000em\u0001\u0000\u0000\u0000\u0010w\u0001\u0000\u0000\u0000"+
		"\u0012y\u0001\u0000\u0000\u0000\u0014\u007f\u0001\u0000\u0000\u0000\u0016"+
		"\u0081\u0001\u0000\u0000\u0000\u0018\u008d\u0001\u0000\u0000\u0000\u001a"+
		"\u008f\u0001\u0000\u0000\u0000\u001c\u009f\u0001\u0000\u0000\u0000\u001e"+
		"\u00a7\u0001\u0000\u0000\u0000 !\u0003\u0002\u0001\u0000!\"\u0005\u0000"+
		"\u0000\u0001\"\u0001\u0001\u0000\u0000\u0000#$\u0003\u0006\u0003\u0000"+
		"$%\u0003\u0002\u0001\u0000%(\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000"+
		"\u0000\'#\u0001\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000(\u0003\u0001"+
		"\u0000\u0000\u0000)*\u0007\u0000\u0000\u0000*\u0005\u0001\u0000\u0000"+
		"\u0000+2\u0003\n\u0005\u0000,2\u0003\f\u0006\u0000-2\u0003\b\u0004\u0000"+
		".2\u0003\u000e\u0007\u0000/2\u0003\u0010\b\u000002\u0003\u0012\t\u0000"+
		"1+\u0001\u0000\u0000\u00001,\u0001\u0000\u0000\u00001-\u0001\u0000\u0000"+
		"\u00001.\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000010\u0001\u0000"+
		"\u0000\u00002\u0007\u0001\u0000\u0000\u000034\u0005 \u0000\u000045\u0005"+
		"\u0001\u0000\u000056\u0003\u0018\f\u000067\u0005\f\u0000\u00007?\u0001"+
		"\u0000\u0000\u000089\u0005 \u0000\u00009:\u0005\u0001\u0000\u0000:;\u0003"+
		"\u0018\f\u0000;<\u0005\u0002\u0000\u0000<=\u0003\b\u0004\u0000=?\u0001"+
		"\u0000\u0000\u0000>3\u0001\u0000\u0000\u0000>8\u0001\u0000\u0000\u0000"+
		"?\t\u0001\u0000\u0000\u0000@A\u0005\u0017\u0000\u0000AB\u0005\u0012\u0000"+
		"\u0000BC\u0005\u0006\u0000\u0000CD\u0005\u0007\u0000\u0000DE\u0003\f\u0006"+
		"\u0000E\u000b\u0001\u0000\u0000\u0000FG\u0005\b\u0000\u0000GH\u0003\u0002"+
		"\u0001\u0000HI\u0005\t\u0000\u0000I\r\u0001\u0000\u0000\u0000JK\u0003"+
		"\u0004\u0002\u0000KL\u0005 \u0000\u0000LM\u0005\f\u0000\u0000Mn\u0001"+
		"\u0000\u0000\u0000NO\u0003\u0004\u0002\u0000OP\u0005 \u0000\u0000PQ\u0005"+
		"\u0001\u0000\u0000QR\u0005\u0003\u0000\u0000RS\u0005\f\u0000\u0000Sn\u0001"+
		"\u0000\u0000\u0000TU\u0003\u0004\u0002\u0000UV\u0005 \u0000\u0000VW\u0005"+
		"\u0001\u0000\u0000WX\u0005\u0004\u0000\u0000XY\u0005\f\u0000\u0000Yn\u0001"+
		"\u0000\u0000\u0000Z[\u0003\u0004\u0002\u0000[\\\u0005 \u0000\u0000\\]"+
		"\u0005\u0001\u0000\u0000]^\u0005\u0005\u0000\u0000^_\u0005\f\u0000\u0000"+
		"_n\u0001\u0000\u0000\u0000`a\u0003\u0004\u0002\u0000ab\u0005 \u0000\u0000"+
		"bc\u0005\u0001\u0000\u0000cd\u0005 \u0000\u0000de\u0005\f\u0000\u0000"+
		"en\u0001\u0000\u0000\u0000fg\u0003\u0004\u0002\u0000gh\u0005 \u0000\u0000"+
		"hi\u0005\u0001\u0000\u0000ij\u0005 \u0000\u0000jk\u0005\u0002\u0000\u0000"+
		"kl\u0003\u000e\u0007\u0000ln\u0001\u0000\u0000\u0000mJ\u0001\u0000\u0000"+
		"\u0000mN\u0001\u0000\u0000\u0000mT\u0001\u0000\u0000\u0000mZ\u0001\u0000"+
		"\u0000\u0000m`\u0001\u0000\u0000\u0000mf\u0001\u0000\u0000\u0000n\u000f"+
		"\u0001\u0000\u0000\u0000op\u0005\u0016\u0000\u0000pq\u0005 \u0000\u0000"+
		"qx\u0005\f\u0000\u0000rs\u0005\u0016\u0000\u0000st\u0005\u0003\u0000\u0000"+
		"tx\u0005\f\u0000\u0000uv\u0005\u0016\u0000\u0000vx\u0005\u0004\u0000\u0000"+
		"wo\u0001\u0000\u0000\u0000wr\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000x\u0011\u0001\u0000\u0000\u0000yz\u0005\u0015\u0000\u0000z{\u0005"+
		"\u0006\u0000\u0000{|\u0003\u0014\n\u0000|}\u0005\u0007\u0000\u0000}~\u0003"+
		"\u0006\u0003\u0000~\u0013\u0001\u0000\u0000\u0000\u007f\u0080\u0005 \u0000"+
		"\u0000\u0080\u0015\u0001\u0000\u0000\u0000\u0081\u0082\u0003\u001a\r\u0000"+
		"\u0082\u0083\u0003\u0018\f\u0000\u0083\u0017\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005\r\u0000\u0000\u0085\u0086\u0003\u001a\r\u0000\u0086\u0087"+
		"\u0003\u0018\f\u0000\u0087\u008e\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		"\u0010\u0000\u0000\u0089\u008a\u0003\u001a\r\u0000\u008a\u008b\u0003\u0018"+
		"\f\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000"+
		"\u0000\u008d\u0084\u0001\u0000\u0000\u0000\u008d\u0088\u0001\u0000\u0000"+
		"\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0019\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0003\u001e\u000f\u0000\u0090\u0091\u0003\u001c\u000e"+
		"\u0000\u0091\u001b\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u000e\u0000"+
		"\u0000\u0093\u0094\u0003\u001e\u000f\u0000\u0094\u0095\u0003\u001c\u000e"+
		"\u0000\u0095\u00a0\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u000f\u0000"+
		"\u0000\u0097\u0098\u0003\u001e\u000f\u0000\u0098\u0099\u0003\u001c\u000e"+
		"\u0000\u0099\u00a0\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u0011\u0000"+
		"\u0000\u009b\u009c\u0003\u001e\u000f\u0000\u009c\u009d\u0003\u001c\u000e"+
		"\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000"+
		"\u0000\u009f\u0092\u0001\u0000\u0000\u0000\u009f\u0096\u0001\u0000\u0000"+
		"\u0000\u009f\u009a\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u001d\u0001\u0000\u0000\u0000\u00a1\u00a8\u0005\u0003\u0000"+
		"\u0000\u00a2\u00a8\u0005 \u0000\u0000\u00a3\u00a4\u0005\u0006\u0000\u0000"+
		"\u00a4\u00a5\u0003\u0016\u000b\u0000\u00a5\u00a6\u0005\u0007\u0000\u0000"+
		"\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a2\u0001\u0000\u0000\u0000\u00a7\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a8\u001f\u0001\u0000\u0000\u0000\b\'1>mw\u008d\u009f\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}