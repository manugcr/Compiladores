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
	 * Visit a parse tree produced by {@link compiladoresParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(compiladoresParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#statement_with_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_with_assign(compiladoresParser.Statement_with_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignments(compiladoresParser.AssignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(compiladoresParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#logical_arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_arithmetic_expression(compiladoresParser.Logical_arithmetic_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(compiladoresParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_expression(compiladoresParser.Arithmetic_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#a_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_term(compiladoresParser.A_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#at}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAt(compiladoresParser.AtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#af}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAf(compiladoresParser.AfContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#inc_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc_dec(compiladoresParser.Inc_decContext ctx);
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
	 * Visit a parse tree produced by {@link compiladoresParser#for_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_declaration(compiladoresParser.For_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#for_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_condition(compiladoresParser.For_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#for_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update(compiladoresParser.For_updateContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_stmt(compiladoresParser.Function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(compiladoresParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(compiladoresParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#function_prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_prototype(compiladoresParser.Function_prototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#parameters_prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_prototype(compiladoresParser.Parameters_prototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(compiladoresParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#call_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_list(compiladoresParser.Call_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#call_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_parameter(compiladoresParser.Call_parameterContext ctx);
}