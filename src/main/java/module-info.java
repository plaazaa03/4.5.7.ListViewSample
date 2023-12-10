module es.ieslosmontecillos.listview {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.listview to javafx.fxml;
    exports es.ieslosmontecillos.listview;
}