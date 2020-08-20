import javax.swing.*;
import java.awt.*;
public class HomePageView {
    private final int WIDTH = 640;
    private final int HEIGHT = 400;
    private final String osusync = "Osu! Sync";
    private JFrame viewFrame;
    private HomePageController homePageController;

    public HomePageView(HomePageController homePageController) {
        this.homePageController = homePageController;
    }

    public void createView() {
        initView();
        createComponent();
        viewFrame.revalidate();
    }

    private void initView() {
        viewFrame = new JFrame(osusync);
        viewFrame.setSize(WIDTH, HEIGHT);
        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewFrame.setVisible(true);

        Container container = viewFrame.getContentPane();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
    }

    private void createComponent() {
        JLabel osusyncCaption = new JLabel(osusync);
        JButton[] mainButton = {
                new JButton("初始化"), new JButton("更新"),
                new JButton("查看"), new JButton("匯出"),
                new JButton("匯入"), new JButton("說明")
        };

        viewFrame.add(osusyncCaption);
        for(int i = 0; i < mainButton.length; i++) {
            viewFrame.add(mainButton[i]);
            mainButton[i].addActionListener(new ButtonListenerFactory(homePageController, i));
        }
    }

}
