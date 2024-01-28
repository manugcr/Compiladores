// Generated from /home/manu/facultad/compiladores/Compiladores/proyectobase/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1

    package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladoresParser}.
 */
public interface compiladoresListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(compiladoresParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(compiladoresParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(compiladoresParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(compiladoresParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(compiladoresParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(compiladoresParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#block_of_code}.
	 * @param ctx the parse tree
	 */
	void enterBlock_of_code(compiladoresParser.Block_of_codeContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#block_of_code}.
	 * @param ctx the parse tree
	 */
	void exitBlock_of_code(compiladoresParser.Block_of_codeContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(compiladoresParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(compiladoresParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(compiladoresParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(compiladoresParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#statement_with_assign}.
	 * @param ctx the parse tree
	 */
	void enterStatement_with_assign(compiladoresParser.Statement_with_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#statement_with_assign}.
	 * @param ctx the parse tree
	 */
	void exitStatement_with_assign(compiladoresParser.Statement_with_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#assignments}.
	 * @param ctx the parse tree
	 */
	void enterAssignments(compiladoresParser.AssignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#assignments}.
	 * @param ctx the parse tree
	 */
	void exitAssignments(compiladoresParser.AssignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(compiladoresParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(compiladoresParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#logical_arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_arithmetic_expression(compiladoresParser.Logical_arithmetic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#logical_arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_arithmetic_expression(compiladoresParser.Logical_arithmetic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(compiladoresParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(compiladoresParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expression(compiladoresParser.Arithmetic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expression(compiladoresParser.Arithmetic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#a_term}.
	 * @param ctx the parse tree
	 */
	void enterA_term(compiladoresParser.A_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#a_term}.
	 * @param ctx the parse tree
	 */
	void exitA_term(compiladoresParser.A_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#at}.
	 * @param ctx the parse tree
	 */
	void enterAt(compiladoresParser.AtContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#at}.
	 * @param ctx the parse tree
	 */
	void exitAt(compiladoresParser.AtContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#af}.
	 * @param ctx the parse tree
	 */
	void enterAf(compiladoresParser.AfContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#af}.
	 * @param ctx the parse tree
	 */
	void exitAf(compiladoresParser.AfContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#inc_dec}.
	 * @param ctx the parse tree
	 */
	void enterInc_dec(compiladoresParser.Inc_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#inc_dec}.
	 * @param ctx the parse tree
	 */
	void exitInc_dec(compiladoresParser.Inc_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(compiladoresParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(compiladoresParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(compiladoresParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(compiladoresParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElse_stmt(compiladoresParser.Else_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElse_stmt(compiladoresParser.Else_stmtContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(compiladoresParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(compiladoresParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#for_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFor_declaration(compiladoresParser.For_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#for_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFor_declaration(compiladoresParser.For_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#for_condition}.
	 * @param ctx the parse tree
	 */
	void enterFor_condition(compiladoresParser.For_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#for_condition}.
	 * @param ctx the parse tree
	 */
	void exitFor_condition(compiladoresParser.For_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#for_update}.
	 * @param ctx the parse tree
	 */
	void enterFor_update(compiladoresParser.For_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#for_update}.
	 * @param ctx the parse tree
	 */
	void exitFor_update(compiladoresParser.For_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunction_stmt(compiladoresParser.Function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunction_stmt(compiladoresParser.Function_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(compiladoresParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(compiladoresParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#parameters_list}.
	 * @param ctx the parse tree
	 */
	void enterParameters_list(compiladoresParser.Parameters_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#parameters_list}.
	 * @param ctx the parse tree
	 */
	void exitParameters_list(compiladoresParser.Parameters_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#function_prototype}.
	 * @param ctx the parse tree
	 */
	void enterFunction_prototype(compiladoresParser.Function_prototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#function_prototype}.
	 * @param ctx the parse tree
	 */
	void exitFunction_prototype(compiladoresParser.Function_prototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#parameters_prototype}.
	 * @param ctx the parse tree
	 */
	void enterParameters_prototype(compiladoresParser.Parameters_prototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#parameters_prototype}.
	 * @param ctx the parse tree
	 */
	void exitParameters_prototype(compiladoresParser.Parameters_prototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(compiladoresParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(compiladoresParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#call_parameters_list}.
	 * @param ctx the parse tree
	 */
	void enterCall_parameters_list(compiladoresParser.Call_parameters_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#call_parameters_list}.
	 * @param ctx the parse tree
	 */
	void exitCall_parameters_list(compiladoresParser.Call_parameters_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#call_parameter}.
	 * @param ctx the parse tree
	 */
	void enterCall_parameter(compiladoresParser.Call_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#call_parameter}.
	 * @param ctx the parse tree
	 */
	void exitCall_parameter(compiladoresParser.Call_parameterContext ctx);
}