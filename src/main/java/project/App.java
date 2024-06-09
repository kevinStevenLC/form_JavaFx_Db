package project;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import project.components.SectionElements;
import project.components.SectionInformation;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) {

        SectionInformation seccion_info = new SectionInformation();
        SectionElements seccion_elem = new SectionElements();

        // Hbox
        HBox contenedor_secciones = new HBox(5);
        contenedor_secciones.setPrefSize(600, 540);

        // 2 VBox
        VBox seccion_1 = seccion_info.obtener_seccion_informacion();
        VBox seccion_2 = seccion_elem.mostrar_seccion_elementos();
        // propiedades de los 2 VBox
        seccion_1.setPrefSize(300, 0);
        seccion_2.setPrefSize(300, 0);
        seccion_1.getStyleClass().addAll("borde_caja");
        seccion_2.getStyleClass().addAll("borde_caja");
        // Agregando 2 VBox al Hbox
        contenedor_secciones.getChildren().addAll(seccion_1, seccion_2);
        // Centrando Los dos Nodos verticales dentro del HBox
        contenedor_secciones.setAlignment(Pos.CENTER);

        Scene scene = new Scene(new AnchorPane(contenedor_secciones), 640, 550);

        // Centrar el Contenido dentro del AnchorPane, como espacios a los lados
        AnchorPane.setTopAnchor(contenedor_secciones, 5.0);
        AnchorPane.setLeftAnchor(contenedor_secciones, 5.0);
        AnchorPane.setRightAnchor(contenedor_secciones, 5.0);
        AnchorPane.setBottomAnchor(contenedor_secciones, 5.0);

        // trayendo hoja de estilo
        scene.getStylesheets().addAll(getClass().getResource("/css/main.css").toExternalForm());

        // Mostrar escena
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}