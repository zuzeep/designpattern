package create.simplefactory.impl;

import create.simplefactory.Fish;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Carp implements Fish {
    private final static Logger log = LoggerFactory.getLogger(Carp.class);

    @Override
    public void printName(){
        log.info("dolphin come from river");
    }
}
