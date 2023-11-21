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
	 * Visit a parse tree produced by {@link compiladoresParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(compiladoresParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(compiladoresParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(compiladoresParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#block_of_code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_of_code(compiladoresParser.Block_of_codeContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(compiladoresParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(compiladoresParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(compiladoresParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(compiladoresParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(compiladoresParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#term_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_aux(compiladoresParser.Term_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(compiladoresParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#factor_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_aux(compiladoresParser.Factor_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(compiladoresParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(compiladoresParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(compiladoresParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(compiladoresParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(compiladoresParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(compiladoresParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#else_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_stmt(compiladoresParser.Else_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#inc_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc_dec(compiladoresParser.Inc_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_stmt(compiladoresParser.Function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(compiladoresParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(compiladoresParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(compiladoresParser.Argument_listContext ctx);
}