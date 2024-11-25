package org.example.javafxTest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class inventory extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/inventory.fxml"));
        BorderPane root = fxmlLoader.load();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Inventory");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
