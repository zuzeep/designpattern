package behavioral.chainofresponsibility;

public interface DecompressionHandler {

    void setNextHandler(DecompressionHandler handler);

    default void handle(String file){
        throw new UnsupportedOperationException("con't decompress file:"+file);
    }
}
