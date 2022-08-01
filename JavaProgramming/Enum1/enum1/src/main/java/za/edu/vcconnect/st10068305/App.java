package za.edu.vcconnect.st10068305;

/**
 * 1 August 2022
 */
public class App 
{
    /**
     * Global enum
     */
    enum Size {SMALL,MEDIUM,LARGE,EXTRA_LARGE};
    
    /**
     * What are enums (enumerations) useful for?
     * 
     * 1. They are used as a data type as well as a class
     * 2. They hold a set of fixed constants
     * 3. They are mixed and used within switch statements
     * 4. They improve type safety
     * 5. They make loop traversal easier
     * @param args
     */
    public static void main( String[] args )
    {
        /**
         * Output the enums individually
         */
        System.out.println(Size.SMALL);
        System.out.println(Size.MEDIUM);
        System.out.println("");

        /**
         * Output the enums using a loop
         */
        for (Size size : Size.values()) {
            System.out.println(size);
        }
    }
}
