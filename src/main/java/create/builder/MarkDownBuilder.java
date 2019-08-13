package create.builder;

public class MarkDownBuilder implements Builder{

    private StringBuffer sb;

    public MarkDownBuilder(){
        sb = new StringBuffer();
    }

    @Override
    public void buildHead() {
        sb.append("title\n---\n");
    }

    @Override
    public void buildBody() {
        sb.append("1.context1\n2.context2\n---\n");
    }

    @Override
    public void buildFooter() {
        sb.append("### end");
    }

    @Override
    public Object getContext() {
        return sb.toString();
    }
}
