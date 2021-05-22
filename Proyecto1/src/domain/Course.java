
package domain;


/**
 *
 * @author bryan
 */
public class Course {
    int credits,careerID;
    String id,name ;

    public Course(int credits, int careerID, String id, String name) {
        this.credits = credits;
        this.careerID = careerID;
        this.id = id;
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCareerID() {
        return careerID;
    }

    public void setCareerID(int careerID) {
        this.careerID = careerID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" + "credits=" + credits + ", careerID=" + careerID + ", id=" + id + ", name=" + name + '}';
    }
    
    
}
