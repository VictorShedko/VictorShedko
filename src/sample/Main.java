package sample;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javafx.scene.Scene;

import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;

import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

import javafx.scene.control.Alert;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            AnchorPane root = new AnchorPane();

            root.setPadding(new Insets(5.0));
            Button button = new Button("get");


            TextField txtWandering = new TextField();

            AnchorPane.setBottomAnchor(button, 20.0);
            AnchorPane.setTopAnchor(button, 120.0);
            AnchorPane.setRightAnchor(button, 10.0);
            AnchorPane.setLeftAnchor(button, 220.0);

            AnchorPane.setBottomAnchor(txtWandering, 80.0);
            AnchorPane.setTopAnchor(txtWandering, 80.0);
            AnchorPane.setRightAnchor(txtWandering, 10.0);
            AnchorPane.setLeftAnchor(txtWandering, 240.0);



            Label lblNumOfWanderings = new Label("Number of wanderings: ");
            Label lblTitle= new Label("Random wandering ");
            Label lblResultOfRandom = new Label("Result: ");
            AnchorPane.setBottomAnchor(lblNumOfWanderings, 50.0);
            AnchorPane.setTopAnchor(lblNumOfWanderings, 50.0);
            AnchorPane.setLeftAnchor(lblNumOfWanderings, 10.0);


            AnchorPane.setBottomAnchor(lblResultOfRandom, 10.0);
            AnchorPane.setTopAnchor(lblResultOfRandom, 80.0);
            AnchorPane.setLeftAnchor(lblResultOfRandom, 10.0);


            AnchorPane.setTopAnchor(lblTitle, 10.0);
            AnchorPane.setLeftAnchor(lblTitle, 100.0);

            root.getChildren().add(txtWandering);
            root.getChildren().add(button);
            root.getChildren().add(lblTitle);
            root.getChildren().add(lblNumOfWanderings);
            root.getChildren().add(lblResultOfRandom);
            button.setOnMouseClicked(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent event) {
                    int maxWandering,result;
                    try {
                        maxWandering = Integer.parseInt(txtWandering.getText());
                        result=Controller.getRand(maxWandering);
                        lblResultOfRandom.setText("Result: "+result);
                    }
                    catch(Exception e){
                        Alert alert = new Alert(AlertType.ERROR);
                        alert.setHeaderText("Wrong input !");
                        alert.show();
                    }
                }
            });
            Scene scene = new Scene(root, 400, 200);
            primaryStage.setTitle("Random Wandering");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        launch(args);
    }
}