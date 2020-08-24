package View.Pages;

import Controller.ImportController;
import View.ButtonListenerFactory;

import javax.swing.*;

public class MorePage extends AbstractPage {

    private final String moreStr = "說明(同步A電腦的歌曲至B電腦)";
    private final String descript1 = "1. 於B電腦用OsuSync功能匯出OsuSync檔案，此動作確保於A電腦時不會重複複製B電腦已經有的檔案。";
    private final String descript2 = "2. 於A電腦用匯出功能，指定上述OsuSync檔案，並指定歌曲來源資料夾以及欲輸出資料夾位置。";
    private final String descript3 = "3. 於B電腦用匯入功能，指定歌曲來源資料夾以及歌曲欲輸出資料夾位置。";


    public MorePage() {
        super();
    }

    @Override
    protected void initPage() {

        pagePanel = new JPanel();
        pagePanel.setLayout(new BoxLayout(pagePanel, BoxLayout.Y_AXIS));
        JLabel osusyncCaption = new JLabel(moreStr);
        JButton[] mainButton = {
            new JButton("回主畫面")
        };
        pagePanel.add(osusyncCaption);

        JLabel descriptLabel1 = new JLabel(descript1);
        JLabel descriptLabel2 = new JLabel(descript2);
        JLabel descriptLabel3 = new JLabel(descript3);
        pagePanel.add(descriptLabel1);
        pagePanel.add(descriptLabel2);
        pagePanel.add(descriptLabel3);

        ImportController importController = new ImportController();
        ButtonListenerFactory[] listenerFactories = {
            new ButtonListenerFactory(importController, ButtonListenerFactory.TO_HOMEPAGE),
        };

        for (int i = 0; i < mainButton.length; i++) {
            pagePanel.add(mainButton[i]);
            mainButton[i].addActionListener(listenerFactories[i]);
        }
    }
}
