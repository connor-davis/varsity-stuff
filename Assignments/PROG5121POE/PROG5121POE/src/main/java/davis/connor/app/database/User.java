package davis.connor.app.database;

import org.mindrot.jbcrypt.BCrypt;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class User {
    private final String username;

    public User(String username, String password) {
        this.username = username;
    }


    public String hashPassword(String password, int saltComplexity) throws NoSuchAlgorithmException {
        SecureRandom random = new SecureRandom();
        byte[] randomBytes = new byte[saltComplexity];

        random.nextBytes(randomBytes);

        String salt = BCrypt.gensalt(4, random);

        return BCrypt.hashpw(password, salt);
    }
}
