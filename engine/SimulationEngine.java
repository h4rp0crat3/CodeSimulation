public class SimulationEngine {

    private final World world;
    private final List<Tickable> tickables;
    private boolean running;

    public SimulationEngine(World world) {
        this.world = world;
        this.tickables = new ArrayList<>();
        this.running = false;
    }

    public void addTickable(Tickable tickable) {
        this.tickables.add(tickable);
    }

    public void start() {
        this.running = true;
    }

    public void pause() {
        this.running = false;
    }

    public void tick() {
        if (!running) return;

        for (Tickable t : tickables) {
            t.tick(world);
        }
    }
}
