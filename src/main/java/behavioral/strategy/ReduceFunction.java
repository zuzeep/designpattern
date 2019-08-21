package behavioral.strategy;

import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

public class ReduceFunction implements ListStrategy{
    @Override
    public List<Double> func(List<Double> params) {
        if(params == null || params.size() == 0){
            return Collections.emptyList();
        }else if(params.size() == 1){
            return params;
        }else {
            List<Double> reduce = Lists.newArrayList();
            for(int i=1; i<params.size(); i++){
                BigDecimal fir = new BigDecimal(params.get(i-1));
                BigDecimal sec = new BigDecimal(params.get(i));

                reduce.add((fir.subtract(sec)).doubleValue());
            }
            return reduce;
        }
    }
}
