package View;

import View.Pages.AbstractPage;
import View.Pages.ExportPage;
import View.Pages.HomePage;
import View.Pages.ImportPage;

import javax.swing.*;

public class ViewFactory {
    public ViewFactory() {

    }

    public JPanel getHomePage() {
        AbstractPage homePage = new HomePage();
        return homePage.getPage();
    }

    public JPanel getCheckPage() {
        AbstractPage homePage = new HomePage();
        return homePage.getPage();
    }

    public JPanel getImportPage() {
        AbstractPage importPage = new ImportPage();
        return importPage.getPage();
    }

    public JPanel getExportPage() {
        AbstractPage exportPage = new ExportPage();
        return exportPage.getPage();
    }

    public JPanel getMorePage() {
        AbstractPage homePage = new HomePage();
        return homePage.getPage();
    }
}
