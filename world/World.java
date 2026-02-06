public class World {

    private final GridMap map;
    private final List<Agent> agents;

    public World(GridMap map) {
        this.map = map;
        this.agents = new ArrayList<>();
    }

    public Tile getTileAt(Vector2i pos) {
        return map.getTile(pos.x(), pos.y());
    }

    public List<Agent> getAgents() {
        return agents;
    }
}
