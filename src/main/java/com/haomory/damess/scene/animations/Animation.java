package com.haomory.damess.scene.animations;

import javafx.animation.FadeTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class Animation {
    private final FadeTransition fadeTransition = new FadeTransition();
    private final AnimationOption animationOptions;

    public Animation(AnimationOption animationOptions) {
        this.animationOptions = animationOptions;
    }

    public Animation() {
        animationOptions = new AnimationOption();
    }

    public void fadeObject(Node node) {
        fadeTransition.setNode(node);
        fadeTransition.setFromValue(animationOptions.getFromValueFade());
        fadeTransition.setToValue(animationOptions.getToValueFade());

        fadeTransition.setDuration(Duration.seconds(animationOptions.getDurationInSec()));

        fadeTransition.play();

        node.setDisable(true);
    }

    public void showObject(Node node) {
        if (node.isDisable()) {
            fadeTransition.setNode(node);
            fadeTransition.setFromValue(animationOptions.getFromValueShow());
            fadeTransition.setToValue(animationOptions.getToValueShow());

            fadeTransition.setDuration(Duration.seconds(animationOptions.getDurationInSec()));

            fadeTransition.play();

            node.setDisable(false);
        }
    }

    public FadeTransition getFadeTransition() {
        return fadeTransition;
    }
}
