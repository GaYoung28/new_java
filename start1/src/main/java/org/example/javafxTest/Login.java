package org.example.javafxTest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Login extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        // FXML 파일 로드
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));  // FXML 파일의 경로를 지정
        AnchorPane root = loader.load();  // FXML 파일을 로드하고 루트 노드를 반환

        // Scene과 Stage 설정
        Scene scene = new Scene(root, 400, 400);  // FXML에서 정의한 크기대로 Scene을 생성
        primaryStage.setTitle("Login Screen");  // 윈도우 타이틀 설정
        primaryStage.setScene(scene);  // Scene을 Stage에 설정
        primaryStage.show();  // Stage 표시
    }

    public static void main(String[] args) {
        launch(args);  // JavaFX 애플리케이션 시작
    }
}
