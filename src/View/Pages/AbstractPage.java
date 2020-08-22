package View.Pages;

import javax.swing.*;

public abstract class AbstractPage implements ObserverPage {
    protected final String osusync = "Osu! Sync";
    JPanel pagePanel;

    public AbstractPage() {
        initPage();
    }

    protected abstract void initPage();

    public JPanel getPage() {
        return pagePanel;
    }

    @Override
    public void changeView() {
        throw new UnsupportedOperationException("The operation is now unsupported");
    }
}
