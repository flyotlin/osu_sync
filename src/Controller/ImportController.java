package Controller;

import Model.OsuSyncCopier;
import View.Pages.ImportPage;

import java.io.File;

public class ImportController extends AbstractController {
//    public ImportController() {
//        super();
//    }

    @Override
    public void initOsuSync() {
        throw new UnsupportedOperationException("The Operation is now unsupported");
    }

    @Override
    public void updateOsuSync() {
        throw new UnsupportedOperationException("The Operation is now unsupported");
    }

    @Override
    public void checkOsuSync() {
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
    }

    @Override
    public void moreOsuSync() {

    }
}
