package creational;

import com.google.common.collect.Lists;
import creational.singleton.Singleton;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestSingleton {

    @Test
    public void testSingleton()throws Exception{
        ExecutorService service = Executors.newFixedThreadPool(2);

        List<Callable<Object>> tasks = Lists.newLinkedList();
        tasks.add(new instanceCall());
        tasks.add(new instanceCall());

        List<Future<Object>> results = service.invokeAll(tasks);

        if(results.size() > 1){
            Assert.assertEquals(results.get(0).get(),results.get(1).get());
        }else {
            Assert.fail("返回失败");
        }

    }

    class instanceCall implements Callable<Object>{
        @Override
        public Object call() throws Exception {
            Singleton instance = Singleton.getInstance();
            return instance;
        }
    }
}
