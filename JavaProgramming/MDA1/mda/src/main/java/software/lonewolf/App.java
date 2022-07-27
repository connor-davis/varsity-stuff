package software.lonewolf;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App {
    private static int[][] rents = { { 400, 450, 510 }, { 500, 560, 630 }, { 625, 676, 740 }, { 1000, 1250, 1600 } };

    public static void main(String[] args) {
        // int rooms = Integer.parseInt(JOptionPane.showInputDialog(null,
        //         "Welcome to Matrix Properties! Please enter the number of rooms to continue: [0-2]"));
        // int floor = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the floor number: [1-4]"));

        // JOptionPane.showMessageDialog(null, "The rent for this room is $" + floors[floor - 1][rooms]);

        int position = 1;

        System.out.println("Here are the room rent prices:");
        System.out.println("---------------------------------------------------------");
        System.out.println("Room number \t| Floor \t| Rooms \t| Price |");
        System.out.println("---------------------------------------------------------");

        StringBuilder tabledForJOP = new StringBuilder();

        tabledForJOP.append("Room number \t| Floor \t| Rooms \t| Price |\n");
        
        for (int x = 0; x < rents.length; x++) {
            for (int y = 0; y < rents[x].length; y++) {
                System.out.println(position + " \t\t| " + (x + 1) + " \t\t| " + y + " \t\t| $" + rents[x][y] + " |");
                tabledForJOP.append(position + " \t\t| " + (x + 1) + " \t\t| " + y + " \t\t| $" + rents[x][y] + " |\n");
                position++;
            }
        }

        JOptionPane.showMessageDialog(null, tabledForJOP.toString());

        System.out.println("---------------------------------------------------------");
    }
}
