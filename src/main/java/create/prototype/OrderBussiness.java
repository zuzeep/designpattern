package create.prototype;

import com.google.common.collect.Lists;

import java.util.List;

public class OrderBussiness {

    public static List<Order> orderSplite(Order order){
        List<Order> list = Lists.newLinkedList();
        while (order.getOrderNum() > 100){
            list.add(order.clone());
            order.setOrderNum(order.getOrderNum() - 100);
        }

        list.add(order);
        return list;
    }
}
