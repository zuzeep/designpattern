package behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AcceptState implements TcpState{

    private static final Logger logger = LoggerFactory.getLogger(AcceptState.class);

    @Override
    public void handle() {
        logger.info("accept tcp handle...");
    }
}
