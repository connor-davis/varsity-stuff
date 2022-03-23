package Percentages;

import java.io.IOException;
import java.util.Scanner;

/**
 * Connor Davis
 * @author ST10068305
 */
public class App {
    /**
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        // Declare the variables
        double valueA;
        double valueB;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter value a:");
            System.out.write("> ".getBytes());

            valueA = Double.parseDouble(scanner.nextLine());

            System.out.println("Please enter value b:");
            System.out.write("> ".getBytes());

            valueB = Double.parseDouble(scanner.nextLine());

            // compute the percentage of value a divided by value b
            computePercentages(valueA, valueB);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method will compute the percentage of one double over another.
     * 
     * @param a The first value
     * @param b The second value
     * 
     * @return Double percentage
     */
    public static double computePercentages(double a, double b) {
        System.out.println("Value a:" + a);
        System.out.println("Value b:" + b);

        double percentage = (a / b) * 100.0;

        System.out.println("Value a is " + percentage + "% of value b");

        return percentage;
    }
}