package za.edu.vcconnect.st10068305;

public class Fiction extends Book {

    public Fiction(String title) {
        super(title);

        setPrice();
    }

    @Override
    void setPrice() {
        super.price = 24.99;
    }
    
}
