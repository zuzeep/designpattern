package structural;

import org.junit.Test;
import structural.bridge.MessageFacade;

/**
 * 这种情况下反而抽象工厂模式更适合
 */
public class TestBridge {

    @Test
    public void testBridge(){
        MessageFacade facade = new MessageFacade("mi","123 mu tou ren","wei");
        facade.sendNormalToAll();
        facade.sendUrgencyToAll();
    }
}
