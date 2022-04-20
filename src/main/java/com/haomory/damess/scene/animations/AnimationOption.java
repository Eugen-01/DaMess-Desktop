package com.haomory.damess.scene.animations;

public class AnimationOption {
    private int fromValue = 10;
    private int toValue = 0;
    private float durationInSec = 0.15f;


    public float getDurationInSec() {
        return durationInSec;
    }

    public void setDurationInSec(float durationInSec) {
        this.durationInSec = durationInSec;
    }

    public void setFromValue(int fromValue) {
        this.fromValue = fromValue;
    }

    public void setToValue(int toValue) {
        this.toValue = toValue;
    }

    public int getFromValue() {
        return fromValue;
    }

    public int getToValue() {
        return toValue;
    }
}
