package za.edu.vcconnect.st10068305.screens;

import za.edu.vcconnect.st10068305.AppState;
import za.edu.vcconnect.st10068305.api.employee.Teacher;
import za.edu.vcconnect.st10068305.database.Databases;
import za.edu.vcconnect.st10068305.utils.Line;
import za.edu.vcconnect.st10068305.utils.Logger;

import java.util.Scanner;

public class SearchTeacher {
    public void display(Scanner scanner) {
        Logger.clear();

        Logger.log(new Line[]{
                new Line("********************(TeacherDB)********************"),
        });

        System.out.print("Enter employee number> ");

        try {
            int employeeNumber = scanner.nextInt();

            if (employeeNumber == 0) return;

            for (Teacher teacher : Databases.getTeachersDatabase().teachers) {
                if (teacher.getEmployeeNumber() == employeeNumber) {
                    showTeacher(scanner, teacher);

                    AppState.employeeFound = true;
                }
            }

            if (!AppState.employeeFound) {
                System.out.println("Please enter a valid employee number or 0 to exit to menu.");

                AppState.sleep();

                display(scanner);
            } else AppState.employeeFound = false;
        } catch (Exception ignored) {
            System.out.println("Please enter a valid employee number or 0 to exit to menu.");

            AppState.sleep();

            display(scanner);
        }
    }

    private void showTeacher(Scanner scanner, Teacher teacher) {
        Logger.clear();

        Logger.log(new Line[]{
                new Line("********************(TeacherDB)********************"),
                new Line("Employee Number: " + teacher.getEmployeeNumber()),
                new Line("Employee First Name: " + teacher.getEmployeeFirstName()),
                new Line("Employee Last Name: " + teacher.getEmployeeLastName()),
                new Line("Employee Subject: " + teacher.getSubject()),
                new Line(""),
        });

        System.out.println("Enter 1 to close.");
        System.out.print("> ");

        try {
            int choice = scanner.nextInt();

            if (choice != 1) showTeacher(scanner, teacher);
        } catch (Exception er) {
            AppState.finished = false;
            AppState.showMainMenu = true;
        }
    }
}
