package davis.connor.app.ui.gui.pages;

import com.formdev.flatlaf.FlatClientProperties;
import davis.connor.app.ui.gui.authentication.Authentication;
import davis.connor.app.ui.gui.pages.AppForm;
import davis.connor.app.ui.gui.util.Colors;
import davis.connor.app.utils.Messages;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class AuthenticationForm extends JFrame {
    private boolean isLoginMethod = true;
    private JPanel contentPane;
    private JPanel authenticationCard;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JButton changeAuthenticationButton;
    private JLabel noAccountLabel;
    private JLabel authenticateLabel;
    private JLabel errorMessageLabel;
    private JLabel usernameValidLabel;
    private JLabel passwordValidLabel;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JButton registerButton;

    private Authentication authentication = new Authentication();

    public AuthenticationForm() {
        super("Task One");

        defaults();

        modifyButtons();

        buttonListeners();
    }

    private void defaults() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(contentPane);

        updateUI();
    }

    void updateUI() {
        this.pack();
        this.setSize(new Dimension(300, getHeight()));
        this.setLocationRelativeTo(null);
    }

    private void createUIComponents() {
        contentPane = new JPanel();

        contentPane.setSize(new Dimension(-1, -1));
        contentPane.setBackground(Colors.GRAY_100);
    }

    public void showApp() {
        setVisible(false);

        AppForm appForm = new AppForm(this);
        appForm.setVisible(true);
    }

    public void reset() {
        firstNameLabel.setVisible(false);
        firstNameField.setVisible(false);
        lastNameLabel.setVisible(false);
        lastNameField.setVisible(false);

        errorMessageLabel.setText("");
        usernameValidLabel.setText("");
        passwordValidLabel.setText("");

        firstNameField.setText("");
        lastNameField.setText("");
        usernameField.setText("");
        passwordField.setText("");

        isLoginMethod = true;
    }

    public void buttonListeners() {
        changeAuthenticationButton.addActionListener(event -> {
            if (isLoginMethod) {
                isLoginMethod = false;
                noAccountLabel.setText("Already have an account?");
                changeAuthenticationButton.setText("Login");
                firstNameLabel.setVisible(true);
                firstNameField.setVisible(true);
                lastNameLabel.setVisible(true);
                lastNameField.setVisible(true);
            } else {
                isLoginMethod = true;
                noAccountLabel.setText("Don't have an account?");
                changeAuthenticationButton.setText("Register");
                firstNameLabel.setVisible(false);
                firstNameField.setVisible(false);
                lastNameLabel.setVisible(false);
                lastNameField.setVisible(false);
            }

            modifyButtons();
            updateUI();
        });

        loginButton.addActionListener(event -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (authentication.loginUser(username, password)) {
                errorMessageLabel.setText(Messages.LOGGED_IN_SUCCESSFULLY);
                errorMessageLabel.setForeground(Colors.GREEN_700);

                Timer timer = new Timer("WaitThenClose");

                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        showApp();
                        this.cancel();
                        timer.cancel();
                    }
                };

                timer.schedule(task, 2000L);
            } else {
                errorMessageLabel.setText(Messages.LOG_IN_FAILURE);
                errorMessageLabel.setForeground(Colors.RED_500);
            }

            errorMessageLabel.setVisible(true);
            updateUI();
        });

        registerButton.addActionListener(event -> {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (authentication.checkUserName(username)) {
                usernameValidLabel.setText(Messages.VALID_USERNAME);
                usernameValidLabel.setForeground(Colors.GREEN_700);
                usernameValidLabel.setVisible(true);

                updateUI();

                if (authentication.checkPasswordComplexity(password)) {
                    passwordValidLabel.setText(Messages.VALID_PASSWORD);
                    passwordValidLabel.setForeground(Colors.GREEN_700);
                    passwordValidLabel.setVisible(true);

                    updateUI();

                    if (authentication.registerUser(username, password, firstName, lastName)) {
                        errorMessageLabel.setText(Messages.REGISTERED_SUCCESSFULLY);
                        errorMessageLabel.setForeground(Colors.GREEN_700);
                    } else {
                        errorMessageLabel.setText(Messages.REGISTRATION_FAILURE);
                        errorMessageLabel.setForeground(Colors.RED_500);
                    }

                    errorMessageLabel.setVisible(true);
                    updateUI();
                } else {
                    JOptionPane.showMessageDialog(contentPane, Messages.INVALID_PASSWORD, "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(contentPane, Messages.INVALID_USERNAME, "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private void modifyButtons() {
        loginButton.setBackground(Colors.BLUE_500);
        loginButton.setForeground(Colors.WHITE);
        loginButton.putClientProperty(FlatClientProperties.STYLE, "arc: 10");
        loginButton.setFocusPainted(false);
        loginButton.setBorderPainted(false);
        loginButton.setVisible(isLoginMethod);

        registerButton.setBackground(Colors.BLUE_500);
        registerButton.setForeground(Colors.WHITE);
        registerButton.putClientProperty(FlatClientProperties.STYLE, "arc: 10");
        registerButton.setFocusPainted(false);
        registerButton.setBorderPainted(false);
        registerButton.setVisible(!isLoginMethod);

        changeAuthenticationButton.setBackground(Colors.GRAY_100);
        changeAuthenticationButton.setForeground(Colors.BLUE_500);
        changeAuthenticationButton.setFocusPainted(false);
        changeAuthenticationButton.setBorderPainted(false);
    }
}
