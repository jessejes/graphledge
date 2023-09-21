package com.jessebakenhus.graphledge.commons;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.net.URL;

@UtilityClass
public class FXMLUtil {

    public void loadFXML(Node node, Class<?> clazz) {

        URL resource = clazz.getResource(clazz.getSimpleName() + ".fxml");

        FXMLLoader fxmlLoader = new FXMLLoader();

        fxmlLoader.setLocation(resource);
        fxmlLoader.setController(node);
        fxmlLoader.setRoot(node);
        fxmlLoader.setClassLoader(FXMLLoader.getDefaultClassLoader());

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
