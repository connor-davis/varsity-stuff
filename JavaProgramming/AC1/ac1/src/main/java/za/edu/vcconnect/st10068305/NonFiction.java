package za.edu.vcconnect.st10068305;

public class NonFiction extends Book {
    public NonFiction(String title) {
        super(title);

        setPrice();
    }

    @Override
    void setPrice() {
        super.price = 37.99;
    }
}
