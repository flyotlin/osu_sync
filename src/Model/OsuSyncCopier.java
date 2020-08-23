package Model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class OsuSyncCopier {
    private File source;
    private File dest;
    private ArrayList<String> osuSyncList = null;

    public OsuSyncCopier(File source, File dest) {
        this.source = source;
        this.dest = dest;
    }

    public void startCopy() {
        copyDirectory(source, dest);
    }

    public void setLimit(ArrayList<String> osuSyncList) {
        this.osuSyncList = osuSyncList;
    }

    private void copyDirectory(File source, File dest) {
        try {
            dest.mkdir();   // If the directory doesn't exist, create one
            for (String i : source.list()) {
                File newSource = new File(source.getPath() + "\\" + i);
                File newDest = new File(dest.getPath() + "\\" + i);
                if (newSource.isFile()) {
                    Files.copy(newSource.toPath(), newDest.toPath());
                } else if (newSource.isDirectory() && notExist(newSource)) {
                    copyDirectory(newSource, newDest);
                }
            }
        } catch (IOException e) {
            System.out.println("複製整個資料夾內容操作出錯");
            e.printStackTrace();
        }
    }

    private boolean notExist(File f) {
        if (osuSyncList == null) {
            return true;
        }
        for (String i : osuSyncList) {
            if (f.getName().equals(i)) {
                return false;
            }
        }
        return true;
    }
}




