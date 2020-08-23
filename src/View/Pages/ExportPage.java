package View.Pages;

import Controller.ExportController;
import View.ButtonListenerFactory;

import javax.swing.*;

public class ExportPage extends AbstractPage {
    private final String exportStr = "匯出";

    private JLabel osuSyncLabel;
    private JLabel osuSongDestLabel;
    private JLabel osuSyncPath;
    private JLabel osuSongDest;

    public ExportPage() {
        super();
    }

    private void initComponent() {
        osuSyncLabel = new JLabel("選擇OSU SYNC檔案:");
        osuSongDestLabel = new JLabel("選擇OSU歌曲目的資料夾:");
        osuSyncPath = new JLabel("");
        osuSongDest = new JLabel("");
    }

    @Override
    protected void initPage() {
        initComponent();

        pagePanel = new JPanel();
        pagePanel.setLayout(new BoxLayout(pagePanel, BoxLayout.Y_AXIS));
        JLabel osusyncCaption = new JLabel(exportStr);
        JButton[] mainButton = {
                new JButton("選擇"), new JButton("選擇"), new JButton("匯出"), new JButton("回主畫面")
        };
        pagePanel.add(osusyncCaption);


        ExportController exportController = new ExportController();
        ButtonListenerFactory[] listenerFactories = {
                new ButtonListenerFactory(exportController, ButtonListenerFactory.FILE_CHOOSER, true, AbstractPage.CHOOSE_OSUSYNC),
                new ButtonListenerFactory(exportController, ButtonListenerFactory.FILE_CHOOSER, false, AbstractPage.CHOOSE_SONGDEST),
                new ButtonListenerFactory(exportController, ButtonListenerFactory.EXPORT_OSUSYNC),
                new ButtonListenerFactory(exportController, ButtonListenerFactory.TO_HOMEPAGE),
        };

        for (int i = 0; i < mainButton.length; i++) {
            if (i == 0) {
                pagePanel.add(osuSyncLabel);
                pagePanel.add(osuSyncPath);
            }
            if (i == 1) {
                pagePanel.add(osuSongDestLabel);
                pagePanel.add(osuSongDest);
            }
            pagePanel.add(mainButton[i]);
            mainButton[i].addActionListener(listenerFactories[i]);
        }
    }

    @Override
    public void update(String path, int option) {
        if (option == AbstractPage.CHOOSE_OSUSYNC) {
            osuSyncPath.setText(path);
        } else if (option == AbstractPage.CHOOSE_SONGDEST) {
            osuSongDest.setText(path);
        }
    }
}
