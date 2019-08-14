package creational.factorymethod;

public interface ExportOperation {

    ExportFile getFactoryMethod();

    default void exportFileOperation(){
        ExportFile factory = getFactoryMethod();
        factory.export();
    }
}
