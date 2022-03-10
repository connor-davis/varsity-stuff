/*
 * Connor Davis
 * @author ST10068305
 */
package divisionandmodulus;

public class App {
    /**
     * @param args The Command Line Arguments.
     */
    public static void main(String[] args) {
        // program to show the difference between division and modulus

        // Declare variables
        int valueOne;
        int valueTwo;
        int resultDivision; // --> /
        int resultModulus; // --> %

        // Assign values to variables
        valueOne = 10;
        valueTwo = 3;

        resultDivision = valueOne / valueTwo;
        resultModulus = valueOne % valueTwo;

        System.out.println("Division Result (10 / 3): " + resultDivision + "\nModulus Result (10 % 3): " + resultModulus);
    }
}
