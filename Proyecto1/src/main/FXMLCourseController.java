
package main;

import domain.Course;
import java.awt.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author wandagranados // nicole
 */
public class FXMLCourseController implements Initializable {
    @FXML private ComboBox comboBox;
    @FXML private Label comboBoxLabel;
    ///////////////////////////////////
    @FXML 
    private Button btnAdd;
    @FXML 
    private Button btnDelete;
    @FXML 
    private Button btnMenu;
    @FXML 
    private Button btnModify;
    
    @FXML 
    private TextField txtDescription;
    @FXML 
    private TextField txtCoursename;
    @FXML 
    private TextField txtcredits;
    @FXML 
    private TextField txtcode;
    
    @FXML 
    private TableView <Course> tblTableCourses;
    
    @FXML 
    private TableColumn colDescriptioncareer;
    @FXML 
    private TableColumn colCoursename;
    @FXML 
    private TableColumn colCredits;
    @FXML 
    private TableColumn colCode;
   
    private ObservableList <Course> course;
    
    
    
    /**
     * This will update the comboBoxLabel when the ComboBox is changed   
     */
    
    public void comboBoxWasUpdated(){
        this.comboBoxLabel.setText("Carrer selected: \n" + comboBox.getValue().toString());
    }
    
    /////////////////////////////////////////
    
    
    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        course = FXCollections.observableArrayList();
        this.colDescriptioncareer.setCellValueFactory(new PropertyValueFactory("Description"));
        this.colCoursename.setCellValueFactory(new PropertyValueFactory("Coursename"));
        this.colCredits.setCellValueFactory(new PropertyValueFactory("credits"));
        this.colCode.setCellValueFactory(new PropertyValueFactory("txtcode"));
//ITEMS CONFIGURING COMBOBOXthis.colDescriptioncareer.setCellValueFactory(new PropertyValueFactory("Description"));
    //comboBox.getItems().add("Business Informatics");
    //comboBox.getItems().addAll("English Teaching","Mathematics Teaching","Ecological Tourism", "Business Management");
    }   

 
    @FXML
    private void AddCourses(ActionEvent event){
      
       try{ 
        
       String Coursename = this.txtCoursename.getText();
       String Description = this.txtCoursename.getText();
       int credits = Integer.parseInt(this.txtCoursename.getText());
       int code = Integer.parseInt(this.txtCoursename.getText());
    
       Course c = new Course(Coursename, Description, credits, code);
    
       if(this.course.contains(c)){
           this.course.add(c);
           this.tblTableCourses.setItems(course);
       }else{
           Alert alert = new Alert(Alert.AlertType.ERROR);
           alert.setHeaderText(null);
           alert.setTitle("The course exist");
           alert.showAndWait();
       }
       }catch(NumberFormatException e){
           Alert alert = new Alert(Alert.AlertType.ERROR);
           alert.setHeaderText(null);
           alert.setTitle("Incorrect format");
           alert.showAndWait(); 
       }
    }
    

}
