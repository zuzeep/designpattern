package create.abstractfactory;

import create.abstractfactory.cpu.CPU;
import create.abstractfactory.factory.AbstractFactory;
import create.abstractfactory.mainboard.MainBoard;

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
