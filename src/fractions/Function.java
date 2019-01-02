package fractions;

import javafx.util.Pair;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class Function {
    private Type type = null;
    private String id = "";
    private List<Pair<Type, String>> args;
    private ParseTree instructions;

    Function(Type type, String id, List<Pair<Type, String>> args, ParseTree instructions) {
        this.type = type;
        this.id = id;
        this.args = args;
        this.instructions = instructions;
    }

    public Type getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public List<Pair<Type, String>> getArgs() {
        return args;
    }

    public ParseTree getInstructions() {
        return instructions;
    }

    @Override
    public int hashCode() {
        return (/*type.hashCode()*/id.hashCode() /*+ args.hashCode() /*+ instructions.hashCode()*/) % 31;
    }

    @Override
    public boolean equals(Object obj) {
        return getClass().equals(obj.getClass())
                //&& type.equals(((Function) obj).type)
                && id.equals(((Function) obj).id);
                //&& args.equals(((Function) obj).args);
                //&& instructions.equals(((Function) obj).instructions);
    }
}
