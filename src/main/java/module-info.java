module com.example.flightreservationsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.flightreservationsystem to javafx.fxml;
    exports com.example.flightreservationsystem;
}