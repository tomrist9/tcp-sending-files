module com.example.fourthmonthproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fourthmonthproject to javafx.fxml;
    exports com.example.fourthmonthproject;
}