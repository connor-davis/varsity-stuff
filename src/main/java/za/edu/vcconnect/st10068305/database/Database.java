package za.edu.vcconnect.st10068305.database;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public abstract class Database {
    protected final String databaseName;
    private final File databaseFile;
    protected FileWriter writer;
    protected Gson gson;

    public Database(String databaseName) {
        this.databaseName = databaseName;

        File databasesDirectory = new File("databases/");
        this.databaseFile = new File("databases/" + databaseName + ".json");

        if (!databasesDirectory.exists()) databasesDirectory.mkdir();

        if (!databaseFile.exists()) {
            try {
                databaseFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        this.gson = new GsonBuilder().create();
    }

    protected String getStoredJsonDataString() throws IOException {
        String fileContent;

        StringBuilder contentBuilder = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(this.databaseFile))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                contentBuilder.append(sCurrentLine).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        fileContent = contentBuilder.toString();

        if (fileContent.equals("")) return "[]";

        return fileContent;
    }
}
