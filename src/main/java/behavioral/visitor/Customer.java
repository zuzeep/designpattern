package behavioral.visitor;

public interface Customer {

    String getName();

    void accept(Visitor visitor);
}
