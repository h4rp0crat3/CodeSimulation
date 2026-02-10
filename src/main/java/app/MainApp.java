package app; // 👈 AJOUTE ÇA OBLIGATOIREMENT

import javafx.application.Application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 1. Créer le conteneur (Le plateau)
        Pane root = new Pane();
        root.setPrefSize(800, 600); // Fenêtre de 800x600 pixels

        // 2. Créer un acteur test (Juste pour voir si ça marche)
        Circle testCircle = new Circle(400, 300, 20, Color.BLUE);
        root.getChildren().add(testCircle);

        // 3. Créer la scène (Le décor)
        Scene scene = new Scene(root);

        // 4. Configurer la fenêtre (Le théâtre)
        primaryStage.setTitle("Simulation de Vie - Alpha");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // C'est ça qui démarre JavaFX
    }
}
