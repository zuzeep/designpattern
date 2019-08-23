package behavioral.iterator.model;

public class PayModel {

    private String name;
    private double pay;

    public PayModel(String name, double pay) {
        this.name = name;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public double getPay() {
        return pay;
    }
}
