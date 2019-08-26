package behavioral;

import behavioral.memento.Caretaker;
import behavioral.memento.Memento;
import behavioral.memento.Originator;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMemento {

    private final static Logger logger = LoggerFactory.getLogger(TestMemento.class);

    @Test
    public void testMemento(){
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        Memento memento = originator.createMemento();
        caretaker.saveMemento(memento);

        logger.info("memento test");
    }
}
