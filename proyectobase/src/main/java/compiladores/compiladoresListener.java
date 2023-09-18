// Generated from /home/manu/facultad/compiladores/Compiladores/proyectobase/src/main/java/compiladores/compiladores.g4 by ANTLR 4.9.2

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
	 * Enter a parse tree produced by {@link compiladoresParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(compiladoresParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(compiladoresParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#logica}.
	 * @param ctx the parse tree
	 */
	void enterLogica(compiladoresParser.LogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#logica}.
	 * @param ctx the parse tree
	 */
	void exitLogica(compiladoresParser.LogicaContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#principal}.
	 * @param ctx the parse tree
	 */
	void enterPrincipal(compiladoresParser.PrincipalContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#principal}.
	 * @param ctx the parse tree
	 */
	void exitPrincipal(compiladoresParser.PrincipalContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#incremento}.
	 * @param ctx the parse tree
	 */
	void enterIncremento(compiladoresParser.IncrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#incremento}.
	 * @param ctx the parse tree
	 */
	void exitIncremento(compiladoresParser.IncrementoContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#ireturn}.
	 * @param ctx the parse tree
	 */
	void enterIreturn(compiladoresParser.IreturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#ireturn}.
	 * @param ctx the parse tree
	 */
	void exitIreturn(compiladoresParser.IreturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#inst_if}.
	 * @param ctx the parse tree
	 */
	void enterInst_if(compiladoresParser.Inst_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#inst_if}.
	 * @param ctx the parse tree
	 */
	void exitInst_if(compiladoresParser.Inst_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#inst_for}.
	 * @param ctx the parse tree
	 */
	void enterInst_for(compiladoresParser.Inst_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#inst_for}.
	 * @param ctx the parse tree
	 */
	void exitInst_for(compiladoresParser.Inst_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#inst_while}.
	 * @param ctx the parse tree
	 */
	void enterInst_while(compiladoresParser.Inst_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#inst_while}.
	 * @param ctx the parse tree
	 */
	void exitInst_while(compiladoresParser.Inst_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#inst_else}.
	 * @param ctx the parse tree
	 */
	void enterInst_else(compiladoresParser.Inst_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#inst_else}.
	 * @param ctx the parse tree
	 */
	void exitInst_else(compiladoresParser.Inst_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#llamada_func}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_func(compiladoresParser.Llamada_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#llamada_func}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_func(compiladoresParser.Llamada_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(compiladoresParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(compiladoresParser.ComparacionContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(compiladoresParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(compiladoresParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(compiladoresParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(compiladoresParser.TContext ctx);
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
}