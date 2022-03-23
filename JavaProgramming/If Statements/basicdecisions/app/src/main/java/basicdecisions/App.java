/*
 * Connor Davis
 * @author ST10068305
 */
package basicdecisions;

import java.io.IOException;
import java.util.Scanner;

public class App {
    /**
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        // Declare the variables
        int mark;

        System.out.println("Program showing basic if statement");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter your mark: ");
            System.out.write("> ".getBytes());

            mark = Integer.parseInt(scanner.next());

            if (mark > 50) {
                System.out.println("You passed.");
            } else {
                System.out.println("You failed.");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
