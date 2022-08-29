package za.edu.vcconnect.st10068305.utils;

public class Logger {
    public static void log(Line[] lines) {
        for (Line line : lines) {
            System.out.println(line);
        }
    }

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
