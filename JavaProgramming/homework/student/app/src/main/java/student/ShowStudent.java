package student;

import java.io.IOException;
import java.util.Scanner;

public class ShowStudent {
    public static void main(String[] args) {
        System.out.println("Welcome to student grade point average calculator.");

        // Instantiate a new student
        Student student = new Student();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter the students id number: ");
            System.out.write("> ".getBytes());

            student.setStudentIdNumber(scanner.nextLine());

            System.out.println("Please enter the students hours earned: ");
            System.out.write("> ".getBytes());

            student.setStudentHoursEarned(Double.parseDouble(scanner.nextLine()));

            System.out.println("Please enter the students points earned: ");
            System.out.write("> ".getBytes());

            student.setStudentPointsEarned(Double.parseDouble(scanner.nextLine()));

            System.out.println("\n============ Here are the results ============");

            System.out.println("Student ID Number:                " + student.getStudentIdNumber() +
                    "\nStudent Hours Earned:             " + student.getStudentHoursEarned() +
                    "\nStudent Points Earned:            " + student.getStudentPointsEarned() +
                    "\nStudent Grade Point Average:      " + student.calculateGradePointAverage());

            System.out.println("==============================================");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
