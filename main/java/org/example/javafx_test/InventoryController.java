package org.example.javafx_test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class InventoryController {

    @FXML
    private TextField searchField;

    @FXML
    private CheckBox filterCheckBox;

    @FXML
    private TableView<?> inventoryTable;

    // 로그아웃 버튼 클릭 시 로그인 화면으로 이동
    @FXML
    private void handleLogout(ActionEvent event) {
        try {
            Main.changeScene("login.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 검색 버튼 클릭 시 테이블 업데이트
    @FXML
    private void handleSearch(ActionEvent event) {
        String searchText = searchField.getText();
        boolean isFiltered = filterCheckBox.isSelected();

        // 검색 필터링 로직 추가 (데이터베이스 또는 임시 데이터와 연동)
        System.out.println("Search: " + searchText + ", Filter: " + isFiltered);
    }
}
