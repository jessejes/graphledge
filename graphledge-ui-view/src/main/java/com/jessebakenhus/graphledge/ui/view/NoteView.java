package com.jessebakenhus.graphledge.ui.view;

import com.jessebakenhus.graphledge.commons.FXMLUtil;
import javafx.fxml.Initializable;
import javafx.scene.control.SplitPane;

import java.net.URL;
import java.util.ResourceBundle;

public class NoteView extends SplitPane implements Initializable {

    public NoteView() {
        FXMLUtil.loadFXML(this, this.getClass());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
