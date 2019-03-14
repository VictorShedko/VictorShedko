package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class View extends Application {
    private Controller myController;
    @Override
public void start(Stage primaryStage) {
    try {
        AnchorPane root = new AnchorPane();


        Button randomButton = new Button("random");
        Button subtractorButton = new Button("subtractor");
        Button adderButton = new Button("adder");

        TextField txtFirstNumber = new TextField();
        TextField txtSecondNumber = new TextField();


        AnchorPane.setBottomAnchor(randomButton, 20.0);
        AnchorPane.setTopAnchor(randomButton, 220.0);
        AnchorPane.setRightAnchor(randomButton, 10.0);
        AnchorPane.setLeftAnchor(randomButton, 260.0);

        AnchorPane.setBottomAnchor(subtractorButton, 20.0);
        AnchorPane.setTopAnchor(subtractorButton, 220.0);
        AnchorPane.setRightAnchor(subtractorButton, 140.0);
        AnchorPane.setLeftAnchor(subtractorButton, 120.0);

        AnchorPane.setBottomAnchor(adderButton, 20.0);
        AnchorPane.setTopAnchor(adderButton, 220.0);
        AnchorPane.setRightAnchor(adderButton, 280.0);
        AnchorPane.setLeftAnchor(adderButton, 10.0);


//////////////////////
        AnchorPane.setBottomAnchor(txtFirstNumber, 180.0);
        AnchorPane.setTopAnchor(txtFirstNumber, 80.0);
        AnchorPane.setRightAnchor(txtFirstNumber, 10.0);
        AnchorPane.setLeftAnchor(txtFirstNumber, 240.0);

        AnchorPane.setBottomAnchor(txtSecondNumber, 120.0);
        AnchorPane.setTopAnchor(txtSecondNumber, 140.0);
        AnchorPane.setRightAnchor(txtSecondNumber, 10.0);
        AnchorPane.setLeftAnchor(txtSecondNumber, 240.0);

///////////////////




        Label lblFirstNumber = new Label("First number: ");
        Label lblSecondNumber = new Label("Second number: ");
        Label lblTitle= new Label("Random wandering ");
        Label lblResultOfRandom = new Label("Result: ");
        AnchorPane.setBottomAnchor(lblFirstNumber, 50.0);
        AnchorPane.setTopAnchor(lblFirstNumber, 0.0);
        AnchorPane.setLeftAnchor(lblFirstNumber, 10.0);


        AnchorPane.setBottomAnchor(lblSecondNumber, 50.0);
        AnchorPane.setTopAnchor(lblSecondNumber, 50.0);
        AnchorPane.setLeftAnchor(lblSecondNumber, 10.0);



        AnchorPane.setBottomAnchor(lblResultOfRandom, 10.0);
        AnchorPane.setTopAnchor(lblResultOfRandom, 80.0);
        AnchorPane.setLeftAnchor(lblResultOfRandom, 10.0);


        AnchorPane.setTopAnchor(lblTitle, 10.0);
        AnchorPane.setLeftAnchor(lblTitle, 100.0);

        root.getChildren().add(txtFirstNumber);
        root.getChildren().add(txtSecondNumber);
        root.getChildren().add(randomButton);
        root.getChildren().add(adderButton);
        root.getChildren().add(subtractorButton);
        root.getChildren().add(lblTitle);
        root.getChildren().add(lblFirstNumber);
        root.getChildren().add(lblResultOfRandom);
        root.getChildren().add(lblSecondNumber);

        randomButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                try {

                   int result=myController.analyze("random", Integer.parseInt(txtFirstNumber.getText()), Integer.parseInt(txtSecondNumber.getText()));
                    lblResultOfRandom.setText("Result: "+result);
                }
                catch(Exception e){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText("Wrong input !");
                    alert.show();
                }
            }
        });


        adderButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                try {

                    int result=myController.analyze("add", Integer.parseInt(txtFirstNumber.getText()), Integer.parseInt(txtSecondNumber.getText()));
                    lblResultOfRandom.setText("Result: "+result);
                }
                catch(Exception e){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText("Wrong input !");
                    alert.show();
                }
            }
        });

        subtractorButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                try {

                    int result=myController.analyze("sub", Integer.parseInt(txtFirstNumber.getText()), Integer.parseInt(txtSecondNumber.getText()));
                    lblResultOfRandom.setText("Result: "+result);
                }
                catch(Exception e){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText("Wrong input !");
                    alert.show();
                }
            }
        });



        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Random Wandering");
        primaryStage.setScene(scene);
        primaryStage.show();
    } catch(Exception e) {
        e.printStackTrace();
    }
}

    public View() {
        this.myController= new Controller();

    }






}
