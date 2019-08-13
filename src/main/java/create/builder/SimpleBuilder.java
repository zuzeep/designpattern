package create.builder;

/**
 * 常见的builder模式
 *  builder的变型模式，针对变量不固定特别方便
 */
public class SimpleBuilder {
    private final String ip;
    private final int port;

    private final long timeout;
    private final String protocol;
    private final String token;

    private SimpleBuilder(Builder builder){
        this.ip = builder.ip;
        this.port = builder.port;
        this.timeout = builder.timeout;
        this.protocol = builder.protocol;
        this.token = builder.token;
    }

    public static Builder with(String ip, int port){
        return new Builder(ip,port);
    }

    public String getIp() {
        return ip;
    }

    public int getPort() {
        return port;
    }

    public long getTimeout() {
        return timeout;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getToken() {
        return token;
    }

    public static final class Builder{
        private String ip;
        private int port;

        private long timeout;
        private String protocol;
        private String token;

        public Builder(String ip, int port) {
            this.ip = ip;
            this.port = port;
        }

        public Builder timeout(long timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public SimpleBuilder build(){
            return new SimpleBuilder(this);
        }
    }

}
