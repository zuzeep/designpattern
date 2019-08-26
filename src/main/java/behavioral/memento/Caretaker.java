package behavioral.memento;

public class Caretaker {

    private Memento memento = null;

    public Memento retireMemento() {
        return memento;
    }

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}
