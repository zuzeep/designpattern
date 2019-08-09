package create;

import create.abstractfactory.ComputerEngineer;
import create.abstractfactory.factory.AbstractFactory;
import create.abstractfactory.factory.SchmeAM;
import org.junit.Test;

public class TestAbstractFactory {

    @Test
    public void testAbstractFactory(){
        ComputerEngineer engineer = new ComputerEngineer();
        AbstractFactory factory = new SchmeAM();

        engineer.makeComputer(factory);
    }
}
