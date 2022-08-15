package za.edu.vcconnect.st10068305;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // System.out.println("Hello World!");

        // Dog d = new Dog();
        // Cat c = new Cat();

        // d.setColor("black&white&brown");
        // c.setColor("gray&black");

        // System.out.println("The dogs name: " + d.dogName);
        // System.out.println("The dogs color: " + d.getColor());
        // d.dogSound();

        // System.out.println("The cats name: " + c.catName);
        // System.out.println("The cats color: " + c.getColor());
        // c.catSound();

        BillyHorse billyHorse = new BillyHorse();
        billyHorse.setName("Billy");
        billyHorse.setColor("Brown");
        billyHorse.setBirthYear(1920);

        JessyRaceHorse jessyRaceHorse = new JessyRaceHorse();
        jessyRaceHorse.setName("Jessy");
        jessyRaceHorse.setColor("Black");
        jessyRaceHorse.setBirthYear(1922);
        jessyRaceHorse.setTotalRacesCompeted(100);

        System.out.println("Name: " + billyHorse.getName());
        System.out.println("Color: " + billyHorse.getColor());
        System.out.println("Birth Year: " + billyHorse.getBirthYear());

        System.out.println("");

        System.out.println("Name: " + jessyRaceHorse.getName());
        System.out.println("Color: " + jessyRaceHorse.getColor());
        System.out.println("Birth Year: " + jessyRaceHorse.getBirthYear());
        System.out.println("Total Races Competed: " + jessyRaceHorse.getTotalRacesCompeted());
    }
}
