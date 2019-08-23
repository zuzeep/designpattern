package behavioral.mediator;

public abstract class Department {

    protected Mediator mediator;

    public Department(Mediator mediator) {
        this.mediator = mediator;
    }
}
