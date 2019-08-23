package behavioral.interpreter;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.net.URL;

public class XmlUtil {

    public static Document initXml(String fileName){
        try{
            URL url = XmlUtil.class.getClassLoader().getResource(fileName);
            File file = new File(url.getFile());

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            return builder.parse(file);
        }catch (Exception e){
            throw new UnsupportedOperationException("parse file:"+fileName);
        }
    }
}
