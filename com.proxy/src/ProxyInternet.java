import java.util.Arrays;
import java.util.List;

public class ProxyInternet implements Internet {

    private RealInternet realInternet = new RealInternet();
    private static List<String> bannedSites = Arrays.asList(
            "facebook.com",
            "twitter.com",
            "instagram.com"
    );

    @Override
    public void connectTo(String serverHost) {

        if (bannedSites.contains(serverHost.toLowerCase())) {
            System.out.println("Access Denied to " + serverHost);
        } else {
            realInternet.connectTo(serverHost);
        }
    }
}
