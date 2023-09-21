package com.jessebakenhus.graphledge.ui;

import com.jessebakenhus.graphledge.ui.view.HomeView;
import com.jessebakenhus.graphledge.ui.view.NoteView;
import javafx.scene.Node;
import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;

public class FXMLViewFactory {

    private final CompletableFuture<Node> homeViewCompletableFuture;

    private final CompletableFuture<Node> noteViewCompletableFuture;

    public FXMLViewFactory() {
        this.homeViewCompletableFuture = CompletableFuture.supplyAsync(() ->
                new HomeView(() -> ViewManager.getInstance().switchView(NoteView.class)));

        this.noteViewCompletableFuture = CompletableFuture.supplyAsync(NoteView::new);
    }

    @SneakyThrows
    public Node call(Class<?> viewClazz) {

        if (viewClazz.equals(HomeView.class))
            return homeViewCompletableFuture.get();

        if (viewClazz.equals(NoteView.class))
            return noteViewCompletableFuture.get();

        throw new IllegalStateException("No view found.");
    }

}
