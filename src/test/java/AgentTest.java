package tests;

import util.Vector2i;
import world.Agent;

public class AgentTest {

    public static void main(String[] args) {
        System.out.println("🧪 TEST: Déplacement de l'Agent");

        // 1. Initialisation
        Vector2i startPos = new Vector2i(0, 0);
        Agent agent = new Agent(startPos); // ❌ ERREUR 1: Le constructeur n'existe pas

        System.out.println("Position initiale: " + agent.getPosition()); // ❌ ERREUR 2: getPosition n'existe pas

        // 2. Action : On veut bouger
        agent.move(1, 0); // ❌ ERREUR 3: La méthode move n'existe pas

        // 3. Vérification (Assert)
        Vector2i expected = new Vector2i(1, 0);
        if (
            agent.getPosition().x() == expected.x() &&
            agent.getPosition().y() == expected.y()
        ) {
            System.out.println("✅ SUCCÈS : L'agent a bougé !");
        } else {
            System.out.println(
                "❌ ÉCHEC : L'agent est perdu en " + agent.getPosition()
            );
        }
    }
}
