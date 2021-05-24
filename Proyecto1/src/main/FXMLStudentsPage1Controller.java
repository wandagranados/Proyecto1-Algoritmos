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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author wandagranados
 */
public class FXMLStudentsPage1Controller implements Initializable {

    @FXML
    private Text txtTitle;
    @FXML
    private TableView<Student> tableStudents;
    @FXML
    private TableColumn colID;
    @FXML
    private TableColumn colStudentID;
    @FXML
    private TableColumn colName;
    @FXML
    private TableColumn colPhoneNumber;
    @FXML
    private TableColumn colDirection;
    @FXML
    private TableColumn colEmail;
    @FXML
    private TableColumn colCareer;
    @FXML
    private Button btnChange;
    @FXML
    private Button btnDelete;
    
    private ObservableList<Student> students;
    @FXML
    private Button btnAdd;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       students = FXCollections.observableArrayList();
      
       
       this.colID.setCellValueFactory(new PropertyValueFactory("id"));
       this.colStudentID.setCellValueFactory(new PropertyValueFactory("studentID"));
       this.colName.setCellValueFactory(new PropertyValueFactory("name"));
       this.colPhoneNumber.setCellValueFactory(new PropertyValueFactory("phoneNumber"));
       this.colDirection.setCellValueFactory(new PropertyValueFactory("Direction"));
       this.colEmail.setCellValueFactory(new PropertyValueFactory("email"));
       this.colCareer.setCellValueFactory(new PropertyValueFactory("career"));
       
    }    

    @FXML
    private void btnChange(ActionEvent event) {
    }

    @FXML
    private void btnDelete(ActionEvent event) {
    }

    @FXML
    private void btnAdd(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/main/FXMLStudents.fxml"));
            
            Parent root = loader.load();
            
            FXMLStudentsController c = loader.getController();
            c.initAttribute(students);
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.showAndWait();
            
            Student s = c.getStudent();
            
            if(s != null){
               this.students.add(s);
               this.tableStudents.refresh();
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(FXMLStudentsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
