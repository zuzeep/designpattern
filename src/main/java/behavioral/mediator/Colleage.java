package behavioral.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Colleage implements Mediator{

    private final static Logger logger = LoggerFactory.getLogger(Colleage.class);

    private Administration administration;
    private Finance finance;

    public void setAdministration(Administration administration) {
        this.administration = administration;
    }

    public void setFinance(Finance finance) {
        this.finance = finance;
    }

    @Override
    public void change(Department department) {
        if(department instanceof Administration){
            logger.info("collect Administration ...");
        }else if(department instanceof Finance){
            logger.info("collect Finance ...");
        }
    }
}
