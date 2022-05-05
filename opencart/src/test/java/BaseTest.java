import driver.Driver;
import enums.Url;
import navigation.Navigation;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseTest {

    @BeforeSuite
    public void setup(){
        Driver.downloadWebDriver();
    }

    @BeforeClass
    public void createDriver(){
        Driver.instanceWebBrowser();
    }
    @AfterSuite
    public void closeBrowser(){
        Driver.closeBrowser();
    }
}