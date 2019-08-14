package creational.abstractfactory.factory;

import creational.abstractfactory.cpu.CPU;
import creational.abstractfactory.cpu.IntelCPU;
import creational.abstractfactory.mainboard.LogiMainBoard;
import creational.abstractfactory.mainboard.MainBoard;

public class SchmeIL implements AbstractFactory{
    @Override
    public CPU createCPUFactory() {
        return new IntelCPU(256);
    }

    @Override
    public MainBoard createMainBoard() {
        return new LogiMainBoard(4);
    }
}
