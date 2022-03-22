package programeleven;

public class Sandwich {
    private String mainIngredient;
    private String breadType;
    private Double price;

    /**
     * @return String return the mainIngredient
     */
    public String getMainIngredient() {
        return mainIngredient;
    }

    /**
     * @param mainIngredient the mainIngredient to set
     */
    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    /**
     * @return String return the breadType
     */
    public String getBreadType() {
        return breadType;
    }

    /**
     * @param breadType the breadType to set
     */
    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    /**
     * @return Double return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

}
