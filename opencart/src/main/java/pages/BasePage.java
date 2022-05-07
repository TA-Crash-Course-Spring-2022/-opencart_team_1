package pages;


import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
//        driver = Driver.DRIVERS.get();
//        wait = new WebDriverWait(driver, 300);
        PageFactory.initElements(driver, this);
    }

//    public void setDriver(WebDriver driver) {
//        this.driver = driver;
//    }
}