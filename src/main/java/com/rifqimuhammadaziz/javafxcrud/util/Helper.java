package com.rifqimuhammadaziz.javafxcrud.util;

import com.rifqimuhammadaziz.javafxcrud.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Helper {

    protected void changePage(ActionEvent event, String page) {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();

        Parent root = null;
        try {
            root = FXMLLoader.load(MainApplication.class.getResource(page));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        stage.setScene(new Scene(root, 1280, 720));
        stage.show();
    }
}
