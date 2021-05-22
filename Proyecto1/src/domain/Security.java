package domain;

/**
 *
 * @author bryan
 */
public class Security {

    String user;
    String password;

    public Security(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Security{" + "user=" + user + ", password=" + password + '}';
    }

}
