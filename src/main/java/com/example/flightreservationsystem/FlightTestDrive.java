package com.example.flightreservationsystem;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FlightTestDrive extends Application {
    Stage window;
    Scene sceneClient, sceneAdmin;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;

        Label flightNumberLabel = new Label("Flight no.1");
        GridPane grid = new GridPane();
        grid.add(flightNumberLabel,0,0);
        Button adminButton = new Button("admin");
        grid.add(adminButton, 1,1 );
        sceneClient = new Scene(grid, 600, 200);

        adminButton.setOnAction(event-> window.setScene(sceneAdmin));
        //admin system
        Button reservationButton = new Button("Reservation");
        GridPane grid2 = new GridPane();
        grid2.add(reservationButton, 1,1);
        sceneAdmin = new Scene(grid2, 600,200);

        window.setScene(sceneClient);
        window.setTitle("Flight Reservation System");
        window.show();
    }




}