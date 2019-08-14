package creational.abstractfactory;

import creational.abstractfactory.cpu.CPU;
import creational.abstractfactory.factory.AbstractFactory;
import creational.abstractfactory.mainboard.MainBoard;

public class ComputerEngineer {

    public void makeComputer(AbstractFactory factory){
        prepareHardwares(factory);
    }

    private void prepareHardwares(AbstractFactory factory){
        CPU cpu = factory.createCPUFactory();
        MainBoard mainBoard = factory.createMainBoard();

        cpu.calculate();
        mainBoard.installCpu();
    }
}
