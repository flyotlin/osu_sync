package Controller;

import Model.OsuSyncCopier;
import View.Pages.ImportPage;

import java.io.File;

public class ImportController extends AbstractController {
    @Override
    public void getOsuSync() {
        throw new UnsupportedOperationException("The Operation is now unsupported");
    }

    @Override
    public void exportOsuSync() {
        throw new UnsupportedOperationException("The Operation is now unsupported");
    }

    @Override
    public void importOsuSync() {
        String songSource = ImportPage.osuSongSource.getText();
        String songDest = ImportPage.osuSongDest.getText();
        File source = new File(songSource);
        File dest = new File(songDest);

        OsuSyncCopier copier = new OsuSyncCopier(source, dest);
        copier.startCopy();
    }

    @Override
    public void moreOsuSync() {

    }
}
