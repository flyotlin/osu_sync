package View.Pages;

import javax.swing.*;

public abstract class AbstractPage implements ObserverPage {
    public static final int CHOOSE_OSUSYNC = 0;
    public static final int CHOOSE_SONGSOURCE = 1;
    public static final int CHOOSE_SONGDEST = 2;

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
    public void update(String path, int option) {
        throw new UnsupportedOperationException("The operation is now unsupported");
    }
}
