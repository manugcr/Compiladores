grammar compiladores;

@header {
package compiladores;
}

// ANALIZADOR LEXICO
fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

// Combinaciones
NUMERO : DIGITO+ ;
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;
TEXT : '"' .*? '"' ;
CHARACTER : '\'' (LETRA) '\'';
// Operaciones.
OP : '(';
CP : ')';
OB : '{';
CB : '}';
SC : ';';
ADDITION : '+';
SUBTR : '-';
MULT : '*';
DIV : '/';
// Palabras reservadas.
MAIN : 'main';
IF :	'if';
INT : 'int';
STRING : 'string';
BOOLEAN : 'bool';
CHAR : 'char';
FLOAT : 'float';
DOUBLE : 'double';
FALSE : 'false';
TRUE : 'true';
// Skip
WS : [ \n\t\r] -> skip;
OTRO : . ;
// FINALIZA ANALIZADOR LEXICO

s : ID     { System.out.println("ID ->" + $ID.getText() + "<--"); }         s
  | NUMERO { System.out.println("NUMERO ->" + $NUMERO.getText() + "<--"); } s
  | OTRO   { System.out.println("Otro ->" + $OTRO.getText() + "<--"); }     s
  | OP     { System.out.println("OP ->" + $OP.getText() + "<--"); }         s
  | CP     { System.out.println("CP ->" + $CP.getText() + "<--"); }         s
  | OB     { System.out.println("OB ->" + $OB.getText() + "<--"); }         s
  | CB     { System.out.println("CB ->" + $CB.getText() + "<--"); }         s
  | SC     { System.out.println("SC ->" + $SC.getText() + "<--"); }         s
  | ADDITION { System.out.println("ADDITION ->" + $ADDITION.getText() + "<--"); } s
  | SUBTR { System.out.println("SUBTR ->" + $SUBTR.getText() + "<--"); } s
  | MULT { System.out.println("MULT ->" + $MULT.getText() + "<--"); } s
  | DIV { System.out.println("DIV ->" + $DIV.getText() + "<--"); } s
  | TEXT { System.out.println("TEXT ->" + $TEXT.getText() + "<--"); } s
  | CHARACTER { System.out.println("CHARACTER ->" + $CHARACTER.getText() + "<--"); } s
  | EOF
  ;