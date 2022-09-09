package com.rifqimuhammadaziz.javafxcrud.controller;

import com.rifqimuhammadaziz.javafxcrud.util.Helper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController extends Helper {

    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;

    public void loginAction(ActionEvent actionEvent) {
        if (txtUsername.getText().equals("user") && txtPassword.getText().equals("password")) {
            System.out.println("Success Login!");
            changePage(actionEvent, "home.fxml");
        } else {
            System.out.println("Login Error!");
        }
    }
}
