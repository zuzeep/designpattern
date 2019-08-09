import create.simplefactory.Factory;
import create.simplefactory.Fish;
import org.junit.Test;

public class TestSimpleFactory {

    @Test
    public void testSimple() throws Exception{
        Fish dol = Factory.createFishApi("dolphin");
        dol.printName();
    }

}
