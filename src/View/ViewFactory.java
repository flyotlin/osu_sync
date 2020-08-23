package View;

import View.Pages.*;

public class ViewFactory {
    public ViewFactory() {

    }

    public AbstractPage getHomePage() {
        return new HomePage();
    }

    public AbstractPage getOsuSyncPage() {
        return new GetOsuSyncPage();
    }

    public AbstractPage getImportPage() {
        return new ImportPage();
    }

    public AbstractPage getExportPage() {
        return new ExportPage();
    }

    public AbstractPage getMorePage() {
        return new HomePage();
    }
}
