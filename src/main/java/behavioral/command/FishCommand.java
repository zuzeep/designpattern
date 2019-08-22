package behavioral.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FishCommand implements Command{

    private final static Logger logger = LoggerFactory.getLogger(FishCommand.class);
    private Cook cook;
    private int tableName;

    public FishCommand(int tableName){
        this.tableName = tableName;
    }

    @Override
    public void execute() {
        cook.cookDish(tableName, "fish dish");
    }

    @Override
    public void setCook(Cook cook) {
        this.cook = cook;
    }

    @Override
    public int getTable() {
        return tableName;
    }
}
