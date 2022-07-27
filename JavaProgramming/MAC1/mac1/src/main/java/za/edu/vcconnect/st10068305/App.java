package za.edu.vcconnect.st10068305;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    private static int[][] marks = new int[3][3];

    public static void main(String[] args) {
        System.out.println("We need 3 students marks, please enter them as asked:\n");

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < marks.length; i++) {
                System.out.println("Student " + (i + 1) + ":");

                System.out.print("Please enter the math mark out of 10> ");
                int mathMark = scanner.nextInt();

                System.out.print("Please enter the physics mark out of 10> ");
                int physicsMark = scanner.nextInt();

                System.out.print("Please enter the history mark out of 10> ");
                int historyMark = scanner.nextInt();

                marks[i][0] = mathMark;
                marks[i][1] = physicsMark;
                marks[i][2] = historyMark;
            }
        }

        System.out.println("Student, \tMaths, \t\tPhysics, \tHistory");

        for (int x = 0; x < marks.length; x++) {
            System.out.print((x + 1) + ". \t\t");
            for (int y = 0; y < marks.length; y++) {
                System.out.print(marks[x][y] + "/10, \t\t");
            }
            System.out.print("\n");
        }
    }

}
