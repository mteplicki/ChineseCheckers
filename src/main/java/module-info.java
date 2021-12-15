module com.trylma.trylma {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.trylma.trylma to javafx.fxml;
    exports com.trylma.trylma;
}