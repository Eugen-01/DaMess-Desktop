package com.haomory.damess;

import com.haomory.damess.scene.SceneName;
import com.haomory.damess.scene.animations.Animation;
import com.haomory.damess.scene.animations.AnimationOption;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class LoginController {
    private SceneSwitcher sceneSwitcher;

    @FXML private Label LoginLbl;
    @FXML private TextField loginField;
    @FXML private PasswordField passwordField;
    @FXML private CheckBox RmeCheckBox;
    @FXML private Button loginBtn;


    public void toMain(MouseEvent actionEvent) {
        AnimationOption animationOption = new AnimationOption();

        Animation animation = new Animation() {
            @Override
            public void fadeAnimationAllObjects(Node[] nodes, AnimationOption animationOption) {
                super.fadeAnimationAllObjects(nodes, animationOption);

                getFadeTransition().onFinishedProperty().set(event -> {
                    try {
                        new SceneSwitcher().switchTo(actionEvent, SceneName.MAIN);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
            }
        };

        animation.fadeAnimationAllObjects(new Node[] {LoginLbl, loginField, passwordField, RmeCheckBox, loginBtn}, animationOption);
    }
}
