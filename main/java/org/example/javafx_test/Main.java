package org.example.javafx_test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws Exception {
        primaryStage = stage;
        Parent root = FXMLLoader.load(getClass().getResource("/org/example/javafx_test/Login.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Inventory Management System");
        primaryStage.show();
    }

    public static void changeScene(String fxmlFile) throws Exception {
        Parent root = FXMLLoader.load(Main.class.getResource("/org/example/javafx_test/inventory.fxml"));
        primaryStage.setScene(new Scene(root));
    }

    public static void main(String[] args) {
        launch(args);
    }
}

