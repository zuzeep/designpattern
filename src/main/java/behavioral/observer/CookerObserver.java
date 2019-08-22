package behavioral.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CookerObserver implements Observer {

    private final static Logger logger = LoggerFactory.getLogger(CookerObserver.class);

    private String cooker;

    public CookerObserver(String cooker){
        this.cooker = cooker;
    }

    @Override
    public void update(Command command) {
        logger.info("{} cook {}",cooker,command.getName());
    }
}
