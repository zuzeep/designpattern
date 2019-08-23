package behavioral.interpreter;

import com.google.common.collect.Lists;
import org.w3c.dom.Element;

import java.util.List;

public class ElementExpression implements ReadXmlExpression{

    private List<ReadXmlExpression> expressionList = Lists.newArrayList();

    private String elementName;

    public ElementExpression(String elementName) {
        this.elementName = elementName;
    }

    public void addExpression(ReadXmlExpression expression){
        expressionList.add(expression);
    }

    public void removeExpression(ReadXmlExpression expression){
        expressionList.remove(expression);
    }

    @Override
    public String[] interpret(Context context) {
        Element preElement = context.getPreElement();
        //根节点
        if(preElement == null){
            context.setPreElement(context.getDocument().getDocumentElement());
        }else {
            Element currentElement = context.getCurrentElement(preElement, elementName);
            context.setPreElement(currentElement);
        }

        String[] result = null;

        for(ReadXmlExpression expression: expressionList){
            result = expression.interpret(context);
        }

        return result;
    }
}
