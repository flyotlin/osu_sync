package View.Pages;

import Controller.ExportController;
import View.ButtonListenerFactory;

import javax.swing.*;

public class ExportPage extends AbstractPage {
    private final String exportStr = "匯出";

    public ExportPage() {
        super();
    }

    @Override
    protected void initPage() {
        pagePanel = new JPanel();
        pagePanel.setLayout(new BoxLayout(pagePanel, BoxLayout.Y_AXIS));
        JLabel osusyncCaption = new JLabel(exportStr);
        JButton[] mainButton = {
                new JButton("選擇"), new JButton("選擇"), new JButton("匯出"), new JButton("回主畫面")
        };
        pagePanel.add(osusyncCaption);


        ExportController exportController = new ExportController();
        ButtonListenerFactory[] listenerFactories = {
                new ButtonListenerFactory(exportController, 7),
                new ButtonListenerFactory(exportController, 7),
                new ButtonListenerFactory(exportController, 3),
                new ButtonListenerFactory(exportController, 6),
        };

        for (int i = 0; i < mainButton.length; i++) {
            pagePanel.add(mainButton[i]);
            mainButton[i].addActionListener(listenerFactories[i]);
        }
    }
}
