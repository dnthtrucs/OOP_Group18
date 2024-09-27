package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    @FXML
    private TextField productIdField, productNameField, productPriceField;

    @FXML
    private ListView<Product> productListView;

    private ObservableList<Product> productList;

    public Controller() {
        productList = FXCollections.observableArrayList();
    }

    @FXML
    public void initialize() {
        productListView.setItems(productList);
    }

    @FXML
    private void handleAddProduct(ActionEvent event) {
        String id = productIdField.getText();
        String name = productNameField.getText();
        double price = Double.parseDouble(productPriceField.getText());

        Product product = new Product(id, name, price);
        productList.add(product);

        productIdField.clear();
        productNameField.clear();
        productPriceField.clear();
    }

    @FXML
    private void handleSaveProducts(ActionEvent event) {
        List<Product> products = new ArrayList<>(productList);
        try {
            FileManager.writeToFile("products.dat", products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleLoadProducts(ActionEvent event) {
        try {
            List<Product> products = FileManager.readFromFile("products.dat");
            productList.setAll(products);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Thêm các chức năng quản lý đơn hàng tương tự
}
