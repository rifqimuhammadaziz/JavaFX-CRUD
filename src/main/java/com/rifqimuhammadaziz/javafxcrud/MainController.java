package com.rifqimuhammadaziz.javafxcrud;

import com.rifqimuhammadaziz.javafxcrud.models.Book;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    public TextField txtId;
    @FXML
    public TextField txtTitle;
    @FXML
    public TextField txtAuthor;
    @FXML
    public TextField txtYear;
    @FXML
    public TextField txtPages;
    @FXML
    public TableColumn<Book, Integer> colId;
    @FXML
    public TableColumn<Book, String> colTitle;
    @FXML
    public TableColumn<Book, String> colAuthor;
    @FXML
    public TableColumn<Book, Integer> colYear;
    @FXML
    public TableColumn<Book, Integer> colPages;
    @FXML
    public TableView<Book> tblBooks;

    public void buttonInsertClick(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
