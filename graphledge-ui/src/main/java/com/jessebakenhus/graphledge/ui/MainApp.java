package com.jessebakenhus.graphledge.ui;

import com.jessebakenhus.graphledge.ui.view.HomeView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lombok.NonNull;

import static com.jessebakenhus.graphledge.commons.Messages.getTranslation;

public class MainApp extends Application {

    @NonNull
    private final ViewManager viewManager;

    public MainApp() {
        this.viewManager = ViewManager.getInstance();
    }

    @Override
    public void start(Stage primaryStage) {

        AnchorPane root = new AnchorPane();
        viewManager.onSwitchView(node -> root.getChildren().setAll(node));
        viewManager.switchView(HomeView.class);

        primaryStage.setTitle(getTranslation("graphledge.Title"));
        primaryStage.setScene(new Scene(root));

        primaryStage.show();
    }
}
