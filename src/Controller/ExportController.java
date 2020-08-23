package Controller;

import Model.OsuSyncExportWizzard;

public class ExportController extends AbstractController {
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
        System.out.println("START EXPORTING");

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
