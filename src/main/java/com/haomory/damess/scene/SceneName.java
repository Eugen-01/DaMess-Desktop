package com.haomory.damess.scene;

public enum SceneName {
    MAIN("Main.fxml"), LOGIN("Login.fxml");

    private final String fileName;

    SceneName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
