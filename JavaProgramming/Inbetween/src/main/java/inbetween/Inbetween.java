package inbetween;

import java.io.IOException;
import java.util.Scanner;

/**
 * Connor Davis
 *
 * @author ST10068305
 */
public class Inbetween {
    // Declare the variables
    static final String WELCOME_MESSAGE = "Welcome to Inbetween, this program will display all the numbers \nin between two numbers you provide. \"999\" to exit.";
    static final String NO_NUMBERS_INBETWEEN = "\nThere are no numbers in between those two numbers.";
    static final String FIRST_NUMBER_PROMPT = "\nPlease provide the first number:";
    static final String SECOND_NUMBER_PROMPT = "\nPlease provide the second number:";
    static final int END_OF_LINE = 999;
    static final String END_OF_PROGRAM = "\nEnd of program.";

    static int firstNumber;
    static int secondNumber;

    /**
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        System.out.println(WELCOME_MESSAGE);

        detailLoop();
    }

    public static void detailLoop() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(FIRST_NUMBER_PROMPT);
            System.out.write("> ".getBytes());

            firstNumber = scanner.nextInt();

            while (firstNumber != END_OF_LINE) {
                System.out.println(SECOND_NUMBER_PROMPT);
                System.out.write("> ".getBytes());

                secondNumber = scanner.nextInt();

                if (hasNumbersInbetween(firstNumber, secondNumber)) {
                    displayNumbersInbetween(firstNumber, secondNumber);
                } else {
                    System.out.println(NO_NUMBERS_INBETWEEN);
                }

                System.out.println(FIRST_NUMBER_PROMPT);
                System.out.write("> ".getBytes());

                firstNumber = scanner.nextInt();
            }

            System.out.println(END_OF_PROGRAM);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void displayNumbersInbetween(int firstNumber, int secondNumber) {
        int count = 0;

        if (firstNumber < secondNumber) {
            System.out.println("\n");

            for (int i = firstNumber; i <= secondNumber; i++) {
                count++;

                if (count != 10) {
                    System.out.print(i + "\t");
                } else {
                    System.out.print(i + "\n");

                    count = 0;
                }
            }

            System.out.println("\n");
        } else {
            System.out.println("\n");

            for (int i = secondNumber; i <= firstNumber; i++) {
                count++;

                if (count != 10) {
                    System.out.print(i + "\t");
                } else {
                    System.out.print(i + "\n");

                    count = 0;
                }
            }

            System.out.println("\n");
        }
    }

    public static boolean hasNumbersInbetween(int firstNumber, int secondNumber) {
        String numbersSpread = "";

        if (firstNumber < secondNumber) {
            for (int i = firstNumber; i <= secondNumber; i++) {
                numbersSpread += i + " ";
            }
        } else {
            for (int i = secondNumber; i <= firstNumber; i++) {
                numbersSpread += i + " ";
            }
        }

        return numbersSpread.split(" ").length > 2;
    }
}
