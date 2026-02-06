public class Tile {

    private final Vector2i position;
    private double resourceAmount;

    public Tile(Vector2i position, double resourceAmount) {
        this.position = position;
        this.resourceAmount = resourceAmount;
    }

    public void regenerate() {
        resourceAmount += 0.1;
    }

    public double consume(double amount) {
        double taken = Math.min(amount, resourceAmount);
        resourceAmount -= taken;
        return taken;
    }

    public Vector2i getPosition() {
        return position;
    }
}
