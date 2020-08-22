package Controller;

import Model.OsuSyncFileChooser;
import View.OsuSyncView;
import View.ViewFactory;


public abstract class AbstractController {
    ViewFactory viewFactory = new ViewFactory();


    public abstract void initOsuSync();

    public abstract void updateOsuSync();

    public abstract void checkOsuSync();

    public abstract void exportOsuSync();

    public abstract void importOsuSync();

    public abstract void moreOsuSync();

    public void fileChooser(boolean isFile) {
        OsuSyncFileChooser fileChooser = new OsuSyncFileChooser(isFile);
    }

    public void homePage() {
        OsuSyncView.changePanel(viewFactory.getHomePage());
    }
}
