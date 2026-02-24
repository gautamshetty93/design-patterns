public class Client {
    public static void main(String[] args) {

        TrafficLight light = new TrafficLight();

        light.setState(new RedState());
        light.change();

        light.setState(new GreenState());
        light.change();

        light.setState(new YellowState());
        light.change();
    }
}
