package creational.simplefactory.impl;

import creational.simplefactory.Fish;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dolphin implements Fish {
    private final static Logger log = LoggerFactory.getLogger(Dolphin.class);

    @Override
    public void printName(){
        log.info("dolphin come from ocean");
    }
}
