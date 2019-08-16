package structural.bridge.message;

import structural.bridge.Bean;
import structural.bridge.send.MessageSender;

public abstract class Message {
    protected final MessageSender sender;
    protected final Bean bean;

    public Message(MessageSender sender, Bean bean) {
        this.sender = sender;
        this.bean = bean;
    }

    public abstract void sendMessage();
}
