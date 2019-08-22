package behavioral;

import behavioral.command.Waiter;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO 命令模式大有可为，添加宏命令，多线程处理cook？
 */
public class TestCommand {

    private final static Logger logger = LoggerFactory.getLogger(TestCommand.class);

    @Test
    public void testCommand(){
        int table = 1;
        for(;table<5;table++){
            Waiter waiter = new Waiter();
            waiter.addCommand(table);
            waiter.orderOver();
        }
    }
}
