package za.edu.vcconnect.st10068305.api;

import za.edu.vcconnect.st10068305.io.Line;
import za.edu.vcconnect.st10068305.io.Logger;

import java.util.Scanner;

public class Item {
    private String itemCode, itemName, itemSupplierName;
    private ItemCategory itemCategory;
    private int itemWarrantyMonths, itemStock;
    private double itemPrice;

    public Item() {
    }

    public Item(String itemCode, String itemName, ItemCategory itemCategory, int itemWarrantyMonths, double itemPrice, int itemStock, String itemSupplierName) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemSupplierName = itemSupplierName;
        this.itemCategory = itemCategory;
        this.itemWarrantyMonths = itemWarrantyMonths;
        this.itemStock = itemStock;
        this.itemPrice = itemPrice;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemSupplierName() {
        return itemSupplierName;
    }

    public void setItemSupplierName(String itemSupplierName) {
        this.itemSupplierName = itemSupplierName;
    }

    public ItemCategory getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(ItemCategory itemCategory) {
        this.itemCategory = itemCategory;
    }

    public int getItemWarrantyMonths() {
        return itemWarrantyMonths;
    }

    public void setItemWarrantyMonths(int itemWarrantyMonths) {
        this.itemWarrantyMonths = itemWarrantyMonths;
    }

    public int getItemStock() {
        return itemStock;
    }

    public void setItemStock(int itemStock) {
        this.itemStock = itemStock;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void requestItemCode(Scanner scanner) {

        System.out.print("Enter the product code: ");

        this.setItemCode(scanner.nextLine());

    }

    public void requestItemName(Scanner scanner) {
        System.out.print("Enter the product name: ");

        this.setItemName(scanner.nextLine());
    }

    public void requestCategory(Scanner scanner) {
        Logger.clear();

        Logger.log(new Line[]{
                new Line("Select the product category:"),
                new Line("Desktop Computer - 1"),
                new Line("Laptop - 2"),
                new Line("Tablet - 3"),
                new Line("Printer - 4"),
                new Line("Gaming Console - 5\n")
        });

        System.out.print("Product Category: ");

        try {
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice - 1 >= 0 && choice - 1 < 5) {
                this.setItemCategory(ItemCategory.values()[choice - 1]);
            } else requestCategory(scanner);
        } catch (NumberFormatException ignored) {
            requestCategory(scanner);
        }
    }

    public void requestItemWarrantyMonths(Scanner scanner) {
        System.out.print("Indicate the product warranty. Enter (1) for 6 months or any other key for 2 years: ");

        try {
            int itemWarrantyYearsChoice = Integer.parseInt(scanner.nextLine());

            if (itemWarrantyYearsChoice == 1) {
                this.setItemWarrantyMonths(6);
            } else {
                this.setItemWarrantyMonths(24);
            }
        } catch (NumberFormatException ignored) {
            this.setItemWarrantyMonths(24);
        }
    }

    public void requestItemPrice(Scanner scanner) {
        System.out.print("Enter the price for " + this.getItemName() + ": ");

        try {
            this.setItemPrice(Double.parseDouble(scanner.nextLine()));
        } catch (NumberFormatException ignored) {
            requestItemPrice(scanner);
        }
    }

    public void requestItemStockLevels(Scanner scanner) {
        System.out.print("Enter the stock level for " + this.getItemName() + ": ");

        try {
            this.setItemStock(Integer.parseInt(scanner.nextLine()));
        } catch (NumberFormatException ignored) {
            requestItemStockLevels(scanner);
        }
    }

    public void requestItemSupplierName(Scanner scanner) {
        System.out.print("Enter the supplier for " + this.getItemName() + ": ");

        this.setItemSupplierName(scanner.nextLine());
    }
}
