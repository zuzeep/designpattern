package structural.adapter;

import java.io.IOException;
import java.util.List;

public interface LogFileOperate {
    List<LogBean> fetchLogFile() throws IOException;
    void recordLogFile(List<LogBean> logs) throws IOException;
}
