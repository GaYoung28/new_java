module org.example.javafx_test {
    requires javafx.controls;
    requires javafx.fxml;



    opens org.example.javafx_test to javafx.fxml;
    exports org.example.javafx_test;
}