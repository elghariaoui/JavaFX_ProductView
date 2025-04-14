package net.soufiane.tp_products_javafx.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import net.soufiane.tp_products_javafx.Entity.Product;

import java.net.URL;
import java.util.ResourceBundle;

public class productController implements Initializable {

    @FXML private ListView<Product> listView;
    @FXML private TextField textFieldName;
    @FXML private TextField textFieldPrice;

    @FXML private ObservableList<Product> dataList = FXCollections.observableArrayList();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listView.setItems(dataList);
    }


    public void addProduct(ActionEvent actionEvent) {
        if (textFieldName.getText().isEmpty() || textFieldPrice.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Add Product");
            alert.setContentText("Merci de saisir le nom et le prix du produit");
            alert.show();
        }else {
            dataList.add(new Product(textFieldName.getText(), Double.parseDouble(textFieldPrice.getText())));
            textFieldName.clear();
            textFieldPrice.clear();
        }
    }

    public void removeProduct(ActionEvent actionEvent) {
        int index = listView.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            dataList.remove(index);
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Delete Product");
            alert.setContentText("Selecioner um produit");
            alert.show();
        }
    }
}
