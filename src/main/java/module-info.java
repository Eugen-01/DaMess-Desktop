module com.haomory.damess {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.haomory.damess to javafx.fxml;
    exports com.haomory.damess;
}