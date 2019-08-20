package behavioral;

import behavioral.chainofresponsibility.*;
import org.junit.Test;

public class TestChainOfResponsibility {

    @Test
    public void testChainOfResponsibility(){
        DecompressionHandler defaultHandler = new DefaultHandler();
        DecompressionHandler gzipHandler = new GzipHandler();
        DecompressionHandler rarHandler = new RarHandler();
        DecompressionHandler tarHandler = new TarHandler();
        DecompressionHandler zipHandler = new ZipHandler();

        zipHandler.setNextHandler(tarHandler);
        tarHandler.setNextHandler(rarHandler);
        rarHandler.setNextHandler(gzipHandler);
        gzipHandler.setNextHandler(defaultHandler);

        zipHandler.handle("test.gz");
        zipHandler.handle("test.rar");
    }
}
