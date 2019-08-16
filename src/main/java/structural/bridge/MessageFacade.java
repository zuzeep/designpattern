package structural.bridge;

import structural.bridge.message.Message;
import structural.bridge.message.NormalMessage;
import structural.bridge.message.UrgencyMessage;
import structural.bridge.send.MessageSender;
import structural.bridge.send.PhoneSender;
import structural.bridge.send.SMSSender;

/**
 * 外观模式，封装复杂性
 */
public class MessageFacade {

    private Bean bean;

    public MessageFacade(String from, String context, String to) {
        this.bean = new Bean();
        bean.setFrom(from);
        bean.setContext(context);
        bean.setTo(to);
    }

    public void sendNormalToAll(){
        sendNormalToSMS();
        sendNormalToPhone();
    }

    public void sendUrgencyToAll(){
        sendUrgencyToSMS();
        sendUrgencyToPhone();
    }

    public void sendNormalToSMS(){
        MessageSender sender = new SMSSender();
        Message message = new NormalMessage(sender, bean);

        message.sendMessage();
    }

    public void sendNormalToPhone(){
        MessageSender sender = new PhoneSender();
        Message message = new NormalMessage(sender, bean);

        message.sendMessage();
    }

    public void sendUrgencyToSMS(){
        MessageSender sender = new SMSSender();
        Message message = new UrgencyMessage(sender, bean);

        message.sendMessage();
    }

    public void sendUrgencyToPhone(){
        MessageSender sender = new PhoneSender();
        Message message = new UrgencyMessage(sender, bean);

        message.sendMessage();
    }
}
