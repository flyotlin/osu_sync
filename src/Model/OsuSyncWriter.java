package Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OsuSyncWriter {
    private String name;
    private String username;
    private String filename;
    private String pathname;
    private String song_pathname;
    private File osuSync;

    public OsuSyncWriter() {
        initPath();
    }

    private void initPath() {
        name = "hplaptop";
        username = System.getProperty("user.name");
        filename = name + "." + username + ".osusync";
        pathname = "C:/Users/" + username + "/AppData/Local/osu!/";
        song_pathname = pathname + "Songs/";
        osuSync = new File(pathname + filename);
    }

    public void createOsuSync() {
        createOsuSyncFile();
        writeToOsuSync();
    }

    private void createOsuSyncFile() {
        try {
            File parent = new File(osuSync.getParent());
            if (parent.exists()) {
                osuSync.createNewFile();
            } else {
                throw new IOException("Parent does not exist!");
            }
        } catch (IOException e) {

        }
    }

    public void writeToOsuSync() {
        try {
            File directory = new File(song_pathname);
            FileWriter writer = new FileWriter(osuSync);
            for (String i : directory.list()) {
                File tmp = new File(song_pathname + i);
                if (tmp.isDirectory()) {
                    writer.write(i);
                    writer.write("\n");
                }
            }
            writer.close();
        } catch (IOException e) {

        }
    }
}
