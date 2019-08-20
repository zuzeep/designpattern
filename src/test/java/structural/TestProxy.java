package structural;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import structural.proxy.SimpleQueue;
import structural.proxy.SimpleQueueProxy;

public class TestProxy {

    private final static Logger logger = LoggerFactory.getLogger(TestProxy.class);

    @Test
    public void testProxy(){
        SimpleQueue<String> queue = new SimpleQueueProxy<>();

        queue.offer("e1");
        queue.offer("e2");
        queue.offer("e3");

        String e;
        while ((e = queue.poll()) != null){
            logger.info(e);
        }
    }
}
