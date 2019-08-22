package behavioral.observer;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Register {

    private final static Logger logger = LoggerFactory.getLogger(Register.class);
    private static List<Observer> registers = Lists.newArrayList();

    public static void register(Observer cooker){
        registers.add(cooker);
    }

    private static Observer unregister(){
        return registers.remove(0);
    }

    public static void notify(Command command){
        if(registers.size() == 0){
            logger.info("no cooker right now, pls wait");
        }else {
            Observer cooker = unregister();
            cooker.update(command);
        }
    }
}
