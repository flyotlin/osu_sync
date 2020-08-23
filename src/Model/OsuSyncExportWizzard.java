package Model;

import View.Pages.ExportPage;

import java.io.File;
import java.util.ArrayList;

public class OsuSyncExportWizzard {
    private String osuSyncPath;
    private String songSource;
    private String songDest;
    private File osuSyncFile;
    private File sourceFile;
    private File destFile;
    private OsuSyncReader reader;
    private OsuSyncCopier copier;

    private ArrayList<String> osuSyncList;

    public OsuSyncExportWizzard() {
        initVariables();
        initReader();
    }

    private void initVariables() {
        osuSyncPath = ExportPage.osuSyncPath.getText();
        songSource = ExportPage.osuSongSource.getText();
        songDest = ExportPage.osuSongDest.getText();
        osuSyncFile = new File(osuSyncPath);
        sourceFile = new File(songSource);
        destFile = new File(songDest);
    }

    private void initReader() {
        reader = new OsuSyncReader(osuSyncFile);
        osuSyncList = reader.getOsuSync();
    }

    public void startCopy() {
        copier = new OsuSyncCopier(sourceFile, destFile);
        copier.setLimit(osuSyncList);
        copier.startCopy();
    }
}
