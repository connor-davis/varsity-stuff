package davis.connor.app.ui.gui.authentication;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AuthenticationTest {
    @Test
    @DisplayName("Check that loginUser() works")
    void loginUser() {
        Authentication authentication = new Authentication();

        assertTrue(authentication.loginUser("cdav_", "@Cp2606#$%"), "Hello World");
        assertFalse(authentication.loginUser("connor", "password"), "Hello World");
    }

    @Test
    @DisplayName("Check that registerUser() works")
    void registerUser() {
        Authentication authentication = new Authentication();

        assertTrue(authentication.registerUser("cdav_", "@Cp2606#$%", "Connor", "Davis"));
    }

    @Test
    @DisplayName("Check that checkUserName() works")
    void checkUserName() {
        Authentication authentication = new Authentication();

        assertTrue(authentication.checkUserName("kyl_!"));
        assertFalse(authentication.checkUserName("kyle!!!!!!!"));
    }

    @Test
    @DisplayName("Check that checkPasswordComplexity() works")
    void checkPasswordComplexity() {
        Authentication authentication = new Authentication();

        assertTrue(authentication.checkPasswordComplexity("Ch&&sec@ke99"));
        assertFalse(authentication.checkPasswordComplexity("password"));
    }
}