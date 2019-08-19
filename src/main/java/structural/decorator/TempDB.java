package structural.decorator;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * 模拟数据库数据
 */
public class TempDB {

    private TempDB(){}

    public static final Map<String,Double> db = Maps.newHashMap();

    static {
        db.put("e1",10000.00);
        db.put("e2",12000.00);
        db.put("m1",9000.00);
    }
}
