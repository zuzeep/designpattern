package create.abstractfactory.mainboard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogiMainBoard implements MainBoard{
    private static final Logger log = LoggerFactory.getLogger(LogiMainBoard.class);

    private int cpuHoles;

    public LogiMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu() {
        log.debug("logi mainboard install {} cpu", cpuHoles);
    }
}
