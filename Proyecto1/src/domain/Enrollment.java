
package domain;
import java.util.Date;
/**
 *
 * @author bryan
 */
public class Enrollment {
    
    
   String studentID,courseID,schedule; 
   int id;
    Date date;

    public Enrollment(String studentID, String courseID, String schedule, int id) {
        this.studentID = studentID;
        this.courseID = courseID;
        this.schedule = schedule;
        this.id = id;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Enrollment{" + "studentID=" + studentID + ", courseID=" + courseID + ", schedule=" + schedule + ", id=" + id + '}';
    }
   
   
   
}
