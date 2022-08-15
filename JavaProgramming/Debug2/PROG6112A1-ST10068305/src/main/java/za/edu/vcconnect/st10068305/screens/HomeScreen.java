package za.edu.vcconnect.st10068305.screens;

import za.edu.vcconnect.st10068305.api.Product;
import za.edu.vcconnect.st10068305.api.ReportData;
import za.edu.vcconnect.st10068305.data.Database;
import za.edu.vcconnect.st10068305.io.Line;
import za.edu.vcconnect.st10068305.io.Logger;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class HomeScreen extends Screen {
    @Override
    public void display() {
        System.out.print("> ");

        Product product = new Product();

        try (Scanner scanner = new Scanner(System.in)) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());

                if (choice == 1) {
                    prompt();
                } else {
                    product.ExitApplication();
                }
            } catch (NumberFormatException ignored) {
            }
        } catch (NoSuchElementException ignored) {
            product.ExitApplication();
        }
    }

    @Override
    public void prompt() {
        Product product = new Product();

        Logger.clear();

        Logger.log(new Line[]{
                new Line("Please select one of the following menu items:"),
                new Line(""),
                new Line("(1) Capture a new product."),
                new Line("(2) Search for a product."),
                new Line("(3) Update a product."),
                new Line("(4) Delete a product."),
                new Line("(5) Print report."),
                new Line("(6) Exit Application."),
                new Line("")
        });

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("> ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        CaptureProductScreen captureProductScreen = new CaptureProductScreen();
                        captureProductScreen.display();

                        break;
                    case 2:
                        product.SearchProduct(scanner);

                        break;
                    case 3:
                        product.UpdateProduct(scanner);

                        break;
                    case 4:
                        product.DeleteProduct(scanner);

                        break;

                    case 5:
                        ReportData reportData = new ReportData();

                        reportData.setReportItems(Database.items);
                        String report = reportData.getReport();

                        System.out.print(report);

                        System.out.println("Enter (1) to launch menu or any other key to exit.");

                        HomeScreen homeScreen = new HomeScreen();
                        homeScreen.display();

                        break;
                    case 6:
                        product.ExitApplication();

                        break;
                    default:
                        prompt();
                        break;
                }
            } catch (NumberFormatException ignored) {
                prompt();
            }
        }
    }
}
