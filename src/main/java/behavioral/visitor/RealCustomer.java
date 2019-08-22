package behavioral.visitor;

public class RealCustomer implements Customer{

    private String name;

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
