package behavioral.observer;

public class CommandManager {

    private final static CommandManager manager = new CommandManager();

    private CommandManager(){}

    public static CommandManager getInterance(){
        return manager;
    }

    public void addCommand(Command command){
        Register.notify(command);
    }
}
