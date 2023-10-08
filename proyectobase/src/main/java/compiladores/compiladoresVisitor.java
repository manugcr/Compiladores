// Generated from /home/manu/facultad/compiladores/Compiladores/proyectobase/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1

package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compiladoresParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compiladoresVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#definicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion(compiladoresParser.DefinicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#lista_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_var(compiladoresParser.Lista_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(compiladoresParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(compiladoresParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(compiladoresParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(compiladoresParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#opal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpal(compiladoresParser.OpalContext ctx);
}