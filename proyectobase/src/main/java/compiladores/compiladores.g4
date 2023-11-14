grammar compiladores;

@header {
package compiladores;
}

 /* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%  
 * LEXICAL RULES 
 * These deal with the basic building of blocks of a programming language, which are called tokens.
 * Lexical rules define the patterns that make up these tokens.
 * 
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% 
 */ 

/* FRAGMENTS  */
fragment LETTER     : [A-Za-z]  ;
fragment DIGIT      : [0-9]     ;
fragment INT        : 'int'     ;
fragment STRING     : 'string'  ;
fragment BOOLEAN    : 'boolean' ;
fragment CHAR       : 'char'    ;
fragment FLOAT      : 'float'   ;
fragment DOUBLE     : 'double'  ;

/* LEXICAL RULES */
O_PAREN             : '('       ;
C_PAREN             : ')'       ;
O_BRACE             : '{'       ;
C_BRACE             : '}'       ;   
SEMICOLON           : ';'       ;
COMMA               : ','       ;
EQUAL               : '='       ;
ADD                 : '+'       ;
SUB                 : '-'       ;
MULT                : '*'       ;
DIV                 : '/'       ;
MOD                 : '%'       ;
AND                 : '&&'      ;
OR                  : '||'      ;
EQUALS              : '=='      ;
NOT_EQUALS          : '!='      ;
LESS_THAN           : '<'       ;
GREATER_THAN        : '>'       ;
LESS_OR_EQUAL       : '<='      ;
GREATER_OR_EQUAL    : '>='      ;

RETURN              : 'return'  ;
IF                  : 'if'      ;
ELSE                : 'else'    ;
WHILE               : 'while'   ;
FOR                 : 'for'     ;

TYPE                : (INT | STRING | BOOLEAN | CHAR | FLOAT | DOUBLE)  ;
TEXT                : '"' (LETTER | '_') (LETTER | DIGIT | '_')* '"'    ;
ID                  : (LETTER | '_')(LETTER | DIGIT | '_')*             ;
NUMBER              : DIGIT+                                            ;
WS                  : [ \n\t\r] -> skip                                 ;
OTHER               : .                                                 ;
/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * END LEXICAL RULES 
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% 
 */




/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% 
 * SYNTACTIC RULES 
 * These deal with the structure of the language, and how the tokens are combined to form statements and expressions.
 *
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% 
 */ 

/* 
 * Initial symbol of the syntactic rules. 
 */
program         : instructions EOF ;


/* 
 * Allowed instruction by this C compiler. 
 */
instructions    : instruction instructions
                |
                ;

instruction     : block_of_code
                | statement 
                | assignment 
                | while_stmt
                | for_stmt
                | return_stmt
                | if_stmt
                | function_stmt
                | inc_dec
                ;


/* 
 * BLOCK OF CODE
 * A block of code is a series of instructions sepparated by semicolons and surrounded by curly braces.
 */
block_of_code   : O_BRACE instructions C_BRACE ;


/* 
 * STATEMENT
 * A statement is a single instruction that ends with a semicolon. It allows multiple statements.
 *      Example:    int x ;
 *                  int a, b, c, d;
 *                  int y = 10 ;
 *                  int o, p = 5, q = 1, r;
 */
statement   : TYPE ID definition list SEMICOLON ;

definition  : EQUAL NUMBER   
            |
            ;

list        : COMMA ID definition list
            |
            ;


/* 
 * ASSIGNMENT
 * An assignment is a statement that assigns a value to a variable. It can be a single assignment or multiple assignments.
 *      Example:    int x = 10;
 *                  int y = 5, z = 1;
 *                  int a = 5 + 5;
 */
assignment  : ID EQUAL expression SEMICOLON ;


/* 
 * LOGICAL ARITHMETIC EXPRESSIONS 
 * An arithmetic expression is a combination of variables, constants, and arithmetic operators that, when evaluated, results in a numeric value.
 *      An exppression is a series of terms sepparated by '+' or '-'.
 *      A term is a series of factors sepparated by '*' or '/'.
 *      A factor is a NUMBER, ID, decrement/increment, function call or another arithmetic expression.
 *      Example: 5 + x + (5*10/2);
 *
 */
expression  : term term_aux;

term_aux    : ADD term term_aux
            | SUB term term_aux
            |
            ;

term        : factor factor_aux;

factor_aux  : MULT factor factor_aux
            | DIV factor factor_aux
            | MOD factor factor_aux
            |
            ;


factor      : NUMBER
            | ID
            | function_call
            | O_PAREN expression C_PAREN
            ;



/* 
 * WHILE
 * A while has a condition inside parentheses and a block of code that contains the instructions to execute.
 *      Example:    while (x < 10) {}
 *                  while (x < 10) { int x = 5; }
 */
while_stmt  : WHILE O_PAREN expression C_PAREN (instruction | SEMICOLON) ;


/* 
 * FOR
 * A for has three statements inside parentheses and a block of code that contains the instructions to execute.
 *      Example:    for (int i = 0; i < 10; i++) {}
 *                  for (int i = 0; i < 10; i++) { int x = 5; }            
 */
for_stmt    : FOR O_PAREN ID EQUAL (NUMBER | ID) SEMICOLON comparison SEMICOLON (ID EQUAL ID (ADD | SUB) NUMBER) C_PAREN (instruction | SEMICOLON);

/*
 * COMPARISON
 * A comparison is a statement that compares two values and returns a boolean value.
 */
comparison  : ID logic expression 
            | ID logic ID
            ;

/*
 * LOGIC
 * A logic is a statement that compares two values.
 *      Example:    <
 *                  !=
 *                  <=
 */
logic       : LESS_THAN
            | GREATER_THAN
            | LESS_OR_EQUAL
            | GREATER_OR_EQUAL
            | NOT_EQUALS
            | EQUALS
            ;

/* 
 * RETURN 
 * A return statement is a statement that returns a value from a function.
 */
return_stmt : RETURN ID SEMICOLON
            | RETURN NUMBER SEMICOLON
            | RETURN TEXT SEMICOLON
            ;


/* 
 * IF STATEMENT
 * An if has a condition inside parentheses and a block of code that contains the instructions to execute.
 * It can also have an else statement that contains a block of code with instructions to execute if the condition is false.
 *      Example:    if (x < 10) {}
 *                  if (x < 10) { int x = 5; }
 *                  if (x < 10) { int x = 5; } else { int x = 10; }         
 */
if_stmt     : IF O_PAREN comparison C_PAREN instruction else_stmt
            | IF O_PAREN comparison C_PAREN instruction
            ;

else_stmt   : ELSE IF O_PAREN instruction C_PAREN instruction else_stmt
            | ELSE instruction
            |
            ;

/* 
 * INCREMENT DECREMENT
 * An increment is a statement that increments or decrements a variable by a number or another variable.
 *      Example:    x++;
 *                  x--;
 *                  x += 5;
 */
inc_dec     : ID '+=' NUMBER
            | ID '++'
            | ID '--'
            | ID '-=' NUMBER
            | ID '+=' ID
            | ID '-=' ID
            ;


/*
 * FUNCTION
 * A function is a statement that declares a function with a return type, a name, a list of parameters and a block of code.
 *      Example:    int function(int x) {}
 *                  int function(int x) { int x = 5; }
 */

function_stmt : TYPE ID O_PAREN parameter_list? C_PAREN SEMICOLON ;

parameter_list : TYPE ID (COMMA TYPE ID)* ;

function_call : ID O_PAREN argument_list? C_PAREN ;

argument_list : expression (COMMA expression)* ;




// /* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
//  * END SYNTACTIC RULES  
//  * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% 
//  */