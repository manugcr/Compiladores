// Generated from /home/manu/facultad/compiladores/Compiladores/proyectobase/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1

package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladoresParser}.
 */
public interface compiladoresListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#definicion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion(compiladoresParser.DefinicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#definicion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion(compiladoresParser.DefinicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#lista_var}.
	 * @param ctx the parse tree
	 */
	void enterLista_var(compiladoresParser.Lista_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#lista_var}.
	 * @param ctx the parse tree
	 */
	void exitLista_var(compiladoresParser.Lista_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(compiladoresParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(compiladoresParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(compiladoresParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(compiladoresParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(compiladoresParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(compiladoresParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(compiladoresParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(compiladoresParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#opal}.
	 * @param ctx the parse tree
	 */
	void enterOpal(compiladoresParser.OpalContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#opal}.
	 * @param ctx the parse tree
	 */
	void exitOpal(compiladoresParser.OpalContext ctx);
}