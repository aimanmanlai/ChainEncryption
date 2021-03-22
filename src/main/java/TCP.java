public class TCP extends Application{
    public TCP(Application constructMessage) {
        super(constructMessage);
    }

    @Override
    String Message(String msg) {
        String prefix1 = "tcp";
        return constructMessage.Message(prefix1+msg);
    }
    @Override
    String UnMessage(String msg) {
        return constructMessage.UnMessage(msg);
    }
}
