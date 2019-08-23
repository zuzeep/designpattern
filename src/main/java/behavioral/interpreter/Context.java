package behavioral.interpreter;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Context {

    private Document document;
    private Element preElement;

    public Context(String fileName){
        this.document = XmlUtil.initXml(fileName);
    }

    public Element getCurrentElement(Element preEle, String name){
        NodeList nodes = preEle.getChildNodes();

        for(int i=0; i<nodes.getLength(); i++){
            if(nodes.item(i) instanceof Element){
                Element currentElement = (Element)nodes.item(i);
                if(currentElement.getTagName().endsWith(name))
                    return currentElement;
            }
        }

        return null;
    }

    public Document getDocument() {
        return document;
    }

    public Element getPreElement() {
        return preElement;
    }

    public void setPreElement(Element preElement) {
        this.preElement = preElement;
    }
}
