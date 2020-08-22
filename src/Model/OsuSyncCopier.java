package Model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class OsuSyncCopier {
    private File source;
    private File dest;

    public OsuSyncCopier(File source, File dest) {
        this.source = source;
        this.dest = dest;

        copyDirectory(source, dest);
    }

    private void copyDirectory(File source, File dest) {
        try {
            dest.mkdir();   // If the directory doesn't exist, create one
            for (String i : source.list()) {
                File newSource = new File(source.getPath() + "\\" + i);
                File newDest = new File(dest.getPath() + "\\" + i);
                if (newSource.isFile()) {
                    Files.copy(newSource.toPath(), newDest.toPath());
                } else if (newSource.isDirectory()) {
                    copyDirectory(newSource, newDest);
                }
            }
        } catch (IOException e) {
            System.out.println("複製整個資料夾內容操作出錯");
            e.printStackTrace();
        }
    }
}




