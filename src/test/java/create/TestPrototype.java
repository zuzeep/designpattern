package create;

import create.prototype.Order;
import create.prototype.OrderBussiness;
import create.prototype.PersonOrder;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestPrototype {

    @Test
    public void testPrototype(){
        int num = 10000;
        Order order = new PersonOrder(0,"personal", num);
        List<Order> list = OrderBussiness.orderSplite(order);
        Assert.assertEquals(list.size(), num%100==0?num/100:num/100+1);
    }

    //TODO 如果一个用户在购物车包含多个商家的货源需要拆单，那应该如何实现？
}
