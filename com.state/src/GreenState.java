public class GreenState implements TrafficLightState {

    @Override
    public void handle() {
        System.out.println("Green Light - GO");
    }
}
