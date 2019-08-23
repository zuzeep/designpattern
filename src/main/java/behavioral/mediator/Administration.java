package behavioral.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Administration extends Department{
    private final static Logger logger = LoggerFactory.getLogger(Administration.class);

    public Administration(Mediator mediator) {
        super(mediator);
    }

    public void execute(){
        logger.info("department Administration send order");
        mediator.change(this);
    }
}
