package intro;

import java.io.IOException;
import java.util.Scanner;

import intro.animal.Animal;

/**
 * Connor Davis
 * 
 * @author ST10058305
 */
public class App {
    /**
     * @params args The command line arguments
     */
    public static void main(String[] args) {
        // Program that allocates the chinese zodiac sign for the given year.

        // Declare the variable/s
        int year;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to Chinese Zodiac Converter.");

            System.out.println("Enter the year for testing:");
            System.out.write("> ".getBytes());

            year = scanner.nextInt();

            System.out.println("The year you entered was " + year + ".");

            Animal animal = new Animal(year);

            System.out.println("It is the year of the " + animal.getAnimalName() + ".");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
