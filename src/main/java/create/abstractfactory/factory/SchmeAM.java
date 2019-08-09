package create.abstractfactory.factory;

import create.abstractfactory.cpu.AMDCPU;
import create.abstractfactory.cpu.CPU;
import create.abstractfactory.mainboard.MainBoard;
import create.abstractfactory.mainboard.MsiMainBoard;

public class SchmeAM implements AbstractFactory{
    @Override
    public CPU createCPUFactory() {
        return new AMDCPU(128);
    }

    @Override
    public MainBoard createMainBoard() {
        return new MsiMainBoard(2);
    }
}
