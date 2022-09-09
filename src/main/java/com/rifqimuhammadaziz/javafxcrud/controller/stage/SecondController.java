package com.rifqimuhammadaziz.javafxcrud.controller.stage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SecondController {
    @FXML
    public Button secondButton;
    @FXML
    public Label label;

    public String getLabelValue() {
        return label.getText();
    }

    public void buttonAction(ActionEvent event) {
        label.setText("New Value");

        // get button > get scene > get stage > hide
        ((Node) event.getSource()).getScene().getWindow().hide();
    }

    public void changeLabel(String value) {
        label.setText(value);
    }
}
