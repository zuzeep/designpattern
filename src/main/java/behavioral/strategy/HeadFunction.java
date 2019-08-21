package behavioral.strategy;

import java.util.Collections;
import java.util.List;

public class HeadFunction implements ListStrategy{
    @Override
    public List<Double> func(List<Double> params) {
        if(params == null || params.size() == 0){
            return Collections.emptyList();
        }else {
            return params.subList(0,1);
        }
    }
}
