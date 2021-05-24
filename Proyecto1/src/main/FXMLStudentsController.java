/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.Student;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author wandagranados
 */
public class FXMLStudentsController implements Initializable {

    @FXML
    private Text txtTitle;
    @FXML
    private Text txtTitle2;
    @FXML
    private Text txtID;
    @FXML
    private Text txtStudentID;
    @FXML
    private Text txtName;
    @FXML
    private Text txtPhoneNumber;
    @FXML
    private Text txtDirection;
    @FXML
    private Text txtEmail;
    @FXML
    private Text txtCareer;
    @FXML
    private Button btnAdd;
    @FXML
    private TextField txtFieldID;
    @FXML
    private TextField txtFieldStudentID;
    @FXML
    private TextField txtFieldName;
    @FXML
    private TextField txtFieldPhoneNumber;
    @FXML
    private TextField txtFieldDirection;
    @FXML
    private TextField txtFieldEmail;
    @FXML
    private ComboBox<?> comboBoxCareer;
    @FXML
    private Button btnWatchStudents;
    @FXML
    private AnchorPane ap;
    
    private Student student;
    
     private ObservableList<Student> students;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
      
      
    }  
    
    public void initAttribute(ObservableList<Student> students){
        this.students = students;
        
    }

    @FXML
    private void btnAdd(ActionEvent event) {
        
        
        
        
        
        int id = Integer.parseInt(this.txtFieldID.getText());
        int studentID = Integer.parseInt(this.txtFieldStudentID.getText());
        String name = this.txtFieldName.getText();
        String phoneNumber = this.txtFieldPhoneNumber.getText();
        String direction = this.txtFieldDirection.getText();
        String email = this.txtFieldEmail.getText();
       // ListCell<?> career = this.comboBoxCareer.getButtonCell();
        
        Student s = new Student(id,studentID,name,phoneNumber,direction,email);
        
        if(students.contains(s)){
            this.student = s;
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Información");
            alert.setContentText("Se ha agregado correctamente");
            alert.showAndWait();
            
            Stage stage =(Stage) this.btnAdd.getScene().getWindow();
            stage.close();
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("La persona ya existe");
            alert.showAndWait(); 
        }
        
        
       
        
        
    }  

    public Student getStudent() {
        return student;
    }
    
    
    
    

    @FXML
    private void txtFieldID(ActionEvent event) {
    }

    @FXML
    private void txtFieldStudentID(ActionEvent event) {
    }

    @FXML
    private void txtFieldName(ActionEvent event) {
    }

    @FXML
    private void txtFieldPhoneNumber(ActionEvent event) {
    }

    @FXML
    private void txtFieldDirection(ActionEvent event) {
    }

    @FXML
    private void txtFieldEmail(ActionEvent event) {
    }

    @FXML
    private void comboBoxCareer(ActionEvent event) {
    }

    @FXML
    private void btnWatchStudents(ActionEvent event) {
        this.student = null;
        
       Stage stage =(Stage) this.btnAdd.getScene().getWindow();
            stage.close(); 
        
         
    }
    
    
}
