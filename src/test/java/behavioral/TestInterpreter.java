package behavioral;

import behavioral.interpreter.Context;
import behavioral.interpreter.ElementExpression;
import behavioral.interpreter.ElementTerminalExpression;
import com.google.common.base.Joiner;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestInterpreter {

    private final static Logger logger = LoggerFactory.getLogger(TestInterpreter.class);

    @Test
    public void testInterpreter(){
        String filePath = "files/temp.xml";

        Context context = new Context(filePath);

        ElementExpression root = new ElementExpression("root");
        ElementExpression a = new ElementExpression("a");
        ElementExpression b = new ElementExpression("b");
        ElementTerminalExpression c = new ElementTerminalExpression("d");

        root.addExpression(a);
        a.addExpression(b);
        b.addExpression(c);

        logger.info("{}",Joiner.on(",").join(root.interpret(context)));
    }
}
