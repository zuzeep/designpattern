package structural.decorator;

public class Decorator implements Compenent{

    private Compenent compenent;

    public Decorator(Compenent compenent){
        this.compenent = compenent;
    }

    @Override
    public Double calcPrize(String user) {
        return compenent.calcPrize(user);
    }
}
