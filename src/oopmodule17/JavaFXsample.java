/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule17;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Hounsvad
 */
public class JavaFXsample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Create simple text
        Label txtLbl = new Label("Hello, JavaFX!");
        //Create a root for the sceen graph and add a label to the rood node
        StackPane root = new StackPane(txtLbl);
        //Create a new scene and pass scene graph represented through root
        Scene scene = new Scene(root, 300, 250);
        //Coonfigure primary stage and show it
        primaryStage.setTitle("HelloWord!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
