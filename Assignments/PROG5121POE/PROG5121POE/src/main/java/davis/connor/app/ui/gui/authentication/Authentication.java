package davis.connor.app.ui.gui.authentication;

import davis.connor.app.database.CurrentUserDatabase;
import davis.connor.app.database.UserDatabase;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class Authentication {
    public Authentication() {
    }

    /**
     * This method validates the users' entered password
     * and if it matches the one in the database with their
     * username, the user will authenticate successfully.
     *
     * @param username The users' username.
     * @param password The users' password.
     *
     * @return true/false
     */
    public boolean loginUser(String username, String password) {
        try {
            // Instantiate the user database.
            UserDatabase userDatabase = new UserDatabase(username);

            // Make sure the user exists before continuing.
            if (userDatabase.get("password") == null) return false;

            // Validate the users' password.
            if (userDatabase.validatePassword(password)) {
                // Instantiate the current user database.
                CurrentUserDatabase currentUserDatabase = new CurrentUserDatabase();

                // Set the current users' first and last name and their username.
                currentUserDatabase.setFirstName(userDatabase.get("firstName"));
                currentUserDatabase.setLastName(userDatabase.get("lastName"));
                currentUserDatabase.setUsername(username);

                // Close the current user database.
                currentUserDatabase.close();
                // Close the user database.
                userDatabase.close();

                return true;
            } else {
                return false;
            }
        } catch (IOException exception) {
            exception.printStackTrace();

            return false;
        }
    }

    /**
     * This method will register a new user and
     * update the current user in the database.
     *
     * @param username The users' username.
     * @param password The users' password.
     * @param firstName The users' first name.
     * @param lastName The users' last name.
     *
     * @return true/false
     */
    public boolean registerUser(String username, String password, String firstName, String lastName) {
        try {
            // Instantiate the user database.
            UserDatabase userDatabase = new UserDatabase(username);

            // Hash the users' password.
            String passwordHash = userDatabase.hashPassword(password, 1024);

            // Create the user.
            userDatabase.create(username, passwordHash);

            // Update the users' first and last name.
            userDatabase.put("firstName", firstName);
            userDatabase.put("lastName", lastName);

            // Instantiate the current user database.
            CurrentUserDatabase currentUserDatabase = new CurrentUserDatabase();

            // Set the current users' first and last name and their username.
            currentUserDatabase.setFirstName(firstName);
            currentUserDatabase.setLastName(lastName);
            currentUserDatabase.setUsername(username);

            // Close the current user database.
            currentUserDatabase.close();
            // Close the user database
            userDatabase.close();

            return true;
        } catch (NoSuchAlgorithmException | IOException exception) {
            // If there is an algorithm exception, print the stack trace.
            // Or of there is an IO exception, print the stack trace.
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
        boolean atLeastEightCharactersBoolean = password.length() > 7;

        int capitalLettersCounter = 0;
        int specialCharactersCounter = 0;
        int numbersCounter = 0;

        /*
          Loop through every character in the password string
          and increase the required counters to help decide
          whether the password has the complexity required.
         */
        for (String character : password.split("")) {
            /*
              First try and parse the character to an integer
              to increase the numbers counter.
             */
            try {
                Integer.parseInt(character);

                numbersCounter++;
            } catch (NumberFormatException exception) {
                /*
                  If the character isn't an integer then we are working
                  with a string character and can check whether the
                  required string character types have been inputted.
                 */

                // Increase the capital letters counter.
                if (character.toUpperCase().equals(character)) {
                    capitalLettersCounter++;
                }

                // Increase the special characters counter.
                if (character.equals("!")
                        || character.equals("@")
                        || character.equals("#")
                        || character.equals("$")
                        || character.equals("%")
                        || character.equals("^")
                        || character.equals("&")
                        || character.equals("*")) {
                    specialCharactersCounter++;
                }
            }
        }

        /*
          We make sure that the password
          contains a capital letter.
         */
        boolean hasCapitalLetterBoolean = capitalLettersCounter > 0;

        /*
          We make sure that the password
          contains a number.
         */
        boolean hasNumberBoolean = numbersCounter > 0;

        /*
          We make sure that the password
          contains a special character.
         */
        boolean hasSpecialCharacterBoolean = specialCharactersCounter > 0;

        /*
          Returns true if the password is complex enough
          and false if it isn't.

          If one of the boolean conditions results in false
          the password isn't complex enough and we return
          false.
         */
        return atLeastEightCharactersBoolean && hasCapitalLetterBoolean && hasNumberBoolean && hasSpecialCharacterBoolean;
    }
}
