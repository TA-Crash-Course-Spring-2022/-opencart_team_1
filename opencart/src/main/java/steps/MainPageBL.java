package steps;

import pages.MainPage;

public class MainPageBL {

    private MainPage mainPage;

    public MainPageBL() {
        mainPage = new MainPage();
    }

    public HeaderPageBL getHeaderPageBL() {
        return new HeaderPageBL();
    }
}
