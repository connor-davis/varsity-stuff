package za.edu.vcconnect.st10068305.api;

import za.edu.vcconnect.st10068305.data.Database;
import za.edu.vcconnect.st10068305.io.Line;
import za.edu.vcconnect.st10068305.io.Logger;
import za.edu.vcconnect.st10068305.screens.HomeScreen;

import java.util.Scanner;

public class Product {
    public Product() {
    }

    public void SearchProduct(Scanner scanner) {
        System.out.print("Please enter the product code to search: ");

        String itemCode = scanner.nextLine();

        if (Database.items.size() > 0) {

            for (Item item : Database.items) {
                if (item.getItemCode().equals(itemCode)) {
                    Logger.clear();

                    Logger.log(new Line[]{
                            new Line("*****************************************"),
                            new Line("         PRODUCT SEARCH RESULTS          "),
                            new Line("*****************************************"),
                            new Line("PRODUCT CODE:         " + item.getItemCode()),
                            new Line("PRODUCT NAME:         " + item.getItemName()),
                            new Line("PRODUCT WARRANTY:     " + item.getItemWarrantyMonths() + " months"),
                            new Line("PRODUCT CATEGORY:     " + item.getItemCategory()),
                            new Line("PRODUCT PRICE:        R" + item.getItemPrice()),
                            new Line("PRODUCT STOCK LEVELS: " + item.getItemStock()),
                            new Line("PRODUCT SUPPLIER:     " + item.getItemSupplierName()),
                            new Line("*****************************************"),
                    });

                    DisplayMenu();
                } else {
                    Logger.clear();

                    Logger.log(new Line[]{
                            new Line("*****************************************"),
                            new Line("         PRODUCT SEARCH RESULTS          "),
                            new Line("*****************************************"),
                            new Line("              Item not found.            "),
                            new Line("*****************************************"),
                    });

                    DisplayMenu();
                }
            }
        } else {
            Logger.clear();

            Logger.log(new Line[]{
                    new Line("*****************************************"),
                    new Line("         PRODUCT SEARCH RESULTS          "),
                    new Line("*****************************************"),
                    new Line("              Item not found.            "),
                    new Line("*****************************************"),
            });

            DisplayMenu();
        }
    }

    public void UpdateProduct(Scanner scanner) {
        System.out.print("Please enter the product code to search: ");

        String itemCode = scanner.nextLine();

        if (Database.items.size() > 0) {

            for (Item item : Database.items) {
                if (item.getItemCode().equals(itemCode)) {
                    System.out.print("Update the warranty? (y) Yes, (n) No: ");

                    String updateWarrantyChoice = scanner.nextLine();

                    if (updateWarrantyChoice.equals("y")) {
                        System.out.print("Enter the new warranty months for " + item.getItemName() + ": ");

                        try {
                            int itemWarrantyMonths = Integer.parseInt(scanner.nextLine());

                            item.setItemWarrantyMonths(itemWarrantyMonths);
                        } catch (NumberFormatException ignored) {
                            System.out.println("Failed to update product. Please try again.");

                            DisplayMenu();
                        }
                    }

                    System.out.print("Update the product price? (y) Yes, (n) No: ");

                    String updateProductPriceChoice = scanner.nextLine();

                    if (updateProductPriceChoice.equals("y")) {
                        System.out.print("Enter the new product price for " + item.getItemName() + ": ");

                        try {
                            int itemPrice = Integer.parseInt(scanner.nextLine());

                            item.setItemPrice(itemPrice);
                        } catch (NumberFormatException ignored) {
                            System.out.println("Failed to update product. Please try again.");

                            DisplayMenu();
                        }
                    }

                    System.out.print("Update the stock level? (y) Yes, (n) No: ");

                    String updateStockLevelChoice = scanner.nextLine();

                    if (updateStockLevelChoice.equals("y")) {
                        System.out.print("Enter the new stock level for " + item.getItemName() + ": ");

                        try {
                            int itemStock = Integer.parseInt(scanner.nextLine());

                            item.setItemStock(itemStock);
                        } catch (NumberFormatException ignored) {
                            System.out.println("Failed to update product. Please try again.");

                            DisplayMenu();
                        }
                    }

                    System.out.println("Product details have been updated successfully.");

                    DisplayMenu();
                } else {
                    Logger.clear();

                    Logger.log(new Line[]{
                            new Line("*****************************************"),
                            new Line("         PRODUCT SEARCH RESULTS          "),
                            new Line("*****************************************"),
                            new Line("              Item not found.            "),
                            new Line("*****************************************"),
                    });

                    DisplayMenu();
                }
            }
        } else {
            Logger.clear();

            Logger.log(new Line[]{
                    new Line("*****************************************"),
                    new Line("         PRODUCT SEARCH RESULTS          "),
                    new Line("*****************************************"),
                    new Line("              Item not found.            "),
                    new Line("*****************************************"),
            });

            DisplayMenu();
        }
    }

    public void DeleteProduct(Scanner scanner) {
        System.out.print("Please enter the product code to search: ");

        String itemCode = scanner.nextLine();

        if (Database.items.size() > 0) {
            for (Item item : Database.items) {
                if (item.getItemCode().equals(itemCode)) {
                    Logger.clear();

                    Logger.log(new Line[]{
                            new Line("*****************************************"),
                            new Line("         PRODUCT SEARCH RESULTS          "),
                            new Line("*****************************************"),
                            new Line("PRODUCT CODE:         " + item.getItemCode()),
                            new Line("PRODUCT NAME:         " + item.getItemName()),
                            new Line("PRODUCT WARRANTY:     " + item.getItemWarrantyMonths() + " months"),
                            new Line("PRODUCT CATEGORY:     " + item.getItemCategory()),
                            new Line("PRODUCT PRICE:        R" + item.getItemPrice()),
                            new Line("PRODUCT STOCK LEVELS: " + item.getItemStock()),
                            new Line("PRODUCT SUPPLIER:     " + item.getItemSupplierName()),
                            new Line("*****************************************"),
                    });

                    System.out.print("Are you sure you want to delete the product? (y) Yes, (n) No: ");

                    String choice = scanner.nextLine();

                    if (choice.equals("y")) {
                        Database.items.remove(item);

                        System.out.println("Product deleted successfully.");

                        DisplayMenu();
                    } else {
                        DisplayMenu();
                    }
                } else {
                    Logger.clear();

                    Logger.log(new Line[]{
                            new Line("*****************************************"),
                            new Line("         PRODUCT SEARCH RESULTS          "),
                            new Line("*****************************************"),
                            new Line("              Item not found.            "),
                            new Line("*****************************************"),
                    });

                    DisplayMenu();
                }
            }
        } else {
            Logger.clear();

            Logger.log(new Line[]{
                    new Line("*****************************************"),
                    new Line("         PRODUCT SEARCH RESULTS          "),
                    new Line("*****************************************"),
                    new Line("              Item not found.            "),
                    new Line("*****************************************"),
            });

            DisplayMenu();
        }


    }

    public void DisplayMenu() {
        System.out.println("Enter (1) to launch menu or any other key to exit.");

        HomeScreen homeScreen = new HomeScreen();
        homeScreen.display();
    }

    public void CaptureProduct() {
        Item item = new Item();

        try (Scanner scanner = new Scanner(System.in)) {
            item.requestItemCode(scanner);
            item.requestItemName(scanner);
            item.requestCategory(scanner);
            item.requestItemWarrantyMonths(scanner);
            item.requestItemPrice(scanner);
            item.requestItemStockLevels(scanner);
            item.requestItemSupplierName(scanner);

            try {
                Database.items.add(item);

                System.out.println("Product details have been saved successfully.");

                DisplayMenu();
            } catch (Exception ignored) {
                System.out.println("Failed to capture a new product.");

                DisplayMenu();
            }
        }
    }

    public void ExitApplication() {
        System.out.print("\nApplication exiting.");
    }
}
