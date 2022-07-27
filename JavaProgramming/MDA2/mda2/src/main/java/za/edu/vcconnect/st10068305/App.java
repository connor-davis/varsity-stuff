package za.edu.vcconnect.st10068305;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App {
    private static int[][] rents = { { 400, 450, 510 }, { 500, 560, 630 }, { 625, 676, 740 }, { 1000, 1250, 1600 } };

    public static void main(String[] args) {
        String printMessage = "";

        for (int x = 0; x < rents.length; x++) {
            for (int y = 0; y < rents[x].length; y++) {
                if (y + 1 == rents[x].length) {
                    System.out.print(rents[x][y] + ", \n");
                    printMessage += rents[x][y] + ", \n";
                }
                else {
                    System.out.print(rents[x][y] + ", \t");
                    printMessage += rents[x][y] + ", \t";
                }
            }
        }

        JOptionPane.showMessageDialog(null, printMessage);
    }
}
