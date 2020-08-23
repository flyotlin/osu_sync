package View;

import Controller.AbstractController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerFactory implements ActionListener {
//    Using Factory Pattern

    public static final int INIT_OSUSYNC = 0;
    public static final int UPDATE_OSUSYNC = 1;
    public static final int CHECK_OSUSYNC = 2;
    public static final int EXPORT_OSUSYNC = 3;
    public static final int IMPORT_OSUSYNC = 4;
    public static final int MORE_OSUSYNC = 5;
    public static final int TO_HOMEPAGE = 6;
    public static final int FILE_CHOOSER = 7;

    private AbstractController pageController;
    private int num;
    private boolean isFile = true;

    public ButtonListenerFactory(AbstractController pageController, int num) {
        this.pageController = pageController;
        this.num = num;
    }

    public ButtonListenerFactory(AbstractController pageController, int num, boolean isFile) {
        this.pageController = pageController;
        this.num = num;
        this.isFile = isFile;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (num) {
            case INIT_OSUSYNC:
                pageController.initOsuSync();
                break;
            case UPDATE_OSUSYNC:
                pageController.updateOsuSync();
                break;
            case CHECK_OSUSYNC:
                pageController.checkOsuSync();
                break;
            case EXPORT_OSUSYNC:
                pageController.exportOsuSync();
                break;
            case IMPORT_OSUSYNC:
                pageController.importOsuSync();
                break;
            case MORE_OSUSYNC:
                pageController.moreOsuSync();
                break;
            case TO_HOMEPAGE:
                pageController.homePage();
                break;
            case FILE_CHOOSER:
                pageController.fileChooser(isFile);
                break;
        }
    }
}
