package creational.abstractfactory.mainboard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MsiMainBoard implements MainBoard{
    private static final Logger log = LoggerFactory.getLogger(MsiMainBoard.class);

    private int cpuHoles;

    public MsiMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu() {
        log.debug("msi mainboard install {} cpu", cpuHoles);
    }
}
