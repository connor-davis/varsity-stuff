package davis.connor.app.database;

import java.io.IOException;

/**
 * This class handles the current users' data in the database.
 * @author Connor Davis | ST10068305
 */
public class CurrentUserDatabase extends Database {
    public CurrentUserDatabase() throws IOException {
        super("users", "currentUser");
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
