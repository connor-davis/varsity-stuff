package factorials;

/**
 * Connor Davis
 * @author ST10068305
 */
public class Factorials {
    /**
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        // Declare the variables
        final int LOOP_START = 1;
        final int LOOP_ITERATIONS = 10;

        System.out.println("We will display the factorial spread and \nfactorial spread equals for numbers from 1 - 10. \n");

        for (int i = LOOP_START; i <= LOOP_ITERATIONS; i++) {
            displayFactorialsOf(i);
        }
    }

    public static void displayFactorialsOf(int number) {
        StringBuilder factorialSpread = new StringBuilder("" + number);
        int factorialSpreadEquals = number;

        System.out.println("For " + number);

        for (int i = number - 1; i != 0; i--) {
            factorialSpread.append(" * ").append(i);
            factorialSpreadEquals = factorialSpreadEquals * i;
        }

        System.out.println("Factorial Spread: " + factorialSpread);
        System.out.println("Factorial Spread Equals: " + factorialSpreadEquals + "\n");
    }
}
