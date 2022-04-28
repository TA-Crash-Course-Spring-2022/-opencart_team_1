package Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static final ThreadLocal<WebDriver> DRIVERS = new ThreadLocal<>();

    private static WebDriver driver;

    public static void setupWebDriver() {

        WebDriverManager.chromedriver().setup();
    }

    public static void instanceWebBrowser() {
        driver = new ChromeDriver();
        DRIVERS.set(driver);
    }

    public static void setPage(String url) {
        driver.get(url);
        DRIVERS.set(driver);
    }

    public static void closeWindow() {

        driver.close();
    }

    public static void quitOfBrowser() {
        driver.quit();
    }


}