# Compiladores
Proyecto para Practica y Construccion de Compiladores

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

[Guia](https://github.com/meschoyez/BaseCompiladores)
