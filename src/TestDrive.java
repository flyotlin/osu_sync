public class TestDrive {
//    Using MVC Pattern
    public static void main(String[] args) {
        ActivitySwitchModel.createModel();
        HomePageController homePageController = new HomePageController();

        HomePageView homePageView = new HomePageView(homePageController);
        homePageView.createView();
    }
}
