package Controller;

import Model.OsuSyncWriter;
import View.OsuSyncView;

import javax.swing.*;

public class HomePageController extends AbstractController {
    private OsuSyncWriter writer = new OsuSyncWriter();

    @Override
    public void fileChooser(boolean isFile, int option) {
        throw new UnsupportedOperationException("The Operation is now unsupported");
    }

    @Override
    public void getOsuSync() {
        OsuSyncView.changePanel(viewFactory.getOsuSyncPage());
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
        OsuSyncView.changePanel(viewFactory.getMorePage());
    }
}
