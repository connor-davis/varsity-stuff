package davis.connor.app.ui.gui;

import davis.connor.app.database.CurrentUser;
import davis.connor.app.ui.gui.util.Colors;
import davis.connor.app.utils.Messages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

public class AppForm extends JFrame {
    private JPanel contentPane;
    private JLabel welcomeUserMessageLabel;

    public AppForm() {
        super("Task One");

        defaults();
    }

    private void defaults() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(contentPane);

        updateUI();

        displayWelcomeMessage();
    }

    private void updateUI() {
        this.pack();
        this.setSize(new Dimension(300, 400));
        this.setLocationRelativeTo(null);
    }

    private void createUIComponents() {
        contentPane = new JPanel();

        contentPane.setSize(new Dimension(-1, -1));
        contentPane.setBackground(Colors.GRAY_100);
    }

    public void displayWelcomeMessage() {
        CurrentUser currentUser = new CurrentUser();

        String welcomeMessage = Messages.WELCOME_USER_MESSAGE;

        welcomeMessage = welcomeMessage.replace("$firstName", currentUser.getFirstName());
        welcomeMessage = welcomeMessage.replace("$lastName", currentUser.getLastName());

        welcomeUserMessageLabel.setText(welcomeMessage);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    currentUser.close();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        });
    }
}
