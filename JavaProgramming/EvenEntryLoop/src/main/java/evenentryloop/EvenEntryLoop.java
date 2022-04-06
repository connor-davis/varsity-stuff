package evenentryloop;

import java.io.IOException;
import java.util.Scanner;

/**
 * Connor Davis
 *
 * @author ST10068305
 */
public class EvenEntryLoop {
    /**
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        // Declare the variables
        final int END_OF_LINE = 999;
        int numberProvided;
        final String WELCOME_MESSAGE = "Welcome to Even Entry Loop";
        final String REQUEST_NUMBER = "Please provide an even number or quit with 999.";
        final String SUCCESS_MESSAGE = "Good Job!";
        final String ERROR_MESSAGE = "Did you do maths in school?";
        final String END_OF_PROGRAM = "End of program.";

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(WELCOME_MESSAGE);
            System.out.println(REQUEST_NUMBER);
            System.out.write("> ".getBytes());

            numberProvided = scanner.nextInt();

            do {
                if (isEvenNumber(numberProvided)) {
                    System.out.println(SUCCESS_MESSAGE);
                } else {
                    System.out.println(ERROR_MESSAGE);
                }

                System.out.println(REQUEST_NUMBER);
                System.out.write("> ".getBytes());

                numberProvided = scanner.nextInt();
            }
            while (numberProvided != END_OF_LINE);

            System.out.println(END_OF_PROGRAM);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
