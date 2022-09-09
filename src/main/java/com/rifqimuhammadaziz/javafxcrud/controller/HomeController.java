package com.rifqimuhammadaziz.javafxcrud.controller;

import com.rifqimuhammadaziz.javafxcrud.util.Helper;
import javafx.event.ActionEvent;

public class HomeController extends Helper {
    public void logoutAction(ActionEvent actionEvent) {
        changePage(actionEvent, "login-view.fxml");
    }
}
