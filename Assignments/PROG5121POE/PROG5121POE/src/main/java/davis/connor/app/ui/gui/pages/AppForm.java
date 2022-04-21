package davis.connor.app.ui.gui.pages;

import davis.connor.app.database.CurrentUserDatabase;
import davis.connor.app.ui.gui.util.Colors;
import davis.connor.app.utils.Messages;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class AppForm extends JFrame {
    private JPanel contentPane;
    private JButton addTasksButton;
    private JButton showReportButton;
    private JButton quitButton;
    private AuthenticationForm authenticationForm;
    private CurrentUserDatabase currentUserDatabase;

    {
        try {
            currentUserDatabase = new CurrentUserDatabase();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public AppForm(AuthenticationForm authenticationForm) {
        super("EasyKanban");
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

        welcomeMessage = welcomeMessage.replace("$firstName", currentUserDatabase.getFirstName());
        welcomeMessage = welcomeMessage.replace("$lastName", currentUserDatabase.getLastName());

        JOptionPane.showMessageDialog(null, welcomeMessage, "EasyKanban", JOptionPane.INFORMATION_MESSAGE);
    }

    public void buttonListeners() {
        showReportButton.addActionListener(event -> {
            JOptionPane.showMessageDialog(null, "Coming Soon", "EasyKanban", JOptionPane.INFORMATION_MESSAGE);
        });
    }

    private void modifyButtons() {
        addTasksButton.setBackground(Colors.BLUE_500);
        addTasksButton.setForeground(Colors.WHITE);
        addTasksButton.setFocusPainted(false);
        addTasksButton.setBorderPainted(false);

        showReportButton.setBackground(Colors.BLUE_500);
        showReportButton.setForeground(Colors.WHITE);
        showReportButton.setFocusPainted(false);
        showReportButton.setBorderPainted(false);

        quitButton.setBackground(Colors.RED_500);
        quitButton.setForeground(Colors.WHITE);
        quitButton.setFocusPainted(false);
        quitButton.setBorderPainted(false);
    }
}
