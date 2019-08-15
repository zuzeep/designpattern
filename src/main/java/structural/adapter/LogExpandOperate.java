package structural.adapter;

import java.io.IOException;
import java.util.List;

public interface LogExpandOperate {

    void createLog(LogBean bean) throws IOException;
    void updateLog(LogBean bean) throws IOException;
    void removeLog(LogBean bean) throws IOException;

    List<LogBean> fetchAllLog() throws IOException;
}
