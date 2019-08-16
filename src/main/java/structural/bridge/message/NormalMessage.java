package structural.bridge.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import structural.bridge.Bean;
import structural.bridge.send.MessageSender;

public class NormalMessage extends Message{

    private final static Logger logger = LoggerFactory.getLogger(NormalMessage.class);

    public NormalMessage(MessageSender sender, Bean bean) {
        super(sender, bean);
    }

    @Override
    public void sendMessage() {
        logger.info("send : {}",NormalMessage.class.getName());
        sender.send(bean);
    }
}
