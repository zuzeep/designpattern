package behavioral.strategy;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumFunction implements ListStrategy{
    @Override
    public List<Double> func(List<Double> params) {
        if(params == null || params.size() == 0){
            return Collections.emptyList();
        }else {
            return Lists.newArrayList(params.stream().mapToDouble(i->i.doubleValue()).sum());
        }
    }
}
