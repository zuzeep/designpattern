package structural.flyweight;

import com.google.common.collect.Maps;

import java.util.Map;

public class FlyweightFactory {

    private static FlyweightFactory factory = new FlyweightFactory();

    private FlyweightFactory(){}

    private Map<String,Flyweight> flyweightMap = Maps.newConcurrentMap();

    public static FlyweightFactory getFactory(){
        return factory;
    }

    public Flyweight createFlyweight(String state){
        Flyweight flyweight;

        if(!flyweightMap.containsKey(state)){
            flyweight = new AuthorizationFlyweight(state);
            flyweightMap.put(state, flyweight);
        }else{
            flyweight = this.getFlyweight(state);
        }

        return flyweight;
    }

    public Flyweight getFlyweight(String state){
        return flyweightMap.get(state);
    }
}
