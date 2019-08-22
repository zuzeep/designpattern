package behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CloseState implements TcpState{

    private static final Logger logger = LoggerFactory.getLogger(CloseState.class);

    @Override
    public void handle() {
        logger.info("close tcp handle...");
    }
}
