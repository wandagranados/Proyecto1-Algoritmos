package domain;

/**
 *
 * @author bryan
 */
public class TimeTable {

    int courseID;
    String period, schedule1, schedule2;

    public TimeTable(int courseID, String period, String schedule1, String schedule2) {
        this.courseID = courseID;
        this.period = period;
        this.schedule1 = schedule1;
        this.schedule2 = schedule2;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getSchedule1() {
        return schedule1;
    }

    public void setSchedule1(String schedule1) {
        this.schedule1 = schedule1;
    }

    public String getSchedule2() {
        return schedule2;
    }

    public void setSchedule2(String schedule2) {
        this.schedule2 = schedule2;
    }

    @Override
    public String toString() {
        return "TimeTable{" + "courseID=" + courseID + ", period=" + period + ", schedule1=" + schedule1 + ", schedule2=" + schedule2 + '}';
    }

}
