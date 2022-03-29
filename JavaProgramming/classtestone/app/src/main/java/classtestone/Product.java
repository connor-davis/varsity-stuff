package classtestone;

public class Product {
    private String productName;
    private double productPrice;
    private final double VAT = 0.14;
    private final double PRODUCT_DISCOUNT = 0.05;

    public Product() {
    }

    /**
     * @return Double return the productPriceInclVat
     */
    public double calculateProductPriceInclVat() {
        double productPriceInclVat;

        // Check if discount can be computed
        if (this.productPrice >= 10000) {
            // Discount the price
            productPriceInclVat = this.productPrice - (this.productPrice * PRODUCT_DISCOUNT);
            // Add the vat
            productPriceInclVat = productPriceInclVat + (productPriceInclVat * VAT);
            // Round the price
            productPriceInclVat = (double) Math.round(productPriceInclVat * 100) / 100;

            return productPriceInclVat;
        } else {
            // Add the vat
            productPriceInclVat = this.productPrice + (this.productPrice * VAT);
            // Round the price
            productPriceInclVat = (double) Math.round(productPriceInclVat * 100) / 100;

            return productPriceInclVat;
        }
    }

    /**
     * @return String return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return double return the productPrice
     */
    public double getProductPrice() {
        return productPrice;
    }

    /**
     * @param productPrice the productPrice to set
     */
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * @return double return the VAT
     */
    public double getVAT() {
        return VAT;
    }
}
