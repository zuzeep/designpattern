package create.abstractfactory.factory;

import create.abstractfactory.cpu.CPU;
import create.abstractfactory.cpu.IntelCPU;
import create.abstractfactory.mainboard.LogiMainBoard;
import create.abstractfactory.mainboard.MainBoard;

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
