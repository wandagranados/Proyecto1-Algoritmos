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
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author wandagranados // nicole
 */
public class FXMLCourseController implements Initializable {

    @FXML
    private ComboBox comboBox;
    @FXML
    private Label comboBoxLabel;
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
    private TableView<Course> tblTableCourses;

    @FXML
    private TableColumn colDescriptioncareer;
    @FXML
    private TableColumn colCoursename;
    @FXML
    private TableColumn colCredits;
    @FXML
    private TableColumn colCode;

    private ObservableList<Course> course;

    /**
     * This will update the comboBoxLabel when the ComboBox is changed
     */
    public void comboBoxWasUpdated() {
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
//ITEMS CONFIGURING COMBOBOX
        this.colDescriptioncareer.setCellValueFactory(new PropertyValueFactory("Description"));
        comboBox.getItems().add("Business Informatics");
        comboBox.getItems().addAll("English Teaching","Mathematics Teaching","Ecological Tourism", "Business Management");
    }

    @FXML
    private void AddCourses(ActionEvent event) {

        try {

            String Coursename = this.txtCoursename.getText();
            String Description = this.txtDescription.getText();
            int credits = Integer.parseInt(this.txtcredits.getText());
            int code = Integer.parseInt(this.txtcode.getText());

            Course c = new Course(Coursename, Description, credits, code);

            if (!this.course.contains(c)) {
                this.course.add(c);
                this.tblTableCourses.setItems(course);

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Info");
                alert.setContentText("Course added");
                alert.showAndWait();

            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("The course exist");
                alert.showAndWait();
            }
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Incorrect format");
            alert.showAndWait();
        }
    }

    @FXML
    private void Selection(MouseEvent event) {

        Course c = this.tblTableCourses.getSelectionModel().getSelectedItem();

        if (c != null) {
            this.txtCoursename.setText(c.getCoursename());
            this.txtDescription.setText(c.getDescription());
            this.txtcode.setText(c.getcode() + "");
            this.txtcredits.setText(c.getCredits() + "");
        }
    }

    @FXML
    private void ModifyCourse(ActionEvent event) {
        Course c = this.tblTableCourses.getSelectionModel().getSelectedItem();

        if (c == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Select a course");
            alert.showAndWait();
        } else {

            try {

                String Coursename = this.txtCoursename.getText();
                String Description = this.txtDescription.getText();
                int credits = Integer.parseInt(this.txtcredits.getText());
                int code = Integer.parseInt(this.txtcode.getText());

                Course aux = new Course(Coursename, Description, credits, code);

                if (!this.course.contains(aux)) {
                    c.setCoursename(aux.getCoursename());
                    c.setDescription(aux.getDescription());
                    c.setCredits(aux.getCredits());
                    c.setcode(aux.getcode());

                    this.tblTableCourses.refresh();

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setTitle("Info");
                    alert.setContentText("Modified course");
                    alert.showAndWait();

                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("The course exist");
                    alert.showAndWait();
                }
            } catch (NumberFormatException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Incorrect format");
                alert.showAndWait();
            }
        }
    }

    @FXML
    private void DeleteCourses(ActionEvent event) {

        Course c = this.tblTableCourses.getSelectionModel().getSelectedItem();

        if (c == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Select a course");
            alert.showAndWait();
        } else {

            this.course.remove(c);
            this.tblTableCourses.refresh();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Info");
            alert.setContentText("Course removed");
            alert.showAndWait();
        }
    }
}
