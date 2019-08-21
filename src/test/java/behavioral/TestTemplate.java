package behavioral;

import behavioral.template.ListTemplate;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.List;

/**
 * 模板模式的另类实现，定义接口回调，在引用时实现算法
 */
public class TestTemplate {

    private final static Logger logger = LoggerFactory.getLogger(TestTemplate.class);

    @Test
    public  void  testTemplate(){
        List<Double> list = Lists.newArrayList(10.0,7.4,0.0,5.1);

        ListTemplate template = new ListTemplate();

        List<Double> head = template.handle(list, source -> source.subList(0,1));
        List<Double> sum = template.handle(list, source ->
                Lists.newArrayList(source.stream().mapToDouble(i->i.doubleValue()).sum()));
        List<Double> reduces = template.handle(list, source -> {
            List<Double> reduce = Lists.newArrayList();
            for(int i=1; i<source.size(); i++){
                BigDecimal fir = new BigDecimal(source.get(i-1));
                BigDecimal sec = new BigDecimal(source.get(i));

                reduce.add((fir.subtract(sec)).doubleValue());
            }
            return reduce;
        });

        logger.info("head: {}",Joiner.on(",").join(head));
        logger.info("sum: {}",Joiner.on(",").join(sum));
        logger.info("reduce: {}",Joiner.on(",").join(reduces));
    }
}
