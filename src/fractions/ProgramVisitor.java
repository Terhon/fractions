package fractions;

import javafx.util.Pair;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class ProgramVisitor extends fractionsBaseVisitor {

    private Map<String, Object> globals = new HashMap<String, Object>();
    private Set<Function> functions = new HashSet<Function>();
    private Stack<List<Map<String, Object>>> vars = new Stack<>();

    private void putVar(String id, Object value) {
        if (vars.isEmpty()) {
            globals.put(id, value);
        } else {
            vars.peek().get(vars.peek().size() - 1).put(id, value);
        }
    }

    private Object getVar(String id) {
        for (int i = vars.peek().size() - 1; i >= 0; i--) {
            if (vars.peek().get(i).containsKey(id))
                return vars.peek().get(i).get(id);
        }
        if (globals.containsKey(id))
            return globals.get(id);

        return null;
    }

    private String trim(String s) {
        return s.substring(1, s.length() - 1);
    }

    @Override
    public Void visitS_decl(fractionsParser.S_declContext ctx) {

        Object value = getVar(ctx.ID(0).toString());
        if (value != null)
            throw new RuntimeException("Variable already declared");
        if (ctx.ID(1) != null) {
            value = getVar(ctx.ID(1).toString());
            if (value == null || !value.getClass().equals(String.class))
                throw new RuntimeException("No such variable");
            putVar(ctx.ID(0).toString(), value);
        } else
            putVar(ctx.ID(0).toString(), trim(ctx.STRING().toString()));

        return null;
    }

    @Override
    public Void visitU_decl(fractionsParser.U_declContext ctx) {

        Object value = getVar(ctx.ID().toString());
        if (value != null)
            throw new RuntimeException("Variable already declared");

        putVar(ctx.ID().toString(), this.visitExpr(ctx.expr()));

        return null;
    }

    @Override
    public Void visitAttribution(fractionsParser.AttributionContext ctx) {
        Object value = getVar(ctx.ID().toString());
        if (value == null)
            throw new RuntimeException("No such variable");

        if (ctx.STRING() != null && value.getClass().equals(String.class))
            value = trim(ctx.STRING().toString());
        else if (ctx.expr() != null && value.getClass().equals(Fraction.class))
            value = visitExpr(ctx.expr());
        else
            throw new RuntimeException("Wrong variable type");


        for (int i = vars.peek().size() - 1; i >= 0; i--) {
            if (vars.peek().get(i).containsKey(ctx.ID().toString())) {
                vars.peek().get(i).replace(ctx.ID().toString(), value);
                return null;
            }
        }
        if (globals.containsKey(ctx.ID().toString()))
            globals.replace(ctx.ID().toString(), value);

        return null;
    }

    @Override
    public Fraction visitExpr(fractionsParser.ExprContext ctx) {
        return new Fraction(visitAddExpr(ctx.addExpr(0)), ctx.addExpr(1) == null ? new Fraction(1, 1) : visitAddExpr(ctx.addExpr(1)));
    }

    @Override
    public Fraction visitAddExpr(fractionsParser.AddExprContext ctx) {
        int i = 0;
        Fraction value = visitMultExpr(ctx.multExpr(i++));
        for (TerminalNode oper : ctx.ADD_OPER()) {
            if (oper.toString().equals("+"))
                value.add(visitMultExpr(ctx.multExpr(i++)));
            else
                value.sub(visitMultExpr(ctx.multExpr(i++)));
        }
        return value;
    }

    @Override
    public Fraction visitMultExpr(fractionsParser.MultExprContext ctx) {
        int i = 0;
        Fraction value = visitAtomExpr(ctx.atomExpr(i++));
        for (TerminalNode oper : ctx.MULT_OPER()) {
            if (oper.toString().equals("*"))
                value.mul(visitAtomExpr(ctx.atomExpr(i++)));
            else
                value.div(visitAtomExpr(ctx.atomExpr(i++)));
        }
        return value;
    }

    @Override
    public Fraction visitAtomExpr(fractionsParser.AtomExprContext ctx) {
        Fraction value = new Fraction(1, 1);

        if (ctx.NUMBER() != null)
            value = new Fraction(Integer.parseInt(ctx.NUMBER().toString()), 1);
        else if (ctx.ID() != null) {
            Object val = getVar(ctx.ID().toString());
            if (val != null && val.getClass().equals(Fraction.class))
                value = (Fraction) val;
            else
                throw new RuntimeException("Given variable is a string");
        } else if (ctx.expr() != null)
            value = visitExpr(ctx.expr());
        else if (ctx.func_call() != null) {
            Object result = visitFunc_call(ctx.func_call());
            if (Fraction.class.equals(result.getClass()))
                value = (Fraction) result;
            else
                throw new RuntimeException("Wrong return type");
        }
        if ("-".equals(ctx.getChild(0).toString()))
            value.opposite();
        return value;
    }

    @Override
    public Pair<Type, String> visitFunc_arg(fractionsParser.Func_argContext ctx) {
        Type type;
        if (ctx.S_TYPE() != null)
            type = Type.STRING;
        else
            type = Type.FRACTION;

        return new Pair<>(type, ctx.ID().toString());
    }

    @Override
    public Void visitFunc_decl(fractionsParser.Func_declContext ctx) {

        List<Pair<Type, String>> args = new LinkedList<>();
        for (fractionsParser.Func_argContext arg : ctx.func_arg()) {
            args.add(visitFunc_arg(arg));
        }

        Type type = ctx.S_TYPE() != null ? Type.STRING : Type.FRACTION;
        Function func = new Function(type, ctx.ID().toString(), args, ctx.func_body());
        functions.add(func);

        return null;
    }

    @Override
    public Void visitVoid_func_decl(fractionsParser.Void_func_declContext ctx) {

        List<Pair<Type, String>> args = new LinkedList<>();
        for (fractionsParser.Func_argContext arg : ctx.func_arg()) {
            args.add(visitFunc_arg(arg));
        }

        Function func = new Function(null, ctx.ID().toString(), args, ctx.void_func_body());
        functions.add(func);

        return null;
    }

    @Override
    public Object visitFunc_body(fractionsParser.Func_bodyContext ctx) {
        //TODO
        return super.visitFunc_body(ctx);
    }

    @Override
    public Void visitVoid_func_body(fractionsParser.Void_func_bodyContext ctx) {
        //TODO
        return null;
    }

    @Override
    public Object visitFunc_call(fractionsParser.Func_callContext ctx) {
        Function f = null;
        for (Function func : functions) {
            if (func.getId().equals(ctx.ID().toString())) {
                f = func;
                break;
            }
        }
        if (f == null)
            throw new RuntimeException("No such function");

        vars.push(new LinkedList<>());
        int i = 0;
        for (Pair<Type, String> arg : f.getArgs()) {
            i++;
            if (ctx.variable(i).STRING() != null && Type.STRING.equals(arg.getKey()))
                putVar(arg.getValue(), trim(ctx.variable(i).STRING().toString()));
            else if (ctx.variable(i).expr() != null && Type.FRACTION.equals(arg.getKey()))
                putVar(arg.getValue(), visitExpr(ctx.variable(i).expr()));
            else
                throw new RuntimeException("Wrong function parameters");
        }
        if (i != ctx.variable().size())
            throw new RuntimeException("Wrong number of parameters");

        //TODO
        //visitOperation(f.getInstructions());

        return null;
    }

    @Override
    public Object visitVal_return(fractionsParser.Val_returnContext ctx) {
        if (ctx.STRING() != null)
            return ctx.STRING().toString();
        else
            return visitExpr(ctx.expr());
    }

    @Override
    public Void visitLoop(fractionsParser.LoopContext ctx) {
        vars.peek().add(new HashMap<>());
        while (visitLogExpr(ctx.logExpr()))
            visit(ctx.loop_body());

        vars.peek().remove(vars.peek().size() - 1);
        return null;
    }

    @Override
    public Void visitCondition(fractionsParser.ConditionContext ctx) {
        vars.peek().add(new HashMap<>());
        if (visitLogExpr(ctx.logExpr()))
            visit(ctx.condition_body(0));
        else
            visit(ctx.condition_body(1));

        vars.peek().remove(vars.peek().size() - 1);
        return null;
    }

    @Override
    public Boolean visitLogExpr(fractionsParser.LogExprContext ctx) {
        int i = 0;
        Boolean value = visitCompExpr(ctx.compExpr(i++));

        for (TerminalNode oper : ctx.LOG_OPER()) {
            if (oper.toString().equals("^"))
                value = value && visitCompExpr(ctx.compExpr(i++));
            else
                value = value || visitCompExpr(ctx.compExpr(i++));
        }

        return value;
    }

    @Override
    public Boolean visitCompExpr(fractionsParser.CompExprContext ctx) {
        Boolean value = null;

        if (ctx.logExpr() != null)
            value = visitLogExpr(ctx.logExpr());
        else {
            Fraction expr1 = visitExpr(ctx.expr(0));
            Fraction expr2 = visitExpr(ctx.expr(1));
            value = expr1.compare(expr2, ctx.COMP_OPER().toString());
        }
        if ("!".equals(ctx.getChild(0).toString()))
            value = !value;

        return value;
    }

    @Override
    public Void visitRead(fractionsParser.ReadContext ctx) {

        Scanner scanner = new Scanner(System.in);
        if (ctx.S_TYPE() != null)
            putVar(ctx.ID().toString(), scanner.next());
        else
            putVar(ctx.ID().toString(), new Fraction(scanner.nextInt(), scanner.nextInt()));

        return null;
    }

    @Override
    public Void visitWrite(fractionsParser.WriteContext ctx) {
        if (ctx.STRING() == null)
            System.out.println(visitExpr(ctx.expr()));
        else
            System.out.println(ctx.STRING());

        return null;
    }
}
