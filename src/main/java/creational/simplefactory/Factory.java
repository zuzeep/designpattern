package creational.simplefactory;

import creational.simplefactory.impl.Carp;
import creational.simplefactory.impl.Dolphin;

public class Factory {

    public static Fish createFishApi(String fish){
        if(fish.equals("dolphin")){
            return new Dolphin();
        }else if(fish.equals("carp")){
            return new Carp();
        }

        return new Fish() {};
    }
}
