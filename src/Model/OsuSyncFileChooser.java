package Model;

import View.OsuSyncView;
import View.Pages.ObserverPage;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

public class OsuSyncFileChooser implements OsuSyncObservable {
    private JFileChooser fileChooser;
    private boolean isFile;

    public OsuSyncFileChooser(boolean isFile) {
        fileChooser = new JFileChooser();
        this.isFile = isFile;
        initFileChooser();
    }

    private void initFileChooser() {
        fileChooser.setFileHidingEnabled(false);
        if (!isFile) {
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        }

        FileFilter filter = new FileNameExtensionFilter("OSUSYNC(.osusync)", "osusync");
        fileChooser.addChoosableFileFilter(filter);

        int returnVal = fileChooser.showOpenDialog(OsuSyncView.getViewFrame());
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            System.out.println(file.getPath());
        }
    }

    @Override
    public void registerObserver(ObserverPage o) {
        observerPages.add(o);
    }

    @Override
    public void notifyObservers() {

    }
}
