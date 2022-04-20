package com.haomory.damess.scene.animations;

import javafx.animation.FadeTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class FadeAnimation {
    private final AnimationOption animationOptions;

    public FadeAnimation(AnimationOption animationOptions) {
        this.animationOptions = animationOptions;
    }

    public FadeAnimation() {
        animationOptions = new AnimationOption();
    }
    private FadeTransition fadeTransition;

    public void fadeObject(Node node, AnimationOption animationOption) {
        fadeTransition = new FadeTransition();

        fadeTransition.setNode(node);
        fadeTransition.setFromValue(animationOption.getFromValue());
        fadeTransition.setToValue(animationOption.getToValue());

        fadeTransition.setDuration(Duration.seconds(animationOptions.getDurationInSec()));

        fadeTransition.play();

        if (node != null) {
            node.setDisable(true);
        }
    }

    public void fadeAnimationAllObjects (Node[] nodes, AnimationOption animationOption) {
        for (Node node : nodes) {
            fadeObject(node, animationOption);
        }
    }

    public FadeTransition getFadeTransition() {
        return fadeTransition;
    }
}
