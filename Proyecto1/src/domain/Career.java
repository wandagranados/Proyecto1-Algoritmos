
package domain;

/**
 *
 * @author bryan
 */
public class Career {
    int id;
    String description;

    public Career(int id, String description) {
        this.id = id;
        this.description = description;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    
    @Override
    public String toString() {
        return "Career{" + "id=" + id + ", description=" + description + '}';
    }
    
    
    
}
