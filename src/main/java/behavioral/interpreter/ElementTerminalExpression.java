package behavioral.interpreter;

import org.w3c.dom.Element;

public class ElementTerminalExpression implements ReadXmlExpression{

    private String name;

    public ElementTerminalExpression(String name) {
        this.name = name;
    }

    @Override
    public String[] interpret(Context context) {
        Element preElement = context.getPreElement();
        Element element;
        if(preElement == null){
            element = context.getDocument().getDocumentElement();
        }else {
            element = context.getCurrentElement(preElement, name);
        }
        context.setPreElement(element);

        String[] result = new String[element.getChildNodes().getLength()];

        for(int i=0; i<element.getChildNodes().getLength(); i++){
            result[i] = element.getChildNodes().item(i).getNodeValue();
        }

        return result;
    }
}
