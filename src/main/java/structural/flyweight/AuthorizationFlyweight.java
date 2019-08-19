package structural.flyweight;

public class AuthorizationFlyweight implements Flyweight{

    private String securityEntity;
    private String permit;

    public AuthorizationFlyweight(String state){
        String[] split = state.split(",");
        this.securityEntity = split[0];
        this.permit = split[1];
    }

    @Override
    public boolean match(String securityEntity, String permit) {
        if(this.securityEntity.equals(securityEntity)&&
                this.permit.equals(permit)){
            return true;
        }

        return false;
    }
}
