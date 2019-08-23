package structural;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import structural.decorator.*;

public class TestDecorator {

    private static final Logger logger = LoggerFactory.getLogger(TestDecorator.class);

    @Test
    public void testDecorator(){
        Component base = new BaseComponent();

        Component month = new MonthPrizeDecorator(base);
        Component sum = new SumPrizeDecorator(month);
        Component group = new GroupPrizeDecorator(sum);

        logger.info("user: {} , prize: {}","e1",sum.calcPrize("e1"));
        logger.info("user: {} , prize: {}","e2",sum.calcPrize("e2"));
        logger.info("user: {} , prize: {}","m1",group.calcPrize("m1"));

    }
}
