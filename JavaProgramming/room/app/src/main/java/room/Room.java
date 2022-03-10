/*
 * Connor Davis
 * @author ST10068305
 */
package room;

public class Room {
    /**
     * @param args The Command Line Arguments
     */
    public static void main(String[] args) {
        // Solve the problem

        // declare the variables
        int roomLength;
        int roomBreadth;
        int resultRoomArea;

        // assign values to the variables
        roomLength = 15;
        roomBreadth = 25;

        // calculate the floor space (area) of the room
        resultRoomArea = roomLength * roomBreadth;

        System.out.println("The floor space is " + resultRoomArea + " square feet.");
    }
}
