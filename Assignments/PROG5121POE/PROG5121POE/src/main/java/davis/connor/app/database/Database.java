package davis.connor.app.database;

import org.mapdb.DB;
import org.mapdb.DBMaker;
import org.mapdb.HTreeMap;
import org.mapdb.Serializer;

import java.io.File;
import java.util.concurrent.ConcurrentMap;

/**
 * The database library used is called MapDB,
 * it allows me to set and update hashmaps in
 * a local database that will be used throughout
 * the application.
 * <p><p>
 * <p>
 * Website: <a href="https://jankotek.gitbooks.io/mapdb/content/">https://jankotek.gitbooks.io/mapdb/content/</a>
 * </p>
 *
 * @author Connor Davis | ST10068305
 */
public abstract class Database {
    private final DB database;
    public final String mapName;

    public Database(String databaseName, String mapName) {
        File databasesDir = new File("databases/");

        if (!databasesDir.exists()) databasesDir.mkdir();

        database = DBMaker
                .fileDB("databases/" + databaseName + ".db")
                .fileMmapEnableIfSupported()
                .fileChannelEnable()
                .fileLockDisable()
                .transactionEnable()
                .allocateStartSize(1024 * 1024 * 128) // 128MB
                .allocateIncrement(1024 * 1024 * 128) // 128MB
                .make();

        this.mapName = mapName;
    }

    public String get(String key) {
        ConcurrentMap<String, String> map = database.hashMap(mapName, Serializer.STRING, Serializer.STRING).createOrOpen();

        return map.get(key);
    }

    public void put(String key, String value) {
        HTreeMap<String, String> map = database.hashMap(mapName, Serializer.STRING, Serializer.STRING).createOrOpen();

        map.put(key, value);

        database.commit();
    }

    public void put(String key, int value) {
        HTreeMap<String, Integer> map = database.hashMap(mapName, Serializer.STRING, Serializer.INTEGER).createOrOpen();

        map.put(key, value);
    }

    public void put(String key, long value) {
        HTreeMap map = database.hashMap(mapName, Serializer.STRING, Serializer.LONG).createOrOpen();

        map.put(key, value);
    }

    public void put(String key, boolean value) {
        HTreeMap map = database.hashMap(mapName, Serializer.STRING, Serializer.BOOLEAN).createOrOpen();

        map.put(key, value);
    }

    public void delete(String key) {
        HTreeMap map = database.hashMap(mapName, Serializer.STRING, Serializer.CLASS).createOrOpen();

        map.remove(key);
    }

    public void close() {
        database.close();
    }
}
