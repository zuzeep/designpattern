package structural.adapter;

/**
 * 实现以下builder模式，这里用普通的bean更好
 */
public class LogBean {

    private String id;
    private String name;
    private String source;
    private String context;
    private long timestamp;

    private LogBean(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.source = builder.source;
        this.context = builder.context;
        this.timestamp = builder.timestamp;
    }

    public static Builder with(String id){
        return new Builder(id);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSource() {
        return source;
    }

    public String getContext() {
        return context;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public static class Builder{
        private String id;
        private String name;
        private String source;
        private String context;
        private long timestamp;

        public Builder(String id){
            this.id = id;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder source(String source){
            this.source = source;
            return this;
        }

        public Builder context(String context){
            this.context = context;
            return this;
        }

        public Builder timestamp(long timestamp){
            this.timestamp = timestamp;
            return this;
        }

        public LogBean build(){
            return new LogBean(this);
        }
    }

    @Override
    public String toString() {
        return this.id.concat("|")
                .concat(name).concat("|")
                .concat(source).concat("|")
                .concat(context).concat("|")
                .concat(String.valueOf(timestamp));
    }
}
