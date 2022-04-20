package com.haomory.damess;

import com.haomory.damess.scene.SceneName;
import com.haomory.damess.scene.animations.Animation;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Starter extends Application {
    public static final int WIDTH = 720;
    public static final int HEIGHT = 480;
    private static final String TITLE = "DaMess";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle(TITLE);

        primaryStage.getIcons().add(new Image(Objects.requireNonNull(
                Starter.class.getResourceAsStream("/Design/LogoIcon240.png"))
        ));

        Parent root = FXMLLoader.load(
                Objects.requireNonNull(getClass().getResource(SceneName.MAIN.getFileName()))
        );

        primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));

        primaryStage.setResizable(false);
        primaryStage.show();
    }


}
