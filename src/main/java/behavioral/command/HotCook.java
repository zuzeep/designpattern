package behavioral.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * hot dish cooker
 */
public class HotCook implements Cook{

    private final static Logger logger = LoggerFactory.getLogger(HotCook.class);

    private String cooker;

    public HotCook(String cooker){
        this.cooker = cooker;
    }

    @Override
    public void cookDish(int tableOrder, String dish) {
        int cookTime = Double.valueOf(5*Math.random()).intValue();
        logger.info("{} start cook fish.....", cooker);
        try{
            Thread.sleep(cookTime*1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        logger.info(" {} cook fish take {} minutes", cooker, cookTime);
    }
}
