package create.factorymethod.creator;

import create.factorymethod.ExportFile;
import create.factorymethod.ExportOperation;
import create.factorymethod.product.ExportDBFile;

public class ExportDBOperation implements ExportOperation {
    @Override
    public ExportFile getFactoryMethod() {
        return new ExportDBFile("mysql db");
    }
}
