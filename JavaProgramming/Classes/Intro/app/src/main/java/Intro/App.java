/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Intro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        // House keeping
        System.out.println("Welcome to human lister!");

        // Declare the variables
        List<Human> humans = new ArrayList<Human>();
        int numberInList = 1;

        try (Scanner scanner = new Scanner(System.in)) {
            promptNewHuman(humans, scanner);

            System.out.println("Thank you for entering 10 names.");
            System.out.println("===== List of Humans =====");

            for (Human human : humans) {
                System.out.println(numberInList + ". " + human.getName());

                numberInList++;
            }

            System.out.println("==========================");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void promptNewHuman(List<Human> humans, Scanner scanner) throws IOException {
        System.out.println("Please enter 10 names...");

        while (humans.size() != 10) {
            System.out.write("> ".getBytes());

            Human human = new Human();

            human.setName(scanner.nextLine());

            humans.add(human);
        }
    }
}
