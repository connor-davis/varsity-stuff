/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        MathApp classUnderTest = new MathApp();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
