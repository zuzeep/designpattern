package creational.builder;

public interface Builder {

    void buildHead();
    void buildBody();
    void buildFooter();
    Object getContext();

    default void buildPart(){
        this.buildHead();
        this.buildBody();
        this.buildFooter();
    }
}
