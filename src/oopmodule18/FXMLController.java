/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule18;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Hounsvad
 */
public class FXMLController implements Initializable {

    @FXML
    private ListView<?> selectionList;
    @FXML
    private Button handleAddButton;
    @FXML
    private Button handleRemoveButton;
    @FXML
    private Button handleClearButton;
    @FXML
    private Button handleModifyButton;
    @FXML
    private TextField nameField;
    @FXML
    private TextField sirnameField;
    @FXML
    private TextField addressField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField phoneField;
    @FXML
    private Label errorLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleListClick(MouseEvent event) {
    }
    
}
