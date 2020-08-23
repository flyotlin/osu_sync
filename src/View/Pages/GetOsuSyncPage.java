package View.Pages;

import Controller.GetOsuSyncController;
import Controller.ImportController;
import View.ButtonListenerFactory;

import javax.swing.*;

public class GetOsuSyncPage extends AbstractPage {
    private final String osuStr = "取得Osu Sync";

    private JLabel osuSongSourceLabel;
    private JLabel osuSyncDestLabel;
    public static JLabel osuSongSource;
    public static JLabel osuSyncDest;

    public GetOsuSyncPage() {
        super();
    }

    private void initComponent() {
        osuSongSourceLabel = new JLabel("選擇OSU歌曲資料夾:");
        osuSyncDestLabel = new JLabel("選擇OSU SYNC檔案放置位置:");
        osuSongSource = new JLabel(AbstractPage.osuSongDirectory);
        osuSyncDest = new JLabel("(尚未選擇)");
    }

    @Override
    protected void initPage() {
        initComponent();

        pagePanel = new JPanel();
        pagePanel.setLayout(new BoxLayout(pagePanel, BoxLayout.Y_AXIS));
        JLabel osusyncCaption = new JLabel(osuStr);
        JButton[] mainButton = {
                new JButton("選擇"), new JButton("選擇"),
                new JButton("取得Osu Sync"), new JButton("回主畫面")
        };
        pagePanel.add(osusyncCaption);

        GetOsuSyncController osuSyncController = new GetOsuSyncController();
        ButtonListenerFactory[] listenerFactories = {
                new ButtonListenerFactory(osuSyncController, ButtonListenerFactory.FILE_CHOOSER, false, AbstractPage.CHOOSE_SONGSOURCE),
                new ButtonListenerFactory(osuSyncController, ButtonListenerFactory.FILE_CHOOSER, false, AbstractPage.CHOOSE_OSUSYNC),
                new ButtonListenerFactory(osuSyncController, ButtonListenerFactory.GET_OSUSYNC),
                new ButtonListenerFactory(osuSyncController, ButtonListenerFactory.TO_HOMEPAGE),
        };

        for (int i = 0; i < mainButton.length; i++) {
            if (i == 0) {
                pagePanel.add(osuSongSourceLabel);
                pagePanel.add(osuSongSource);
            }
            if (i == 1) {
                pagePanel.add(osuSyncDestLabel);
                pagePanel.add(osuSyncDest);
            }
            pagePanel.add(mainButton[i]);
            mainButton[i].addActionListener(listenerFactories[i]);
        }
    }

    @Override
    public void update(String path, int option) {
        if (option == AbstractPage.CHOOSE_SONGSOURCE) {
            osuSongSource.setText(path);
        } else if (option == AbstractPage.CHOOSE_OSUSYNC) {
            osuSyncDest.setText(path);
        }
    }
}
