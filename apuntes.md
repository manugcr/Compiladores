## Objetivo
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

## ANTLR
Another Tool for Language Recognition es una herramienta que se encarga de generar scanners, parsers y tree parsers automatizando la construccion de reconocedores de lenguaje, genera parsers de tipo recursivo descendente para el lenguaje deseado. La funcion principal del ANTLR es facilitar el trabajo al programador, automatizando aquellas tareas mas complicadas que forman parte del proceso de reconocimiento lexico y sintactico de un lenguaje.

### Estructura
Se crea un archivo NAME.g4 en el cual se especifican los tokens como la gramatica del compilador. En este archivo se determina la parte LEXICA y SINTACTICA/GRAMATICA del compilador.
ANTLR luego genera un analizador en tres diferentes archivos:
- Lexer.java: Contiene el lexer generador a partir del .g4
- Parsers.java: Contiene el parser generador por la gramatica del .g4
- Tokens.java: Contiene la lista de tokens de la gramatica del .g4

## Compilador
Un compilador es un pgroama que traduce un codigo fuente en un lenguaje de alto nivel a otro lenguaje de mas bajo nivel, el codigo objeto que puede ser directamente ejecutable. Para ello primero se debe realizar esta traduccion, corroborando la correccion del codigo fuente informando de posibles errores del usuario.

### Etapas
Es un proceso lineal el cual se divide en etapadas que a su vez se dividen en diferentes fases.

#### Front-end o Analisis
Es independiente del hardware, es a donde ingresa el codigo fuente. Tiene tres fases:
- Analisis Lexico (Scanning)
- Analisis Sintactico (Parsing)
- Analisis Semantico (TypeChecking)

##### Analisis Lexico
Durante esta fase se lee el codigo funete y se fragmenta en tokens o componentes lexicos. Cada token esta formado por una secuencia de caracteres, que es la unidad minima de nuestro lenguaje, estos tokens se definen a partir del alfabeto del lenguaje fuente a tratar y a medida que se fragmenta la entrada tambien se comprueba la correcion de los caracteres de entrada, es decir que se comprueba si una sucesion de caracteres coincide con los patrones definidos.

##### Analisis Sintactico

#### Middle-end o Etapa de sintesis de codigo intermedio
Luego de pasar por el front-end se pasa por esta etapa la cual tiene estas fases:
- Generacion de codigo intermedio.
- Optimizacion de codigo intermedio.

#### Back-end o Etapa de sintesis de codigo objeto.
Como etapa final tenemos estas fases:
- Generacion de codigo objeto.
- Optimizacion de codigo intermedio.
- Obtencion de codigo objetivo.
