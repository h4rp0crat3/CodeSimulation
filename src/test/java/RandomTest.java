package tests;

import util.Vector2i;
import world.Agent;

public class RandomTest {

    public static void main(String[] args) {
        System.out.println("🧪 TEST: Mouvement Aléatoire");

        // 1. On place l'agent au milieu (5, 5)
        Agent agent = new Agent(new Vector2i(5, 5));
        Vector2i positionDepart = agent.getPosition();

        System.out.println("Départ : " + positionDepart);

        // 2. On simule un cycle de vie (Tick)
        // C'est là que le cerveau doit agir !
        agent.tick(null); // On met null car on n'a pas encore besoin du World pour l'instant

        // 3. Vérification
        Vector2i positionArrivee = agent.getPosition();
        System.out.println("Arrivée : " + positionArrivee);

        if (
            positionDepart.x() != positionArrivee.x() ||
            positionDepart.y() != positionArrivee.y()
        ) {
            System.out.println("✅ SUCCÈS : L'agent a bougé tout seul !");
        } else {
            System.out.println(
                "❌ ÉCHEC : L'agent est resté sur place (il dort)."
            );
        }
    }
}
