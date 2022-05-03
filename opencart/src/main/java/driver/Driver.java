package driver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static enums.Url.BASIC_URL;

public class Driver {
    public static final ThreadLocal<WebDriver> DRIVERS = new ThreadLocal<>();

    private static WebDriver webDriver;

    public static void downloadWebDriver(){
        WebDriverManager.chromedriver().setup();
    }

    public static void instanceWebBrowser(){
        webDriver = new ChromeDriver();
        DRIVERS.set(webDriver);
    }

    public static void closeBrowser(){
        webDriver.close();
    }
    public static void waitForcibly(){
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}