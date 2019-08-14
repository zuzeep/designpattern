package creational;

import creational.abstractfactory.ComputerEngineer;
import creational.abstractfactory.factory.AbstractFactory;
import creational.abstractfactory.factory.SchmeAM;
import org.junit.Test;

public class TestAbstractFactory {

    @Test
    public void testAbstractFactory(){
        ComputerEngineer engineer = new ComputerEngineer();
        AbstractFactory factory = new SchmeAM();

        engineer.makeComputer(factory);
    }
}
