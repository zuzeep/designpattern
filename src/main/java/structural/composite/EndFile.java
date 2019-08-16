package structural.composite;

public class EndFile implements Component{

    private String name;
    private Component parent;

    public EndFile(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setParent(Component component) {
        this.parent = component;
    }

    @Override
    public Component getParent() {
        return parent;
    }
}
