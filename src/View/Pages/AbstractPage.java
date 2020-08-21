package View.Pages;

import javax.swing.*;

public abstract class AbstractPage {
    protected final String osusync = "Osu! Sync";
    JPanel pagePanel;

    public AbstractPage() {
        initPage();
    }

    protected abstract void initPage();

    public JPanel getPage() {
        return pagePanel;
    }
}
