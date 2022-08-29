package za.edu.vcconnect.st10068305.screens;

import za.edu.vcconnect.st10068305.AppState;
import za.edu.vcconnect.st10068305.utils.Line;
import za.edu.vcconnect.st10068305.utils.Logger;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainMenu {
    public void display() {
        Logger.clear();

        Logger.log(new Line[]{
                new Line("                   Welcome to TeacherDB"),
                new Line("******************************************************"),
                new Line("Type (1) to display the menu or any other key to exit."),
        });

        System.out.print("> ");

        Scanner scanner = new Scanner(System.in);

        try {
            int choice = scanner.nextInt();

            if (choice == 1) {
                showMainMenu(scanner);
            } else {
                AppState.finished = true;
                scanner.close();
            }
        } catch (NoSuchElementException ignored) {
            AppState.finished = true;
            scanner.close();
        }
    }

    private void showMainMenu(Scanner scanner) {
        Logger.clear();

        Logger.log(new Line[]{
                new Line("********************(TeacherDB)********************"),
                new Line("(1) Add Teacher"),
                new Line("(2) Update Teacher"),
                new Line("(3) Delete Teacher"),
                new Line("(4) Search Teacher"),
                new Line("(5) Exit Application"),
                new Line("***************************************************"),
        });

        System.out.print("> ");

        try {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    AddTeacher addTeacher = new AddTeacher();

                    addTeacher.display(scanner);

                    System.out.println("Added a new teacher successfully.");

                    AppState.sleep();

                    showMainMenu(scanner);
                }
                case 2 -> {
                    UpdateTeacher updateTeacher = new UpdateTeacher();

                    updateTeacher.display(scanner);

                    System.out.println("Updated a teacher successfully.");

                    AppState.sleep();

                    showMainMenu(scanner);
                }
                case 3 -> {
                    DeleteTeacher deleteTeacher = new DeleteTeacher();

                    deleteTeacher.display(scanner);

                    System.out.println("Deleted a teacher successfully.");

                    AppState.sleep();

                    showMainMenu(scanner);
                }
                case 4 -> {
                    SearchTeacher searchTeacher = new SearchTeacher();

                    searchTeacher.display(scanner);

                    showMainMenu(scanner);
                }
                case 5 -> {
                    AppState.finished = true;

                    scanner.close();

                    System.out.println("Exited application successfully.");
                }
                default -> showMainMenu(scanner);
            }
        } catch (Exception er) {
            AppState.finished = true;

            scanner.close();

            System.out.println("An error occurred, please restart the application.");

            er.printStackTrace();
        }
    }
}
