package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class AppTarea extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/tarea.view.fxml"));
        System.out.println(getClass().getResource("/tarea.view.fxml"));
        Scene scene = new Scene(root, 500, 400);
        stage.setTitle("Gestor de Tareas");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
