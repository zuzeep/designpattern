package structural.facade.generate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Business implements Generate{

    private final static Logger log = LoggerFactory.getLogger(Business.class);

    @Override
    public void generate() {
        log.info("generate : {}", this.getClass().getName());
    }

    @Override
    public void close() {
        log.info("close : {}", this.getClass().getName());
    }
}
