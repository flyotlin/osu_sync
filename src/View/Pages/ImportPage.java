package View.Pages;

import Controller.ImportController;
import View.ButtonListenerFactory;

import javax.swing.*;

public class ImportPage extends AbstractPage {
    private final String importStr = "匯入";

    private JLabel osuSongSourceLabel;
    private JLabel osuSongDestLabel;
    public static JLabel osuSongSource;
    public static JLabel osuSongDest;

    public ImportPage() {
        super();
    }

    private void initComponent() {
        osuSongSourceLabel = new JLabel("選擇OSU歌曲來源資料夾:");
        osuSongDestLabel = new JLabel("選擇OSU歌曲目的資料夾:");
        osuSongSource = new JLabel("");
        osuSongDest = new JLabel(AbstractPage.osuSongDirectory);
    }

    @Override
    protected void initPage() {
        initComponent();

        pagePanel = new JPanel();
        pagePanel.setLayout(new BoxLayout(pagePanel, BoxLayout.Y_AXIS));
        JLabel osusyncCaption = new JLabel(importStr);
        JButton[] mainButton = {
                new JButton("選擇"), new JButton("選擇"),
                new JButton("匯入"), new JButton("回主畫面")
        };
        pagePanel.add(osusyncCaption);

        ImportController importController = new ImportController();
        ButtonListenerFactory[] listenerFactories = {
                new ButtonListenerFactory(importController, ButtonListenerFactory.FILE_CHOOSER, false, AbstractPage.CHOOSE_SONGSOURCE),
                new ButtonListenerFactory(importController, ButtonListenerFactory.FILE_CHOOSER, false, AbstractPage.CHOOSE_SONGDEST),
                new ButtonListenerFactory(importController, ButtonListenerFactory.IMPORT_OSUSYNC),
                new ButtonListenerFactory(importController, ButtonListenerFactory.TO_HOMEPAGE),
        };

        for (int i = 0; i < mainButton.length; i++) {
            if (i == 0) {
                pagePanel.add(osuSongSourceLabel);
                pagePanel.add(osuSongSource);
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
        if (option == AbstractPage.CHOOSE_SONGSOURCE) {
            osuSongSource.setText(path);
        } else if (option == AbstractPage.CHOOSE_SONGDEST) {
            osuSongDest.setText(path);
        }
    }
}
