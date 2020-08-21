package View.Pages;

import javax.swing.*;

public abstract class Page {
    protected final String osusync = "Osu! Sync";
    JPanel pagePanel;

    public Page() {
        initPage();
    }

    protected abstract void initPage();

    public JPanel getPage() {
        return pagePanel;
    }
}
