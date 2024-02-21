/*
 * A visitor class that walks through the parse tree and generates the intermediate code.
 * 
 * 
 */


package compiladores;

import java.util.LinkedList;
import java.io.FileWriter;
import java.io.File;

import compiladores.compiladoresParser.A_termContext;
import compiladores.compiladoresParser.AfContext;
import compiladores.compiladoresParser.Arithmetic_expressionContext;
import compiladores.compiladoresParser.AssignmentContext;
import compiladores.compiladoresParser.AssignmentsContext;
import compiladores.compiladoresParser.AtContext;
import compiladores.compiladoresParser.Else_stmtContext;
import compiladores.compiladoresParser.FactorContext;
import compiladores.compiladoresParser.Function_callContext;
import compiladores.compiladoresParser.Function_declarationContext;
import compiladores.compiladoresParser.Function_stmtContext;
import compiladores.compiladoresParser.If_stmtContext;
import compiladores.compiladoresParser.Inc_decContext;
import compiladores.compiladoresParser.InstructionContext;
import compiladores.compiladoresParser.InstructionsContext;
import compiladores.compiladoresParser.LogicContext;
import compiladores.compiladoresParser.Logical_arithmetic_expressionContext;
import compiladores.compiladoresParser.ProgramContext;
import compiladores.compiladoresParser.Return_stmtContext;
import compiladores.compiladoresParser.StatementContext;
import compiladores.compiladoresParser.Statement_with_assignContext;
import compiladores.compiladoresParser.StatementsContext;
import compiladores.compiladoresParser.While_stmtContext;

public class Visitor extends compiladoresBaseVisitor<String> {

    private VariableGenerator variableGenerator;
    private LabelGenerator labelGenerator;
    private LinkedList<String> operands;
    private String TAC = "";
    private String exitElseLabel = "";
    private String filePath = "./intermediateCode.txt";

    public Visitor() {
        
        this.variableGenerator = VariableGenerator.getInstanceOf();
        this.labelGenerator = LabelGenerator.getInstanceOf();
        this.operands = new LinkedList<String>();
        this.TAC = "";
    }

    // Here begins the tree, the root of the program.
    // A program is a sequence of instructions until we reach the end.
    @Override
    public String visitProgram(ProgramContext ctx) {
        
        System.out.println("\n ----------- Visitor begins ------------\n");
        
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        }

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(TAC);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\n ----------- Visitor ends --------------\n");
        
        return TAC;
    }


    // Walk through the instructions of the program. An instruction is a sequence of instructions.
    // Allowed instructions are declared in the grammar file.
    @Override
    public String visitInstructions(InstructionsContext ctx) {
        
        visitChildren(ctx);
        return TAC;
    }

    @Override
    public String visitInstruction(InstructionContext ctx) {
        
        visitChildren(ctx);
        return TAC;
    }

   


    // Enter a logical arithmetic expression node, that is a node that contains a logical expression
    @Override
    public String visitLogical_arithmetic_expression(Logical_arithmetic_expressionContext ctx) {
        
        visitChildren(ctx);
        return TAC;
    }

    @Override
    public String visitLogic(LogicContext ctx) {
        
        // TO DO parse through the logical expression

        return super.visitLogic(ctx);
    }



    
    // Enter the arithmetic expression node, who has only one children with recursion.
    @Override
    public String visitArithmetic_expression(Arithmetic_expressionContext ctx) {
        
        visitChildren(ctx);
        return TAC;
    }

    @Override
    public String visitA_term(A_termContext ctx) {
        
        visitChildren(ctx);
        return TAC;
    }

    @Override
    public String visitFactor(FactorContext ctx) {
        
        // TO DO parse through the factor

        return super.visitFactor(ctx);
    }

    @Override
    public String visitAf(AfContext ctx) {
        
        // TO DO parse through the af

        return super.visitAf(ctx);
    }

    @Override
    public String visitAt(AtContext ctx) {
        
        // TO DO parse through the at

        return super.visitAt(ctx);
    }        
    
    


    // Enter the assignments node, an assignment is a sequence of assignments.
    @Override
    public String visitAssignments(AssignmentsContext ctx) {
        
        visitChildren(ctx);
        return TAC;
    }
    
    @Override
    public String visitAssignment(AssignmentContext ctx) {
        
        // TO DO parse through the assignment

        return super.visitAssignment(ctx);
    }




    // Enter the statements node, a statements has different types of statements.
    @Override
    public String visitStatement(StatementContext ctx) {
        
        visitChildren(ctx);
        return TAC;
    }

    @Override
    public String visitStatements(StatementsContext ctx) {
        
        visitStatements(ctx.statements());
        return TAC;
    }

    @Override
    public String visitStatement_with_assign(Statement_with_assignContext ctx) {
        
        // TO DO parse through the statement with assignment

        return super.visitStatement_with_assign(ctx);
    }



    // Enter the return statement node, who has a logical arithmetic expression as a child.
    // We should obtain the value of the expression and push it to the stack.
    @Override
    public String visitReturn_stmt(Return_stmtContext ctx) {
        
        visitLogical_arithmetic_expression(ctx.logical_arithmetic_expression());

        String returnValue = operands.pop();

        TAC += "\npush " + returnValue;
        
        return TAC;
    }
    



    // A while statement is a node that contains a logical arithmetic expression and a instruction.
    // 1. We should first declare the entry label where we are gonna jump if the condition is true.
    // 2. We get the logical arithmetic expression that tests the condition.
    // 3. Then we should declare the exit label where we are gonna jump if the condition is false.
    @Override
    public String visitWhile_stmt(While_stmtContext ctx) {
        
        String entryLabel = labelGenerator.getNewLabel("whileEntry");
        TAC += "\n" + entryLabel + ":";

        visitLogical_arithmetic_expression(ctx.logical_arithmetic_expression());
        String condition = operands.pop();
        TAC += "\njnz" + condition;

        String exitLabel = labelGenerator.getNewLabel("whileExit");
        TAC += "\njmp" + exitLabel;

        visitInstruction(ctx.instruction());

        TAC += "\njmp " + entryLabel;
        TAC += "\n" + exitLabel + ":";

        return TAC;
    }




    // Enter the if statement node, who has a logical arithmetic expression, an instruction and condition
    // 1. Get the logical arithmetic expression that tests the condition.
    // 2. Then we should declare the exit label where we are gonna jump if the condition is false.
    // 3. We should declare the exit label for the else statement.
    // 4. We should declare the exit label for the else if statement.
    @Override
    public String visitIf_stmt(If_stmtContext ctx) {
            
        visitLogical_arithmetic_expression(ctx.logical_arithmetic_expression());
        String condition = operands.pop();
        TAC += "\njnz" + condition;

        String exitLabel = labelGenerator.getNewLabel("ifExit");
        TAC += "\njmp" + exitLabel;

        visitInstruction(ctx.instruction());

        String exitElseIfLabel = labelGenerator.getNewLabel("elseIfExit");


        visitElse_stmt(ctx.else_stmt());

        TAC += "\n" + exitElseIfLabel + ":";

        return TAC;
    }

    @Override
    public String visitElse_stmt(Else_stmtContext ctx) {
        
        if (ctx.logical_arithmetic_expression() != null) {

            visitLogical_arithmetic_expression(ctx.logical_arithmetic_expression());
            String condition = operands.pop();
            TAC += "\njnz" + condition;

            String exitIfLabel = labelGenerator.getNewLabel("ifExit");
            TAC += "\njmp" + exitIfLabel;

            visitInstruction(ctx.instruction());

            TAC += "\njmp " + exitElseLabel;
            TAC += "\n" + exitIfLabel + ":";

            visitElse_stmt(ctx.else_stmt());
        }
        else {
            visitInstruction(ctx.instruction());
        }

        return TAC;
    }
















    // Enter the inc_dec node, who has only one children with recursion.
    @Override
    public String visitInc_dec(Inc_decContext ctx) {
        // TODO Auto-generated method stub
        return super.visitInc_dec(ctx);
    }

    @Override
    public String visitFunction_call(Function_callContext ctx) {
        // TODO Auto-generated method stub
        return super.visitFunction_call(ctx);
    }

    @Override
    public String visitFunction_declaration(Function_declarationContext ctx) {
        // TODO Auto-generated method stub
        return super.visitFunction_declaration(ctx);
    }

    @Override
    public String visitFunction_stmt(Function_stmtContext ctx) {
        // TODO Auto-generated method stub
        return super.visitFunction_stmt(ctx);
    }
    
}
