package world;

import engine.Tickable;
import util.Vector2i;

public class Agent implements Tickable {

    private int posX;
    private int posY;
    private int vitesse;
    private double energie;

    public int randomVitesse(int max, int min) {
        int range = (max - min) - 1;
        int random = (int) (range * Math.random() + min);
        return random;
    }

    public Agent(Vector2i pos) {
        this.posX = pos.x();
        this.posY = pos.y();
        this.vitesse = randomVitesse(80, 10);
        this.energie = 0;
    }

    @Override
    public void tick(World world) {
        this.energie += this.vitesse;
        int dx = 0;
        int dy = 0;
        if (this.energie >= 100) {
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
            this.energie -= 100;
        }
    }

    public void move(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    // Mes getteur
    public Vector2i getPosition() {
        return new Vector2i(this.posX, this.posY);
    }

    public int getVitesse() {
        return this.vitesse;
    }
}
