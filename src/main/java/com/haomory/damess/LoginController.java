package com.haomory.damess;

import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class LoginController {
    private SceneSwitcher sceneSwitcher;

    public void toMain(MouseEvent actionEvent) throws IOException {
        if (sceneSwitcher == null) {
            sceneSwitcher = new SceneSwitcher();
        }

        sceneSwitcher.switchTo(actionEvent, SceneName.MAIN);
    }
}
