package com.haomory.damess;

import com.haomory.damess.scene.SceneName;
import com.haomory.damess.scene.animations.Animation;
import com.haomory.damess.scene.animations.AnimationOption;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class MainController {
    @FXML private Button loginBtn;
    @FXML private Button registerBtn;
    @FXML private Label welcomeLbl;
    @FXML private Label descriptionLbl;

    public void toLogin(MouseEvent actionEvent) {
        AnimationOption animationOption = new AnimationOption();

        Animation animation = new Animation() {
            @Override
            public void fadeAnimationAllObjects(Node[] nodes, AnimationOption animationOption) {
                super.fadeAnimationAllObjects(nodes, animationOption);

                getFadeTransition().onFinishedProperty().set(event -> {
                    try {
                        new SceneSwitcher().switchTo(actionEvent, SceneName.LOGIN);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
            }
        };

        animation.fadeAnimationAllObjects(new Node[] {loginBtn, registerBtn, welcomeLbl, descriptionLbl}, animationOption);
    }
}
