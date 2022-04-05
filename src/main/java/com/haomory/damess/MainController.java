package com.haomory.damess;

import com.haomory.damess.scene.SceneName;
import com.haomory.damess.scene.animations.Animation;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class MainController {
    private SceneSwitcher sceneSwitcher;

    @FXML private Button loginBtn;
    @FXML private Button registerBtn;
    @FXML private Label welcomeLbl;
    @FXML private Label descriptionLbl;


    public void toLogin(MouseEvent actionEvent) {

        Animation animation = new Animation();

        animation.fadeAllObjects(new Node[] {loginBtn, registerBtn, welcomeLbl, descriptionLbl});

//        Animation animation = new Animation() {
//            @Override
//            public void fadeObject(Node node) {
//                super.fadeObject(node);
//
//                getFadeTransition().onFinishedProperty().set(event -> {
//                    if (sceneSwitcher == null) {
//                        sceneSwitcher = new SceneSwitcher();
//                    }
//
//                    try {
//                        sceneSwitcher.switchTo(actionEvent, SceneName.LOGIN);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                });
//            }
//        };

//        animation.fadeObject(loginBtn);
    }
}
