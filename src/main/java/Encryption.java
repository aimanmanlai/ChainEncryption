public class Encryption extends Application{
    public Encryption(Application constructMessage) {
        super(constructMessage);
    }

    @Override
    String Message(String msg) {
        String s;
        String key = "Ainura";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < msg.length(); i++)
            sb.append((char)(msg.charAt(i) ^ key.charAt(i % key.length())));
        String result = sb.toString();
        return constructMessage.Message(result);
    }
    String UnMessage(String msg) {
        String s;
        String key = "Ainura";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < msg.length(); i++)
            sb.append((char)(msg.charAt(i) ^ key.charAt(i % key.length())));
        String result = sb.toString();
        return constructMessage.UnMessage(result);
    }
}
