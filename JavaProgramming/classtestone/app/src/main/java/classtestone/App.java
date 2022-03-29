package classtestone;

import java.io.IOException;
import java.util.Scanner;

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
        // Instantiate a new product
        double productPriceInclVat;
        Product product = new Product();

        // Setup the scanner and catch IOException's
        try (Scanner scanner = new Scanner(System.in)) {
            // Request the product's name
            System.out.println("Product name:");
            System.out.write("> ".getBytes());

            product.setProductName(scanner.nextLine());

            // Request the products price
            System.out.println("Product price:");
            System.out.write("> ".getBytes());

            product.setProductPrice(scanner.nextDouble());

            // Calculate the products price including vat and maybe add a discount if
            // required conditions are set and set it
            productPriceInclVat = product.calculateProductPriceInclVat();

            // Display the product name and final price
            System.out.println("Product: " + product.getProductName() +
                    "\nTotal due: " + productPriceInclVat);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
