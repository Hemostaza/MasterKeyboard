module pl.hemostaza.masterkeyboard {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.hemostaza.masterkeyboard to javafx.fxml;
    exports pl.hemostaza.masterkeyboard;
}