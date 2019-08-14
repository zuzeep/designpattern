package creational.abstractfactory.factory;

import creational.abstractfactory.cpu.CPU;
import creational.abstractfactory.mainboard.MainBoard;

public interface AbstractFactory {

    CPU createCPUFactory();

    MainBoard createMainBoard();
}
