package world;

import java.util.ArrayList;
import java.util.List;

public class World {

    private int width;
    private int height;
    private List<Agent> agents;

    public World(WorldConfig config) {
        this.width = config.getWidth();
        this.height = config.getHeight();
        this.agents = new ArrayList<>();
    }

    public List<Agent> getAgents() {
        return agents;
    }

    public void addAgent(Agent agent) {
        agents.add(agent);
    }

    public void tick() {
        for (Agent agent : agents) {
            // CORRECTION ICI : On passe "this" (le monde actuel) à l'agent
            agent.tick(this);
        }
    }

    // Mes getters
    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
