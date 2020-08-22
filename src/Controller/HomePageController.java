package Controller;

import Model.OsuSyncWriter;
import View.OsuSyncView;

public class HomePageController extends AbstractController {
    private OsuSyncWriter writer = new OsuSyncWriter();

    @Override
    public void fileChooser() {
        throw new UnsupportedOperationException("The Operation is now unsupported");
    }

    public void initOsuSync() {
        writer.createOsuSync();
        System.out.println("INIT");
    }

    public void updateOsuSync() {
        writer.writeToOsuSync();
        System.out.println("UPDATE");
    }

    public void checkOsuSync() {
        throw new UnsupportedOperationException("The Operation is now unsupported");
    }

    @Override
    public void exportOsuSync() {
        OsuSyncView.changePanel(viewFactory.getExportPage());
    }

    @Override
    public void importOsuSync() {
        OsuSyncView.changePanel(viewFactory.getImportPage());
    }

    @Override
    public void moreOsuSync() {
        throw new UnsupportedOperationException("The Operation is now unsupported");
    }
}
