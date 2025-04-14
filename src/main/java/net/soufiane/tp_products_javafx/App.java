package net.soufiane.tp_products_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("product-view.fxml")));
        scene.getStylesheets().add(getClass().getResource("product.css").toExternalForm());
        stage.setTitle("Product View!");
        stage.setScene(scene);
        stage.show();
    }
}
