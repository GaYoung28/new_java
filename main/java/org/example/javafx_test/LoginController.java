package org.example.javafx_test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // 간단한 인증 로직
        if (username.equals("admin") && password.equals("1234")) {
            try {
                Main.changeScene("inventory.fxml"); // 재고 조회 페이지로 전환
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Invalid username or password.");
            alert.show();
        }
    }
}

