package create.factorymethod.creator;

import create.factorymethod.ExportFile;
import create.factorymethod.ExportOperation;
import create.factorymethod.product.ExportTxtFile;

public class ExportTxtOperation implements ExportOperation {
    @Override
    public ExportFile getFactoryMethod() {
        return new ExportTxtFile(001L);
    }
}
