package za.edu.vcconnect.st10068305.screens;

import za.edu.vcconnect.st10068305.AppState;
import za.edu.vcconnect.st10068305.api.employee.Teacher;
import za.edu.vcconnect.st10068305.database.Databases;
import za.edu.vcconnect.st10068305.utils.Line;
import za.edu.vcconnect.st10068305.utils.Logger;

import java.util.Scanner;

public class DeleteTeacher {
    public void display(Scanner scanner) {
        Logger.clear();

        Logger.log(new Line[]{
                new Line("********************(TeacherDB)********************"),
        });

        System.out.print("Enter employee number> ");

        try {
            int employeeNumber = scanner.nextInt();

            if (employeeNumber == 0) return;

            if (employeeNumber > 0) {
                int index = 0;

                for (Teacher teacher : Databases.getTeachersDatabase().teachers) {
                    if (teacher.getEmployeeNumber() == employeeNumber) {
                        Databases.getTeachersDatabase().deleteTeacher(index);
                        Databases.getTeachersDatabase().save();

                        AppState.employeeFound = true;

                        break;
                    }

                    index++;
                }

                if (!AppState.employeeFound) {
                    System.out.println("Please enter a valid employee number or 0 to exit to menu.");

                    AppState.sleep();

                    display(scanner);
                } else AppState.employeeFound = false;
            }
        } catch (Exception ignored) {
            System.out.println("Please enter a valid employee number or 0 to exit to menu.");

            AppState.sleep();

            display(scanner);
        }
    }
}
