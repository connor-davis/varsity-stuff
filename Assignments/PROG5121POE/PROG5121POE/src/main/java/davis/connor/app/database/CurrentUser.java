package davis.connor.app.database;

public class CurrentUser extends Database {
    public CurrentUser() {
        super("user");
    }

    public String getFirstName() {
        return get("firstName");
    }

    public String getLastName() {
        return get("lastName");
    }

    public String getUsername() {
        return get("username");
    }

    public void setFirstName(String firstName) {
        put("firstName", firstName);
    }

    public void setLastName(String lastName) {
        put("lastName", lastName);
    }

    public void setUsername(String username) {
        put("username", username);
    }

    public void logoutUser() {
        delete("firstName");
        delete("lastName");
        delete("username");
    }
}
