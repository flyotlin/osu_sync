package View;

import javax.swing.*;

public class OsuSyncView {
    //    Using Singleton Pattern
    private static OsuSyncView osuSyncView;
    private static JFrame viewFrame;
    private static JPanel currentPanel = new JPanel();
    private final String osusync = "Osu! Sync";
    private final int WIDTH = 640;
    private final int HEIGHT = 400;

    private OsuSyncView() {
        initFrame();
    }

    public static void createOsuSyncView() {
        if (osuSyncView == null) {
            osuSyncView = new OsuSyncView();
        }
    }

    public static void changePanel(JPanel panel) {
//        prevent repeat currentPanel be added
        viewFrame.remove(currentPanel);

        currentPanel = panel;
        viewFrame.add(currentPanel);
        viewFrame.revalidate();
    }

    private void initFrame() {
        viewFrame = new JFrame(osusync);
        viewFrame.setSize(WIDTH, HEIGHT);
        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewFrame.setVisible(true);
    }

}
