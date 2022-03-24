package thirteen;

import java.io.IOException;
import java.util.Scanner;

public class TestLeaseSyllabus {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Lease leaseOne = getData();
        Lease leaseTwo = getData();
        Lease leaseThree = getData();
        Lease leaseFour = new Lease();

        leaseOne.showValues();
        leaseTwo.showValues();
        leaseThree.showValues();
        leaseFour.showValues();
    }

    public static Lease getData() {
        Lease lease = new Lease();

        try {
            System.out.println("Please enter the tenant name for lease:");
            System.out.write("> ".getBytes());

            lease.setTenantsName(scanner.nextLine());

            System.out.println("Please enter the apartment number for lease:");
            System.out.write("> ".getBytes());

            lease.setApartmentNumber(Integer.parseInt(scanner.nextLine()));

            System.out.println("Please enter the rent amount for lease:");
            System.out.write("> ".getBytes());

            lease.setRentAmount(Double.parseDouble(scanner.nextLine()));

            System.out.println("Please enter the lease term for lease:");
            System.out.write("> ".getBytes());

            lease.setLeaseTerm(Integer.parseInt(scanner.nextLine()));

            System.out.println("\n");

            return lease;
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return lease;
    }
}
