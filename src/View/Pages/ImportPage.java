package View.Pages;

import Controller.ImportController;
import View.ButtonListenerFactory;

import javax.swing.*;

public class ImportPage extends AbstractPage {
    private final String importStr = "匯入";

    public ImportPage() {
        super();
    }

    @Override
    protected void initPage() {
        pagePanel = new JPanel();
        pagePanel.setLayout(new BoxLayout(pagePanel, BoxLayout.Y_AXIS));
        JLabel osusyncCaption = new JLabel(importStr);
        JButton[] mainButton = {
                new JButton("選擇"), new JButton("選擇"), 
                new JButton("選擇"), new JButton("匯入"),
                new JButton("回主畫面")
        };
        pagePanel.add(osusyncCaption);


        ImportController importController = new ImportController();
        ButtonListenerFactory[] listenerFactories = {
                new ButtonListenerFactory(importController, 7),
                new ButtonListenerFactory(importController, 7),
                new ButtonListenerFactory(importController, 7),
                new ButtonListenerFactory(importController, 4),
                new ButtonListenerFactory(importController, 6),
        };
        JLabel osuSyncLabel = new JLabel("選擇OSU SYNC檔案:");
        JLabel osuSongSourceLabel = new JLabel("選擇OSU歌曲來源資料夾:");
        JLabel osuSongDestLabel = new JLabel("選擇OSU歌曲目的地資料夾:");

        for (int i = 0; i < mainButton.length; i++) {
            if (i == 0) {
                pagePanel.add(osuSyncLabel);
            }
            if (i == 1) {
                pagePanel.add(osuSongSourceLabel);
            }
            if (i == 2) {
                pagePanel.add(osuSongDestLabel);
            }
            pagePanel.add(mainButton[i]);
            mainButton[i].addActionListener(listenerFactories[i]);
        }
    }
}
