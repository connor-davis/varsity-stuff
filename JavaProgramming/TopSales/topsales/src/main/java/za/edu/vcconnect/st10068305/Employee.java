package za.edu.vcconnect.st10068305;

public class Employee {
    private int employeeId;
    private int[] sales;

    public Employee(int employeeId, int[] sales) {
        this.employeeId = employeeId;
        this.sales = sales;
    }

    public int totalSales() {
        return sales.length;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int[] getSales() {
        return sales;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setSales(int[] sales) {
        this.sales = sales;
    }
}
