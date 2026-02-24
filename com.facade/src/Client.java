public class Client {
    public static void main(String[] args) {

        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        StreamingPlayer player = new StreamingPlayer();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(projector, soundSystem, player, lights);

        homeTheater.watchMovie("Interstellar");
        homeTheater.endMovie();
    }
}
