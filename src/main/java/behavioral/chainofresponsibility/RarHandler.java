package behavioral.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RarHandler implements DecompressionHandler{

    private final static Logger logger = LoggerFactory.getLogger(RarHandler.class);

    private DecompressionHandler handler = null;

    @Override
    public void setNextHandler(DecompressionHandler handler){
        this.handler = handler;
    }

    @Override
    public void handle(String file) {
        if(file.endsWith(".rar")){
            logger.info("decompress file:{} by rar",file);
        }else {
            handler.handle(file);
        }
    }
}
