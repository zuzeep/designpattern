package creational.factorymethod.creator;

import creational.factorymethod.ExportFile;
import creational.factorymethod.ExportOperation;
import creational.factorymethod.product.ExportDBFile;

public class ExportDBOperation implements ExportOperation {
    @Override
    public ExportFile getFactoryMethod() {
        return new ExportDBFile("mysql db");
    }
}
