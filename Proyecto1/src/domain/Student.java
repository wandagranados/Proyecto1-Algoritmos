
package domain;
import java.util.Date;
import javafx.scene.control.ListCell;
/**
 *
 * @author bryan
 */
public class Student {
    
    int id,careerID;
    String studentID,lastname,firstname,phoneNumber,email,address;
    Date birthday;

  

    public Student(int id, int careerID, String studentID, String lastname, String firstname, String phoneNumber, String email, String address, Date birthday) {
        this.id = id;
        this.careerID = careerID;
        this.studentID = studentID;
        this.lastname = lastname;
        this.firstname = firstname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.birthday = birthday;
    }
    
    
    
    

    public Student(int id, int studentID, String name, String phoneNumber, String direction, String email, ListCell<?> career) {
    }

    public Student(int id, int studentID, String firstname, String phoneNumber, String direction, String email) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCareerID() {
        return careerID;
    }

    public void setCareerID(int careerID) {
        this.careerID = careerID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", careerID=" + careerID + ", studentID=" + studentID + ", lastname=" + lastname + ", firstname=" + firstname + ", phoneNumber=" + phoneNumber + ", email=" + email + ", address=" + address + '}';
    }
 
    
}
