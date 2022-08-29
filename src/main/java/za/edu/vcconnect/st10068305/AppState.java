package za.edu.vcconnect.st10068305;

public class AppState {
    public static boolean finished = false;
    public static boolean showMainMenu = true;
    public static boolean showAddTeacher = false;
    public static boolean employeeFound = false;

    public static void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
