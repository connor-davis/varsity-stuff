package davis.connor.app.database;

import org.iq80.leveldb.DB;
import org.iq80.leveldb.Options;

import java.io.File;
import java.io.IOException;

import static org.fusesource.leveldbjni.JniDBFactory.*;

/**
 * This abstract class can be used in files that we require setting and getting data
 * from.
 * <p>
 * The database library used: <a href="https://github.com/fusesource/leveldbjni">https://github.com/fusesource/leveldbjni</a>
 * <p>
 * Connor Davis
 *
 * @author ST10068305
 */
public abstract class Database {
    private DB database;

    public Database(String name) {
        Options options = new Options();

        options.createIfMissing(true);

        try {
            database = factory.open(new File("databases/" + name), options);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public String get(String key) {
        return asString(database.get(bytes(key)));
    }

    public void put(String key, String value) {
        database.put(bytes(key), bytes(value));
    }

    public void delete(String key) {
        database.delete(bytes(key));
    }

    public void close() throws IOException {
        database.close();
    }
}
