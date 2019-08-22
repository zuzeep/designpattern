package behavioral.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Waiter {

    private final static Logger logger = LoggerFactory.getLogger(Waiter.class);

    private int waiter;

    public Waiter(){
        waiter = Double.valueOf(3*Math.random()).intValue();
    }

    public void addCommand(int table){
        Cook cook = new HotCook("cook1");
        Command command = new FishCommand(table);
        command.setCook(cook);
        CommandQueue.addCommand(command);
        logger.info("waiter {} add table {} fish dish",waiter,command.getTable());
    }

    public void orderOver(){
        Command command = CommandQueue.peekCommand();
        command.execute();
    }
}
