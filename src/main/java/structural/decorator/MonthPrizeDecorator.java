package structural.decorator;

public class MonthPrizeDecorator extends Decorator{

    public MonthPrizeDecorator(Compenent compenent) {
        super(compenent);
    }

    @Override
    public Double calcPrize(String user) {
        double prize =  super.calcPrize(user);

        double amount = TempDB.db.get(user);

        return prize+amount*0.003;
    }
}
