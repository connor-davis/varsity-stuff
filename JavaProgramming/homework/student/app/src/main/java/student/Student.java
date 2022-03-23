package student;

import java.io.IOException;
import java.util.Scanner;

public class Student {
    private String studentIdNumber;
    private Double studentHoursEarned;
    private Double studentPointsEarned;

    /**
     * This method will retrieve student info and display the info
     * 
     * @param student
     */
    public void getStudentInfoAndDisplay(Student student) {
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
                    "\nStudent Points Earned:            " + student.getStudentPointsEarned());

            System.out.println("==============================================");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Double calculateGradePointAverage() {
        return getStudentPointsEarned() / getStudentHoursEarned();
    }

    /**
     * @return String return the studentIdNumber
     */
    public String getStudentIdNumber() {
        return studentIdNumber;
    }

    /**
     * @param studentIdNumber the studentIdNumber to set
     */
    public void setStudentIdNumber(String studentIdNumber) {
        this.studentIdNumber = studentIdNumber;
    }

    /**
     * @return Double return the studentHoursEarned
     */
    public Double getStudentHoursEarned() {
        return studentHoursEarned;
    }

    /**
     * @param studentHoursEarned the studentHoursEarned to set
     */
    public void setStudentHoursEarned(Double studentHoursEarned) {
        this.studentHoursEarned = studentHoursEarned;
    }

    /**
     * @return Double return the studentPointsEarned
     */
    public Double getStudentPointsEarned() {
        return studentPointsEarned;
    }

    /**
     * @param studentPointsEarned the studentPointsEarned to set
     */
    public void setStudentPointsEarned(Double studentPointsEarned) {
        this.studentPointsEarned = studentPointsEarned;
    }
}
