package commitmentissues.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

import commitmentissues.App;

public class YamlConfiguration {
    String fileName;
    InputStream fileStream;
    Yaml yaml;
    Map<String, Object> data;

    public YamlConfiguration(String fileName) {
        this.fileName = fileName;
        this.fileStream = App
                .getInstance()
                .getClass()
                .getClassLoader()
                .getResourceAsStream(fileName);
        this.yaml = new Yaml();
        this.data = loadData();
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void saveData() {
        File file = new File(App.getInstance().getClass().getClassLoader().getResource(this.fileName).getPath());

        if (!file.exists()) {
            System.out.println("File not found: " + fileName + " - " + file.getPath());
            // System.out.println("Creating " + fileName);

            // try {
            // file.createNewFile();

            // System.out.println("Created file " + fileName);
            // } catch (IOException e) {
            // e.printStackTrace();
            // }

        } else {
            try {
                PrintWriter writer = new PrintWriter(
                        file);
                this.yaml.dump(data, writer);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

    }

    Map<String, Object> loadData() {
        return this.yaml.load(this.fileStream);
    }
}
