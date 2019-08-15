package structural;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import structural.adapter.LogBean;
import structural.adapter.LogExpandOperate;
import structural.adapter.LogExpandOperateAdapter;

import java.io.File;
import java.net.URL;

public class TestAdapter {

    private static final Logger logger = LoggerFactory.getLogger(TestAdapter.class);

    @Test
    public void testAdapter() throws Exception{
        URL url = this.getClass().getClassLoader().getResource("files/logs.txt");
        File file = new File(url.getFile());

        LogExpandOperate expandOperate = new LogExpandOperateAdapter(file);
        printBean(expandOperate);
        expandOperate.createLog(LogBean.with("4").name("name5").build());
        printBean(expandOperate);
        expandOperate.removeLog(LogBean.with("2").build());
        printBean(expandOperate);
        expandOperate.updateLog(LogBean.with("4").name("name4").build());
        printBean(expandOperate);
    }

    private void printBean(LogExpandOperate expandOperate)throws Exception{
        for(LogBean bean:expandOperate.fetchAllLog()){
            logger.info(bean.toString());
        }
        logger.info("------------------------------------------------------");
    }
}
