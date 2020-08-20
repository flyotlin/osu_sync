import javax.swing.*;

public class HomePageView {
    private String osusync = "Osu! Sync";
    private JFrame viewFrame;

    public HomePageView() {

    }

    public void createView() {
        initView();

        JLabel osusyncCaption = new JLabel(osusync);
        JButton[] mainButton = {
                new JButton("初始化"), new JButton("更新"),
                new JButton("查看"), new JButton("匯出"),
                new JButton("匯入"), new JButton("說明")
        };
        viewFrame.add(osusyncCaption);
        viewFrame.revalidate();
    }

    public void initView() {
        viewFrame = new JFrame(osusync);
        viewFrame.setSize(1280, 800);
        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewFrame.setVisible(true);
    }
}
