package behavioral;

import behavioral.strategy.HeadFunction;
import behavioral.strategy.ListStrategy;
import behavioral.strategy.ReduceFunction;
import behavioral.strategy.SumFunction;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class TestStrategy {

    private final static Logger logger = LoggerFactory.getLogger(TestStrategy.class);

    /**
     * 模板模式应该更适合
     */
    @Test
    public void testStrategy(){
        List<Double> list = Lists.newArrayList(10.0,7.4,0.0,5.1);

        ListStrategy head = new HeadFunction();
        ListStrategy sum = new SumFunction();
        ListStrategy reduce = new ReduceFunction();

        logger.info("list: {}",Joiner.on(",").join(list));
        logger.info("head: {}",Joiner.on(",").join(head.func(list)));
        logger.info("sum: {}",Joiner.on(",").join(sum.func(list)));
        logger.info("reduce: {}",Joiner.on(",").join(reduce.func(list)));
    }
}
