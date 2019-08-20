package behavioral.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TarHandler implements DecompressionHandler{

    private final static Logger logger = LoggerFactory.getLogger(TarHandler.class);

    private DecompressionHandler handler = null;

    @Override
    public void setNextHandler(DecompressionHandler handler){
        this.handler = handler;
    }

    @Override
    public void handle(String file) {
        if(file.endsWith(".tar")){
            logger.info("decompress file:{} by tar",file);
        }else {
            handler.handle(file);
        }
    }
}
