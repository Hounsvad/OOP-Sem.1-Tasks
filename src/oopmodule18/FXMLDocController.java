/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule18;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * FXML Controller class
 *
 * @author Pinnacle F
 */
public class FXMLDocController implements Initializable {

    @FXML
    private Color x2;
    @FXML
    private Font x1;
    @FXML
    private TextField nameField;
    @FXML
    private TextField surnameField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField phoneField;
    @FXML
    private TextField addressField;
    @FXML
    private TextField zipField;
    @FXML
    private Button ButtonAdd;
    @FXML
    private Button buttonDelete;
    @FXML
    private Color x4;
    @FXML
    private Font x3;
    @FXML
    private ListView<Contact> contactListView;
    @FXML
    private ComboBox<Integer> countryCodeComboBox;
    
    ObservableList<Contact> contacts;

    /**
     * initialises the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        contacts = FXCollections.observableArrayList();
        contactListView.setItems(contacts);
    }    

    @FXML
    private void handleAddButton(ActionEvent event) {
        contacts.add(new Contact(nameField.getText(), surnameField.getText(), emailField.getText(), Integer.parseInt(phoneField.getText()), zipField.getText(), addressField.getText()));
    }

    @FXML
    private void handleDeleteButton(ActionEvent event) {
    }
    
}
