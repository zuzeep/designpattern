package behavioral.iterator.impl;

import behavioral.iterator.Aggregate;
import behavioral.iterator.WagesIterator;
import behavioral.iterator.model.PayModel;

public class WagesIteratorImpl implements WagesIterator<Aggregate> {

    private Aggregate aggregate;
    private int index;

    public WagesIteratorImpl(Aggregate aggregate) {
        this.aggregate = aggregate;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index >= aggregate.length()){
            return false;
        }else return true;
    }

    @Override
    public Aggregate next() {
        if(index < aggregate.length()){
            index++;
        }
        return aggregate;
    }

    public PayModel getModel(){
        return aggregate.get(index);
    }
}
