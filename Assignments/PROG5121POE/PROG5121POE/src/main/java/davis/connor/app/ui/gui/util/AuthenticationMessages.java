package davis.connor.app.ui.gui.util;

import davis.connor.app.utils.Message;

public class AuthenticationMessages {
    public static final Message REGISTERED_SUCCESSFULLY = new Message("success", "You have been registered successfully.");
    public static final Message REGISTRATION_FAILURE = new Message("danger", "Failed to register user.");

    public static final Message LOGGED_IN_SUCCESSFULLY = new Message("success", "You have logged in successfully.");
    public static final Message LOG_IN_FAILURE = new Message("danger", "Failed to log in user.");
}
