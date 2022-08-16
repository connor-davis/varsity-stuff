package za.edu.vcconnect.st10068305.api.employee;

import za.edu.vcconnect.st10068305.api.Subject;

public abstract class Teacher implements ITeacher {
    private Subject subject;
    private String employeeFirstName;
    private String employeeLastName;
    private int employeeNumber;

    public Teacher() {
    }

    @Override
    public Subject getSubject() {
        return subject;
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
}
