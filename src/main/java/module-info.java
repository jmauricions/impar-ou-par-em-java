module com.example.impaoupar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.impaoupar to javafx.fxml;
    exports com.example.impaoupar;
}