package com.rifqimuhammadaziz.javafxcrud.controller.stage;

import com.rifqimuhammadaziz.javafxcrud.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class FirstController {
    @FXML
    public Button firstButton;
    @FXML
    public TextField txtMessage;

    Stage stage = new Stage();

    public void initialize() {
        stage = new Stage();
    }

    public void firstButtonHandler(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainApplication.class.getResource("stage/second.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Page 2");

        SecondController secondController = loader.getController();
        secondController.changeLabel(txtMessage.getText());

        stage.showAndWait();

        // executed when stage is exit
        System.out.println(secondController.getLabelValue());
    }
}
