package org.example.javafx_test;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginScreen extends Application {
    @Override
    public void start(Stage primaryStage) {
        // GridPane 설정
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);

        // 사용자 ID 레이블과 텍스트 필드
        Label userIdLabel = new Label("User ID:");
        TextField userIdField = new TextField();
        grid.add(userIdLabel, 0, 0);
        grid.add(userIdField, 1, 0);

        // 비밀번호 레이블과 패스워드 필드
        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        grid.add(passwordLabel, 0, 1);
        grid.add(passwordField, 1, 1);

        // 로그인 버튼
        Button loginButton = new Button("Login");
        grid.add(loginButton, 1, 2);

        // 상태 메시지
        Label statusLabel = new Label();
        grid.add(statusLabel, 1, 3);

        // 로그인 버튼 이벤트
        loginButton.setOnAction(e -> {
            String userId = userIdField.getText();
            String password = passwordField.getText();

            // 로그인 검증 (예제에서는 간단한 조건 사용)
            if (userId.equals("admin") && password.equals("1234")) {
                statusLabel.setText("Login Successful!");
            } else {
                statusLabel.setText("Invalid credentials. Try again.");
            }
        });

        // Scene 및 Stage 설정
        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setTitle("Login Screen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

