package davis.connor.app.ui.gui.authentication;

import davis.connor.app.database.CurrentUser;
import davis.connor.app.database.User;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class Authentication {
    public Authentication() {
    }

    public boolean loginUser(String username, String password) {
        User user = new User(username);
        CurrentUser currentUser = new CurrentUser();

        try {
            if (user.validatePassword(password)) {
                currentUser.setFirstName(user.get("firstName"));
                currentUser.setLastName(user.get("lastName"));
                currentUser.setUsername(username);

                currentUser.close();
                user.close();

                return true;
            } else {
                user.close();

                return false;
            }
        } catch (IOException exception) {
            exception.printStackTrace();

            return false;
        }
    }

    public boolean registerUser(String username, String password, String firstName, String lastName) {
        User user = new User(username);
        CurrentUser currentUser = new CurrentUser();

        try {
            String passwordHash = user.hashPassword(password, 1024);

            user.create(username, passwordHash);

            user.put("firstName", firstName);
            user.put("lastName", lastName);

            currentUser.setFirstName(firstName);
            currentUser.setLastName(lastName);
            currentUser.setUsername(username);

            currentUser.close();
            user.close();

            return true;
        } catch (NoSuchAlgorithmException | IOException exception) {
            exception.printStackTrace();

            return false;
        }
    }

    /**
     * Here we apply validation boolean checks
     * to the supplied username.
     *
     * @param username The users username
     * @return true/false
     */
    public boolean checkUserName(String username) {
        /*
          We make sure that the username
          has at least 1 character and
          no more than 5 characters.
         */
        boolean fiveCharacters = username.length() < 6 && username.length() > 0;

        /*
          We make sure that the username
          contains an underscore.
         */
        boolean hasUnderscore = username.contains("_");

        // Return the validation booleans.
        return fiveCharacters && hasUnderscore;
    }

    /**
     * Here we apply validation boolean checks
     * to the supplied password.
     *
     * @param password The users password
     * @return true/false
     */
    public boolean checkPasswordComplexity(String password) {
        /*
          We make sure that the password
          contains at least 8 characters.
         */
        boolean atLeastEightCharacters = password.length() > 7;

        int capitalLetters = 0;
        int specialCharacters = 0;
        int numbers = 0;

        for (String character : password.split("")) {
            try {
                Integer.parseInt(character);
                numbers++;
            } catch (NumberFormatException exception) {
                if (character.toUpperCase().equals(character)) {
                    capitalLetters++;
                }

                if (character.equals("!")
                        || character.equals("@")
                        || character.equals("#")
                        || character.equals("$")
                        || character.equals("%")
                        || character.equals("^")
                        || character.equals("&")
                        || character.equals("*")) {
                    specialCharacters++;
                }
            }
        }

        /*
          We make sure that the password
          contains a capital letter.
         */
        boolean hasCapitalLetter = capitalLetters > 0;

        /*
          We make sure that the password
          contains a number.
         */
        boolean hasNumber = numbers > 0;

        /*
          We make sure that the password
          contains a special character.
         */
        boolean hasSpecialCharacter = specialCharacters > 0;

        return atLeastEightCharacters && hasCapitalLetter && hasNumber && hasSpecialCharacter;
    }
}
