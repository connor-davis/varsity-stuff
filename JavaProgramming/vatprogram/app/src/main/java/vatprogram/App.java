/*
 * Connor Davis
 * @author ST10068305
 */
package vatprogram;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    /**
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        // declare the constant variables
        final double VAT = 15;
        final double BASE = 100;

        // declare the variables
        double orgAmount;
        double vatAmount;
        double amountExcluding;

        // Create the scanner object
        try (Scanner scanner = new Scanner(System.in)) {
            // House keeping
            System.out.println("Welcome to vat program\nThis program computes vat");

            // Get the original amount from the user
            System.out.println("What is the amount?");
            System.out.write("> ".getBytes());

            orgAmount = scanner.nextDouble();

            // Calculate tax
            vatAmount = orgAmount * (VAT / (VAT + BASE));

            // Output the tax
            System.out.println("The tax is " + vatAmount);

            // Calculate tax excluding
            amountExcluding = orgAmount * (BASE / (BASE + VAT));

            // Output the amount excluding tax
            System.out.println("The amount excluding tax is " + amountExcluding);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
