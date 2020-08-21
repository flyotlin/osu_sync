import View.OsuSyncView;
import View.ViewFactory;

public class TestDrive {
    //    Using MVC Pattern
    public static void main(String[] args) {
        ViewFactory viewFactory = new ViewFactory();

        OsuSyncView.createOsuSyncView();
        OsuSyncView.changePanel(viewFactory.getHomePage());

    }
}
