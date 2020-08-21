package View;

import View.Pages.ExportPage;
import View.Pages.HomePage;
import View.Pages.ImportPage;
import View.Pages.Page;

import javax.swing.*;

public class ViewFactory {
    public ViewFactory() {

    }

    public JPanel getHomePage() {
        Page homePage = new HomePage();
        return homePage.getPage();
    }

    public JPanel getCheckPage() {
        Page homePage = new HomePage();
        return homePage.getPage();
    }

    public JPanel getImportPage() {
        Page importPage = new ImportPage();
        return importPage.getPage();
    }

    public JPanel getExportPage() {
        Page exportPage = new ExportPage();
        return exportPage.getPage();
    }

    public JPanel getMorePage() {
        Page homePage = new HomePage();
        return homePage.getPage();
    }
}
