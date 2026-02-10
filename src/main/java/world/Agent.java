package world;

import engine.Tickable;
import util.Vector2i;

public class Agent implements Tickable {

    private int posX;
    private int posY;

    public Agent(Vector2i pos) {
        this.posX = pos.x();
        this.posY = pos.y();
    }

    @Override
    public void tick(World world) {
        int dx = 0;
        int dy = 0;

        // 1. Choisir une direction au hasard
        if (Math.random() < 0.33) dx = 1;
        else if (Math.random() < 0.66) dx = -1;

        if (Math.random() < 0.33) dy = 1;
        else if (Math.random() < 0.66) dy = -1;

        int futureX = this.posX + dx;
        int futureY = this.posY + dy;

        if (futureX >= 0 && futureX < world.getWidth()) {
            this.posX = futureX;
        }

        if (futureY >= 0 && futureY < world.getHeight()) {
            this.posY = futureY;
        }
    }

    public void move(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    public Vector2i getPosition() {
        return new Vector2i(this.posX, this.posY);
    }
}
