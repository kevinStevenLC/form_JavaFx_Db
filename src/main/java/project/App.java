package project;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) {

        HBox contenedor_secciones = new HBox(10);
        contenedor_secciones.setPrefSize(600, 540);

        VBox vBox_a = new VBox();
        VBox vBox_b = new VBox();

        // propiedades de los 2 VBox
        vBox_a.setPrefSize(300, 0);
        vBox_b.setPrefSize(300, 0);
        vBox_a.getStyleClass().addAll("borde_caja");
        vBox_b.getStyleClass().addAll("borde_caja");

        // Agregando 2 VBox al Hbox
        contenedor_secciones.getChildren().addAll(vBox_a, vBox_b);
        // Centrando Los dos Nodos verticales dentro del HBox
        contenedor_secciones.setAlignment(Pos.CENTER);

        Scene scene = new Scene(new AnchorPane(contenedor_secciones), 640, 550);

        // Centrar el Contenido dentro del AnchorPane, como espacios a los lados
        AnchorPane.setTopAnchor(contenedor_secciones, 5.0);
        AnchorPane.setLeftAnchor(contenedor_secciones, 5.0);
        AnchorPane.setRightAnchor(contenedor_secciones, 5.0);
        AnchorPane.setBottomAnchor(contenedor_secciones, 5.0);

        scene.getStylesheets().addAll(getClass().getResource("/css/main.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}