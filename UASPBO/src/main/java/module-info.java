module id.ac.upj.tif.uaspbo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens id.ac.upj.tif.uaspbo to javafx.fxml;
    exports id.ac.upj.tif.uaspbo;
}