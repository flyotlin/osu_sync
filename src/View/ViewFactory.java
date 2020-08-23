package View;

import View.Pages.AbstractPage;
import View.Pages.ExportPage;
import View.Pages.HomePage;
import View.Pages.ImportPage;

public class ViewFactory {
    public ViewFactory() {

    }

    public AbstractPage getHomePage() {
        return new HomePage();
    }

    public AbstractPage getCheckPage() {
        return new HomePage();
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
