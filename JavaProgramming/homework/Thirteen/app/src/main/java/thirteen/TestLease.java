package thirteen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Connor Davis
 * 
 * @author ST10068305
 */
public class TestLease {
    private static ArrayList<Lease> leases = new ArrayList<Lease>();

    /**
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        leases.add(new Lease());
        leases.add(new Lease());
        leases.add(new Lease());
        leases.add(new Lease());

        getData();

        for (Lease lease : leases) {
            lease.showValues();
        }
    }

    public static void getData() {
        try (Scanner scanner = new Scanner(System.in)) {
            for (Lease lease : leases) {
                if (leases.indexOf(lease) == leases.size() - 1)
                    break;

                int leaseNumber = leases.indexOf(lease) + 1;

                System.out.println("Please enter the tenant name for lease " + leaseNumber + ":");
                System.out.write("> ".getBytes());

                lease.setTenantsName(scanner.nextLine());

                System.out.println("Please enter the apartment number for lease " + leaseNumber + ":");
                System.out.write("> ".getBytes());

                lease.setApartmentNumber(Integer.parseInt(scanner.nextLine()));

                System.out.println("Please enter the rent amount for lease " + leaseNumber + ":");
                System.out.write("> ".getBytes());

                lease.setRentAmount(Integer.parseInt(scanner.nextLine()));

                System.out.println("Please enter the lease term for lease " + leaseNumber + ":");
                System.out.write("> ".getBytes());

                lease.setLeaseTerm(Integer.parseInt(scanner.nextLine()));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}