module com.nln.englishapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nln.englishapp to javafx.fxml;
    exports com.nln.englishapp;
}
