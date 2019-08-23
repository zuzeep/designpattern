package structural.decorator;

public class SumPrizeDecorator extends Decorator{

    public SumPrizeDecorator(Component component) {
        super(component);
    }

    @Override
    public Double calcPrize(String user) {
        double prize =  super.calcPrize(user);

        double amount = TempDB.db.get(user);

        return prize+amount*0.006;
    }
}
