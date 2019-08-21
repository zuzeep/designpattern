package behavioral.template;

import java.util.Collections;
import java.util.List;

public class ListTemplate {

    public List<Double> handle(List<Double> source, ListFunction function){
        if(source == null || source.size() == 0){
            return Collections.emptyList();
        }else if(source.size() == 1){
            return source;
        }else return function.func(source);
    }
}
