package create.abstractfactory.cpu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AMDCPU implements CPU{
    private static final Logger log = LoggerFactory.getLogger(AMDCPU.class);

    private int pins;

    public AMDCPU(int pins){
        this.pins = pins;
    }

    @Override
    public void calculate() {
        log.debug("amd cpu pins:{}", pins);
    }
}
