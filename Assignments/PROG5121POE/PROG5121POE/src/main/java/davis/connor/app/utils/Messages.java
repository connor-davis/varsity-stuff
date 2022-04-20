package davis.connor.app.utils;

public class Messages {
    public static final String USERNAME_PROMPT = "Please enter your username:";
    public static final String VALID_USERNAME = "Username successfully captured.";
    public static final String INVALID_USERNAME
            = """
            \nUsername is not correctly formatted please ensure
            that your username contains an underscore and is
            no more than 5 characters in length.
            """;

    public static final String PASSWORD_PROMPT = "Please enter your password:";
    public static final String VALID_PASSWORD = "Password successfully captured.";
    public static final String INVALID_PASSWORD
            = """
            \nPassword is not correctly formatted, please ensure
            that the password contains at least 8 characters,
            a capital and a special character.
            """;

    public static final String REGISTERED_SUCCESSFULLY = "You have been registered successfully.";
    public static final String REGISTRATION_FAILURE = "Failed to register user.";

    public static final String LOGGED_IN_SUCCESSFULLY = "You have logged in successfully.";
    public static final String LOG_IN_FAILURE = "Failed to log in user.";

    public static final String WELCOME_MESSAGE
            = """
            \nWelcome to the program, please authenticate
            or type "quit" to exit program.
            """;
    public static final String WELCOME_USER_MESSAGE
            = """
            \nWelcome $firstName $lastName, it is great to see you again.
            """;
    public static final String LOGIN_OR_REGISTER_PROMPT = "Authenticate [login/register]:";
    public static final String INCORRECT_OPTION = "\nPlease choose a valid option.\n";

}
