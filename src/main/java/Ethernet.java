public class Ethernet extends Application{
    public Ethernet(Application constructMessage) {
        super(constructMessage);
    }

    @Override
    String Message(String msg) {
        String prefix2 = "ethernet";
        return constructMessage.Message(prefix2+msg);
    }
    @Override
    String UnMessage(String msg) {
        return constructMessage.UnMessage(msg);
    }
}
