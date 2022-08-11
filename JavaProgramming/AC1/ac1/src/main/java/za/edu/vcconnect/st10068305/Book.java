package za.edu.vcconnect.st10068305;

public abstract class Book {
    private String title;
    protected double price;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
    public Double getPrice() {
        return this.price;
    }

    abstract void setPrice();
}
