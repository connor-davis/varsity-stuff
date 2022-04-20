package davis.connor.app.ui.gui;

import com.formdev.flatlaf.FlatClientProperties;
import davis.connor.app.database.CurrentUser;
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
    private JLabel welcomeUserMessageLabel;
    private JButton logoutButton;
    private AuthenticationForm authenticationForm;
    private CurrentUser currentUser;

    {
        try {
            currentUser = new CurrentUser();
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
        this.setSize(new Dimension(300, 400));
        this.setResizable(false);
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
        addTasksButton.putClientProperty(FlatClientProperties.STYLE, "arc: 10");
        addTasksButton.setFocusPainted(false);
        addTasksButton.setBorderPainted(false);

        showReportButton.setBackground(Colors.BLUE_500);
        showReportButton.setForeground(Colors.WHITE);
        showReportButton.putClientProperty(FlatClientProperties.STYLE, "arc: 10");
        showReportButton.setFocusPainted(false);
        showReportButton.setBorderPainted(false);

        quitButton.setBackground(Colors.RED_500);
        quitButton.setForeground(Colors.WHITE);
        quitButton.putClientProperty(FlatClientProperties.STYLE, "arc: 10");
        quitButton.setFocusPainted(false);
        quitButton.setBorderPainted(false);
    }
}
