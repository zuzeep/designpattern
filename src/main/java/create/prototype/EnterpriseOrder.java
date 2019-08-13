package create.prototype;

public class EnterpriseOrder implements Order{

    private int id;
    private String name;
    private long orderNum;

    public EnterpriseOrder(int id, String name, long orderNum) {
        this.id = id;
        this.name = name;
        this.orderNum = orderNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(long orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public Order clone() {
        EnterpriseOrder prototype = new EnterpriseOrder(this.id, this.name, this.orderNum);
        prototype.setOrderNum(Math.abs(1000));
        return prototype;
    }
}
