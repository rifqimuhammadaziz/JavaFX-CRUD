module com.rifqimuhammadaziz.javafxcrud {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires java.sql;

    opens com.rifqimuhammadaziz.javafxcrud to javafx.fxml;
    exports com.rifqimuhammadaziz.javafxcrud;
    opens com.rifqimuhammadaziz.javafxcrud.controller;
    exports com.rifqimuhammadaziz.javafxcrud.controller;
    opens com.rifqimuhammadaziz.javafxcrud.models;

    opens com.rifqimuhammadaziz.javafxcrud.controller.stage;
}