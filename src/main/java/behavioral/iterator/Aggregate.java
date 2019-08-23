package behavioral.iterator;

import behavioral.iterator.model.PayModel;

import java.util.List;

public interface Aggregate {

    WagesIterator createIterator();
    int length();
    List<PayModel> getItems();
    void addItem(PayModel model);
    PayModel get(int i);
}
