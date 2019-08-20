package behavioral.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GzipHandler implements DecompressionHandler{

    private final static Logger logger = LoggerFactory.getLogger(GzipHandler.class);

    private DecompressionHandler handler = null;

    @Override
    public void setNextHandler(DecompressionHandler handler){
        this.handler = handler;
    }

    @Override
    public void handle(String file) {
        if(file.endsWith(".gz")){
            logger.info("decompress file:{} by gz",file);
        }else {
            handler.handle(file);
        }
    }
}
