package behavioral.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealVisitor implements Visitor{

    private final static Logger logger = LoggerFactory.getLogger(RealVisitor.class);

    public RealVisitor() { }

    @Override
    public void visit(Customer customer) {
        logger.info("visit {}",customer.getName());
    }
}
