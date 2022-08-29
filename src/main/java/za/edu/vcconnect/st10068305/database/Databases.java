package za.edu.vcconnect.st10068305.database;

public class Databases {
    private static TeachersDatabase teachersDatabase;

    public Databases() {

    }

    public void initialize() {
        teachersDatabase = new TeachersDatabase();

        teachersDatabase.load();
    }

    public static TeachersDatabase getTeachersDatabase() {
        return teachersDatabase;
    }
}
