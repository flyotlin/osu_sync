package View;

import Controller.AbstractController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerFactory implements ActionListener {
//    Using Factory Pattern

    private AbstractController pageController;
    private int num;

    public ButtonListenerFactory(AbstractController pageController, int num) {
        this.pageController = pageController;
        this.num = num;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (num) {
            case 0:
                pageController.initOsuSync();
                break;
            case 1:
                pageController.updateOsuSync();
                break;
            case 2:
                pageController.checkOsuSync();
                break;
            case 3:
                pageController.exportOsuSync();
                break;
            case 4:
                pageController.importOsuSync();
                break;
            case 5:
                pageController.moreOsuSync();
                break;
            case 6:
                pageController.homePage();
                break;
            case 7:
                pageController.fileChooser();
                break;
        }
    }
}
