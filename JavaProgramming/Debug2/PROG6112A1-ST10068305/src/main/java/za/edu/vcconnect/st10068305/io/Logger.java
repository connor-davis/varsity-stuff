package za.edu.vcconnect.st10068305.io;

public class Logger {
    public static void log(String content) {
        System.out.print(content + "\n");
    }

    public static void log(Line[] lines) {
        for (Line line : lines) {
            System.out.print(line.getContent() + "\n");
        }
    }

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
