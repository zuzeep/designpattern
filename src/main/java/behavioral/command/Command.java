package behavioral.command;

public interface Command {

    void execute();
    void setCook(Cook cook);
    int getTable();
}
