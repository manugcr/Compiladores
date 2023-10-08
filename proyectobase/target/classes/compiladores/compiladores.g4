grammar compiladores;

@header {
package compiladores;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

PA : '(' ;
PC : ')' ;
EQ : '=' ;
PYC : ';' ;
LLA : '{' ;
LLC : '}' ;
COMA : ',' ;
MAS : '+' ;
MENOS : '-' ;
MULT : '*' ;
DIV : '/' ;
MOD : '%' ;
WHILE : 'while' ;
TDATO : 'int';
NUMERO : DIGITO+ ;
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

WS : [ \n\t\r] -> skip ;
OTRO : . ;


programa : instrucciones EOF ;

instrucciones : instruccion instrucciones
              |
              ;

instruccion : declaracion
            | asignacion
            // | retorno
            // | if_stmt
            | while_stmt
            // | for_stmt
            | LLA instrucciones LLC
            ;

declaracion : TDATO ID definicion lista_var PYC ;

definicion : EQ NUMERO
           |
           ;

lista_var : COMA ID definicion lista_var
          |
          ;

asignacion : ID EQ expresion PYC ;

while_stmt : WHILE PA opal PC instruccion ;

expresion : termino exp ;

exp : MAS   termino exp
    | MENOS termino exp
    |
    ;

termino : factor term ;

term : MULT factor term
     | DIV  factor term
     | MOD  factor term
     |
     ;

factor : NUMERO
       | ID
      //  | funcion
       | PA expresion PC
       ;

opal : ID ;
