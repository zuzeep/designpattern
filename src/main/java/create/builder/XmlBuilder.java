package create.builder;

public class XmlBuilder implements Builder{

    private StringBuffer sb;

    public XmlBuilder(){
        sb = new StringBuffer();
    }

    @Override
    public void buildHead() {
        sb.append("<head>head<head>\n");
    }

    @Override
    public void buildBody() {
        sb.append("<body>\n\tbody\n<body>\n");
    }

    @Override
    public void buildFooter() {
        sb.append("<end/>");
    }

    @Override
    public Object getContext() {
        return sb.toString();
    }
}
