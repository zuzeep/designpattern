package structural;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import structural.flyweight.FlyweightSecurityManager;
import structural.flyweight.TempDB;

public class TestFlyweight {

    private final static Logger logger = LoggerFactory.getLogger(TestFlyweight.class);

    @Test
    public void testFlyweight(){
        FlyweightSecurityManager manager = FlyweightSecurityManager.getInstance();
        manager.loadUsers(TempDB.db);

        boolean permitE1 = manager.hasPermit("e1","query","wage");
        boolean permitE2 = manager.hasPermit("e1","modify","wage");
        boolean permitM1 = manager.hasPermit("m1","query","wage");
        boolean permitM2 = manager.hasPermit("m1","modify","wage");

        logger.info("{},{},{},{}",permitE1,permitE2,permitM1,permitM2);
    }
}
