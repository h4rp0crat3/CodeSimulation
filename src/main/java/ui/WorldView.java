package ui;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import world.Agent;
import world.World;

public class WorldView extends Canvas {

    private World world;
    private int tileSize = 10; // Chaque case du monde fera 10x10 pixels à l'écran

    public WorldView(World world, int width, int height) {
        // On initialise la taille du Canvas (la toile à dessin)
        super(width, height);
        this.world = world;
    }

    // Cette fonction sera appelée 60 fois par seconde
    public void draw() {
        GraphicsContext gc = this.getGraphicsContext2D();

        // 1. On efface tout (pour ne pas laisser de traces des anciennes positions)
        gc.setFill(Color.LIGHTGRAY);
        gc.fillRect(0, 0, getWidth(), getHeight());

        // 2. On dessine chaque Agent
        for (Agent agent : world.getAgents()) {
            drawAgent(gc, agent);
        }
    }

    private void drawAgent(GraphicsContext gc, Agent agent) {
        // On calcule la position en pixels (Position Grille * Taille Case)
        double x = agent.getPosition().x * tileSize;
        double y = agent.getPosition().y * tileSize;

        // On dessine un rond
        gc.setFill(Color.BLUE); // Couleur provisoire
        gc.fillOval(x, y, tileSize, tileSize);
    }
}
