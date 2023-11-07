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
		PA=1, PC=2, EQ=3, PYC=4, LLA=5, LLC=6, COMA=7, MAS=8, MENOS=9, MULT=10, 
		DIV=11, MOD=12, WHILE=13, TDATO=14, NUMERO=15, ID=16, WS=17, OTRO=18;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_declaracion = 3, 
		RULE_definicion = 4, RULE_lista_var = 5, RULE_asignacion = 6, RULE_while_stmt = 7, 
		RULE_expresion = 8, RULE_exp = 9, RULE_termino = 10, RULE_term = 11, RULE_factor = 12, 
		RULE_opal = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "instruccion", "declaracion", "definicion", 
			"lista_var", "asignacion", "while_stmt", "expresion", "exp", "termino", 
			"term", "factor", "opal"
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
			setState(28);
			instrucciones();
			setState(29);
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
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LLA:
			case WHILE:
			case TDATO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				instruccion();
				setState(32);
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
	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public TerminalNode LLA() { return getToken(compiladoresParser.LLA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLC() { return getToken(compiladoresParser.LLC, 0); }
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
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TDATO:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				declaracion();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				asignacion();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				while_stmt();
				}
				break;
			case LLA:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				match(LLA);
				setState(41);
				instrucciones();
				setState(42);
				match(LLC);
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
	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode TDATO() { return getToken(compiladoresParser.TDATO, 0); }
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public DefinicionContext definicion() {
			return getRuleContext(DefinicionContext.class,0);
		}
		public Lista_varContext lista_var() {
			return getRuleContext(Lista_varContext.class,0);
		}
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
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
		enterRule(_localctx, 6, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(TDATO);
			setState(47);
			match(ID);
			setState(48);
			definicion();
			setState(49);
			lista_var();
			setState(50);
			match(PYC);
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
	public static class DefinicionContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(compiladoresParser.EQ, 0); }
		public TerminalNode NUMERO() { return getToken(compiladoresParser.NUMERO, 0); }
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterDefinicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitDefinicion(this);
		}
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_definicion);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(EQ);
				setState(53);
				match(NUMERO);
				}
				break;
			case PYC:
			case COMA:
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
	public static class Lista_varContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(compiladoresParser.COMA, 0); }
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public DefinicionContext definicion() {
			return getRuleContext(DefinicionContext.class,0);
		}
		public Lista_varContext lista_var() {
			return getRuleContext(Lista_varContext.class,0);
		}
		public Lista_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterLista_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitLista_var(this);
		}
	}

	public final Lista_varContext lista_var() throws RecognitionException {
		Lista_varContext _localctx = new Lista_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lista_var);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(COMA);
				setState(58);
				match(ID);
				setState(59);
				definicion();
				setState(60);
				lista_var();
				}
				break;
			case PYC:
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
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode EQ() { return getToken(compiladoresParser.EQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
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
		enterRule(_localctx, 12, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(ID);
			setState(66);
			match(EQ);
			setState(67);
			expresion();
			setState(68);
			match(PYC);
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
	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(compiladoresParser.WHILE, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(WHILE);
			setState(71);
			match(PA);
			setState(72);
			opal();
			setState(73);
			match(PC);
			setState(74);
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
		enterRule(_localctx, 16, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			termino();
			setState(77);
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
		public TerminalNode MAS() { return getToken(compiladoresParser.MAS, 0); }
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode MENOS() { return getToken(compiladoresParser.MENOS, 0); }
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
		enterRule(_localctx, 18, RULE_exp);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(MAS);
				setState(80);
				termino();
				setState(81);
				exp();
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(MENOS);
				setState(84);
				termino();
				setState(85);
				exp();
				}
				break;
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
		enterRule(_localctx, 20, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			factor();
			setState(91);
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
		public TerminalNode DIV() { return getToken(compiladoresParser.DIV, 0); }
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
		enterRule(_localctx, 22, RULE_term);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(MULT);
				setState(94);
				factor();
				setState(95);
				term();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(DIV);
				setState(98);
				factor();
				setState(99);
				term();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(MOD);
				setState(102);
				factor();
				setState(103);
				term();
				}
				break;
			case PC:
			case PYC:
			case MAS:
			case MENOS:
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
		enterRule(_localctx, 24, RULE_factor);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(NUMERO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(ID);
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(PA);
				setState(111);
				expresion();
				setState(112);
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
		enterRule(_localctx, 26, RULE_opal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0012w\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001$\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002-\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"8\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005@\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tY\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000bk\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\fs\b\f\u0001\r\u0001\r\u0001\r\u0000"+
		"\u0000\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u0000\u0000u\u0000\u001c\u0001\u0000\u0000\u0000\u0002#\u0001"+
		"\u0000\u0000\u0000\u0004,\u0001\u0000\u0000\u0000\u0006.\u0001\u0000\u0000"+
		"\u0000\b7\u0001\u0000\u0000\u0000\n?\u0001\u0000\u0000\u0000\fA\u0001"+
		"\u0000\u0000\u0000\u000eF\u0001\u0000\u0000\u0000\u0010L\u0001\u0000\u0000"+
		"\u0000\u0012X\u0001\u0000\u0000\u0000\u0014Z\u0001\u0000\u0000\u0000\u0016"+
		"j\u0001\u0000\u0000\u0000\u0018r\u0001\u0000\u0000\u0000\u001at\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0003\u0002\u0001\u0000\u001d\u001e\u0005"+
		"\u0000\u0000\u0001\u001e\u0001\u0001\u0000\u0000\u0000\u001f \u0003\u0004"+
		"\u0002\u0000 !\u0003\u0002\u0001\u0000!$\u0001\u0000\u0000\u0000\"$\u0001"+
		"\u0000\u0000\u0000#\u001f\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000"+
		"\u0000$\u0003\u0001\u0000\u0000\u0000%-\u0003\u0006\u0003\u0000&-\u0003"+
		"\f\u0006\u0000\'-\u0003\u000e\u0007\u0000()\u0005\u0005\u0000\u0000)*"+
		"\u0003\u0002\u0001\u0000*+\u0005\u0006\u0000\u0000+-\u0001\u0000\u0000"+
		"\u0000,%\u0001\u0000\u0000\u0000,&\u0001\u0000\u0000\u0000,\'\u0001\u0000"+
		"\u0000\u0000,(\u0001\u0000\u0000\u0000-\u0005\u0001\u0000\u0000\u0000"+
		"./\u0005\u000e\u0000\u0000/0\u0005\u0010\u0000\u000001\u0003\b\u0004\u0000"+
		"12\u0003\n\u0005\u000023\u0005\u0004\u0000\u00003\u0007\u0001\u0000\u0000"+
		"\u000045\u0005\u0003\u0000\u000058\u0005\u000f\u0000\u000068\u0001\u0000"+
		"\u0000\u000074\u0001\u0000\u0000\u000076\u0001\u0000\u0000\u00008\t\u0001"+
		"\u0000\u0000\u00009:\u0005\u0007\u0000\u0000:;\u0005\u0010\u0000\u0000"+
		";<\u0003\b\u0004\u0000<=\u0003\n\u0005\u0000=@\u0001\u0000\u0000\u0000"+
		">@\u0001\u0000\u0000\u0000?9\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000"+
		"\u0000@\u000b\u0001\u0000\u0000\u0000AB\u0005\u0010\u0000\u0000BC\u0005"+
		"\u0003\u0000\u0000CD\u0003\u0010\b\u0000DE\u0005\u0004\u0000\u0000E\r"+
		"\u0001\u0000\u0000\u0000FG\u0005\r\u0000\u0000GH\u0005\u0001\u0000\u0000"+
		"HI\u0003\u001a\r\u0000IJ\u0005\u0002\u0000\u0000JK\u0003\u0004\u0002\u0000"+
		"K\u000f\u0001\u0000\u0000\u0000LM\u0003\u0014\n\u0000MN\u0003\u0012\t"+
		"\u0000N\u0011\u0001\u0000\u0000\u0000OP\u0005\b\u0000\u0000PQ\u0003\u0014"+
		"\n\u0000QR\u0003\u0012\t\u0000RY\u0001\u0000\u0000\u0000ST\u0005\t\u0000"+
		"\u0000TU\u0003\u0014\n\u0000UV\u0003\u0012\t\u0000VY\u0001\u0000\u0000"+
		"\u0000WY\u0001\u0000\u0000\u0000XO\u0001\u0000\u0000\u0000XS\u0001\u0000"+
		"\u0000\u0000XW\u0001\u0000\u0000\u0000Y\u0013\u0001\u0000\u0000\u0000"+
		"Z[\u0003\u0018\f\u0000[\\\u0003\u0016\u000b\u0000\\\u0015\u0001\u0000"+
		"\u0000\u0000]^\u0005\n\u0000\u0000^_\u0003\u0018\f\u0000_`\u0003\u0016"+
		"\u000b\u0000`k\u0001\u0000\u0000\u0000ab\u0005\u000b\u0000\u0000bc\u0003"+
		"\u0018\f\u0000cd\u0003\u0016\u000b\u0000dk\u0001\u0000\u0000\u0000ef\u0005"+
		"\f\u0000\u0000fg\u0003\u0018\f\u0000gh\u0003\u0016\u000b\u0000hk\u0001"+
		"\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000j]\u0001\u0000\u0000\u0000"+
		"ja\u0001\u0000\u0000\u0000je\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000"+
		"\u0000k\u0017\u0001\u0000\u0000\u0000ls\u0005\u000f\u0000\u0000ms\u0005"+
		"\u0010\u0000\u0000no\u0005\u0001\u0000\u0000op\u0003\u0010\b\u0000pq\u0005"+
		"\u0002\u0000\u0000qs\u0001\u0000\u0000\u0000rl\u0001\u0000\u0000\u0000"+
		"rm\u0001\u0000\u0000\u0000rn\u0001\u0000\u0000\u0000s\u0019\u0001\u0000"+
		"\u0000\u0000tu\u0005\u0010\u0000\u0000u\u001b\u0001\u0000\u0000\u0000"+
		"\u0007#,7?Xjr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}