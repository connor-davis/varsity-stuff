package programeleven;

/**
 * Connor Davis
 * @author ST10068305
 */
public class TestSandwich {
    public static void main(String[] args) {
        Sandwich tunaSandwich = new Sandwich();

        tunaSandwich.setBreadType("whole_wheat");
        tunaSandwich.setMainIngredient("salty_tuna");
        tunaSandwich.setPrice(4.59);

        System.out.println("The bread type is:       " + tunaSandwich.getBreadType());
        System.out.println("The main ingredient is:  " + tunaSandwich.getMainIngredient());
        System.out.println("The price is:            " + tunaSandwich.getPrice());
    }
}
