package za.edu.vcconnect.st10068305.screens;

import za.edu.vcconnect.st10068305.AppState;
import za.edu.vcconnect.st10068305.api.Subject;
import za.edu.vcconnect.st10068305.api.employee.Teacher;
import za.edu.vcconnect.st10068305.database.Databases;
import za.edu.vcconnect.st10068305.utils.Line;
import za.edu.vcconnect.st10068305.utils.Logger;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class UpdateTeacher {
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
                for (Teacher teacher : Databases.getTeachersDatabase().teachers) {
                    if (teacher.getEmployeeNumber() == employeeNumber) {
                        requestUpdateEmployeeNumber(scanner, teacher);
                        requestUpdateEmployeeFirstName(scanner, teacher);
                        requestUpdateEmployeeLastName(scanner, teacher);
                        requestUpdateEmployeeSubject(scanner, teacher);

                        Databases.getTeachersDatabase().save();

                        AppState.employeeFound = true;
                    }
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

    private void requestUpdateEmployeeSubject(Scanner scanner, Teacher teacher) {
        Logger.clear();

        Logger.log(new Line[]{
                new Line("********************(TeacherDB)********************"),
        });

        System.out.println("Would you like to update their employee subject? [y/n]");
        System.out.print("> ");

        String updateEmployeeNumberChoice = scanner.nextLine();

        if (updateEmployeeNumberChoice.equals("y")) {
            Logger.clear();

            Logger.log(new Line[]{
                    new Line("Enter the new subject> "),
                    new Line(""),
                    new Line("(1) " + Subject.MATHS),
                    new Line("(2) " + Subject.PHYSICS),
                    new Line("(3) " + Subject.ENGLISH),
                    new Line("(4) " + Subject.AFRIKAANS),
                    new Line("(5) " + Subject.ZULU),
                    new Line("(6) " + Subject.LIFE_ORIENTATION),
                    new Line("(7) " + Subject.HISTORY),
                    new Line("(8) " + Subject.ENGINEERING_GRAPHICS_AND_DESIGN),
                    new Line("(9) " + Subject.BUSINESS_STUDIES),
                    new Line("(10) " + Subject.ACCOUNTING),
                    new Line("(11) " + Subject.ARTS_AND_CULTURE),
                    new Line("(12) " + Subject.CONSUMER_STUDIES),
                    new Line(""),
            });

            System.out.print("> ");

            try {
                int choice = scanner.nextInt() - 1;

                if (choice >= 0 && choice <= 11) {
                    teacher.setSubject(Subject.values()[choice]);
                } else {
                    requestUpdateEmployeeSubject(scanner, teacher);
                }
            } catch (NoSuchElementException ignored) {
                requestUpdateEmployeeSubject(scanner, teacher);
            }
        } else if (!updateEmployeeNumberChoice.equals("n")) {
            requestUpdateEmployeeSubject(scanner, teacher);
        }
    }

    private void requestUpdateEmployeeLastName(Scanner scanner, Teacher teacher) {
        Logger.clear();

        Logger.log(new Line[]{
                new Line("********************(TeacherDB)********************"),
        });

        System.out.println("Would you like to update their employee last name? [y/n]");
        System.out.print("> ");

        String updateEmployeeNumberChoice = scanner.nextLine();

        if (updateEmployeeNumberChoice.equals("y")) {
            System.out.print("Enter new employee last name> ");

            String newEmployeeLastName = scanner.nextLine();

            teacher.setEmployeeLastName(newEmployeeLastName);
        } else if (!updateEmployeeNumberChoice.equals("n")) {
            requestUpdateEmployeeLastName(scanner, teacher);
        }
    }

    private void requestUpdateEmployeeFirstName(Scanner scanner, Teacher teacher) {
        Logger.clear();

        Logger.log(new Line[]{
                new Line("********************(TeacherDB)********************"),
        });

        System.out.println("Would you like to update their employee first name? [y/n]");
        System.out.print("> ");

        String updateEmployeeNumberChoice = scanner.nextLine();

        if (updateEmployeeNumberChoice.equals("y")) {
            System.out.print("Enter new employee first name> ");

            String newEmployeeFirstName = scanner.nextLine();

            teacher.setEmployeeFirstName(newEmployeeFirstName);
        } else if (!updateEmployeeNumberChoice.equals("n")) {
            requestUpdateEmployeeFirstName(scanner, teacher);
        }
    }

    private void requestUpdateEmployeeNumber(Scanner scanner, Teacher teacher) {
        Logger.clear();

        Logger.log(new Line[]{
                new Line("********************(TeacherDB)********************"),
        });

        System.out.println("Would you like to update their employee number? [y/n]");
        System.out.print("> ");

        String updateEmployeeNumberChoice = scanner.nextLine();

        if (updateEmployeeNumberChoice.equals("y")) {
            System.out.print("Enter new employee number> ");

            try {
                int newEmployeeNumber = scanner.nextInt();

                teacher.setEmployeeNumber(newEmployeeNumber);
            } catch (Exception ignored) {
                requestUpdateEmployeeNumber(scanner, teacher);
            }
        } else if (!updateEmployeeNumberChoice.equals("n")) {
            requestUpdateEmployeeNumber(scanner, teacher);
        }
    }
}
