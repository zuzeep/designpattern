package creational.factorymethod.product;

import creational.factorymethod.ExportFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExportTxtFile implements ExportFile {

    private final static Logger log = LoggerFactory.getLogger(ExportTxtFile.class);

    private long fileSeries;

    public ExportTxtFile(long fileSeries) {
        this.fileSeries = fileSeries;
    }

    @Override
    public void export() {
        log.debug("import from file series: {}",fileSeries);
    }
}
