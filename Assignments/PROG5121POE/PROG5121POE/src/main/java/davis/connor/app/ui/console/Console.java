package davis.connor.app.ui.console;

import davis.connor.app.ui.console.pages.RegisterPage;
import davis.connor.app.utils.Commands;
import davis.connor.app.utils.Messages;

import java.util.Scanner;

public class Console {
    public Console() {
        System.out.println(Messages.WELCOME_MESSAGE);
    }

    public void display() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(Messages.LOGIN_OR_REGISTER_PROMPT);
            System.out.print("> ");

            String command = scanner.nextLine();

            switch (command) {
                case Commands.LOGIN -> display();

                case Commands.REGISTER -> {
                    RegisterPage registerPage = new RegisterPage(scanner);
                    registerPage.display();
                    display();
                }

                case Commands.QUIT_PROGRAM -> {
                    scanner.close();
                }

                default -> {
                    System.out.println(Messages.INCORRECT_OPTION);
                    display();
                }
            }
        }
    }


}
