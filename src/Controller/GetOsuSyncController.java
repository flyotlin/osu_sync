package Controller;

import Model.OsuSyncWriter;
import View.Pages.GetOsuSyncPage;

public class GetOsuSyncController extends AbstractController {
    private OsuSyncWriter writer;

    @Override
    public void getOsuSync() {
        String songDirec = GetOsuSyncPage.osuSongSource.getText();
        String osuSyncDest = GetOsuSyncPage.osuSyncDest.getText();
        writer = new OsuSyncWriter(songDirec, osuSyncDest);
        writer.createOsuSync();
    }

    @Override
    public void exportOsuSync() {
        throw new UnsupportedOperationException("The Operation is now unsupported");
    }

    @Override
    public void importOsuSync() {
        throw new UnsupportedOperationException("The Operation is now unsupported");
    }

    @Override
    public void moreOsuSync() {
        throw new UnsupportedOperationException("The Operation is now unsupported");
    }
}
