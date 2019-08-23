package structural.facade.config;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import structural.facade.GenerateFactory;
import structural.facade.generate.Generate;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ConfigManager {

    private volatile static ConfigManager instance;
    private final Set<Generate> generateRegisters;

    private ConfigManager(){
        generateRegisters = Sets.newConcurrentHashSet();
    }

    public static ConfigManager getInstance(){
        if(instance == null){
            synchronized (ConfigManager.class){
                if(instance == null){
                    instance = new ConfigManager();
                }
            }
        }

        return instance;
    }

    public void loadGenerate(){
        List<ConfigModel> models = loadModel();

        for(ConfigModel model: models){
            Generate generate = GenerateFactory.getGenerate(model.getName(), model.isGen());
            if(generate != null) generateRegisters.add(generate);
        }
    }

    /**
     * 对象管理器都应该配备一个销毁
     * @param generate
     */
    public void destroy(Generate generate){
        generate.close();
        generateRegisters.remove(generate);
    }

    public boolean isExists(Generate generate){
        return generateRegisters.contains(generate);
    }

    public List<Generate> getGenerates(){
        return new ArrayList<>(generateRegisters);
    }

    /**
     * 模拟加载数据
     * @return
     */
    private List<ConfigModel> loadModel(){
        List<ConfigModel> list = Lists.newArrayList();

        list.add(new ConfigModel("presentation",true));
        list.add(new ConfigModel("business",true));
        list.add(new ConfigModel("dao",true));
        list.add(new ConfigModel("presentation",false));
        list.add(new ConfigModel("business",false));
        list.add(new ConfigModel("dao",false));
        list.add(new ConfigModel("",true));
        list.add(new ConfigModel("",false));

        return list;
    }

}
