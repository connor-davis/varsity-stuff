/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package variablestwo;

public class App {
    public String getGreeting() {
        return "Roses are read,"
                    + "\n   Violets are blue,"
                    + "\nSugar is sweet,"
                    + "\n   But I have \"commitment issues\","
                    + "\n   So I'd rather just be friends"
                    + "\n   At this point in our relationship.";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getGreeting());
    }
}
