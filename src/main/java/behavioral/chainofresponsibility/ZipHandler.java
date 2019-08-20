package behavioral.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZipHandler implements DecompressionHandler{

    private final static Logger logger = LoggerFactory.getLogger(ZipHandler.class);

    private DecompressionHandler handler = null;

    @Override
    public void setNextHandler(DecompressionHandler handler){
        this.handler = handler;
    }

    @Override
    public void handle(String file) {
        if(file.endsWith(".zip")){
            logger.info("decompress file:{} by zip",file);
        }else {
            handler.handle(file);
        }
    }
}
