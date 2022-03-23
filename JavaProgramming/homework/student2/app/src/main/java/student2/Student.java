package student2;

public class Student {
    private int studentIdNumber;
    private int studentHoursEarned;
    private int studentPointsEarned;

    /**
     * Create a new student with default values
     */
    public Student() {
        this.studentIdNumber = 9999;
        this.studentHoursEarned = 3;
        this.studentPointsEarned = 12;
    }

    /**
     * Create a new student with custom values
     * 
     * @param studentIdNumber     The students id number
     * @param studentHoursEarned  The students hours earned
     * @param studentPointsEarned The students points earned
     */
    public Student(int studentIdNumber, int studentHoursEarned, int studentPointsEarned) {
        this.studentIdNumber = studentIdNumber;
        this.studentHoursEarned = studentHoursEarned;
        this.studentPointsEarned = studentPointsEarned;
    }

    public int calculateGradePointAverage() {
        return studentPointsEarned / studentHoursEarned;
    }

    public int getStudentIdNumber() {
        return studentIdNumber;
    }

    public int getStudentHoursEarned() {
        return studentHoursEarned;
    }

    public int getStudentPointsEarned() {
        return studentPointsEarned;
    }
}
