module net.soufiane.tp_products_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.soufiane.tp_products_javafx to javafx.fxml;
    opens net.soufiane.tp_products_javafx.controller to javafx.fxml;
    exports net.soufiane.tp_products_javafx;
}