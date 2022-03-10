/*
 * Connor Davis
 * @author ST10068305
 */
package room;

import java.io.IOException;
import java.util.Scanner;

public class Room2 {
    /**
     * @param args The Command Line Arguments
     */
    public static void main(String[] args) {
        // Solve the problem

        // declare the variables
        int roomLength;
        int roomBreadth;
        int resultRoomArea;

        try (Scanner scanner = new Scanner(System.in)) {
            try {
                // assign values to the variables
                System.out.print("What is the length of the room?\n");
                System.out.write("> ".getBytes());

                roomLength = scanner.nextInt();

                System.out.print("What is the length of the room?\n");
                System.out.write("> ".getBytes());

                roomBreadth = scanner.nextInt();

                // calculate the floor space (area) of the room
                resultRoomArea = roomLength * roomBreadth;

                System.out.println("The floor space is " + resultRoomArea + " square feet.");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
