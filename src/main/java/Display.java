public class Display extends Application{
    public Display(Application constructMessage) {
        super(constructMessage);
    }

    @Override
    String Message(String msg) {
        System.out.println(msg);
        return msg;
    }
    @Override
    String UnMessage(String msg) {
        String str = new String(msg);
        System.out.println(str.substring(11));
        return str.substring(11);
    }
}
