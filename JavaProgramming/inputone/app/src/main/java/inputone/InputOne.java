/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inputone;

import java.io.IOException;
import java.util.Scanner;

public class InputOne {
    public static void main(String[] args) {
        // program to take values from the user

        // declare the variables
        String firstName;
        String lastName;

        try {
            // Create a Scanner object
            try (Scanner scanner = new Scanner(System.in)) {
                // Request for the firstName
                System.out.println("Enter your first name:");
                System.out.write("> ".getBytes());

                firstName = scanner.next();

                // Request for the lastName
                System.out.println("Enter your last name:");
                System.out.write("> ".getBytes());

                lastName = scanner.next();
            }

            // Say hello to the firstName lastName
            System.out.println("Hello, " + firstName + " " + lastName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}