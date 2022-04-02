module com.haomory.damess {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.haomory.damess to javafx.fxml;
    exports com.haomory.damess;
    exports com.haomory.damess.scene.animations;
    exports com.haomory.damess.scene;
    opens com.haomory.damess.scene to javafx.fxml;
}