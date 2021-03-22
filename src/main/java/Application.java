public abstract class Application {
    Application constructMessage;

    public Application(Application constructMessage) {
        this.constructMessage = constructMessage;
    }

    abstract String Message(String msg);
    abstract String UnMessage(String msg);
}
