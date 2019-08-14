package creational.factorymethod.product;

import creational.factorymethod.ExportFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExportDBFile implements ExportFile {

    private final static Logger log = LoggerFactory.getLogger(ExportDBFile.class);

    private String dbName;

    public ExportDBFile(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public void export() {
        log.debug("import from db: {}",dbName);
    }
}
