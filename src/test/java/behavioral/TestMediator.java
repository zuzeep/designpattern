package behavioral;

import behavioral.mediator.*;
import org.junit.Test;

public class TestMediator {

    @Test
    public void testMediator(){
        Mediator mediator = new Colleage();
        Department admin = new Administration(mediator);
        Department finance = new Finance(mediator);

        ((Administration) admin).execute();
        ((Finance) finance).execute();
    }
}
