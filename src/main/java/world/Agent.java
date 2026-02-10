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
        int nexdx = 0;
        int nexdy = 0;
        int dx = 0;
        int dy = 0;

        if (Math.random() < 0.33) nexdx = 1;
        else if (Math.random() < 0.66) nexdx = -1;

        if (Math.random() < 0.33) nexdy = 1;
        else if (Math.random() < 0.66) nexdy = -1;
        if (nextdx >= 0 && nextdx <= this.getWidth()) nextdx = dx;
        if (nextdx >= 0 && nextdx <= this.getWidth()) nextdy = dy;
        this.posX += dx;
        this.posY += dy;
    }

    public void move(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    public Vector2i getPosition() {
        return new Vector2i(this.posX, this.posY);
    }
}
