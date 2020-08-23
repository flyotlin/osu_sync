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
    private int option;

    public OsuSyncFileChooser(boolean isFile, int option) {
        fileChooser = new JFileChooser();
        this.isFile = isFile;
        this.option = option;
    }

    public void initFileChooser() {
        fileChooser.setFileHidingEnabled(false);
        if (!isFile) {
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        }

        FileFilter filter = new FileNameExtensionFilter("OSUSYNC(.osusync)", "osusync");
        fileChooser.addChoosableFileFilter(filter);

        int returnVal = fileChooser.showOpenDialog(OsuSyncView.getViewFrame());
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            notifyObservers(file.getPath());
        }
    }

    @Override
    public void registerObserver(ObserverPage o) {
        observerPages.add(o);
    }

    @Override
    public void removeObservers() {
        observerPages.clear();
    }

    @Override
    public void notifyObservers(String path) {
        for (ObserverPage page : observerPages) {
            page.update(path, option);
        }
    }
}
