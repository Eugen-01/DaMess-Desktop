package com.haomory.damess.scene.animations;

import javafx.animation.FadeTransition;

public class Animation extends FadeAnimation{
    public Animation(AnimationOption animationOptions) {
        super(animationOptions);
    }

    public Animation() {
        super();
    }

//    public void showObject(Node node) {
//        if (node.isDisable()) {
//            fadeTransition.setNode(node);
//            fadeTransition.setFromValue(animationOptions.getFromValueShow());
//            fadeTransition.setToValue(animationOptions.getToValueShow());
//
//            fadeTransition.setDuration(Duration.seconds(animationOptions.getDurationInSec()));
//
//            fadeTransition.play();
//
//            node.setDisable(false);
//        }
//    }
}
