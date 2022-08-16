package za.edu.vcconnect.st10068305.api.student;

import za.edu.vcconnect.st10068305.api.Subject;

public abstract class Student implements IStudent {
    private int studentGrade;
    private String studentFirstName;
    private String studentLastName;
    private int studentNumber;
    private Subject[] subjects;

    public Student() {
    }

    @Override
    public Subject[] getSubjects() {
        return subjects;
    }

    @Override
    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return this.studentNumber + ";" + this.studentFirstName + ";" + this.studentLastName;
    }
}
