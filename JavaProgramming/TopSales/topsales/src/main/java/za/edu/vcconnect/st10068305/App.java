package za.edu.vcconnect.st10068305;

/**
 * Hello world!
 *
 */
public class App {
    private static Employee[] employees = new Employee[] {
            new Employee(101111, new int[] {
                    3000, 2000, 3500
            }),
            new Employee(101122, new int[] {
                    2500, 5500, 3500
            }),
            new Employee(101133, new int[] {
                    1100, 2000, 4500
            }),
            new Employee(101144, new int[] {
                    1700, 2700, 2500
            }),
            new Employee(101155, new int[] {
                    5000, 2900, 5900
            }),
    };

    public static void main(String[] args) {
        int[] allSales;
        int[] employeesParallelSales;
        int[] topThreeSales = new int[6];
        int totalAllSales = 0;
        int addedSales = 0;

        for (Employee employee : employees) {
            totalAllSales += employee.totalSales();
        }

        allSales = new int[totalAllSales];
        employeesParallelSales = new int[totalAllSales];

        for (int x = 0; x < employees.length; x++) {
            for (int y = 0; y < employees[x].getSales().length; y++) {
                allSales[addedSales] = employees[x].getSales()[y];
                employeesParallelSales[addedSales] = employees[x].getEmployeeId();

                addedSales++;
            }
        }

        for (int x = 0; x < allSales.length; x++) {
            for (int y = 0; y < allSales.length - 1; y++) {
                int a = allSales[y];
                int b = allSales[y + 1];
                int aE = employeesParallelSales[y];
                int bE = employeesParallelSales[y + 1];

                if (a > b) {
                    allSales[y + 1] = a;
                    allSales[y] = b;

                    employeesParallelSales[y + 1] = aE;
                    employeesParallelSales[y] = bE;
                }
            }
        }

        topThreeSales[0] = employeesParallelSales[employeesParallelSales.length - 1];
        topThreeSales[1] = allSales[allSales.length - 1];
        topThreeSales[2] = employeesParallelSales[employeesParallelSales.length - 2];
        topThreeSales[3] = allSales[allSales.length - 2];
        topThreeSales[4] = employeesParallelSales[employeesParallelSales.length - 3];
        topThreeSales[5] = allSales[allSales.length - 3];

        // First we display stats on all employees.
        for (Employee employee : employees) {
            System.out.println(
                    "Employee Number: " + employee.getEmployeeId() + "\nEmployee Sales: " + employee.totalSales());
        }

        System.out.println("");

        // Then we display the top 3 sales
        String[] lines = new String[] {
                "Employee Number: " + topThreeSales[0] + "\nEmployee Sale: " + topThreeSales[1],
                "Employee Number: " + topThreeSales[2] + "\nEmployee Sale: " + topThreeSales[3],
                "Employee Number: " + topThreeSales[4] + "\nEmployee Sale: " + topThreeSales[5],
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
