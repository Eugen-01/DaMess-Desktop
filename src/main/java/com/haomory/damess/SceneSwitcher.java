package com.haomory.damess;

import com.haomory.damess.scene.SceneName;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SceneSwitcher {

    public void switchTo(MouseEvent event, SceneName sceneName) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(sceneName.getFileName())));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, Starter.WIDTH, Starter.HEIGHT);
        stage.setScene(scene);
        stage.show();
    }
}
