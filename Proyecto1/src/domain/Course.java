
package domain;

import java.util.Objects;


/**
 *
 * @author C03274
 */
public class Course {
    int credits,code;
    String Description,Coursename ;



    public Course(String Coursename, String Description, int credits, int code) {
        this.credits = credits;
        this.code = code;
        this.Description = Description;
        this.Coursename = Coursename;}

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getcode() {
        return code;
    }

    public void setcode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getCoursename() {
        return Coursename;
    }

    public void setCoursename(String Coursename) {
        this.Coursename = Coursename;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        if (this.credits != other.credits) {
            return false;
        }
        if (this.code != other.code) {
            return false;
        }
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        if (!Objects.equals(this.Coursename, other.Coursename)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Course{" + "credits=" + credits + ", code=" + code + ", Description=" + Description + ", Coursename=" + Coursename + '}';
    }
    
    
}
