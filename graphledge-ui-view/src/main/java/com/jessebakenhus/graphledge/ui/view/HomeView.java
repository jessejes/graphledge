package com.jessebakenhus.graphledge.ui.view;

import com.jessebakenhus.graphledge.commons.FXMLUtil;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import lombok.NonNull;

import java.io.File;

public class HomeView extends StackPane {

    @NonNull
    private final Runnable switchToNoteView;

    public HomeView(Runnable switchToNoteView) {

        FXMLUtil.loadFXML(this, this.getClass());

        this.switchToNoteView = switchToNoteView;
    }

    @FXML
    public void openFile() {

        FileChooser fileChooser = new FileChooser();

        fileChooser.getExtensionFilters()
                .add(new FileChooser.ExtensionFilter("*.db", "*.db"));

        File file = fileChooser.showOpenDialog(this.getScene().getWindow());
    }

    @FXML
    public void connectToDatabase() {
        switchToNoteView.run();
    }
}
