// Generated from D:/Desktop/Informatyka/TKOM/Krzysztof Urbanowicz/src\fractions.g4 by ANTLR 4.7
package fractions;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link fractionsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface fractionsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link fractionsParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(fractionsParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(fractionsParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#s_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS_decl(fractionsParser.S_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#u_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitU_decl(fractionsParser.U_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(fractionsParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(fractionsParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(fractionsParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#atomExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(fractionsParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#attribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribution(fractionsParser.AttributionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#func_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_arg(fractionsParser.Func_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#func_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl(fractionsParser.Func_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#func_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body(fractionsParser.Func_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#void_func_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid_func_decl(fractionsParser.Void_func_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#void_func_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid_func_body(fractionsParser.Void_func_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#val_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal_return(fractionsParser.Val_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(fractionsParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(fractionsParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(fractionsParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#condition_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_body(fractionsParser.Condition_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#logExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogExpr(fractionsParser.LogExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#compExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpr(fractionsParser.CompExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(fractionsParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#loop_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_body(fractionsParser.Loop_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(fractionsParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link fractionsParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(fractionsParser.ReadContext ctx);
}