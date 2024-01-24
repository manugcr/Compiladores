# Compiladores
Proyecto para Practica y Construccion de Compiladores

---

# Objetivo
Desarrollar un compilador para lenguaje C reducido.

Dado un archivo de entrada en C, se debe generar como salida el reporte de errores en caso de existir. Para lograr esto se debe construir un parser que tenga como mínimo la implementación de los siguientes puntos:
- Reconocimiento de bloques de código delimitados por llaves y controlar balance de apertura y cierre.
- Verificación de la estructura de las operaciones aritmético/lógicas y las variables o números afectadas.
- Verificación de la correcta utilización del punto y coma para la terminación de instrucciones.
- Balance de llaves, corchetes y paréntesis.
- Tabla de símbolos.
- Llamado a funciones de usuario.

Si las fases de verificación gramatical y semántica no han encontrado errores, se debe proceder a:
- Detectar variables y funciones declaradas pero no utilizadas y viceversa,
- Generar la versión en código intermedio utilizando código de tres direcciones, el cual fue abordado en clases y se encuentra explicado con mayor profundidad en la bibliografía de la materia,

En resumen, dado un código fuente de entrada el programa deberá generar dos archivos de salida:
- Las tablas de simoblos para cada contexto.
- La version en codigo de tres direcciones del codigo fuente de entrada.

[Guia](https://github.com/meschoyez/BaseCompiladores)

---

# Marco Teorico

## Compilador
Un compilador es un programa que traduce codigo escrito en un lenguaje de programacion llamado fuente, a otro lenguaje conocido como objeto, el proceso de traduccion se conoce como compilacion. La construccion de un compilador generalmente se agrupa en dos tareas, el analisis del programa fuente y la sinstesis del programa objeto. El analisis se trata de la comprobacion de la correcion del programa fuente y la sintesis tiene como objetivo la generacion de la salida expresada en el lenguaje objeto y suele estar formada por una o varias combinaciones de fases de generacion de codigo y optimizacion de codigo.

La compilacion es un proceso lineal que se divide en etapas, cada etapa se estructura en diferentes fases que cada una realiza una tarea correspondiente. En este trabajo nosostros nos centraremos en el proceso del analisis lexico, sintactico y semantico, pero tambien la generacion del codigo intermedio con una optimizacion basica. No se realizaran las partes de etapa de generacion y optimizacion de codigo objetivo.

![](./imgs/Etapas_de_compilacion.png)

## ANTLR
Para desarrollar este compilador se utilizara ANTLR (Another Tool For Language Recognition). Es una herramienta que se encarga de generar scanners, parsers y tree parsers automatizando la construccion de reconocedores de lenguaje, genera parsers de tipo recursivo descendente para el lenguaje deseado. La funcion principal del ANTLR es facilitar el trabajo al programador, automatizando aquellas tareas mas complicadas que forman parte del proceso de reconocimiento lexico y sintactico de un lenguaje.

## Arbol sintactico
Es una representacion jerarquica de la estructura del codigo fuente, es decir, es una representacion grafica de la estructura del codigo fuente. Se utiliza para representar la estructura sintactica de una cadena de entrada de acuerdo con una gramatica formal. Cada nodo del arbol denota una construccion gramatical de la cadena de entrada. Los nodos internos del arbol denotan operadores no terminales, mientras que las hojas del arbol denotan los operandos o terminales.

#### Recorrido de arbol
Se comienza por la raiz y se recorre el arbol de forma recursiva de la siguiente forma:
- Comenzando de la raiz:
    - Si el nodo es un nodo hoja regresa al padre.
    - De lo contrario se recorre el hijo izquierdo.
- Se repite el proceso hasta que se llegue a un nodo hoja.

---

# Analisis Lexico
El analisis lexico es la primera fase de un compilador, su funcion es leer el codigo fuente caracter por caracter y agruparlos en unidades logicas llamadas tokens. Un token es una secuencia de caracteres que juntos tienen un significado. El analizador lexico se encarga de reconocer los tokens y pasarlos al analizador sintactico para que este los analice.

ANTLR nos facilita la creacion de estas expresiones con un archivo compiladores.g4
``` antlr
fragment LETTER     : [A-Za-z]  ;
fragment DIGIT      : [0-9]     ;
fragment INT        : 'int'     ;

O_PAREN             : '('       ;
C_PAREN             : ')'       ;
O_BRACE             : '{'       ;
C_BRACE             : '}'       ;

TYPE                : (INT | DOUBLE | CHAR | VOID | STRING | BOOLEAN)   ;
ID                  : (LETTER | '_')(LETTER | DIGIT | '_')*             ;
NUMBER              : DIGIT+                                            ;
TEXT                : '"' (LETTER | '_') (LETTER | DIGIT | '_')* '"'    ;
WS                  : [ \n\t\r] -> skip                                 ;
OTHER
```

# Analisis sintactico
El analisis sintactico es la segunda fase de un compilador, su funcion es analizar la estructura del codigo fuente y comprobar que cumpla con la gramatica del lenguaje. El analizador sintactico recibe los tokens del analizador lexico y los analiza para comprobar que cumplan con la gramatica del lenguaje. Si el analizador sintactico encuentra un error en el codigo fuente, este debe detenerse y mostrar el error encontrado.

Por ejemplo en el mismo compiladores.g4 se puede definir la gramatica del lenguaje
``` antlr
if_stmt     : IF O_PAREN logical_arithmetic_expression C_PAREN instruction else_stmt
            ;

else_stmt   : ELSE IF O_PAREN logical_arithmetic_expression C_PAREN instruction else_stmt
            | ELSE instruction
            |
            ;
```
# Analisis semantico
El analisis semantico es la tercera fase de un compilador, su funcion es analizar el significado del codigo fuente y comprobar que cumpla con las reglas semanticas del lenguaje. El analizador semantico recibe los tokens del analizador lexico y los analiza para comprobar que cumplan con las reglas semanticas del lenguaje. Si el analizador semantico encuentra un error en el codigo fuente, este debe detenerse y mostrar el error encontrado. 
