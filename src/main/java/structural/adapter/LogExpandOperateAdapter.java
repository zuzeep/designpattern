package structural.adapter;

import com.google.common.collect.Lists;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class LogExpandOperateAdapter implements LogExpandOperate{

    private LogFileOperate operate;
    private File logFile;

    public LogExpandOperateAdapter(File logFile) {
        this.logFile = logFile;
        operate =  new LogFileOperateImpl(logFile);
    }

    @Override
    public void createLog(LogBean bean) throws IOException {
        operate.recordLogFile(Lists.newArrayList(bean));
    }

    @Override
    public void updateLog(LogBean bean) throws IOException {
        this.removeLog(bean);
        this.createLog(bean);
    }

    @Override
    public void removeLog(LogBean bean) throws IOException {
        List<LogBean> list = this.fetchAllLog();
        boolean remove = false;

        for(LogBean logBean: Lists.newArrayList(list)){
            if(bean.getId().equals(logBean.getId())){
                list.remove(logBean);
                remove = true;
            }
        }

        if(remove){
            this.cleanFile();
            operate.recordLogFile(list);
        }
    }

    @Override
    public List<LogBean> fetchAllLog() throws IOException {
        return operate.fetchLogFile();
    }

    private void cleanFile() throws IOException {
        Files.write("",logFile,StandardCharsets.UTF_8);
    }
}
