package za.edu.vcconnect.st10068305;

import za.edu.vcconnect.st10068305.io.Line;
import za.edu.vcconnect.st10068305.io.Logger;
import za.edu.vcconnect.st10068305.screens.HomeScreen;

public class Main {
    public static void main(String[] args) {
        Logger.clear();

        Logger.log(new Line[]{
                new Line("      BRIGHT FUTURE TECHNOLOGIES APPLICATION      "),
                new Line("**************************************************"),
                new Line(""),
                new Line("Enter (1) to launch menu or any other key to exit.")
        });

        HomeScreen homeScreen = new HomeScreen();

        homeScreen.display();
    }
}
