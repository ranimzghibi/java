module tp3javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;

    opens application to javafx.graphics, javafx.fxml, javafx.base;
}