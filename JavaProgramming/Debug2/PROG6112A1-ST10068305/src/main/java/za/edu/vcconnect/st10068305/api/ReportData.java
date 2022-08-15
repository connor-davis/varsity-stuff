package za.edu.vcconnect.st10068305.api;

import java.util.ArrayList;

public class ReportData {
    private ArrayList<Item> items = new ArrayList<>();
    private double totalProductValue, averageProductValue;

    public ReportData() {}

    public double getTotalProductValue() {
        return totalProductValue;
    }

    private void setTotalProductValue(double totalProductValue) {
        this.totalProductValue = totalProductValue;
    }

    public double getAverageProductValue() {
        return averageProductValue;
    }

    private void setAverageProductValue(double averageProductValue) {
        this.averageProductValue = averageProductValue;
    }

    public void setReportItems(ArrayList<Item> items) {
        this.items = items;
    }

    public String getReport() {
        StringBuilder builder = new StringBuilder();

        builder.append("Product Report\n");
        builder.append("================================================================================\n");

        for (Item item : items) {
            setTotalProductValue(getTotalProductValue() + item.getItemPrice());

            builder.append("PRODUCT ");
            builder.append(items.indexOf(item) + 1);
            builder.append("\n");

            builder.append("--------------------------------------------------------------------------------\n");

            builder.append("PRODUCT CODE:       ");
            builder.append(item.getItemCode());
            builder.append("\n");

            builder.append("PRODUCT NAME:       ");
            builder.append(item.getItemName());
            builder.append("\n");

            builder.append("PRODUCT CATEGORY:   ");
            builder.append(item.getItemCategory());
            builder.append("\n");

            builder.append("PRODUCT WARRANTY:   ");
            builder.append(item.getItemWarrantyMonths());
            builder.append(" months\n");

            builder.append("PRODUCT PRICE:      R");
            builder.append(item.getItemPrice());
            builder.append("\n");

            builder.append("PRODUCT STOCK:      ");
            builder.append(item.getItemStock());
            builder.append("\n");

            builder.append("PRODUCT SUPPLIER:   ");
            builder.append(item.getItemSupplierName());
            builder.append("\n");

            builder.append("--------------------------------------------------------------------------------\n");
        }

        setAverageProductValue(getTotalProductValue() / items.size());

        builder.append("================================================================================\n");

        builder.append("TOTAL PRODUCT COUNT: ");
        builder.append(items.size());
        builder.append("\n");

        builder.append("TOTAL PRODUCT VALUE: R");
        builder.append(getTotalProductValue());
        builder.append("\n");

        builder.append("AVERAGE PRODUCT VALUE: R");
        builder.append(getAverageProductValue());
        builder.append("\n");

        builder.append("================================================================================\n");

        return builder.toString();
    }
}
