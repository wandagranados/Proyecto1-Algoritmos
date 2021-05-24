/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author wandagranados
 */
public class FXMLCourseController implements Initializable {
    @FXML private ComboBox comboBox;
    @FXML private Label comboBoxLabel;
    
    
    
    /**
     * This will update the comboBoxLabel when the ComboBox is changed   
     */
    
    public void comboBoxWasUpdated(){
        this.comboBoxLabel.setText("Carrer selected: \n" + comboBox.getValue().toString());
    }
    
    
    
    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    //ITEMS CONFIGURING COMBOBOX
    comboBox.getItems().add("Business Informatics");
    comboBox.getItems().addAll("English Teaching","Mathematics Teaching","Ecological Tourism", "Business Management");
    }   

 
    

}
