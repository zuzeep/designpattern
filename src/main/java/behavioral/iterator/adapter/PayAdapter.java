package behavioral.iterator.adapter;

import behavioral.iterator.Aggregate;
import behavioral.iterator.Manager.PayManager;
import behavioral.iterator.WagesIterator;
import behavioral.iterator.impl.WagesIteratorImpl;
import behavioral.iterator.model.PayModel;

import java.util.List;

public class PayAdapter implements Aggregate {

    private PayManager payManager;

    public PayAdapter(){
        this.payManager = new PayManager();
    }

    @Override
    public WagesIterator createIterator() {
        return new WagesIteratorImpl(this);
    }

    @Override
    public int length() {
        return payManager.getPayList().size();
    }

    @Override
    public List<PayModel> getItems() {
        return payManager.getPayList();
    }

    @Override
    public void addItem(PayModel model) {
        payManager.addPay(model);
    }

    @Override
    public PayModel get(int i) {
        return payManager.getPayList().get(i);
    }
}
