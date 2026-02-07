package engine; // 👈 AJOUTE ÇA

import world.World; // 👈 AJOUTE ÇA

public interface Tickable {
    void tick(World world);
}
