package create;

import create.builder.*;
import org.junit.Assert;
import org.junit.Test;

public class TestBuilder {

    /**
     * 常见的builder模式变型
     *
     * @throws Exception
     */
    @Test
    public void testSimpleBuilder() throws Exception{
        SimpleBuilder builder = SimpleBuilder
                .with("192.168.0.1",10)
                .protocol("tcp")
                .build();

        Assert.assertEquals(builder.getProtocol(),"tcp");
    }

    /**
     * 标准builder模式
     */
    @Test
    public void testBuilder(){
//        Builder builder = new XmlBuilder();
        Builder builder = new MarkDownBuilder();
        Director director = new Director(builder);
        director.construct();
        System.out.println(builder.getContext());
    }
}
