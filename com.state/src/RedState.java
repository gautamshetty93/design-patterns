public class RedState implements TrafficLightState {

    @Override
    public void handle() {
        System.out.println("Red Light - STOP");
    }
}
