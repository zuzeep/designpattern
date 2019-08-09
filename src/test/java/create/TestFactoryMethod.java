package create;

import create.factorymethod.ExportOperation;
import create.factorymethod.creator.ExportDBOperation;
import org.junit.Test;

public class TestFactoryMethod {

    @Test
    public void testFactoryMethod(){
        ExportOperation operation = new ExportDBOperation();

        operation.exportFileOperation();
    }
}
