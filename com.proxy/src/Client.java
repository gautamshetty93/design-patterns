public class Client {

    public static void main(String[] args) {

        Internet internet = new ProxyInternet();

        internet.connectTo("google.com");
        internet.connectTo("facebook.com");
    }
}