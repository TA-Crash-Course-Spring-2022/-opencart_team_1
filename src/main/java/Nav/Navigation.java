
package Nav;

import org.openqa.selenium.WebDriver;
import Driver.Driver;

public class Navigation {

    private static WebDriver driver;

    public Navigation(){
        driver = Driver.DRIVERS.get();
    }

    public static void JumpToPageAndSetFullScreen(String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

}