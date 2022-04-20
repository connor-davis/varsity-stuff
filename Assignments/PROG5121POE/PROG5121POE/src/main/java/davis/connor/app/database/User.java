package davis.connor.app.database;

import org.mindrot.jbcrypt.BCrypt;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * This is the functionality for a single user object. Will expand later to be
 * support multiple users.
 *
 * The cryptography library used: <a href="https://www.mindrot.org/projects/jBCrypt/">https://www.mindrot.org/projects/jBCrypt/</a>
 */
public class User extends Database {
    public User(String username) {
        super(username);
    }

    public void create(String username, String passwordHash) {
        put("username", username);
        put("password", passwordHash);
    }

    public String hashPassword(String password, int saltComplexity) throws NoSuchAlgorithmException {
        SecureRandom random = new SecureRandom();
        byte[] randomBytes = new byte[saltComplexity];

        random.nextBytes(randomBytes);

        String salt = BCrypt.gensalt(4, random);

        return BCrypt.hashpw(password, salt);
    }

    public boolean validatePassword(String password) {
        String passwordHash = get("password");

        return BCrypt.checkpw(password, passwordHash);
    }
}
