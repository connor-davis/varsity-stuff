package numbersdemo;

/**
 * Connor Davis
 * 
 * @author ST10068305
 */
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    /**
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        // Declare the variables
        int variableOne = 10;
        int variableTwo = 15;

        // Calculate twice the value of the variables passed
        displayTwiceTheNumber(variableOne);
        displayTwiceTheNumber(variableTwo);

        // Calculate the value of the variables passed plus five
        displayNumberPlusFive(variableOne);
        displayNumberPlusFive(variableTwo);

        // Calculate the squared of the variables passed
        displayNumberSquared(variableOne);
        displayNumberSquared(variableTwo);
    }

    /**
     * This method calculates and displays twice the number passed
     * 
     * @param num
     * @return
     */
    public static int displayTwiceTheNumber(int num) {
        int twiceNum = num * 2;

        System.out.println("Twice the number " + num + " is " + twiceNum);

        return twiceNum;
    }

    /**
     * This method calculates the number passed plus five
     * 
     * @param num
     * @return
     */
    public static int displayNumberPlusFive(int num) {
        int numPlusFive = num + 5;

        System.out.println(num + " plus five is " + numPlusFive);

        return numPlusFive;
    }

    /**
     * This method calculates the number passed squared
     * 
     * @param num
     * @return
     */
    public static int displayNumberSquared(int num) {
        int numSquared = num * num;

        System.out.println(num + " squared is " + numSquared);

        return numSquared;
    }
}
