package za.edu.vcconnect.st10068305.api.employee;

import za.edu.vcconnect.st10068305.api.Subject;
import za.edu.vcconnect.st10068305.utils.Line;
import za.edu.vcconnect.st10068305.utils.Logger;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class BaseTeacher extends Teacher {
    public void requestTeacherEmployeeNumber(Scanner scanner) {
        System.out.print("What is the teachers employee number: ");

        try {
            int employeeNumber = scanner.nextInt();

            this.setEmployeeNumber(employeeNumber);
        } catch (NoSuchElementException ignored) {
            requestTeacherEmployeeNumber(scanner);
        }
    }

    public void requestTeacherName(Scanner scanner) {
        System.out.print("What is the teachers first name: ");

        String teacherFirstName = scanner.next();

        System.out.print("What is the teachers last name: ");

        String teacherLastName = scanner.next();

        this.setEmployeeFirstName(teacherFirstName);
        this.setEmployeeLastName(teacherLastName);
    }

    public void requestTeacherSubject(Scanner scanner) {
        Logger.clear();

        Logger.log(new Line[]{
                new Line("What subject is the teacher teaching? "),
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
                this.setSubject(Subject.values()[choice]);
            } else {
                requestTeacherSubject(scanner);
            }
        } catch (NoSuchElementException ignored) {
            requestTeacherSubject(scanner);
        }
    }
}
