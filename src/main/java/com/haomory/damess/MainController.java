package com.haomory.damess;

import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class MainController {
    private SceneSwitcher sceneSwitcher;

    public void toLogin(MouseEvent actionEvent) throws IOException {
        if (sceneSwitcher == null) {
            sceneSwitcher = new SceneSwitcher();
        }

        sceneSwitcher.switchTo(actionEvent, SceneName.LOGIN);
    }
}
