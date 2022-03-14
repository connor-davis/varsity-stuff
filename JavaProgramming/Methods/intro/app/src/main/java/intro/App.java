/*
 * Connor Davis
 * @author ST10068305
 */
package intro;

public class App {
    public static String getGreeting() {
        return "Hello World!";
    }

    /**
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        /**
         * 1. Static Methods -->
         * 2. Non-Static Methods -->
         */

        /**
         * There are two ways of calling a static method
         * The first way is
         */
        App.firstMethod(); // Here we call it and this method can be used in any class

        // The second way is
        firstMethod(); // This can only be called if the method is being called from the same class

        /**
         * To call a non static method from a static method, we need to instantiate the
         * class we are calling from first and then we can call the method we are
         * looking for.
         */
        App app = new App();

        app.secondMethod();
    }

    public static void firstMethod() {
        System.out.println(getGreeting());
    }

    public void secondMethod() {
        System.out.println(getGreeting());
    }
}
