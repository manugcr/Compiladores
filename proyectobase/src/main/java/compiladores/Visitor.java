/*
 * A visitor class that walks through the parse tree and generates the intermediate code.
 * We look for tree nodes that are of interest to us and generate the intermediate code.
 */


package compiladores;

import java.util.LinkedList;
import java.io.FileWriter;
import java.io.File;

import compiladores.compiladoresParser.AfContext;
import compiladores.compiladoresParser.AtContext;
import compiladores.compiladoresParser.LogicContext;
import compiladores.compiladoresParser.A_termContext;
import compiladores.compiladoresParser.FactorContext;
import compiladores.compiladoresParser.If_stmtContext;
import compiladores.compiladoresParser.ProgramContext;
import compiladores.compiladoresParser.Inc_decContext;
import compiladores.compiladoresParser.For_stmtContext;
import compiladores.compiladoresParser.Else_stmtContext;
import compiladores.compiladoresParser.StatementContext;
import compiladores.compiladoresParser.AssignmentContext;
import compiladores.compiladoresParser.StatementsContext;
import compiladores.compiladoresParser.While_stmtContext;
import compiladores.compiladoresParser.For_updateContext;
import compiladores.compiladoresParser.InstructionContext;
import compiladores.compiladoresParser.Return_stmtContext;
import compiladores.compiladoresParser.AssignmentsContext;
import compiladores.compiladoresParser.InstructionsContext;
import compiladores.compiladoresParser.Function_callContext;
import compiladores.compiladoresParser.For_conditionContext;
import compiladores.compiladoresParser.Function_stmtContext;
import compiladores.compiladoresParser.Call_parameterContext;
import compiladores.compiladoresParser.Parameters_listContext;
import compiladores.compiladoresParser.For_declarationContext;
import compiladores.compiladoresParser.Function_declarationContext;
import compiladores.compiladoresParser.Statement_with_assignContext;
import compiladores.compiladoresParser.Arithmetic_expressionContext;
import compiladores.compiladoresParser.Logical_arithmetic_expressionContext;

public class Visitor extends compiladoresBaseVisitor<String> {

    private VariableGenerator variableGenerator;
    private LabelGenerator labelGenerator;
    private LinkedList<String> operands;
    private String TAC = "";
    private String exitElseLabel = "";
    private int preOrPost;
    private String instruction;
    private String returnLabel;
    private String filePath = "./output/intermediateCode.txt";

    public Visitor() {
        this.variableGenerator = VariableGenerator.getInstanceOf();
        this.labelGenerator = LabelGenerator.getInstanceOf();
        this.operands = new LinkedList<String>();
        this.TAC = "";
        this.instruction = "";
        this.preOrPost = 0;
        this.returnLabel = "";
        this.exitElseLabel = "";
    }

    /*
     * Here begins the tree, the root of the program.
     * A program is a sequence of instructions until we reach the end.
     */
    @Override
    public String visitProgram(ProgramContext ctx) {
        
        System.out.println("\n ----------- Visitor begins ------------\n");
        System.out.println("visitProgram()");
        
        visitChildren(ctx);

        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        }

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(TAC);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Intermediate code has been generated and saved in " + filePath);
        System.out.println("\n ----------- Visitor ends --------------\n\n");
        
        return TAC;
    }




    /*
     * Walk through the instructions of the program. An instruction is a sequence of instructions.
     * Allowed instructions are declared in the grammar file.
     * 
     *  instructions    : instruction instructions
     *                  |
     *                  ;
     * 
     *  instruction : block_of_code
     *              | statement 
     *              | assignments SEMICOLON 
     *              | return_stmt
     *              | if_stmt
     *              | while_stmt
     *              | for_stmt
     *              | function_call SEMICOLON
     *              | logical_arithmetic_expression SEMICOLON
     *              | function_stmt 
     *              ;
     */
    @Override
    public String visitInstructions(InstructionsContext ctx) {
        visitChildren(ctx);
        return TAC;
    }

    @Override
    public String visitInstruction(InstructionContext ctx) {
        System.out.println("visitInstruction()");
        visitChildren(ctx);
        return TAC;
    }

   


    /*
     * Everytime we call a function, we need to push the parameters to the stack.
     * 
     *   call_parameters_list   : call_parameter
     *                          | call_parameter COMMA call_parameters_list
     *                          |
     *                          ;
     *
     *   call_parameter : NUMBER
     *                  | ID
     *                  | inc_dec
     *                  | function_call
     *                  | logical_arithmetic_expression
     *                  ;
     */
    @Override
    public String visitCall_parameter(Call_parameterContext ctx) {
        System.out.println("visitCall_parameter()");
        if(ctx.NUMBER() != null) {
            TAC += "\npush " + ctx.NUMBER().getText();
        }
        else if(ctx.ID() != null) {
            TAC += "\npush " + ctx.ID().getText();
        }
        else if(ctx.logical_arithmetic_expression() != null) {
            visitLogical_arithmetic_expression(ctx.logical_arithmetic_expression());
            TAC += "\npush " + operands.pop();
        }
        else if(ctx.function_call() != null) {
            visitFunction_call(ctx.function_call());
            TAC += "\npush " + operands.pop();
        }
        return TAC;
    }

    @Override
    public String visitParameters_list(Parameters_listContext ctx) {
        System.out.println("visitParameters_list()");
        visitChildren(ctx);
        TAC += "\npop " + ctx.ID().getText();
        return TAC;
    }




    /*
     * Enter a logical arithmetic expression node, that is a node that contains a logical expression.
     * 
     *  logical_arithmetic_expression   : logic
     *                                  ;
     * 
     *  logic   : logic AND logic
     *          | logic OR logic
     *          | arithmetic_expression CMP arithmetic_expression
     *          | arithmetic_expression 
     *          ;
     */
    @Override
    public String visitLogical_arithmetic_expression(Logical_arithmetic_expressionContext ctx) {
        System.out.println("visitLogical_arithmetic_expression()");
        visitChildren(ctx);
        return TAC;
    }

    @Override
    public String visitLogic(LogicContext ctx) {
        System.out.println("visitLogic()");
        if(ctx.getChild(1) == null) { 
            visitArithmetic_expression(ctx.arithmetic_expression(0)); 

            String newVariable = variableGenerator.getNewVariable();
            
            if(preOrPost == 1)  {
                TAC += instruction;
            }
             
            TAC += "\n" + newVariable + " = " + operands.pop(); 
            
            if (preOrPost == 2) {
                TAC+= instruction;
            }

            preOrPost = 0;
            instruction = "";

            operands.push(newVariable); 
        }
        else {
            if(ctx.getChild(1).getText().equals("&&") || ctx.getChild(1).getText().equals("||")) {

                visitLogic(ctx.logic(0));
                visitLogic(ctx.logic(1));

                String newVariable = variableGenerator.getNewVariable();
                String firstOperand = operands.pop();
                String secondOperand = operands.pop();
                String operator = ctx.getChild(1).getText();

                TAC += "\n" + newVariable + " = " + firstOperand + operator + secondOperand;
                operands.push(newVariable);
            }

            else {

                visitArithmetic_expression(ctx.arithmetic_expression(0));
                visitArithmetic_expression(ctx.arithmetic_expression(1)); 

                String newVariable = variableGenerator.getNewVariable();
                String secondOperand = operands.pop();
                String firstOperand = operands.pop();

                TAC += "\n" + newVariable + " = " +  firstOperand + ctx.getChild(1).getText() + secondOperand;
                operands.push(newVariable); 
            }
        }

        return TAC;
    }



    
    /*
     * Enter the arithmetic expression node, who has only one children with recursion.
     * 
     *   arithmetic_expression  : a_term at
     *                          ;
     *
     *   a_term                 : factor af
     *                          ;
     *
     *   at                     : ADD a_term at
     *                          | SUB a_term at
     *                          |
     *                          ;
     *
     *   factor                 : NUMBER
     *                          | ID
     *                          | O_PAREN logical_arithmetic_expression C_PAREN
     *                          | inc_dec
     *                          | function_call
     *                          ;
     *
     *   af                     : MULT factor af
     *                          | DIV factor af
     *                          | MOD factor af
     *                          |
     *                          ;
     */
    @Override
    public String visitArithmetic_expression(Arithmetic_expressionContext ctx) {
        System.out.println("visitArithmetic_expression()");
        visitChildren(ctx);
        return TAC;
    }

    @Override
    public String visitA_term(A_termContext ctx) {
        System.out.println("visitA_term()");
        visitChildren(ctx);
        return TAC;
    }

    @Override
    public String visitFactor(FactorContext ctx) {
        System.out.println("visitFactor()");
        if (ctx.NUMBER() != null) {
            operands.push(ctx.NUMBER().getText());
        }
        else if (ctx.ID() != null) {
            operands.push(ctx.ID().getText());
        }
        else if (ctx.inc_dec() != null) {
            visitInc_dec(ctx.inc_dec());
        }
        else if (ctx.logical_arithmetic_expression() != null) {
            visitLogical_arithmetic_expression(ctx.logical_arithmetic_expression());
        }
        else if (ctx.function_call() != null) {
            visitFunction_call(ctx.function_call());
        }

        return TAC;
    }

    @Override
    public String visitAf(AfContext ctx) {
        System.out.println("visitAf()");
        String firstOperand;

        if(ctx.factor() != null) {
            firstOperand = operands.pop();
            visitFactor(ctx.factor());
        }
        else 
            return TAC;
        
        
        String secondOperand = operands.pop();
        String newVariable = variableGenerator.getNewVariable();
        String operator = ctx.getChild(0).getText();

        if(preOrPost == 1) TAC += instruction;
        TAC += "\n" + newVariable + " = " + firstOperand + operator + secondOperand; 
        if(preOrPost == 2) TAC+= instruction;

        preOrPost = 0;
        instruction = "";

        operands.push(newVariable);

        if(ctx.af().af() != null) {
            visitAf(ctx.af());
        }

        return TAC;
    }

    @Override
    public String visitAt(AtContext ctx) {
        System.out.println("visitAt()");
        String firstOperand;

        if(ctx.a_term() != null) {
            firstOperand = operands.pop();
            visitA_term(ctx.a_term());
        }
        else {
            return TAC;
        }
        
        String secondOperand = operands.pop();
        String newVariable = variableGenerator.getNewVariable();
        String operator = ctx.getChild(0).getText();


        if(preOrPost == 1) TAC += instruction;
        TAC += "\n" + newVariable + " = " + firstOperand + operator + secondOperand; 
        if(preOrPost == 2) TAC+= instruction;

      
        preOrPost = 0;
        instruction = "";
        

        operands.push(newVariable);

        if(ctx.at().at() != null)
            visitAt(ctx.at());

        return TAC;  
    }        
    
    


    /*
     * Enter the assignments node, an assignment is a sequence of assignments.
     * 
     *   assignments : assignment COMMA assignments
     *               | assignment
     *               ;
     *
     *   assignment  : ID EQUAL logical_arithmetic_expression 
     *               ;
     */
    @Override
    public String visitAssignments(AssignmentsContext ctx) {
        System.out.println("visitAssignments()");
        visitChildren(ctx);
        return TAC;
    }
    
    @Override
    public String visitAssignment(AssignmentContext ctx) {
        System.out.println("visitAssignment()");
        visitLogical_arithmetic_expression(ctx.logical_arithmetic_expression());

        String id = ctx.ID().getText();
        String value = operands.pop();

        TAC += "\n" + id + " = " + value;

        return TAC;
    }




    /*
     * Enter the statements node, a statements has different types of statements.
     * 
     *   statement              : TYPE statements SEMICOLON ;
     *
     *   statements             : ID COMMA statements   
     *                          | ID
     *                          | statement_with_assign COMMA statements
     *                          | statement_with_assign
     *                          ;
     *
     *   statement_with_assign  : ID EQUAL logical_arithmetic_expression
     *                          ;
     */
    @Override
    public String visitStatement(StatementContext ctx) {
        System.out.println("visitStatement()");
        visitStatements(ctx.statements());
        return TAC;
    }

    @Override
    public String visitStatements(StatementsContext ctx) {
        System.out.println("visitStatements()");
        visitChildren(ctx);
        return TAC;
    }

    @Override
    public String visitStatement_with_assign(Statement_with_assignContext ctx) {
        System.out.println("visitStatement_with_assign()");
        // The same as an assignment.

        visitLogical_arithmetic_expression(ctx.logical_arithmetic_expression());

        String id = ctx.ID().getText();
        String value = operands.pop();
        
        TAC += "\n" + id + " = " + value;

        return TAC;
    }




    /*
     * Enter the return statement node, who has a logical arithmetic expression as a child.
     * We should obtain the value of the expression and push it to the stack.
     * 
     *   return_stmt    : RETURN logical_arithmetic_expression SEMICOLON
     *                  ;
     */ 
    @Override
    public String visitReturn_stmt(Return_stmtContext ctx) {
        System.out.println("visitReturn_stmt()");
        visitLogical_arithmetic_expression(ctx.logical_arithmetic_expression());

        String returnValue = operands.pop();

        TAC += "\npush " + returnValue;
        
        return TAC;
    }
    



    /*  
     * A while statement is a node that contains a logical arithmetic expression and a instruction.
     * 1. We should first declare the entry label where we are gonna jump if the condition is true.
     * 2. We get the logical arithmetic expression that tests the condition.
     * 3. Then we should declare the exit label where we are gonna jump if the condition is false.
     * 
     *   while_stmt  : WHILE O_PAREN logical_arithmetic_expression C_PAREN (instruction | SEMICOLON) 
     *               ;
     */
    @Override
    public String visitWhile_stmt(While_stmtContext ctx) {
        System.out.println("visitWhile_stmt()");
        String entryLabel = labelGenerator.getNewLabel("lwhileEntry");
        TAC += "\n" + entryLabel + ":";

        visitLogical_arithmetic_expression(ctx.logical_arithmetic_expression());
        String condition = operands.pop();
        TAC += "\njnz " + condition;

        String exitLabel = labelGenerator.getNewLabel("lwhileExit");
        TAC += "\njmp " + exitLabel;

        visitInstruction(ctx.instruction());

        TAC += "\njmp " + entryLabel;
        TAC += "\n" + exitLabel + ":";

        return TAC;
    }




    /*
     * Enter the if statement node, who has a logical arithmetic expression, an instruction and condition
     * 1. Get the logical arithmetic expression that tests the condition.
     * 2. Then we should declare the exit label where we are gonna jump if the condition is false.
     * 3. We should declare the exit label for the else statement.
     * 4. We should declare the exit label for the else if statement.
     * 
     *   if_stmt    : IF O_PAREN logical_arithmetic_expression C_PAREN instruction else_stmt
     *              ;
     *
     *   else_stmt  : ELSE IF O_PAREN logical_arithmetic_expression C_PAREN instruction else_stmt
     *              | ELSE instruction
     *              |
     *              ;
     */
    @Override
    public String visitIf_stmt(If_stmtContext ctx) {
        System.out.println("visitIf_stmt()");    
        visitLogical_arithmetic_expression(ctx.logical_arithmetic_expression());
        String condition = operands.pop();
        TAC += "\njnz " + condition;

        String exitLabel = labelGenerator.getNewLabel("lifExit");
        TAC += "\njmp " + exitLabel;

        visitInstruction(ctx.instruction());

        exitElseLabel = labelGenerator.getNewLabel("lelseIfExit");
        TAC += "\njmp " + exitElseLabel;
        TAC += "\n" + exitLabel + ":";

        visitElse_stmt(ctx.else_stmt());

        TAC += "\n" + exitElseLabel + ":";

        return TAC;
    }

    @Override
    public String visitElse_stmt(Else_stmtContext ctx) {
        System.out.println("visitElse_stmt()");
        if (ctx.logical_arithmetic_expression() != null) {

            visitLogical_arithmetic_expression(ctx.logical_arithmetic_expression());
            String condition = operands.pop();
            TAC += "\njnz " + condition;

            String exitIfLabel = labelGenerator.getNewLabel("lifExit");
            TAC += "\njmp " + exitIfLabel;

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




    /*
     * Enter the inc_dec node, who has only one children with recursion.
     * 1. Test if it is a pre increment/decrement or a post increment/decrement.
     * 2. Get the id of the variable.
     * 3. Generate the instruction.
     * 4. Push the id to the stack.
     * 
     *   inc_dec    : ID '++'
     *              | ID '--'
     *              | '--' ID
     *              | '++' ID
     *              ;
     */
    @Override
    public String visitInc_dec(Inc_decContext ctx) {
        System.out.println("visitInc_dec()");
        if (ctx.getChild(0).getText().contains("+") || ctx.getChild(0).getText().contains("-")) {
            preOrPost = 1;
        }
        else {
            preOrPost = 2;
        }

        String id = ctx.ID().getText();

        instruction += "\n" + id + " = " + id;

        if (ctx.getChild(0).getText().contains("+")) {
            instruction += "-1";
        }
        else {
            instruction += "+1";
        }

        operands.push(id);

        return TAC;
    }




    /* 
     * Enter the function statement node, who has a function declaration and a block of code. 
     * 
     *   function_stmt  : function_declaration block_of_code
     *                  | function_prototype
     *                  ;
     */
    @Override
    public String visitFunction_stmt(Function_stmtContext ctx) {
        System.out.println("visitFunction_stmt()");
        if (ctx.getChild(0) instanceof Function_declarationContext) {
            visitFunction_declaration(ctx.function_declaration());
            visitInstructions(ctx.block_of_code().instructions());
            TAC += "\njmp " + returnLabel + "\n";
        }

        return TAC;
    }
    

    
    
    /*
     * Enter the function call node, who has a call parameters list.
     * 
     *   function_call  : ID O_PAREN call_parameters_list C_PAREN
    *                   ;
     */
    @Override
    public String visitFunction_call(Function_callContext ctx) {
        System.out.println("visitFunction_call()");
        visitCall_parameters_list(ctx.call_parameters_list());

        String returnLabel = labelGenerator.getNewLabel("lreturn");
        TAC += "\npush " + returnLabel;
        TAC += "\njmp " + ctx.ID().getText();
        TAC += "\n" + returnLabel + ":";
        if (ctx.getParent() instanceof FactorContext) {
            String returnValue = variableGenerator.getNewVariable();
            TAC += "\npop " + returnValue;
            operands.push(returnValue);
        }

        return TAC;
    }
    



    /*
     * Enter the call parameters list node, who has a sequence of call parameters.
     * 
     *   function_declaration   : TYPE ID O_PAREN parameters_list C_PAREN
     *                          ;
     */
    @Override
    public String visitFunction_declaration(Function_declarationContext ctx) {
        System.out.println("visitFunction_declaration()");
        String entryLabel = ctx.ID().getText();
        TAC += "\n" + entryLabel + ":";
        returnLabel = labelGenerator.getNewLabel("lreturn");
        TAC += "\npop " + returnLabel;

        if (ctx.parameters_list().ID() != null) {
            visitParameters_list(ctx.parameters_list());
        }

        return TAC;
    }



    /*
     *   for_stmt        : FOR O_PAREN for_declaration for_condition for_update C_PAREN (instruction | SEMICOLON)
     *                   ;
     *
     *   for_declaration : statement
     *                   | assignment SEMICOLON
     *                   | SEMICOLON
     *                   ;
     *
     *   for_condition   : logical_arithmetic_expression SEMICOLON
     *                   | SEMICOLON
     *                   ;
     *
     *   for_update      : logical_arithmetic_expression COMMA for_update
     *                   | logical_arithmetic_expression
     *                   | assignments
     *                   |
     *                   ;
     */
    @Override
    public String visitFor_condition(For_conditionContext ctx) {
        System.out.println("visitFor_condition()");
        visitChildren(ctx);
        return TAC;
    }

    @Override
    public String visitFor_declaration(For_declarationContext ctx) {
        
        visitChildren(ctx);
        return TAC;
    }

    @Override
    public String visitFor_stmt(For_stmtContext ctx) {
        System.out.println("visitFor_stmt()");
        visitFor_declaration(ctx.for_declaration());
        
        String entryLabel = labelGenerator.getNewLabel("lforEntry");
        TAC += "\n" + entryLabel + ":";

        visitFor_condition(ctx.for_condition());
        
        String condition = operands.pop();
        TAC += "\njnz " + condition; 

        String outLabel = labelGenerator.getNewLabel("lforExit");
        TAC += "\njmp " + outLabel;

        visitInstruction(ctx.instruction());

        visitFor_update(ctx.for_update());

        TAC += "\njmp " + entryLabel;
        TAC += "\n" + outLabel + ":";

        return TAC;
    }

    @Override
    public String visitFor_update(For_updateContext ctx) {
        System.out.println("visitFor_update()");
        visitChildren(ctx);
        return TAC;
    }

}