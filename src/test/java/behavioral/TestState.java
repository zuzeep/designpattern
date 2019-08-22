package behavioral;

import behavioral.state.*;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestState {

    private final static Logger logger = LoggerFactory.getLogger(TestState.class);

    @Test
    public void testState(){
        TcpState start = new StartState();
        TcpState accept = new AcceptState();
        TcpState close = new CloseState();

        TcpContext context = new TcpContext();

        context.setTcp(start);
        context.request();
        context.setTcp(accept);
        context.request();
        context.setTcp(close);
        context.request();
    }
}
