package world;

import engine.Tickable;
import util.Vector2i;

public class Agent implements Tickable {

    int posX;
    int posY;

    @Override
    public void tick(World world) {
        // Vide
    }

    public Agent(Vector2i pos) {
        this.posX = pos.x();
        this.posY = pos.y();
    }

    public void move(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    public Vector2i getPosition() {
        Vector2i vecteur = new Vector2i(this.posX, this.posY);
        return vecteur;
    }
}
