package davis.connor.app.ui.console.pages;

import davis.connor.app.database.UserDatabase;
import davis.connor.app.utils.Messages;

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class RegisterPage {
    private final Scanner scanner;

    public RegisterPage(Scanner scanner) {
        this.scanner = scanner;
    }

    public void display() {
        String username = promptUsername();
        String password = promptPassword();

        try {
            UserDatabase userDatabase = new UserDatabase(username);

            String passwordHash = userDatabase.hashPassword(password, 1024);
            System.out.println(Messages.REGISTERED_SUCCESSFULLY);

            userDatabase.create(username, passwordHash);
        } catch (NoSuchAlgorithmException exception) {
            System.out.println(Messages.REGISTRATION_FAILURE);
            exception.printStackTrace();
        }
    }

    /**
     * Here we prompt the user for their
     * username and apply validation to
     * the username before returning it.
     *
     * @return username
     */
    public String promptUsername() {
        System.out.println(Messages.USERNAME_PROMPT);
        System.out.print("> ");

        String username = this.scanner.nextLine();

        do {
            if (checkUserName(username)) {
                System.out.println(Messages.VALID_USERNAME);

                return username;
            }

            System.out.println(Messages.INVALID_USERNAME);

            promptUsername();

            return null;
        } while (true);
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
     * Here we prompt the user for their
     * password and apply validation to
     * the password before returning it.
     *
     * @return password
     */
    private String promptPassword() {
        System.out.println(Messages.PASSWORD_PROMPT);
        System.out.print("> ");

        String password = scanner.nextLine();

        do {
            if (checkPasswordComplexity(password)) {
                System.out.println(Messages.VALID_PASSWORD);

                return password;
            }

            System.out.println(Messages.INVALID_PASSWORD);

            promptPassword();

            return null;
        } while (true);
    }

    /**
     * Here we apply validation boolean checks
     * to the supplied password.
     *
     * @param password The users password
     * @return true/false
     */
    private boolean checkPasswordComplexity(String password) {
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
