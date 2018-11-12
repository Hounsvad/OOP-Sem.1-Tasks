/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodule17.chapter4;

import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
/**
 * FXML Controller class
 *
 * @author Pinnacle F
 */
public class FXMLController {

    @FXML
    private Text actiontarget;
    
    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");
    }
}
