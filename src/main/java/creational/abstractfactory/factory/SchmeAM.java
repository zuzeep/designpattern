package creational.abstractfactory.factory;

import creational.abstractfactory.cpu.AMDCPU;
import creational.abstractfactory.cpu.CPU;
import creational.abstractfactory.mainboard.MainBoard;
import creational.abstractfactory.mainboard.MsiMainBoard;

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
