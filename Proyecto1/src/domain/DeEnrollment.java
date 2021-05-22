
package domain;
import java.util.Date;
/**
 *
 * @author bryan
 */
public class DeEnrollment {
    
    int id;
    String studentID,courseID,schedule,remark;
    Date date;

    public DeEnrollment(int id, String studentID, String courseID, String schedule, String remark) {
        this.id = id;
        this.studentID = studentID;
        this.courseID = courseID;
        this.schedule = schedule;
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "DeEnrollment{" + "id=" + id + ", studentID=" + studentID + ", courseID=" + courseID + ", schedule=" + schedule + ", remark=" + remark + '}';
    }
    
    
    
}
