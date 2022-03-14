/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package math;

public class MathApp {
    public String getGreeting() {
        return "Hello World!";
    }

    /**
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        int valueA = 7;
        int valueB = 5;

        double valueC = 7.23423;
        double valueD = 0.2342;

        System.out.println("Basic use of the math class.");

        // Math.min
        System.out.println("The lowest value between 7 and 5 will be: " + Math.min(valueA, valueB));

        // Math.max
        System.out.println("The highest value between 7 and 5 will be: " + Math.max(valueA, valueB));

        // pull a value
        System.out.println("The value of Pi is: " + Math.PI);

        // Raise a value to the power of 7
        System.out.println("123 to the power of 7 is: " + Math.pow((double) 123, (double) 7));

        // Square root
        System.out.println("The square root of 9 is: " + Math.sqrt((double) 9));

        // Rounding off functions
        System.out.println("The value 7.23423 rounded is: " + Math.round(valueC));
        System.out.println("The value 0.2342 rounded is: " + Math.round(valueD));
    }
}