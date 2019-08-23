package behavioral.iterator.Manager;

import behavioral.iterator.model.PayModel;
import com.google.common.collect.Lists;

import java.util.List;

public class PayManager {

    private List<PayModel> pays = Lists.newArrayList();

    public PayManager(){
        pays.add(new PayModel("pay_1",1000.0));
        pays.add(new PayModel("pay_2",1200.0));
    }

    public void addPay(PayModel model){
        pays.add(model);
    }

    public List<PayModel> getPayList(){
        return pays;
    }
}
