package com.jessebakenhus.graphledge.ui;

import com.jessebakenhus.graphledge.ui.view.HomeView;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.Node;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.function.Consumer;

@RequiredArgsConstructor
public class ViewManager {

    @NonNull
    private final FXMLViewFactory fxmlViewFactory = new FXMLViewFactory();

    @NonNull
    private final Property<Node> currentViewProperty = new SimpleObjectProperty<>();

    private static final ViewManager instance = new ViewManager();

    public static ViewManager getInstance() {
        return instance;
    }

    public void switchView(Class<?> clazz) {

        Node call = fxmlViewFactory.call(clazz);

        currentViewProperty.setValue(call);
    }

    public void onSwitchView(Consumer<Node> nodeSupplier) {
        currentViewProperty.addListener((observable, oldValue, newValue) -> nodeSupplier.accept(newValue));
    }
}
