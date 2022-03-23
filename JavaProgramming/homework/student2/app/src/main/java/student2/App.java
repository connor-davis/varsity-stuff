/*
 * Connor Davis
 * @author ST10068305
 */
package student2;

public class App {
    /**
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        // Instantiate a new student
        Student student = new Student(9999, 3, 12);

        // Display the students details
        System.out.println("Id Number:               " + student.getStudentIdNumber() +
                "\nHours Earned:            " + student.getStudentHoursEarned() +
                "\nPoints Earned:           " + student.getStudentPointsEarned() +
                "\nGrade Points Average:    " + student.calculateGradePointAverage());
    }
}
