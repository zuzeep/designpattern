package behavioral.iterator.adapter;

import behavioral.iterator.Aggregate;
import behavioral.iterator.Manager.SalayManager;
import behavioral.iterator.WagesIterator;
import behavioral.iterator.impl.WagesIteratorImpl;
import behavioral.iterator.model.PayModel;
import com.google.common.collect.Lists;

import java.util.List;

public class SalaryAdapter implements Aggregate {

    private SalayManager salayManager;

    public SalaryAdapter(){
        salayManager = new SalayManager();
    }

    @Override
    public WagesIterator createIterator() {
        return new WagesIteratorImpl(this);
    }

    @Override
    public int length() {
        return salayManager.getSalaries().length;
    }

    @Override
    public List<PayModel> getItems() {
        return Lists.newArrayList(salayManager.getSalaries());
    }

    @Override
    public void addItem(PayModel model) {
        salayManager.addSalary(model);
    }

    @Override
    public PayModel get(int i) {
        return salayManager.getSalaries()[i];
    }
}
