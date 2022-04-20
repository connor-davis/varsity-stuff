package davis.connor.app;

import com.formdev.flatlaf.FlatIntelliJLaf;
import davis.connor.app.ui.gui.AppForm;
import davis.connor.app.ui.gui.AuthenticationForm;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Connor Davis
 *
 * @author ST10068305
 */
public class App {

    public App() {
    }

    public void registerUI() {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());

            UIManager.put("Component.focusWidth", 0);
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
    }

    public void showUI() {
        AuthenticationForm authenticationForm = new AuthenticationForm();
        authenticationForm.setVisible(true);
    }
}
