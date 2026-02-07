import engine.SimulationEngine;
import map.GridMap;
import world.World;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lancement de la simulation...");

        GridMap map_ = new GridMap(10, 10);
        World maps_ = new World(map_);
        SimulationEngine sim = new SimulationEngine(maps_);
        sim.start();

        for (int i = 0; i <= 5; ++i) {
            System.out.println("--- Tick" + i + "---");
            sim.tick();
        }
    }
}
