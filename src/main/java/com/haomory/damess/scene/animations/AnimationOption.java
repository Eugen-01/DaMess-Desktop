package com.haomory.damess.scene.animations;

public class AnimationOption {
    private int toValueFade = 0;
    private int fromValueFade = 10;
    private int fromValueShow = 0;
    private int toValueShow = 10;
    private float durationInSec = 0.4f;

    public int getFromValueShow() {
        return fromValueShow;
    }

    public void setFromValueShow(int fromValueShow) {
        this.fromValueShow = fromValueShow;
    }

    public int getToValueShow() {
        return toValueShow;
    }

    public void setToValueShow(int toValueShow) {
        this.toValueShow = toValueShow;
    }

    public float getDurationInSec() {
        return durationInSec;
    }

    public void setDurationInSec(float durationInSec) {
        this.durationInSec = durationInSec;
    }

    public int getToValueFade() {
        return toValueFade;
    }

    public void setToValueFade(int toValueFade) {
        this.toValueFade = toValueFade;
    }

    public int getFromValueFade() {
        return fromValueFade;
    }

    public void setFromValueFade(int fromValueFade) {
        this.fromValueFade = fromValueFade;
    }
}
