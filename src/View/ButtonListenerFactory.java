import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerFactory implements ActionListener {
//    Using Factory Pattern
    private HomePageController homePageController;
    private int num;

    public ButtonListenerFactory(HomePageController homePageController, int num) {
        this.homePageController = homePageController;
        this.num = num;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (num) {
            case 0:
                homePageController.initOsuSync();
                break;
            case 1:
                homePageController.updateOsuSync();
                break;
            case 2:
                homePageController.checkOsuSync();
                break;
            case 3:
                homePageController.exportOsu();
                break;
            case 4:
                homePageController.importOsu();
                break;
            case 5:
                homePageController.moreAbout();
                break;
        }
    }
}
