/*
 * Connor Davis
 * @author ST10068305
 */
package room;

import javax.swing.JOptionPane;

public class Room3 {
    /**
     * @param args The Command Line Arguments
     */
    public static void main(String[] args) {
        // Solve the problem
        JOptionPane.showMessageDialog(null, "Welcome to Room Area Calculator", "Room Area Calculator",
                JOptionPane.DEFAULT_OPTION);

        // declare the variables
        double roomLength;
        double roomBreadth;
        double resultRoomArea;

        // assign values to the variables
        roomLength = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the length of your room?",
                "Room Area Calculator", JOptionPane.QUESTION_MESSAGE));

        roomBreadth = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the breadth of your room?",
                "Room Area Calculator", JOptionPane.QUESTION_MESSAGE));

        // calculate the floor space (area) of the room
        resultRoomArea = roomLength * roomBreadth;

        JOptionPane.showMessageDialog(null, "The floor space is " + resultRoomArea + " square feet.",
                "Room Area Calculator", JOptionPane.DEFAULT_OPTION);
    }
}
