package za.edu.vcconnect.st10068305;

import za.edu.vcconnect.st10068305.database.Databases;
import za.edu.vcconnect.st10068305.screens.MainMenu;

public class Main {
    public static void main(String[] args) {
        Databases databases = new Databases();

        System.out.println("Initializing databases.");

        databases.initialize();

        System.out.println("Databases initialized.");

        while (!AppState.finished) {
            if (AppState.showMainMenu) {
                MainMenu mainMenu = new MainMenu();

                mainMenu.display();
            }
        }
    }
}
