/*
 * Connor Davis
 * @author ST10068305
 */
package commitmentissues;

import java.util.ArrayList;
import java.util.Map;

import commitmentissues.io.YamlConfiguration;

public class App {
    static String greeting = "";
    static App instance;

    public static App getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        instance = new App();

        YamlConfiguration configuration = new YamlConfiguration("test.yaml");
        Map<String, Object> data = configuration.getData();
        ArrayList<String> lines = (ArrayList<String>) data.get("lines");

        lines.add("\nThis is an added line");

        data.put("lines", lines);

        configuration.saveData();

        for (String line : lines) {
            greeting += line.toString();
        }

        System.out.println(greeting);

    }
}
