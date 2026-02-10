package world;

import engine.Tickable;
import util.Vector2i;

public class Agent implements Tickable {

    int posX;
    int posY;

    @Override
    public void tick(World world) {
        // 1. On génère un déplacement aléatoire sur X (-1, 0, ou 1)
        // Math.random() donne un chiffre entre 0.0 et 0.99
        // * 3 -> entre 0.0 et 2.99
        // (int) -> 0, 1 ou 2
        // - 1 -> -1, 0 ou 1
        int dx = (int) (Math.random() * 3) - 1;

        // 2. Pareil pour Y
        int dy = (int) (Math.random() * 3) - 1;

        // 3. Si le mouvement n'est pas nul (0,0), on bouge
        if (dx != 0 || dy != 0) {
            move(this.posX + dx, this.posY + dy);
        }
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
