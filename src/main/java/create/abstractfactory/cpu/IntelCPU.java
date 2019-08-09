package create.abstractfactory.cpu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntelCPU implements CPU{
    private static final Logger log = LoggerFactory.getLogger(IntelCPU.class);

    private int pins;

    public IntelCPU(int pins){
        this.pins = pins;
    }

    @Override
    public void calculate() {
        log.debug("amd cpu pins:{}", pins);
    }
}
