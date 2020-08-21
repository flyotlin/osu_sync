import javax.swing.*;

public class HomePageController implements ControllerInterface {

    @Override
    public void backToHomePage() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void fileChooser() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void start() {
        throw new UnsupportedOperationException();
    }

    public void initOsuSync() {
        System.out.println("OSU SYNC HAS BEEN INITIALIZED!");
    }

    public void updateOsuSync() {
        System.out.println("OSU SYNC HAS BEEN UPDATED!");
    }

    public void checkOsuSync() {
        ActivitySwitchModel.switchToCheck();
    }

    public void importOsu() {
        ActivitySwitchModel.switchToImport();
    }

    public void exportOsu() {
        ActivitySwitchModel.switchToExport();
    }

    public void moreAbout() {
        ActivitySwitchModel.switchToMore();
    }
}
