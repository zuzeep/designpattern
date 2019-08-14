package structural.facade.config;

public class ConfigModel {

    private String name;
    private boolean isGen;

    public ConfigModel(String name, boolean isGen) {
        this.name = name;
        this.isGen = isGen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGen() {
        return isGen;
    }

    public void setGen(boolean gen) {
        isGen = gen;
    }
}
