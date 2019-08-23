package behavioral;

import behavioral.iterator.Aggregate;
import behavioral.iterator.WagesIterator;
import behavioral.iterator.adapter.PayAdapter;
import behavioral.iterator.adapter.SalaryAdapter;
import behavioral.iterator.impl.WagesIteratorImpl;
import behavioral.iterator.model.PayModel;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestIterator {

    private final static Logger logger = LoggerFactory.getLogger(TestIterator.class);

    @Test
    public void testIterator(){
        logger.info("start test iterator....");

        WagesIterator payIterator = new WagesIteratorImpl(new PayAdapter());
        WagesIterator salayIterator = new WagesIteratorImpl(new SalaryAdapter());

        while (payIterator.hasNext()){
            PayModel model = ((WagesIteratorImpl) payIterator).getModel();
            logger.info("name:{},wages:{}", model.getName(), model.getPay());
            payIterator.next();
        }
    }
}
