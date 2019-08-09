package create.abstractfactory.factory;

import create.abstractfactory.cpu.CPU;
import create.abstractfactory.mainboard.MainBoard;

public interface AbstractFactory {

    CPU createCPUFactory();

    MainBoard createMainBoard();
}
