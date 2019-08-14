package creational.simplefactory;

public interface Fish {

    default void printName() throws Exception{
        throw new Exception("fish don't init");
    };
}
