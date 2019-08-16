package structural.bridge.send;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import structural.bridge.Bean;

public class PhoneSender implements MessageSender{

    private static final Logger logger = LoggerFactory.getLogger(PhoneSender.class);

    @Override
    public void send(Bean bean) {
        logger.info("{} from:{} to:{} context:{}",PhoneSender.class.getName(),bean.getFrom(),bean.getTo(),bean.getContext());
    }
}
