package structural.adapter;

import com.google.common.collect.Lists;
import com.google.common.io.Files;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

public class LogFileOperateImpl implements LogFileOperate{

    private static final Logger logger = LoggerFactory.getLogger(LogFileOperateImpl.class);

    private File logFile;

    public LogFileOperateImpl(File logFile){
        this.logFile = logFile;
    }

    @Override
    public List<LogBean> fetchLogFile() throws IOException {
        if(!check()){
            logger.error("file {} doesn't exist", logFile);
            return Collections.emptyList();
        }

        List<LogBean> beans = Lists.newArrayList();

        for(String line :Files.readLines(logFile,StandardCharsets.UTF_8)){
            String[] lines = line.split("\\|");
            if(lines.length < 5) continue;
            long time = 0L;
            if(lines[4].matches("^[0-9]*$")){
                time = Long.parseLong(lines[4]);
            }
            beans.add(
                    LogBean.with(lines[0])
                    .name(lines[1])
                    .source(lines[2])
                    .context(lines[3])
                    .timestamp(time)    // 需要校验
                    .build()
            );
        }

        return beans;
    }

    @Override
    public void recordLogFile(List<LogBean> logs)throws IOException {
        if(!check()){
            logger.error("file {} doesn't exist", logFile);
        }
        StringBuffer sb = new StringBuffer();
        for (LogBean bean: logs){
            sb.setLength(0);
            sb.append("\n");
            sb.append(bean.getId()).append('|')
                    .append(bean.getName()).append('|')
                    .append(bean.getSource()).append('|')
                    .append(bean.getContext()).append('|')
                    .append(bean.getTimestamp());
            Files.append(sb.toString(), logFile, StandardCharsets.UTF_8);
        }

    }

    private boolean check(){
        return logFile != null && Files.isFile().apply(logFile);
    }
}
