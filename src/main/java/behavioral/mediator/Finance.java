package behavioral.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Finance extends Department{
    private final static Logger logger = LoggerFactory.getLogger(Finance.class);

    public Finance(Mediator mediator) {
        super(mediator);
    }

    public void execute(){
        logger.info("department Finance send order");
        mediator.change(this);
    }
}
