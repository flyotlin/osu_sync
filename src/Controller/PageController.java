package Controller;

import View.OsuSyncView;
import View.ViewFactory;


public abstract class PageController {
    ViewFactory viewFactory = new ViewFactory();


    public abstract void initOsuSync();

    public abstract void updateOsuSync();

    public abstract void checkOsuSync();

    public abstract void exportOsuSync();

    public abstract void importOsuSync();

    public abstract void moreOsuSync();

    public void fileChooser() {

    }

    public void homePage() {
        OsuSyncView.changePanel(viewFactory.getHomePage());
    }
}
