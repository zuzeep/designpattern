package structural.decorator;

public class Decorator implements Component {

    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public Double calcPrize(String user) {
        return component.calcPrize(user);
    }
}
