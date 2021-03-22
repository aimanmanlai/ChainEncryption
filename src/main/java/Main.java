public class Main {
    public static void main(String[] args) {
        Application packing = new TCP(new Ethernet(new Encryption(new Display(null))));
        String Packing = packing.Message("DesignPatterns");

        Application unpacking = new Encryption(new Display(null));
        String Unpacking = unpacking.UnMessage(Packing);
    }
}
