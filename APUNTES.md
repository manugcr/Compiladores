## Objetivo
Desarrollar un compilador para lenguaje C reducido.

Dado un archivo de entrada en C, se debe generar como salida el reporte de errores en caso de existir. Para lograr esto se debe construir un parser que tenga como mínimo la implementación de los siguientes puntos:
- Reconocimiento de bloques de codigo delimitados por llaves y controlar balance de apertura y cierre.
- Verificacion de la estructura de las operaciones aritmetico/logicas y las variables o números afectadas.
- Verificacion de la correcta utilización del punto y coma para la terminación de instrucciones.
- Balance de llaves, corchetes y paréntesis.
- Tabla de símbolos.
- Llamado a funciones de usuario.

Si las fases de verificacion gramatical y semántica no han encontrado errores, se debe proceder a:
- Detectar variables y funciones declaradas pero no utilizadas y viceversa,
- Generar la version en codigo intermedio utilizando codigo de tres direcciones, el cual fue abordado en clases y se encuentra explicado con mayor profundidad en la bibliografía de la materia,

En resumen, dado un codigo fuente de entrada el programa debera generar dos archivos de salida:
- Las tablas de simbolos para cada contexto.
- La version en codigo de tres direcciones del codigo fuente de entrada.

### Implementacion
La hoja de ruta planteada durante la cursada es la siguiente:
1. Declaracion de las reglas lexicas y gramaticales.
2. Declaracion de tokens a utilizar.
3. Configuracion de listener y visitor.
4. Generador de la tabla de simbolos.
5. Generador de codigo de tres direcciones.

Una vez obtenido el resultado del anterior proceso, se realiza lo siguiente:
1. Analisis sintactico y lexico del codigo fuente.
2. Generacion del arbol AST.
3. Generacion de un reporte de errores.
4. Generacion de la tabla de simbolos.
5. Generacion de codigo de tres direcciones.
6. Generacion de tabla de simbolos en formato .png.

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
[Agregar imagen]()

### Etapas
Es un proceso lineal el cual se divide en etapadas que a su vez se dividen en diferentes fases.
[Agregar imagen]()

#### Front-end o Analisis
Es independiente del hardware, es a donde ingresa el codigo fuente. Tiene tres fases:
- Analisis Lexico (Scanning)
- Analisis Sintactico (Parsing)
- Analisis Semantico (TypeChecking)

##### Analisis Lexico
Durante esta fase se lee el codigo funete y se fragmenta en tokens o componentes lexicos. Cada token esta formado por una secuencia de caracteres, que es la unidad minima de nuestro lenguaje, estos tokens se definen a partir del alfabeto del lenguaje fuente a tratar y a medida que se fragmenta la entrada tambien se comprueba la correcion de los caracteres de entrada, es decir que se comprueba si una sucesion de caracteres coincide con los patrones definidos.

##### Analisis Sintactico
En este punto se comprueba si la secuencia de tokens obtenida de la fase anterior es aceptada por la gramatica del lenguaje que se esta tratando, agrupando los tokens en frases gramaticales. Si es asi, el programa fuente sera sintactica o estructuralmente correcto. Conceptualmente, se entienden las fases de Analisis Laxico y Sintactico como dos fases diferenciadas, pero en el momento de la ejecucion, el compilador puede realizar estas dos etapas de forma conjunta. 

##### Analisis Semantico
Llegados a este punto interesa comprobar que además que lo que que se tenia inicialmente en la entrada este bien escrito y estructurado, tenga tambien un sentido. En esta etapa se comprueba que las operaciones tengan sentido, pero no se comprueba que el programa sea correcto, es decir, que haga lo que se espera de el.

#### Middle-end o Etapa de sintesis de codigo intermedio
Luego de pasar por el front-end se pasa por esta etapa la cual tiene estas fases:
- Generacion de codigo intermedio.
- Optimizacion de codigo intermedio.

##### Generacion de codigo intermedio
En esta fase se genera un codigo intermedio que es un codigo de bajo nivel que se puede ejecutar en una maquina virtual. Este codigo intermedio es independiente de la maquina en la que se ejecutara el programa final, es decir, es independiente del hardware.

##### Optimizacion de codigo intermedio
En esta fase se optimiza el codigo intermedio, es decir, se busca que el codigo intermedio sea mas eficiente, que se ejecute en menos tiempo o que ocupe menos espacio. Se cuenta con dos tipos de optimizacion, las que son dependientes de la arquitectura y las que no, para este caso se utilizan las que no son dependientes de la arquitectura. Se dedica a analizar la representacion intermedia del programa para mejorarla, sin cambiar su significado, eliminando redundancias y/o instrucciones innecesarias.

#### Back-end o Etapa de sintesis de codigo objeto.
Como etapa final tenemos estas fases:
- Generacion de codigo objeto.
- Optimizacion de codigo intermedio.
- Obtencion de codigo objetivo.

##### Generacion de codigo objeto
En esta fase se genera el codigo objeto, es decir, el codigo que se ejecutara en la maquina objetivo. Este codigo objeto es dependiente de la maquina en la que se ejecutara el programa final, es decir, es dependiente del hardware.

## Arbol sintactico
Es una representacion jerarquica de la estructura del codigo fuente, es decir, es una representacion grafica de la estructura del codigo fuente. Se utiliza para representar la estructura sintactica de una cadena de entrada de acuerdo con una gramatica formal. Cada nodo del arbol denota una construccion gramatical de la cadena de entrada. Los nodos internos del arbol denotan operadores no terminales, mientras que las hojas del arbol denotan los operandos o terminales.

### Recorrido de arbol
Se comienza por la raiz y se recorre el arbol de forma recursiva de la siguiente forma:
- Comenzando de la raiz:
    - Si el nodo es un nodo hoja regresa al padre.
    - De lo contrario se recorre el hijo izquierdo.
- Se repite el proceso hasta que se llegue a un nodo hoja.

[Agregar imagen]()

## Listeners y Visitors.
El proceso para recorrer un arbol sintactico es simple de entender pero no facilmente aplicable por lo que se utilizan `Listeners` y `Visitors` para recorrer el mismo.

### Listeners
Son objetos de la clase `Listener` que se encargan de escuchar cuando sucede un evento determinado, cuando este ocurre se le avisa al `Listener` y este ejecuta una accion determinada. En el caso de ANTLR se utilizan para recorrer el arbol sintactico, se crea un `Listener` que escuche cuando se visita un nodo y cuando se sale de un nodo, de esta forma se puede recorrer el arbol de forma simple.

### Visitors
Son objetos de la clase `Visitor` estos trabajan una vez que el arbol ya esta construido y se encargan de iterar o visitar todos los nodos del arbol. En el caso de ANTLR se utilizan para recorrer el arbol sintactico, se crea un `Visitor` que visite cada nodo del arbol y ejecute una accion determinada.

## Tabla de simbolos
Es una estructura de datos que se utiliza para almacenar informacion acerca de los identificadores definidos en el codigo fuente de un programa. La informacion almacenada en la tabla de simbolos de un programa se utiliza para la comprobacion de tipos y la gestion de memoria. La tabla de simbolos se construye durante el analisis sintactico y se utiliza durante el analisis semantico y la generacion de codigo intermedio.
