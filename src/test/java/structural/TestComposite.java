package structural;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import structural.composite.Component;
import structural.composite.Directory;
import structural.composite.EndFile;

public class TestComposite {

    private final static Logger logger = LoggerFactory.getLogger(TestComposite.class);

    /**
     * 组合模式实现文件系统
     *  TODO 1.如果要增加文件链接怎么办？2.如何解决循环引用问题？
     */
    @Test
    public void testComposite(){
        Component root = new Directory("root");

        Component var = new Directory("var");
        Component lib = new Directory("lib");
        Component tmp = new Directory("tmp");

        root.addChild(var);
        root.addChild(lib);
        root.addChild(tmp);

        Component guava = new EndFile("guava.jar");
        Component cglib = new EndFile("cglib.jar");

        lib.addChild(guava);
        lib.addChild(cglib);

        Component test = new EndFile("test.txt");
        Component export = new EndFile("export.csv");

        tmp.addChild(test);
        tmp.addChild(export);

        printComponent(root, "");
        tmp.removeChild(test);
        logger.info("-----------------------------------");
        printComponent(root, "");
    }

    private void printComponent(Component component, String prefix){
        System.out.println(prefix+"+"+component.getName());
        for(Component child: component.getChildren()){
            printComponent(child,prefix+"\t");
        }
    }
}
