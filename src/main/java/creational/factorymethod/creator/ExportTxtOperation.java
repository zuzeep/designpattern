package creational.factorymethod.creator;

import creational.factorymethod.ExportFile;
import creational.factorymethod.ExportOperation;
import creational.factorymethod.product.ExportTxtFile;

public class ExportTxtOperation implements ExportOperation {
    @Override
    public ExportFile getFactoryMethod() {
        return new ExportTxtFile(001L);
    }
}
