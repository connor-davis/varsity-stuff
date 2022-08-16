package za.edu.vcconnect.st10068305.database;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Database {
    private final FileReader reader;
    protected FileWriter writer;
    protected Gson gson;

    public Database(String databaseName) {
        File databasesDirectory = new File("databases/");
        File databaseFile = new File("databases/" + databaseName + ".json");

        if (!databasesDirectory.exists()) databasesDirectory.mkdir();

        if (!databaseFile.exists()) {
            try {
                databaseFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            this.reader = new FileReader("databases/" + databaseName + ".json");
            this.writer = new FileWriter("databases/" + databaseName + ".json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        this.gson = new GsonBuilder().create();
    }

    protected String getStoredJsonDataString() throws IOException {
        StringBuilder builder = new StringBuilder();

        int i;

        while ((i = this.reader.read()) != -1)
            builder.append((char) i);

        return builder.toString();
    }
}
