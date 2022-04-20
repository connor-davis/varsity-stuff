package davis.connor.app.ui.gui;

import com.formdev.flatlaf.FlatClientProperties;
import davis.connor.app.database.CurrentUser;
import davis.connor.app.ui.gui.util.Colors;
import davis.connor.app.utils.Messages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class AppForm extends JFrame {
    private JPanel contentPane;
    private JLabel welcomeUserMessageLabel;
    private JButton logoutButton;
    private AuthenticationForm authenticationForm;
    private CurrentUser currentUser = new CurrentUser();

    public AppForm(AuthenticationForm authenticationForm) {
        super("Task One");
        this.authenticationForm = authenticationForm;

        defaults();
    }

    private void defaults() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(contentPane);

        updateUI();

        displayWelcomeMessage();

        modifyButtons();

        buttonListeners();
    }

    private void updateUI() {
        this.pack();
        this.setSize(new Dimension(1280, 720));
        this.setLocationRelativeTo(null);
    }

    private void createUIComponents() {
        contentPane = new JPanel();

        contentPane.setSize(new Dimension(-1, -1));
        contentPane.setBackground(Colors.GRAY_100);
    }

    public void displayWelcomeMessage() {
        String welcomeMessage = Messages.WELCOME_USER_MESSAGE;

        welcomeMessage = welcomeMessage.replace("$firstName", currentUser.getFirstName());
        welcomeMessage = welcomeMessage.replace("$lastName", currentUser.getLastName());

        welcomeUserMessageLabel.setText(welcomeMessage);

        updateUI();
    }

    public void buttonListeners() {
        logoutButton.addActionListener(event -> {
            this.setVisible(false);
            this.dispose();

            currentUser.logoutUser();
            try {
                currentUser.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }

            authenticationForm.reset();
            authenticationForm.updateUI();

            authenticationForm.setVisible(true);
        });
    }

    private void modifyButtons() {
        logoutButton.setBackground(Colors.GRAY_100);
        logoutButton.setForeground(Colors.BLUE_500);
        logoutButton.setFocusPainted(false);
        logoutButton.setBorderPainted(false);
    }
}
