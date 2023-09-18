grammar compiladores;

@header {
package compiladores;
}

// ---------------------------------------------------------
//                    Reglas Lexicas
// ---------------------------------------------------------
fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

// Combinaciones
ID : (LETRA | '_') (LETRA | DIGITO | '_')*; 
NUMERO : DIGITO+ ;
TEXTO : '"' .*? '"' ;
CARACTER : '\'' (LETRA) '\'';
// Operaciones.
PA: '(';
PC: ')';
LLA: '{';
LLC: '}';
CA: '[';
CC: ']';
PYC: ';';
SUMA: '+';
MULT: '*';
DIVI: '/';
RESTA: '-';
// Palabras reservadas.
MAIN: 'main';
IF:	'if';
INT: 'int';
STRING: 'string';
BOOLEAN: 'bool';
CHAR: 'char';
FLOAT: 'float';
DOUBLE: 'double';
FALSE: 'false';
TRUE: 'true';
// Skip
WS : [ \n\t\r] -> skip;
OTRO : . ;


// ---------------------------------------------------------
//                     Reglas gramaticales
// ---------------------------------------------------------
// Un programa es una sucecion de instrucciones.
programa : instrucciones EOF; 

// Los posibles tipos de variables a compilar.
tipo  : INT 
      | STRING 
      | BOOLEAN 
      | CHAR 
      | FLOAT 
      | DOUBLE
      ;

// Operadores logicos del programa.
logica  : '<'
        | '>'
	      | '<='
        | '>='
        | '!='
        | '=='
        ;	


// ---------------------------------------------------------
//                SETS DE INSTRUCCIONES
// ---------------------------------------------------------
// Las instrucciones NO pueden ser nombradas de la misma forma que palabras reservadas 
// de un lenguaje, ya que habria conflicto.

// Concatenacion de intrucciones individuales (instruccion)
instrucciones : instruccion* 
		          |
              ;

// Instrucciones basicas de un programa en C.
instruccion : principal 
            | bloque
            | incremento
            | asignacion
            // | declaracion
            | ireturn
            | inst_if
            | inst_for
            | inst_while
            | inst_else
            ;

// Mi funcion int main().
principal : INT MAIN PA PC bloque
          ; 

// Es un bloque con instrucciones delimitado por llaves.
bloque  : LLA instrucciones LLC
        ; 

// Incrementar o decrementar una variable en si misma.
incremento  : ID '+=' NUMERO
            | ID '++'
            | ID '--'
            | ID '-=' NUMERO
            | ID '+=' ID
            | ID '-=' ID
            ;	   

// Una asignacion es asignarle un valor a una variable.
asignacion  : ID '=' exp PYC        
            | ID '=' exp ','  // Para cuando queremos hacer int x, y, z;
            | ID '=' ID PYC
            | ID '=' ID ','
            | ID '=' exp 
            | ID '=' exp ',' asignacion
            | ID '=' llamada_func
            ;

// declaracion :
//             ; 

// Retornar los valores de una funcion.
ireturn : 'return' ID PYC
        | 'return' NUMERO PYC
        | 'return' TEXTO
        ;

inst_if : IF PA comparacion PC instruccion inst_else
        | IF PA comparacion PC instruccion
        ;

inst_for  : 'for' PA ID '=' (NUMERO | ID)  ';' comparacion ';' (ID '=' ID ('+' | '-') NUMERO) PC bloque
          ;

inst_while  : 'while' PA exp PC instruccion
            ;

inst_else : 'else' instruccion 
          | 'else' inst_if
          ;


// ---------------------------------------------------------
//             Auxiliares para instrucciones
// ---------------------------------------------------------
// Es cuando llamamos una funcion del modo funcion(x); o funcion(x, y);
llamada_func  : ID PA (NUMERO | ID) PC PYC
              | ID PA (NUMERO | ID) (',' (NUMERO | ID)) PC PYC
              ;

// Para comparar dos valores en un condicional.
comparacion : ID logica exp 
            | ID logica ID
            ;
            

// ---------------------------------------------------------
//             Manejo de terminos y expresiones
// ---------------------------------------------------------
// Una expresion es una sucecion de terminos.
exp: term t;

// Un termino es una sucecion de factores.
term: factor f;

// Damos prioridad a la mult/div sobre la suma/resta
f : MULT factor f   // Expresion de producto
  | DIVI factor f
  | 
  ;
t : SUMA term t     // Expresion de adicion
  | RESTA term t
  |
  ; 

// Un factor es un numero, una variable o lo que va dentro de un termino.
factor  : NUMERO   
        | ID     
        | TEXTO  
        | CARACTER
        | PA exp PC //	controlo balance de parentesis
        ; 

// Recordar FACTOR -> Parte separada por mult o div ej 5*3 
// TERMINOS -> Parte separada por suma y/o resta ej 5+3





// ---------------------------------------------------------
//                      DEBUGGING
// ---------------------------------------------------------
// s : ID     { System.out.println("ID ->" + $ID.getText() + "<--"); }         s
//   | NUMERO { System.out.println("NUMERO ->" + $NUMERO.getText() + "<--"); } s
//   | OTRO   { System.out.println("Otro ->" + $OTRO.getText() + "<--"); }     s
//   | EOF
//   ;
// si : s EOF ;
// s : PA s PC s
//   | LLA s LLC s
//   | CA s CC s
//   |
//   ;