package behavioral.memento;

public class Originator {

    private String state = "";

    public Memento createMemento(){
        return new MementoImpl(state);
    }

    public void setMemento(Memento memento){
        MementoImpl mementoImpl = (MementoImpl)memento;
        state = mementoImpl.getState();
    }

    class MementoImpl implements Memento{

        private String state;

        public MementoImpl(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }
}
