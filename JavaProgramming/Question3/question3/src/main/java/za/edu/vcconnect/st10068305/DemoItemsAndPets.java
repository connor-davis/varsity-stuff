package za.edu.vcconnect.st10068305;

/**
 * Hello world!
 *
 */
public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold standardItem = new ItemSold();

        standardItem.setInvoiceNumber(000001);
        standardItem.setPrice(5000.0);
        standardItem.setDescription("Huawei Phone");

        PetSold petItem = new PetSold();

        petItem.setInvoiceNumber(000002);
        petItem.setPrice(1500.0);
        petItem.setDescription("Black Cat");
        petItem.setNeutered(true);
        petItem.setVaccinated(false);
        petItem.setHousebroken(true);

        System.out.println(
                "Invoice " + standardItem.getInvoiceNumber()
                        + "\n\nPrice: " + standardItem.getPrice()
                        + "\nDescription: " + standardItem.getDescription());

        System.out.println("\n\nInvoice " + petItem.getInvoiceNumber()
                + "\n\nPrice: " + petItem.getPrice()
                + "\nDescription: " + petItem.getDescription()
                + "\nVaccinated: " + petItem.isVaccinated()
                + "\nNeutered: " + petItem.isNeutered()
                + "\nHousebroken: " + petItem.isHousebroken());
    }
}
