package steps;

import pages.Menu;
import utils.DriverUtils;

public class MenuBL {

    private Menu menu;

    public MenuBL() {
        menu = new Menu();
    }

    public MenuBL clickOnDesktops() {
       menu.getDesktops().click();
        return this;
    }

    public MenuBL clickOnDesktopsPc() {
        menu.getDesktopsPC().click();
        return new MenuBL();
    }

    public MenuBL clickOnDesktopsMac() {
        menu.getDesktopsMac().click();
        return new MenuBL();
    }

    public MenuBL clickOnShowAllDesktops() {
        menu.getAllDesktops().click();
        return new MenuBL();
    }

    public MenuBL clickOnLaptopsAndNotebooks() {
        menu.getLaptopsAndNotebooks().click();
        return this;
    }

    public MenuBL clickOnLaptopsAndNotebooksMacs() {
        menu.getLaptopsAndNotebooksMacs().click();
        return new MenuBL();
    }

    public MenuBL clickOnLaptopsAndNotebooksWindows() {
        menu.getLaptopsAndNotebooksWindows().click();
        return new MenuBL();
    }

    public MenuBL clickOnShowAllLaptopsAndNotebooks() {
        menu.getAllLaptopsAndNotebooks().click();
        return new MenuBL();
    }

    public MenuBL clickOnComponents() {
        menu.getComponents().click();
        return this;
    }

    public MenuBL clickOnMonitors() {
        menu.getMonitors().click();
        return new MenuBL();
    }

    public MenuBL clickOnShowAllComponents() {
        menu.getAllComponents().click();
        return new MenuBL();
    }

    public MenuBL clickOnTablets() {
        menu.getTablets().click();
        return new MenuBL();
    }

    public MenuBL clickOnSoftware() {
        menu.getSoftware().click();
        return new MenuBL();
    }

    public MenuBL clickOnPhonesAndPDAs() {
        menu.getPhonesAndPDAs().click();
        return new MenuBL();
    }

    public MenuBL clickOnCameras() {
        menu.getCameras().click();
        return new MenuBL();
    }

    public MenuBL clickOnMp3Players() {
        menu.getMp3Players().click();
        return this;
    }

    public MenuBL clickOnShowAllMp3Players() {
        menu.getAllMp3Players().click();
        return new MenuBL();
    }
}
