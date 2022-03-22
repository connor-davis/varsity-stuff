package gettersandsetters;

import gettersandsetters.entity.Human;

/**
 * Connor Davis
 * 
 * @author ST10068305
 */
public class App {
    /**
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        Human human = new Human();

        human.setName("Connor Davis");

        System.out.println("The humans name is " + human.getName());

        human.greet();
    }
}
