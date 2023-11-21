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
	 * Enter a parse tree produced by {@link compiladoresParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(compiladoresParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(compiladoresParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(compiladoresParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(compiladoresParser.ListContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(compiladoresParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(compiladoresParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#term_aux}.
	 * @param ctx the parse tree
	 */
	void enterTerm_aux(compiladoresParser.Term_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#term_aux}.
	 * @param ctx the parse tree
	 */
	void exitTerm_aux(compiladoresParser.Term_auxContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#factor_aux}.
	 * @param ctx the parse tree
	 */
	void enterFactor_aux(compiladoresParser.Factor_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#factor_aux}.
	 * @param ctx the parse tree
	 */
	void exitFactor_aux(compiladoresParser.Factor_auxContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(compiladoresParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(compiladoresParser.ComparisonContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(compiladoresParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(compiladoresParser.Parameter_listContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(compiladoresParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(compiladoresParser.Argument_listContext ctx);
}