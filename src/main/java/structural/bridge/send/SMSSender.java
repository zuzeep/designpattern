package structural.bridge.send;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import structural.bridge.Bean;


public class SMSSender implements MessageSender{

    private static final Logger logger = LoggerFactory.getLogger(SMSSender.class);

    @Override
    public void send(Bean bean) {
        logger.info("{} from:{} to:{} context:{}",SMSSender.class.getName(),bean.getFrom(),bean.getTo(),bean.getContext());
    }
}
