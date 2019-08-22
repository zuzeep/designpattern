package behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StartState implements TcpState{

    private static final Logger logger = LoggerFactory.getLogger(StartState.class);

    @Override
    public void handle() {
        logger.info("start tcp handle...");
    }
}
