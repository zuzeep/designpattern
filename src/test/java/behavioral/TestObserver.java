package behavioral;

import behavioral.observer.*;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestObserver {

    private final static Logger logger = LoggerFactory.getLogger(TestObserver.class);

    @Test
    public void testObserver(){
        Observer c1 = new CookerObserver("c1");
        Observer c2 = new CookerObserver("c2");

        Register.register(c1);
        Register.register(c2);

        CommandManager manager = CommandManager.getInterance();

        for(int i=0;i<3;i++){
            Command command = new FishCommand(String.valueOf(i));
            manager.addCommand(command);
        }
    }
}
