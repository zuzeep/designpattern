package creational;

import creational.factorymethod.ExportOperation;
import creational.factorymethod.creator.ExportDBOperation;
import org.junit.Test;

public class TestFactoryMethod {

    @Test
    public void testFactoryMethod(){
        ExportOperation operation = new ExportDBOperation();

        operation.exportFileOperation();
    }
}
