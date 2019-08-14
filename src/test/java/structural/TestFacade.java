package structural;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import structural.facade.GenerateFacade;

public class TestFacade {
    private final static Logger logger = LoggerFactory.getLogger(TestFacade.class);

    @Test
    public void testFacade(){
        GenerateFacade.facade();
        logger.info("facade success.....");
    }
}
