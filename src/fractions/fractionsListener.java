// Generated from D:/Desktop/Informatyka/TKOM/Krzysztof Urbanowicz/src\fractions.g4 by ANTLR 4.7
package fractions;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fractionsParser}.
 */
public interface fractionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fractionsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(fractionsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(fractionsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(fractionsParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(fractionsParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#s_decl}.
	 * @param ctx the parse tree
	 */
	void enterS_decl(fractionsParser.S_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#s_decl}.
	 * @param ctx the parse tree
	 */
	void exitS_decl(fractionsParser.S_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#u_decl}.
	 * @param ctx the parse tree
	 */
	void enterU_decl(fractionsParser.U_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#u_decl}.
	 * @param ctx the parse tree
	 */
	void exitU_decl(fractionsParser.U_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(fractionsParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(fractionsParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(fractionsParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(fractionsParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(fractionsParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(fractionsParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(fractionsParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#atomExpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(fractionsParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterAttribution(fractionsParser.AttributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitAttribution(fractionsParser.AttributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#func_arg}.
	 * @param ctx the parse tree
	 */
	void enterFunc_arg(fractionsParser.Func_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#func_arg}.
	 * @param ctx the parse tree
	 */
	void exitFunc_arg(fractionsParser.Func_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(fractionsParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(fractionsParser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(fractionsParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(fractionsParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#void_func_decl}.
	 * @param ctx the parse tree
	 */
	void enterVoid_func_decl(fractionsParser.Void_func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#void_func_decl}.
	 * @param ctx the parse tree
	 */
	void exitVoid_func_decl(fractionsParser.Void_func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#void_func_body}.
	 * @param ctx the parse tree
	 */
	void enterVoid_func_body(fractionsParser.Void_func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#void_func_body}.
	 * @param ctx the parse tree
	 */
	void exitVoid_func_body(fractionsParser.Void_func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#val_return}.
	 * @param ctx the parse tree
	 */
	void enterVal_return(fractionsParser.Val_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#val_return}.
	 * @param ctx the parse tree
	 */
	void exitVal_return(fractionsParser.Val_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(fractionsParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(fractionsParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(fractionsParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(fractionsParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(fractionsParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(fractionsParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#condition_body}.
	 * @param ctx the parse tree
	 */
	void enterCondition_body(fractionsParser.Condition_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#condition_body}.
	 * @param ctx the parse tree
	 */
	void exitCondition_body(fractionsParser.Condition_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#logExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogExpr(fractionsParser.LogExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#logExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogExpr(fractionsParser.LogExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(fractionsParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(fractionsParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(fractionsParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(fractionsParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#loop_body}.
	 * @param ctx the parse tree
	 */
	void enterLoop_body(fractionsParser.Loop_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#loop_body}.
	 * @param ctx the parse tree
	 */
	void exitLoop_body(fractionsParser.Loop_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(fractionsParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(fractionsParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link fractionsParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(fractionsParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link fractionsParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(fractionsParser.ReadContext ctx);
}