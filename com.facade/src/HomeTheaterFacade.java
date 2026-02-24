public class HomeTheaterFacade {
    private Projector projector;
    private SoundSystem soundSystem;
    private StreamingPlayer player;
    private Lights lights;

    public HomeTheaterFacade(Projector projector,
                             SoundSystem soundSystem,
                             StreamingPlayer player,
                             Lights lights) {
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.player = player;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("\nStarting movie night...");
        lights.dim();
        projector.on();
        soundSystem.on();
        soundSystem.setVolume(20);
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("\nShutting down home theater...");
        player.off();
        soundSystem.off();
        projector.off();
        lights.on();
    }
}
