package engine;

import world.World;
import world.WorldConfig;

public class SimulationEngine {

    private World world;

    public SimulationEngine(WorldConfig config) {
        // On initialise le monde avec la config
        this.world = new World(config);
    }

    // Cette méthode est appelée 60 fois par seconde par l'interface graphique
    public void update() {
        world.tick();
    }

    public World getWorld() {
        return world;
    }
}
