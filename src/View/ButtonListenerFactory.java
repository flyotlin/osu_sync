package View;

import Controller.AbstractController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerFactory implements ActionListener {
    //    Using Factory Pattern
    public static final int GET_OSUSYNC = 0;
    public static final int EXPORT_OSUSYNC = 1;
    public static final int IMPORT_OSUSYNC = 2;
    public static final int MORE_OSUSYNC = 3;
    public static final int TO_HOMEPAGE = 4;
    public static final int FILE_CHOOSER = 5;


    private AbstractController pageController;
    private int num;
    private boolean isFile = true;
    private int option = -1;

    public ButtonListenerFactory(AbstractController pageController, int num) {
        this.pageController = pageController;
        this.num = num;
    }

    public ButtonListenerFactory(AbstractController pageController, int num, boolean isFile, int option) {
        this.pageController = pageController;
        this.num = num;
        this.isFile = isFile;
        this.option = option;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (num) {
            case GET_OSUSYNC:
                pageController.getOsuSync();
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
                pageController.fileChooser(isFile, option);
                break;
        }
    }
}
