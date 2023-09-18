grammar compiladores;

@header {
package compiladores;
}

// ANALIZADOR LEXICO
fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

// Combinaciones
ID : (LETRA | '_')(LETRA | DIGITO | '_')+ ;
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
// FINALIZA ANALIZADOR LEXICO

// s : ID     { System.out.println("ID ->" + $ID.getText() + "<--"); }         s
//   | NUMERO { System.out.println("NUMERO ->" + $NUMERO.getText() + "<--"); } s
//   | OTRO   { System.out.println("Otro ->" + $OTRO.getText() + "<--"); }     s
//   | EOF
//   ;

si : s EOF ;

s : PA s PC s
  | LLA s LLC s
  | CA s CC s
  |
  ;