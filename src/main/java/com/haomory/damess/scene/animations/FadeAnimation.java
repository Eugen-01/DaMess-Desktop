package com.haomory.damess.scene.animations;

import javafx.animation.FadeTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class FadeAnimation {
//    private final FadeTransition fadeTransition = new FadeTransition();
    private final AnimationOption animationOptions;
    private boolean finished = false;

    public FadeAnimation(AnimationOption animationOptions) {
        this.animationOptions = animationOptions;
    }

    public FadeAnimation() {
        animationOptions = new AnimationOption();
    }

    public void fadeObject(Node node) {
        final FadeTransition fadeTransition = new FadeTransition();

        fadeTransition.setNode(node);
        fadeTransition.setFromValue(animationOptions.getFromValueFade());
        fadeTransition.setToValue(animationOptions.getToValueFade());

        fadeTransition.setDuration(Duration.seconds(animationOptions.getDurationInSec()));

        fadeTransition.onFinishedProperty().set(event -> {
            finished = true;
            node.setDisable(true);
        });
//El nu face animation in alte obiect in afara de primul

        fadeTransition.play();

    }

    public void fadeAllObjects (Node[] nodes) {
        for (Node node : nodes) {
            fadeObject(node);
        }
    }
}
