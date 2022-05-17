package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class Menu extends BasePage {

    @FindBy(xpath = ".//*[text()= 'Desktops']")
    private WebElement desktops;

    @FindBy(xpath = ".//*[text()= 'PC (0)']")
    private WebElement desktopsPC;

    @FindBy(xpath = ".//*[text()= 'Mac (1)']")
    private WebElement desktopsMac;

    @FindBy(xpath = ".//*[text()= 'Show All Desktops']")
    private WebElement allDesktops;

    @FindBy(xpath = ".//*[text()= 'Laptops & Notebooks']")
    private WebElement laptopsAndNotebooks;

    @FindBy(xpath = ".//*[text()= 'Macs (0)']")
    private WebElement laptopsAndNotebooksMacs;

    @FindBy(xpath = ".//*[text()= 'Windows (0)']")
    private WebElement laptopsAndNotebooksWindows;

    @FindBy(xpath = ".//*[text()= 'Show All Laptops & Notebooks']")
    private WebElement allLaptopsAndNotebooks;

    @FindBy(xpath = ".//*[text()= 'Components']")
    private WebElement components;

    @FindBy(xpath = ".//*[text()= 'Mice and Trackballs (0)']")
    private WebElement miceAndTrackballs;

    @FindBy(xpath = ".//*[text()= 'Monitors (2)']")
    private WebElement monitors;

    @FindBy(xpath = ".//*[text()= 'Printers (0)']")
    private WebElement printers;

    @FindBy(xpath = ".//*[text()= 'Scanners (0)']")
    private WebElement scanners;

    @FindBy(xpath = ".//*[text()= 'Web Cameras (0)']")
    private WebElement webCameras;

    @FindBy(xpath = ".//*[text()= 'Show All Components']")
    private WebElement allComponents;

    @FindBy(xpath = ".//*[text()= 'Tablets']")
    private WebElement tablets;

    @FindBy(xpath = ".//*[text()= 'Software']")
    private WebElement software;

    @FindBy(xpath = ".//*[text()= 'Phones & PDAs']")
    private WebElement phonesAndPDAs;

    @FindBy(xpath = ".//*[text()= 'Cameras']")
    private WebElement cameras;

    @FindBy(xpath = ".//*[text()= 'MP3 Players']")
    private WebElement mp3Players;

    @FindBy(xpath = ".//*[text()= 'Show All MP3 Players']")
    private WebElement allMp3Players;
}
