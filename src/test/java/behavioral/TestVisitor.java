package behavioral;

import behavioral.visitor.Customer;
import behavioral.visitor.RealCustomer;
import behavioral.visitor.RealVisitor;
import behavioral.visitor.Visitor;
import org.junit.Test;

public class TestVisitor {

    @Test
    public void testVisitor(){
        Visitor visitor = new RealVisitor();
        Customer customer = new RealCustomer("real customer");

        customer.accept(visitor);
    }
}
