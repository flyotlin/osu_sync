package Controller;

import Model.OsuSyncExportWizzard;

public class ExportController extends AbstractController {
    @Override
    public void getOsuSync() {
        throw new UnsupportedOperationException("The Operation is now unsupported");
    }

    @Override
    public void exportOsuSync() {
        OsuSyncExportWizzard wizzard = new OsuSyncExportWizzard();
        wizzard.startCopy();
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
