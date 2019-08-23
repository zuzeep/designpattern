package structural.decorator;

public class BaseComponent implements Component {
    @Override
    public Double calcPrize(String user) {
        return 0.0;
    }
}
