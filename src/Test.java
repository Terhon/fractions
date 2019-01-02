import fractions.*;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        CharStream input = null;
        try {
            input = CharStreams.fromFileName("test_fractions");
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        fractionsLexer lex = new fractionsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        fractionsParser parser = new fractionsParser(tokens);
        ParseTree t = parser.program();
        fractionsBaseVisitor visitor = new ProgramVisitor();
       // visitor.visit(t);

        JFrame frame = new JFrame("Tree");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), t);
        viewer.setScale(1.5);
        panel.add(viewer);
        JScrollPane scrollPane = new JScrollPane(panel);
        frame.add(scrollPane);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1000,500);
        frame.setVisible(true);
    }

}
