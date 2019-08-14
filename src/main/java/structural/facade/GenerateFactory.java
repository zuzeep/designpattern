package structural.facade;

import structural.facade.generate.Business;
import structural.facade.generate.DAO;
import structural.facade.generate.Generate;
import structural.facade.generate.Presentation;

public class GenerateFactory {

    enum GenerateType{

        PRESENTATION("presentation"),
        BUSINESS("business"),
        DAO("dao");

        private String name;

        GenerateType(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public static GenerateType getGenerateTypeByName(String name){
            for(GenerateType type : GenerateType.values()){
                if(type.getName().equals(name)) return type;
            }
            return null;
        }
    }

    public static Generate getGenerate(String name, boolean isGen){
        GenerateType type = GenerateType.getGenerateTypeByName(name);

        if(!isGen || type == null) return null;
        Generate result = null;

        switch (type){
            case PRESENTATION:
                result = new Presentation();
                break;
            case BUSINESS:
                result = new Business();
                break;
            case DAO:
                result = new DAO();
                break;
        }
        return result;
    }
}
