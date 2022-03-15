package fullname;

import java.io.IOException;
import java.util.Scanner;

/**
 * Connor Davis
 * 
 * @author ST10068305
 */
public class Fullname {
    /**
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        // Declare the variables
        String fullName;
        String emailAddress;
        String phoneNumber;

        // House keeping
        System.out.println("Welcome to the program, We would like to capture\nyour details.");

        // Create the scanner object and catch an IOException
        try (Scanner scanner = new Scanner(System.in)) {
            // Ask the user for their first name
            System.out.println("Please enter your full name (name and surname):");
            System.out.write("> ".getBytes());

            fullName = scanner.nextLine();

            // Say hello to the user
            System.out.println("Hello there, " + fullName + "!");

            // Ask the user for their email address
            System.out.println("Please enter your email address (someone@example.com):");
            System.out.write("> ".getBytes());

            emailAddress = scanner.nextLine();

            // Ask the user for their phone number
            System.out.println("Please enter your phone number (+...):");
            System.out.write("> ".getBytes());

            phoneNumber = scanner.nextLine();

            // Output the users details to them
            System.out.println("Thank you for entering your details. They are as follows, " + "\n\nFull Name: " + fullName
                    + "\nEmail Address: " + emailAddress + "\nPhone Number: " + phoneNumber);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
