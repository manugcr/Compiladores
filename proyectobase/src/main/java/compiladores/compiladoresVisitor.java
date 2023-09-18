// Generated from /home/manu/facultad/compiladores/Compiladores/proyectobase/src/main/java/compiladores/compiladores.g4 by ANTLR 4.9.2

package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compiladoresParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compiladoresVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(compiladoresParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(compiladoresParser.SContext ctx);
}