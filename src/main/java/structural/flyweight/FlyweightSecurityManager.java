package structural.flyweight;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.*;

public class FlyweightSecurityManager {

    private final static FlyweightSecurityManager manager = new FlyweightSecurityManager();

    private FlyweightSecurityManager(){}

    public static FlyweightSecurityManager getInstance(){ return manager; }

    private Map<String,Set<Flyweight>> maps = Maps.newConcurrentMap();

    public void loadUsers(List<String> users){
        for(String quote: users){
            String[] split = quote.split(",",2);
            String user = split[0];
            String state = split[1];

            Flyweight flyweight = FlyweightFactory.getFactory().createFlyweight(state);

            if(maps.containsKey(user)){
                maps.get(user).add(flyweight);
            }else {
                Set<Flyweight> sets = Sets.newConcurrentHashSet();
                sets.add(flyweight);
                maps.put(user,sets);
            }
        }
    }

    public boolean hasPermit(String user, String securityEntity, String permit){
        if(!maps.containsKey(user) || maps.get(user).isEmpty())
            return false;

        for(Flyweight flyweight : maps.get(user)){
            if(flyweight.match(securityEntity, permit))
                return true;
        }

        return false;
    }

    public List<Object> getPermits(String user){
        return new ArrayList<>(maps.get(user));
    }
}
