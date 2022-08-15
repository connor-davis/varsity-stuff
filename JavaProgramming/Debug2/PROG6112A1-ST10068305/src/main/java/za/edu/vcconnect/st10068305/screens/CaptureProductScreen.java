package za.edu.vcconnect.st10068305.screens;

import za.edu.vcconnect.st10068305.api.Product;
import za.edu.vcconnect.st10068305.io.Line;
import za.edu.vcconnect.st10068305.io.Logger;

public class CaptureProductScreen extends Screen {
    public CaptureProductScreen() {
        Logger.clear();

        Logger.log(new Line[] {
                new Line("     CAPTURE A NEW PRODUCT     "),
                new Line("*******************************")
        });
    }

    @Override
    public void display() {
        Product product = new Product();

        product.CaptureProduct();
    }

    @Override
    public void prompt() {

    }
}
