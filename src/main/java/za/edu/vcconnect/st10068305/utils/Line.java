package za.edu.vcconnect.st10068305.utils;

public class Line {
    private final String content;

    public Line(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return this.content;
    }
}
