/**
 * Connor Davis
 * @author ST10068305
 */
package student;

public class App {
    /**
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to student grade point average calculator.");

        // Instantiate a new student
        Student student = new Student();

        student.getStudentInfoAndDisplay(student);
    }
}
