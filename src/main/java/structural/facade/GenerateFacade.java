package structural.facade;

import structural.facade.config.ConfigManager;
import structural.facade.generate.Generate;

import java.util.List;

public class GenerateFacade {

    /**
     * 这里并不是那么像外观模式
     * 理论上外观模式应该要多个子系统放到一起处理
     */
    public static void facade(){
        ConfigManager manager = ConfigManager.getInstance();

        manager.loadGenerate();
        List<Generate> generates = manager.getGenerates();

        for(Generate generate: generates){
            generate.generate();
            manager.destroy(generate);
        }
    }
}
