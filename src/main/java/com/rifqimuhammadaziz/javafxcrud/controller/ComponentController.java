package com.rifqimuhammadaziz.javafxcrud.controller;

import com.rifqimuhammadaziz.javafxcrud.models.Book;
import javafx.collections.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ComponentController {
    @FXML
    public Button button1;
    @FXML
    private TableView<Book> tableView;
    @FXML
    private ComboBox<Book> comboBox;
    @FXML
    private ListView<Book> listView;
    @FXML
    private TableColumn<Book, Integer> columnID;
    @FXML
    private TableColumn<Book, String> columnTitle;
    @FXML
    private TableColumn<Book, String> columnAuthor;
    @FXML
    private TableColumn<Book, Integer> columnYear;
    @FXML
    private TableColumn<Book, Integer> columnPages;

    ObservableList<Book> books;
    ObservableMap<String, Book> map;
    ObservableSet<Book> set;

    public void initialize() {
        // LIST : Array | MAP : Key Value | SET : Unique Array

        // LIST
        books = FXCollections.observableArrayList(
                new Book(1, "Buku 1", "Rifqi", 1999, 129),
                new Book(2, "Buku 2", "Rifqi", 1999, 129)
        );

        // MAP
        map = FXCollections.observableHashMap();
        map.put("newBook1", new Book(20, "Book 20", "Rifqi", 1999, 12));
        Book accessMap = map.get("newBook1");
        System.out.println(accessMap);

        // SET
        set = FXCollections.observableSet();
        set.add(new Book(21, "Book 21", "Rifqi", 1999, 13));
        set.add(new Book(22, "Book 22", "Rifqi", 1999, 13));
        for (Book book : set) {
            System.out.println(book.getTitle());
        }

        books.addListener(new ListChangeListener<Book>() {
            @Override
            public void onChanged(Change<? extends Book> c) {
                System.out.println("Data changed!");
            }
        });

        listView.setItems(books);
        comboBox.setItems(books);
        comboBox.getSelectionModel().select(0);

        tableView.setItems(books);
        columnID.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        columnAuthor.setCellValueFactory(new PropertyValueFactory<>("author"));
        columnYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        columnPages.setCellValueFactory(new PropertyValueFactory<>("pages"));
    }

    public void button1Action(ActionEvent event) {
        books.add(new Book(3, "Buku 3", "Rifqi", 1999, 121));
    }
}
