package View.Pages;

import Controller.AbstractController;
import Controller.HomePageController;
import View.ButtonListenerFactory;

import javax.swing.*;

public class HomePage extends AbstractPage {

    public HomePage() {
        super();
    }

    @Override
    protected void initPage() {
        pagePanel = new JPanel();
        pagePanel.setLayout(new BoxLayout(pagePanel, BoxLayout.Y_AXIS));
        JLabel osusyncCaption = new JLabel(osusync);
        JButton[] mainButton = {
                new JButton("Osu Sync"), new JButton("匯出"),
                new JButton("匯入"), new JButton("說明")
        };
        pagePanel.add(osusyncCaption);


        AbstractController homePageController = new HomePageController();
        ButtonListenerFactory[] listenerFactories = {
                new ButtonListenerFactory(homePageController, ButtonListenerFactory.GET_OSUSYNC),
                new ButtonListenerFactory(homePageController, ButtonListenerFactory.EXPORT_OSUSYNC),
                new ButtonListenerFactory(homePageController, ButtonListenerFactory.IMPORT_OSUSYNC),
                new ButtonListenerFactory(homePageController, ButtonListenerFactory.MORE_OSUSYNC),
        };

        for (int i = 0; i < mainButton.length; i++) {
            pagePanel.add(mainButton[i]);
            mainButton[i].addActionListener(listenerFactories[i]);
        }

    }
}
