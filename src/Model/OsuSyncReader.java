package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class OsuSyncReader {
    private File source;
    private ArrayList<String> osuSongs;

    public OsuSyncReader(File source) {
        this.source = source;
        osuSongs = new ArrayList<>();
        readFromOsuSync();
    }

    private void readFromOsuSync() {
        try {
            FileReader fr = new FileReader(source);
            BufferedReader br = new BufferedReader(fr);
            while(br.ready()) {
                String tmp = br.readLine();
                if(tmp.length() != 0) {
                    osuSongs.add(tmp);
                }
            }
            br.close();
        } catch (IOException e) {

        }
    }

    public ArrayList<String> getOsuSync() {
        return osuSongs;
    }
}
