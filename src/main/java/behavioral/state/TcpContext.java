package behavioral.state;

public class TcpContext {

    private TcpState tcp;

    public void setTcp(TcpState tcp) {
        this.tcp = tcp;
    }

    public void request(){
        tcp.handle();
    }
}
