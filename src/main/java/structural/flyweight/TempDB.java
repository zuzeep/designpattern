package structural.flyweight;

import com.google.common.collect.Lists;

import java.util.List;

public class TempDB {

    public static List<String> db = Lists.newArrayList();

    static {
        db.add("e1,query,wage");
        db.add("e2,query,wage");
        db.add("m1,query,wage");
        db.add("m1,modify,wage");
    }
}
