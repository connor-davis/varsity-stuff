/**
 * Connor Davis
 * @author ST10068305
 */

package exerciseOne;

import javax.swing.JOptionPane;

public class CircleCalculator {
    /**
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        /**
         * 1. Diameter
         * 2. Circumference
         * 3. Area
         */
        double radius, diameter, circumference, area;
        int selectedCalculationType;

        Object[] options = { "Diameter", "Circumference", "Area" };

        selectedCalculationType = JOptionPane.showOptionDialog(null,
                "Welcome to Circle Calculator,\nWhat would you like to calcule?",
                "Circle Calculator", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,
                options[0]);

        if (options[selectedCalculationType] == "Diameter") {
            radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the radius for the calculation", "Circle Calculator", JOptionPane.QUESTION_MESSAGE));

            diameter = 2 * radius;

            JOptionPane.showMessageDialog(null, "The diameter of the circle is\n" + diameter, "Circle Calculator",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (options[selectedCalculationType] == "Circumference") {
            radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the radius for the calculation", "Circle Calculator", JOptionPane.QUESTION_MESSAGE));

            circumference = Math.PI * 2 * radius;

            JOptionPane.showMessageDialog(null, "The circumference of the circle is\n" + circumference,
                    "Circle Calculator",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (options[selectedCalculationType] == "Area") {
            radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the radius for the calculation", "Circle Calculator", JOptionPane.QUESTION_MESSAGE));

            area = Math.PI * radius * radius;

            JOptionPane.showMessageDialog(null, "The area of the circle is\n" + area, "Circle Calculator",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            return;
        }
    }
}
