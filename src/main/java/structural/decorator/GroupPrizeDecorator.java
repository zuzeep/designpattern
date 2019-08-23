package structural.decorator;

public class GroupPrizeDecorator extends Decorator{

    public GroupPrizeDecorator(Component component) {
        super(component);
    }

    @Override
    public Double calcPrize(String user) {
        double prize =  super.calcPrize(user);

        Double amount = 0.0;

        for(double value : TempDB.db.values()){
            amount += value;
        }

        return prize+amount*0.0006;
    }
}
