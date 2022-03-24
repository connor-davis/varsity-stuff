package thirteen;

public class Lease {
    private String tenantsName;
    private int apartmentNumber;
    private int rentAmount;
    private int leaseTerm;
    private static final int PET_FEE = 10; // b

    public Lease() {
        this.tenantsName = "XXX";
        this.apartmentNumber = 0;
        this.rentAmount = 1000;
        this.leaseTerm = 12;
    }

    public void showValues() {
        int rentBeforePetFee = getRentAmount();

        System.out.println("\n================> Lease Details <================\n");

        System.out.println("\nTenants Name:         " + getTenantsName() +
                "\nApartment Number:     " + getApartmentNumber() +
                "\nRent Amount:          " + getRentAmount() +
                "\nLease Term:           " + getLeaseTerm() + "\n");

        addPetFee();

        explainPetPolicy();

        if (getRentAmount() - PET_FEE == rentBeforePetFee) {
            System.out.println("\nThe rent fee was added successfully." +
                    "\nThe new rent amount is: " + getRentAmount());
        }

        System.out.println("\n================================================\n");
    }

    public void addPetFee() {
        this.rentAmount = this.rentAmount + PET_FEE;
    }

    public static void explainPetPolicy() {
        System.out.println("A pet fee of " + PET_FEE + " will added to the rent amount.");
    }

    /**
     * @return String return the tenantsName
     */
    public String getTenantsName() {
        return tenantsName;
    }

    /**
     * @param tenantsName the tenantsName to set
     */
    public void setTenantsName(String tenantsName) {
        this.tenantsName = tenantsName;
    }

    /**
     * @return int return the apartmentNumber
     */
    public int getApartmentNumber() {
        return apartmentNumber;
    }

    /**
     * @param apartmentNumber the apartmentNumber to set
     */
    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    /**
     * @return int return the rentAmount
     */
    public int getRentAmount() {
        return rentAmount;
    }

    /**
     * @param rentAmount the rentAmount to set
     */
    public void setRentAmount(int rentAmount) {
        this.rentAmount = rentAmount;
    }

    /**
     * @return int return the leaseTerm
     */
    public int getLeaseTerm() {
        return leaseTerm;
    }

    /**
     * @param leaseTerm the leaseTerm to set
     */
    public void setLeaseTerm(int leaseTerm) {
        this.leaseTerm = leaseTerm;
    }

}
