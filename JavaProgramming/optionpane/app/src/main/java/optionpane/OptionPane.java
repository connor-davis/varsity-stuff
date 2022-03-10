/*
 * Connor Davis
 * @author ST10068305
 */
package optionpane;

import javax.swing.JOptionPane;

public class OptionPane {
    public static String getGreeting() {
        return "Hello World!";
    }

    /**
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        String name;
        int age;
        double weight;

        // Program to show the basic use of JOptionPane
        JOptionPane.showMessageDialog(null, getGreeting());

        // Change the title and the icon of the JOptionPane
        JOptionPane.showMessageDialog(null, "You are awesome!", "OptionPane", JOptionPane.WARNING_MESSAGE);

        // Getting user's name from JOptionPane
        name = JOptionPane.showInputDialog(null, "What is your name", "OptionPane", JOptionPane.QUESTION_MESSAGE);

        // Say hello to the user with JOptionPane
        JOptionPane.showMessageDialog(null, "Hello " + name, "OptionPane", JOptionPane.WARNING_MESSAGE);

        // Working with different data types
        age = Integer.parseInt(
                JOptionPane.showInputDialog(null, "What is your age?", "OptionPane", JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null, "Wow, " + age + " is an awesome age!", "OptionPane",
                JOptionPane.WARNING_MESSAGE);

        weight = Double.parseDouble(
                JOptionPane.showInputDialog(null, "What is your weight?", "OptionPage", JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null, "You weigh " + weight, "OptionPane", JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(null,
                "Hello " + name + "\nYou are " + age + " years old\n" + "And you weigh " + weight);
    }
}
