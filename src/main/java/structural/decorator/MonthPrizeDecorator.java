package structural.decorator;

public class MonthPrizeDecorator extends Decorator{

    public MonthPrizeDecorator(Component component) {
        super(component);
    }

    @Override
    public Double calcPrize(String user) {
        double prize =  super.calcPrize(user);

        double amount = TempDB.db.get(user);

        return prize+amount*0.003;
    }
}
