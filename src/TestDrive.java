import View.OsuSyncView;
import View.ViewFactory;

public class TestDrive {
    //    Using MVC Pattern
    public static void main(String[] args) {
//        Model.ActivitySwitchModel.createModel();
//        Controller.HomePageController homePageController = new Controller.HomePageController();

//        HomePageView homePageView = new HomePageView(homePageController);
//        homePageView.createView();

//        Controller.ImportController importController = new Controller.ImportController();
//        ImportView importView = new ImportView(importController);
//        importView.createView();

        ViewFactory viewFactory = new ViewFactory();

        OsuSyncView.createOsuSyncView();
        OsuSyncView.changePanel(viewFactory.getHomePage());

    }
}
