import Driver.Driver;
import Helper.Urls;
import Nav.Navigation;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseTest {
    @Test
    public void checkPage(){
       Navigation.JumpToPageAndSetFullScreen(String.valueOf(Urls.BASIC_URL));
    }
    @BeforeSuite
    public void setup(){
        Driver.setupWebDriver();
    }

    @BeforeClass
    public void createDriver(){
        Driver.instanceWebBrowser();
    }

    @AfterSuite
    public void closeBrowser(){
        Driver.closeWindow();
        Driver.quitOfBrowser();
    }
}