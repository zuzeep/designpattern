package behavioral.observer;

public class FishCommand implements Command{

    private String name;

    public FishCommand(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
