package map;

import java.util.ArrayList;
import java.util.List;
import util.Vector2i;

public class GridMap {

    private final Tile[][] tiles;
    private final int width;
    private final int height;

    public GridMap(int width, int height) {
        this.width = width;
        this.height = height;
        this.tiles = new Tile[width][height];

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                tiles[x][y] = new Tile(new Vector2i(x, y), Math.random());
            }
        }
    }

    public Tile getTile(int x, int y) {
        if (x < 0 || y < 0 || x >= width || y >= height) {
            return null;
        }
        return tiles[x][y];
    }

    public List<Tile> getNeighbors(Vector2i pos) {
        List<Tile> neighbors = new ArrayList<>();

        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                if (dx == 0 && dy == 0) continue;

                Tile tile = getTile(pos.x() + dx, pos.y() + dy);
                if (tile != null) {
                    neighbors.add(tile);
                }
            }
        }
        return neighbors;
    }
}
