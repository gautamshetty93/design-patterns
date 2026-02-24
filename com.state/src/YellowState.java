public class YellowState implements TrafficLightState {

    @Override
    public void handle() {
        System.out.println("Yellow Light - SLOW DOWN");
    }
}
