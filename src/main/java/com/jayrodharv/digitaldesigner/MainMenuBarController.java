package com.jayrodharv.digitaldesigner;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class MainMenuBarController {
    @FXML
    protected void onMenuExitButtonClick() {
        Platform.exit();
    }

    @FXML
    protected void onMenuOpenButtonClick() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open circuit diagram file");
        File file = fileChooser.showOpenDialog(new Stage());
        if (file != null) {
            System.out.println("Selected file: " + file.getAbsolutePath());
        }
    }
}
