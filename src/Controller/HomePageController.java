package Controller;

import View.OsuSyncView;

public class HomePageController extends PageController {


    @Override
    public void fileChooser() {
        throw new UnsupportedOperationException("The Operation is now unsupported");
    }


    public void initOsuSync() {
        throw new UnsupportedOperationException("The Operation is now unsupported");
    }

    public void updateOsuSync() {
        throw new UnsupportedOperationException("The Operation is now unsupported");
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
