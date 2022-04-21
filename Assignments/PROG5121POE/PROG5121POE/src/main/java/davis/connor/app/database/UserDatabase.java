package davis.connor.app.database;

import org.mindrot.jbcrypt.BCrypt;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * This class handles the users' data in the database.
 * <p></p>
 * <p>
 * The cryptography library used: <a href="https://www.mindrot.org/projects/jBCrypt/">https://www.mindrot.org/projects/jBCrypt/</a>
 * </p>
 * @author Connor Davis | ST10068305
 */
public class UserDatabase extends Database {
    public UserDatabase(String username) {
        super("users", username);
    }

    /**
     * This method sets the users' username and
     * password in the database.
     *
     * @param username     The users' username.
     * @param passwordHash The users' password.
     */
    public void create(String username, String passwordHash) {
        put("username", username);
        put("password", passwordHash);
    }

    /**
     * This method will hash the users' password.
     *
     * @param password       The users' password.
     * @param saltComplexity The complexity the hash should use.
     * @return The users hashed password.
     */
    public String hashPassword(String password, int saltComplexity) throws NoSuchAlgorithmException {
        SecureRandom random = new SecureRandom();
        byte[] randomBytes = new byte[saltComplexity];

        random.nextBytes(randomBytes);

        String salt = BCrypt.gensalt(4, random);

        return BCrypt.hashpw(password, salt);
    }

    /**
     * This method will validate the entered password
     * with the hashed one in the database.
     *
     * @param password The users' password.
     * @return true/false
     */
    public boolean validatePassword(String password) {
        String passwordHash = get("password");

        return BCrypt.checkpw(password, passwordHash);
    }
}
