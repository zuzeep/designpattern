package structural.bridge.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import structural.bridge.Bean;
import structural.bridge.send.MessageSender;

public class UrgencyMessage extends Message{

    private final static Logger logger = LoggerFactory.getLogger(UrgencyMessage.class);

    public UrgencyMessage(MessageSender sender, Bean bean) {
        super(sender, bean);
    }

    @Override
    public void sendMessage() {
        logger.info("send : {}",UrgencyMessage.class.getName());
        watch();
        sender.send(bean);
    }

    private void watch(){
        logger.info("notify watch: {}", bean.getFrom());
    }
}
